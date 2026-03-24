package com.android.internal.hidden_from_bootclasspath.android.app.wearable;

public class CustomFeatureFlags implements com.android.internal.hidden_from_bootclasspath.android.app.wearable.FeatureFlags {
    public CustomFeatureFlags(java.util.function.BiPredicate<java.lang.String, java.util.function.Predicate<com.android.internal.hidden_from_bootclasspath.android.app.wearable.FeatureFlags>> p0) {}
    public boolean enableConcurrentWearableConnections() { return false; }
    public boolean enableDataRequestObserverApi() { return false; }
    public boolean enableHotwordWearableSensingApi() { return false; }
    public boolean enableProvideReadOnlyPfd() { return false; }
    public boolean enableProvideWearableConnectionApi() { return false; }
    public boolean enableRestartWssProcess() { return false; }
    public boolean enableUnsupportedOperationStatusCode() { return false; }
    public boolean isFlagReadOnlyOptimized(java.lang.String p0) { return false; }
    protected boolean getValue(java.lang.String p0, java.util.function.Predicate<com.android.internal.hidden_from_bootclasspath.android.app.wearable.FeatureFlags> p1) { return false; }
    public java.util.List<java.lang.String> getFlagNames() { return null; }
}
