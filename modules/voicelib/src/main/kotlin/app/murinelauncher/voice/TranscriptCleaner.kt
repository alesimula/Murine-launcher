// SPDX-License-Identifier: Apache-2.0
package app.murinelauncher.voice

object TranscriptCleaner {
    private val NON_SPEECH_ANNOTATIONS = Regex("""\[[^\]]*]|\([^)]*\)|\*[^*]*\*|[♪♫]+""")
    private val WHITESPACE = Regex("""\s+""")
    private const val EDGE_PUNCTUATION = ".,!?;:…¡¿\"'«»“”‘’„‚-–—"

    fun clean(raw: String): String = NON_SPEECH_ANNOTATIONS.replace(raw, " ")
        .replace(WHITESPACE, " ")
        .trim { it.isWhitespace() || it in EDGE_PUNCTUATION }
}
