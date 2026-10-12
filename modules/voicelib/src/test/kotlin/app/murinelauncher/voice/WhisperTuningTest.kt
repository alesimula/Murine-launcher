// SPDX-License-Identifier: Apache-2.0
package app.murinelauncher.voice

import java.util.Locale
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNull
import org.junit.Test

class WhisperTuningTest {

    @Test
    fun audioContextFollowsTheAudioForTunedModels() {
        assertEquals("1 s of audio, raised to 3 s", 150, WhisperTuning.audioContext(16_000, dynamic = true))
        assertEquals("5 s of audio plus 1 s", 300, WhisperTuning.audioContext(80_000, dynamic = true))
        assertEquals(301, WhisperTuning.audioContext(80_001, dynamic = true))
        assertEquals("capped at 30 s", 1500, WhisperTuning.audioContext(16_000 * 40, dynamic = true))
    }

    @Test
    fun otherModelsKeepTheFullContext() {
        assertEquals(0, WhisperTuning.audioContext(16_000, dynamic = false))
    }

    @Test
    fun threadsUsePerformanceCoresOnly() {
        fun cores(count: Int, mhz: Long) = List(count) { mhz * 1000 }
        assertEquals("4 big + 4 little", 4, WhisperTuning.threadCount(8, cores(4, 2_400) + cores(4, 2_000)))
        assertEquals("2 big + 6 little", 2, WhisperTuning.threadCount(8, cores(2, 2_200) + cores(6, 1_800)))
        assertEquals("1 prime + 4 big + 3 little", 4,
            WhisperTuning.threadCount(8, cores(1, 3_200) + cores(4, 2_800) + cores(3, 2_000)))
        assertEquals("one cluster: half the cores", 4, WhisperTuning.threadCount(8, cores(8, 1_800)))
        assertEquals("one cluster: half the cores", 2, WhisperTuning.threadCount(4, cores(4, 1_800)))
        assertEquals("unreadable frequencies", 3, WhisperTuning.threadCount(6, List(6) { 0L }))
        assertEquals(1, WhisperTuning.threadCount(1, emptyList()))
        assertEquals(4, WhisperTuning.threadCount(16, emptyList()))
    }

    @Test
    fun englishModelsAlwaysUseEnglish() {
        assertEquals("en", WhisperTuning.resolveLanguage("it", multilingual = false, Locale.ITALIAN))
        assertEquals("en", WhisperTuning.resolveLanguage(WhisperTuning.LANGUAGE_AUTO, false, Locale.ITALIAN))
    }

    @Test
    fun multilingualModelsDefaultToTheDeviceLanguage() {
        assertEquals("it", WhisperTuning.resolveLanguage(WhisperTuning.LANGUAGE_DEVICE, true, Locale.ITALY))
        assertEquals("de", WhisperTuning.resolveLanguage("de", true, Locale.ITALY))
        assertEquals("auto", WhisperTuning.resolveLanguage(WhisperTuning.LANGUAGE_AUTO, true, Locale.ITALY))
        assertEquals("unsupported device language", "auto",
            WhisperTuning.resolveLanguage("", true, Locale.forLanguageTag("chr")))
        assertEquals("unknown stored language", "it", WhisperTuning.resolveLanguage("xx", true, Locale.ITALY))
    }

    @Test
    fun legacyAndRegionalCodesAreMapped() {
        assertEquals("he", WhisperTuning.whisperLanguage(Locale.forLanguageTag("iw")))
        assertEquals("id", WhisperTuning.whisperLanguage(Locale.forLanguageTag("in")))
        assertEquals("no", WhisperTuning.whisperLanguage(Locale.forLanguageTag("nb-NO")))
        assertEquals("tl", WhisperTuning.whisperLanguage(Locale.forLanguageTag("fil")))
        assertEquals("pt", WhisperTuning.whisperLanguage(Locale.forLanguageTag("pt-BR")))
        assertNull(WhisperTuning.whisperLanguage(Locale.forLanguageTag("chr")))
    }
}
