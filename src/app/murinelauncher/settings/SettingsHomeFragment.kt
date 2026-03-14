package app.murinelauncher.settings

import android.accessibilityservice.AccessibilityService
import android.app.admin.DevicePolicyManager
import android.content.ComponentName
import android.content.Context
import android.content.Intent
import android.content.pm.ActivityInfo
import android.os.Build
import android.provider.Settings
import android.text.TextUtils
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.preference.Preference
import androidx.preference.SwitchPreferenceCompat
import app.murinelauncher.receiver.ScreenOffAdminReceiver
import app.murinelauncher.service.MurineAccessibilityService
import app.murinelauncher.settings.common.AbstractSettingsFragment
import com.android.launcher3.Flags
import com.android.launcher3.InvariantDeviceProfile
import com.android.launcher3.LauncherPrefs
import com.android.launcher3.R
import com.android.launcher3.Utilities
import com.android.launcher3.states.RotationHelper
import com.android.launcher3.util.DisplayController

public final class SettingsHomeFragment: AbstractSettingsFragment() {

    companion object {
        const val FIXED_LANDSCAPE_MODE: String = "pref_fixed_landscape_mode"
        const val GRID_SIZE_WIDTH: String = "pref_grid_size_width"
        const val GRID_SIZE_HEIGHT: String = "pref_grid_size_height"
        const val DOUBLE_TAP_TO_SLEEP: String = "pref_double_tap_to_sleep"
        const val SWIPE_DOWN_NOTIFICATIONS: String = "pref_swipe_down_notifications"
        private const val REQUEST_DEVICE_ADMIN = 1001

        @JvmStatic @RequiresApi(Build.VERSION_CODES.P)
        fun requestAccessibilityPermission(context: Context): Boolean {
            if (!Private.isAccessibilityServiceEnabled(context, MurineAccessibilityService::class.java)) {
                val intent = Intent(Settings.ACTION_ACCESSIBILITY_SETTINGS).apply {
                    val componentName = ComponentName(context, MurineAccessibilityService::class.java).flattenToString()
                    putExtra(":settings:fragment_args_key", componentName)
                    putExtra(":settings:show_fragment_args_key", componentName)
                    putExtra("android.intent.extra.COMPONENT_NAME", componentName)
                }
                context.startActivity(intent)
                Toast.makeText(context, context.resources.getString(R.string.pref_accessibility_request_toast), Toast.LENGTH_LONG).show()
                return false
            }
            return true;
        }
    }

    override fun getPreferenceScreenResId() = R.xml.murine_prefs_home

    override fun getPreferenceTitle(): Int? = R.string.pref_category_home_title

    override fun initPreference(preference: Preference, info: DisplayController.Info): Boolean {
        var isTablet = InvariantDeviceProfile.INSTANCE.get(requireContext()).deviceType == InvariantDeviceProfile.TYPE_TABLET;
        when (preference.key) {
            RotationHelper.ALLOW_ROTATION_PREFERENCE_KEY -> {
                if (Flags.oneGridSpecs()) {
                    return false
                }
                if (info.isTablet(info.realBounds)) {
                    // Launcher supports rotation by default. No need to show this setting.
                    return false
                }
                // Initialize the UI once
                preference.setDefaultValue(RotationHelper.getAllowRotationDefaultValue(info))
                return true
            }
            FIXED_LANDSCAPE_MODE -> {
                if (!Flags.oneGridSpecs() // adding this condition until fixing b/378972567
                    || (InvariantDeviceProfile.INSTANCE.get(getContext()).deviceType
                            == InvariantDeviceProfile.TYPE_MULTI_DISPLAY) || (InvariantDeviceProfile.INSTANCE.get(
                        getContext()
                    ).deviceType
                            == InvariantDeviceProfile.TYPE_TABLET)
                ) {
                    return false
                }
                // When the setting changes rotate the screen accordingly to showcase the result
                // of the setting
                preference.setOnPreferenceChangeListener(
                    Preference.OnPreferenceChangeListener { pref: Preference?, newValue: Any? ->
                        requireActivity().setRequestedOrientation(
                            if (newValue as Boolean)
                                ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE
                            else
                                ActivityInfo.SCREEN_ORIENTATION_USER
                        )
                        true
                    }
                )
                return !info.isTablet(info.realBounds)
            }
            GRID_SIZE_WIDTH -> {
                preference.setDefaultValue(LauncherPrefs.defaultGridWidth(isTablet))
                return true
            }
            GRID_SIZE_HEIGHT -> {
                preference.setDefaultValue(LauncherPrefs.defaultGridHeight(isTablet))
                return true
            }
            DOUBLE_TAP_TO_SLEEP -> {
                preference.setOnPreferenceChangeListener { _, newValue ->
                    if (newValue as Boolean && Utilities.ATLEAST_P) {
                        // Check if our specific Accessibility Service is active
                        return@setOnPreferenceChangeListener requestAccessibilityPermission(requireContext())
                    }
                    else if (newValue) {
                        val dpm = requireContext().getSystemService(DevicePolicyManager::class.java)
                        val admin = ComponentName(requireContext(), ScreenOffAdminReceiver::class.java)
                        if (dpm != null && !dpm.isAdminActive(admin)) {
                            val intent = Intent(DevicePolicyManager.ACTION_ADD_DEVICE_ADMIN).apply {
                                putExtra(DevicePolicyManager.EXTRA_DEVICE_ADMIN, admin)
                            }
                            startActivityForResult(intent, REQUEST_DEVICE_ADMIN)
                            return@setOnPreferenceChangeListener false
                        }
                    }
                    true
                }
                return true
            }
            SWIPE_DOWN_NOTIFICATIONS -> return true
            else -> return true
        }
    }

    @Deprecated("Deprecated in Java")
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == REQUEST_DEVICE_ADMIN) {
            val dpm = requireContext().getSystemService(DevicePolicyManager::class.java)
            val admin = ComponentName(requireContext(), ScreenOffAdminReceiver::class.java)
            val granted = dpm?.isAdminActive(admin) == true
            findPreference<SwitchPreferenceCompat>(DOUBLE_TAP_TO_SLEEP)?.isChecked = granted
        }
    }

    private object Private {
        fun isAccessibilityServiceEnabled(context: Context, serviceClass: Class<out AccessibilityService>): Boolean {
            val expectedComponentName = ComponentName(context, serviceClass)
            val enabledServices = Settings.Secure.getString(
                context.contentResolver,
                Settings.Secure.ENABLED_ACCESSIBILITY_SERVICES
            ) ?: return false

            val colonSplitter = TextUtils.SimpleStringSplitter(':')
            colonSplitter.setString(enabledServices)

            while (colonSplitter.hasNext()) {
                val componentNameString = colonSplitter.next()
                val enabledService = ComponentName.unflattenFromString(componentNameString)
                if (enabledService != null && enabledService == expectedComponentName) {
                    return true
                }
            }
            return false
        }
    }
}