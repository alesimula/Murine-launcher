package android.view.contentcapture.flags;

public final class FeatureFlagsImpl implements android.view.contentcapture.flags.FeatureFlags {
    public FeatureFlagsImpl() {}
    public boolean ccapiBaklavaEnabled() { return false; }
    public boolean enableSystemUiUnderlay() { return false; }
    public boolean flushAfterEachFrame() { return false; }
    public boolean runOnBackgroundThreadEnabled() { return false; }
    public boolean warmUpBackgroundThreadForContentCapture() { return false; }
}
