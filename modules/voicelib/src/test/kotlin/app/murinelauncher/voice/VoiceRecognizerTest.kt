// SPDX-License-Identifier: Apache-2.0
package app.murinelauncher.voice

import app.murinelauncher.voice.FakeAudioSource.Companion.silence
import app.murinelauncher.voice.FakeAudioSource.Companion.speech
import app.murinelauncher.voice.FakeAudioSource.Companion.zeros
import app.murinelauncher.voice.VoiceRecognizer.Failure
import java.io.IOException
import java.util.concurrent.TimeUnit
import kotlinx.coroutines.asCoroutineDispatcher
import org.junit.After
import org.junit.Assert.assertEquals
import org.junit.Assert.assertFalse
import org.junit.Assert.assertNull
import org.junit.Assert.assertTrue
import org.junit.Test

class VoiceRecognizerTest {

    private var harness: RecognizerHarness? = null

    private fun harness(h: RecognizerHarness) = h.also { harness = it }

    @After
    fun tearDown() {
        harness?.shutdown()
    }

    @Test
    fun transcribesSpeechAndReleasesEverything() {
        val h = harness(RecognizerHarness())
        h.recognizer.start()
        h.listener.await()
        assertEquals(listOf("LISTENING", "PROCESSING", "result:Calculator"), h.listener.events)
        h.awaitCleanup()
        val engine = h.engine!!
        assertEquals(1, engine.transcribeCalls.get())
        assertTrue("trimmed to the speech, padded to whisper.cpp's minimum", engine.lastCount in 17_600..32_000)
        assertEquals(1, engine.closeCalls.get())
        assertTrue(h.source!!.closed.get())
        assertFalse(h.recognizer.isActive)
    }

    @Test
    fun permissionDeniedTouchesNothing() {
        val h = harness(RecognizerHarness(permission = false))
        h.recognizer.start()
        h.listener.await()
        assertEquals(listOf("failure:PERMISSION_DENIED"), h.listener.events)
        assertEquals(0, h.sourcesCreated.get())
        assertEquals(0, h.opens.get())
        assertTrue(h.executors.isEmpty())
    }

    @Test
    fun missingModelTouchesNothing() {
        val h = harness(RecognizerHarness(engine = null))
        h.recognizer.start()
        h.listener.await()
        assertEquals(listOf("failure:MODEL_MISSING"), h.listener.events)
        assertEquals(0, h.sourcesCreated.get())
    }

    @Test
    fun silenceIsNoSpeech() {
        val h = harness(RecognizerHarness(source = FakeAudioSource(silence(8000))))
        h.recognizer.start()
        h.listener.await()
        assertEquals(Failure.NO_SPEECH, h.listener.failure)
        h.awaitCleanup()
        assertEquals(0, h.engine!!.transcribeCalls.get())
        assertEquals("model loaded while listening is freed", 1, h.engine.closeCalls.get())
    }

    @Test
    fun blankTranscriptIsNoSpeech() {
        val h = harness(RecognizerHarness(engine = FakeEngine(text = " [BLANK_AUDIO]")))
        h.recognizer.start()
        h.listener.await()
        assertEquals(Failure.NO_SPEECH, h.listener.failure)
        h.awaitCleanup()
    }

    @Test
    fun busyMicrophoneIsReported() {
        val h = harness(RecognizerHarness(source = FakeAudioSource(speech(1000), startResult = false)))
        h.recognizer.start()
        h.listener.await()
        assertEquals(Failure.MIC_UNAVAILABLE, h.listener.failure)
        h.awaitCleanup()
        assertTrue(h.source!!.closed.get())
    }

    @Test
    fun missingMicrophoneIsReported() {
        val h = harness(RecognizerHarness(source = null))
        h.recognizer.start()
        h.listener.await()
        assertEquals(Failure.MIC_UNAVAILABLE, h.listener.failure)
        h.awaitCleanup()
    }

    @Test
    fun silencedMicrophoneIsReported() {
        val h = harness(RecognizerHarness(source = FakeAudioSource(zeros(3000))))
        h.recognizer.start()
        h.listener.await()
        assertEquals(Failure.MIC_UNAVAILABLE, h.listener.failure)
        h.awaitCleanup()
    }

    @Test
    fun interruptionIsReported() {
        val h = harness(RecognizerHarness(source = FakeAudioSource(speech(5000), interruptAfterFrames = 30)))
        h.recognizer.start()
        h.listener.await()
        assertEquals(Failure.MIC_UNAVAILABLE, h.listener.failure)
        h.awaitCleanup()
    }

    @Test
    fun modelLoadFailureStopsListeningEarly() {
        val micThatNeverGoesQuiet = FakeAudioSource(speech(1000))
        val h = harness(RecognizerHarness(source = micThatNeverGoesQuiet,
            engine = null, openFailure = IOException("bad model")))
        h.recognizer.start()
        h.listener.await()
        assertEquals(Failure.MODEL_FAILED, h.listener.failure)
        h.awaitCleanup()
        assertTrue("microphone never opened, or closed again",
            h.sourcesCreated.get() == 0 || h.source!!.closed.get())
    }

    @Test
    fun brokenNativeLibraryDoesNotCrash() {
        val listener = RecordingListener()
        val main = java.util.concurrent.Executors.newSingleThreadExecutor()
        val uncaught = java.util.concurrent.atomic.AtomicReference<Throwable?>()
        val recognizer = VoiceRecognizer(
            engineFactory = { throw UnsatisfiedLinkError("libmurine_whisper.so not found") },
            audioSourceFactory = { FakeAudioSource(speech(1000) + silence(1500)) },
            hasPermission = { true },
            listener = listener,
            mainDispatcher = main.asCoroutineDispatcher(),
            executorFactory = {
                java.util.concurrent.Executors.newFixedThreadPool(2) { r ->
                    Thread(r).apply { setUncaughtExceptionHandler { _, e -> uncaught.set(e) } }
                }
            },
        )
        recognizer.start()
        listener.await()
        assertEquals(Failure.MODEL_FAILED, listener.failure)
        Thread.sleep(100)
        assertNull(uncaught.get())
        main.shutdownNow()
    }

    @Test
    fun lowMemoryIsReported() {
        val h = harness(RecognizerHarness(engine = null, openFailure = InsufficientMemoryException("low")))
        h.recognizer.start()
        h.listener.await()
        assertEquals(Failure.LOW_MEMORY, h.listener.failure)
        h.awaitCleanup()
    }

    @Test
    fun userStopTranscribesRightAway() {
        val h = harness(RecognizerHarness(source = FakeAudioSource(speech(800))))
        h.recognizer.start()
        waitUntil { h.source!!.framesRead >= 40 }
        h.recognizer.stopListening()
        h.listener.await()
        assertEquals("Calculator", h.listener.result)
        h.awaitCleanup()
    }

    @Test
    fun userStopBeforeAnySoundIsNoSpeech() {
        val h = harness(RecognizerHarness(source = FakeAudioSource(emptyList())))
        h.recognizer.start()
        waitUntil { h.source!!.started.get() }
        h.recognizer.stopListening()
        h.listener.await()
        assertEquals(Failure.NO_SPEECH, h.listener.failure)
        h.awaitCleanup()
    }

    @Test
    fun cancelWhileListeningIsSilent() {
        val h = harness(RecognizerHarness(source = FakeAudioSource(speech(800))))
        h.recognizer.start()
        waitUntil { h.source!!.framesRead >= 40 && h.opens.get() == 1 }
        h.recognizer.cancel()
        h.awaitCleanup()
        Thread.sleep(100)
        assertEquals(listOf("LISTENING"), h.listener.events)
        assertEquals(0, h.engine!!.transcribeCalls.get())
        assertEquals(1, h.engine.closeCalls.get())
        assertFalse(h.recognizer.isActive)
    }

    @Test
    fun cancelWhileModelLoadsStillFreesIt() {
        val h = harness(RecognizerHarness(source = FakeAudioSource(speech(800)), openDelayMs = 300))
        h.recognizer.start()
        waitUntil { h.opens.get() == 1 }
        h.recognizer.cancel()
        h.awaitCleanup()
        assertEquals(1, h.engine!!.closeCalls.get())
        assertEquals(listOf("LISTENING"), h.listener.events)
    }

    @Test
    fun cancelDuringTranscriptionAbortsTheModel() {
        val h = harness(RecognizerHarness(engine = FakeEngine(blockUntilAborted = true)))
        h.recognizer.start()
        assertTrue(h.engine!!.transcribing.await(10, TimeUnit.SECONDS))
        h.recognizer.cancel()
        h.awaitCleanup()
        assertTrue(h.engine.aborted.get())
        assertEquals(1, h.engine.closeCalls.get())
        assertEquals(listOf("LISTENING", "PROCESSING"), h.listener.events)
        assertNull(h.listener.result)
    }

    @Test
    fun slowTranscriptionTimesOut() {
        val h = harness(RecognizerHarness(engine = FakeEngine(blockUntilAborted = true), timeoutMs = 200))
        h.recognizer.start()
        h.listener.await()
        assertEquals(Failure.TIMEOUT, h.listener.failure)
        h.awaitCleanup()
        assertTrue(h.engine!!.aborted.get())
    }

    @Test
    fun cancelRightAfterStartLeavesNothingRunning() {
        val h = harness(RecognizerHarness())
        h.recognizer.start()
        h.recognizer.cancel()
        h.awaitCleanup()
        Thread.sleep(100)
        assertEquals(listOf("LISTENING"), h.listener.events)
        assertEquals(0, h.engine!!.transcribeCalls.get())
        assertTrue(h.opens.get() == 0 || h.engine.closeCalls.get() == 1)
    }

    @Test
    fun startIsSingleUse() {
        val h = harness(RecognizerHarness())
        h.recognizer.start()
        h.recognizer.start()
        h.listener.await()
        h.awaitCleanup()
        assertEquals(1, h.sourcesCreated.get())
        assertEquals(1, h.opens.get())
    }

    private fun waitUntil(condition: () -> Boolean) {
        val deadline = System.currentTimeMillis() + 10_000
        while (!condition()) {
            check(System.currentTimeMillis() < deadline) { "Timed out" }
            Thread.sleep(5)
        }
    }
}
