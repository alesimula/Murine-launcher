package com.android.media.projection.flags;

public final class FeatureFlagsImpl implements com.android.media.projection.flags.FeatureFlags {
    public FeatureFlagsImpl() {}
    public boolean appContentSharing() { return false; }
    public boolean mediaProjectionConnectedDisplay() { return false; }
    public boolean mediaProjectionConnectedDisplayNoVirtualDevice() { return false; }
    public boolean mediaProjectionConnectedDisplayScreenSharing() { return false; }
    public boolean recordingOverlay() { return false; }
    public boolean showStopDialogPostCallEnd() { return false; }
    public boolean startUidCheck() { return false; }
    public boolean stopMediaProjectionOnCallEnd() { return false; }
}
