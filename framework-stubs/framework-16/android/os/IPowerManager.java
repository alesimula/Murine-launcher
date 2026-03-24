package android.os;

public interface IPowerManager extends android.os.IInterface {
    public static final int LOCATION_MODE_NO_CHANGE = 0;
    public static final int LOCATION_MODE_GPS_DISABLED_WHEN_SCREEN_OFF = 1;
    public static final int LOCATION_MODE_ALL_DISABLED_WHEN_SCREEN_OFF = 2;
    public static final int LOCATION_MODE_FOREGROUND_ONLY = 3;
    public static final int LOCATION_MODE_THROTTLE_REQUESTS_WHEN_SCREEN_OFF = 4;
    public static final int MIN_LOCATION_MODE = 0;
    public static final int MAX_LOCATION_MODE = 4;
    public static final int GO_TO_SLEEP_REASON_MIN = 0;
    public static final int GO_TO_SLEEP_REASON_APPLICATION = 0;
    public static final int GO_TO_SLEEP_REASON_TIMEOUT = 2;
    public static final int GO_TO_SLEEP_REASON_LID_SWITCH = 3;
    public static final int GO_TO_SLEEP_REASON_POWER_BUTTON = 4;
    public static final int GO_TO_SLEEP_REASON_HDMI = 5;
    public static final int GO_TO_SLEEP_REASON_SLEEP_BUTTON = 6;
    public static final int GO_TO_SLEEP_REASON_ACCESSIBILITY = 7;
    public static final int GO_TO_SLEEP_REASON_FORCE_SUSPEND = 8;
    public static final int GO_TO_SLEEP_REASON_INATTENTIVE = 9;
    public static final int GO_TO_SLEEP_REASON_QUIESCENT = 10;
    public static final int GO_TO_SLEEP_REASON_MAX = 10;
    public static final int GO_TO_SLEEP_FLAG_NO_DOZE = 1;
    public void acquireWakeLock(android.os.IBinder p0, int p1, java.lang.String p2, java.lang.String p3, android.os.WorkSource p4, java.lang.String p5, int p6, android.os.IWakeLockCallback p7) throws android.os.RemoteException;
    public void acquireWakeLockWithUid(android.os.IBinder p0, int p1, java.lang.String p2, java.lang.String p3, int p4, int p5, android.os.IWakeLockCallback p6) throws android.os.RemoteException;
    public void releaseWakeLock(android.os.IBinder p0, int p1) throws android.os.RemoteException;
    public void updateWakeLockUids(android.os.IBinder p0, int[] p1) throws android.os.RemoteException;
    public void setPowerBoost(int p0, int p1) throws android.os.RemoteException;
    public void setPowerMode(int p0, boolean p1) throws android.os.RemoteException;
    public boolean setPowerModeChecked(int p0, boolean p1) throws android.os.RemoteException;
    public void updateWakeLockWorkSource(android.os.IBinder p0, android.os.WorkSource p1, java.lang.String p2) throws android.os.RemoteException;
    public void updateWakeLockCallback(android.os.IBinder p0, android.os.IWakeLockCallback p1) throws android.os.RemoteException;
    public boolean isWakeLockLevelSupported(int p0) throws android.os.RemoteException;
    public boolean isWakeLockLevelSupportedWithDisplayId(int p0, int p1) throws android.os.RemoteException;
    public void addScreenTimeoutPolicyListener(int p0, android.os.IScreenTimeoutPolicyListener p1) throws android.os.RemoteException;
    public void removeScreenTimeoutPolicyListener(int p0, android.os.IScreenTimeoutPolicyListener p1) throws android.os.RemoteException;
    public void userActivity(int p0, long p1, int p2, int p3) throws android.os.RemoteException;
    public void wakeUp(long p0, int p1, java.lang.String p2, java.lang.String p3) throws android.os.RemoteException;
    public void wakeUpWithDisplayId(long p0, int p1, java.lang.String p2, java.lang.String p3, int p4) throws android.os.RemoteException;
    public void goToSleep(long p0, int p1, int p2) throws android.os.RemoteException;
    public void goToSleepWithDisplayId(int p0, long p1, int p2, int p3) throws android.os.RemoteException;
    public void nap(long p0) throws android.os.RemoteException;
    public float getBrightnessConstraint(int p0, int p1) throws android.os.RemoteException;
    public boolean isInteractive() throws android.os.RemoteException;
    public boolean isDisplayInteractive(int p0) throws android.os.RemoteException;
    public boolean areAutoPowerSaveModesEnabled() throws android.os.RemoteException;
    public boolean isPowerSaveMode() throws android.os.RemoteException;
    public android.os.PowerSaveState getPowerSaveState(int p0) throws android.os.RemoteException;
    public boolean setPowerSaveModeEnabled(boolean p0) throws android.os.RemoteException;
    public boolean isBatterySaverSupported() throws android.os.RemoteException;
    public android.os.BatterySaverPolicyConfig getFullPowerSavePolicy() throws android.os.RemoteException;
    public boolean setFullPowerSavePolicy(android.os.BatterySaverPolicyConfig p0) throws android.os.RemoteException;
    public boolean setDynamicPowerSaveHint(boolean p0, int p1) throws android.os.RemoteException;
    public boolean setAdaptivePowerSavePolicy(android.os.BatterySaverPolicyConfig p0) throws android.os.RemoteException;
    public boolean setAdaptivePowerSaveEnabled(boolean p0) throws android.os.RemoteException;
    public int getPowerSaveModeTrigger() throws android.os.RemoteException;
    public void setBatteryDischargePrediction(android.os.ParcelDuration p0, boolean p1) throws android.os.RemoteException;
    public android.os.ParcelDuration getBatteryDischargePrediction() throws android.os.RemoteException;
    public boolean isBatteryDischargePredictionPersonalized() throws android.os.RemoteException;
    public boolean isDeviceIdleMode() throws android.os.RemoteException;
    public boolean isLightDeviceIdleMode() throws android.os.RemoteException;
    @android.annotation.RequiresPermission(anyOf={"android.permission.MANAGE_LOW_POWER_STANDBY", "android.permission.DEVICE_POWER"})
    public boolean isLowPowerStandbySupported() throws android.os.RemoteException;
    public boolean isLowPowerStandbyEnabled() throws android.os.RemoteException;
    @android.annotation.RequiresPermission(anyOf={"android.permission.MANAGE_LOW_POWER_STANDBY", "android.permission.DEVICE_POWER"})
    public void setLowPowerStandbyEnabled(boolean p0) throws android.os.RemoteException;
    @android.annotation.RequiresPermission(anyOf={"android.permission.MANAGE_LOW_POWER_STANDBY", "android.permission.DEVICE_POWER"})
    public void setLowPowerStandbyActiveDuringMaintenance(boolean p0) throws android.os.RemoteException;
    @android.annotation.RequiresPermission(anyOf={"android.permission.MANAGE_LOW_POWER_STANDBY", "android.permission.DEVICE_POWER"})
    public void forceLowPowerStandbyActive(boolean p0) throws android.os.RemoteException;
    @android.annotation.RequiresPermission(anyOf={"android.permission.MANAGE_LOW_POWER_STANDBY", "android.permission.DEVICE_POWER"})
    public void setLowPowerStandbyPolicy(android.os.IPowerManager.LowPowerStandbyPolicy p0) throws android.os.RemoteException;
    @android.annotation.RequiresPermission(anyOf={"android.permission.MANAGE_LOW_POWER_STANDBY", "android.permission.DEVICE_POWER"})
    public android.os.IPowerManager.LowPowerStandbyPolicy getLowPowerStandbyPolicy() throws android.os.RemoteException;
    public boolean isExemptFromLowPowerStandby() throws android.os.RemoteException;
    public boolean isReasonAllowedInLowPowerStandby(int p0) throws android.os.RemoteException;
    public boolean isFeatureAllowedInLowPowerStandby(java.lang.String p0) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.SET_LOW_POWER_STANDBY_PORTS")
    public void acquireLowPowerStandbyPorts(android.os.IBinder p0, java.util.List<android.os.IPowerManager.LowPowerStandbyPortDescription> p1) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.SET_LOW_POWER_STANDBY_PORTS")
    public void releaseLowPowerStandbyPorts(android.os.IBinder p0) throws android.os.RemoteException;
    @android.annotation.RequiresPermission(anyOf={"android.permission.MANAGE_LOW_POWER_STANDBY", "android.permission.DEVICE_POWER"})
    public java.util.List<android.os.IPowerManager.LowPowerStandbyPortDescription> getActiveLowPowerStandbyPorts() throws android.os.RemoteException;
    public void reboot(boolean p0, java.lang.String p1, boolean p2) throws android.os.RemoteException;
    public void rebootSafeMode(boolean p0, boolean p1) throws android.os.RemoteException;
    public void shutdown(boolean p0, java.lang.String p1, boolean p2) throws android.os.RemoteException;
    public void crash(java.lang.String p0) throws android.os.RemoteException;
    public int getLastShutdownReason() throws android.os.RemoteException;
    public int getLastSleepReason() throws android.os.RemoteException;
    public void setStayOnSetting(int p0) throws android.os.RemoteException;
    public void boostScreenBrightness(long p0) throws android.os.RemoteException;
    public void acquireWakeLockAsync(android.os.IBinder p0, int p1, java.lang.String p2, java.lang.String p3, android.os.WorkSource p4, java.lang.String p5) throws android.os.RemoteException;
    public void releaseWakeLockAsync(android.os.IBinder p0, int p1) throws android.os.RemoteException;
    public void updateWakeLockUidsAsync(android.os.IBinder p0, int[] p1) throws android.os.RemoteException;
    public boolean isScreenBrightnessBoosted() throws android.os.RemoteException;
    public void setAttentionLight(boolean p0, int p1) throws android.os.RemoteException;
    public void setDozeAfterScreenOff(boolean p0) throws android.os.RemoteException;
    public boolean isAmbientDisplayAvailable() throws android.os.RemoteException;
    public void suppressAmbientDisplay(java.lang.String p0, boolean p1) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.WRITE_DREAM_STATE")
    public void suppressAmbientDisplayBehavior(java.lang.String p0, int p1) throws android.os.RemoteException;
    public boolean isAmbientDisplaySuppressedForToken(java.lang.String p0) throws android.os.RemoteException;
    public boolean isAmbientDisplaySuppressed() throws android.os.RemoteException;
    public boolean isAmbientDisplaySuppressedForTokenByApp(java.lang.String p0, int p1) throws android.os.RemoteException;
    public boolean forceSuspend() throws android.os.RemoteException;

    public static class Default implements android.os.IPowerManager {
        public Default() {}
        public void acquireWakeLock(android.os.IBinder p0, int p1, java.lang.String p2, java.lang.String p3, android.os.WorkSource p4, java.lang.String p5, int p6, android.os.IWakeLockCallback p7) throws android.os.RemoteException {}
        public void acquireWakeLockWithUid(android.os.IBinder p0, int p1, java.lang.String p2, java.lang.String p3, int p4, int p5, android.os.IWakeLockCallback p6) throws android.os.RemoteException {}
        public void releaseWakeLock(android.os.IBinder p0, int p1) throws android.os.RemoteException {}
        public void updateWakeLockUids(android.os.IBinder p0, int[] p1) throws android.os.RemoteException {}
        public void setPowerBoost(int p0, int p1) throws android.os.RemoteException {}
        public void setPowerMode(int p0, boolean p1) throws android.os.RemoteException {}
        public boolean setPowerModeChecked(int p0, boolean p1) throws android.os.RemoteException { return false; }
        public void updateWakeLockWorkSource(android.os.IBinder p0, android.os.WorkSource p1, java.lang.String p2) throws android.os.RemoteException {}
        public void updateWakeLockCallback(android.os.IBinder p0, android.os.IWakeLockCallback p1) throws android.os.RemoteException {}
        public boolean isWakeLockLevelSupported(int p0) throws android.os.RemoteException { return false; }
        public boolean isWakeLockLevelSupportedWithDisplayId(int p0, int p1) throws android.os.RemoteException { return false; }
        public void addScreenTimeoutPolicyListener(int p0, android.os.IScreenTimeoutPolicyListener p1) throws android.os.RemoteException {}
        public void removeScreenTimeoutPolicyListener(int p0, android.os.IScreenTimeoutPolicyListener p1) throws android.os.RemoteException {}
        public void userActivity(int p0, long p1, int p2, int p3) throws android.os.RemoteException {}
        public void wakeUp(long p0, int p1, java.lang.String p2, java.lang.String p3) throws android.os.RemoteException {}
        public void wakeUpWithDisplayId(long p0, int p1, java.lang.String p2, java.lang.String p3, int p4) throws android.os.RemoteException {}
        public void goToSleep(long p0, int p1, int p2) throws android.os.RemoteException {}
        public void goToSleepWithDisplayId(int p0, long p1, int p2, int p3) throws android.os.RemoteException {}
        public void nap(long p0) throws android.os.RemoteException {}
        public float getBrightnessConstraint(int p0, int p1) throws android.os.RemoteException { return 0.0f; }
        public boolean isInteractive() throws android.os.RemoteException { return false; }
        public boolean isDisplayInteractive(int p0) throws android.os.RemoteException { return false; }
        public boolean areAutoPowerSaveModesEnabled() throws android.os.RemoteException { return false; }
        public boolean isPowerSaveMode() throws android.os.RemoteException { return false; }
        public android.os.PowerSaveState getPowerSaveState(int p0) throws android.os.RemoteException { return null; }
        public boolean setPowerSaveModeEnabled(boolean p0) throws android.os.RemoteException { return false; }
        public boolean isBatterySaverSupported() throws android.os.RemoteException { return false; }
        public android.os.BatterySaverPolicyConfig getFullPowerSavePolicy() throws android.os.RemoteException { return null; }
        public boolean setFullPowerSavePolicy(android.os.BatterySaverPolicyConfig p0) throws android.os.RemoteException { return false; }
        public boolean setDynamicPowerSaveHint(boolean p0, int p1) throws android.os.RemoteException { return false; }
        public boolean setAdaptivePowerSavePolicy(android.os.BatterySaverPolicyConfig p0) throws android.os.RemoteException { return false; }
        public boolean setAdaptivePowerSaveEnabled(boolean p0) throws android.os.RemoteException { return false; }
        public int getPowerSaveModeTrigger() throws android.os.RemoteException { return 0; }
        public void setBatteryDischargePrediction(android.os.ParcelDuration p0, boolean p1) throws android.os.RemoteException {}
        public android.os.ParcelDuration getBatteryDischargePrediction() throws android.os.RemoteException { return null; }
        public boolean isBatteryDischargePredictionPersonalized() throws android.os.RemoteException { return false; }
        public boolean isDeviceIdleMode() throws android.os.RemoteException { return false; }
        public boolean isLightDeviceIdleMode() throws android.os.RemoteException { return false; }
        public boolean isLowPowerStandbySupported() throws android.os.RemoteException { return false; }
        public boolean isLowPowerStandbyEnabled() throws android.os.RemoteException { return false; }
        public void setLowPowerStandbyEnabled(boolean p0) throws android.os.RemoteException {}
        public void setLowPowerStandbyActiveDuringMaintenance(boolean p0) throws android.os.RemoteException {}
        public void forceLowPowerStandbyActive(boolean p0) throws android.os.RemoteException {}
        public void setLowPowerStandbyPolicy(android.os.IPowerManager.LowPowerStandbyPolicy p0) throws android.os.RemoteException {}
        public android.os.IPowerManager.LowPowerStandbyPolicy getLowPowerStandbyPolicy() throws android.os.RemoteException { return null; }
        public boolean isExemptFromLowPowerStandby() throws android.os.RemoteException { return false; }
        public boolean isReasonAllowedInLowPowerStandby(int p0) throws android.os.RemoteException { return false; }
        public boolean isFeatureAllowedInLowPowerStandby(java.lang.String p0) throws android.os.RemoteException { return false; }
        public void acquireLowPowerStandbyPorts(android.os.IBinder p0, java.util.List<android.os.IPowerManager.LowPowerStandbyPortDescription> p1) throws android.os.RemoteException {}
        public void releaseLowPowerStandbyPorts(android.os.IBinder p0) throws android.os.RemoteException {}
        public java.util.List<android.os.IPowerManager.LowPowerStandbyPortDescription> getActiveLowPowerStandbyPorts() throws android.os.RemoteException { return null; }
        public void reboot(boolean p0, java.lang.String p1, boolean p2) throws android.os.RemoteException {}
        public void rebootSafeMode(boolean p0, boolean p1) throws android.os.RemoteException {}
        public void shutdown(boolean p0, java.lang.String p1, boolean p2) throws android.os.RemoteException {}
        public void crash(java.lang.String p0) throws android.os.RemoteException {}
        public int getLastShutdownReason() throws android.os.RemoteException { return 0; }
        public int getLastSleepReason() throws android.os.RemoteException { return 0; }
        public void setStayOnSetting(int p0) throws android.os.RemoteException {}
        public void boostScreenBrightness(long p0) throws android.os.RemoteException {}
        public void acquireWakeLockAsync(android.os.IBinder p0, int p1, java.lang.String p2, java.lang.String p3, android.os.WorkSource p4, java.lang.String p5) throws android.os.RemoteException {}
        public void releaseWakeLockAsync(android.os.IBinder p0, int p1) throws android.os.RemoteException {}
        public void updateWakeLockUidsAsync(android.os.IBinder p0, int[] p1) throws android.os.RemoteException {}
        public boolean isScreenBrightnessBoosted() throws android.os.RemoteException { return false; }
        public void setAttentionLight(boolean p0, int p1) throws android.os.RemoteException {}
        public void setDozeAfterScreenOff(boolean p0) throws android.os.RemoteException {}
        public boolean isAmbientDisplayAvailable() throws android.os.RemoteException { return false; }
        public void suppressAmbientDisplay(java.lang.String p0, boolean p1) throws android.os.RemoteException {}
        public void suppressAmbientDisplayBehavior(java.lang.String p0, int p1) throws android.os.RemoteException {}
        public boolean isAmbientDisplaySuppressedForToken(java.lang.String p0) throws android.os.RemoteException { return false; }
        public boolean isAmbientDisplaySuppressed() throws android.os.RemoteException { return false; }
        public boolean isAmbientDisplaySuppressedForTokenByApp(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
        public boolean forceSuspend() throws android.os.RemoteException { return false; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static class LowPowerStandbyPolicy implements android.os.Parcelable {
        public java.lang.String identifier;
        public java.util.List<java.lang.String> exemptPackages;
        public int allowedReasons;
        public java.util.List<java.lang.String> allowedFeatures;
        public static final android.os.Parcelable.Creator<android.os.IPowerManager.LowPowerStandbyPolicy> CREATOR = null;
        public LowPowerStandbyPolicy() {}
        public final void writeToParcel(android.os.Parcel p0, int p1) {}
        public final void readFromParcel(android.os.Parcel p0) {}
        public int describeContents() { return 0; }
    }

    public static class LowPowerStandbyPortDescription implements android.os.Parcelable {
        public int protocol;
        public int portMatcher;
        public int portNumber;
        public byte[] localAddress;
        public static final android.os.Parcelable.Creator<android.os.IPowerManager.LowPowerStandbyPortDescription> CREATOR = null;
        public LowPowerStandbyPortDescription() {}
        public final void writeToParcel(android.os.Parcel p0, int p1) {}
        public final void readFromParcel(android.os.Parcel p0) {}
        public int describeContents() { return 0; }
    }

    public static abstract class Stub extends android.os.Binder implements android.os.IPowerManager {
        public static final java.lang.String DESCRIPTOR = "android.os.IPowerManager";
        static final int TRANSACTION_acquireWakeLock = 1;
        static final int TRANSACTION_acquireWakeLockWithUid = 2;
        static final int TRANSACTION_releaseWakeLock = 3;
        static final int TRANSACTION_updateWakeLockUids = 4;
        static final int TRANSACTION_setPowerBoost = 5;
        static final int TRANSACTION_setPowerMode = 6;
        static final int TRANSACTION_setPowerModeChecked = 7;
        static final int TRANSACTION_updateWakeLockWorkSource = 8;
        static final int TRANSACTION_updateWakeLockCallback = 9;
        static final int TRANSACTION_isWakeLockLevelSupported = 10;
        static final int TRANSACTION_isWakeLockLevelSupportedWithDisplayId = 11;
        static final int TRANSACTION_addScreenTimeoutPolicyListener = 12;
        static final int TRANSACTION_removeScreenTimeoutPolicyListener = 13;
        static final int TRANSACTION_userActivity = 14;
        static final int TRANSACTION_wakeUp = 15;
        static final int TRANSACTION_wakeUpWithDisplayId = 16;
        static final int TRANSACTION_goToSleep = 17;
        static final int TRANSACTION_goToSleepWithDisplayId = 18;
        static final int TRANSACTION_nap = 19;
        static final int TRANSACTION_getBrightnessConstraint = 20;
        static final int TRANSACTION_isInteractive = 21;
        static final int TRANSACTION_isDisplayInteractive = 22;
        static final int TRANSACTION_areAutoPowerSaveModesEnabled = 23;
        static final int TRANSACTION_isPowerSaveMode = 24;
        static final int TRANSACTION_getPowerSaveState = 25;
        static final int TRANSACTION_setPowerSaveModeEnabled = 26;
        static final int TRANSACTION_isBatterySaverSupported = 27;
        static final int TRANSACTION_getFullPowerSavePolicy = 28;
        static final int TRANSACTION_setFullPowerSavePolicy = 29;
        static final int TRANSACTION_setDynamicPowerSaveHint = 30;
        static final int TRANSACTION_setAdaptivePowerSavePolicy = 31;
        static final int TRANSACTION_setAdaptivePowerSaveEnabled = 32;
        static final int TRANSACTION_getPowerSaveModeTrigger = 33;
        static final int TRANSACTION_setBatteryDischargePrediction = 34;
        static final int TRANSACTION_getBatteryDischargePrediction = 35;
        static final int TRANSACTION_isBatteryDischargePredictionPersonalized = 36;
        static final int TRANSACTION_isDeviceIdleMode = 37;
        static final int TRANSACTION_isLightDeviceIdleMode = 38;
        static final int TRANSACTION_isLowPowerStandbySupported = 39;
        static final int TRANSACTION_isLowPowerStandbyEnabled = 40;
        static final int TRANSACTION_setLowPowerStandbyEnabled = 41;
        static final int TRANSACTION_setLowPowerStandbyActiveDuringMaintenance = 42;
        static final int TRANSACTION_forceLowPowerStandbyActive = 43;
        static final int TRANSACTION_setLowPowerStandbyPolicy = 44;
        static final int TRANSACTION_getLowPowerStandbyPolicy = 45;
        static final int TRANSACTION_isExemptFromLowPowerStandby = 46;
        static final int TRANSACTION_isReasonAllowedInLowPowerStandby = 47;
        static final int TRANSACTION_isFeatureAllowedInLowPowerStandby = 48;
        static final int TRANSACTION_acquireLowPowerStandbyPorts = 49;
        static final int TRANSACTION_releaseLowPowerStandbyPorts = 50;
        static final int TRANSACTION_getActiveLowPowerStandbyPorts = 51;
        static final int TRANSACTION_reboot = 52;
        static final int TRANSACTION_rebootSafeMode = 53;
        static final int TRANSACTION_shutdown = 54;
        static final int TRANSACTION_crash = 55;
        static final int TRANSACTION_getLastShutdownReason = 56;
        static final int TRANSACTION_getLastSleepReason = 57;
        static final int TRANSACTION_setStayOnSetting = 58;
        static final int TRANSACTION_boostScreenBrightness = 59;
        static final int TRANSACTION_acquireWakeLockAsync = 60;
        static final int TRANSACTION_releaseWakeLockAsync = 61;
        static final int TRANSACTION_updateWakeLockUidsAsync = 62;
        static final int TRANSACTION_isScreenBrightnessBoosted = 63;
        static final int TRANSACTION_setAttentionLight = 64;
        static final int TRANSACTION_setDozeAfterScreenOff = 65;
        static final int TRANSACTION_isAmbientDisplayAvailable = 66;
        static final int TRANSACTION_suppressAmbientDisplay = 67;
        static final int TRANSACTION_suppressAmbientDisplayBehavior = 68;
        static final int TRANSACTION_isAmbientDisplaySuppressedForToken = 69;
        static final int TRANSACTION_isAmbientDisplaySuppressed = 70;
        static final int TRANSACTION_isAmbientDisplaySuppressedForTokenByApp = 71;
        static final int TRANSACTION_forceSuspend = 72;
        public Stub() { super(); }
        public static android.os.IPowerManager asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.os.IPowerManager {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void acquireWakeLock(android.os.IBinder p0, int p1, java.lang.String p2, java.lang.String p3, android.os.WorkSource p4, java.lang.String p5, int p6, android.os.IWakeLockCallback p7) throws android.os.RemoteException {}
            public void acquireWakeLockWithUid(android.os.IBinder p0, int p1, java.lang.String p2, java.lang.String p3, int p4, int p5, android.os.IWakeLockCallback p6) throws android.os.RemoteException {}
            public void releaseWakeLock(android.os.IBinder p0, int p1) throws android.os.RemoteException {}
            public void updateWakeLockUids(android.os.IBinder p0, int[] p1) throws android.os.RemoteException {}
            public void setPowerBoost(int p0, int p1) throws android.os.RemoteException {}
            public void setPowerMode(int p0, boolean p1) throws android.os.RemoteException {}
            public boolean setPowerModeChecked(int p0, boolean p1) throws android.os.RemoteException { return false; }
            public void updateWakeLockWorkSource(android.os.IBinder p0, android.os.WorkSource p1, java.lang.String p2) throws android.os.RemoteException {}
            public void updateWakeLockCallback(android.os.IBinder p0, android.os.IWakeLockCallback p1) throws android.os.RemoteException {}
            public boolean isWakeLockLevelSupported(int p0) throws android.os.RemoteException { return false; }
            public boolean isWakeLockLevelSupportedWithDisplayId(int p0, int p1) throws android.os.RemoteException { return false; }
            public void addScreenTimeoutPolicyListener(int p0, android.os.IScreenTimeoutPolicyListener p1) throws android.os.RemoteException {}
            public void removeScreenTimeoutPolicyListener(int p0, android.os.IScreenTimeoutPolicyListener p1) throws android.os.RemoteException {}
            public void userActivity(int p0, long p1, int p2, int p3) throws android.os.RemoteException {}
            public void wakeUp(long p0, int p1, java.lang.String p2, java.lang.String p3) throws android.os.RemoteException {}
            public void wakeUpWithDisplayId(long p0, int p1, java.lang.String p2, java.lang.String p3, int p4) throws android.os.RemoteException {}
            public void goToSleep(long p0, int p1, int p2) throws android.os.RemoteException {}
            public void goToSleepWithDisplayId(int p0, long p1, int p2, int p3) throws android.os.RemoteException {}
            public void nap(long p0) throws android.os.RemoteException {}
            public float getBrightnessConstraint(int p0, int p1) throws android.os.RemoteException { return 0.0f; }
            public boolean isInteractive() throws android.os.RemoteException { return false; }
            public boolean isDisplayInteractive(int p0) throws android.os.RemoteException { return false; }
            public boolean areAutoPowerSaveModesEnabled() throws android.os.RemoteException { return false; }
            public boolean isPowerSaveMode() throws android.os.RemoteException { return false; }
            public android.os.PowerSaveState getPowerSaveState(int p0) throws android.os.RemoteException { return null; }
            public boolean setPowerSaveModeEnabled(boolean p0) throws android.os.RemoteException { return false; }
            public boolean isBatterySaverSupported() throws android.os.RemoteException { return false; }
            public android.os.BatterySaverPolicyConfig getFullPowerSavePolicy() throws android.os.RemoteException { return null; }
            public boolean setFullPowerSavePolicy(android.os.BatterySaverPolicyConfig p0) throws android.os.RemoteException { return false; }
            public boolean setDynamicPowerSaveHint(boolean p0, int p1) throws android.os.RemoteException { return false; }
            public boolean setAdaptivePowerSavePolicy(android.os.BatterySaverPolicyConfig p0) throws android.os.RemoteException { return false; }
            public boolean setAdaptivePowerSaveEnabled(boolean p0) throws android.os.RemoteException { return false; }
            public int getPowerSaveModeTrigger() throws android.os.RemoteException { return 0; }
            public void setBatteryDischargePrediction(android.os.ParcelDuration p0, boolean p1) throws android.os.RemoteException {}
            public android.os.ParcelDuration getBatteryDischargePrediction() throws android.os.RemoteException { return null; }
            public boolean isBatteryDischargePredictionPersonalized() throws android.os.RemoteException { return false; }
            public boolean isDeviceIdleMode() throws android.os.RemoteException { return false; }
            public boolean isLightDeviceIdleMode() throws android.os.RemoteException { return false; }
            public boolean isLowPowerStandbySupported() throws android.os.RemoteException { return false; }
            public boolean isLowPowerStandbyEnabled() throws android.os.RemoteException { return false; }
            public void setLowPowerStandbyEnabled(boolean p0) throws android.os.RemoteException {}
            public void setLowPowerStandbyActiveDuringMaintenance(boolean p0) throws android.os.RemoteException {}
            public void forceLowPowerStandbyActive(boolean p0) throws android.os.RemoteException {}
            public void setLowPowerStandbyPolicy(android.os.IPowerManager.LowPowerStandbyPolicy p0) throws android.os.RemoteException {}
            public android.os.IPowerManager.LowPowerStandbyPolicy getLowPowerStandbyPolicy() throws android.os.RemoteException { return null; }
            public boolean isExemptFromLowPowerStandby() throws android.os.RemoteException { return false; }
            public boolean isReasonAllowedInLowPowerStandby(int p0) throws android.os.RemoteException { return false; }
            public boolean isFeatureAllowedInLowPowerStandby(java.lang.String p0) throws android.os.RemoteException { return false; }
            public void acquireLowPowerStandbyPorts(android.os.IBinder p0, java.util.List<android.os.IPowerManager.LowPowerStandbyPortDescription> p1) throws android.os.RemoteException {}
            public void releaseLowPowerStandbyPorts(android.os.IBinder p0) throws android.os.RemoteException {}
            public java.util.List<android.os.IPowerManager.LowPowerStandbyPortDescription> getActiveLowPowerStandbyPorts() throws android.os.RemoteException { return null; }
            public void reboot(boolean p0, java.lang.String p1, boolean p2) throws android.os.RemoteException {}
            public void rebootSafeMode(boolean p0, boolean p1) throws android.os.RemoteException {}
            public void shutdown(boolean p0, java.lang.String p1, boolean p2) throws android.os.RemoteException {}
            public void crash(java.lang.String p0) throws android.os.RemoteException {}
            public int getLastShutdownReason() throws android.os.RemoteException { return 0; }
            public int getLastSleepReason() throws android.os.RemoteException { return 0; }
            public void setStayOnSetting(int p0) throws android.os.RemoteException {}
            public void boostScreenBrightness(long p0) throws android.os.RemoteException {}
            public void acquireWakeLockAsync(android.os.IBinder p0, int p1, java.lang.String p2, java.lang.String p3, android.os.WorkSource p4, java.lang.String p5) throws android.os.RemoteException {}
            public void releaseWakeLockAsync(android.os.IBinder p0, int p1) throws android.os.RemoteException {}
            public void updateWakeLockUidsAsync(android.os.IBinder p0, int[] p1) throws android.os.RemoteException {}
            public boolean isScreenBrightnessBoosted() throws android.os.RemoteException { return false; }
            public void setAttentionLight(boolean p0, int p1) throws android.os.RemoteException {}
            public void setDozeAfterScreenOff(boolean p0) throws android.os.RemoteException {}
            public boolean isAmbientDisplayAvailable() throws android.os.RemoteException { return false; }
            public void suppressAmbientDisplay(java.lang.String p0, boolean p1) throws android.os.RemoteException {}
            public void suppressAmbientDisplayBehavior(java.lang.String p0, int p1) throws android.os.RemoteException {}
            public boolean isAmbientDisplaySuppressedForToken(java.lang.String p0) throws android.os.RemoteException { return false; }
            public boolean isAmbientDisplaySuppressed() throws android.os.RemoteException { return false; }
            public boolean isAmbientDisplaySuppressedForTokenByApp(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
            public boolean forceSuspend() throws android.os.RemoteException { return false; }
        }
    }
}
