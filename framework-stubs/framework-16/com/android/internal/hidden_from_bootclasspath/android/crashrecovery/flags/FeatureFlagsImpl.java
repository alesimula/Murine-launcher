package com.android.internal.hidden_from_bootclasspath.android.crashrecovery.flags;

public final class FeatureFlagsImpl implements com.android.internal.hidden_from_bootclasspath.android.crashrecovery.flags.FeatureFlags {
    public FeatureFlagsImpl() {}
    public boolean allowRescuePartyFlagResets() { return false; }
    public boolean deprecateFlagsAndSettingsResets() { return false; }
    public boolean enableCrashrecovery() { return false; }
    public boolean extendRollbackLifetime() { return false; }
    public boolean recoverabilityDetection() { return false; }
    public boolean refactorCrashrecovery() { return false; }
    public boolean synchronousRebootInRescueParty() { return false; }
}
