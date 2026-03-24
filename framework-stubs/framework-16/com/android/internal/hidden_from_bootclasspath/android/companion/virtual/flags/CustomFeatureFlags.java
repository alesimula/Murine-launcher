package com.android.internal.hidden_from_bootclasspath.android.companion.virtual.flags;

public class CustomFeatureFlags implements com.android.internal.hidden_from_bootclasspath.android.companion.virtual.flags.FeatureFlags {
    public CustomFeatureFlags(java.util.function.BiPredicate<java.lang.String, java.util.function.Predicate<com.android.internal.hidden_from_bootclasspath.android.companion.virtual.flags.FeatureFlags>> p0) {}
    public boolean crossDeviceClipboard() { return false; }
    public boolean dynamicPolicy() { return false; }
    public boolean persistentDeviceIdApi() { return false; }
    public boolean vdmCustomHome() { return false; }
    public boolean vdmCustomIme() { return false; }
    public boolean vdmPublicApis() { return false; }
    public boolean virtualCamera() { return false; }
    public boolean virtualStylus() { return false; }
    public boolean isFlagReadOnlyOptimized(java.lang.String p0) { return false; }
    protected boolean getValue(java.lang.String p0, java.util.function.Predicate<com.android.internal.hidden_from_bootclasspath.android.companion.virtual.flags.FeatureFlags> p1) { return false; }
    public java.util.List<java.lang.String> getFlagNames() { return null; }
}
