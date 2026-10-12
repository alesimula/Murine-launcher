// SPDX-License-Identifier: Apache-2.0
package app.murinelauncher.voice

import org.junit.Assert.assertEquals
import org.junit.Test

class TranscriptCleanerTest {

    @Test
    fun trimsSentencePunctuationAndSpaces() {
        assertEquals("Calculator", TranscriptCleaner.clean(" Calculator."))
        assertEquals("Open the camera", TranscriptCleaner.clean("  Open the camera!  "))
        assertEquals("Dónde está", TranscriptCleaner.clean("¿Dónde está?"))
        assertEquals("Google Maps", TranscriptCleaner.clean("\"Google   Maps…\""))
    }

    @Test
    fun keepsInnerPunctuation() {
        assertEquals("Wi-Fi settings", TranscriptCleaner.clean("Wi-Fi settings."))
        assertEquals("K-9 Mail", TranscriptCleaner.clean("K-9 Mail"))
    }

    @Test
    fun dropsNonSpeechAnnotations() {
        assertEquals("", TranscriptCleaner.clean(" [BLANK_AUDIO]"))
        assertEquals("", TranscriptCleaner.clean("(music) ♪♪"))
        assertEquals("Spotify", TranscriptCleaner.clean("*cough* Spotify [Music]"))
    }
}
