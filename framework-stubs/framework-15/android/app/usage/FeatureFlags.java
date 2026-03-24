package android.app.usage;

public interface FeatureFlags {
    public boolean disableIdleCheck();
    public boolean filterBasedEventQueryApi();
    public boolean getAppBytesByDataTypeApi();
    public boolean reportUsageStatsPermission();
    public boolean useDedicatedHandlerThread();
    public boolean useParceledList();
    public boolean userInteractionTypeApi();
}
