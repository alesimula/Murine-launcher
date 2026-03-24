package com.android.internal.hidden_from_bootclasspath.android.content.flags;

public class CustomFeatureFlags implements com.android.internal.hidden_from_bootclasspath.android.content.flags.FeatureFlags {
    public CustomFeatureFlags(java.util.function.BiPredicate<java.lang.String, java.util.function.Predicate<com.android.internal.hidden_from_bootclasspath.android.content.flags.FeatureFlags>> p0) {}
    public boolean enableBindPackageIsolatedProcess() { return false; }
    public boolean intentSaveToXmlPackage() { return false; }
    public boolean stopVoiceCommand() { return false; }
    public boolean isFlagReadOnlyOptimized(java.lang.String p0) { return false; }
    protected boolean getValue(java.lang.String p0, java.util.function.Predicate<com.android.internal.hidden_from_bootclasspath.android.content.flags.FeatureFlags> p1) { return false; }
    public java.util.List<java.lang.String> getFlagNames() { return null; }
}
