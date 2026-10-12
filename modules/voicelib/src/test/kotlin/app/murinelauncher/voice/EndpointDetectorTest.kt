// SPDX-License-Identifier: Apache-2.0
package app.murinelauncher.voice

import app.murinelauncher.voice.EndpointDetector.Result
import kotlin.math.PI
import kotlin.math.pow
import kotlin.math.sin
import kotlin.random.Random
import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Test

class EndpointDetectorTest {

    private val frame = EndpointDetector.FRAME_SAMPLES
    private val random = Random(42)

    private fun noise(ms: Int, dbfs: Double): List<ShortArray> = frames(ms) {
        val amplitude = 32768 * 10.0.pow(dbfs / 20) * 1.7
        (random.nextDouble(-1.0, 1.0) * amplitude)
    }

    private fun speech(ms: Int, dbfs: Double = -20.0): List<ShortArray> {
        var t = 0
        return frames(ms) {
            t++
            val slotOf200Ms = t / 3200
            val pauseBetweenSyllables = slotOf200Ms % 4 == 3
            val amplitude = 32768 * 10.0.pow(dbfs / 20) * 1.41 * (if (pauseBetweenSyllables) 0.05 else 1.0)
            amplitude * sin(2 * PI * 180 * t / 16000.0) + random.nextDouble(-30.0, 30.0)
        }
    }

    private fun frames(ms: Int, sample: () -> Double): List<ShortArray> = List(ms / EndpointDetector.FRAME_MS) {
        ShortArray(frame) { sample().coerceIn(-32768.0, 32767.0).toInt().toShort() }
    }

    private fun run(detector: EndpointDetector, input: List<ShortArray>): Pair<Result, Int> {
        input.forEachIndexed { i, f ->
            val r = detector.feed(f)
            if (r != Result.WAITING && r != Result.SPEECH) return r to (i + 1) * EndpointDetector.FRAME_MS
        }
        return Result.SPEECH to input.size * EndpointDetector.FRAME_MS
    }

    @Test
    fun endsAfterTrailingSilence() {
        val detector = EndpointDetector()
        val (result, at) = run(detector, noise(500, -65.0) + speech(1500) + noise(3000, -65.0))
        assertEquals(Result.END_OF_SPEECH, result)
        val leadIn = 500
        val speaking = 1500
        val trailingSilence = 900
        val expectedEnd = leadIn + speaking + trailingSilence
        assertTrue("ended at $at", at in expectedEnd - 50..expectedEnd + 200)
        assertTrue(detector.onsetFrame in 24..27)
    }

    @Test
    fun speechRightAtTheStartIsDetected() {
        val detector = EndpointDetector()
        val (result, _) = run(detector, speech(1200) + noise(2000, -65.0))
        assertEquals(Result.END_OF_SPEECH, result)
        assertTrue(detector.onsetFrame in 0..3)
    }

    @Test
    fun noisyRoomStillEnds() {
        val (result, at) = run(EndpointDetector(),
            noise(1000, -38.0) + speech(1500, -14.0) + noise(5000, -38.0))
        assertEquals(Result.END_OF_SPEECH, result)
        assertTrue("ended at $at", at < 5000)
    }

    @Test
    fun longSentenceIsNotCutShort() {
        val (result, at) = run(EndpointDetector(), speech(6000) + noise(2000, -65.0))
        assertEquals(Result.END_OF_SPEECH, result)
        assertTrue("ended at $at", at >= 6000)
    }

    @Test
    fun silenceTimesOut() {
        val (result, at) = run(EndpointDetector(), noise(10_000, -65.0))
        assertEquals(Result.NO_SPEECH, result)
        assertEquals(6000, at)
    }

    @Test
    fun endlessSpeechHitsTheCap() {
        val (result, at) = run(EndpointDetector(), speech(25_000))
        assertEquals(Result.MAX_LENGTH, result)
        assertEquals(20_000, at)
    }

    @Test
    fun digitalSilenceMeansDeadInput() {
        val (result, at) = run(EndpointDetector(), List(100) { ShortArray(frame) })
        assertEquals(Result.DEAD_INPUT, result)
        assertEquals(1000, at)
    }

    @Test
    fun microphoneWarmUpZerosAreTolerated() {
        val detector = EndpointDetector()
        val (result, _) = run(detector, List(10) { ShortArray(frame) } + speech(1000) + noise(2000, -65.0))
        assertEquals(Result.END_OF_SPEECH, result)
    }

    @Test
    fun levelFollowsLoudness() {
        val detector = EndpointDetector()
        detector.feed(noise(20, -70.0).single())
        val quiet = detector.level
        detector.feed(speech(20, -15.0).single())
        assertTrue(detector.level > quiet)
        assertTrue(detector.level in 0f..1f)
    }
}
