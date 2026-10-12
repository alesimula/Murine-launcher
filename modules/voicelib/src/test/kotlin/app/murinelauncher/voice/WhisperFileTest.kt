// SPDX-License-Identifier: Apache-2.0
package app.murinelauncher.voice

import java.io.File
import java.nio.file.Files
import org.junit.After
import org.junit.Assert.assertEquals
import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Assert.fail
import org.junit.Test

class WhisperFileTest {

    private val dir: File = Files.createTempDirectory("whisperfile").toFile()

    @After
    fun tearDown() {
        dir.deleteRecursively()
    }

    private fun write(bytes: ByteArray) = File(dir, "m.bin").apply { writeBytes(bytes) }

    @Test
    fun validModelPasses() {
        val header = WhisperFile.validate(write(TestModels.bytes()))
        assertEquals(ModelSize.TINY, header.size)
        assertFalse(header.isMultilingual)
        assertEquals(7, header.weightType)
    }

    @Test
    fun multilingualAndSizeAreRecognised() {
        val header = WhisperFile.validate(write(TestModels.bytes(nVocab = 51865, width = 512, layers = 6)))
        assertTrue(header.isMultilingual)
        assertEquals(ModelSize.BASE, header.size)
    }

    @Test
    fun badMagicIsRejected() = assertInvalid(TestModels.bytes(magic = 0x46554747))

    @Test
    fun foreignHyperparametersAreRejected() = assertInvalid(TestModels.bytes(audioCtx = 3000))

    @Test
    fun unknownWeightTypeIsRejected() = assertInvalid(TestModels.bytes(ftype = 2042))

    @Test
    fun truncatedModelIsRejected() {
        val bytes = TestModels.bytes()
        assertInvalid(bytes.copyOf(bytes.size - 1))
        assertInvalid(bytes.copyOf(bytes.size - 50))
        assertInvalid(bytes.copyOf(WhisperFile.HEADER_BYTES))
    }

    @Test
    fun trailingGarbageIsRejected() = assertInvalid(TestModels.bytes() + ByteArray(7))

    @Test
    fun modelWithoutWeightsIsRejected() = assertInvalid(TestModels.bytes(tensors = 0))

    @Test
    fun unknownTensorTypeIsRejected() = assertInvalid(TestModels.bytes(tensorType = 99))

    @Test
    fun headerOnlyRead() {
        val header = WhisperFile.readHeader(write(TestModels.bytes()))
        assertEquals(51864, header.nVocab)
    }

    @Test(expected = InvalidModelException::class)
    fun shortHeaderIsRejected() {
        WhisperFile.parseHeader(ByteArray(10))
    }

    private fun assertInvalid(bytes: ByteArray) {
        try {
            WhisperFile.validate(write(bytes))
            fail("Expected the model to be rejected")
        } catch (_: InvalidModelException) {
        }
    }
}
