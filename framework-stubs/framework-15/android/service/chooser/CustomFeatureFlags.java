package android.service.chooser;

public class CustomFeatureFlags implements android.service.chooser.FeatureFlags {
    public CustomFeatureFlags(java.util.function.BiPredicate<java.lang.String, java.util.function.Predicate<android.service.chooser.FeatureFlags>> p0) {}
    public boolean chooserAlbumText() { return false; }
    public boolean chooserPayloadToggling() { return false; }
    public boolean enableChooserResult() { return false; }
    public boolean enableSharesheetMetadataExtra() { return false; }
    public boolean fixResolverMemoryLeak() { return false; }
    public boolean isFlagReadOnlyOptimized(java.lang.String p0) { return false; }
    protected boolean getValue(java.lang.String p0, java.util.function.Predicate<android.service.chooser.FeatureFlags> p1) { return false; }
    public java.util.List<java.lang.String> getFlagNames() { return null; }
}
