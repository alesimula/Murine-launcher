package android.crashrecovery.flags;

public class CustomFeatureFlags implements android.crashrecovery.flags.FeatureFlags {
    public CustomFeatureFlags(java.util.function.BiPredicate<java.lang.String, java.util.function.Predicate<android.crashrecovery.flags.FeatureFlags>> p0) {}
    public boolean allowRescuePartyFlagResets() { return false; }
    public boolean enableCrashrecovery() { return false; }
    public boolean recoverabilityDetection() { return false; }
    public boolean reenableSettingsResets() { return false; }
    public boolean isFlagReadOnlyOptimized(java.lang.String p0) { return false; }
    protected boolean getValue(java.lang.String p0, java.util.function.Predicate<android.crashrecovery.flags.FeatureFlags> p1) { return false; }
    public java.util.List<java.lang.String> getFlagNames() { return null; }
}
