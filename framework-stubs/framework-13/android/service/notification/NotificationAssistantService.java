package android.service.notification;

@android.annotation.SystemApi
public abstract class NotificationAssistantService extends android.service.notification.NotificationListenerService {
    public static final int SOURCE_FROM_APP = 0;
    public static final int SOURCE_FROM_ASSISTANT = 1;
    public static final java.lang.String SERVICE_INTERFACE = "android.service.notification.NotificationAssistantService";
    public static final java.lang.String ACTION_NOTIFICATION_ASSISTANT_DETAIL_SETTINGS = "android.service.notification.action.NOTIFICATION_ASSISTANT_DETAIL_SETTINGS";
    public static final java.lang.String FEEDBACK_RATING = "feedback.rating";
    protected android.os.Handler mHandler;
    public NotificationAssistantService() { super(); }
    protected void attachBaseContext(android.content.Context p0) {}
    public final android.os.IBinder onBind(android.content.Intent p0) { return null; }
    public abstract void onNotificationSnoozedUntilContext(android.service.notification.StatusBarNotification p0, java.lang.String p1);
    public abstract android.service.notification.Adjustment onNotificationEnqueued(android.service.notification.StatusBarNotification p0);
    public android.service.notification.Adjustment onNotificationEnqueued(android.service.notification.StatusBarNotification p0, android.app.NotificationChannel p1) { return null; }
    public android.service.notification.Adjustment onNotificationEnqueued(android.service.notification.StatusBarNotification p0, android.app.NotificationChannel p1, android.service.notification.NotificationListenerService.RankingMap p2) { return null; }
    public void onNotificationRemoved(android.service.notification.StatusBarNotification p0, android.service.notification.NotificationListenerService.RankingMap p1, android.service.notification.NotificationStats p2, int p3) {}
    public void onNotificationsSeen(java.util.List<java.lang.String> p0) {}
    public void onPanelRevealed(int p0) {}
    public void onPanelHidden() {}
    public void onNotificationVisibilityChanged(java.lang.String p0, boolean p1) {}
    public void onNotificationExpansionChanged(java.lang.String p0, boolean p1, boolean p2) {}
    public void onNotificationDirectReplied(java.lang.String p0) {}
    public void onSuggestedReplySent(java.lang.String p0, java.lang.CharSequence p1, int p2) {}
    public void onActionInvoked(java.lang.String p0, android.app.Notification.Action p1, int p2) {}
    public void onNotificationClicked(java.lang.String p0) {}
    public void onAllowedAdjustmentsChanged() {}
    public void onNotificationFeedbackReceived(java.lang.String p0, android.service.notification.NotificationListenerService.RankingMap p1, android.os.Bundle p2) {}
    public final void adjustNotification(android.service.notification.Adjustment p0) {}
    public final void adjustNotifications(java.util.List<android.service.notification.Adjustment> p0) {}
    public final void unsnoozeNotification(java.lang.String p0) {}

    private final class MyHandler extends android.os.Handler {
        public static final int MSG_ON_NOTIFICATION_ENQUEUED = 1;
        public static final int MSG_ON_NOTIFICATION_SNOOZED = 2;
        public static final int MSG_ON_NOTIFICATIONS_SEEN = 3;
        public static final int MSG_ON_NOTIFICATION_EXPANSION_CHANGED = 4;
        public static final int MSG_ON_NOTIFICATION_DIRECT_REPLY_SENT = 5;
        public static final int MSG_ON_SUGGESTED_REPLY_SENT = 6;
        public static final int MSG_ON_ACTION_INVOKED = 7;
        public static final int MSG_ON_ALLOWED_ADJUSTMENTS_CHANGED = 8;
        public static final int MSG_ON_PANEL_REVEALED = 9;
        public static final int MSG_ON_PANEL_HIDDEN = 10;
        public static final int MSG_ON_NOTIFICATION_VISIBILITY_CHANGED = 11;
        public static final int MSG_ON_NOTIFICATION_CLICKED = 12;
        public static final int MSG_ON_NOTIFICATION_FEEDBACK_RECEIVED = 13;
        public MyHandler(android.service.notification.NotificationAssistantService p0, android.os.Looper p1) { super(); }
        public void handleMessage(android.os.Message p0) {}
    }

    private class NotificationAssistantServiceWrapper extends android.service.notification.NotificationListenerService.NotificationListenerWrapper {
        NotificationAssistantServiceWrapper() { super(null); }
        public void onNotificationEnqueuedWithChannel(android.service.notification.IStatusBarNotificationHolder p0, android.app.NotificationChannel p1, android.service.notification.NotificationRankingUpdate p2) {}
        public void onNotificationSnoozedUntilContext(android.service.notification.IStatusBarNotificationHolder p0, java.lang.String p1) {}
        public void onNotificationsSeen(java.util.List<java.lang.String> p0) {}
        public void onPanelRevealed(int p0) {}
        public void onPanelHidden() {}
        public void onNotificationVisibilityChanged(java.lang.String p0, boolean p1) {}
        public void onNotificationExpansionChanged(java.lang.String p0, boolean p1, boolean p2) {}
        public void onNotificationDirectReply(java.lang.String p0) {}
        public void onSuggestedReplySent(java.lang.String p0, java.lang.CharSequence p1, int p2) {}
        public void onActionClicked(java.lang.String p0, android.app.Notification.Action p1, int p2) {}
        public void onNotificationClicked(java.lang.String p0) {}
        public void onAllowedAdjustmentsChanged() {}
        public void onNotificationFeedbackReceived(java.lang.String p0, android.service.notification.NotificationRankingUpdate p1, android.os.Bundle p2) {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Source {
    }
}
