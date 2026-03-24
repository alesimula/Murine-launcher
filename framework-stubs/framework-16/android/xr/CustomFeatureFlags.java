package android.xr;

public class CustomFeatureFlags implements android.xr.FeatureFlags {
    public CustomFeatureFlags(java.util.function.BiPredicate<java.lang.String, java.util.function.Predicate<android.xr.FeatureFlags>> p0) {}
    public boolean xrManifestEntries() { return false; }
    protected boolean getValue(java.lang.String p0, java.util.function.Predicate<android.xr.FeatureFlags> p1) { return false; }
    public java.util.List<java.lang.String> getFlagNames() { return null; }
    public boolean isFlagFinalized(java.lang.String p0) { return false; }
}
