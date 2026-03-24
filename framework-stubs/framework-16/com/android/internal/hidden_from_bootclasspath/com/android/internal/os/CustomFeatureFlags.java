package com.android.internal.hidden_from_bootclasspath.com.android.internal.os;

public class CustomFeatureFlags implements com.android.internal.hidden_from_bootclasspath.com.android.internal.os.FeatureFlags {
    public CustomFeatureFlags(java.util.function.BiPredicate<java.lang.String, java.util.function.Predicate<com.android.internal.hidden_from_bootclasspath.com.android.internal.os.FeatureFlags>> p0) {}
    public boolean debugStoreEnabled() { return false; }
    public boolean enableMediaAndLocationPreload() { return false; }
    public boolean preWatchdogThrottleThreadDump() { return false; }
    public boolean ravenwoodFlagRo1() { return false; }
    public boolean ravenwoodFlagRo2() { return false; }
    public boolean ravenwoodFlagRw1() { return false; }
    public boolean ravenwoodFlagRw2() { return false; }
    public boolean isFlagReadOnlyOptimized(java.lang.String p0) { return false; }
    protected boolean getValue(java.lang.String p0, java.util.function.Predicate<com.android.internal.hidden_from_bootclasspath.com.android.internal.os.FeatureFlags> p1) { return false; }
    public java.util.List<java.lang.String> getFlagNames() { return null; }
}
