package app.murinelauncher.widget.search

import android.content.ActivityNotFoundException
import android.content.ComponentName
import android.content.Context
import android.content.Intent
import android.net.Uri
import android.speech.RecognizerIntent
import android.util.AttributeSet
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.widget.FrameLayout
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import com.android.launcher3.Launcher
import com.android.launcher3.LauncherConstants
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

    init {
        SearchProvider.load(context)
        clipChildren = false
        clipToPadding = false
        LayoutInflater.from(context).inflate(R.layout.murine_search_bar, this, true)
        searchPrompt = context.resources.getString(R.string.murine_voice_search_prompt)

        searchLogo = findViewById(R.id.murine_search_logo)
        searchHint = findViewById(R.id.murine_search_hint)
        micButton = findViewById(R.id.murine_search_mic_btn)
        lensButton = findViewById(R.id.murine_search_lens_btn)
        assistantSearchButton = findViewById(R.id.murine_assistant_search_btn)
        searchPlate = findViewById(R.id.murine_search_plate)

        applyConfig()
        setupClickListeners()
    }

    private fun applyConfig() {
        lensButton.visibility = if (SearchBarConfig.SEARCH_DISABLE_LENS) View.GONE else View.VISIBLE
        updateHint()
    }

    private fun updateHint() {
        searchHint.text = context.getString(
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

    private fun openAssistant() {
        try {
            val intent = Intent(Intent.ACTION_VOICE_COMMAND).apply {
                addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            }
            context.startActivity(intent)
        } catch (e: ActivityNotFoundException) {
            Log.w(TAG, "No voice command activity found", e)
            try {
                val intent = Intent(Intent.ACTION_ASSIST).apply {
                    addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
                }
                context.startActivity(intent)
            } catch (e2: ActivityNotFoundException) {
                try {
                    val intent = Intent(RecognizerIntent.ACTION_WEB_SEARCH).apply {
                        putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL, RecognizerIntent.LANGUAGE_MODEL_WEB_SEARCH)
                        addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
                    }
                    context.startActivity(intent)
                } catch (e3: ActivityNotFoundException) {
                    Log.w(TAG, "No assistant found", e2)
                }
            }
        }
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
     * Call this when the search provider changes to refresh the UI.
     */
    fun refreshProvider() {
        updateHint()
    }

    companion object {
        const val TAG = "MurineSearchBar"
    }
}
