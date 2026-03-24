package com.android.internal.hidden_from_bootclasspath.android.app.usage;

public interface FeatureFlags {
    public boolean filterBasedEventQueryApi();
    public boolean getAppArtManagedBytes();
    public boolean getAppBytesByDataTypeApi();
    public boolean reportUsageStatsPermission();
    public boolean useDedicatedHandlerThread();
    public boolean useParceledList();
    public boolean userInteractionTypeApi();
}
