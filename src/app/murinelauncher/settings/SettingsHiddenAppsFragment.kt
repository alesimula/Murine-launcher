package app.murinelauncher.settings

import android.content.pm.LauncherApps
import android.os.Bundle
import android.os.Process
import android.text.Editable
import android.text.TextWatcher
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import androidx.preference.Preference
import androidx.preference.SwitchPreferenceCompat
import app.murinelauncher.settings.hiddenapps.AppLock
import app.murinelauncher.settings.hiddenapps.HiddenAppPreference
import app.murinelauncher.settings.hiddenapps.HiddenAppsRepository
import app.murinelauncher.settings.common.AbstractSettingsFragment
import com.android.launcher3.LauncherAppState
import com.android.launcher3.R
import com.android.launcher3.icons.cache.CacheLookupFlag
import com.android.launcher3.model.data.AppInfo
import com.android.launcher3.util.DisplayController
import com.android.launcher3.util.Executors
import com.google.android.material.appbar.AppBarLayout

class SettingsHiddenAppsFragment : AbstractSettingsFragment() {

    companion object {
        /** Murine Launcher will always be hidden from itself **/
        const val HIDE_SELF = true

        /** Tab shown but not usable, e.g. App Lock without the LOCK_APPS permission. */
        private const val DISABLED_TAB_ALPHA = 0.4f
    }

    private var hiddenComponents: MutableSet<String> = mutableSetOf()
    private var dirty = false
    private var currentTab = 0
    private var searchQuery = ""
    private var tabAll: Button? = null
    private var tabHidden: Button? = null
    private var tabLocked: Button? = null
    private var pendingLockPackage: String? = null

    override fun getPreferenceScreenResId() = R.xml.murine_prefs_hidden_apps

    override fun getPreferenceTitle(): Int =
        if (AppLock.hasApi) R.string.pref_category_hidden_locked_apps_title
        else R.string.pref_category_hidden_apps_title

    override fun initPreference(preference: Preference, info: DisplayController.Info) = true

    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        super.onCreatePreferences(savedInstanceState, rootKey)
        hiddenComponents = HiddenAppsRepository.getHiddenComponents(requireContext()).toMutableSet()
        addSearchHiddenToggle()
        loadApps()
    }

    /**
     * Toggle card for enabling the "search hidden apps" option
     */
    private fun addSearchHiddenToggle() {
        val ctx = requireContext()
        val toggle = SwitchPreferenceCompat(ctx).apply {
            key = "search_within_hidden_apps"
            isPersistent = false
            order = -1000
            title = getString(R.string.pref_search_within_hidden_title)
            summary = getString(R.string.pref_search_within_hidden_summary)
            isChecked = HiddenAppsRepository.isSearchHiddenAppsEnabled(ctx)
            setOnPreferenceChangeListener { _, newValue ->
                HiddenAppsRepository.setSearchHiddenAppsEnabled(ctx, newValue as Boolean)
                LauncherAppState.getInstance(ctx).model.forceReload()
                true
            }
        }
        preferenceScreen.addPreference(toggle)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        val prefView = super.onCreateView(inflater, container, savedInstanceState)
        val header = inflater.inflate(R.layout.hidden_apps_header, null, false)
        tabAll = header.findViewById<Button>(R.id.filter_all).apply {
            text = getString(R.string.all_apps_label)
            isSelected = true
        }
        tabHidden = header.findViewById<Button>(R.id.filter_hidden).apply {
            text = getString(R.string.hidden_apps_label)
            isSelected = false
        }
        // Shown whenever the framework has the API, but greyed out without the LOCK_APPS permission
        tabLocked = header.findViewById<Button>(R.id.filter_locked).apply {
            text = getString(R.string.locked_apps_label)
            isSelected = false
            visibility = if (AppLock.hasApi) View.VISIBLE else View.GONE
            isEnabled = AppLock.isAvailable(context)
            alpha = if (isEnabled) 1f else DISABLED_TAB_ALPHA
        }

        val wrapper = LinearLayout(requireContext()).apply {
            orientation = LinearLayout.VERTICAL
            layoutParams = ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT
            )
        }
        wrapper.addView(header)
        wrapper.addView(prefView, LinearLayout.LayoutParams(
            ViewGroup.LayoutParams.MATCH_PARENT, 0, 1f
        ))

        return wrapper
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<EditText>(R.id.search_bar)?.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable?) {
                searchQuery = s?.toString().orEmpty()
                applyFilter()
            }
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {}
        })

        view.findViewById<EditText>(R.id.search_bar)?.setOnFocusChangeListener { _, hasFocus ->
            if (hasFocus) activity?.findViewById<AppBarLayout>(R.id.app_bar)?.setExpanded(false, true)
        }

        tabAll?.setOnClickListener { selectTab(0) }
        tabHidden?.setOnClickListener { selectTab(1) }
        tabLocked?.setOnClickListener { selectTab(2) }
    }

    private fun loadApps() {
        val ctx = requireContext()
        val screen = preferenceScreen
        val launcherApps = ctx.getSystemService(LauncherApps::class.java)
        val activities = launcherApps.getActivityList(null, Process.myUserHandle())
        val selfPackage = ctx.packageName
        val iconCache = LauncherAppState.getInstance(ctx).iconCache

        val filtered = activities
            .filter { !HIDE_SELF || it.componentName.packageName != selfPackage }

        // Master gate: check if querying/setting/unsetting app lock is supported
        val appLockAvailable = AppLock.isAvailable(ctx)

        Executors.MODEL_EXECUTOR.execute {
            // Per-app gate: the system marks exempt apps as unsupported
            val lockable = if (appLockAvailable) {
                filtered.filter { AppLock.isSupported(it.applicationInfo) }
                    .mapTo(hashSetOf()) { it.componentName.flattenToString() }
            } else emptySet()
            val locked = if (appLockAvailable) {
                filtered.filter { AppLock.isLocked(it.applicationInfo) }
                    .mapTo(hashSetOf()) { it.componentName.flattenToString() }
            } else emptySet()
            val results = filtered.map { info ->
                val appInfo = AppInfo(ctx, info, info.user)
                iconCache.getTitleAndIcon(appInfo, info, CacheLookupFlag.DEFAULT_LOOKUP_FLAG)
                Triple(info.componentName.flattenToString(), appInfo.title ?: info.label ?: info.componentName.shortClassName, appInfo.bitmap.newIcon(ctx))
            }.sortedBy { it.second.toString().lowercase() } // Cached titles: no label loads, off the main thread
            Executors.MAIN_EXECUTOR.execute {
                if (!isAdded) return@execute
                results.forEach { (name, title, icon) ->
                    val pref = HiddenAppPreference(ctx).apply {
                        key = name
                        this.title = title
                        this.icon = icon
                        isAppHidden = hiddenComponents.contains(name)
                        isAppLocked = name in locked
                        if (name in lockable) {
                            onLockClick = {
                                pendingLockPackage = name.substringBefore('/').also { pkg ->
                                    AppLock.requestSetAppLock(ctx, pkg)
                                }
                            }
                        }
                        setOnPreferenceClickListener {
                            // Protected tab: the row toggles the lock instead of the visibility.
                            if (lockedMode) {
                                onLockClick?.invoke()
                            } else {
                                val wasHidden = hiddenComponents.contains(name)
                                if (wasHidden) hiddenComponents.remove(name) else hiddenComponents.add(name)
                                isAppHidden = !wasHidden
                                dirty = true
                                applyFilter()
                            }
                            true
                        }
                    }
                    screen.addPreference(pref)
                }
                applyFilter()
            }
        }
    }

    private fun selectTab(tab: Int) {
        currentTab = tab
        tabAll?.isSelected = tab == 0
        tabHidden?.isSelected = tab == 1
        tabLocked?.isSelected = tab == 2
        applyFilter()
    }

    private fun applyFilter() {
        val screen = preferenceScreen ?: return
        screen.findPreference<Preference>("search_within_hidden_apps")?.isVisible = currentTab != 2
        for (i in 0 until screen.preferenceCount) {
            val pref = screen.getPreference(i) as? HiddenAppPreference ?: continue
            pref.lockedMode = currentTab == 2
            val matchesTab = when (currentTab) {
                1 -> pref.isAppHidden
                2 -> pref.isAppLocked
                else -> true
            }
            val matchesSearch = searchQuery.isEmpty() ||
                pref.title?.toString()?.contains(searchQuery, ignoreCase = true) == true
            pref.isVisible = matchesTab && matchesSearch
        }
    }

    override fun onResume() {
        super.onResume()
        // Re-read lock state after returning from the system lock/unlock dialog (if necessary)
        val ctx = context ?: return
        val screen = preferenceScreen ?: return
        // Coming back from the lock dialog only that app can have changed
        val pkg = pendingLockPackage
        pendingLockPackage = null
        var changed = false
        for (i in 0 until screen.preferenceCount) {
            val pref = screen.getPreference(i) as? HiddenAppPreference ?: continue
            if (pref.onLockClick == null) continue
            val appPkg = pref.key.substringBefore('/')
            if (pkg != null && appPkg != pkg) continue
            val locked = AppLock.isLocked(ctx, appPkg)
            if (pref.isAppLocked == locked) continue
            pref.isAppLocked = locked
            changed = true
        }
        // Lock state feeds the Protected tab's filter, so rows must be re-evaluated too.
        if (changed) applyFilter()
    }

    override fun onPause() {
        super.onPause()
        if (dirty) {
            val ctx = requireContext()
            HiddenAppsRepository.setHiddenComponents(ctx, hiddenComponents)
            LauncherAppState.getInstance(ctx).model.forceReload()
            dirty = false
        }
    }
}