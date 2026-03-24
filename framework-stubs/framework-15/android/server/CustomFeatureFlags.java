package android.server;

public class CustomFeatureFlags implements android.server.FeatureFlags {
    public CustomFeatureFlags(java.util.function.BiPredicate<java.lang.String, java.util.function.Predicate<android.server.FeatureFlags>> p0) {}
    public boolean removeTextService() { return false; }
    public boolean telemetryApisService() { return false; }
    public boolean isFlagReadOnlyOptimized(java.lang.String p0) { return false; }
    protected boolean getValue(java.lang.String p0, java.util.function.Predicate<android.server.FeatureFlags> p1) { return false; }
    public java.util.List<java.lang.String> getFlagNames() { return null; }
}
