// SPDX-License-Identifier: Apache-2.0
package app.murinelauncher.voice

import java.io.Closeable

interface AudioSource : Closeable {
    fun start(): Boolean

    fun read(buffer: ShortArray, offset: Int, length: Int): Int

    fun isInterrupted(): Boolean

    fun stop()

    override fun close()
}
