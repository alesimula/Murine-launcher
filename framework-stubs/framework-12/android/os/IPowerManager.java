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
    public void acquireWakeLock(android.os.IBinder p0, int p1, java.lang.String p2, java.lang.String p3, android.os.WorkSource p4, java.lang.String p5, int p6) throws android.os.RemoteException;
    public void acquireWakeLockWithUid(android.os.IBinder p0, int p1, java.lang.String p2, java.lang.String p3, int p4, int p5) throws android.os.RemoteException;
    public void releaseWakeLock(android.os.IBinder p0, int p1) throws android.os.RemoteException;
    public void updateWakeLockUids(android.os.IBinder p0, int[] p1) throws android.os.RemoteException;
    public void setPowerBoost(int p0, int p1) throws android.os.RemoteException;
    public void setPowerMode(int p0, boolean p1) throws android.os.RemoteException;
    public boolean setPowerModeChecked(int p0, boolean p1) throws android.os.RemoteException;
    public void updateWakeLockWorkSource(android.os.IBinder p0, android.os.WorkSource p1, java.lang.String p2) throws android.os.RemoteException;
    public boolean isWakeLockLevelSupported(int p0) throws android.os.RemoteException;
    public void userActivity(int p0, long p1, int p2, int p3) throws android.os.RemoteException;
    public void wakeUp(long p0, int p1, java.lang.String p2, java.lang.String p3) throws android.os.RemoteException;
    public void goToSleep(long p0, int p1, int p2) throws android.os.RemoteException;
    public void nap(long p0) throws android.os.RemoteException;
    public float getBrightnessConstraint(int p0) throws android.os.RemoteException;
    public boolean isInteractive() throws android.os.RemoteException;
    public boolean isPowerSaveMode() throws android.os.RemoteException;
    public android.os.PowerSaveState getPowerSaveState(int p0) throws android.os.RemoteException;
    public boolean setPowerSaveModeEnabled(boolean p0) throws android.os.RemoteException;
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
    public boolean isAmbientDisplaySuppressedForToken(java.lang.String p0) throws android.os.RemoteException;
    public boolean isAmbientDisplaySuppressed() throws android.os.RemoteException;
    public boolean isAmbientDisplaySuppressedForTokenByApp(java.lang.String p0, int p1) throws android.os.RemoteException;
    public boolean forceSuspend() throws android.os.RemoteException;

    public static class Default implements android.os.IPowerManager {
        public Default() {}
        public void acquireWakeLock(android.os.IBinder p0, int p1, java.lang.String p2, java.lang.String p3, android.os.WorkSource p4, java.lang.String p5, int p6) throws android.os.RemoteException {}
        public void acquireWakeLockWithUid(android.os.IBinder p0, int p1, java.lang.String p2, java.lang.String p3, int p4, int p5) throws android.os.RemoteException {}
        public void releaseWakeLock(android.os.IBinder p0, int p1) throws android.os.RemoteException {}
        public void updateWakeLockUids(android.os.IBinder p0, int[] p1) throws android.os.RemoteException {}
        public void setPowerBoost(int p0, int p1) throws android.os.RemoteException {}
        public void setPowerMode(int p0, boolean p1) throws android.os.RemoteException {}
        public boolean setPowerModeChecked(int p0, boolean p1) throws android.os.RemoteException { return false; }
        public void updateWakeLockWorkSource(android.os.IBinder p0, android.os.WorkSource p1, java.lang.String p2) throws android.os.RemoteException {}
        public boolean isWakeLockLevelSupported(int p0) throws android.os.RemoteException { return false; }
        public void userActivity(int p0, long p1, int p2, int p3) throws android.os.RemoteException {}
        public void wakeUp(long p0, int p1, java.lang.String p2, java.lang.String p3) throws android.os.RemoteException {}
        public void goToSleep(long p0, int p1, int p2) throws android.os.RemoteException {}
        public void nap(long p0) throws android.os.RemoteException {}
        public float getBrightnessConstraint(int p0) throws android.os.RemoteException { return 0.0f; }
        public boolean isInteractive() throws android.os.RemoteException { return false; }
        public boolean isPowerSaveMode() throws android.os.RemoteException { return false; }
        public android.os.PowerSaveState getPowerSaveState(int p0) throws android.os.RemoteException { return null; }
        public boolean setPowerSaveModeEnabled(boolean p0) throws android.os.RemoteException { return false; }
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
        public boolean isAmbientDisplaySuppressedForToken(java.lang.String p0) throws android.os.RemoteException { return false; }
        public boolean isAmbientDisplaySuppressed() throws android.os.RemoteException { return false; }
        public boolean isAmbientDisplaySuppressedForTokenByApp(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
        public boolean forceSuspend() throws android.os.RemoteException { return false; }
        public android.os.IBinder asBinder() { return null; }
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
        static final int TRANSACTION_isWakeLockLevelSupported = 9;
        static final int TRANSACTION_userActivity = 10;
        static final int TRANSACTION_wakeUp = 11;
        static final int TRANSACTION_goToSleep = 12;
        static final int TRANSACTION_nap = 13;
        static final int TRANSACTION_getBrightnessConstraint = 14;
        static final int TRANSACTION_isInteractive = 15;
        static final int TRANSACTION_isPowerSaveMode = 16;
        static final int TRANSACTION_getPowerSaveState = 17;
        static final int TRANSACTION_setPowerSaveModeEnabled = 18;
        static final int TRANSACTION_getFullPowerSavePolicy = 19;
        static final int TRANSACTION_setFullPowerSavePolicy = 20;
        static final int TRANSACTION_setDynamicPowerSaveHint = 21;
        static final int TRANSACTION_setAdaptivePowerSavePolicy = 22;
        static final int TRANSACTION_setAdaptivePowerSaveEnabled = 23;
        static final int TRANSACTION_getPowerSaveModeTrigger = 24;
        static final int TRANSACTION_setBatteryDischargePrediction = 25;
        static final int TRANSACTION_getBatteryDischargePrediction = 26;
        static final int TRANSACTION_isBatteryDischargePredictionPersonalized = 27;
        static final int TRANSACTION_isDeviceIdleMode = 28;
        static final int TRANSACTION_isLightDeviceIdleMode = 29;
        static final int TRANSACTION_reboot = 30;
        static final int TRANSACTION_rebootSafeMode = 31;
        static final int TRANSACTION_shutdown = 32;
        static final int TRANSACTION_crash = 33;
        static final int TRANSACTION_getLastShutdownReason = 34;
        static final int TRANSACTION_getLastSleepReason = 35;
        static final int TRANSACTION_setStayOnSetting = 36;
        static final int TRANSACTION_boostScreenBrightness = 37;
        static final int TRANSACTION_acquireWakeLockAsync = 38;
        static final int TRANSACTION_releaseWakeLockAsync = 39;
        static final int TRANSACTION_updateWakeLockUidsAsync = 40;
        static final int TRANSACTION_isScreenBrightnessBoosted = 41;
        static final int TRANSACTION_setAttentionLight = 42;
        static final int TRANSACTION_setDozeAfterScreenOff = 43;
        static final int TRANSACTION_isAmbientDisplayAvailable = 44;
        static final int TRANSACTION_suppressAmbientDisplay = 45;
        static final int TRANSACTION_isAmbientDisplaySuppressedForToken = 46;
        static final int TRANSACTION_isAmbientDisplaySuppressed = 47;
        static final int TRANSACTION_isAmbientDisplaySuppressedForTokenByApp = 48;
        static final int TRANSACTION_forceSuspend = 49;
        public Stub() { super(); }
        public static android.os.IPowerManager asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.os.IPowerManager p0) { return false; }
        public static android.os.IPowerManager getDefaultImpl() { return null; }

        private static class Proxy implements android.os.IPowerManager {
            private android.os.IBinder mRemote;
            public static android.os.IPowerManager sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void acquireWakeLock(android.os.IBinder p0, int p1, java.lang.String p2, java.lang.String p3, android.os.WorkSource p4, java.lang.String p5, int p6) throws android.os.RemoteException {}
            public void acquireWakeLockWithUid(android.os.IBinder p0, int p1, java.lang.String p2, java.lang.String p3, int p4, int p5) throws android.os.RemoteException {}
            public void releaseWakeLock(android.os.IBinder p0, int p1) throws android.os.RemoteException {}
            public void updateWakeLockUids(android.os.IBinder p0, int[] p1) throws android.os.RemoteException {}
            public void setPowerBoost(int p0, int p1) throws android.os.RemoteException {}
            public void setPowerMode(int p0, boolean p1) throws android.os.RemoteException {}
            public boolean setPowerModeChecked(int p0, boolean p1) throws android.os.RemoteException { return false; }
            public void updateWakeLockWorkSource(android.os.IBinder p0, android.os.WorkSource p1, java.lang.String p2) throws android.os.RemoteException {}
            public boolean isWakeLockLevelSupported(int p0) throws android.os.RemoteException { return false; }
            public void userActivity(int p0, long p1, int p2, int p3) throws android.os.RemoteException {}
            public void wakeUp(long p0, int p1, java.lang.String p2, java.lang.String p3) throws android.os.RemoteException {}
            public void goToSleep(long p0, int p1, int p2) throws android.os.RemoteException {}
            public void nap(long p0) throws android.os.RemoteException {}
            public float getBrightnessConstraint(int p0) throws android.os.RemoteException { return 0.0f; }
            public boolean isInteractive() throws android.os.RemoteException { return false; }
            public boolean isPowerSaveMode() throws android.os.RemoteException { return false; }
            public android.os.PowerSaveState getPowerSaveState(int p0) throws android.os.RemoteException { return null; }
            public boolean setPowerSaveModeEnabled(boolean p0) throws android.os.RemoteException { return false; }
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
            public boolean isAmbientDisplaySuppressedForToken(java.lang.String p0) throws android.os.RemoteException { return false; }
            public boolean isAmbientDisplaySuppressed() throws android.os.RemoteException { return false; }
            public boolean isAmbientDisplaySuppressedForTokenByApp(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
            public boolean forceSuspend() throws android.os.RemoteException { return false; }
        }
    }
}
