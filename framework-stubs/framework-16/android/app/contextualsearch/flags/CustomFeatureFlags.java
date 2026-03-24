package android.app.contextualsearch.flags;

public class CustomFeatureFlags implements android.app.contextualsearch.flags.FeatureFlags {
    public CustomFeatureFlags(java.util.function.BiPredicate<java.lang.String, java.util.function.Predicate<android.app.contextualsearch.flags.FeatureFlags>> p0) {}
    public boolean contextualSearchMediaProjection() { return false; }
    public boolean contextualSearchPreventSelfCapture() { return false; }
    public boolean enableService() { return false; }
    public boolean enableTokenRefresh() { return false; }
    public boolean includeAudioPlayingStatus() { return false; }
    public boolean multiWindowScreenContext() { return false; }
    public boolean selfInvocation() { return false; }
    public boolean isFlagReadOnlyOptimized(java.lang.String p0) { return false; }
    protected boolean getValue(java.lang.String p0, java.util.function.Predicate<android.app.contextualsearch.flags.FeatureFlags> p1) { return false; }
    public java.util.List<java.lang.String> getFlagNames() { return null; }
}
