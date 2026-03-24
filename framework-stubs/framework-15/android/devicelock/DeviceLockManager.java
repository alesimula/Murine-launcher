package android.devicelock;

public final class DeviceLockManager {
    public static final int DEVICE_LOCK_ROLE_FINANCING = 0;
    DeviceLockManager() {}
    public void getDeviceId(java.util.concurrent.Executor p0, android.os.OutcomeReceiver<android.devicelock.DeviceId, java.lang.Exception> p1) {}
    public void getKioskApps(java.util.concurrent.Executor p0, android.os.OutcomeReceiver<java.util.Map<java.lang.Integer, java.lang.String>, java.lang.Exception> p1) {}
    public void isDeviceLocked(java.util.concurrent.Executor p0, android.os.OutcomeReceiver<java.lang.Boolean, java.lang.Exception> p1) {}
    public void lockDevice(java.util.concurrent.Executor p0, android.os.OutcomeReceiver<java.lang.Void, java.lang.Exception> p1) {}
    public void unlockDevice(java.util.concurrent.Executor p0, android.os.OutcomeReceiver<java.lang.Void, java.lang.Exception> p1) {}
}
