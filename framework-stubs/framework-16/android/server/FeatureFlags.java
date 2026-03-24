package android.server;

public interface FeatureFlags {
    public boolean allowNetworkTimeUpdateService();
    public boolean allowRemovingVpnService();
    public boolean allowSystemServerInheritRt();
    public boolean earlySystemConfigInit();
    public boolean enableThemeService();
    public boolean migrateWristOrientation();
    public boolean removeAdServicesManagerServiceFromWear();
    public boolean removeAppIntegrityManagerService();
    public boolean removeGameManagerServiceFromWear();
    public boolean removeTextService();
    public boolean removeWearableSensingServiceFromWear();
    public boolean telemetryApisService();
    public boolean voiceinteractionmanagerserviceGetResourcesInInitThread();
    public boolean wearGestureApi();
}
