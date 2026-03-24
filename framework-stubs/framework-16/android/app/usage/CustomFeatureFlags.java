package android.app.usage;

public class CustomFeatureFlags implements android.app.usage.FeatureFlags {
    public CustomFeatureFlags(java.util.function.BiPredicate<java.lang.String, java.util.function.Predicate<android.app.usage.FeatureFlags>> p0) {}
    public boolean filterBasedEventQueryApi() { return false; }
    public boolean getAppArtManagedBytes() { return false; }
    public boolean getAppBytesByDataTypeApi() { return false; }
    public boolean reportUsageStatsPermission() { return false; }
    public boolean useDedicatedHandlerThread() { return false; }
    public boolean useParceledList() { return false; }
    public boolean userInteractionTypeApi() { return false; }
    public boolean isFlagReadOnlyOptimized(java.lang.String p0) { return false; }
    protected boolean getValue(java.lang.String p0, java.util.function.Predicate<android.app.usage.FeatureFlags> p1) { return false; }
    public java.util.List<java.lang.String> getFlagNames() { return null; }
}
