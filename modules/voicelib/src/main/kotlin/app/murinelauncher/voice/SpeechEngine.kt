// SPDX-License-Identifier: Apache-2.0
package app.murinelauncher.voice

import java.io.Closeable
import java.io.File
import java.io.IOException

interface SpeechEngine : Closeable {
    fun transcribe(samples: FloatArray, count: Int): String?

    fun abort()

    override fun close()
}

fun interface SpeechEngineFactory {
    @Throws(IOException::class)
    fun open(): SpeechEngine
}

data class WhisperOptions(
    val language: String,
    val dynamicAudioContext: Boolean,
    val threads: Int = WhisperTuning.threadCount(),
    val maxTokens: Int = WhisperTuning.MAX_QUERY_TOKENS,
)

class WhisperModel private constructor(
    private var handle: Long,
    private val options: WhisperOptions,
) : SpeechEngine {

    private val lock = Any()
    private var busy = false
    private var aborted = false
    private var freeWhenTranscriptionEnds = false

    override fun transcribe(samples: FloatArray, count: Int): String? {
        val h = synchronized(lock) {
            if (handle == 0L || aborted || busy) return null
            busy = true
            handle
        }
        try {
            val audioCtx = WhisperTuning.audioContext(count, options.dynamicAudioContext)
            val bytes = WhisperNative.nativeTranscribe(
                h, samples, count, options.language, audioCtx, options.threads, options.maxTokens
            ) ?: return null
            return String(bytes, Charsets.UTF_8)
        } catch (_: LinkageError) {
            return null
        } finally {
            val toFree = synchronized(lock) {
                busy = false
                if (freeWhenTranscriptionEnds) handle.also { handle = 0L } else 0L
            }
            if (toFree != 0L) WhisperNative.nativeClose(toFree)
        }
    }

    override fun abort() {
        synchronized(lock) {
            aborted = true
            if (handle != 0L) WhisperNative.nativeAbort(handle)
        }
    }

    override fun close() {
        val toFree = synchronized(lock) {
            if (handle == 0L) return
            aborted = true
            if (busy) {
                freeWhenTranscriptionEnds = true
                WhisperNative.nativeAbort(handle)
                0L
            } else {
                handle.also { handle = 0L }
            }
        }
        WhisperNative.nativeClose(toFree)
    }

    companion object {
        @Throws(IOException::class)
        fun open(file: File, options: WhisperOptions): WhisperModel {
            WhisperNative.ensureLoaded()
            val handle = try {
                WhisperNative.nativeOpen(file.absolutePath)
            } catch (e: LinkageError) {
                throw IOException("Speech recognition library unavailable", e)
            }
            if (handle == 0L) throw IOException("Could not load speech model")
            return WhisperModel(handle, options)
        }
    }
}
