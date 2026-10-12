// SPDX-License-Identifier: Apache-2.0
package app.murinelauncher.voice

import java.io.ByteArrayInputStream
import java.io.File
import java.io.IOException
import java.io.InputStream
import java.nio.file.Files
import java.security.MessageDigest
import org.junit.After
import org.junit.Assert.assertEquals
import org.junit.Assert.assertFalse
import org.junit.Assert.assertNotNull
import org.junit.Assert.assertNull
import org.junit.Assert.assertTrue
import org.junit.Test

class VoiceModelStoreTest {

    private val dir: File = Files.createTempDirectory("voicemodels").toFile()
    private val store = VoiceModelStore(dir)

    @After
    fun tearDown() {
        dir.deleteRecursively()
    }

    private fun leftovers() = dir.listFiles()!!.filter { it.name.startsWith(".") }

    private fun import(bytes: ByteArray, s: VoiceModelStore = store, expected: Long = bytes.size.toLong()) =
        s.import(ByteArrayInputStream(bytes), expected)

    @Test
    fun importsCustomModelUnderItsHash() {
        val bytes = TestModels.bytes()
        val result = import(bytes) as ImportResult.Installed
        val sha = sha256(bytes)
        assertEquals("custom-${sha.take(12)}", result.model.id)
        assertNull(result.model.catalog)
        assertFalse(result.model.dynamicAudioContext)
        assertFalse(result.replaced)
        assertTrue(result.model.file.readBytes().contentEquals(bytes))
        assertEquals(listOf(result.model.id), store.installed().map { it.id })
        assertTrue(leftovers().isEmpty())
    }

    @Test
    fun knownModelIsIdentifiedByHash() {
        val bytes = TestModels.bytes(nVocab = 51865)
        val entry = CatalogModel("futo-test-39", ModelSize.TINY, true, "https://example.invalid/m.bin",
            bytes.size.toLong(), sha256(bytes), 100)
        val catalogStore = VoiceModelStore(dir, catalog = listOf(entry))
        val result = import(bytes, catalogStore) as ImportResult.Installed
        assertEquals("futo-test-39", result.model.id)
        assertEquals(entry, result.model.catalog)
        assertTrue(result.model.dynamicAudioContext)
        assertTrue(result.model.multilingual)
        assertEquals(entry, catalogStore.installed().single().catalog)
    }

    @Test
    fun reimportReplacesAtomically() {
        val bytes = TestModels.bytes()
        import(bytes)
        val second = import(bytes) as ImportResult.Installed
        assertTrue(second.replaced)
        assertEquals(1, store.installed().size)
    }

    @Test
    fun foreignFileIsRejectedWithoutLeftovers() {
        val result = import("<html>Not found</html>".repeat(10).toByteArray())
        assertEquals(ImportResult.Failed(ImportError.NOT_A_MODEL), result)
        assertTrue(dir.listFiles()!!.isEmpty())
    }

    @Test
    fun tinyFileIsNotAModel() {
        assertEquals(ImportResult.Failed(ImportError.NOT_A_MODEL), import(ByteArray(8)))
    }

    @Test
    fun truncatedDownloadIsCorrupt() {
        val bytes = TestModels.bytes()
        val partial = bytes.copyOf(bytes.size - 100)
        assertEquals(ImportResult.Failed(ImportError.CORRUPT), import(partial, expected = UNKNOWN_SIZE))
        assertTrue(dir.listFiles()!!.isEmpty())
    }

    @Test
    fun sizeMismatchIsCorrupt() {
        val bytes = TestModels.bytes()
        assertEquals(ImportResult.Failed(ImportError.CORRUPT), import(bytes, expected = bytes.size + 1L))
        assertTrue(store.installed().isEmpty())
    }

    @Test
    fun oversizedModelIsRejected() {
        val bytes = TestModels.bytes()
        val small = VoiceModelStore(dir, maxBytes = 1000)
        assertEquals(ImportResult.Failed(ImportError.TOO_LARGE), import(bytes, small))
        assertEquals(ImportResult.Failed(ImportError.TOO_LARGE), import(bytes, small, expected = UNKNOWN_SIZE))
        assertTrue(leftovers().isEmpty())
    }

    @Test
    fun cancelledImportLeavesNothing() {
        var reads = 0
        val result = store.import(ByteArrayInputStream(TestModels.bytes()), -1,
            isCancelled = { reads++ > 0 })
        assertEquals(ImportResult.Failed(ImportError.CANCELLED), result)
        assertTrue(dir.listFiles()!!.isEmpty())
    }

    @Test
    fun readErrorIsReportedAndCleanedUp() {
        val bytes = TestModels.bytes()
        val failing = object : InputStream() {
            var position = 0
            override fun read(): Int = throw UnsupportedOperationException()
            override fun read(b: ByteArray, off: Int, len: Int): Int {
                if (position > 1000) throw IOException("Connection reset")
                val n = minOf(len, 600)
                System.arraycopy(bytes, position, b, off, n)
                position += n
                return n
            }
        }
        assertEquals(ImportResult.Failed(ImportError.IO), store.import(failing, bytes.size.toLong()))
        assertTrue(dir.listFiles()!!.isEmpty())
    }

    @Test
    fun progressIsReported() {
        val bytes = TestModels.bytes()
        var last = 0L
        store.import(ByteArrayInputStream(bytes), bytes.size.toLong(), onProgress = { last = it })
        assertEquals(bytes.size.toLong(), last)
    }

    @Test
    fun stalePartialFilesAreCleanedUp() {
        dir.mkdirs()
        File(dir, ".import-1234.part").writeBytes(ByteArray(100))
        assertTrue(store.installed().isEmpty())
        assertTrue(dir.listFiles()!!.isEmpty())
    }

    @Test
    fun brokenFilesAreNotListed() {
        dir.mkdirs()
        File(dir, "custom-broken.bin").writeBytes(ByteArray(100))
        assertTrue(store.installed().isEmpty())
    }

    @Test
    fun deleteRemovesModel() {
        val model = (import(TestModels.bytes()) as ImportResult.Installed).model
        assertNotNull(store.find(model.id))
        assertTrue(store.delete(model.id))
        assertNull(store.find(model.id))
        assertFalse(store.delete(model.id))
    }

    @Test
    fun deleteRejectsPathsOutsideTheStore() {
        val outside = File(dir.parentFile, "${dir.name}-outside.bin").apply { writeText("x") }
        try {
            assertFalse(store.delete("../${outside.nameWithoutExtension}"))
            assertFalse(store.delete(".import-x"))
            assertTrue(outside.exists())
        } finally {
            outside.delete()
        }
    }

    @Test
    fun catalogHashesAreWellFormed() {
        VoiceModelCatalog.models.forEach {
            assertTrue(it.id, it.sha256.matches(Regex("[0-9a-f]{64}")))
            assertTrue(it.id, it.bytes in 1..VoiceModelStore.MAX_MODEL_BYTES)
            assertTrue(it.id, it.downloadUrl.startsWith("https://"))
        }
        assertEquals(VoiceModelCatalog.models.size, VoiceModelCatalog.models.map { it.id }.toSet().size)
    }

    private companion object {
        const val UNKNOWN_SIZE = -1L
    }

    private fun sha256(bytes: ByteArray) =
        MessageDigest.getInstance("SHA-256").digest(bytes).joinToString("") { "%02x".format(it) }
}
