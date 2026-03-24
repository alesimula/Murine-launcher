package com.android.internal.hidden_from_bootclasspath.com.android.net.thread.platform.flags;

public class CustomFeatureFlags implements com.android.internal.hidden_from_bootclasspath.com.android.net.thread.platform.flags.FeatureFlags {
    public CustomFeatureFlags(java.util.function.BiPredicate<java.lang.String, java.util.function.Predicate<com.android.internal.hidden_from_bootclasspath.com.android.net.thread.platform.flags.FeatureFlags>> p0) {}
    public boolean threadEnabledPlatform() { return false; }
    public boolean threadUserRestrictionEnabled() { return false; }
    public boolean isFlagReadOnlyOptimized(java.lang.String p0) { return false; }
    protected boolean getValue(java.lang.String p0, java.util.function.Predicate<com.android.internal.hidden_from_bootclasspath.com.android.net.thread.platform.flags.FeatureFlags> p1) { return false; }
    public java.util.List<java.lang.String> getFlagNames() { return null; }
}
