// SPDX-License-Identifier: Apache-2.0
package app.murinelauncher.voice

import java.io.IOException
import org.junit.Assert.assertEquals
import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test

class WhisperNativeLoadTest {

    private val loaded = ArrayList<String>()
    private fun missing(name: String): Unit = throw UnsatisfiedLinkError("no $name")

    @Test
    fun dotProdCpuPrefersTheFastLibrary() {
        WhisperNative.load(null, dotProd = true, { loaded += it }, ::missing)
        assertEquals(listOf("murine_whisper_dotprod"), loaded)
    }

    @Test
    fun dotProdFallsBackToTheBaseline() {
        WhisperNative.load(null, dotProd = true,
            { if (it.endsWith("dotprod")) missing(it) else loaded += it }, ::missing)
        assertEquals(listOf("murine_whisper"), loaded)
    }

    @Test
    fun missingLibraryIsAnIOExceptionNotAnError() {
        val e = runCatching { WhisperNative.load(null, dotProd = false, ::missing, ::missing) }.exceptionOrNull()
        assertTrue("$e", e is IOException)
        val e2 = runCatching { WhisperNative.load(null, dotProd = true, ::missing, ::missing) }.exceptionOrNull()
        assertTrue("$e2", e2 is IOException)
        val e3 = runCatching { WhisperNative.load("/nonexistent/lib.so", false, ::missing, ::missing) }.exceptionOrNull()
        assertTrue("$e3", e3 is IOException)
    }

    @Test
    fun abiSupport() {
        assertTrue(VoiceAbis.isSupported(arrayOf("arm64-v8a", "armeabi-v7a", "armeabi")))
        assertTrue(VoiceAbis.isSupported(arrayOf("armeabi-v7a", "armeabi")))
        assertTrue(VoiceAbis.isSupported(arrayOf("x86_64", "x86")))
        assertFalse(VoiceAbis.isSupported(arrayOf("x86")))
        assertFalse(VoiceAbis.isSupported(arrayOf("riscv64")))
    }
}
