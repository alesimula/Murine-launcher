// SPDX-License-Identifier: Apache-2.0
package app.murinelauncher.voice

import kotlin.math.log10
import kotlin.math.max
import kotlin.math.sqrt

class EndpointDetector(private val config: Config = Config()) {

    data class Config(
        val onsetFramesInARow: Int = 3,
        val trailingSilenceMs: Int = 900,
        val minSpeechMs: Int = 200,
        val noSpeechTimeoutMs: Int = 6_000,
        val maxUtteranceMs: Int = 20_000,
        val speechMarginDb: Double = 12.0,
        val quietestSpeechDbfs: Double = -55.0,
        val assumedBackgroundDbfs: Double = -50.0,
        val backgroundWindowMs: Int = 2_000,
        val deadInputAfterMs: Int = 1_000,
    )

    enum class Result { WAITING, SPEECH, END_OF_SPEECH, NO_SPEECH, MAX_LENGTH, DEAD_INPUT }

    private class Frame(val power: Double, val isDigitalSilence: Boolean) {
        val dbfs = toDbfs(power)
    }

    private val backgroundWindowFrames = (config.backgroundWindowMs / FRAME_MS).coerceAtLeast(1)
    private val backgroundWindow = DoubleArray(backgroundWindowFrames)
    private var backgroundFrames = 0
    private val recentPower = DoubleArray(SMOOTHING_FRAMES)

    private var frames = 0
    private var loudRun = 0
    private var quietRun = 0
    private var speechFrames = 0
    private var digitalSilenceRun = 0

    var onsetFrame = -1
        private set

    var lastSpeechFrame = -1
        private set

    var level = 0f
        private set

    val speechStarted: Boolean get() = onsetFrame >= 0

    fun feed(samples: ShortArray, offset: Int = 0, length: Int = FRAME_SAMPLES): Result {
        val frame = measure(samples, offset, length)
        val index = frames++
        level = indicatorLevel(frame.dbfs)

        digitalSilenceRun = if (frame.isDigitalSilence) digitalSilenceRun + 1 else 0
        if (!speechStarted && digitalSilenceRun * FRAME_MS >= config.deadInputAfterMs) return Result.DEAD_INPUT

        trackBackground(index, frame)
        if (frame.dbfs > speechThresholdDbfs()) onLoudFrame(index) else onQuietFrame()
        return verdict()
    }

    private fun measure(samples: ShortArray, offset: Int, length: Int): Frame {
        var sum = 0.0
        var allZero = true
        for (i in offset until offset + length) {
            val s = samples[i].toInt()
            if (s != 0) allZero = false
            sum += (s * s).toDouble()
        }
        return Frame(sum / max(length, 1), allZero)
    }

    private fun trackBackground(index: Int, frame: Frame) {
        recentPower[index % SMOOTHING_FRAMES] = frame.power
        if (frame.isDigitalSilence) return
        backgroundWindow[backgroundFrames++ % backgroundWindowFrames] = toDbfs(recentPower.average())
    }

    private fun backgroundDbfs(): Double {
        if (backgroundFrames == 0) return config.assumedBackgroundDbfs
        var quietest = Double.MAX_VALUE
        for (i in 0 until minOf(backgroundFrames, backgroundWindowFrames)) {
            quietest = minOf(quietest, backgroundWindow[i])
        }
        val windowFilled = backgroundFrames >= backgroundWindowFrames
        return if (windowFilled) quietest else minOf(quietest, config.assumedBackgroundDbfs)
    }

    private fun speechThresholdDbfs() =
        max(backgroundDbfs() + config.speechMarginDb, config.quietestSpeechDbfs)

    private fun onLoudFrame(index: Int) {
        loudRun++
        quietRun = 0
        speechFrames++
        lastSpeechFrame = index
        if (!speechStarted && loudRun >= config.onsetFramesInARow) onsetFrame = index - loudRun + 1
    }

    private fun onQuietFrame() {
        loudRun = 0
        quietRun++
    }

    private fun verdict(): Result {
        val elapsedMs = frames * FRAME_MS
        val spokeLongEnough = speechFrames * FRAME_MS >= config.minSpeechMs
        val silentLongEnough = quietRun * FRAME_MS >= config.trailingSilenceMs
        return when {
            elapsedMs >= config.maxUtteranceMs -> if (speechStarted) Result.MAX_LENGTH else Result.NO_SPEECH
            !speechStarted -> if (elapsedMs >= config.noSpeechTimeoutMs) Result.NO_SPEECH else Result.WAITING
            spokeLongEnough && silentLongEnough -> Result.END_OF_SPEECH
            else -> Result.SPEECH
        }
    }

    companion object {
        const val FRAME_MS = 20
        const val FRAME_SAMPLES = WhisperTuning.SAMPLE_RATE * FRAME_MS / 1000
        private const val SMOOTHING_FRAMES = 3
        private const val FULL_SCALE = 32768.0
        private const val DIGITAL_SILENCE_DBFS = -96.0
        private const val INDICATOR_FLOOR_DBFS = -60.0
        private const val INDICATOR_RANGE_DB = 50.0

        private fun toDbfs(power: Double): Double {
            val rms = sqrt(power)
            return if (rms < 1.0) DIGITAL_SILENCE_DBFS else 20 * log10(rms / FULL_SCALE)
        }

        private fun indicatorLevel(dbfs: Double) =
            ((dbfs - INDICATOR_FLOOR_DBFS) / INDICATOR_RANGE_DB).coerceIn(0.0, 1.0).toFloat()
    }
}
