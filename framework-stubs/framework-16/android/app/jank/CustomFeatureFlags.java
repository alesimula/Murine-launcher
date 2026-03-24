package android.app.jank;

public class CustomFeatureFlags implements android.app.jank.FeatureFlags {
    public CustomFeatureFlags(java.util.function.BiPredicate<java.lang.String, java.util.function.Predicate<android.app.jank.FeatureFlags>> p0) {}
    public boolean detailedAppJankMetricsApi() { return false; }
    public boolean detailedAppJankMetricsLoggingEnabled() { return false; }
    public boolean viewrootChoreographer() { return false; }
    public boolean isFlagReadOnlyOptimized(java.lang.String p0) { return false; }
    protected boolean getValue(java.lang.String p0, java.util.function.Predicate<android.app.jank.FeatureFlags> p1) { return false; }
    public java.util.List<java.lang.String> getFlagNames() { return null; }
}
