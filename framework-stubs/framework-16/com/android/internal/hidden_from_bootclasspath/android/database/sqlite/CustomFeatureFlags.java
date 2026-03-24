package com.android.internal.hidden_from_bootclasspath.android.database.sqlite;

public class CustomFeatureFlags implements com.android.internal.hidden_from_bootclasspath.android.database.sqlite.FeatureFlags {
    public CustomFeatureFlags(java.util.function.BiPredicate<java.lang.String, java.util.function.Predicate<com.android.internal.hidden_from_bootclasspath.android.database.sqlite.FeatureFlags>> p0) {}
    public boolean concurrentOpenHelper() { return false; }
    public boolean noCheckpointOnFinalize() { return false; }
    public boolean onewayFinalizerCloseFixed() { return false; }
    public boolean sqliteApis35() { return false; }
    public boolean isFlagReadOnlyOptimized(java.lang.String p0) { return false; }
    protected boolean getValue(java.lang.String p0, java.util.function.Predicate<com.android.internal.hidden_from_bootclasspath.android.database.sqlite.FeatureFlags> p1) { return false; }
    public java.util.List<java.lang.String> getFlagNames() { return null; }
}
