// SPDX-License-Identifier: Apache-2.0
package app.murinelauncher.voice

import java.io.File
import java.io.FileOutputStream
import java.io.IOException
import java.io.InputStream
import java.nio.file.Files
import java.nio.file.StandardCopyOption
import java.security.MessageDigest
import java.util.Collections
import java.util.UUID

data class InstalledModel(val file: File, val header: WhisperHeader, val catalog: CatalogModel?) {
    val id: String get() = file.nameWithoutExtension
    val multilingual: Boolean get() = header.isMultilingual
    val bytes: Long get() = file.length()

    val isFutoAcftModel: Boolean get() = catalog != null
    val dynamicAudioContext: Boolean get() = isFutoAcftModel
}

enum class ImportError { TOO_LARGE, NO_SPACE, NOT_A_MODEL, CORRUPT, IO, CANCELLED }

sealed interface ImportResult {
    data class Installed(val model: InstalledModel, val replaced: Boolean) : ImportResult
    data class Failed(val error: ImportError) : ImportResult
}

class VoiceModelStore(
    val dir: File,
    private val maxBytes: Long = MAX_MODEL_BYTES,
    private val catalog: List<CatalogModel> = VoiceModelCatalog.models,
) {

    fun installed(): List<InstalledModel> {
        deleteAbandonedImports()
        val files = dir.listFiles { f -> f.isFile && f.name.endsWith(MODEL_SUFFIX) } ?: return emptyList()
        return files.mapNotNull { file ->
            val header = try {
                WhisperFile.readHeader(file)
            } catch (_: IOException) {
                return@mapNotNull null
            }
            InstalledModel(file, header, catalog.firstOrNull { it.id == file.nameWithoutExtension })
        }.sortedWith(compareBy<InstalledModel>(
            { m -> m.catalog?.let { catalog.indexOf(it) } ?: Int.MAX_VALUE },
            { it.id },
        ))
    }

    fun find(id: String): InstalledModel? = installed().firstOrNull { it.id == id }

    fun hasAnyModel(): Boolean = dir.list()?.any { it.endsWith(MODEL_SUFFIX) && !it.startsWith(".") } == true

    fun import(
        input: InputStream,
        expectedBytes: Long,
        onProgress: (Long) -> Unit = {},
        isCancelled: () -> Boolean = { false },
    ): ImportResult {
        if (expectedBytes > maxBytes) return ImportResult.Failed(ImportError.TOO_LARGE)
        if (!dir.isDirectory && !dir.mkdirs()) return ImportResult.Failed(ImportError.IO)
        val needed = maxOf(expectedBytes, 0L) + FREE_SPACE_MARGIN
        if (dir.usableSpace in 0 until needed) return ImportResult.Failed(ImportError.NO_SPACE)

        val temp = File(dir, "$PARTIAL_PREFIX${UUID.randomUUID()}$PARTIAL_SUFFIX")
        importsInProgress.add(temp.name)
        try {
            val digest = MessageDigest.getInstance("SHA-256")
            var copied = 0L
            FileOutputStream(temp).use { out ->
                val buffer = ByteArray(COPY_BUFFER)
                val head = ByteArray(WhisperFile.HEADER_BYTES)
                var headLength = 0
                while (true) {
                    if (isCancelled()) return ImportResult.Failed(ImportError.CANCELLED)
                    val n = input.read(buffer)
                    if (n < 0) break
                    if (n == 0) continue
                    if (headLength < head.size) {
                        val take = minOf(n, head.size - headLength)
                        System.arraycopy(buffer, 0, head, headLength, take)
                        headLength += take
                        if (headLength == head.size && !looksLikeModel(head)) {
                            return ImportResult.Failed(ImportError.NOT_A_MODEL)
                        }
                    }
                    copied += n
                    if (copied > maxBytes) return ImportResult.Failed(ImportError.TOO_LARGE)
                    digest.update(buffer, 0, n)
                    out.write(buffer, 0, n)
                    onProgress(copied)
                }
                if (headLength < head.size) return ImportResult.Failed(ImportError.NOT_A_MODEL)
                out.flush()
                out.fd.sync()
            }
            if (expectedBytes > 0 && copied != expectedBytes) return ImportResult.Failed(ImportError.CORRUPT)

            val header = try {
                WhisperFile.validate(temp)
            } catch (_: InvalidModelException) {
                return ImportResult.Failed(ImportError.CORRUPT)
            }
            val sha256 = digest.digest().toHex()
            val known = catalog.firstOrNull { it.sha256.equals(sha256, ignoreCase = true) }
            val target = File(dir, known?.fileName ?: "$CUSTOM_PREFIX${sha256.take(12)}$MODEL_SUFFIX")
            val replaced = target.exists()
            Files.move(temp.toPath(), target.toPath(),
                StandardCopyOption.ATOMIC_MOVE, StandardCopyOption.REPLACE_EXISTING)
            return ImportResult.Installed(InstalledModel(target, header, known), replaced)
        } catch (_: IOException) {
            return ImportResult.Failed(ImportError.IO)
        } finally {
            temp.delete()
            importsInProgress.remove(temp.name)
        }
    }

    private fun looksLikeModel(header: ByteArray) = try {
        WhisperFile.parseHeader(header)
        true
    } catch (_: InvalidModelException) {
        false
    }

    fun delete(id: String): Boolean {
        if (id.contains(File.separatorChar) || id.startsWith(".")) return false
        val file = File(dir, "$id$MODEL_SUFFIX")
        return file.isFile && file.delete()
    }

    fun deleteAbandonedImports() {
        dir.listFiles { f ->
            f.name.startsWith(PARTIAL_PREFIX) && f.name.endsWith(PARTIAL_SUFFIX) && f.name !in importsInProgress
        }?.forEach { it.delete() }
    }

    companion object {
        const val MAX_MODEL_BYTES = 512L * 1024 * 1024
        const val MODEL_SUFFIX = ".bin"
        const val CUSTOM_PREFIX = "custom-"
        private const val PARTIAL_PREFIX = ".import-"
        private const val PARTIAL_SUFFIX = ".part"
        private const val FREE_SPACE_MARGIN = 32L * 1024 * 1024
        private const val COPY_BUFFER = 256 * 1024

        private val importsInProgress: MutableSet<String> = Collections.synchronizedSet(HashSet())

        private fun ByteArray.toHex(): String = joinToString("") { "%02x".format(it) }
    }
}
