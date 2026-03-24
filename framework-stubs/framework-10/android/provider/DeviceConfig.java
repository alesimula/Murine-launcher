package android.provider;

@android.annotation.SystemApi
public final class DeviceConfig {
    public static final android.net.Uri CONTENT_URI = null;
    @android.annotation.SystemApi
    public static final java.lang.String NAMESPACE_ACTIVITY_MANAGER = "activity_manager";
    @android.annotation.SystemApi
    public static final java.lang.String NAMESPACE_ACTIVITY_MANAGER_NATIVE_BOOT = "activity_manager_native_boot";
    @android.annotation.SystemApi
    public static final java.lang.String NAMESPACE_APP_COMPAT = "app_compat";
    @android.annotation.SystemApi
    public static final java.lang.String NAMESPACE_ATTENTION_MANAGER_SERVICE = "attention_manager_service";
    @android.annotation.SystemApi
    public static final java.lang.String NAMESPACE_AUTOFILL = "autofill";
    @android.annotation.SystemApi
    public static final java.lang.String NAMESPACE_CONNECTIVITY = "connectivity";
    @android.annotation.SystemApi
    public static final java.lang.String NAMESPACE_CONTENT_CAPTURE = "content_capture";
    @android.annotation.SystemApi
    public static final java.lang.String NAMESPACE_DEX_BOOT = "dex_boot";
    public static final java.lang.String NAMESPACE_DISPLAY_MANAGER = "display_manager";
    @android.annotation.SystemApi
    public static final java.lang.String NAMESPACE_GAME_DRIVER = "game_driver";
    @android.annotation.SystemApi
    public static final java.lang.String NAMESPACE_INPUT_NATIVE_BOOT = "input_native_boot";
    @android.annotation.SystemApi
    public static final java.lang.String NAMESPACE_INTELLIGENCE_ATTENTION = "intelligence_attention";
    public static final java.lang.String NAMESPACE_INTELLIGENCE_CONTENT_SUGGESTIONS = "intelligence_content_suggestions";
    @android.annotation.SystemApi
    public static final java.lang.String NAMESPACE_MEDIA_NATIVE = "media_native";
    @android.annotation.SystemApi
    public static final java.lang.String NAMESPACE_NETD_NATIVE = "netd_native";
    @android.annotation.SystemApi
    public static final java.lang.String NAMESPACE_ROLLBACK = "rollback";
    @android.annotation.SystemApi
    public static final java.lang.String NAMESPACE_ROLLBACK_BOOT = "rollback_boot";
    @android.annotation.SystemApi
    public static final java.lang.String NAMESPACE_RUNTIME = "runtime";
    @android.annotation.SystemApi
    public static final java.lang.String NAMESPACE_RUNTIME_NATIVE = "runtime_native";
    @android.annotation.SystemApi
    public static final java.lang.String NAMESPACE_RUNTIME_NATIVE_BOOT = "runtime_native_boot";
    @android.annotation.SystemApi
    public static final java.lang.String NAMESPACE_SCHEDULER = "scheduler";
    @android.annotation.SystemApi
    public static final java.lang.String NAMESPACE_STORAGE = "storage";
    @android.annotation.SystemApi
    public static final java.lang.String NAMESPACE_SYSTEMUI = "systemui";
    @android.annotation.SystemApi
    public static final java.lang.String NAMESPACE_TELEPHONY = "telephony";
    @android.annotation.SystemApi
    public static final java.lang.String NAMESPACE_TEXTCLASSIFIER = "textclassifier";
    public static final java.lang.String NAMESPACE_CONTACTS_PROVIDER = "contacts_provider";
    public static final java.lang.String NAMESPACE_SETTINGS_UI = "settings_ui";
    public static final java.lang.String NAMESPACE_WINDOW_MANAGER = "android:window_manager";
    private static final java.util.List<java.lang.String> PUBLIC_NAMESPACES = null;
    @android.annotation.SystemApi
    public static final java.lang.String NAMESPACE_PRIVACY = "privacy";
    private static final java.lang.Object sLock = null;
    private static android.util.ArrayMap<android.provider.DeviceConfig.OnPropertyChangedListener, android.util.Pair<java.lang.String, java.util.concurrent.Executor>> sSingleListeners;
    private static android.util.ArrayMap<android.provider.DeviceConfig.OnPropertiesChangedListener, android.util.Pair<java.lang.String, java.util.concurrent.Executor>> sListeners;
    private static java.util.Map<java.lang.String, android.util.Pair<android.database.ContentObserver, java.lang.Integer>> sNamespaces;
    private static final java.lang.String TAG = "DeviceConfig";
    private DeviceConfig() {}
    @android.annotation.SystemApi
    public static java.lang.String getProperty(java.lang.String p0, java.lang.String p1) { return null; }
    @android.annotation.SystemApi
    public static java.lang.String getString(java.lang.String p0, java.lang.String p1, java.lang.String p2) { return null; }
    @android.annotation.SystemApi
    public static boolean getBoolean(java.lang.String p0, java.lang.String p1, boolean p2) { return false; }
    @android.annotation.SystemApi
    public static int getInt(java.lang.String p0, java.lang.String p1, int p2) { return 0; }
    @android.annotation.SystemApi
    public static long getLong(java.lang.String p0, java.lang.String p1, long p2) { return 0L; }
    @android.annotation.SystemApi
    public static float getFloat(java.lang.String p0, java.lang.String p1, float p2) { return 0.0f; }
    @android.annotation.SystemApi
    public static boolean setProperty(java.lang.String p0, java.lang.String p1, java.lang.String p2, boolean p3) { return false; }
    @android.annotation.SystemApi
    public static void resetToDefaults(int p0, java.lang.String p1) {}
    @android.annotation.SystemApi
    public static void addOnPropertyChangedListener(java.lang.String p0, java.util.concurrent.Executor p1, android.provider.DeviceConfig.OnPropertyChangedListener p2) {}
    @android.annotation.SystemApi
    public static void addOnPropertiesChangedListener(java.lang.String p0, java.util.concurrent.Executor p1, android.provider.DeviceConfig.OnPropertiesChangedListener p2) {}
    @android.annotation.SystemApi
    public static void removeOnPropertyChangedListener(android.provider.DeviceConfig.OnPropertyChangedListener p0) {}
    @android.annotation.SystemApi
    public static void removeOnPropertiesChangedListener(android.provider.DeviceConfig.OnPropertiesChangedListener p0) {}
    private static java.lang.String createCompositeName(java.lang.String p0, java.lang.String p1) { return null; }
    private static android.net.Uri createNamespaceUri(java.lang.String p0) { return null; }
    private static void incrementNamespace(java.lang.String p0) {}
    private static void decrementNamespace(java.lang.String p0) {}
    private static void handleChange(android.net.Uri p0) {}
    public static void enforceReadPermission(android.content.Context p0, java.lang.String p1) {}

    public static interface WindowManager {
        public static final java.lang.String KEY_SYSTEM_GESTURE_EXCLUSION_LIMIT_DP = "system_gesture_exclusion_limit_dp";
        public static final java.lang.String KEY_SYSTEM_GESTURES_EXCLUDED_BY_PRE_Q_STICKY_IMMERSIVE = "system_gestures_excluded_by_pre_q_sticky_immersive";
        public static final java.lang.String KEY_SYSTEM_GESTURE_EXCLUSION_LOG_DEBOUNCE_MILLIS = "system_gesture_exclusion_log_debounce_millis";
    }

    @android.annotation.SystemApi
    public static class Properties {
        private final java.lang.String mNamespace = null;
        private final java.util.HashMap<java.lang.String, java.lang.String> mMap = null;
        Properties(java.lang.String p0, java.util.Map<java.lang.String, java.lang.String> p1) {}
        public java.lang.String getNamespace() { return null; }
        public java.util.Set<java.lang.String> getKeyset() { return null; }
        public java.lang.String getString(java.lang.String p0, java.lang.String p1) { return null; }
        public boolean getBoolean(java.lang.String p0, boolean p1) { return false; }
        public int getInt(java.lang.String p0, int p1) { return 0; }
        public long getLong(java.lang.String p0, long p1) { return 0L; }
        public float getFloat(java.lang.String p0, float p1) { return 0.0f; }
    }

    @android.annotation.SystemApi
    public static interface OnPropertyChangedListener {
        public void onPropertyChanged(java.lang.String p0, java.lang.String p1, java.lang.String p2);
    }

    @android.annotation.SystemApi
    public static interface OnPropertiesChangedListener {
        public void onPropertiesChanged(android.provider.DeviceConfig.Properties p0);
    }
}
