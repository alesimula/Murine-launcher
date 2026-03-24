package android.server.app;

public final class FeatureFlagsImpl implements android.server.app.FeatureFlags {
    public FeatureFlagsImpl() {}
    public boolean disableGameModeWhenAppTop() { return false; }
    public boolean gameDefaultFrameRate() { return false; }
}
