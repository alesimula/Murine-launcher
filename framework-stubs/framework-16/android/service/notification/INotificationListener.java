package android.service.notification;

public interface INotificationListener extends android.os.IInterface {
    public void onListenerConnected(android.service.notification.NotificationRankingUpdate p0, android.service.notification.IDispatchCompletionListener p1, long p2) throws android.os.RemoteException;
    public void onNotificationPosted(android.service.notification.IStatusBarNotificationHolder p0, android.service.notification.NotificationRankingUpdate p1, long p2) throws android.os.RemoteException;
    public void onNotificationPostedFull(android.service.notification.StatusBarNotification p0, android.service.notification.NotificationRankingUpdate p1, long p2) throws android.os.RemoteException;
    public void onStatusBarIconsBehaviorChanged(boolean p0, long p1) throws android.os.RemoteException;
    public void onNotificationRemoved(android.service.notification.IStatusBarNotificationHolder p0, android.service.notification.NotificationRankingUpdate p1, android.service.notification.NotificationStats p2, int p3, long p4) throws android.os.RemoteException;
    public void onNotificationRemovedFull(android.service.notification.StatusBarNotification p0, android.service.notification.NotificationRankingUpdate p1, android.service.notification.NotificationStats p2, int p3, long p4) throws android.os.RemoteException;
    public void onNotificationRankingUpdate(android.service.notification.NotificationRankingUpdate p0, long p1) throws android.os.RemoteException;
    public void onListenerHintsChanged(int p0, long p1) throws android.os.RemoteException;
    public void onInterruptionFilterChanged(int p0, long p1) throws android.os.RemoteException;
    public void onNotificationChannelModification(java.lang.String p0, android.os.UserHandle p1, android.app.NotificationChannel p2, int p3, long p4) throws android.os.RemoteException;
    public void onNotificationChannelGroupModification(java.lang.String p0, android.os.UserHandle p1, android.app.NotificationChannelGroup p2, int p3, long p4) throws android.os.RemoteException;
    public void onNotificationEnqueuedWithChannel(android.service.notification.IStatusBarNotificationHolder p0, android.app.NotificationChannel p1, android.service.notification.NotificationRankingUpdate p2) throws android.os.RemoteException;
    public void onNotificationEnqueuedWithChannelFull(android.service.notification.StatusBarNotification p0, android.app.NotificationChannel p1, android.service.notification.NotificationRankingUpdate p2) throws android.os.RemoteException;
    public void onNotificationSnoozedUntilContext(android.service.notification.IStatusBarNotificationHolder p0, java.lang.String p1) throws android.os.RemoteException;
    public void onNotificationSnoozedUntilContextFull(android.service.notification.StatusBarNotification p0, java.lang.String p1) throws android.os.RemoteException;
    public void onNotificationsSeen(java.util.List<java.lang.String> p0) throws android.os.RemoteException;
    public void onPanelRevealed(int p0) throws android.os.RemoteException;
    public void onPanelHidden() throws android.os.RemoteException;
    public void onNotificationVisibilityChanged(java.lang.String p0, boolean p1) throws android.os.RemoteException;
    public void onNotificationExpansionChanged(java.lang.String p0, boolean p1, boolean p2) throws android.os.RemoteException;
    public void onNotificationDirectReply(java.lang.String p0) throws android.os.RemoteException;
    public void onSuggestedReplySent(java.lang.String p0, java.lang.CharSequence p1, int p2) throws android.os.RemoteException;
    public void onActionClicked(java.lang.String p0, android.app.Notification.Action p1, int p2) throws android.os.RemoteException;
    public void onNotificationClicked(java.lang.String p0) throws android.os.RemoteException;
    public void onAllowedAdjustmentsChanged() throws android.os.RemoteException;
    public void onNotificationFeedbackReceived(java.lang.String p0, android.service.notification.NotificationRankingUpdate p1, android.os.Bundle p2) throws android.os.RemoteException;

    public static class Default implements android.service.notification.INotificationListener {
        public Default() {}
        public void onListenerConnected(android.service.notification.NotificationRankingUpdate p0, android.service.notification.IDispatchCompletionListener p1, long p2) throws android.os.RemoteException {}
        public void onNotificationPosted(android.service.notification.IStatusBarNotificationHolder p0, android.service.notification.NotificationRankingUpdate p1, long p2) throws android.os.RemoteException {}
        public void onNotificationPostedFull(android.service.notification.StatusBarNotification p0, android.service.notification.NotificationRankingUpdate p1, long p2) throws android.os.RemoteException {}
        public void onStatusBarIconsBehaviorChanged(boolean p0, long p1) throws android.os.RemoteException {}
        public void onNotificationRemoved(android.service.notification.IStatusBarNotificationHolder p0, android.service.notification.NotificationRankingUpdate p1, android.service.notification.NotificationStats p2, int p3, long p4) throws android.os.RemoteException {}
        public void onNotificationRemovedFull(android.service.notification.StatusBarNotification p0, android.service.notification.NotificationRankingUpdate p1, android.service.notification.NotificationStats p2, int p3, long p4) throws android.os.RemoteException {}
        public void onNotificationRankingUpdate(android.service.notification.NotificationRankingUpdate p0, long p1) throws android.os.RemoteException {}
        public void onListenerHintsChanged(int p0, long p1) throws android.os.RemoteException {}
        public void onInterruptionFilterChanged(int p0, long p1) throws android.os.RemoteException {}
        public void onNotificationChannelModification(java.lang.String p0, android.os.UserHandle p1, android.app.NotificationChannel p2, int p3, long p4) throws android.os.RemoteException {}
        public void onNotificationChannelGroupModification(java.lang.String p0, android.os.UserHandle p1, android.app.NotificationChannelGroup p2, int p3, long p4) throws android.os.RemoteException {}
        public void onNotificationEnqueuedWithChannel(android.service.notification.IStatusBarNotificationHolder p0, android.app.NotificationChannel p1, android.service.notification.NotificationRankingUpdate p2) throws android.os.RemoteException {}
        public void onNotificationEnqueuedWithChannelFull(android.service.notification.StatusBarNotification p0, android.app.NotificationChannel p1, android.service.notification.NotificationRankingUpdate p2) throws android.os.RemoteException {}
        public void onNotificationSnoozedUntilContext(android.service.notification.IStatusBarNotificationHolder p0, java.lang.String p1) throws android.os.RemoteException {}
        public void onNotificationSnoozedUntilContextFull(android.service.notification.StatusBarNotification p0, java.lang.String p1) throws android.os.RemoteException {}
        public void onNotificationsSeen(java.util.List<java.lang.String> p0) throws android.os.RemoteException {}
        public void onPanelRevealed(int p0) throws android.os.RemoteException {}
        public void onPanelHidden() throws android.os.RemoteException {}
        public void onNotificationVisibilityChanged(java.lang.String p0, boolean p1) throws android.os.RemoteException {}
        public void onNotificationExpansionChanged(java.lang.String p0, boolean p1, boolean p2) throws android.os.RemoteException {}
        public void onNotificationDirectReply(java.lang.String p0) throws android.os.RemoteException {}
        public void onSuggestedReplySent(java.lang.String p0, java.lang.CharSequence p1, int p2) throws android.os.RemoteException {}
        public void onActionClicked(java.lang.String p0, android.app.Notification.Action p1, int p2) throws android.os.RemoteException {}
        public void onNotificationClicked(java.lang.String p0) throws android.os.RemoteException {}
        public void onAllowedAdjustmentsChanged() throws android.os.RemoteException {}
        public void onNotificationFeedbackReceived(java.lang.String p0, android.service.notification.NotificationRankingUpdate p1, android.os.Bundle p2) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.service.notification.INotificationListener {
        public static final java.lang.String DESCRIPTOR = "android.service.notification.INotificationListener";
        static final int TRANSACTION_onListenerConnected = 1;
        static final int TRANSACTION_onNotificationPosted = 2;
        static final int TRANSACTION_onNotificationPostedFull = 3;
        static final int TRANSACTION_onStatusBarIconsBehaviorChanged = 4;
        static final int TRANSACTION_onNotificationRemoved = 5;
        static final int TRANSACTION_onNotificationRemovedFull = 6;
        static final int TRANSACTION_onNotificationRankingUpdate = 7;
        static final int TRANSACTION_onListenerHintsChanged = 8;
        static final int TRANSACTION_onInterruptionFilterChanged = 9;
        static final int TRANSACTION_onNotificationChannelModification = 10;
        static final int TRANSACTION_onNotificationChannelGroupModification = 11;
        static final int TRANSACTION_onNotificationEnqueuedWithChannel = 12;
        static final int TRANSACTION_onNotificationEnqueuedWithChannelFull = 13;
        static final int TRANSACTION_onNotificationSnoozedUntilContext = 14;
        static final int TRANSACTION_onNotificationSnoozedUntilContextFull = 15;
        static final int TRANSACTION_onNotificationsSeen = 16;
        static final int TRANSACTION_onPanelRevealed = 17;
        static final int TRANSACTION_onPanelHidden = 18;
        static final int TRANSACTION_onNotificationVisibilityChanged = 19;
        static final int TRANSACTION_onNotificationExpansionChanged = 20;
        static final int TRANSACTION_onNotificationDirectReply = 21;
        static final int TRANSACTION_onSuggestedReplySent = 22;
        static final int TRANSACTION_onActionClicked = 23;
        static final int TRANSACTION_onNotificationClicked = 24;
        static final int TRANSACTION_onAllowedAdjustmentsChanged = 25;
        static final int TRANSACTION_onNotificationFeedbackReceived = 26;
        public Stub() { super(); }
        public static android.service.notification.INotificationListener asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.service.notification.INotificationListener {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onListenerConnected(android.service.notification.NotificationRankingUpdate p0, android.service.notification.IDispatchCompletionListener p1, long p2) throws android.os.RemoteException {}
            public void onNotificationPosted(android.service.notification.IStatusBarNotificationHolder p0, android.service.notification.NotificationRankingUpdate p1, long p2) throws android.os.RemoteException {}
            public void onNotificationPostedFull(android.service.notification.StatusBarNotification p0, android.service.notification.NotificationRankingUpdate p1, long p2) throws android.os.RemoteException {}
            public void onStatusBarIconsBehaviorChanged(boolean p0, long p1) throws android.os.RemoteException {}
            public void onNotificationRemoved(android.service.notification.IStatusBarNotificationHolder p0, android.service.notification.NotificationRankingUpdate p1, android.service.notification.NotificationStats p2, int p3, long p4) throws android.os.RemoteException {}
            public void onNotificationRemovedFull(android.service.notification.StatusBarNotification p0, android.service.notification.NotificationRankingUpdate p1, android.service.notification.NotificationStats p2, int p3, long p4) throws android.os.RemoteException {}
            public void onNotificationRankingUpdate(android.service.notification.NotificationRankingUpdate p0, long p1) throws android.os.RemoteException {}
            public void onListenerHintsChanged(int p0, long p1) throws android.os.RemoteException {}
            public void onInterruptionFilterChanged(int p0, long p1) throws android.os.RemoteException {}
            public void onNotificationChannelModification(java.lang.String p0, android.os.UserHandle p1, android.app.NotificationChannel p2, int p3, long p4) throws android.os.RemoteException {}
            public void onNotificationChannelGroupModification(java.lang.String p0, android.os.UserHandle p1, android.app.NotificationChannelGroup p2, int p3, long p4) throws android.os.RemoteException {}
            public void onNotificationEnqueuedWithChannel(android.service.notification.IStatusBarNotificationHolder p0, android.app.NotificationChannel p1, android.service.notification.NotificationRankingUpdate p2) throws android.os.RemoteException {}
            public void onNotificationEnqueuedWithChannelFull(android.service.notification.StatusBarNotification p0, android.app.NotificationChannel p1, android.service.notification.NotificationRankingUpdate p2) throws android.os.RemoteException {}
            public void onNotificationSnoozedUntilContext(android.service.notification.IStatusBarNotificationHolder p0, java.lang.String p1) throws android.os.RemoteException {}
            public void onNotificationSnoozedUntilContextFull(android.service.notification.StatusBarNotification p0, java.lang.String p1) throws android.os.RemoteException {}
            public void onNotificationsSeen(java.util.List<java.lang.String> p0) throws android.os.RemoteException {}
            public void onPanelRevealed(int p0) throws android.os.RemoteException {}
            public void onPanelHidden() throws android.os.RemoteException {}
            public void onNotificationVisibilityChanged(java.lang.String p0, boolean p1) throws android.os.RemoteException {}
            public void onNotificationExpansionChanged(java.lang.String p0, boolean p1, boolean p2) throws android.os.RemoteException {}
            public void onNotificationDirectReply(java.lang.String p0) throws android.os.RemoteException {}
            public void onSuggestedReplySent(java.lang.String p0, java.lang.CharSequence p1, int p2) throws android.os.RemoteException {}
            public void onActionClicked(java.lang.String p0, android.app.Notification.Action p1, int p2) throws android.os.RemoteException {}
            public void onNotificationClicked(java.lang.String p0) throws android.os.RemoteException {}
            public void onAllowedAdjustmentsChanged() throws android.os.RemoteException {}
            public void onNotificationFeedbackReceived(java.lang.String p0, android.service.notification.NotificationRankingUpdate p1, android.os.Bundle p2) throws android.os.RemoteException {}
        }
    }
}
