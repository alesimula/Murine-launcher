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
    @android.annotation.UnsupportedAppUsage
    public static final int BRIGHTNESS_ON = 255;
    public static final int BRIGHTNESS_OFF = 0;
    public static final int BRIGHTNESS_DEFAULT = -1;
    @android.annotation.SystemApi
    public static final int USER_ACTIVITY_EVENT_OTHER = 0;
    @android.annotation.SystemApi
    public static final int USER_ACTIVITY_EVENT_BUTTON = 1;
    @android.annotation.SystemApi
    public static final int USER_ACTIVITY_EVENT_TOUCH = 2;
    @android.annotation.SystemApi
    public static final int USER_ACTIVITY_EVENT_ACCESSIBILITY = 3;
    public static final int USER_ACTIVITY_EVENT_ATTENTION = 4;
    @android.annotation.SystemApi
    public static final int USER_ACTIVITY_FLAG_NO_CHANGE_LIGHTS = 1;
    @android.annotation.SystemApi
    public static final int USER_ACTIVITY_FLAG_INDIRECT = 2;
    public static final int GO_TO_SLEEP_REASON_MIN = 0;
    public static final int GO_TO_SLEEP_REASON_APPLICATION = 0;
    public static final int GO_TO_SLEEP_REASON_DEVICE_ADMIN = 1;
    @android.annotation.UnsupportedAppUsage
    public static final int GO_TO_SLEEP_REASON_TIMEOUT = 2;
    public static final int GO_TO_SLEEP_REASON_LID_SWITCH = 3;
    public static final int GO_TO_SLEEP_REASON_POWER_BUTTON = 4;
    public static final int GO_TO_SLEEP_REASON_HDMI = 5;
    public static final int GO_TO_SLEEP_REASON_SLEEP_BUTTON = 6;
    public static final int GO_TO_SLEEP_REASON_ACCESSIBILITY = 7;
    public static final int GO_TO_SLEEP_REASON_FORCE_SUSPEND = 8;
    public static final int GO_TO_SLEEP_REASON_MAX = 8;
    public static final int GO_TO_SLEEP_FLAG_NO_DOZE = 1;
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
    public static final java.lang.String REBOOT_RECOVERY = "recovery";
    public static final java.lang.String REBOOT_RECOVERY_UPDATE = "recovery-update";
    public static final java.lang.String REBOOT_REQUESTED_BY_DEVICE_OWNER = "deviceowner";
    public static final java.lang.String REBOOT_SAFE_MODE = "safemode";
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
    final android.content.Context mContext = null;
    @android.annotation.UnsupportedAppUsage
    final android.os.IPowerManager mService = null;
    final android.os.Handler mHandler = null;
    android.os.IThermalService mThermalService;
    private final android.util.ArrayMap<android.os.PowerManager.OnThermalStatusChangedListener, android.os.IThermalStatusListener> mListenerMap = null;
    android.os.IDeviceIdleController mIDeviceIdleController;
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
    public static final java.lang.String ACTION_POWER_SAVE_MODE_CHANGED = "android.os.action.POWER_SAVE_MODE_CHANGED";
    public static final java.lang.String ACTION_POWER_SAVE_MODE_CHANGED_INTERNAL = "android.os.action.POWER_SAVE_MODE_CHANGED_INTERNAL";
    public static final java.lang.String ACTION_DEVICE_IDLE_MODE_CHANGED = "android.os.action.DEVICE_IDLE_MODE_CHANGED";
    @android.annotation.UnsupportedAppUsage
    public static final java.lang.String ACTION_LIGHT_DEVICE_IDLE_MODE_CHANGED = "android.os.action.LIGHT_DEVICE_IDLE_MODE_CHANGED";
    public static final java.lang.String ACTION_POWER_SAVE_WHITELIST_CHANGED = "android.os.action.POWER_SAVE_WHITELIST_CHANGED";
    public static final java.lang.String ACTION_POWER_SAVE_TEMP_WHITELIST_CHANGED = "android.os.action.POWER_SAVE_TEMP_WHITELIST_CHANGED";
    @android.annotation.UnsupportedAppUsage
    public static final java.lang.String ACTION_POWER_SAVE_MODE_CHANGING = "android.os.action.POWER_SAVE_MODE_CHANGING";
    @android.annotation.UnsupportedAppUsage
    public static final java.lang.String EXTRA_POWER_SAVE_MODE = "mode";
    @android.annotation.SystemApi
    @java.lang.Deprecated
    public static final java.lang.String ACTION_SCREEN_BRIGHTNESS_BOOST_CHANGED = "android.os.action.SCREEN_BRIGHTNESS_BOOST_CHANGED";
    public static final int PRE_IDLE_TIMEOUT_MODE_NORMAL = 0;
    public static final int PRE_IDLE_TIMEOUT_MODE_LONG = 1;
    public static final int PRE_IDLE_TIMEOUT_MODE_SHORT = 2;
    public static java.lang.String sleepReasonToString(int p0) { return null; }
    public static java.lang.String wakeReasonToString(int p0) { return null; }
    public static java.lang.String locationPowerSaveModeToString(int p0) { return null; }
    public PowerManager(android.content.Context p0, android.os.IPowerManager p1, android.os.Handler p2) {}
    @android.annotation.UnsupportedAppUsage
    public int getMinimumScreenBrightnessSetting() { return 0; }
    @android.annotation.UnsupportedAppUsage
    public int getMaximumScreenBrightnessSetting() { return 0; }
    @android.annotation.UnsupportedAppUsage
    public int getDefaultScreenBrightnessSetting() { return 0; }
    public int getMinimumScreenBrightnessForVrSetting() { return 0; }
    public int getMaximumScreenBrightnessForVrSetting() { return 0; }
    public int getDefaultScreenBrightnessForVrSetting() { return 0; }
    public android.os.PowerManager.WakeLock newWakeLock(int p0, java.lang.String p1) { return null; }
    @android.annotation.UnsupportedAppUsage
    public static void validateWakeLockParameters(int p0, java.lang.String p1) {}
    @java.lang.Deprecated
    public void userActivity(long p0, boolean p1) {}
    @android.annotation.SystemApi
    public void userActivity(long p0, int p1, int p2) {}
    public void goToSleep(long p0) {}
    @android.annotation.UnsupportedAppUsage
    public void goToSleep(long p0, int p1, int p2) {}
    @java.lang.Deprecated
    public void wakeUp(long p0) {}
    @java.lang.Deprecated
    @android.annotation.UnsupportedAppUsage
    public void wakeUp(long p0, java.lang.String p1) {}
    public void wakeUp(long p0, int p1, java.lang.String p2) {}
    public void nap(long p0) {}
    @android.annotation.SystemApi
    public void dream(long p0) {}
    public void boostScreenBrightness(long p0) {}
    @android.annotation.SystemApi
    @java.lang.Deprecated
    public boolean isScreenBrightnessBoosted() { return false; }
    public boolean isWakeLockLevelSupported(int p0) { return false; }
    @java.lang.Deprecated
    public boolean isScreenOn() { return false; }
    public boolean isInteractive() { return false; }
    public void reboot(java.lang.String p0) {}
    public void rebootSafeMode() {}
    public boolean isPowerSaveMode() { return false; }
    @android.annotation.SystemApi
    public boolean setPowerSaveModeEnabled(boolean p0) { return false; }
    @android.annotation.SystemApi
    public boolean setDynamicPowerSaveHint(boolean p0, int p1) { return false; }
    @android.annotation.SystemApi
    public boolean setAdaptivePowerSavePolicy(android.os.BatterySaverPolicyConfig p0) { return false; }
    @android.annotation.SystemApi
    public boolean setAdaptivePowerSaveEnabled(boolean p0) { return false; }
    @android.annotation.SystemApi
    public int getPowerSaveModeTrigger() { return 0; }
    public android.os.PowerSaveState getPowerSaveState(int p0) { return null; }
    public int getLocationPowerSaveMode() { return 0; }
    public boolean isDeviceIdleMode() { return false; }
    @android.annotation.UnsupportedAppUsage
    public boolean isLightDeviceIdleMode() { return false; }
    public boolean isIgnoringBatteryOptimizations(java.lang.String p0) { return false; }
    public void shutdown(boolean p0, java.lang.String p1, boolean p2) {}
    public boolean isSustainedPerformanceModeSupported() { return false; }
    public int getCurrentThermalStatus() { return 0; }
    public void addThermalStatusListener(android.os.PowerManager.OnThermalStatusChangedListener p0) {}
    public void addThermalStatusListener(java.util.concurrent.Executor p0, android.os.PowerManager.OnThermalStatusChangedListener p1) {}
    public void removeThermalStatusListener(android.os.PowerManager.OnThermalStatusChangedListener p0) {}
    public void setDozeAfterScreenOff(boolean p0) {}
    public int getLastShutdownReason() { return 0; }
    public int getLastSleepReason() { return 0; }
    @android.annotation.SystemApi
    public boolean forceSuspend() { return false; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface WakeReason {
    }

    public final class WakeLock {
        @android.annotation.UnsupportedAppUsage
        private int mFlags;
        @android.annotation.UnsupportedAppUsage
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
        private final java.lang.Runnable mReleaser = null;
        WakeLock(android.os.PowerManager p0, int p1, java.lang.String p2, java.lang.String p3) {}
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
        public void writeToProto(android.util.proto.ProtoOutputStream p0, long p1) {}
        public java.lang.Runnable wrap(java.lang.Runnable p0) { return null; }
    }

    public static class WakeData {
        public long wakeTime;
        public int wakeReason;
        public WakeData(long p0, int p1) {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ThermalStatus {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ShutdownReason {
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

    public static interface OnThermalStatusChangedListener {
        public void onThermalStatusChanged(int p0);
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface LocationPowerSaveMode {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface AutoPowerSaveModeTriggers {
    }
}
