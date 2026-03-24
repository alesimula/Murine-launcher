package com.android.internal.hidden_from_bootclasspath.android.server;

public class CustomFeatureFlags implements com.android.internal.hidden_from_bootclasspath.android.server.FeatureFlags {
    public CustomFeatureFlags(java.util.function.BiPredicate<java.lang.String, java.util.function.Predicate<com.android.internal.hidden_from_bootclasspath.android.server.FeatureFlags>> p0) {}
    public boolean allowNetworkTimeUpdateService() { return false; }
    public boolean allowRemovingVpnService() { return false; }
    public boolean allowSystemServerInheritRt() { return false; }
    public boolean earlySystemConfigInit() { return false; }
    public boolean enableThemeService() { return false; }
    public boolean migrateWristOrientation() { return false; }
    public boolean removeAdServicesManagerServiceFromWear() { return false; }
    public boolean removeAppIntegrityManagerService() { return false; }
    public boolean removeGameManagerServiceFromWear() { return false; }
    public boolean removeTextService() { return false; }
    public boolean removeWearableSensingServiceFromWear() { return false; }
    public boolean telemetryApisService() { return false; }
    public boolean voiceinteractionmanagerserviceGetResourcesInInitThread() { return false; }
    public boolean wearGestureApi() { return false; }
    public boolean isFlagReadOnlyOptimized(java.lang.String p0) { return false; }
    protected boolean getValue(java.lang.String p0, java.util.function.Predicate<com.android.internal.hidden_from_bootclasspath.android.server.FeatureFlags> p1) { return false; }
    public java.util.List<java.lang.String> getFlagNames() { return null; }
}
