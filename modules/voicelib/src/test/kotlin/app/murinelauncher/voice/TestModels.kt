// SPDX-License-Identifier: Apache-2.0
package app.murinelauncher.voice

import java.io.ByteArrayOutputStream
import java.nio.ByteBuffer
import java.nio.ByteOrder

object TestModels {

    fun bytes(
        magic: Int = WhisperFile.MAGIC,
        nVocab: Int = 51864,
        width: Int = 384,
        layers: Int = 4,
        audioCtx: Int = 1500,
        ftype: Int = 2007,
        tensors: Int = 12,
        tensorType: Int = 8,
        seed: Int = 0,
    ): ByteArray {
        val out = ByteArrayOutputStream()
        fun int(v: Int) = out.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putInt(v).array())

        fun header() {
            int(magic)
            listOf(nVocab, audioCtx, width, 6, layers, 448, width, 6, layers, 80, ftype).forEach(::int)
        }

        fun melFilters(mels: Int = 80, fft: Int = 2) {
            int(mels); int(fft)
            repeat(mels * fft) { int(0) }
        }

        fun vocabulary(words: Int = 100) {
            int(words)
            repeat(words) { int(1); out.write('a'.code + it % 26) }
        }

        fun q8Tensor32x2(index: Int) {
            val name = "tensor.$index".toByteArray()
            int(2); int(name.size); int(tensorType)
            int(32); int(2)
            out.write(name)
            val (block, size) = if (tensorType == 0) 1 to 4 else 32 to 34
            out.write(ByteArray(64 / block * size) { (it + index + seed).toByte() })
        }

        header()
        melFilters()
        vocabulary()
        repeat(tensors, ::q8Tensor32x2)
        return out.toByteArray()
    }
}
