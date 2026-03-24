package android.os;

public final class PowerManager {
    private static final java.lang.String TAG = "PowerManager";
    public static final int PARTIAL_WAKE_LOCK = 1;
    @java.lang.Deprecated
    public static final int SCREEN_DIM_WAKE_LOCK = 6;
    @java.lang.Deprecated
    public static final int SCREEN_BRIGHT_WAKE_LOCK = 10;
    @java.lang.Deprecated
    public static final int FULL_WAKE_LOCK = 26;
    public static final int PROXIMITY_SCREEN_OFF_WAKE_LOCK = 32;
    public static final int DOZE_WAKE_LOCK = 64;
    public static final int DRAW_WAKE_LOCK = 128;
    public static final int WAKE_LOCK_LEVEL_MASK = 65535;
    public static final int ACQUIRE_CAUSES_WAKEUP = 268435456;
    public static final int ON_AFTER_RELEASE = 536870912;
    public static final int UNIMPORTANT_FOR_LOGGING = 1073741824;
    public static final int RELEASE_FLAG_WAIT_FOR_NO_PROXIMITY = 1;
    public static final int RELEASE_FLAG_TIMEOUT = 65536;
    public static final int BRIGHTNESS_ON = 255;
    public static final int BRIGHTNESS_OFF = 0;
    public static final int BRIGHTNESS_DEFAULT = -1;
    public static final int BRIGHTNESS_INVALID = -1;
    public static final float BRIGHTNESS_MAX = 1.0f;
    public static final float BRIGHTNESS_MIN = 0.0f;
    public static final float BRIGHTNESS_OFF_FLOAT = -1.0f;
    public static final float BRIGHTNESS_INVALID_FLOAT = Float.NaN;
    @android.annotation.SystemApi
    public static final int USER_ACTIVITY_EVENT_OTHER = 0;
    @android.annotation.SystemApi
    public static final int USER_ACTIVITY_EVENT_BUTTON = 1;
    @android.annotation.SystemApi
    public static final int USER_ACTIVITY_EVENT_TOUCH = 2;
    @android.annotation.SystemApi
    public static final int USER_ACTIVITY_EVENT_ACCESSIBILITY = 3;
    public static final int USER_ACTIVITY_EVENT_ATTENTION = 4;
    public static final int USER_ACTIVITY_EVENT_FACE_DOWN = 5;
    @android.annotation.SystemApi
    public static final int USER_ACTIVITY_FLAG_NO_CHANGE_LIGHTS = 1;
    @android.annotation.SystemApi
    public static final int USER_ACTIVITY_FLAG_INDIRECT = 2;
    public static final int GO_TO_SLEEP_REASON_MIN = 0;
    public static final int GO_TO_SLEEP_REASON_APPLICATION = 0;
    public static final int GO_TO_SLEEP_REASON_DEVICE_ADMIN = 1;
    public static final int GO_TO_SLEEP_REASON_TIMEOUT = 2;
    public static final int GO_TO_SLEEP_REASON_LID_SWITCH = 3;
    public static final int GO_TO_SLEEP_REASON_POWER_BUTTON = 4;
    public static final int GO_TO_SLEEP_REASON_HDMI = 5;
    public static final int GO_TO_SLEEP_REASON_SLEEP_BUTTON = 6;
    public static final int GO_TO_SLEEP_REASON_ACCESSIBILITY = 7;
    public static final int GO_TO_SLEEP_REASON_FORCE_SUSPEND = 8;
    public static final int GO_TO_SLEEP_REASON_INATTENTIVE = 9;
    public static final int GO_TO_SLEEP_REASON_QUIESCENT = 10;
    public static final int GO_TO_SLEEP_REASON_DISPLAY_GROUP_REMOVED = 11;
    public static final int GO_TO_SLEEP_REASON_DISPLAY_GROUPS_TURNED_OFF = 12;
    public static final int GO_TO_SLEEP_REASON_MAX = 12;
    public static final int GO_TO_SLEEP_FLAG_NO_DOZE = 1;
    public static final int BRIGHTNESS_CONSTRAINT_TYPE_MINIMUM = 0;
    public static final int BRIGHTNESS_CONSTRAINT_TYPE_MAXIMUM = 1;
    public static final int BRIGHTNESS_CONSTRAINT_TYPE_DEFAULT = 2;
    public static final int BRIGHTNESS_CONSTRAINT_TYPE_DIM = 3;
    public static final int BRIGHTNESS_CONSTRAINT_TYPE_DOZE = 4;
    public static final int BRIGHTNESS_CONSTRAINT_TYPE_MINIMUM_VR = 5;
    public static final int BRIGHTNESS_CONSTRAINT_TYPE_MAXIMUM_VR = 6;
    public static final int BRIGHTNESS_CONSTRAINT_TYPE_DEFAULT_VR = 7;
    public static final int WAKE_REASON_UNKNOWN = 0;
    public static final int WAKE_REASON_POWER_BUTTON = 1;
    public static final int WAKE_REASON_APPLICATION = 2;
    public static final int WAKE_REASON_PLUGGED_IN = 3;
    public static final int WAKE_REASON_GESTURE = 4;
    public static final int WAKE_REASON_CAMERA_LAUNCH = 5;
    public static final int WAKE_REASON_WAKE_KEY = 6;
    public static final int WAKE_REASON_WAKE_MOTION = 7;
    public static final int WAKE_REASON_HDMI = 8;
    public static final int WAKE_REASON_LID = 9;
    public static final int WAKE_REASON_DISPLAY_GROUP_ADDED = 10;
    public static final int WAKE_REASON_DISPLAY_GROUP_TURNED_ON = 11;
    public static final java.lang.String REBOOT_RECOVERY = "recovery";
    public static final java.lang.String REBOOT_RECOVERY_UPDATE = "recovery-update";
    public static final java.lang.String REBOOT_REQUESTED_BY_DEVICE_OWNER = "deviceowner";
    public static final java.lang.String REBOOT_SAFE_MODE = "safemode";
    @android.annotation.SystemApi
    public static final java.lang.String REBOOT_USERSPACE = "userspace";
    public static final java.lang.String REBOOT_QUIESCENT = "quiescent";
    public static final java.lang.String SHUTDOWN_USER_REQUESTED = "userrequested";
    public static final java.lang.String SHUTDOWN_BATTERY_THERMAL_STATE = "thermal,battery";
    public static final java.lang.String SHUTDOWN_THERMAL_STATE = "thermal";
    public static final java.lang.String SHUTDOWN_LOW_BATTERY = "battery";
    public static final int SHUTDOWN_REASON_UNKNOWN = 0;
    public static final int SHUTDOWN_REASON_SHUTDOWN = 1;
    public static final int SHUTDOWN_REASON_REBOOT = 2;
    public static final int SHUTDOWN_REASON_USER_REQUESTED = 3;
    public static final int SHUTDOWN_REASON_THERMAL_SHUTDOWN = 4;
    public static final int SHUTDOWN_REASON_LOW_BATTERY = 5;
    public static final int SHUTDOWN_REASON_BATTERY_THERMAL = 6;
    public static final int LOCATION_MODE_NO_CHANGE = 0;
    public static final int LOCATION_MODE_GPS_DISABLED_WHEN_SCREEN_OFF = 1;
    public static final int LOCATION_MODE_ALL_DISABLED_WHEN_SCREEN_OFF = 2;
    public static final int LOCATION_MODE_FOREGROUND_ONLY = 3;
    public static final int LOCATION_MODE_THROTTLE_REQUESTS_WHEN_SCREEN_OFF = 4;
    public static final int MIN_LOCATION_MODE = 0;
    public static final int MAX_LOCATION_MODE = 4;
    @android.annotation.SystemApi
    public static final int SOUND_TRIGGER_MODE_ALL_ENABLED = 0;
    @android.annotation.SystemApi
    public static final int SOUND_TRIGGER_MODE_CRITICAL_ONLY = 1;
    @android.annotation.SystemApi
    public static final int SOUND_TRIGGER_MODE_ALL_DISABLED = 2;
    public static final int MIN_SOUND_TRIGGER_MODE = 0;
    public static final int MAX_SOUND_TRIGGER_MODE = 2;
    private static final java.lang.String CACHE_KEY_IS_POWER_SAVE_MODE_PROPERTY = "cache_key.is_power_save_mode";
    private static final java.lang.String CACHE_KEY_IS_INTERACTIVE_PROPERTY = "cache_key.is_interactive";
    private static final int MAX_CACHE_ENTRIES = 1;
    private android.app.PropertyInvalidatedCache<java.lang.Void, java.lang.Boolean> mPowerSaveModeCache;
    private android.app.PropertyInvalidatedCache<java.lang.Void, java.lang.Boolean> mInteractiveCache;
    final android.content.Context mContext = null;
    final android.os.IPowerManager mService = null;
    final android.os.Handler mHandler = null;
    final android.os.IThermalService mThermalService = null;
    private android.os.PowerWhitelistManager mPowerWhitelistManager;
    private final android.util.ArrayMap<android.os.PowerManager.OnThermalStatusChangedListener, android.os.IThermalStatusListener> mListenerMap = null;
    @android.annotation.SystemApi
    public static final int POWER_SAVE_MODE_TRIGGER_PERCENTAGE = 0;
    @android.annotation.SystemApi
    public static final int POWER_SAVE_MODE_TRIGGER_DYNAMIC = 1;
    public static final int THERMAL_STATUS_NONE = 0;
    public static final int THERMAL_STATUS_LIGHT = 1;
    public static final int THERMAL_STATUS_MODERATE = 2;
    public static final int THERMAL_STATUS_SEVERE = 3;
    public static final int THERMAL_STATUS_CRITICAL = 4;
    public static final int THERMAL_STATUS_EMERGENCY = 5;
    public static final int THERMAL_STATUS_SHUTDOWN = 6;
    private final java.util.concurrent.atomic.AtomicLong mLastHeadroomUpdate = null;
    private static final int MINIMUM_HEADROOM_TIME_MILLIS = 500;
    public static final java.lang.String ACTION_ENHANCED_DISCHARGE_PREDICTION_CHANGED = "android.os.action.ENHANCED_DISCHARGE_PREDICTION_CHANGED";
    public static final java.lang.String ACTION_POWER_SAVE_MODE_CHANGED = "android.os.action.POWER_SAVE_MODE_CHANGED";
    public static final java.lang.String ACTION_POWER_SAVE_MODE_CHANGED_INTERNAL = "android.os.action.POWER_SAVE_MODE_CHANGED_INTERNAL";
    public static final java.lang.String ACTION_DEVICE_IDLE_MODE_CHANGED = "android.os.action.DEVICE_IDLE_MODE_CHANGED";
    public static final java.lang.String ACTION_LIGHT_DEVICE_IDLE_MODE_CHANGED = "android.os.action.LIGHT_DEVICE_IDLE_MODE_CHANGED";
    public static final java.lang.String ACTION_POWER_SAVE_WHITELIST_CHANGED = "android.os.action.POWER_SAVE_WHITELIST_CHANGED";
    public static final java.lang.String ACTION_POWER_SAVE_TEMP_WHITELIST_CHANGED = "android.os.action.POWER_SAVE_TEMP_WHITELIST_CHANGED";
    public static final int PRE_IDLE_TIMEOUT_MODE_NORMAL = 0;
    public static final int PRE_IDLE_TIMEOUT_MODE_LONG = 1;
    public static final int PRE_IDLE_TIMEOUT_MODE_SHORT = 2;
    public static java.lang.String sleepReasonToString(int p0) { return null; }
    public static java.lang.String wakeReasonToString(int p0) { return null; }
    public static java.lang.String locationPowerSaveModeToString(int p0) { return null; }
    public PowerManager(android.content.Context p0, android.os.IPowerManager p1, android.os.IThermalService p2, android.os.Handler p3) {}
    private android.os.PowerWhitelistManager getPowerWhitelistManager() { return null; }
    public int getMinimumScreenBrightnessSetting() { return 0; }
    public int getMaximumScreenBrightnessSetting() { return 0; }
    public int getDefaultScreenBrightnessSetting() { return 0; }
    public int getMinimumScreenBrightnessForVrSetting() { return 0; }
    public int getMaximumScreenBrightnessForVrSetting() { return 0; }
    public int getDefaultScreenBrightnessForVrSetting() { return 0; }
    public float getBrightnessConstraint(int p0) { return 0.0f; }
    public android.os.PowerManager.WakeLock newWakeLock(int p0, java.lang.String p1) { return null; }
    public android.os.PowerManager.WakeLock newWakeLock(int p0, java.lang.String p1, int p2) { return null; }
    public static void validateWakeLockParameters(int p0, java.lang.String p1) {}
    @java.lang.Deprecated
    public void userActivity(long p0, boolean p1) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission(anyOf={"android.permission.DEVICE_POWER", "android.permission.USER_ACTIVITY"})
    public void userActivity(long p0, int p1, int p2) {}
    public void goToSleep(long p0) {}
    public void goToSleep(long p0, int p1, int p2) {}
    @java.lang.Deprecated
    public void wakeUp(long p0) {}
    @java.lang.Deprecated
    public void wakeUp(long p0, java.lang.String p1) {}
    public void wakeUp(long p0, int p1, java.lang.String p2) {}
    public void nap(long p0) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission(allOf={"android.permission.READ_DREAM_STATE", "android.permission.WRITE_DREAM_STATE"})
    public void dream(long p0) {}
    public void boostScreenBrightness(long p0) {}
    public boolean isWakeLockLevelSupported(int p0) { return false; }
    @java.lang.Deprecated
    public boolean isScreenOn() { return false; }
    public boolean isInteractive() { return false; }
    public static boolean isRebootingUserspaceSupportedImpl() { return false; }
    public boolean isRebootingUserspaceSupported() { return false; }
    @android.annotation.RequiresPermission("android.permission.REBOOT")
    public void reboot(java.lang.String p0) {}
    @android.annotation.RequiresPermission("android.permission.REBOOT")
    public void rebootSafeMode() {}
    public boolean isPowerSaveMode() { return false; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission(anyOf={"android.permission.DEVICE_POWER", "android.permission.POWER_SAVER"})
    public boolean setPowerSaveModeEnabled(boolean p0) { return false; }
    @android.annotation.SystemApi
    public android.os.BatterySaverPolicyConfig getFullPowerSavePolicy() { return null; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission(anyOf={"android.permission.DEVICE_POWER", "android.permission.POWER_SAVER"})
    public boolean setFullPowerSavePolicy(android.os.BatterySaverPolicyConfig p0) { return false; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.POWER_SAVER")
    public boolean setDynamicPowerSaveHint(boolean p0, int p1) { return false; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission(anyOf={"android.permission.DEVICE_POWER", "android.permission.POWER_SAVER"})
    public boolean setAdaptivePowerSavePolicy(android.os.BatterySaverPolicyConfig p0) { return false; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission(anyOf={"android.permission.DEVICE_POWER", "android.permission.POWER_SAVER"})
    public boolean setAdaptivePowerSaveEnabled(boolean p0) { return false; }
    @android.annotation.SystemApi
    public int getPowerSaveModeTrigger() { return 0; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission(anyOf={"android.permission.BATTERY_PREDICTION", "android.permission.DEVICE_POWER"})
    public void setBatteryDischargePrediction(java.time.Duration p0, boolean p1) {}
    public java.time.Duration getBatteryDischargePrediction() { return null; }
    public boolean isBatteryDischargePredictionPersonalized() { return false; }
    public android.os.PowerSaveState getPowerSaveState(int p0) { return null; }
    public int getLocationPowerSaveMode() { return 0; }
    public int getSoundTriggerPowerSaveMode() { return 0; }
    public boolean isDeviceIdleMode() { return false; }
    public boolean isLightDeviceIdleMode() { return false; }
    public boolean isIgnoringBatteryOptimizations(java.lang.String p0) { return false; }
    public void shutdown(boolean p0, java.lang.String p1, boolean p2) {}
    public boolean isSustainedPerformanceModeSupported() { return false; }
    public int getCurrentThermalStatus() { return 0; }
    public void addThermalStatusListener(android.os.PowerManager.OnThermalStatusChangedListener p0) {}
    public void addThermalStatusListener(java.util.concurrent.Executor p0, android.os.PowerManager.OnThermalStatusChangedListener p1) {}
    public void removeThermalStatusListener(android.os.PowerManager.OnThermalStatusChangedListener p0) {}
    public float getThermalHeadroom(int p0) { return 0.0f; }
    public void setDozeAfterScreenOff(boolean p0) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.READ_DREAM_STATE")
    public boolean isAmbientDisplayAvailable() { return false; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.WRITE_DREAM_STATE")
    public void suppressAmbientDisplay(java.lang.String p0, boolean p1) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.READ_DREAM_STATE")
    public boolean isAmbientDisplaySuppressedForToken(java.lang.String p0) { return false; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.READ_DREAM_STATE")
    public boolean isAmbientDisplaySuppressed() { return false; }
    @android.annotation.RequiresPermission(allOf={"android.permission.READ_DREAM_STATE", "android.permission.READ_DREAM_SUPPRESSION"})
    public boolean isAmbientDisplaySuppressedForTokenByApp(java.lang.String p0, int p1) { return false; }
    public int getLastShutdownReason() { return 0; }
    public int getLastSleepReason() { return 0; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.DEVICE_POWER")
    public boolean forceSuspend() { return false; }
    public static void invalidatePowerSaveModeCaches() {}
    public static void invalidateIsInteractiveCaches() {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface AutoPowerSaveModeTriggers {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface BrightnessConstraint {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface GoToSleepReason {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface LocationPowerSaveMode {
    }

    public static interface OnThermalStatusChangedListener {
        public void onThermalStatusChanged(int p0);
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ServiceType {
        public static final int NULL = 0;
        public static final int LOCATION = 1;
        public static final int VIBRATION = 2;
        public static final int ANIMATION = 3;
        public static final int FULL_BACKUP = 4;
        public static final int KEYVALUE_BACKUP = 5;
        public static final int NETWORK_FIREWALL = 6;
        public static final int SCREEN_BRIGHTNESS = 7;
        public static final int SOUND = 8;
        public static final int BATTERY_STATS = 9;
        public static final int DATA_SAVER = 10;
        public static final int AOD = 14;
        public static final int FORCE_ALL_APPS_STANDBY = 11;
        public static final int FORCE_BACKGROUND_CHECK = 12;
        public static final int OPTIONAL_SENSORS = 13;
        public static final int QUICK_DOZE = 15;
        public static final int NIGHT_MODE = 16;
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ShutdownReason {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface SoundTriggerPowerSaveMode {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ThermalStatus {
    }

    public static class WakeData {
        public long wakeTime;
        public int wakeReason;
        public long sleepDuration;
        public WakeData(long p0, int p1, long p2) {}
    }

    public final class WakeLock {
        private int mFlags;
        private java.lang.String mTag;
        private final java.lang.String mPackageName = null;
        private final android.os.IBinder mToken = null;
        private int mInternalCount;
        private int mExternalCount;
        private boolean mRefCounted;
        private boolean mHeld;
        private android.os.WorkSource mWorkSource;
        private java.lang.String mHistoryTag;
        private final java.lang.String mTraceName = null;
        private final int mDisplayId = 0;
        private final java.lang.Runnable mReleaser = null;
        WakeLock(android.os.PowerManager p0, int p1, java.lang.String p2, java.lang.String p3, int p4) {}
        protected void finalize() throws java.lang.Throwable {}
        public void setReferenceCounted(boolean p0) {}
        public void acquire() {}
        public void acquire(long p0) {}
        private void acquireLocked() {}
        public void release() {}
        public void release(int p0) {}
        public boolean isHeld() { return false; }
        public void setWorkSource(android.os.WorkSource p0) {}
        public void setTag(java.lang.String p0) {}
        public java.lang.String getTag() { return null; }
        public void setHistoryTag(java.lang.String p0) {}
        public void setUnimportantForLogging(boolean p0) {}
        public java.lang.String toString() { return null; }
        public void dumpDebug(android.util.proto.ProtoOutputStream p0, long p1) {}
        public java.lang.Runnable wrap(java.lang.Runnable p0) { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface WakeReason {
    }
}
