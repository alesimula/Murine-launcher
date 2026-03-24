package com.android.media.mediasession.flags;

public class CustomFeatureFlags implements com.android.media.mediasession.flags.FeatureFlags {
    public CustomFeatureFlags(java.util.function.BiPredicate<java.lang.String, java.util.function.Predicate<com.android.media.mediasession.flags.FeatureFlags>> p0) {}
    public boolean addWiuAllowlistingToMediaButtonReceiverHolderSend() { return false; }
    public boolean avoidMediaBrowserIncludeCapabilitiesIfNotNeeded() { return false; }
    public boolean removeWiuAllowlistingFromMediacontrollerSendcommand() { return false; }
    public boolean isFlagReadOnlyOptimized(java.lang.String p0) { return false; }
    protected boolean getValue(java.lang.String p0, java.util.function.Predicate<com.android.media.mediasession.flags.FeatureFlags> p1) { return false; }
    public java.util.List<java.lang.String> getFlagNames() { return null; }
}
