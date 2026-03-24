package android.database.sqlite;

public final class FeatureFlagsImpl implements android.database.sqlite.FeatureFlags {
    public FeatureFlagsImpl() {}
    public boolean simpleSqlCommentScanner() { return false; }
    public boolean sqliteAllowTempTables() { return false; }
    public boolean sqliteApis35() { return false; }
}
