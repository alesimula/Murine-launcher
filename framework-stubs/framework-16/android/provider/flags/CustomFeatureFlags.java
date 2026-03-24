package android.provider.flags;

public class CustomFeatureFlags implements android.provider.flags.FeatureFlags {
    public CustomFeatureFlags(java.util.function.BiPredicate<java.lang.String, java.util.function.Predicate<android.provider.flags.FeatureFlags>> p0) {}
    public boolean deviceConfigWritableNamespacesApi() { return false; }
    public boolean dumpImprovements() { return false; }
    public boolean mmdDeviceConfig() { return false; }
    public boolean newStoragePublicApi() { return false; }
    public boolean newStorageWriterSystemApi() { return false; }
    public boolean stageFlagsForBuild() { return false; }
    protected boolean getValue(java.lang.String p0, java.util.function.Predicate<android.provider.flags.FeatureFlags> p1) { return false; }
    public java.util.List<java.lang.String> getFlagNames() { return null; }
    public boolean isFlagFinalized(java.lang.String p0) { return false; }
}
