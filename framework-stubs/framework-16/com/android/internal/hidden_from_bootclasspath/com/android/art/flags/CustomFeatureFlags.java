package com.android.internal.hidden_from_bootclasspath.com.android.art.flags;

public class CustomFeatureFlags implements com.android.internal.hidden_from_bootclasspath.com.android.art.flags.FeatureFlags {
    public CustomFeatureFlags(java.util.function.BiPredicate<java.lang.String, java.util.function.Predicate<com.android.internal.hidden_from_bootclasspath.com.android.art.flags.FeatureFlags>> p0) {}
    public boolean alwaysEnableProfileCode() { return false; }
    public boolean artServiceV3() { return false; }
    public boolean executableMethodFileOffsets() { return false; }
    public boolean executableMethodFileOffsetsDeprecation() { return false; }
    public boolean executableMethodFileOffsetsV2() { return false; }
    protected boolean getValue(java.lang.String p0, java.util.function.Predicate<com.android.internal.hidden_from_bootclasspath.com.android.art.flags.FeatureFlags> p1) { return false; }
    public java.util.List<java.lang.String> getFlagNames() { return null; }
    public boolean isFlagFinalized(java.lang.String p0) { return false; }
}
