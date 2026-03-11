package app.murinelauncher.widget.search

/**
 * Static configuration flags for the Murine search bar widget.
 */
object SearchBarConfig {
    /**
     * When true, the Google Lens (visual search) button is hidden.
     * Enabled by default — set to false to show the lens button.
     */
    @JvmField
    var SEARCH_DISABLE_LENS: Boolean = true

    /**
     * When true, the microphone button opens the system default
     * text-to-speech / voice recognizer instead of Google Assistant.
     * Enabled by default.
     */
    @JvmField
    var SEARCH_MICBUTTON_TTS: Boolean = true
}
