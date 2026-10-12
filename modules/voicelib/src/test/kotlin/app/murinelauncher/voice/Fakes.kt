// SPDX-License-Identifier: Apache-2.0
package app.murinelauncher.voice

import java.io.IOException
import java.util.Collections
import java.util.concurrent.CountDownLatch
import java.util.concurrent.ExecutorService
import java.util.concurrent.Executors
import java.util.concurrent.TimeUnit
import java.util.concurrent.atomic.AtomicBoolean
import java.util.concurrent.atomic.AtomicInteger
import kotlin.math.PI
import kotlin.math.sin
import kotlin.random.Random
import kotlinx.coroutines.asCoroutineDispatcher

class FakeAudioSource(
    private val frames: List<ShortArray>,
    private val startResult: Boolean = true,
    private val interruptAfterFrames: Int = -1,
) : AudioSource {
    val started = AtomicBoolean()
    val closed = AtomicBoolean()
    @Volatile var stopped = false
    @Volatile var framesRead = 0
    private var position = 0
    private val stopLatch = CountDownLatch(1)

    override fun start(): Boolean {
        started.set(true)
        return startResult && !stopped
    }

    override fun read(buffer: ShortArray, offset: Int, length: Int): Int {
        if (stopped) return -1
        val frame = EndpointDetector.FRAME_SAMPLES
        val index = position / frame
        if (index >= frames.size) {
            stopLatch.await(10, TimeUnit.SECONDS)
            return -1
        }
        val within = position % frame
        val n = minOf(length, frame - within)
        System.arraycopy(frames[index], within, buffer, offset, n)
        position += n
        framesRead = position / frame
        return n
    }

    override fun isInterrupted() = interruptAfterFrames in 0..framesRead

    override fun stop() {
        stopped = true
        stopLatch.countDown()
    }

    override fun close() {
        stop()
        closed.set(true)
    }

    companion object {
        private val random = Random(7)
        private const val FRAME = EndpointDetector.FRAME_SAMPLES

        fun silence(ms: Int) = List(ms / EndpointDetector.FRAME_MS) {
            ShortArray(FRAME) { random.nextInt(-20, 20).toShort() }
        }

        fun speech(ms: Int): List<ShortArray> {
            var t = 0
            return List(ms / EndpointDetector.FRAME_MS) {
                ShortArray(FRAME) { (4000 * sin(2 * PI * 200 * t++ / 16000.0)).toInt().toShort() }
            }
        }

        fun zeros(ms: Int) = List(ms / EndpointDetector.FRAME_MS) { ShortArray(FRAME) }
    }
}

class FakeEngine(
    private val text: String? = "Calculator.",
    private val blockUntilAborted: Boolean = false,
) : SpeechEngine {
    val aborted = AtomicBoolean()
    val closeCalls = AtomicInteger()
    val transcribeCalls = AtomicInteger()
    val transcribing = CountDownLatch(1)
    @Volatile var lastCount = 0
    private val abortLatch = CountDownLatch(1)

    override fun transcribe(samples: FloatArray, count: Int): String? {
        transcribeCalls.incrementAndGet()
        lastCount = count
        transcribing.countDown()
        if (blockUntilAborted) {
            abortLatch.await(10, TimeUnit.SECONDS)
            return null
        }
        return if (aborted.get()) null else text
    }

    override fun abort() {
        aborted.set(true)
        abortLatch.countDown()
    }

    override fun close() {
        closeCalls.incrementAndGet()
        abort()
    }
}

class RecordingListener : VoiceRecognizer.Listener {
    val events: MutableList<String> = Collections.synchronizedList(ArrayList())
    val done = CountDownLatch(1)
    @Volatile var result: String? = null
    @Volatile var failure: VoiceRecognizer.Failure? = null

    override fun onStateChanged(state: VoiceRecognizer.State) {
        events += state.name
    }

    override fun onResult(text: String) {
        events += "result:$text"
        result = text
        done.countDown()
    }

    override fun onFailure(failure: VoiceRecognizer.Failure) {
        events += "failure:$failure"
        this.failure = failure
        done.countDown()
    }

    fun await() = check(done.await(10, TimeUnit.SECONDS)) { "No result; events: $events" }
}

class RecognizerHarness(
    val source: FakeAudioSource? = FakeAudioSource(FakeAudioSource.speech(1000) + FakeAudioSource.silence(1500)),
    val engine: FakeEngine? = FakeEngine(),
    permission: Boolean = true,
    openFailure: IOException? = null,
    openDelayMs: Long = 0,
    timeoutMs: Long = 30_000,
) {
    val listener = RecordingListener()
    val sourcesCreated = AtomicInteger()
    val opens = AtomicInteger()
    val executors: MutableList<ExecutorService> = Collections.synchronizedList(ArrayList())
    private val main = Executors.newSingleThreadExecutor { r -> Thread(r, "test-main") }

    val recognizer = VoiceRecognizer(
        engineFactory = if (engine == null && openFailure == null) null else SpeechEngineFactory {
            opens.incrementAndGet()
            if (openDelayMs > 0) Thread.sleep(openDelayMs)
            if (openFailure != null) throw openFailure
            engine!!
        },
        audioSourceFactory = {
            sourcesCreated.incrementAndGet()
            source ?: throw IllegalStateException("no microphone")
        },
        hasPermission = { permission },
        listener = listener,
        mainDispatcher = main.asCoroutineDispatcher(),
        transcriptionTimeoutMs = timeoutMs,
        executorFactory = { Executors.newFixedThreadPool(2).also { executors += it } },
    )

    fun awaitCleanup() {
        val deadline = System.currentTimeMillis() + 10_000
        while (System.currentTimeMillis() < deadline) {
            val sourceDone = source == null || sourcesCreated.get() == 0 || source.closed.get()
            val engineDone = engine == null || opens.get() == 0 || engine.closeCalls.get() > 0
            val threadsDone = executors.all { it.isShutdown && it.awaitTermination(0, TimeUnit.MILLISECONDS) }
            if (sourceDone && engineDone && threadsDone) return
            Thread.sleep(10)
        }
        error("Query resources not released")
    }

    fun shutdown() {
        main.shutdownNow()
    }
}
