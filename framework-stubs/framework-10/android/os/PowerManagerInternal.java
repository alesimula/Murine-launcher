package android.os;

public abstract class PowerManagerInternal {
    public static final int WAKEFULNESS_ASLEEP = 0;
    public static final int WAKEFULNESS_AWAKE = 1;
    public static final int WAKEFULNESS_DREAMING = 2;
    public static final int WAKEFULNESS_DOZING = 3;
    public PowerManagerInternal() {}
    public static java.lang.String wakefulnessToString(int p0) { return null; }
    public static int wakefulnessToProtoEnum(int p0) { return 0; }
    public static boolean isInteractive(int p0) { return false; }
    public abstract void setScreenBrightnessOverrideFromWindowManager(int p0);
    public abstract void setUserActivityTimeoutOverrideFromWindowManager(long p0);
    public abstract void setUserInactiveOverrideFromWindowManager();
    public abstract void setMaximumScreenOffTimeoutFromDeviceAdmin(int p0, long p1);
    public abstract void setDozeOverrideFromDreamManager(int p0, int p1);
    public abstract void setDrawWakeLockOverrideFromSidekick(boolean p0);
    public abstract android.os.PowerSaveState getLowPowerState(int p0);
    public abstract void registerLowPowerModeObserver(android.os.PowerManagerInternal.LowPowerModeListener p0);
    public void registerLowPowerModeObserver(int p0, java.util.function.Consumer<android.os.PowerSaveState> p1) {}
    public abstract boolean setDeviceIdleMode(boolean p0);
    public abstract boolean setLightDeviceIdleMode(boolean p0);
    public abstract void setDeviceIdleWhitelist(int[] p0);
    public abstract void setDeviceIdleTempWhitelist(int[] p0);
    public abstract void startUidChanges();
    public abstract void finishUidChanges();
    public abstract void updateUidProcState(int p0, int p1);
    public abstract void uidGone(int p0);
    public abstract void uidActive(int p0);
    public abstract void uidIdle(int p0);
    public abstract void powerHint(int p0, int p1);
    public abstract boolean wasDeviceIdleFor(long p0);
    public abstract android.os.PowerManager.WakeData getLastWakeup();

    public static interface LowPowerModeListener {
        public int getServiceType();
        public void onLowPowerModeChanged(android.os.PowerSaveState p0);
    }
}
