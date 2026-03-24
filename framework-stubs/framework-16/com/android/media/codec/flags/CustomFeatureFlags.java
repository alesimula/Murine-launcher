package com.android.media.codec.flags;

public class CustomFeatureFlags implements com.android.media.codec.flags.FeatureFlags {
    public CustomFeatureFlags(java.util.function.BiPredicate<java.lang.String, java.util.function.Predicate<com.android.media.codec.flags.FeatureFlags>> p0) {}
    public boolean aidlHal() { return false; }
    public boolean codecImportance() { return false; }
    public boolean largeAudioFrame() { return false; }
    public boolean isFlagReadOnlyOptimized(java.lang.String p0) { return false; }
    protected boolean getValue(java.lang.String p0, java.util.function.Predicate<com.android.media.codec.flags.FeatureFlags> p1) { return false; }
    public java.util.List<java.lang.String> getFlagNames() { return null; }
}
