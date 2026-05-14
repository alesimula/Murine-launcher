package app.murinelauncher.widget.appinfo

import android.content.ClipData
import android.content.ClipboardManager
import android.content.Context
import android.view.ContextThemeWrapper
import android.content.pm.ApplicationInfo
import android.content.pm.LauncherApps
import android.content.pm.PackageInfo
import android.content.pm.PackageManager
import android.os.Bundle
import android.os.Process
import android.os.UserHandle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.content.pm.PackageInfoCompat
import androidx.core.content.res.ResourcesCompat
import androidx.preference.EditTextPreference
import androidx.preference.Preference
import androidx.preference.PreferenceGroupAdapter
import androidx.preference.PreferenceScreen
import androidx.recyclerview.widget.RecyclerView
import app.lawnchair.icons.getCustomInstanceLabelForId
import app.lawnchair.icons.getCustomLabelForKey
import app.lawnchair.icons.setCustomInstanceLabelForId
import app.lawnchair.icons.setCustomLabelForKey
import app.murinelauncher.icons.IconPackManager
import app.murinelauncher.icons.IconPackManager.IconPackInfo
import app.murinelauncher.widget.radio.RadioGroupBottomSheet
import com.android.launcher3.LauncherAppState
import com.android.launcher3.R
import com.android.launcher3.Utilities
import com.android.settingslib.widget.SettingsBasePreferenceFragment
import java.io.File
import java.text.DateFormat
import java.util.Date

/**
 * PreferenceFragment displayed inside [AppInfoBottomSheet];
 * Loads entries from [R.xml.app_info_prefs] and populates summaries at runtime.
 */
class AppInfoPreferenceFragment : SettingsBasePreferenceFragment() {

    private var componentKey: String? = null
    private var packageName: String? = null
    private var labelKey: String? = null
    private var instanceId: Int = -1
    private var themedContext: Context? = null
    private var editLabelPref: EditTextPreference? = null
    private var originalLabel: CharSequence = ""

    var onLabelEdited: ((CharSequence) -> Unit)? = null

    override fun getContext(): Context? {
        val base = super.getContext() ?: return null
        return themedContext ?: ContextThemeWrapper(base, R.style.HomeSettings_Theme).also {
            themedContext = it
        }
    }

    override fun onDetach() {
        super.onDetach()
        themedContext = null
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        requireActivity().theme.applyStyle(R.style.HomeSettings_Theme, true)
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        val view = super.onCreateView(inflater, container, savedInstanceState)
        listView?.overScrollMode = View.OVER_SCROLL_NEVER
        setupLongClickCopy()
        return view
    }

    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        setPreferencesFromResource(R.xml.app_info_prefs, rootKey)

        val args = arguments ?: return
        componentKey = args.getString(ARG_COMPONENT_KEY)
        packageName = args.getString(ARG_PACKAGE_NAME)
        labelKey = args.getString(ARG_LABEL_KEY)
        instanceId = args.getInt(ARG_INSTANCE_ID, -1)
        originalLabel = args.getString(ARG_ORIGINAL_LABEL) ?: ""
        val pkg = packageName ?: return
        val ctx = requireContext()
        val pm = ctx.packageManager
        val userHandle: UserHandle = args.getParcelable(ARG_USER_HANDLE) ?: Process.myUserHandle()
        val isCrossProfile = userHandle != Process.myUserHandle()

        var packageInfo: PackageInfo? = null
        var crossProfileAppInfo: ApplicationInfo? = null
        if (isCrossProfile) {
            val launcherApps = ctx.getSystemService(Context.LAUNCHER_APPS_SERVICE) as? LauncherApps
            crossProfileAppInfo = try { launcherApps?.getApplicationInfo(pkg, 0, userHandle) } catch (_: Exception) { null }
            // Too expensive, better to only show versionCode
            /*if (crossProfileAppInfo?.sourceDir != null) packageInfo = try {
                    pm.getPackageArchiveInfo(crossProfileAppInfo.sourceDir!!, 0)
            } catch (_: Exception) { null }*/
        }
        else try { packageInfo = pm.getPackageInfo(pkg, 0) } catch (_: PackageManager.NameNotFoundException) {}

        val screen = preferenceScreen

        // Package
        screen.findPreference<Preference>(KEY_PACKAGE)?.summary = pkg

        // Version
        val versionPref = screen.findPreference<Preference>(KEY_VERSION)
        if (packageInfo?.versionName != null) {
            versionPref?.summary = ctx.getString(R.string.app_info_version_value,
                    packageInfo.versionName, PackageInfoCompat.getLongVersionCode(packageInfo))
        } else if (isCrossProfile && crossProfileAppInfo != null) {
            versionPref?.title = "${versionPref.title} (#)"
            versionPref?.summary = try {
                if (Utilities.ATLEAST_P) { crossProfileAppInfo.longVersionCode.toString() } else
                    crossProfileAppInfo.versionCode.toString()
            } catch (_: Throwable) {
                removePref(screen, KEY_VERSION); null
            }
        } else removePref(screen, KEY_VERSION)

        // Last update
        val updatePref = screen.findPreference<Preference>(KEY_LAST_UPDATE)
        val lastUpdateTime = if (!isCrossProfile) packageInfo?.lastUpdateTime ?: 0 else
            crossProfileAppInfo?.sourceDir?.let { File(it) }?.lastModified() ?: 0
        if (lastUpdateTime > 0) updatePref?.summary = DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.SHORT)
            .format(Date(lastUpdateTime))

        // Source
        val sourceLabel = resolveSourceLabel(ctx, pm, isCrossProfile, crossProfileAppInfo, packageInfo, pkg)
        val sourcePref = screen.findPreference<Preference>(KEY_SOURCE)
        if (sourceLabel != null) sourcePref?.summary = sourceLabel
        else removePref(screen, KEY_SOURCE)

        // Icon pack
        setupIconPackPreference(ctx, screen)
        // Edit label
        setupEditLabelPreference(ctx, screen)
    }

    private fun setupEditLabelPreference(ctx: Context, screen: PreferenceScreen) {
        val pref = screen.findPreference<EditTextPreference>(KEY_EDIT_LABEL) ?: return
        editLabelPref = pref
        val lk = labelKey ?: return

        pref.setOnBindEditTextListener { editText -> editText.hint = originalLabel.toString() }
        pref.setOnPreferenceChangeListener { _, newValue ->
            val newLabel = (newValue as? String)?.trim() ?: ""
            if (newLabel.isEmpty() || newLabel == originalLabel.toString()) {
                if (instanceId >= 0) setCustomInstanceLabelForId(instanceId, null)
                else setCustomLabelForKey(lk, null)
                onLabelEdited?.invoke(originalLabel)
            } else {
                if (instanceId >= 0) setCustomInstanceLabelForId(instanceId, newLabel)
                else setCustomLabelForKey(lk, newLabel)
                onLabelEdited?.invoke(newLabel)
            }
            val pkg = packageName ?: return@setOnPreferenceChangeListener true
            val appState = LauncherAppState.getInstance(ctx)
            appState.model.onAppIconChanged(pkg, Process.myUserHandle())
            true
        }
    }

    fun showEditLabel() {
        val pref = editLabelPref ?: return
        val lk = labelKey ?: return
        val customLabel = if (instanceId >= 0) getCustomInstanceLabelForId(instanceId) else getCustomLabelForKey(lk)
        pref.text = customLabel ?: ""
        pref.performClick()
    }

    private lateinit var entries: List<IconPackInfo>
    private var iconPackPref: Preference? = null

    private fun setupIconPackPreference(ctx: Context, screen: PreferenceScreen) {
        val compKey = componentKey ?: return
        val pkg = packageName ?: return
        val pref = screen.findPreference<Preference>(KEY_ICON_PACK) ?: return
        iconPackPref = pref

        entries = IconPackManager.buildIconPackEntries(ctx, compKey)
        updateIconPackSummary(ctx, compKey)

        pref.setOnPreferenceClickListener {
            showFilterableIconPackSheet(ctx, compKey, pkg)
            true
        }
    }

    private fun updateIconPackSummary(ctx: Context, compKey: String) {
        val override = IconPackManager.getComponentOverride(ctx, compKey)
        iconPackPref?.summary = when {
            override == null -> ctx.getString(R.string.app_info_icon_pack_default)
            override == IconPackManager.SYSTEM_ICON_PACK -> IconPackManager.SYSTEM_ICON_PACK_INFO.label
            else -> entries.firstOrNull { it.packageName == override }?.label ?: override
        }
    }

    private fun showFilterableIconPackSheet(ctx: Context, compKey: String, pkg: String) {
        val fm = parentFragmentManager

        fm.findFragmentByTag(RadioGroupBottomSheet.TAG)?.let {
            fm.beginTransaction().remove(it).commitAllowingStateLoss()
            fm.executePendingTransactions()
        }

        val currentOverride = IconPackManager.getComponentOverride(ctx, compKey)
        val currentIdx = if (currentOverride == null) 0 else {
            val idx = entries.indexOfFirst { it.packageName == currentOverride }
            if (idx >= 0) idx else 0
        }

        val hasIcon = BooleanArray(entries.size) { i ->
            IconPackManager.isPackVisibleForComponent(ctx, entries[i], compKey)
        }

        val sheet = FilterableIconPackSheet()
        sheet.configure(
            title = ctx.getString(R.string.pref_category_icon_pack_title),
            entryCount = entries.size,
            iconPosition = RadioGroupBottomSheet.IconPosition.START,
            currentIndex = currentIdx,
            textProvider = { i -> entries[i].label },
            iconProvider = { i ->
                val p = entries[i].packageName
                if (p == IconPackManager.ICON_PACK_DEFAULT_GLOBAL)
                    ResourcesCompat.getDrawable(resources, R.drawable.ic_app_info_icon_pack, ctx.theme)
                else IconPackManager.getPackIcon(ctx, p)
            },
            iconTint = null,
            isVisibleProvider = { i -> sheet.showAll || hasIcon[i] },
            listener = RadioGroupBottomSheet.OnItemSelectedListener { index ->
                val selected = entries[index]
                if (selected.packageName == IconPackManager.ICON_PACK_DEFAULT_GLOBAL) {
                    IconPackManager.resetComponentOverride(ctx, compKey)
                } else {
                    IconPackManager.setComponentOverride(ctx, compKey, selected.packageName)
                }
                updateIconPackSummary(ctx, compKey)
                refreshIconForPackage(ctx, pkg)
            }
        )
        sheet.show(fm, RadioGroupBottomSheet.TAG)
    }

    private fun refreshIconForPackage(context: Context, packageName: String) {
        //IconPackManager.clearMainCache()
        val appState = LauncherAppState.getInstance(context)
        appState.model.onAppIconChanged(packageName, Process.myUserHandle())
    }

    private fun resolveSourceLabel(
        context: Context, pm: PackageManager,
        isCrossProfile: Boolean, crossProfileAppInfo: ApplicationInfo?,
        packageInfo: PackageInfo?, packageName: String
    ): String? {
        if (isCrossProfile) {
            val appInfo = crossProfileAppInfo ?: return null
            val isSystem = (appInfo.flags and ApplicationInfo.FLAG_SYSTEM) != 0
            // Could also use context.getString(R.string.package_state_unknown) as fallback
            return if (isSystem) context.getString(R.string.app_info_source_system) else null
        }
        else return try {
            val installer = pm.getInstallerPackageName(packageName)
            if (installer != null) {
                try { pm.getApplicationInfo(installer, 0).let { pm.getApplicationLabel(it).toString() } }
                catch (_: PackageManager.NameNotFoundException) { installer }
            } else {
                val isSystem = (packageInfo!!.applicationInfo!!.flags and ApplicationInfo.FLAG_SYSTEM) != 0
                if (isSystem) context.getString(R.string.app_info_source_system) else null
            }
        } catch (_: Exception) { null }
    }

    private fun removePref(screen: PreferenceScreen, key: String) {
        screen.findPreference<Preference>(key)?.let { screen.removePreference(it) }
    }

    private fun copyToClipboard(ctx: Context, label: CharSequence?, text: CharSequence?) {
        val clipboard = ctx.getSystemService(Context.CLIPBOARD_SERVICE) as ClipboardManager
        clipboard.setPrimaryClip(ClipData.newPlainText(label, text))
        Toast.makeText(ctx, R.string.app_info_copied_toast, Toast.LENGTH_SHORT).show()
    }

    @Suppress("RestrictedApi")
    private fun setupLongClickCopy() {
        val rv = listView ?: return
        rv.addOnChildAttachStateChangeListener(object : RecyclerView.OnChildAttachStateChangeListener {
            override fun onChildViewAttachedToWindow(child: View) {
                val holder = rv.getChildViewHolder(child) ?: return
                val position = holder.bindingAdapterPosition
                if (position == RecyclerView.NO_POSITION) return
                val adapter = rv.adapter as? PreferenceGroupAdapter ?: return
                val pref = adapter.getItem(position) ?: return
                if (pref.key in COPYABLE_KEYS) {
                    child.isLongClickable = true
                    child.setOnLongClickListener {
                        copyToClipboard(requireContext(), pref.title, pref.summary)
                        true
                    }
                }
            }
            override fun onChildViewDetachedFromWindow(child: View) {}
        })
    }

    companion object {
        const val TAG = "AppInfoPrefs"
        private const val ARG_COMPONENT_KEY = "component_key"
        private const val ARG_PACKAGE_NAME = "package_name"
        private const val ARG_LABEL_KEY = "label_key"
        private const val ARG_INSTANCE_ID = "instance_id"
        private const val ARG_ORIGINAL_LABEL = "original_label"
        private const val ARG_USER_HANDLE = "user_handle"
        private const val KEY_PACKAGE = "pref_app_info_package"
        private const val KEY_VERSION = "pref_app_info_version"
        private const val KEY_LAST_UPDATE = "pref_app_info_last_update"
        private const val KEY_SOURCE = "pref_app_info_source"
        private const val KEY_ICON_PACK = "pref_app_info_icon_pack"
        private const val KEY_EDIT_LABEL = "pref_app_info_edit_label"

        private val COPYABLE_KEYS = setOf(KEY_PACKAGE, KEY_VERSION, KEY_LAST_UPDATE, KEY_SOURCE)

        fun newInstance(componentKey: String, packageName: String, labelKey: String, originalLabel: String, instanceId: Int = -1, userHandle: UserHandle = Process.myUserHandle()): AppInfoPreferenceFragment {
            return AppInfoPreferenceFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_COMPONENT_KEY, componentKey)
                    putString(ARG_PACKAGE_NAME, packageName)
                    putString(ARG_LABEL_KEY, labelKey)
                    putString(ARG_ORIGINAL_LABEL, originalLabel)
                    putInt(ARG_INSTANCE_ID, instanceId)
                    putParcelable(ARG_USER_HANDLE, userHandle)
                }
            }
        }
    }
}
