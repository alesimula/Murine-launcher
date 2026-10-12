package app.murinelauncher.widget.search

/**
 * Static configuration flags for the Murine search bar widget.
 */
object SearchBarConfig {
    /**
     * When true, the microphone button starts voice search (offline speech-to-text, or the system
     * speech recognizer if chosen in settings) instead of opening the assistant.
     * Enabled by default.
     */
    const val SEARCH_MICBUTTON_VOICE_SEARCH: Boolean = true

    /**
     * Rows shown in the search box while typing;
     * Set to -1 to leave uncapped.
     */
    const val MAX_SEARCH_RESULTS: Int = -1
}
