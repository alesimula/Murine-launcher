package app.murinelauncher.widget.search

import android.content.ActivityNotFoundException
import android.content.ComponentName
import android.content.Context
import android.content.Intent
import android.net.Uri
import android.provider.Settings
import android.speech.RecognizerIntent
import android.util.AttributeSet
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.animation.DecelerateInterpolator
import android.view.animation.Interpolator
import android.view.animation.PathInterpolator
import android.widget.FrameLayout
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import com.android.app.animation.Interpolators
import com.android.launcher3.Launcher
import com.android.launcher3.LauncherConstants
import com.android.launcher3.LauncherPrefChangeListener
import com.android.launcher3.LauncherPrefs
import com.android.launcher3.R
import com.android.launcher3.views.ActivityContext

/**
 * Material You QPR3-style search bar for the Murine launcher.
 */
class MurineSearchBarView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : FrameLayout(context, attrs, defStyleAttr) {

    private val searchLogo: ImageView
    private val searchHint: TextView
    private val micButton: ImageButton
    private val lensButton: ImageButton
    private val assistantSearchButton: ImageButton
    private val searchPlate: View
    private val searchPrompt: String

    private val containerBg: View
    private val barBg: View
    private val circleBg: View

    init {
        SearchProvider.load(context)
        clipChildren = false
        clipToPadding = false
        LayoutInflater.from(context).inflate(R.layout.murine_search_bar, this, true)
        searchPrompt = context.resources.getString(R.string.murine_voice_search_prompt)

        containerBg = findViewById<View>(R.id.murine_search_container_bg)
        barBg = findViewById<View>(R.id.murine_search_bar_bg)
        circleBg = findViewById<View>(R.id.murine_search_circle_bg)

        searchLogo = findViewById(R.id.murine_search_logo)
        searchHint = findViewById(R.id.murine_search_hint)
        micButton = findViewById(R.id.murine_search_mic_btn)
        lensButton = findViewById(R.id.murine_search_lens_btn)
        assistantSearchButton = findViewById(R.id.murine_assistant_search_btn)
        searchPlate = findViewById(R.id.murine_search_plate)

        refreshProvider()
        setupClickListeners()
    }

    private fun updateHint() {
        searchHint.text = if (SearchProvider.current == SearchProvider.APPS_ONLY)
            context.getString(R.string.all_apps_search_bar_hint)
        else if (SearchProvider.current == SearchProvider.CUSTOM)
            context.getString(R.string.murine_search_hint_generic)
        else context.getString(
            R.string.murine_search_hint_provider,
            SearchProvider.current.displayName
        )
    }

    private fun setupClickListeners() {
        // Tapping the search plate or the circle search button opens search
        val searchClickListener = OnClickListener { openSearch() }
        searchPlate.setOnClickListener(searchClickListener)
        assistantSearchButton.setOnClickListener { openAssistant() }
        searchLogo.setOnClickListener(searchClickListener)
        searchHint.setOnClickListener(searchClickListener)
        micButton.setOnClickListener { openVoiceSearch() }
        lensButton.setOnClickListener { openLensOrVisualSearch() }
    }

    private fun openSearch() {
        val launcher = ActivityContext.lookupContext<Launcher>(context)
        MurineSearchBoxView.show(launcher)
    }

    private fun openVoiceSearch() {
        if (SearchBarConfig.SEARCH_MICBUTTON_TTS) {
            val launcher = ActivityContext.lookupContext<Launcher>(context)
            // Use system voice recognizer (TTS default) instead of Google Assistant
            try {
                val intent = Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH).apply {
                    putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL, RecognizerIntent.LANGUAGE_MODEL_FREE_FORM)
                    putExtra(RecognizerIntent.EXTRA_PROMPT, searchPrompt);
                    //addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
                }
                launcher.startActivityForResult(intent, LauncherConstants.ActivityCodes.REQUEST_TTS_WEB_SEARCH)
            } catch (e: ActivityNotFoundException) {
                Log.w(TAG, "No speech recognizer found", e)
            }
        } else {
            openAssistant()
        }
    }

    /**
     * Opens the user's default assistant (Settings > Default apps > Digital assistant app).
     * Each fallback is checked with resolveActivity and tried in order, moving on if it fails to start.
     */
    private fun openAssistant() {
        // Ask the system to show the default assistant's own UI (e.g. the Gemini overlay);
        // It works while the launcher is the foreground activity, and returns false when no assistant is set
        val launcher = ActivityContext.lookupContext<Launcher>(context)
        if (runCatching { launcher.showAssist(null) }.getOrDefault(false)) return

        // Default assistant component, empty when none is set (read only to decide on the picker;
        // if the setting can't be read, assume one is set and go straight to the intents)
        val assistant = runCatching {
            Settings.Secure.getString(context.contentResolver, "assistant")
        }
        val pickerIntents = listOf(
            Intent(Settings.ACTION_VOICE_INPUT_SETTINGS),
            Intent(Settings.ACTION_MANAGE_DEFAULT_APPS_SETTINGS),
        )

        // Pre-Android 17 behaviour: VOICE_COMMAND reached the Google app, which forwarded it to the assistant.
        // Since Android 17 the Google app only honors it from a Bluetooth headset.
        val intents = listOf(
            Intent(Intent.ACTION_VOICE_COMMAND),
            Intent(Intent.ACTION_ASSIST),
            Intent(RecognizerIntent.ACTION_WEB_SEARCH).putExtra(
                RecognizerIntent.EXTRA_LANGUAGE_MODEL, RecognizerIntent.LANGUAGE_MODEL_WEB_SEARCH
            ),
        )
        // No default assistant: open the picker first; otherwise it's only the last resort
        val candidates = if (assistant.isSuccess && assistant.getOrNull().isNullOrEmpty())
            pickerIntents + intents else intents + pickerIntents
        val pm = context.packageManager
        val started = candidates.any { intent ->
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            intent.resolveActivity(pm) != null && runCatching { context.startActivity(intent) }
                .onFailure { Log.w(TAG, "Failed to start ${intent.action}", it) }
                .isSuccess
        }
        if (!started) Log.w(TAG, "No assistant found")
    }

    private fun openLensOrVisualSearch() {
        try {
            val intent = Intent("com.google.vr.apps.ornament.app.lens.LensLauncherActivity").apply {
                setPackage("com.google.ar.lens")
                addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            }
            context.startActivity(intent)
        } catch (e: ActivityNotFoundException) {
            try {
                val intent = Intent(Intent.ACTION_VIEW).apply {
                    data = Uri.parse("google://lens")
                    component = ComponentName(
                        "com.google.android.googlequicksearchbox",
                        "com.google.android.apps.search.lens.LensExportedActivity"
                    )
                    putExtra("LensHomescreenShortcut", true)
                    addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
                }
                context.startActivity(intent)
            } catch (e2: ActivityNotFoundException) {
                try {
                    // Fallback: try the camera
                    val intent = Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE).apply {
                        addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
                    }
                    context.startActivity(intent)
                } catch (e3: ActivityNotFoundException) {
                    Log.w(TAG, "No visual search or camera found", e2)
                }
            }
        }
    }

    /**
     * Call this when the search provider or QSB config changes to refresh the UI.
     */
    fun refreshProvider() {
        SearchProvider.load(context)
        searchLogo.setImageResource(SearchProvider.current.iconRes)
        lensButton.visibility = if (LauncherPrefs.QSB_SHOW_LENS.get(context)) View.VISIBLE else View.GONE
        updateHint()
        var alpha = LauncherPrefs.QSB_ALPHA.get(context) / 100f
        val alphaLayer1 = DECELERATE_OUTER.getInterpolation(alpha)
        val innerAlpha = alpha * DECELERATE_INNER.getInterpolation(alpha)

        this.alpha = 1f * Interpolators.DECELERATE.getInterpolation(alpha)
        containerBg.alpha = alphaLayer1
        barBg.alpha = innerAlpha
        circleBg.alpha = innerAlpha
    }

    private val prefListener = LauncherPrefChangeListener { key ->
        when (key) {
            LauncherPrefs.QSB_SEARCH_PROVIDER.sharedPrefKey,
            LauncherPrefs.QSB_SHOW_LENS.sharedPrefKey,
            LauncherPrefs.QSB_ALPHA.sharedPrefKey -> {
                post { refreshProvider() }
            }
        }
    }

    override fun onAttachedToWindow() {
        super.onAttachedToWindow()
        LauncherPrefs.get(context).addListener(
            prefListener,
            LauncherPrefs.QSB_SEARCH_PROVIDER,
            LauncherPrefs.QSB_SHOW_LENS
        )
    }

    override fun onDetachedFromWindow() {
        super.onDetachedFromWindow()
        LauncherPrefs.get(context).removeListener(
            prefListener,
            LauncherPrefs.QSB_SEARCH_PROVIDER,
            LauncherPrefs.QSB_SHOW_LENS
        )
    }

    companion object {
        val DECELERATE_OUTER: Interpolator = DecelerateInterpolator(0.8f)
        val DECELERATE_INNER: Interpolator = DecelerateInterpolator(0.9f)
        const val TAG = "MurineSearchBar"
    }
}
