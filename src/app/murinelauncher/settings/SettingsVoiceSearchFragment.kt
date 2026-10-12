package app.murinelauncher.settings

import android.app.AlertDialog
import android.content.ActivityNotFoundException
import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.provider.DocumentsContract
import android.provider.OpenableColumns
import android.text.format.Formatter
import android.util.Log
import android.widget.ProgressBar
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts
import androidx.preference.ListPreference
import androidx.preference.Preference
import androidx.preference.PreferenceCategory
import app.murinelauncher.settings.common.AbstractSettingsFragment
import app.murinelauncher.voice.CatalogModel
import app.murinelauncher.voice.ImportError
import app.murinelauncher.voice.ImportResult
import app.murinelauncher.voice.InstalledModel
import app.murinelauncher.voice.ModelSize
import app.murinelauncher.voice.VoiceModelCatalog
import app.murinelauncher.voice.WhisperTuning
import app.murinelauncher.widget.radio.RadioGroupPreference
import app.murinelauncher.widget.search.voice.VoiceSearch
import app.murinelauncher.widget.search.voice.VoiceSearchMode
import com.android.launcher3.LauncherPrefs
import com.android.launcher3.R
import com.android.launcher3.util.DisplayController
import com.android.launcher3.util.Executors.MAIN_EXECUTOR
import java.util.Locale
import java.util.concurrent.atomic.AtomicBoolean

class SettingsVoiceSearchFragment : AbstractSettingsFragment() {

    companion object {
        const val VOICE_SEARCH_MODE = "voice_search_mode"
        const val VOICE_SEARCH_MODEL = "voice_search_model"
        const val VOICE_SEARCH_LANGUAGE = "voice_search_language"
        private const val MODELS = "voice_search_models"
        private const val IMPORT = "voice_search_import"
        private const val MODELS_PAGE = "voice_search_models_page"
        private const val LICENSES = "voice_search_licenses"
        private const val MODEL_PREFIX = "voice_model_"
        private const val TAG = "MurineVoiceSettings"
        private val ANY_FILE_TYPE = arrayOf("*/*")

        @JvmStatic
        fun summary(context: Context): CharSequence {
            if (VoiceSearch.mode(context) == VoiceSearchMode.SYSTEM) {
                return context.getString(R.string.pref_voice_mode_system)
            }
            val model = VoiceSearch.activeModel(context)
                ?: return context.getString(R.string.pref_voice_summary_not_set_up)
            return context.getString(R.string.pref_voice_summary_offline, modelName(context, model.catalog, model))
        }

        private fun modelName(context: Context, catalog: CatalogModel?, installed: InstalledModel?): String {
            val multilingual = catalog?.multilingual ?: installed?.multilingual ?: false
            val size = catalog?.size ?: installed?.header?.size ?: ModelSize.UNKNOWN
            val language = context.getString(
                if (multilingual) R.string.voice_model_multilingual else R.string.voice_model_english
            )
            val sizeName = context.getString(when (size) {
                ModelSize.TINY -> R.string.voice_model_size_tiny
                ModelSize.BASE -> R.string.voice_model_size_base
                ModelSize.SMALL -> R.string.voice_model_size_small
                ModelSize.MEDIUM -> R.string.voice_model_size_medium
                ModelSize.LARGE -> R.string.voice_model_size_large
                ModelSize.UNKNOWN -> R.string.voice_model_size_unknown
            })
            val name = context.getString(R.string.voice_model_name, language, sizeName)
            return if (catalog == null) context.getString(R.string.voice_model_imported, name) else name
        }
    }

    private var importCancel: AtomicBoolean? = null
    private var importDialog: AlertDialog? = null

    private val importModel = registerForActivityResult(ActivityResultContracts.OpenDocument()) { uri ->
        if (uri != null && isAdded) startImport(uri)
    }

    override fun getPreferenceScreenResId() = R.xml.murine_prefs_voice

    override fun getPreferenceTitle(): Int = R.string.pref_voice_title

    override fun initPreference(preference: Preference, info: DisplayController.Info): Boolean {
        when (preference.key) {
            VOICE_SEARCH_MODE -> {
                (preference as RadioGroupPreference).asEnum(VoiceSearchMode::class.java).apply {
                    setDefaultValue(LauncherPrefs.VOICE_SEARCH_MODE.defaultValue)
                    setTextProvider { ctx, mode ->
                        ctx.getString(when (mode) {
                            VoiceSearchMode.OFFLINE -> R.string.pref_voice_mode_offline
                            VoiceSearchMode.SYSTEM -> R.string.pref_voice_mode_system
                        })
                    }
                    setSummaryProvider { ctx, mode ->
                        ctx.getString(when {
                            mode == VoiceSearchMode.SYSTEM -> R.string.pref_voice_mode_system_summary
                            VoiceSearch.isOfflineSupported -> R.string.pref_voice_mode_offline_summary
                            else -> R.string.pref_voice_mode_offline_unsupported
                        })
                    }
                    setEnabledProvider { _, mode -> mode == VoiceSearchMode.SYSTEM || VoiceSearch.isOfflineSupported }
                    if (!VoiceSearch.isOfflineSupported) setCurrentValue { VoiceSearchMode.SYSTEM }
                }
            }
            MODELS, VOICE_SEARCH_LANGUAGE -> return VoiceSearch.isOfflineSupported
            IMPORT -> preference.setOnPreferenceClickListener {
                pickModelFile()
                true
            }
            MODELS_PAGE -> preference.setOnPreferenceClickListener {
                openUrl(VoiceModelCatalog.MODELS_PAGE)
                true
            }
            LICENSES -> preference.setOnPreferenceClickListener {
                showLicenses()
                true
            }
        }
        return true
    }

    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        super.onCreatePreferences(savedInstanceState, rootKey)
        refreshModels()
    }

    override fun onDestroy() {
        importCancel?.set(true)
        importDialog?.dismiss()
        super.onDestroy()
    }

    private fun refreshModels() {
        val ctx = context ?: return
        val category = findPreference<PreferenceCategory>(MODELS) ?: return
        for (i in category.preferenceCount - 1 downTo 0) {
            val p = category.getPreference(i)
            if (p.key?.startsWith(MODEL_PREFIX) == true) category.removePreference(p)
        }
        val installed = VoiceSearch.store(ctx).installed()
        val active = VoiceSearch.activeModel(ctx, installed)

        var order = 0
        VoiceModelCatalog.models.forEach { model ->
            val present = installed.firstOrNull { it.catalog == model }
            category.addPreference(modelPreference(ctx, model, present, present != null && present == active, order++))
        }
        installed.filter { it.catalog == null }.forEach { model ->
            category.addPreference(modelPreference(ctx, null, model, model == active, order++))
        }
        refreshLanguage(active)
    }

    private fun modelPreference(
        ctx: Context, catalog: CatalogModel?, installed: InstalledModel?, active: Boolean, order: Int,
    ) = Preference(ctx).apply {
        key = MODEL_PREFIX + (catalog?.id ?: installed!!.id)
        this.order = order
        isPersistent = false
        isIconSpaceReserved = true
        title = modelName(ctx, catalog, installed)
        summary = modelSummary(ctx, catalog, installed, active)
        when {
            active -> setIcon(R.drawable.ic_murine_check)
            installed == null -> setIcon(R.drawable.cloud_download_24px)
        }
        setOnPreferenceClickListener {
            if (installed == null) showDownload(catalog!!) else showInstalled(installed, active)
            true
        }
    }

    private fun modelSummary(ctx: Context, catalog: CatalogModel?, installed: InstalledModel?, active: Boolean): String {
        val lines = ArrayList<String>()
        val bytes = catalog?.bytes ?: installed!!.bytes
        val ramMb = catalog?.approxRamMb ?: (bytes * 13 / 10 / (1024 * 1024) + 60).toInt()
        lines += ctx.getString(R.string.pref_voice_model_requirements, Formatter.formatShortFileSize(ctx, bytes), ramMb)
        when {
            catalog == VoiceModelCatalog.recommended -> lines += ctx.getString(R.string.pref_voice_model_recommended)
            catalog?.size == ModelSize.TINY -> lines += ctx.getString(R.string.pref_voice_model_fastest)
            catalog?.size == ModelSize.SMALL || (catalog == null && installed!!.header.size !in
                setOf(ModelSize.TINY, ModelSize.BASE)) -> lines += ctx.getString(R.string.pref_voice_model_slow)
        }
        if (catalog == null) lines += ctx.getString(R.string.pref_voice_model_not_tuned)
        lines += ctx.getString(when {
            active -> R.string.pref_voice_model_active
            installed != null -> R.string.pref_voice_model_installed
            else -> R.string.pref_voice_model_not_installed
        })
        return lines.joinToString("\n")
    }

    private fun refreshLanguage(active: InstalledModel?) {
        val ctx = context ?: return
        val pref = findPreference<ListPreference>(VOICE_SEARCH_LANGUAGE) ?: return
        val locale = Locale.getDefault()
        val device = WhisperTuning.whisperLanguage(locale)
        val languages = WhisperTuning.LANGUAGES
            .map { it to displayLanguage(it, locale) }
            .sortedBy { it.second.lowercase(locale) }
        pref.entries = (listOf(
            device?.let { ctx.getString(R.string.pref_voice_language_device, displayLanguage(it, locale)) }
                ?: ctx.getString(R.string.pref_voice_language_device_unsupported),
            ctx.getString(R.string.pref_voice_language_auto),
        ) + languages.map { it.second }).toTypedArray()
        pref.entryValues = (listOf(WhisperTuning.LANGUAGE_DEVICE, WhisperTuning.LANGUAGE_AUTO) +
            languages.map { it.first }).toTypedArray()
        pref.value = LauncherPrefs.VOICE_SEARCH_LANGUAGE.get(ctx)
        val multilingual = active?.multilingual == true
        pref.isEnabled = multilingual
        pref.summaryProvider = null
        pref.summary = if (multilingual || active == null) pref.entry
            else ctx.getString(R.string.pref_voice_language_english_only)
        pref.setOnPreferenceChangeListener { p, value ->
            val list = p as ListPreference
            list.summary = list.entries[list.findIndexOfValue(value as String)]
            true
        }
    }

    private fun displayLanguage(code: String, locale: Locale): String {
        val tag = when (code) {
            "jw" -> "jv"
            else -> code
        }
        return Locale.forLanguageTag(tag).getDisplayLanguage(locale)
            .replaceFirstChar { if (it.isLowerCase()) it.titlecase(locale) else it.toString() }
    }

    private fun showDownload(model: CatalogModel) {
        val ctx = context ?: return
        AlertDialog.Builder(ctx)
            .setTitle(modelName(ctx, model, null))
            .setMessage(ctx.getString(R.string.pref_voice_download_message,
                Formatter.formatShortFileSize(ctx, model.bytes), model.approxRamMb))
            .setPositiveButton(R.string.pref_voice_download_action) { _, _ -> openUrl(model.downloadUrl) }
            .setNeutralButton(R.string.pref_voice_import_action) { _, _ -> pickModelFile() }
            .setNegativeButton(android.R.string.cancel, null)
            .show()
    }

    private fun showInstalled(model: InstalledModel, active: Boolean) {
        val ctx = context ?: return
        val builder = AlertDialog.Builder(ctx)
            .setTitle(modelName(ctx, model.catalog, model))
            .setMessage(if (active) R.string.pref_voice_model_active else R.string.pref_voice_model_installed)
            .setNeutralButton(R.string.pref_voice_delete_action) { _, _ -> confirmDelete(model) }
            .setNegativeButton(android.R.string.cancel, null)
        if (!active) {
            builder.setPositiveButton(R.string.pref_voice_use_action) { _, _ ->
                LauncherPrefs.get(ctx).put(LauncherPrefs.VOICE_SEARCH_MODEL, model.id)
                refreshModels()
            }
        }
        builder.show()
    }

    private fun confirmDelete(model: InstalledModel) {
        val ctx = context ?: return
        AlertDialog.Builder(ctx)
            .setTitle(R.string.pref_voice_delete_title)
            .setMessage(ctx.getString(R.string.pref_voice_delete_message, modelName(ctx, model.catalog, model)))
            .setPositiveButton(R.string.pref_voice_delete_action) { _, _ ->
                if (!VoiceSearch.store(ctx).delete(model.id)) {
                    Toast.makeText(ctx, R.string.pref_voice_delete_failed, Toast.LENGTH_SHORT).show()
                }
                refreshModels()
            }
            .setNegativeButton(android.R.string.cancel, null)
            .show()
    }

    private fun pickModelFile() {
        try {
            importModel.launch(ANY_FILE_TYPE)
        } catch (e: ActivityNotFoundException) {
            Log.w(TAG, "No document picker", e)
            Toast.makeText(requireContext(), R.string.activity_not_found, Toast.LENGTH_SHORT).show()
        }
    }

    private fun startImport(uri: Uri) {
        val ctx = requireContext()
        val app = ctx.applicationContext
        val resolver = app.contentResolver
        val size = try {
            resolver.query(uri, arrayOf(OpenableColumns.SIZE), null, null, null)?.use { c ->
                if (c.moveToFirst() && !c.isNull(0)) c.getLong(0) else -1L
            } ?: -1L
        } catch (e: Exception) {
            -1L
        }
        val cancelled = AtomicBoolean(false)
        val progress = ProgressBar(ctx, null, android.R.attr.progressBarStyleHorizontal).apply {
            isIndeterminate = size <= 0
            max = 1000
            val pad = (24 * resources.displayMetrics.density).toInt()
            setPadding(pad, pad / 2, pad, 0)
        }
        importCancel = cancelled
        importDialog = AlertDialog.Builder(ctx)
            .setTitle(R.string.pref_voice_import_progress)
            .setView(progress)
            .setCancelable(false)
            .setNegativeButton(android.R.string.cancel) { _, _ -> cancelled.set(true) }
            .show()

        val store = VoiceSearch.store(app)
        Thread({
            var shown = -1
            val result = try {
                resolver.openInputStream(uri)?.use { input ->
                    store.import(input, size, onProgress = { copied ->
                        val permille = if (size > 0) (copied * 1000 / size).toInt() else 0
                        if (permille != shown) {
                            shown = permille
                            MAIN_EXECUTOR.execute { progress.progress = permille }
                        }
                    }, isCancelled = cancelled::get)
                } ?: ImportResult.Failed(ImportError.IO)
            } catch (e: Exception) {
                Log.w(TAG, "Model import failed", e)
                ImportResult.Failed(ImportError.IO)
            }
            MAIN_EXECUTOR.execute { onImportFinished(uri, result) }
        }, "MurineVoiceImport").start()
    }

    private fun onImportFinished(source: Uri, result: ImportResult) {
        importDialog?.dismiss()
        importDialog = null
        importCancel = null
        val ctx = context ?: return
        when (result) {
            is ImportResult.Installed -> {
                LauncherPrefs.get(ctx).put(LauncherPrefs.VOICE_SEARCH_MODEL, result.model.id)
                refreshModels()
                Toast.makeText(ctx, R.string.pref_voice_import_done, Toast.LENGTH_SHORT).show()
                offerSourceDeletion(source)
            }
            is ImportResult.Failed -> {
                if (result.error == ImportError.CANCELLED) return
                AlertDialog.Builder(ctx)
                    .setTitle(R.string.pref_voice_import_failed)
                    .setMessage(when (result.error) {
                        ImportError.TOO_LARGE -> R.string.pref_voice_import_error_size
                        ImportError.NO_SPACE -> R.string.pref_voice_import_error_space
                        ImportError.NOT_A_MODEL -> R.string.pref_voice_import_error_format
                        ImportError.CORRUPT -> R.string.pref_voice_import_error_corrupt
                        ImportError.IO, ImportError.CANCELLED -> R.string.pref_voice_import_error_io
                    })
                    .setPositiveButton(android.R.string.ok, null)
                    .show()
            }
        }
    }

    private fun offerSourceDeletion(source: Uri) {
        val ctx = context ?: return
        val resolver = ctx.contentResolver
        val deletable = try {
            DocumentsContract.isDocumentUri(ctx, source) &&
                resolver.query(source, arrayOf(DocumentsContract.Document.COLUMN_FLAGS), null, null, null)?.use { c ->
                    c.moveToFirst() && c.getInt(0) and DocumentsContract.Document.FLAG_SUPPORTS_DELETE != 0
                } == true
        } catch (e: Exception) {
            false
        }
        if (!deletable) return
        AlertDialog.Builder(ctx)
            .setTitle(R.string.pref_voice_delete_download_title)
            .setMessage(R.string.pref_voice_delete_download_message)
            .setPositiveButton(R.string.pref_voice_delete_action) { _, _ ->
                Thread({
                    try {
                        DocumentsContract.deleteDocument(resolver, source)
                    } catch (e: Exception) {
                        Log.w(TAG, "Could not delete the downloaded model", e)
                    }
                }, "MurineVoiceCleanup").start()
            }
            .setNegativeButton(R.string.pref_voice_keep_action, null)
            .show()
    }

    private fun showLicenses() {
        val ctx = context ?: return
        val whisper = ctx.resources.openRawResource(R.raw.whisper_cpp_license).bufferedReader().use { it.readText() }
        AlertDialog.Builder(ctx)
            .setTitle(R.string.pref_voice_licenses_title)
            .setMessage(ctx.getString(R.string.pref_voice_licenses_message) + "\n\n" + whisper)
            .setPositiveButton(android.R.string.ok, null)
            .setNeutralButton(R.string.pref_voice_model_license_action) { _, _ -> openUrl(VoiceModelCatalog.LICENSE_PAGE) }
            .show()
    }

    private fun openUrl(url: String) {
        try {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(url)))
        } catch (e: ActivityNotFoundException) {
            Log.w(TAG, "No browser", e)
            Toast.makeText(requireContext(), R.string.activity_not_found, Toast.LENGTH_SHORT).show()
        }
    }
}
