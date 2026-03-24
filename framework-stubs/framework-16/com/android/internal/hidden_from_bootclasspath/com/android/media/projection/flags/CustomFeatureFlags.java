package com.android.internal.hidden_from_bootclasspath.com.android.media.projection.flags;

public class CustomFeatureFlags implements com.android.internal.hidden_from_bootclasspath.com.android.media.projection.flags.FeatureFlags {
    public CustomFeatureFlags(java.util.function.BiPredicate<java.lang.String, java.util.function.Predicate<com.android.internal.hidden_from_bootclasspath.com.android.media.projection.flags.FeatureFlags>> p0) {}
    public boolean appContentSharing() { return false; }
    public boolean mediaProjectionConnectedDisplay() { return false; }
    public boolean mediaProjectionConnectedDisplayNoVirtualDevice() { return false; }
    public boolean mediaProjectionConnectedDisplayScreenSharing() { return false; }
    public boolean recordingOverlay() { return false; }
    public boolean showStopDialogPostCallEnd() { return false; }
    public boolean startUidCheck() { return false; }
    public boolean stopMediaProjectionOnCallEnd() { return false; }
    public boolean isFlagReadOnlyOptimized(java.lang.String p0) { return false; }
    protected boolean getValue(java.lang.String p0, java.util.function.Predicate<com.android.internal.hidden_from_bootclasspath.com.android.media.projection.flags.FeatureFlags> p1) { return false; }
    public java.util.List<java.lang.String> getFlagNames() { return null; }
}
