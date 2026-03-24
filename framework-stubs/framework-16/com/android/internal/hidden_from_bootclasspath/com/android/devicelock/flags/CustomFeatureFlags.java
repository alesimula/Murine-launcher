package com.android.internal.hidden_from_bootclasspath.com.android.devicelock.flags;

public class CustomFeatureFlags implements com.android.internal.hidden_from_bootclasspath.com.android.devicelock.flags.FeatureFlags {
    public CustomFeatureFlags(java.util.function.BiPredicate<java.lang.String, java.util.function.Predicate<com.android.internal.hidden_from_bootclasspath.com.android.devicelock.flags.FeatureFlags>> p0) {}
    public boolean clearDeviceRestrictions() { return false; }
    public boolean deviceIdTypeSerial() { return false; }
    public boolean extraDeviceLockVersion() { return false; }
    public boolean getEnrollmentType() { return false; }
    public boolean notifyKioskSetupFinished() { return false; }
    protected boolean getValue(java.lang.String p0, java.util.function.Predicate<com.android.internal.hidden_from_bootclasspath.com.android.devicelock.flags.FeatureFlags> p1) { return false; }
    public java.util.List<java.lang.String> getFlagNames() { return null; }
    public boolean isFlagFinalized(java.lang.String p0) { return false; }
}
