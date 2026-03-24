package android.database.sqlite;

public final class FeatureFlagsImpl implements android.database.sqlite.FeatureFlags {
    public FeatureFlagsImpl() {}
    public boolean concurrentOpenHelper() { return false; }
    public boolean noCheckpointOnFinalize() { return false; }
    public boolean onewayFinalizerCloseFixed() { return false; }
    public boolean sqliteApis35() { return false; }
}
