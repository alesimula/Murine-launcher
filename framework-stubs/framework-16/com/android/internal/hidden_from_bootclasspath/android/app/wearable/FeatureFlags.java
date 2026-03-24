package com.android.internal.hidden_from_bootclasspath.android.app.wearable;

public interface FeatureFlags {
    public boolean enableConcurrentWearableConnections();
    public boolean enableDataRequestObserverApi();
    public boolean enableHotwordWearableSensingApi();
    public boolean enableProvideReadOnlyPfd();
    public boolean enableProvideWearableConnectionApi();
    public boolean enableRestartWssProcess();
    public boolean enableUnsupportedOperationStatusCode();
}
