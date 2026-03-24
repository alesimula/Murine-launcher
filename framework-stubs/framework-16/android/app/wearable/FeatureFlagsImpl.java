package android.app.wearable;

public final class FeatureFlagsImpl implements android.app.wearable.FeatureFlags {
    public FeatureFlagsImpl() {}
    public boolean enableConcurrentWearableConnections() { return false; }
    public boolean enableDataRequestObserverApi() { return false; }
    public boolean enableHotwordWearableSensingApi() { return false; }
    public boolean enableProvideReadOnlyPfd() { return false; }
    public boolean enableProvideWearableConnectionApi() { return false; }
    public boolean enableRestartWssProcess() { return false; }
    public boolean enableUnsupportedOperationStatusCode() { return false; }
}
