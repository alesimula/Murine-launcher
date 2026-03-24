package com.android.internal.hidden_from_bootclasspath.android.service.quickaccesswallet;

public class CustomFeatureFlags implements com.android.internal.hidden_from_bootclasspath.android.service.quickaccesswallet.FeatureFlags {
    public CustomFeatureFlags(java.util.function.BiPredicate<java.lang.String, java.util.function.Predicate<com.android.internal.hidden_from_bootclasspath.android.service.quickaccesswallet.FeatureFlags>> p0) {}
    public boolean launchSelectedCardFromQsTile() { return false; }
    public boolean launchWalletOptionOnPowerDoubleTap() { return false; }
    public boolean launchWalletViaSysuiCallbacks() { return false; }
    public boolean isFlagReadOnlyOptimized(java.lang.String p0) { return false; }
    protected boolean getValue(java.lang.String p0, java.util.function.Predicate<com.android.internal.hidden_from_bootclasspath.android.service.quickaccesswallet.FeatureFlags> p1) { return false; }
    public java.util.List<java.lang.String> getFlagNames() { return null; }
}
