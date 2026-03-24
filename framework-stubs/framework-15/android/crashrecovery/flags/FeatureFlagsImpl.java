package android.crashrecovery.flags;

public final class FeatureFlagsImpl implements android.crashrecovery.flags.FeatureFlags {
    public FeatureFlagsImpl() {}
    public boolean allowRescuePartyFlagResets() { return false; }
    public boolean enableCrashrecovery() { return false; }
    public boolean recoverabilityDetection() { return false; }
    public boolean reenableSettingsResets() { return false; }
}
