package android.content.flags;

public final class FeatureFlagsImpl implements android.content.flags.FeatureFlags {
    public FeatureFlagsImpl() {}
    public boolean enableBindPackageIsolatedProcess() { return false; }
    public boolean intentSaveToXmlPackage() { return false; }
    public boolean stopVoiceCommand() { return false; }
}
