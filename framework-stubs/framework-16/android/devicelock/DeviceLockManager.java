package android.devicelock;

public final class DeviceLockManager {
    public static final int DEVICE_LOCK_ROLE_FINANCING = 0;
    @android.annotation.FlaggedApi("com.android.devicelock.flags.get_enrollment_type")
    public static final int ENROLLMENT_TYPE_FINANCE = 1;
    @android.annotation.FlaggedApi("com.android.devicelock.flags.get_enrollment_type")
    public static final int ENROLLMENT_TYPE_NONE = 0;
    @android.annotation.FlaggedApi("com.android.devicelock.flags.get_enrollment_type")
    public static final int ENROLLMENT_TYPE_SUBSIDY = 2;
    @android.annotation.FlaggedApi("com.android.devicelock.flags.extra_device_lock_version")
    public static final java.lang.String EXTRA_DEVICE_LOCK_VERSION = "android.devicelock.extra.DEVICE_LOCK_VERSION";
    DeviceLockManager() {}
    @android.annotation.FlaggedApi("com.android.devicelock.flags.clear_device_restrictions")
    public void clearDeviceRestrictions(java.util.concurrent.Executor p0, android.os.OutcomeReceiver<java.lang.Void, java.lang.Exception> p1) {}
    public void getDeviceId(java.util.concurrent.Executor p0, android.os.OutcomeReceiver<android.devicelock.DeviceId, java.lang.Exception> p1) {}
    @android.annotation.FlaggedApi("com.android.devicelock.flags.get_enrollment_type")
    public void getEnrollmentType(java.util.concurrent.Executor p0, android.os.OutcomeReceiver<java.lang.Integer, java.lang.Exception> p1) {}
    public void getKioskApps(java.util.concurrent.Executor p0, android.os.OutcomeReceiver<java.util.Map<java.lang.Integer, java.lang.String>, java.lang.Exception> p1) {}
    public void isDeviceLocked(java.util.concurrent.Executor p0, android.os.OutcomeReceiver<java.lang.Boolean, java.lang.Exception> p1) {}
    public void lockDevice(java.util.concurrent.Executor p0, android.os.OutcomeReceiver<java.lang.Void, java.lang.Exception> p1) {}
    @android.annotation.FlaggedApi("com.android.devicelock.flags.notify_kiosk_setup_finished")
    public void notifyKioskSetupFinished(java.util.concurrent.Executor p0, android.os.OutcomeReceiver<java.lang.Void, java.lang.Exception> p1) {}
    public void unlockDevice(java.util.concurrent.Executor p0, android.os.OutcomeReceiver<java.lang.Void, java.lang.Exception> p1) {}
}
