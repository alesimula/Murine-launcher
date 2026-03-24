package android.webkit;

public class CustomFeatureFlags implements android.webkit.FeatureFlags {
    public CustomFeatureFlags(java.util.function.BiPredicate<java.lang.String, java.util.function.Predicate<android.webkit.FeatureFlags>> p0) {}
    public boolean updateServiceIpcWrapper() { return false; }
    public boolean updateServiceV2() { return false; }
    public boolean isFlagReadOnlyOptimized(java.lang.String p0) { return false; }
    protected boolean getValue(java.lang.String p0, java.util.function.Predicate<android.webkit.FeatureFlags> p1) { return false; }
    public java.util.List<java.lang.String> getFlagNames() { return null; }
}
