package android.media.tv.flags;

public class CustomFeatureFlags implements android.media.tv.flags.FeatureFlags {
    public CustomFeatureFlags(java.util.function.BiPredicate<java.lang.String, java.util.function.Predicate<android.media.tv.flags.FeatureFlags>> p0) {}
    public boolean broadcastVisibilityTypes() { return false; }
    public boolean enableAdServiceFw() { return false; }
    public boolean tiafVApis() { return false; }
    public boolean isFlagReadOnlyOptimized(java.lang.String p0) { return false; }
    protected boolean getValue(java.lang.String p0, java.util.function.Predicate<android.media.tv.flags.FeatureFlags> p1) { return false; }
    public java.util.List<java.lang.String> getFlagNames() { return null; }
}
