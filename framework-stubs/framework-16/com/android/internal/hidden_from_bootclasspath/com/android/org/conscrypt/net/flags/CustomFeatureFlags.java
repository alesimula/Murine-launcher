package com.android.internal.hidden_from_bootclasspath.com.android.org.conscrypt.net.flags;

public class CustomFeatureFlags implements com.android.internal.hidden_from_bootclasspath.com.android.org.conscrypt.net.flags.FeatureFlags {
    public CustomFeatureFlags(java.util.function.BiPredicate<java.lang.String, java.util.function.Predicate<com.android.internal.hidden_from_bootclasspath.com.android.org.conscrypt.net.flags.FeatureFlags>> p0) {}
    public boolean certificateTransparencyDefaultEnabled() { return false; }
    public boolean networkSecurityConfig() { return false; }
    protected boolean getValue(java.lang.String p0, java.util.function.Predicate<com.android.internal.hidden_from_bootclasspath.com.android.org.conscrypt.net.flags.FeatureFlags> p1) { return false; }
    public java.util.List<java.lang.String> getFlagNames() { return null; }
    public boolean isFlagFinalized(java.lang.String p0) { return false; }
}
