package com.android.internal.statusbar;

public interface IStatusBarService extends android.os.IInterface {
    @android.annotation.UnsupportedAppUsage
    public void expandNotificationsPanel() throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public void collapsePanels() throws android.os.RemoteException;
    public void togglePanel() throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public void disable(int p0, android.os.IBinder p1, java.lang.String p2) throws android.os.RemoteException;
    public void disableForUser(int p0, android.os.IBinder p1, java.lang.String p2, int p3) throws android.os.RemoteException;
    public void disable2(int p0, android.os.IBinder p1, java.lang.String p2) throws android.os.RemoteException;
    public void disable2ForUser(int p0, android.os.IBinder p1, java.lang.String p2, int p3) throws android.os.RemoteException;
    public int[] getDisableFlags(android.os.IBinder p0, int p1) throws android.os.RemoteException;
    public void setIcon(java.lang.String p0, java.lang.String p1, int p2, int p3, java.lang.String p4) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public void setIconVisibility(java.lang.String p0, boolean p1) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public void removeIcon(java.lang.String p0) throws android.os.RemoteException;
    public void setImeWindowStatus(int p0, android.os.IBinder p1, int p2, int p3, boolean p4) throws android.os.RemoteException;
    public void expandSettingsPanel(java.lang.String p0) throws android.os.RemoteException;
    public com.android.internal.statusbar.RegisterStatusBarResult registerStatusBar(com.android.internal.statusbar.IStatusBar p0) throws android.os.RemoteException;
    public void onPanelRevealed(boolean p0, int p1) throws android.os.RemoteException;
    public void onPanelHidden() throws android.os.RemoteException;
    public void clearNotificationEffects() throws android.os.RemoteException;
    public void onNotificationClick(java.lang.String p0, com.android.internal.statusbar.NotificationVisibility p1) throws android.os.RemoteException;
    public void onNotificationActionClick(java.lang.String p0, int p1, android.app.Notification.Action p2, com.android.internal.statusbar.NotificationVisibility p3, boolean p4) throws android.os.RemoteException;
    public void onNotificationError(java.lang.String p0, java.lang.String p1, int p2, int p3, int p4, java.lang.String p5, int p6) throws android.os.RemoteException;
    public void onClearAllNotifications(int p0) throws android.os.RemoteException;
    public void onNotificationClear(java.lang.String p0, java.lang.String p1, int p2, int p3, java.lang.String p4, int p5, int p6, com.android.internal.statusbar.NotificationVisibility p7) throws android.os.RemoteException;
    public void onNotificationVisibilityChanged(com.android.internal.statusbar.NotificationVisibility[] p0, com.android.internal.statusbar.NotificationVisibility[] p1) throws android.os.RemoteException;
    public void onNotificationExpansionChanged(java.lang.String p0, boolean p1, boolean p2, int p3) throws android.os.RemoteException;
    public void onNotificationDirectReplied(java.lang.String p0) throws android.os.RemoteException;
    public void onNotificationSmartSuggestionsAdded(java.lang.String p0, int p1, int p2, boolean p3, boolean p4) throws android.os.RemoteException;
    public void onNotificationSmartReplySent(java.lang.String p0, int p1, java.lang.CharSequence p2, int p3, boolean p4) throws android.os.RemoteException;
    public void onNotificationSettingsViewed(java.lang.String p0) throws android.os.RemoteException;
    public void setSystemUiVisibility(int p0, int p1, int p2, java.lang.String p3) throws android.os.RemoteException;
    public void onNotificationBubbleChanged(java.lang.String p0, boolean p1) throws android.os.RemoteException;
    public void onGlobalActionsShown() throws android.os.RemoteException;
    public void onGlobalActionsHidden() throws android.os.RemoteException;
    public void shutdown() throws android.os.RemoteException;
    public void reboot(boolean p0) throws android.os.RemoteException;
    public void addTile(android.content.ComponentName p0) throws android.os.RemoteException;
    public void remTile(android.content.ComponentName p0) throws android.os.RemoteException;
    public void clickTile(android.content.ComponentName p0) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public void handleSystemKey(int p0) throws android.os.RemoteException;
    public void showPinningEnterExitToast(boolean p0) throws android.os.RemoteException;
    public void showPinningEscapeToast() throws android.os.RemoteException;
    public void showBiometricDialog(android.os.Bundle p0, android.hardware.biometrics.IBiometricServiceReceiverInternal p1, int p2, boolean p3, int p4) throws android.os.RemoteException;
    public void onBiometricAuthenticated(boolean p0, java.lang.String p1) throws android.os.RemoteException;
    public void onBiometricHelp(java.lang.String p0) throws android.os.RemoteException;
    public void onBiometricError(java.lang.String p0) throws android.os.RemoteException;
    public void hideBiometricDialog() throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements com.android.internal.statusbar.IStatusBarService {
        private static final java.lang.String DESCRIPTOR = "com.android.internal.statusbar.IStatusBarService";
        static final int TRANSACTION_expandNotificationsPanel = 1;
        static final int TRANSACTION_collapsePanels = 2;
        static final int TRANSACTION_togglePanel = 3;
        static final int TRANSACTION_disable = 4;
        static final int TRANSACTION_disableForUser = 5;
        static final int TRANSACTION_disable2 = 6;
        static final int TRANSACTION_disable2ForUser = 7;
        static final int TRANSACTION_getDisableFlags = 8;
        static final int TRANSACTION_setIcon = 9;
        static final int TRANSACTION_setIconVisibility = 10;
        static final int TRANSACTION_removeIcon = 11;
        static final int TRANSACTION_setImeWindowStatus = 12;
        static final int TRANSACTION_expandSettingsPanel = 13;
        static final int TRANSACTION_registerStatusBar = 14;
        static final int TRANSACTION_onPanelRevealed = 15;
        static final int TRANSACTION_onPanelHidden = 16;
        static final int TRANSACTION_clearNotificationEffects = 17;
        static final int TRANSACTION_onNotificationClick = 18;
        static final int TRANSACTION_onNotificationActionClick = 19;
        static final int TRANSACTION_onNotificationError = 20;
        static final int TRANSACTION_onClearAllNotifications = 21;
        static final int TRANSACTION_onNotificationClear = 22;
        static final int TRANSACTION_onNotificationVisibilityChanged = 23;
        static final int TRANSACTION_onNotificationExpansionChanged = 24;
        static final int TRANSACTION_onNotificationDirectReplied = 25;
        static final int TRANSACTION_onNotificationSmartSuggestionsAdded = 26;
        static final int TRANSACTION_onNotificationSmartReplySent = 27;
        static final int TRANSACTION_onNotificationSettingsViewed = 28;
        static final int TRANSACTION_setSystemUiVisibility = 29;
        static final int TRANSACTION_onNotificationBubbleChanged = 30;
        static final int TRANSACTION_onGlobalActionsShown = 31;
        static final int TRANSACTION_onGlobalActionsHidden = 32;
        static final int TRANSACTION_shutdown = 33;
        static final int TRANSACTION_reboot = 34;
        static final int TRANSACTION_addTile = 35;
        static final int TRANSACTION_remTile = 36;
        static final int TRANSACTION_clickTile = 37;
        static final int TRANSACTION_handleSystemKey = 38;
        static final int TRANSACTION_showPinningEnterExitToast = 39;
        static final int TRANSACTION_showPinningEscapeToast = 40;
        static final int TRANSACTION_showBiometricDialog = 41;
        static final int TRANSACTION_onBiometricAuthenticated = 42;
        static final int TRANSACTION_onBiometricHelp = 43;
        static final int TRANSACTION_onBiometricError = 44;
        static final int TRANSACTION_hideBiometricDialog = 45;
        public Stub() { super(); }
        public static com.android.internal.statusbar.IStatusBarService asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(com.android.internal.statusbar.IStatusBarService p0) { return false; }
        public static com.android.internal.statusbar.IStatusBarService getDefaultImpl() { return null; }

        private static class Proxy implements com.android.internal.statusbar.IStatusBarService {
            private android.os.IBinder mRemote;
            public static com.android.internal.statusbar.IStatusBarService sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void expandNotificationsPanel() throws android.os.RemoteException {}
            public void collapsePanels() throws android.os.RemoteException {}
            public void togglePanel() throws android.os.RemoteException {}
            public void disable(int p0, android.os.IBinder p1, java.lang.String p2) throws android.os.RemoteException {}
            public void disableForUser(int p0, android.os.IBinder p1, java.lang.String p2, int p3) throws android.os.RemoteException {}
            public void disable2(int p0, android.os.IBinder p1, java.lang.String p2) throws android.os.RemoteException {}
            public void disable2ForUser(int p0, android.os.IBinder p1, java.lang.String p2, int p3) throws android.os.RemoteException {}
            public int[] getDisableFlags(android.os.IBinder p0, int p1) throws android.os.RemoteException { return null; }
            public void setIcon(java.lang.String p0, java.lang.String p1, int p2, int p3, java.lang.String p4) throws android.os.RemoteException {}
            public void setIconVisibility(java.lang.String p0, boolean p1) throws android.os.RemoteException {}
            public void removeIcon(java.lang.String p0) throws android.os.RemoteException {}
            public void setImeWindowStatus(int p0, android.os.IBinder p1, int p2, int p3, boolean p4) throws android.os.RemoteException {}
            public void expandSettingsPanel(java.lang.String p0) throws android.os.RemoteException {}
            public com.android.internal.statusbar.RegisterStatusBarResult registerStatusBar(com.android.internal.statusbar.IStatusBar p0) throws android.os.RemoteException { return null; }
            public void onPanelRevealed(boolean p0, int p1) throws android.os.RemoteException {}
            public void onPanelHidden() throws android.os.RemoteException {}
            public void clearNotificationEffects() throws android.os.RemoteException {}
            public void onNotificationClick(java.lang.String p0, com.android.internal.statusbar.NotificationVisibility p1) throws android.os.RemoteException {}
            public void onNotificationActionClick(java.lang.String p0, int p1, android.app.Notification.Action p2, com.android.internal.statusbar.NotificationVisibility p3, boolean p4) throws android.os.RemoteException {}
            public void onNotificationError(java.lang.String p0, java.lang.String p1, int p2, int p3, int p4, java.lang.String p5, int p6) throws android.os.RemoteException {}
            public void onClearAllNotifications(int p0) throws android.os.RemoteException {}
            public void onNotificationClear(java.lang.String p0, java.lang.String p1, int p2, int p3, java.lang.String p4, int p5, int p6, com.android.internal.statusbar.NotificationVisibility p7) throws android.os.RemoteException {}
            public void onNotificationVisibilityChanged(com.android.internal.statusbar.NotificationVisibility[] p0, com.android.internal.statusbar.NotificationVisibility[] p1) throws android.os.RemoteException {}
            public void onNotificationExpansionChanged(java.lang.String p0, boolean p1, boolean p2, int p3) throws android.os.RemoteException {}
            public void onNotificationDirectReplied(java.lang.String p0) throws android.os.RemoteException {}
            public void onNotificationSmartSuggestionsAdded(java.lang.String p0, int p1, int p2, boolean p3, boolean p4) throws android.os.RemoteException {}
            public void onNotificationSmartReplySent(java.lang.String p0, int p1, java.lang.CharSequence p2, int p3, boolean p4) throws android.os.RemoteException {}
            public void onNotificationSettingsViewed(java.lang.String p0) throws android.os.RemoteException {}
            public void setSystemUiVisibility(int p0, int p1, int p2, java.lang.String p3) throws android.os.RemoteException {}
            public void onNotificationBubbleChanged(java.lang.String p0, boolean p1) throws android.os.RemoteException {}
            public void onGlobalActionsShown() throws android.os.RemoteException {}
            public void onGlobalActionsHidden() throws android.os.RemoteException {}
            public void shutdown() throws android.os.RemoteException {}
            public void reboot(boolean p0) throws android.os.RemoteException {}
            public void addTile(android.content.ComponentName p0) throws android.os.RemoteException {}
            public void remTile(android.content.ComponentName p0) throws android.os.RemoteException {}
            public void clickTile(android.content.ComponentName p0) throws android.os.RemoteException {}
            public void handleSystemKey(int p0) throws android.os.RemoteException {}
            public void showPinningEnterExitToast(boolean p0) throws android.os.RemoteException {}
            public void showPinningEscapeToast() throws android.os.RemoteException {}
            public void showBiometricDialog(android.os.Bundle p0, android.hardware.biometrics.IBiometricServiceReceiverInternal p1, int p2, boolean p3, int p4) throws android.os.RemoteException {}
            public void onBiometricAuthenticated(boolean p0, java.lang.String p1) throws android.os.RemoteException {}
            public void onBiometricHelp(java.lang.String p0) throws android.os.RemoteException {}
            public void onBiometricError(java.lang.String p0) throws android.os.RemoteException {}
            public void hideBiometricDialog() throws android.os.RemoteException {}
        }
    }

    public static class Default implements com.android.internal.statusbar.IStatusBarService {
        public Default() {}
        public void expandNotificationsPanel() throws android.os.RemoteException {}
        public void collapsePanels() throws android.os.RemoteException {}
        public void togglePanel() throws android.os.RemoteException {}
        public void disable(int p0, android.os.IBinder p1, java.lang.String p2) throws android.os.RemoteException {}
        public void disableForUser(int p0, android.os.IBinder p1, java.lang.String p2, int p3) throws android.os.RemoteException {}
        public void disable2(int p0, android.os.IBinder p1, java.lang.String p2) throws android.os.RemoteException {}
        public void disable2ForUser(int p0, android.os.IBinder p1, java.lang.String p2, int p3) throws android.os.RemoteException {}
        public int[] getDisableFlags(android.os.IBinder p0, int p1) throws android.os.RemoteException { return null; }
        public void setIcon(java.lang.String p0, java.lang.String p1, int p2, int p3, java.lang.String p4) throws android.os.RemoteException {}
        public void setIconVisibility(java.lang.String p0, boolean p1) throws android.os.RemoteException {}
        public void removeIcon(java.lang.String p0) throws android.os.RemoteException {}
        public void setImeWindowStatus(int p0, android.os.IBinder p1, int p2, int p3, boolean p4) throws android.os.RemoteException {}
        public void expandSettingsPanel(java.lang.String p0) throws android.os.RemoteException {}
        public com.android.internal.statusbar.RegisterStatusBarResult registerStatusBar(com.android.internal.statusbar.IStatusBar p0) throws android.os.RemoteException { return null; }
        public void onPanelRevealed(boolean p0, int p1) throws android.os.RemoteException {}
        public void onPanelHidden() throws android.os.RemoteException {}
        public void clearNotificationEffects() throws android.os.RemoteException {}
        public void onNotificationClick(java.lang.String p0, com.android.internal.statusbar.NotificationVisibility p1) throws android.os.RemoteException {}
        public void onNotificationActionClick(java.lang.String p0, int p1, android.app.Notification.Action p2, com.android.internal.statusbar.NotificationVisibility p3, boolean p4) throws android.os.RemoteException {}
        public void onNotificationError(java.lang.String p0, java.lang.String p1, int p2, int p3, int p4, java.lang.String p5, int p6) throws android.os.RemoteException {}
        public void onClearAllNotifications(int p0) throws android.os.RemoteException {}
        public void onNotificationClear(java.lang.String p0, java.lang.String p1, int p2, int p3, java.lang.String p4, int p5, int p6, com.android.internal.statusbar.NotificationVisibility p7) throws android.os.RemoteException {}
        public void onNotificationVisibilityChanged(com.android.internal.statusbar.NotificationVisibility[] p0, com.android.internal.statusbar.NotificationVisibility[] p1) throws android.os.RemoteException {}
        public void onNotificationExpansionChanged(java.lang.String p0, boolean p1, boolean p2, int p3) throws android.os.RemoteException {}
        public void onNotificationDirectReplied(java.lang.String p0) throws android.os.RemoteException {}
        public void onNotificationSmartSuggestionsAdded(java.lang.String p0, int p1, int p2, boolean p3, boolean p4) throws android.os.RemoteException {}
        public void onNotificationSmartReplySent(java.lang.String p0, int p1, java.lang.CharSequence p2, int p3, boolean p4) throws android.os.RemoteException {}
        public void onNotificationSettingsViewed(java.lang.String p0) throws android.os.RemoteException {}
        public void setSystemUiVisibility(int p0, int p1, int p2, java.lang.String p3) throws android.os.RemoteException {}
        public void onNotificationBubbleChanged(java.lang.String p0, boolean p1) throws android.os.RemoteException {}
        public void onGlobalActionsShown() throws android.os.RemoteException {}
        public void onGlobalActionsHidden() throws android.os.RemoteException {}
        public void shutdown() throws android.os.RemoteException {}
        public void reboot(boolean p0) throws android.os.RemoteException {}
        public void addTile(android.content.ComponentName p0) throws android.os.RemoteException {}
        public void remTile(android.content.ComponentName p0) throws android.os.RemoteException {}
        public void clickTile(android.content.ComponentName p0) throws android.os.RemoteException {}
        public void handleSystemKey(int p0) throws android.os.RemoteException {}
        public void showPinningEnterExitToast(boolean p0) throws android.os.RemoteException {}
        public void showPinningEscapeToast() throws android.os.RemoteException {}
        public void showBiometricDialog(android.os.Bundle p0, android.hardware.biometrics.IBiometricServiceReceiverInternal p1, int p2, boolean p3, int p4) throws android.os.RemoteException {}
        public void onBiometricAuthenticated(boolean p0, java.lang.String p1) throws android.os.RemoteException {}
        public void onBiometricHelp(java.lang.String p0) throws android.os.RemoteException {}
        public void onBiometricError(java.lang.String p0) throws android.os.RemoteException {}
        public void hideBiometricDialog() throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }
}
