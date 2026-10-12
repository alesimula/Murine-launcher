// SPDX-License-Identifier: Apache-2.0
package app.murinelauncher.voice

import app.murinelauncher.voice.FakeAudioSource.Companion.speech
import app.murinelauncher.voice.VoiceSearchPresenter.MicState
import java.util.Collections
import java.util.concurrent.CountDownLatch
import java.util.concurrent.Executors
import java.util.concurrent.TimeUnit
import kotlinx.coroutines.asCoroutineDispatcher
import org.junit.After
import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Test

class VoiceSearchPresenterTest {

    private val main = Executors.newSingleThreadExecutor()
    private val box = RecordingBox()

    @After
    fun tearDown() {
        main.shutdownNow()
    }

    private class RecordingBox : VoiceSearchPresenter.SearchBox {
        val calls: MutableList<String> = Collections.synchronizedList(ArrayList())
        val done = CountDownLatch(1)
        var submits = 0

        override fun setMicState(state: MicState) {
            calls += "mic:$state"
        }

        override fun setLevel(level: Float) {}

        override fun setQuery(text: String) {
            calls += "query:$text"
            done.countDown()
        }

        override fun showFailure(failure: VoiceRecognizer.Failure) {
            calls += "failure:$failure"
            done.countDown()
        }

        override fun submit() {
            submits++
        }
    }

    private fun presenter(source: FakeAudioSource, engine: FakeEngine = FakeEngine(), permission: Boolean = true) =
        VoiceSearchPresenter(box) { listener ->
            VoiceRecognizer(
                engineFactory = { engine },
                audioSourceFactory = { source },
                hasPermission = { permission },
                listener = listener,
                mainDispatcher = main.asCoroutineDispatcher(),
            )
        }

    private fun onMain(block: () -> Unit) = main.submit(block).get(10, TimeUnit.SECONDS)

    @Test
    fun resultFillsTheSearchFieldWithoutSubmitting() {
        val p = presenter(FakeAudioSource(speech(1000) + FakeAudioSource.silence(1500)), FakeEngine("Open the camera."))
        onMain { p.start() }
        assertTrue(box.done.await(10, TimeUnit.SECONDS))
        onMain { }
        assertEquals(listOf("mic:LISTENING", "mic:PROCESSING", "mic:IDLE", "query:Open the camera"), box.calls)
        assertEquals(0, box.submits)
        assertEquals(MicState.IDLE, p.state)
    }

    @Test
    fun failureIsShownAndNothingIsSubmitted() {
        val p = presenter(FakeAudioSource(speech(1000)), permission = false)
        onMain { p.start() }
        assertTrue(box.done.await(10, TimeUnit.SECONDS))
        assertEquals(listOf("failure:PERMISSION_DENIED"), box.calls)
        assertEquals(0, box.submits)
        assertEquals(MicState.IDLE, p.state)
    }

    @Test
    fun tapWhileListeningStopsAndTranscribes() {
        val source = FakeAudioSource(speech(800))
        val p = presenter(source)
        onMain { p.onMicTapped() }
        waitUntil { source.framesRead >= 40 }
        onMain { assertEquals(MicState.LISTENING, p.state) }
        onMain { p.onMicTapped() }
        assertTrue(box.done.await(10, TimeUnit.SECONDS))
        onMain { }
        assertEquals("query:Calculator", box.calls.last())
        assertEquals(0, box.submits)
    }

    @Test
    fun tapWhileProcessingCancels() {
        val engine = FakeEngine(blockUntilAborted = true)
        val p = presenter(FakeAudioSource(speech(1000) + FakeAudioSource.silence(1500)), engine)
        onMain { p.start() }
        assertTrue(engine.transcribing.await(10, TimeUnit.SECONDS))
        waitUntil { onMainValue { p.state } == MicState.PROCESSING }
        onMain { p.onMicTapped() }
        waitUntil { engine.closeCalls.get() == 1 }
        Thread.sleep(100)
        onMain { assertEquals(MicState.IDLE, p.state) }
        assertTrue(engine.aborted.get())
        assertTrue(box.calls.none { it.startsWith("query:") || it.startsWith("failure:") })
    }

    @Test
    fun dismissCancelsListening() {
        val source = FakeAudioSource(speech(800))
        val p = presenter(source)
        onMain { p.start() }
        waitUntil { source.framesRead >= 40 }
        onMain { p.cancel() }
        waitUntil { source.closed.get() }
        Thread.sleep(100)
        assertEquals(listOf("mic:LISTENING", "mic:IDLE"), box.calls)
    }

    private fun <T> onMainValue(block: () -> T): T = main.submit(block).get(10, TimeUnit.SECONDS)

    private fun waitUntil(condition: () -> Boolean) {
        val deadline = System.currentTimeMillis() + 10_000
        while (!condition()) {
            check(System.currentTimeMillis() < deadline) { "Timed out" }
            Thread.sleep(5)
        }
    }
}
