package android.database.sqlite;

public interface FeatureFlags {
    public boolean concurrentOpenHelper();
    public boolean noCheckpointOnFinalize();
    public boolean onewayFinalizerCloseFixed();
    public boolean sqliteApis35();
}
