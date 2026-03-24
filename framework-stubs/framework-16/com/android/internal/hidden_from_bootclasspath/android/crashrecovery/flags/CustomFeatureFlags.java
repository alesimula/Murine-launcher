package com.android.internal.hidden_from_bootclasspath.android.crashrecovery.flags;

public class CustomFeatureFlags implements com.android.internal.hidden_from_bootclasspath.android.crashrecovery.flags.FeatureFlags {
    public CustomFeatureFlags(java.util.function.BiPredicate<java.lang.String, java.util.function.Predicate<com.android.internal.hidden_from_bootclasspath.android.crashrecovery.flags.FeatureFlags>> p0) {}
    public boolean allowRescuePartyFlagResets() { return false; }
    public boolean deprecateFlagsAndSettingsResets() { return false; }
    public boolean enableCrashrecovery() { return false; }
    public boolean extendRollbackLifetime() { return false; }
    public boolean recoverabilityDetection() { return false; }
    public boolean refactorCrashrecovery() { return false; }
    public boolean synchronousRebootInRescueParty() { return false; }
    public boolean isFlagReadOnlyOptimized(java.lang.String p0) { return false; }
    protected boolean getValue(java.lang.String p0, java.util.function.Predicate<com.android.internal.hidden_from_bootclasspath.android.crashrecovery.flags.FeatureFlags> p1) { return false; }
    public java.util.List<java.lang.String> getFlagNames() { return null; }
}
