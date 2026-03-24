package com.android.media.flags;

public class CustomFeatureFlags implements com.android.media.flags.FeatureFlags {
    public CustomFeatureFlags(java.util.function.BiPredicate<java.lang.String, java.util.function.Predicate<com.android.media.flags.FeatureFlags>> p0) {}
    public boolean adjustVolumeForForegroundAppPlayingAudioWithoutMediaSession() { return false; }
    public boolean enableAudioPoliciesDeviceAndBluetoothController() { return false; }
    public boolean enableBuiltInSpeakerRouteSuitabilityStatuses() { return false; }
    public boolean enableCrossUserRoutingInMediaRouter2() { return false; }
    public boolean enableFullScanWithMediaContentControl() { return false; }
    public boolean enableGetTransferableRoutes() { return false; }
    public boolean enableMr2ServiceNonMainBgThread() { return false; }
    public boolean enableNewMediaRoute2InfoTypes() { return false; }
    public boolean enableNotifyingActivityManagerWithMediaSessionStatusChange() { return false; }
    public boolean enableNullSessionInMediaBrowserService() { return false; }
    public boolean enablePreventionOfKeepAliveRouteProviders() { return false; }
    public boolean enablePreventionOfManagerScansWhenNoAppsScan() { return false; }
    public boolean enablePrivilegedRoutingForMediaRoutingControl() { return false; }
    public boolean enableRlpCallbacksInMediaRouter2() { return false; }
    public boolean enableScreenOffScanning() { return false; }
    public boolean enableUseOfBluetoothDeviceGetAliasForMr2infoGetName() { return false; }
    public boolean enableWaitingStateForSystemSessionCreationRequest() { return false; }
    public boolean fallbackToDefaultHandlingWhenMediaSessionHasFixedVolumeHandling() { return false; }
    public boolean isFlagReadOnlyOptimized(java.lang.String p0) { return false; }
    protected boolean getValue(java.lang.String p0, java.util.function.Predicate<com.android.media.flags.FeatureFlags> p1) { return false; }
    public java.util.List<java.lang.String> getFlagNames() { return null; }
}
