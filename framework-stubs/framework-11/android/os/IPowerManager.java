package android.os;

public interface IPowerManager extends android.os.IInterface {
    public void acquireWakeLock(android.os.IBinder p0, int p1, java.lang.String p2, java.lang.String p3, android.os.WorkSource p4, java.lang.String p5) throws android.os.RemoteException;
    public void acquireWakeLockWithUid(android.os.IBinder p0, int p1, java.lang.String p2, java.lang.String p3, int p4) throws android.os.RemoteException;
    public void releaseWakeLock(android.os.IBinder p0, int p1) throws android.os.RemoteException;
    public void updateWakeLockUids(android.os.IBinder p0, int[] p1) throws android.os.RemoteException;
    public void powerHint(int p0, int p1) throws android.os.RemoteException;
    public void setPowerBoost(int p0, int p1) throws android.os.RemoteException;
    public void setPowerMode(int p0, boolean p1) throws android.os.RemoteException;
    public boolean setPowerModeChecked(int p0, boolean p1) throws android.os.RemoteException;
    public void updateWakeLockWorkSource(android.os.IBinder p0, android.os.WorkSource p1, java.lang.String p2) throws android.os.RemoteException;
    public boolean isWakeLockLevelSupported(int p0) throws android.os.RemoteException;
    public void userActivity(long p0, int p1, int p2) throws android.os.RemoteException;
    public void wakeUp(long p0, int p1, java.lang.String p2, java.lang.String p3) throws android.os.RemoteException;
    public void goToSleep(long p0, int p1, int p2) throws android.os.RemoteException;
    public void nap(long p0) throws android.os.RemoteException;
    public float getBrightnessConstraint(int p0) throws android.os.RemoteException;
    public boolean isInteractive() throws android.os.RemoteException;
    public boolean isPowerSaveMode() throws android.os.RemoteException;
    public android.os.PowerSaveState getPowerSaveState(int p0) throws android.os.RemoteException;
    public boolean setPowerSaveModeEnabled(boolean p0) throws android.os.RemoteException;
    public boolean setDynamicPowerSaveHint(boolean p0, int p1) throws android.os.RemoteException;
    public boolean setAdaptivePowerSavePolicy(android.os.BatterySaverPolicyConfig p0) throws android.os.RemoteException;
    public boolean setAdaptivePowerSaveEnabled(boolean p0) throws android.os.RemoteException;
    public int getPowerSaveModeTrigger() throws android.os.RemoteException;
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
    public boolean isScreenBrightnessBoosted() throws android.os.RemoteException;
    public void setAttentionLight(boolean p0, int p1) throws android.os.RemoteException;
    public void setDozeAfterScreenOff(boolean p0) throws android.os.RemoteException;
    public boolean isAmbientDisplayAvailable() throws android.os.RemoteException;
    public void suppressAmbientDisplay(java.lang.String p0, boolean p1) throws android.os.RemoteException;
    public boolean isAmbientDisplaySuppressedForToken(java.lang.String p0) throws android.os.RemoteException;
    public boolean isAmbientDisplaySuppressed() throws android.os.RemoteException;
    public boolean forceSuspend() throws android.os.RemoteException;

    public static class Default implements android.os.IPowerManager {
        public Default() {}
        public void acquireWakeLock(android.os.IBinder p0, int p1, java.lang.String p2, java.lang.String p3, android.os.WorkSource p4, java.lang.String p5) throws android.os.RemoteException {}
        public void acquireWakeLockWithUid(android.os.IBinder p0, int p1, java.lang.String p2, java.lang.String p3, int p4) throws android.os.RemoteException {}
        public void releaseWakeLock(android.os.IBinder p0, int p1) throws android.os.RemoteException {}
        public void updateWakeLockUids(android.os.IBinder p0, int[] p1) throws android.os.RemoteException {}
        public void powerHint(int p0, int p1) throws android.os.RemoteException {}
        public void setPowerBoost(int p0, int p1) throws android.os.RemoteException {}
        public void setPowerMode(int p0, boolean p1) throws android.os.RemoteException {}
        public boolean setPowerModeChecked(int p0, boolean p1) throws android.os.RemoteException { return false; }
        public void updateWakeLockWorkSource(android.os.IBinder p0, android.os.WorkSource p1, java.lang.String p2) throws android.os.RemoteException {}
        public boolean isWakeLockLevelSupported(int p0) throws android.os.RemoteException { return false; }
        public void userActivity(long p0, int p1, int p2) throws android.os.RemoteException {}
        public void wakeUp(long p0, int p1, java.lang.String p2, java.lang.String p3) throws android.os.RemoteException {}
        public void goToSleep(long p0, int p1, int p2) throws android.os.RemoteException {}
        public void nap(long p0) throws android.os.RemoteException {}
        public float getBrightnessConstraint(int p0) throws android.os.RemoteException { return 0.0f; }
        public boolean isInteractive() throws android.os.RemoteException { return false; }
        public boolean isPowerSaveMode() throws android.os.RemoteException { return false; }
        public android.os.PowerSaveState getPowerSaveState(int p0) throws android.os.RemoteException { return null; }
        public boolean setPowerSaveModeEnabled(boolean p0) throws android.os.RemoteException { return false; }
        public boolean setDynamicPowerSaveHint(boolean p0, int p1) throws android.os.RemoteException { return false; }
        public boolean setAdaptivePowerSavePolicy(android.os.BatterySaverPolicyConfig p0) throws android.os.RemoteException { return false; }
        public boolean setAdaptivePowerSaveEnabled(boolean p0) throws android.os.RemoteException { return false; }
        public int getPowerSaveModeTrigger() throws android.os.RemoteException { return 0; }
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
        public boolean isScreenBrightnessBoosted() throws android.os.RemoteException { return false; }
        public void setAttentionLight(boolean p0, int p1) throws android.os.RemoteException {}
        public void setDozeAfterScreenOff(boolean p0) throws android.os.RemoteException {}
        public boolean isAmbientDisplayAvailable() throws android.os.RemoteException { return false; }
        public void suppressAmbientDisplay(java.lang.String p0, boolean p1) throws android.os.RemoteException {}
        public boolean isAmbientDisplaySuppressedForToken(java.lang.String p0) throws android.os.RemoteException { return false; }
        public boolean isAmbientDisplaySuppressed() throws android.os.RemoteException { return false; }
        public boolean forceSuspend() throws android.os.RemoteException { return false; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.os.IPowerManager {
        private static final java.lang.String DESCRIPTOR = "android.os.IPowerManager";
        static final int TRANSACTION_acquireWakeLock = 1;
        static final int TRANSACTION_acquireWakeLockWithUid = 2;
        static final int TRANSACTION_releaseWakeLock = 3;
        static final int TRANSACTION_updateWakeLockUids = 4;
        static final int TRANSACTION_powerHint = 5;
        static final int TRANSACTION_setPowerBoost = 6;
        static final int TRANSACTION_setPowerMode = 7;
        static final int TRANSACTION_setPowerModeChecked = 8;
        static final int TRANSACTION_updateWakeLockWorkSource = 9;
        static final int TRANSACTION_isWakeLockLevelSupported = 10;
        static final int TRANSACTION_userActivity = 11;
        static final int TRANSACTION_wakeUp = 12;
        static final int TRANSACTION_goToSleep = 13;
        static final int TRANSACTION_nap = 14;
        static final int TRANSACTION_getBrightnessConstraint = 15;
        static final int TRANSACTION_isInteractive = 16;
        static final int TRANSACTION_isPowerSaveMode = 17;
        static final int TRANSACTION_getPowerSaveState = 18;
        static final int TRANSACTION_setPowerSaveModeEnabled = 19;
        static final int TRANSACTION_setDynamicPowerSaveHint = 20;
        static final int TRANSACTION_setAdaptivePowerSavePolicy = 21;
        static final int TRANSACTION_setAdaptivePowerSaveEnabled = 22;
        static final int TRANSACTION_getPowerSaveModeTrigger = 23;
        static final int TRANSACTION_isDeviceIdleMode = 24;
        static final int TRANSACTION_isLightDeviceIdleMode = 25;
        static final int TRANSACTION_reboot = 26;
        static final int TRANSACTION_rebootSafeMode = 27;
        static final int TRANSACTION_shutdown = 28;
        static final int TRANSACTION_crash = 29;
        static final int TRANSACTION_getLastShutdownReason = 30;
        static final int TRANSACTION_getLastSleepReason = 31;
        static final int TRANSACTION_setStayOnSetting = 32;
        static final int TRANSACTION_boostScreenBrightness = 33;
        static final int TRANSACTION_isScreenBrightnessBoosted = 34;
        static final int TRANSACTION_setAttentionLight = 35;
        static final int TRANSACTION_setDozeAfterScreenOff = 36;
        static final int TRANSACTION_isAmbientDisplayAvailable = 37;
        static final int TRANSACTION_suppressAmbientDisplay = 38;
        static final int TRANSACTION_isAmbientDisplaySuppressedForToken = 39;
        static final int TRANSACTION_isAmbientDisplaySuppressed = 40;
        static final int TRANSACTION_forceSuspend = 41;
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
            public void acquireWakeLock(android.os.IBinder p0, int p1, java.lang.String p2, java.lang.String p3, android.os.WorkSource p4, java.lang.String p5) throws android.os.RemoteException {}
            public void acquireWakeLockWithUid(android.os.IBinder p0, int p1, java.lang.String p2, java.lang.String p3, int p4) throws android.os.RemoteException {}
            public void releaseWakeLock(android.os.IBinder p0, int p1) throws android.os.RemoteException {}
            public void updateWakeLockUids(android.os.IBinder p0, int[] p1) throws android.os.RemoteException {}
            public void powerHint(int p0, int p1) throws android.os.RemoteException {}
            public void setPowerBoost(int p0, int p1) throws android.os.RemoteException {}
            public void setPowerMode(int p0, boolean p1) throws android.os.RemoteException {}
            public boolean setPowerModeChecked(int p0, boolean p1) throws android.os.RemoteException { return false; }
            public void updateWakeLockWorkSource(android.os.IBinder p0, android.os.WorkSource p1, java.lang.String p2) throws android.os.RemoteException {}
            public boolean isWakeLockLevelSupported(int p0) throws android.os.RemoteException { return false; }
            public void userActivity(long p0, int p1, int p2) throws android.os.RemoteException {}
            public void wakeUp(long p0, int p1, java.lang.String p2, java.lang.String p3) throws android.os.RemoteException {}
            public void goToSleep(long p0, int p1, int p2) throws android.os.RemoteException {}
            public void nap(long p0) throws android.os.RemoteException {}
            public float getBrightnessConstraint(int p0) throws android.os.RemoteException { return 0.0f; }
            public boolean isInteractive() throws android.os.RemoteException { return false; }
            public boolean isPowerSaveMode() throws android.os.RemoteException { return false; }
            public android.os.PowerSaveState getPowerSaveState(int p0) throws android.os.RemoteException { return null; }
            public boolean setPowerSaveModeEnabled(boolean p0) throws android.os.RemoteException { return false; }
            public boolean setDynamicPowerSaveHint(boolean p0, int p1) throws android.os.RemoteException { return false; }
            public boolean setAdaptivePowerSavePolicy(android.os.BatterySaverPolicyConfig p0) throws android.os.RemoteException { return false; }
            public boolean setAdaptivePowerSaveEnabled(boolean p0) throws android.os.RemoteException { return false; }
            public int getPowerSaveModeTrigger() throws android.os.RemoteException { return 0; }
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
            public boolean isScreenBrightnessBoosted() throws android.os.RemoteException { return false; }
            public void setAttentionLight(boolean p0, int p1) throws android.os.RemoteException {}
            public void setDozeAfterScreenOff(boolean p0) throws android.os.RemoteException {}
            public boolean isAmbientDisplayAvailable() throws android.os.RemoteException { return false; }
            public void suppressAmbientDisplay(java.lang.String p0, boolean p1) throws android.os.RemoteException {}
            public boolean isAmbientDisplaySuppressedForToken(java.lang.String p0) throws android.os.RemoteException { return false; }
            public boolean isAmbientDisplaySuppressed() throws android.os.RemoteException { return false; }
            public boolean forceSuspend() throws android.os.RemoteException { return false; }
        }
    }
}
