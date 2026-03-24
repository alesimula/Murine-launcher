package com.android.media.flags;

public interface FeatureFlags {
    public boolean adjustVolumeForForegroundAppPlayingAudioWithoutMediaSession();
    public boolean enableAudioPoliciesDeviceAndBluetoothController();
    public boolean enableBuiltInSpeakerRouteSuitabilityStatuses();
    public boolean enableCrossUserRoutingInMediaRouter2();
    public boolean enableFullScanWithMediaContentControl();
    public boolean enableGetTransferableRoutes();
    public boolean enableMr2ServiceNonMainBgThread();
    public boolean enableNewMediaRoute2InfoTypes();
    public boolean enableNotifyingActivityManagerWithMediaSessionStatusChange();
    public boolean enableNullSessionInMediaBrowserService();
    public boolean enablePreventionOfKeepAliveRouteProviders();
    public boolean enablePreventionOfManagerScansWhenNoAppsScan();
    public boolean enablePrivilegedRoutingForMediaRoutingControl();
    public boolean enableRlpCallbacksInMediaRouter2();
    public boolean enableScreenOffScanning();
    public boolean enableUseOfBluetoothDeviceGetAliasForMr2infoGetName();
    public boolean enableWaitingStateForSystemSessionCreationRequest();
    public boolean fallbackToDefaultHandlingWhenMediaSessionHasFixedVolumeHandling();
}
