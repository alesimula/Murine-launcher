package com.android.internal.content.storage.flags;

public class CustomFeatureFlags implements com.android.internal.content.storage.flags.FeatureFlags {
    public CustomFeatureFlags(java.util.function.BiPredicate<java.lang.String, java.util.function.Predicate<com.android.internal.content.storage.flags.FeatureFlags>> p0) {}
    public boolean useFileSystemProviderSearchLimits() { return false; }
    public boolean isFlagReadOnlyOptimized(java.lang.String p0) { return false; }
    protected boolean getValue(java.lang.String p0, java.util.function.Predicate<com.android.internal.content.storage.flags.FeatureFlags> p1) { return false; }
    public java.util.List<java.lang.String> getFlagNames() { return null; }
}
