package android.service.notification;

public abstract class NotificationListenerService extends android.app.Service {
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=115609023L)
    private final java.lang.String TAG = null;
    public static final int INTERRUPTION_FILTER_ALL = 1;
    public static final int INTERRUPTION_FILTER_PRIORITY = 2;
    public static final int INTERRUPTION_FILTER_NONE = 3;
    public static final int INTERRUPTION_FILTER_ALARMS = 4;
    public static final int INTERRUPTION_FILTER_UNKNOWN = 0;
    public static final int HINT_HOST_DISABLE_EFFECTS = 1;
    public static final int HINT_HOST_DISABLE_NOTIFICATION_EFFECTS = 2;
    public static final int HINT_HOST_DISABLE_CALL_EFFECTS = 4;
    @java.lang.Deprecated
    public static final int SUPPRESSED_EFFECT_SCREEN_OFF = 1;
    @java.lang.Deprecated
    public static final int SUPPRESSED_EFFECT_SCREEN_ON = 2;
    public static final int REASON_CLICK = 1;
    public static final int REASON_CANCEL = 2;
    public static final int REASON_CANCEL_ALL = 3;
    public static final int REASON_ERROR = 4;
    public static final int REASON_PACKAGE_CHANGED = 5;
    public static final int REASON_USER_STOPPED = 6;
    public static final int REASON_PACKAGE_BANNED = 7;
    public static final int REASON_APP_CANCEL = 8;
    public static final int REASON_APP_CANCEL_ALL = 9;
    public static final int REASON_LISTENER_CANCEL = 10;
    public static final int REASON_LISTENER_CANCEL_ALL = 11;
    public static final int REASON_GROUP_SUMMARY_CANCELED = 12;
    public static final int REASON_GROUP_OPTIMIZATION = 13;
    public static final int REASON_PACKAGE_SUSPENDED = 14;
    public static final int REASON_PROFILE_TURNED_OFF = 15;
    public static final int REASON_UNAUTOBUNDLED = 16;
    public static final int REASON_CHANNEL_BANNED = 17;
    public static final int REASON_SNOOZED = 18;
    public static final int REASON_TIMEOUT = 19;
    @android.annotation.SystemApi
    public static final int TRIM_FULL = 0;
    @android.annotation.SystemApi
    public static final int TRIM_LIGHT = 1;
    public static final int NOTIFICATION_CHANNEL_OR_GROUP_ADDED = 1;
    public static final int NOTIFICATION_CHANNEL_OR_GROUP_UPDATED = 2;
    public static final int NOTIFICATION_CHANNEL_OR_GROUP_DELETED = 3;
    private final java.lang.Object mLock = null;
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=115609023L)
    private android.os.Handler mHandler;
    @android.annotation.UnsupportedAppUsage
    protected android.service.notification.NotificationListenerService.NotificationListenerWrapper mWrapper;
    private boolean isConnected;
    private android.service.notification.NotificationListenerService.RankingMap mRankingMap;
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=115609023L)
    protected android.app.INotificationManager mNoMan;
    protected int mCurrentUser;
    protected android.content.Context mSystemContext;
    public static final java.lang.String SERVICE_INTERFACE = "android.service.notification.NotificationListenerService";
    public NotificationListenerService() { super(); }
    protected void attachBaseContext(android.content.Context p0) {}
    public void onNotificationPosted(android.service.notification.StatusBarNotification p0) {}
    public void onNotificationPosted(android.service.notification.StatusBarNotification p0, android.service.notification.NotificationListenerService.RankingMap p1) {}
    public void onNotificationRemoved(android.service.notification.StatusBarNotification p0) {}
    public void onNotificationRemoved(android.service.notification.StatusBarNotification p0, android.service.notification.NotificationListenerService.RankingMap p1) {}
    public void onNotificationRemoved(android.service.notification.StatusBarNotification p0, android.service.notification.NotificationListenerService.RankingMap p1, int p2) {}
    @android.annotation.SystemApi
    public void onNotificationRemoved(android.service.notification.StatusBarNotification p0, android.service.notification.NotificationListenerService.RankingMap p1, android.service.notification.NotificationStats p2, int p3) {}
    public void onListenerConnected() {}
    public void onListenerDisconnected() {}
    public void onNotificationRankingUpdate(android.service.notification.NotificationListenerService.RankingMap p0) {}
    public void onListenerHintsChanged(int p0) {}
    public void onSilentStatusBarIconsVisibilityChanged(boolean p0) {}
    public void onNotificationChannelModified(java.lang.String p0, android.os.UserHandle p1, android.app.NotificationChannel p2, int p3) {}
    public void onNotificationChannelGroupModified(java.lang.String p0, android.os.UserHandle p1, android.app.NotificationChannelGroup p2, int p3) {}
    public void onInterruptionFilterChanged(int p0) {}
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=115609023L)
    protected final android.app.INotificationManager getNotificationInterface() { return null; }
    @java.lang.Deprecated
    public final void cancelNotification(java.lang.String p0, java.lang.String p1, int p2) {}
    public final void cancelNotification(java.lang.String p0) {}
    public final void cancelAllNotifications() {}
    public final void cancelNotifications(java.lang.String[] p0) {}
    @android.annotation.SystemApi
    public final void snoozeNotification(java.lang.String p0, java.lang.String p1) {}
    public final void snoozeNotification(java.lang.String p0, long p1) {}
    public final void setNotificationsShown(java.lang.String[] p0) {}
    public final void updateNotificationChannel(java.lang.String p0, android.os.UserHandle p1, android.app.NotificationChannel p2) {}
    public final java.util.List<android.app.NotificationChannel> getNotificationChannels(java.lang.String p0, android.os.UserHandle p1) { return null; }
    public final java.util.List<android.app.NotificationChannelGroup> getNotificationChannelGroups(java.lang.String p0, android.os.UserHandle p1) { return null; }
    @android.annotation.SystemApi
    public final void setOnNotificationPostedTrim(int p0) {}
    public android.service.notification.StatusBarNotification[] getActiveNotifications() { return null; }
    public final android.service.notification.StatusBarNotification[] getSnoozedNotifications() { return null; }
    @android.annotation.SystemApi
    public android.service.notification.StatusBarNotification[] getActiveNotifications(int p0) { return null; }
    public android.service.notification.StatusBarNotification[] getActiveNotifications(java.lang.String[] p0) { return null; }
    @android.annotation.SystemApi
    public android.service.notification.StatusBarNotification[] getActiveNotifications(java.lang.String[] p0, int p1) { return null; }
    private android.service.notification.StatusBarNotification[] cleanUpNotificationList(android.content.pm.ParceledListSlice<android.service.notification.StatusBarNotification> p0) { return null; }
    public final int getCurrentListenerHints() { return 0; }
    public final int getCurrentInterruptionFilter() { return 0; }
    public final void clearRequestedListenerHints() {}
    public final void requestListenerHints(int p0) {}
    public final void requestInterruptionFilter(int p0) {}
    public android.service.notification.NotificationListenerService.RankingMap getCurrentRanking() { return null; }
    public android.os.IBinder onBind(android.content.Intent p0) { return null; }
    @android.annotation.UnsupportedAppUsage
    protected boolean isBound() { return false; }
    public void onDestroy() {}
    @android.annotation.SystemApi
    public void registerAsSystemService(android.content.Context p0, android.content.ComponentName p1, int p2) throws android.os.RemoteException {}
    @android.annotation.SystemApi
    public void unregisterAsSystemService() throws android.os.RemoteException {}
    public static void requestRebind(android.content.ComponentName p0) {}
    public final void requestUnbind() {}
    public final void createLegacyIconExtras(android.app.Notification p0) {}
    private void maybePopulateRemoteViews(android.app.Notification p0) {}
    private void maybePopulatePeople(android.app.Notification p0) {}
    public final void applyUpdateLocked(android.service.notification.NotificationRankingUpdate p0) {}
    protected android.content.Context getContext() { return null; }

    public static class RankingMap implements android.os.Parcelable {
        private java.util.ArrayList<java.lang.String> mOrderedKeys;
        private android.util.ArrayMap<java.lang.String, android.service.notification.NotificationListenerService.Ranking> mRankings;
        public static final android.os.Parcelable.Creator<android.service.notification.NotificationListenerService.RankingMap> CREATOR = null;
        public RankingMap(android.service.notification.NotificationListenerService.Ranking[] p0) {}
        private RankingMap(android.os.Parcel p0) {}
        public boolean equals(java.lang.Object p0) { return false; }
        public int describeContents() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public java.lang.String[] getOrderedKeys() { return null; }
        public boolean getRanking(java.lang.String p0, android.service.notification.NotificationListenerService.Ranking p1) { return false; }
        public android.service.notification.NotificationListenerService.Ranking getRawRankingObject(java.lang.String p0) { return null; }
    }

    public static class Ranking {
        public static final int VISIBILITY_NO_OVERRIDE = -1000;
        public static final int USER_SENTIMENT_NEGATIVE = -1;
        public static final int USER_SENTIMENT_NEUTRAL = 0;
        public static final int USER_SENTIMENT_POSITIVE = 1;
        private java.lang.String mKey;
        private int mRank;
        private boolean mIsAmbient;
        private boolean mMatchesInterruptionFilter;
        private int mVisibilityOverride;
        private int mSuppressedVisualEffects;
        private int mImportance;
        private java.lang.CharSequence mImportanceExplanation;
        private java.lang.String mOverrideGroupKey;
        private android.app.NotificationChannel mChannel;
        private java.util.ArrayList<java.lang.String> mOverridePeople;
        private java.util.ArrayList<android.service.notification.SnoozeCriterion> mSnoozeCriteria;
        private boolean mShowBadge;
        private int mUserSentiment;
        private boolean mHidden;
        private long mLastAudiblyAlertedMs;
        private boolean mNoisy;
        private java.util.ArrayList<android.app.Notification.Action> mSmartActions;
        private java.util.ArrayList<java.lang.CharSequence> mSmartReplies;
        private boolean mCanBubble;
        private static final int PARCEL_VERSION = 2;
        public Ranking() {}
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public Ranking(android.os.Parcel p0) {}
        public java.lang.String getKey() { return null; }
        public int getRank() { return 0; }
        public boolean isAmbient() { return false; }
        @android.annotation.UnsupportedAppUsage
        public int getVisibilityOverride() { return 0; }
        public int getSuppressedVisualEffects() { return 0; }
        public boolean matchesInterruptionFilter() { return false; }
        public int getImportance() { return 0; }
        public java.lang.CharSequence getImportanceExplanation() { return null; }
        public java.lang.String getOverrideGroupKey() { return null; }
        public android.app.NotificationChannel getChannel() { return null; }
        public int getUserSentiment() { return 0; }
        @android.annotation.SystemApi
        public java.util.List<java.lang.String> getAdditionalPeople() { return null; }
        @android.annotation.SystemApi
        public java.util.List<android.service.notification.SnoozeCriterion> getSnoozeCriteria() { return null; }
        public java.util.List<android.app.Notification.Action> getSmartActions() { return null; }
        public java.util.List<java.lang.CharSequence> getSmartReplies() { return null; }
        public boolean canShowBadge() { return false; }
        public boolean isSuspended() { return false; }
        public long getLastAudiblyAlertedMillis() { return 0L; }
        public boolean canBubble() { return false; }
        public boolean isNoisy() { return false; }
        public void populate(java.lang.String p0, int p1, boolean p2, int p3, int p4, int p5, java.lang.CharSequence p6, java.lang.String p7, android.app.NotificationChannel p8, java.util.ArrayList<java.lang.String> p9, java.util.ArrayList<android.service.notification.SnoozeCriterion> p10, boolean p11, int p12, boolean p13, long p14, boolean p15, java.util.ArrayList<android.app.Notification.Action> p16, java.util.ArrayList<java.lang.CharSequence> p17, boolean p18) {}
        public void populate(android.service.notification.NotificationListenerService.Ranking p0) {}
        public static java.lang.String importanceToString(int p0) { return null; }
        public boolean equals(java.lang.Object p0) { return false; }

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface UserSentiment {
        }
    }

    protected class NotificationListenerWrapper extends android.service.notification.INotificationListener.Stub {
        protected NotificationListenerWrapper(android.service.notification.NotificationListenerService p0) { super(); }
        public void onNotificationPosted(android.service.notification.IStatusBarNotificationHolder p0, android.service.notification.NotificationRankingUpdate p1) {}
        public void onNotificationRemoved(android.service.notification.IStatusBarNotificationHolder p0, android.service.notification.NotificationRankingUpdate p1, android.service.notification.NotificationStats p2, int p3) {}
        public void onListenerConnected(android.service.notification.NotificationRankingUpdate p0) {}
        public void onNotificationRankingUpdate(android.service.notification.NotificationRankingUpdate p0) throws android.os.RemoteException {}
        public void onListenerHintsChanged(int p0) throws android.os.RemoteException {}
        public void onInterruptionFilterChanged(int p0) throws android.os.RemoteException {}
        public void onNotificationEnqueuedWithChannel(android.service.notification.IStatusBarNotificationHolder p0, android.app.NotificationChannel p1) throws android.os.RemoteException {}
        public void onNotificationsSeen(java.util.List<java.lang.String> p0) throws android.os.RemoteException {}
        public void onNotificationSnoozedUntilContext(android.service.notification.IStatusBarNotificationHolder p0, java.lang.String p1) throws android.os.RemoteException {}
        public void onNotificationExpansionChanged(java.lang.String p0, boolean p1, boolean p2) {}
        public void onNotificationDirectReply(java.lang.String p0) {}
        public void onSuggestedReplySent(java.lang.String p0, java.lang.CharSequence p1, int p2) {}
        public void onActionClicked(java.lang.String p0, android.app.Notification.Action p1, int p2) {}
        public void onAllowedAdjustmentsChanged() {}
        public void onNotificationChannelModification(java.lang.String p0, android.os.UserHandle p1, android.app.NotificationChannel p2, int p3) {}
        public void onNotificationChannelGroupModification(java.lang.String p0, android.os.UserHandle p1, android.app.NotificationChannelGroup p2, int p3) {}
        public void onStatusBarIconsBehaviorChanged(boolean p0) {}
    }

    private final class MyHandler extends android.os.Handler {
        public static final int MSG_ON_NOTIFICATION_POSTED = 1;
        public static final int MSG_ON_NOTIFICATION_REMOVED = 2;
        public static final int MSG_ON_LISTENER_CONNECTED = 3;
        public static final int MSG_ON_NOTIFICATION_RANKING_UPDATE = 4;
        public static final int MSG_ON_LISTENER_HINTS_CHANGED = 5;
        public static final int MSG_ON_INTERRUPTION_FILTER_CHANGED = 6;
        public static final int MSG_ON_NOTIFICATION_CHANNEL_MODIFIED = 7;
        public static final int MSG_ON_NOTIFICATION_CHANNEL_GROUP_MODIFIED = 8;
        public static final int MSG_ON_STATUS_BAR_ICON_BEHAVIOR_CHANGED = 9;
        public MyHandler(android.service.notification.NotificationListenerService p0, android.os.Looper p1) { super(); }
        public void handleMessage(android.os.Message p0) {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ChannelOrGroupModificationTypes {
    }
}
