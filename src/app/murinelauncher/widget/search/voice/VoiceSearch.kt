package app.murinelauncher.widget.search.voice

import android.Manifest
import android.app.ActivityManager
import android.content.ActivityNotFoundException
import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.os.Build
import android.os.Handler
import android.os.Looper
import android.provider.Settings
import android.speech.RecognizerIntent
import android.util.Log
import android.widget.Toast
import androidx.annotation.StringRes
import app.murinelauncher.settings.SettingsVoiceSearchFragment
import app.murinelauncher.voice.VoiceAbis
import app.murinelauncher.voice.InstalledModel
import app.murinelauncher.voice.InsufficientMemoryException
import app.murinelauncher.voice.MicAudioSource
import app.murinelauncher.voice.ModelMissingException
import app.murinelauncher.voice.SpeechEngineFactory
import app.murinelauncher.voice.VoiceModelStore
import app.murinelauncher.voice.VoiceRecognizer
import app.murinelauncher.voice.WhisperModel
import app.murinelauncher.voice.WhisperOptions
import app.murinelauncher.voice.WhisperTuning
import app.murinelauncher.widget.accessibility.AlertDialogSheet
import app.murinelauncher.widget.search.MurineSearchBoxView
import com.android.launcher3.Launcher
import com.android.launcher3.LauncherConstants.ActivityCodes.REQUEST_RECORD_AUDIO
import com.android.launcher3.LauncherConstants.ActivityCodes.REQUEST_SYSTEM_VOICE_SEARCH
import com.android.launcher3.LauncherPrefs
import com.android.launcher3.R
import com.android.launcher3.settings.SettingsActivity
import java.io.File
import java.util.concurrent.Executor
import kotlinx.coroutines.asCoroutineDispatcher

object VoiceSearch {
    private const val TAG = "MurineVoiceSearch"
    private const val MODELS_DIR = "voice_models"
    private const val MB = 1024L * 1024

    private val mainDispatcher by lazy {
        Executor(Handler(Looper.getMainLooper())::post).asCoroutineDispatcher()
    }

    @JvmStatic
    fun store(context: Context) = VoiceModelStore(File(context.noBackupFilesDir, MODELS_DIR))

    @JvmStatic
    fun activeModel(context: Context, installed: List<InstalledModel> = store(context).installed()): InstalledModel? {
        val chosen = LauncherPrefs.VOICE_SEARCH_MODEL.get(context)
        return installed.firstOrNull { it.id == chosen } ?: installed.firstOrNull()
    }

    @JvmStatic
    val isOfflineSupported: Boolean by lazy { VoiceAbis.isSupported(Build.SUPPORTED_ABIS) }

    @JvmStatic
    fun mode(context: Context): VoiceSearchMode =
        if (isOfflineSupported) LauncherPrefs.VOICE_SEARCH_MODE.get(context) else VoiceSearchMode.SYSTEM

    @JvmStatic
    fun isOfflineEnabled(context: Context) = mode(context) == VoiceSearchMode.OFFLINE

    @JvmStatic
    fun hasMicPermission(context: Context) =
        context.checkSelfPermission(Manifest.permission.RECORD_AUDIO) == PackageManager.PERMISSION_GRANTED

    fun newRecognizer(context: Context, listener: VoiceRecognizer.Listener): VoiceRecognizer {
        val app = context.applicationContext
        return VoiceRecognizer(
            engineFactory = engineFactory(app),
            audioSourceFactory = { MicAudioSource(app) },
            hasPermission = { hasMicPermission(app) },
            listener = listener,
            mainDispatcher = mainDispatcher,
        )
    }

    private fun engineFactory(context: Context) = SpeechEngineFactory {
        val model = activeModel(context) ?: throw ModelMissingException()
        ensureEnoughMemoryFor(context, model)
        val language = WhisperTuning.resolveLanguage(
            LauncherPrefs.VOICE_SEARCH_LANGUAGE.get(context), model.multilingual
        )
        WhisperModel.open(model.file, WhisperOptions(language, model.dynamicAudioContext))
    }

    private fun ensureEnoughMemoryFor(context: Context, model: InstalledModel) {
        val am = context.getSystemService(ActivityManager::class.java) ?: return
        val info = ActivityManager.MemoryInfo().also(am::getMemoryInfo)
        val neededMb = model.catalog?.approxRamMb?.toLong() ?: (model.bytes * 13 / 10 / MB + 60)
        if (info.lowMemory || info.availMem - neededMb * MB < info.threshold) {
            throw InsufficientMemoryException("Needs about $neededMb MB")
        }
    }

    @JvmStatic
    fun onMicTapped(launcher: Launcher) {
        when (mode(launcher)) {
            VoiceSearchMode.SYSTEM -> startSystemRecognizer(launcher)
            VoiceSearchMode.OFFLINE -> startOffline(launcher)
        }
    }

    private fun startOffline(launcher: Launcher) {
        if (!store(launcher).hasAnyModel()) {
            Toast.makeText(launcher, R.string.voice_search_setup_needed, Toast.LENGTH_LONG).show()
            openSettings(launcher)
            return
        }
        if (hasMicPermission(launcher)) {
            MurineSearchBoxView.showForVoice(launcher)
            return
        }
        val askedBefore = LauncherPrefs.VOICE_SEARCH_MIC_ASKED.get(launcher)
        val deniedForGood = askedBefore &&
            !launcher.shouldShowRequestPermissionRationale(Manifest.permission.RECORD_AUDIO)
        if (deniedForGood) {
            AlertDialogSheet.show(launcher,
                launcher.getString(R.string.voice_search_mic_blocked_title),
                launcher.getString(R.string.voice_search_mic_blocked_message)) {
                openAppPermissions(launcher)
            }
            return
        }
        AlertDialogSheet.show(launcher,
            launcher.getString(R.string.voice_search_mic_rationale_title),
            launcher.getString(R.string.voice_search_mic_rationale_message)) {
            LauncherPrefs.get(launcher).put(LauncherPrefs.VOICE_SEARCH_MIC_ASKED, true)
            launcher.requestPermissions(arrayOf(Manifest.permission.RECORD_AUDIO), REQUEST_RECORD_AUDIO)
        }
    }

    @JvmStatic
    fun onRequestPermissionsResult(launcher: Launcher, requestCode: Int, grantResults: IntArray): Boolean {
        if (requestCode != REQUEST_RECORD_AUDIO) return false
        if (grantResults.firstOrNull() == PackageManager.PERMISSION_GRANTED) {
            MurineSearchBoxView.showForVoice(launcher)
        } else {
            Toast.makeText(launcher, R.string.voice_search_error_permission, Toast.LENGTH_SHORT).show()
        }
        return true
    }

    private fun startSystemRecognizer(launcher: Launcher) {
        try {
            val intent = Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH).apply {
                putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL, RecognizerIntent.LANGUAGE_MODEL_FREE_FORM)
                putExtra(RecognizerIntent.EXTRA_PROMPT, launcher.getString(R.string.murine_voice_search_prompt))
            }
            launcher.startActivityForResult(intent, REQUEST_SYSTEM_VOICE_SEARCH)
        } catch (e: ActivityNotFoundException) {
            Log.w(TAG, "No speech recognizer found", e)
            Toast.makeText(launcher, R.string.voice_search_no_system_recognizer, Toast.LENGTH_SHORT).show()
        }
    }

    @JvmStatic
    fun onSystemRecognizerResult(launcher: Launcher, data: Intent?) {
        val query = data?.getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS)?.firstOrNull()
        if (!query.isNullOrBlank()) MurineSearchBoxView.showWithQuery(launcher, query)
    }

    @JvmStatic
    fun openSettings(context: Context) {
        context.startActivity(Intent(Intent.ACTION_APPLICATION_PREFERENCES)
            .setPackage(context.packageName)
            .putExtra(SettingsActivity.EXTRA_FRAGMENT, SettingsVoiceSearchFragment::class.java.name)
            .addFlags(Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK))
    }

    private fun openAppPermissions(context: Context) {
        try {
            context.startActivity(Intent(Settings.ACTION_APPLICATION_DETAILS_SETTINGS)
                .setData(Uri.fromParts("package", context.packageName, null))
                .addFlags(Intent.FLAG_ACTIVITY_NEW_TASK))
        } catch (e: ActivityNotFoundException) {
            Log.w(TAG, "No app details screen", e)
        }
    }

    @StringRes
    @JvmStatic
    fun failureMessage(failure: VoiceRecognizer.Failure): Int = when (failure) {
        VoiceRecognizer.Failure.PERMISSION_DENIED -> R.string.voice_search_error_permission
        VoiceRecognizer.Failure.MODEL_MISSING -> R.string.voice_search_setup_needed
        VoiceRecognizer.Failure.MODEL_FAILED -> R.string.voice_search_error_model
        VoiceRecognizer.Failure.LOW_MEMORY -> R.string.voice_search_error_memory
        VoiceRecognizer.Failure.MIC_UNAVAILABLE -> R.string.voice_search_error_mic
        VoiceRecognizer.Failure.NO_SPEECH -> R.string.voice_search_error_no_speech
        VoiceRecognizer.Failure.TRANSCRIPTION_FAILED -> R.string.voice_search_error_transcription
        VoiceRecognizer.Failure.TIMEOUT -> R.string.voice_search_error_timeout
    }
}
