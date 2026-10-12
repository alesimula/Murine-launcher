// SPDX-License-Identifier: Apache-2.0
package app.murinelauncher.voice

import java.io.File
import java.io.IOException

internal object WhisperNative {
    const val HOST_LIBRARY_PATH_PROPERTY = "murine.whisper.library"

    private const val LIBRARY = "murine_whisper"
    private const val LIBRARY_DOTPROD = "murine_whisper_dotprod"

    @Volatile
    private var loaded = false

    @Throws(IOException::class)
    fun ensureLoaded() {
        if (loaded) return
        synchronized(this) {
            if (loaded) return
            load(System.getProperty(HOST_LIBRARY_PATH_PROPERTY), hasArmDotProd(), System::loadLibrary, System::load)
            loaded = true
        }
    }

    @Throws(IOException::class)
    fun load(hostLibraryPath: String?, dotProd: Boolean, loadLibrary: (String) -> Unit, loadPath: (String) -> Unit) {
        try {
            when {
                hostLibraryPath != null -> loadPath(hostLibraryPath)
                dotProd -> try {
                    loadLibrary(LIBRARY_DOTPROD)
                } catch (_: LinkageError) {
                    loadLibrary(LIBRARY)
                }
                else -> loadLibrary(LIBRARY)
            }
        } catch (e: LinkageError) {
            throw IOException("Speech recognition library unavailable", e)
        } catch (e: SecurityException) {
            throw IOException("Speech recognition library unavailable", e)
        }
    }

    private fun hasArmDotProd(): Boolean {
        if (System.getProperty("os.arch") != "aarch64") return false
        val features = try {
            File("/proc/cpuinfo").useLines { lines ->
                lines.firstOrNull { it.startsWith("Features") }?.substringAfter(':')?.trim()?.split(' ')
            }
        } catch (_: Exception) {
            null
        } ?: return false
        return "asimddp" in features && "asimdhp" in features && "fphp" in features
    }

    @JvmStatic
    external fun nativeOpen(path: String): Long

    @JvmStatic
    external fun nativeTranscribe(
        handle: Long, samples: FloatArray, count: Int, language: String?,
        audioCtx: Int, threads: Int, maxTokens: Int,
    ): ByteArray?

    @JvmStatic
    external fun nativeAbort(handle: Long)

    @JvmStatic
    external fun nativeClose(handle: Long)
}

object VoiceAbis {
    val SUPPORTED: Set<String> = setOf("arm64-v8a", "armeabi-v7a", "x86_64")

    fun isSupported(deviceAbis: Array<String>): Boolean = deviceAbis.any { it in SUPPORTED }
}
