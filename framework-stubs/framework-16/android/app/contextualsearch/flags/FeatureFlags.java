package android.app.contextualsearch.flags;

public interface FeatureFlags {
    public boolean contextualSearchMediaProjection();
    public boolean contextualSearchPreventSelfCapture();
    public boolean enableService();
    public boolean enableTokenRefresh();
    public boolean includeAudioPlayingStatus();
    public boolean multiWindowScreenContext();
    public boolean selfInvocation();
}
