package com.android.internal.hidden_from_bootclasspath.android.crashrecovery.flags;

public interface FeatureFlags {
    public boolean allowRescuePartyFlagResets();
    public boolean deprecateFlagsAndSettingsResets();
    public boolean enableCrashrecovery();
    public boolean extendRollbackLifetime();
    public boolean recoverabilityDetection();
    public boolean refactorCrashrecovery();
    public boolean synchronousRebootInRescueParty();
}
