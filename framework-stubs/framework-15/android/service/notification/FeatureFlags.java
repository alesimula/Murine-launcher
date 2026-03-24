package android.service.notification;

public interface FeatureFlags {
    public boolean callstyleCallbackApi();
    public boolean rankingUpdateAshmem();
    public boolean redactSensitiveNotificationsBigTextStyle();
    public boolean redactSensitiveNotificationsFromUntrustedListeners();
}
