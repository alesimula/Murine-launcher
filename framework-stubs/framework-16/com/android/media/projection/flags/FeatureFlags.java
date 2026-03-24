package com.android.media.projection.flags;

public interface FeatureFlags {
    public boolean appContentSharing();
    public boolean mediaProjectionConnectedDisplay();
    public boolean mediaProjectionConnectedDisplayNoVirtualDevice();
    public boolean mediaProjectionConnectedDisplayScreenSharing();
    public boolean recordingOverlay();
    public boolean showStopDialogPostCallEnd();
    public boolean startUidCheck();
    public boolean stopMediaProjectionOnCallEnd();
}
