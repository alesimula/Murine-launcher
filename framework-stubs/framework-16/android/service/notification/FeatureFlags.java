package android.service.notification;

public interface FeatureFlags {
    public boolean applyBrightnessClampingForModes();
    public boolean callstyleCallbackApi();
    public boolean nmClassificationNls();
    public boolean notificationBitmapOffloading();
    public boolean notificationClassification();
    public boolean notificationConversationChannelManagement();
    public boolean notificationForceGrouping();
    public boolean notificationGetOriginalImportance();
    public boolean notificationRegroupOnClassification();
    public boolean notificationSilentFlag();
    public boolean rankingUpdateAshmem();
    public boolean redactSensitiveNotificationsBigTextStyle();
    public boolean redactSensitiveNotificationsFromUntrustedListeners();
    public boolean reportNlsStartAndEnd();
}
