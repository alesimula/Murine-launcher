package android.database.sqlite;

public class CustomFeatureFlags implements android.database.sqlite.FeatureFlags {
    public CustomFeatureFlags(java.util.function.BiPredicate<java.lang.String, java.util.function.Predicate<android.database.sqlite.FeatureFlags>> p0) {}
    public boolean simpleSqlCommentScanner() { return false; }
    public boolean sqliteAllowTempTables() { return false; }
    public boolean sqliteApis35() { return false; }
    public boolean isFlagReadOnlyOptimized(java.lang.String p0) { return false; }
    protected boolean getValue(java.lang.String p0, java.util.function.Predicate<android.database.sqlite.FeatureFlags> p1) { return false; }
    public java.util.List<java.lang.String> getFlagNames() { return null; }
}
