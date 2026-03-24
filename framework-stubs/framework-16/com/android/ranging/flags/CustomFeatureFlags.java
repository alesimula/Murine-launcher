package com.android.ranging.flags;

public class CustomFeatureFlags implements com.android.ranging.flags.FeatureFlags {
    public CustomFeatureFlags(java.util.function.BiPredicate<java.lang.String, java.util.function.Predicate<com.android.ranging.flags.FeatureFlags>> p0) {}
    public boolean rangingCsEnabled() { return false; }
    public boolean rangingRttEnabled() { return false; }
    public boolean rangingStackEnabled() { return false; }
    public boolean rangingStackUpdates25q4() { return false; }
    protected boolean getValue(java.lang.String p0, java.util.function.Predicate<com.android.ranging.flags.FeatureFlags> p1) { return false; }
    public java.util.List<java.lang.String> getFlagNames() { return null; }
    public boolean isFlagFinalized(java.lang.String p0) { return false; }
}
