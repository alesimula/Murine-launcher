package android.app.contextualsearch.flags;

public final class FeatureFlagsImpl implements android.app.contextualsearch.flags.FeatureFlags {
    public FeatureFlagsImpl() {}
    public boolean contextualSearchMediaProjection() { return false; }
    public boolean contextualSearchPreventSelfCapture() { return false; }
    public boolean enableService() { return false; }
    public boolean enableTokenRefresh() { return false; }
    public boolean includeAudioPlayingStatus() { return false; }
    public boolean multiWindowScreenContext() { return false; }
    public boolean selfInvocation() { return false; }
}
