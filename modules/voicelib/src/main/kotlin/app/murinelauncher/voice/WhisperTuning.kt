// SPDX-License-Identifier: Apache-2.0
package app.murinelauncher.voice

import java.io.File
import java.util.Locale

object WhisperTuning {
    const val SAMPLE_RATE = 16_000

    private const val SAMPLES_PER_ENCODER_POSITION = 320
    private const val POSITIONS_PER_SECOND = SAMPLE_RATE / SAMPLES_PER_ENCODER_POSITION
    const val FULL_AUDIO_CONTEXT = 30 * POSITIONS_PER_SECOND
    private const val MIN_AUDIO_CONTEXT = 3 * POSITIONS_PER_SECOND
    private const val TRAILING_AUDIO_CONTEXT = 1 * POSITIONS_PER_SECOND
    private const val MODEL_DEFAULT_AUDIO_CONTEXT = 0

    const val MAX_QUERY_TOKENS = 96

    private const val MIN_THREADS = 2
    private const val MAX_THREADS = 4

    fun audioContext(samples: Int, dynamic: Boolean): Int {
        if (!dynamic) return MODEL_DEFAULT_AUDIO_CONTEXT
        val positions = (samples + SAMPLES_PER_ENCODER_POSITION - 1) / SAMPLES_PER_ENCODER_POSITION
        return (positions + TRAILING_AUDIO_CONTEXT).coerceIn(MIN_AUDIO_CONTEXT, FULL_AUDIO_CONTEXT)
    }

    fun threadCount(
        cpuCount: Int = Runtime.getRuntime().availableProcessors(),
        maxFrequencies: List<Long> = readMaxFrequencies(cpuCount),
    ): Int {
        val cpus = cpuCount.coerceAtLeast(1)
        val threads = performanceCoreCount(maxFrequencies.filter { it > 0 }, cpus) ?: (cpus / 2)
        return threads.coerceIn(minOf(MIN_THREADS, cpus), minOf(MAX_THREADS, cpus))
    }

    private fun performanceCoreCount(knownFrequencies: List<Long>, cpus: Int): Int? {
        if (knownFrequencies.size != cpus) return null
        val slowestCluster = knownFrequencies.min()
        return knownFrequencies.count { it > slowestCluster }.takeIf { it > 0 }
    }

    private fun readMaxFrequencies(cpuCount: Int): List<Long> = (0 until cpuCount).map { cpu ->
        try {
            File("/sys/devices/system/cpu/cpu$cpu/cpufreq/cpuinfo_max_freq").readText().trim().toLong()
        } catch (_: Exception) {
            0L
        }
    }

    val LANGUAGES: List<String> = listOf(
        "en", "zh", "de", "es", "ru", "ko", "fr", "ja", "pt", "tr", "pl", "ca", "nl", "ar", "sv",
        "it", "id", "hi", "fi", "vi", "he", "uk", "el", "ms", "cs", "ro", "da", "hu", "ta", "no",
        "th", "ur", "hr", "bg", "lt", "la", "mi", "ml", "cy", "sk", "te", "fa", "lv", "bn", "sr",
        "az", "sl", "kn", "et", "mk", "br", "eu", "is", "hy", "ne", "mn", "bs", "kk", "sq", "sw",
        "gl", "mr", "pa", "si", "km", "sn", "yo", "so", "af", "oc", "ka", "be", "tg", "sd", "gu",
        "am", "yi", "lo", "uz", "fo", "ht", "ps", "tk", "nn", "mt", "sa", "lb", "my", "bo", "tl",
        "mg", "as", "tt", "haw", "ln", "ha", "ba", "jw", "su",
    )

    const val LANGUAGE_DEVICE = ""
    const val LANGUAGE_AUTO = "auto"

    fun whisperLanguage(locale: Locale): String? {
        val code = when (val lang = locale.language.lowercase(Locale.ROOT)) {
            "iw" -> "he"
            "in" -> "id"
            "ji" -> "yi"
            "jv" -> "jw"
            "nb" -> "no"
            "fil" -> "tl"
            "yue" -> "zh"
            else -> lang
        }
        return code.takeIf { it in LANGUAGES }
    }

    fun resolveLanguage(preference: String, multilingual: Boolean, locale: Locale = Locale.getDefault()): String =
        when {
            !multilingual -> "en"
            preference == LANGUAGE_AUTO -> LANGUAGE_AUTO
            preference != LANGUAGE_DEVICE && preference in LANGUAGES -> preference
            else -> whisperLanguage(locale) ?: LANGUAGE_AUTO
        }
}
