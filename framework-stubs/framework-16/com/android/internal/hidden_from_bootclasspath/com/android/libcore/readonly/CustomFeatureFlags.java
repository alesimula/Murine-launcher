package com.android.internal.hidden_from_bootclasspath.com.android.libcore.readonly;

public class CustomFeatureFlags implements com.android.internal.hidden_from_bootclasspath.com.android.libcore.readonly.FeatureFlags {
    public CustomFeatureFlags(java.util.function.BiPredicate<java.lang.String, java.util.function.Predicate<com.android.internal.hidden_from_bootclasspath.com.android.libcore.readonly.FeatureFlags>> p0) {}
    public boolean nativeMetrics() { return false; }
    public boolean postCleanupApis() { return false; }
    public boolean isFlagReadOnlyOptimized(java.lang.String p0) { return false; }
    protected boolean getValue(java.lang.String p0, java.util.function.Predicate<com.android.internal.hidden_from_bootclasspath.com.android.libcore.readonly.FeatureFlags> p1) { return false; }
    public java.util.List<java.lang.String> getFlagNames() { return null; }
}
