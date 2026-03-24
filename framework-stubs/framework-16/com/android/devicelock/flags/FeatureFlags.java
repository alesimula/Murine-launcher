package com.android.devicelock.flags;

public interface FeatureFlags {
    public boolean clearDeviceRestrictions();
    public boolean deviceIdTypeSerial();
    public boolean extraDeviceLockVersion();
    public boolean getEnrollmentType();
    public boolean notifyKioskSetupFinished();
}
