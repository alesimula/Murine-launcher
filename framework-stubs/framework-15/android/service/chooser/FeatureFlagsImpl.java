package android.service.chooser;

public final class FeatureFlagsImpl implements android.service.chooser.FeatureFlags {
    public FeatureFlagsImpl() {}
    public boolean chooserAlbumText() { return false; }
    public boolean chooserPayloadToggling() { return false; }
    public boolean enableChooserResult() { return false; }
    public boolean enableSharesheetMetadataExtra() { return false; }
    public boolean fixResolverMemoryLeak() { return false; }
}
