package android.crashrecovery.flags;

public interface FeatureFlags {
    public boolean allowRescuePartyFlagResets();
    public boolean enableCrashrecovery();
    public boolean recoverabilityDetection();
    public boolean reenableSettingsResets();
}
