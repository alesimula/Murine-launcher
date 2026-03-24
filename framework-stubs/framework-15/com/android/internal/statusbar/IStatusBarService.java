package com.android.internal.statusbar;

public interface IStatusBarService extends android.os.IInterface {
    public void expandNotificationsPanel() throws android.os.RemoteException;
    public void collapsePanels() throws android.os.RemoteException;
    public void togglePanel() throws android.os.RemoteException;
    public void disable(int p0, android.os.IBinder p1, java.lang.String p2) throws android.os.RemoteException;
    public void disableForUser(int p0, android.os.IBinder p1, java.lang.String p2, int p3) throws android.os.RemoteException;
    public void disable2(int p0, android.os.IBinder p1, java.lang.String p2) throws android.os.RemoteException;
    public void disable2ForUser(int p0, android.os.IBinder p1, java.lang.String p2, int p3) throws android.os.RemoteException;
    public int[] getDisableFlags(android.os.IBinder p0, int p1) throws android.os.RemoteException;
    public void setIcon(java.lang.String p0, java.lang.String p1, int p2, int p3, java.lang.String p4) throws android.os.RemoteException;
    public void setIconVisibility(java.lang.String p0, boolean p1) throws android.os.RemoteException;
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
    public void onNotificationClear(java.lang.String p0, int p1, java.lang.String p2, int p3, int p4, com.android.internal.statusbar.NotificationVisibility p5) throws android.os.RemoteException;
    public void onNotificationVisibilityChanged(com.android.internal.statusbar.NotificationVisibility[] p0, com.android.internal.statusbar.NotificationVisibility[] p1) throws android.os.RemoteException;
    public void onNotificationExpansionChanged(java.lang.String p0, boolean p1, boolean p2, int p3) throws android.os.RemoteException;
    public void onNotificationDirectReplied(java.lang.String p0) throws android.os.RemoteException;
    public void onNotificationSmartSuggestionsAdded(java.lang.String p0, int p1, int p2, boolean p3, boolean p4) throws android.os.RemoteException;
    public void onNotificationSmartReplySent(java.lang.String p0, int p1, java.lang.CharSequence p2, int p3, boolean p4) throws android.os.RemoteException;
    public void onNotificationSettingsViewed(java.lang.String p0) throws android.os.RemoteException;
    public void onNotificationBubbleChanged(java.lang.String p0, boolean p1, int p2) throws android.os.RemoteException;
    public void onBubbleMetadataFlagChanged(java.lang.String p0, int p1) throws android.os.RemoteException;
    public void hideCurrentInputMethodForBubbles(int p0) throws android.os.RemoteException;
    public void grantInlineReplyUriPermission(java.lang.String p0, android.net.Uri p1, android.os.UserHandle p2, java.lang.String p3) throws android.os.RemoteException;
    public void clearInlineReplyUriPermissions(java.lang.String p0) throws android.os.RemoteException;
    public void onNotificationFeedbackReceived(java.lang.String p0, android.os.Bundle p1) throws android.os.RemoteException;
    public void onGlobalActionsShown() throws android.os.RemoteException;
    public void onGlobalActionsHidden() throws android.os.RemoteException;
    public void shutdown() throws android.os.RemoteException;
    public void reboot(boolean p0) throws android.os.RemoteException;
    public void restart() throws android.os.RemoteException;
    public void addTile(android.content.ComponentName p0) throws android.os.RemoteException;
    public void remTile(android.content.ComponentName p0) throws android.os.RemoteException;
    public void clickTile(android.content.ComponentName p0) throws android.os.RemoteException;
    public void handleSystemKey(android.view.KeyEvent p0) throws android.os.RemoteException;
    public int getLastSystemKey() throws android.os.RemoteException;
    public void showPinningEnterExitToast(boolean p0) throws android.os.RemoteException;
    public void showPinningEscapeToast() throws android.os.RemoteException;
    public void showAuthenticationDialog(android.hardware.biometrics.PromptInfo p0, android.hardware.biometrics.IBiometricSysuiReceiver p1, int[] p2, boolean p3, boolean p4, int p5, long p6, java.lang.String p7, long p8) throws android.os.RemoteException;
    public void onBiometricAuthenticated(int p0) throws android.os.RemoteException;
    public void onBiometricHelp(int p0, java.lang.String p1) throws android.os.RemoteException;
    public void onBiometricError(int p0, int p1, int p2) throws android.os.RemoteException;
    public void hideAuthenticationDialog(long p0) throws android.os.RemoteException;
    public void setBiometicContextListener(android.hardware.biometrics.IBiometricContextListener p0) throws android.os.RemoteException;
    public void setUdfpsRefreshRateCallback(android.hardware.fingerprint.IUdfpsRefreshRateRequestCallback p0) throws android.os.RemoteException;
    public void showInattentiveSleepWarning() throws android.os.RemoteException;
    public void dismissInattentiveSleepWarning(boolean p0) throws android.os.RemoteException;
    public void startTracing() throws android.os.RemoteException;
    public void stopTracing() throws android.os.RemoteException;
    public boolean isTracing() throws android.os.RemoteException;
    public void suppressAmbientDisplay(boolean p0) throws android.os.RemoteException;
    public void requestTileServiceListeningState(android.content.ComponentName p0, int p1) throws android.os.RemoteException;
    public void requestAddTile(android.content.ComponentName p0, java.lang.CharSequence p1, android.graphics.drawable.Icon p2, int p3, com.android.internal.statusbar.IAddTileResultCallback p4) throws android.os.RemoteException;
    public void cancelRequestAddTile(java.lang.String p0) throws android.os.RemoteException;
    public void setNavBarMode(int p0) throws android.os.RemoteException;
    public int getNavBarMode() throws android.os.RemoteException;
    public void registerSessionListener(int p0, com.android.internal.statusbar.ISessionListener p1) throws android.os.RemoteException;
    public void unregisterSessionListener(int p0, com.android.internal.statusbar.ISessionListener p1) throws android.os.RemoteException;
    public void onSessionStarted(int p0, com.android.internal.logging.InstanceId p1) throws android.os.RemoteException;
    public void onSessionEnded(int p0, com.android.internal.logging.InstanceId p1) throws android.os.RemoteException;
    public void updateMediaTapToTransferSenderDisplay(int p0, android.media.MediaRoute2Info p1, com.android.internal.statusbar.IUndoMediaTransferCallback p2) throws android.os.RemoteException;
    public void updateMediaTapToTransferReceiverDisplay(int p0, android.media.MediaRoute2Info p1, android.graphics.drawable.Icon p2, java.lang.CharSequence p3) throws android.os.RemoteException;
    public void registerNearbyMediaDevicesProvider(android.media.INearbyMediaDevicesProvider p0) throws android.os.RemoteException;
    public void unregisterNearbyMediaDevicesProvider(android.media.INearbyMediaDevicesProvider p0) throws android.os.RemoteException;
    public void showRearDisplayDialog(int p0) throws android.os.RemoteException;

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
        public void onNotificationClear(java.lang.String p0, int p1, java.lang.String p2, int p3, int p4, com.android.internal.statusbar.NotificationVisibility p5) throws android.os.RemoteException {}
        public void onNotificationVisibilityChanged(com.android.internal.statusbar.NotificationVisibility[] p0, com.android.internal.statusbar.NotificationVisibility[] p1) throws android.os.RemoteException {}
        public void onNotificationExpansionChanged(java.lang.String p0, boolean p1, boolean p2, int p3) throws android.os.RemoteException {}
        public void onNotificationDirectReplied(java.lang.String p0) throws android.os.RemoteException {}
        public void onNotificationSmartSuggestionsAdded(java.lang.String p0, int p1, int p2, boolean p3, boolean p4) throws android.os.RemoteException {}
        public void onNotificationSmartReplySent(java.lang.String p0, int p1, java.lang.CharSequence p2, int p3, boolean p4) throws android.os.RemoteException {}
        public void onNotificationSettingsViewed(java.lang.String p0) throws android.os.RemoteException {}
        public void onNotificationBubbleChanged(java.lang.String p0, boolean p1, int p2) throws android.os.RemoteException {}
        public void onBubbleMetadataFlagChanged(java.lang.String p0, int p1) throws android.os.RemoteException {}
        public void hideCurrentInputMethodForBubbles(int p0) throws android.os.RemoteException {}
        public void grantInlineReplyUriPermission(java.lang.String p0, android.net.Uri p1, android.os.UserHandle p2, java.lang.String p3) throws android.os.RemoteException {}
        public void clearInlineReplyUriPermissions(java.lang.String p0) throws android.os.RemoteException {}
        public void onNotificationFeedbackReceived(java.lang.String p0, android.os.Bundle p1) throws android.os.RemoteException {}
        public void onGlobalActionsShown() throws android.os.RemoteException {}
        public void onGlobalActionsHidden() throws android.os.RemoteException {}
        public void shutdown() throws android.os.RemoteException {}
        public void reboot(boolean p0) throws android.os.RemoteException {}
        public void restart() throws android.os.RemoteException {}
        public void addTile(android.content.ComponentName p0) throws android.os.RemoteException {}
        public void remTile(android.content.ComponentName p0) throws android.os.RemoteException {}
        public void clickTile(android.content.ComponentName p0) throws android.os.RemoteException {}
        public void handleSystemKey(android.view.KeyEvent p0) throws android.os.RemoteException {}
        public int getLastSystemKey() throws android.os.RemoteException { return 0; }
        public void showPinningEnterExitToast(boolean p0) throws android.os.RemoteException {}
        public void showPinningEscapeToast() throws android.os.RemoteException {}
        public void showAuthenticationDialog(android.hardware.biometrics.PromptInfo p0, android.hardware.biometrics.IBiometricSysuiReceiver p1, int[] p2, boolean p3, boolean p4, int p5, long p6, java.lang.String p7, long p8) throws android.os.RemoteException {}
        public void onBiometricAuthenticated(int p0) throws android.os.RemoteException {}
        public void onBiometricHelp(int p0, java.lang.String p1) throws android.os.RemoteException {}
        public void onBiometricError(int p0, int p1, int p2) throws android.os.RemoteException {}
        public void hideAuthenticationDialog(long p0) throws android.os.RemoteException {}
        public void setBiometicContextListener(android.hardware.biometrics.IBiometricContextListener p0) throws android.os.RemoteException {}
        public void setUdfpsRefreshRateCallback(android.hardware.fingerprint.IUdfpsRefreshRateRequestCallback p0) throws android.os.RemoteException {}
        public void showInattentiveSleepWarning() throws android.os.RemoteException {}
        public void dismissInattentiveSleepWarning(boolean p0) throws android.os.RemoteException {}
        public void startTracing() throws android.os.RemoteException {}
        public void stopTracing() throws android.os.RemoteException {}
        public boolean isTracing() throws android.os.RemoteException { return false; }
        public void suppressAmbientDisplay(boolean p0) throws android.os.RemoteException {}
        public void requestTileServiceListeningState(android.content.ComponentName p0, int p1) throws android.os.RemoteException {}
        public void requestAddTile(android.content.ComponentName p0, java.lang.CharSequence p1, android.graphics.drawable.Icon p2, int p3, com.android.internal.statusbar.IAddTileResultCallback p4) throws android.os.RemoteException {}
        public void cancelRequestAddTile(java.lang.String p0) throws android.os.RemoteException {}
        public void setNavBarMode(int p0) throws android.os.RemoteException {}
        public int getNavBarMode() throws android.os.RemoteException { return 0; }
        public void registerSessionListener(int p0, com.android.internal.statusbar.ISessionListener p1) throws android.os.RemoteException {}
        public void unregisterSessionListener(int p0, com.android.internal.statusbar.ISessionListener p1) throws android.os.RemoteException {}
        public void onSessionStarted(int p0, com.android.internal.logging.InstanceId p1) throws android.os.RemoteException {}
        public void onSessionEnded(int p0, com.android.internal.logging.InstanceId p1) throws android.os.RemoteException {}
        public void updateMediaTapToTransferSenderDisplay(int p0, android.media.MediaRoute2Info p1, com.android.internal.statusbar.IUndoMediaTransferCallback p2) throws android.os.RemoteException {}
        public void updateMediaTapToTransferReceiverDisplay(int p0, android.media.MediaRoute2Info p1, android.graphics.drawable.Icon p2, java.lang.CharSequence p3) throws android.os.RemoteException {}
        public void registerNearbyMediaDevicesProvider(android.media.INearbyMediaDevicesProvider p0) throws android.os.RemoteException {}
        public void unregisterNearbyMediaDevicesProvider(android.media.INearbyMediaDevicesProvider p0) throws android.os.RemoteException {}
        public void showRearDisplayDialog(int p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements com.android.internal.statusbar.IStatusBarService {
        public static final java.lang.String DESCRIPTOR = "com.android.internal.statusbar.IStatusBarService";
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
        static final int TRANSACTION_onNotificationBubbleChanged = 29;
        static final int TRANSACTION_onBubbleMetadataFlagChanged = 30;
        static final int TRANSACTION_hideCurrentInputMethodForBubbles = 31;
        static final int TRANSACTION_grantInlineReplyUriPermission = 32;
        static final int TRANSACTION_clearInlineReplyUriPermissions = 33;
        static final int TRANSACTION_onNotificationFeedbackReceived = 34;
        static final int TRANSACTION_onGlobalActionsShown = 35;
        static final int TRANSACTION_onGlobalActionsHidden = 36;
        static final int TRANSACTION_shutdown = 37;
        static final int TRANSACTION_reboot = 38;
        static final int TRANSACTION_restart = 39;
        static final int TRANSACTION_addTile = 40;
        static final int TRANSACTION_remTile = 41;
        static final int TRANSACTION_clickTile = 42;
        static final int TRANSACTION_handleSystemKey = 43;
        static final int TRANSACTION_getLastSystemKey = 44;
        static final int TRANSACTION_showPinningEnterExitToast = 45;
        static final int TRANSACTION_showPinningEscapeToast = 46;
        static final int TRANSACTION_showAuthenticationDialog = 47;
        static final int TRANSACTION_onBiometricAuthenticated = 48;
        static final int TRANSACTION_onBiometricHelp = 49;
        static final int TRANSACTION_onBiometricError = 50;
        static final int TRANSACTION_hideAuthenticationDialog = 51;
        static final int TRANSACTION_setBiometicContextListener = 52;
        static final int TRANSACTION_setUdfpsRefreshRateCallback = 53;
        static final int TRANSACTION_showInattentiveSleepWarning = 54;
        static final int TRANSACTION_dismissInattentiveSleepWarning = 55;
        static final int TRANSACTION_startTracing = 56;
        static final int TRANSACTION_stopTracing = 57;
        static final int TRANSACTION_isTracing = 58;
        static final int TRANSACTION_suppressAmbientDisplay = 59;
        static final int TRANSACTION_requestTileServiceListeningState = 60;
        static final int TRANSACTION_requestAddTile = 61;
        static final int TRANSACTION_cancelRequestAddTile = 62;
        static final int TRANSACTION_setNavBarMode = 63;
        static final int TRANSACTION_getNavBarMode = 64;
        static final int TRANSACTION_registerSessionListener = 65;
        static final int TRANSACTION_unregisterSessionListener = 66;
        static final int TRANSACTION_onSessionStarted = 67;
        static final int TRANSACTION_onSessionEnded = 68;
        static final int TRANSACTION_updateMediaTapToTransferSenderDisplay = 69;
        static final int TRANSACTION_updateMediaTapToTransferReceiverDisplay = 70;
        static final int TRANSACTION_registerNearbyMediaDevicesProvider = 71;
        static final int TRANSACTION_unregisterNearbyMediaDevicesProvider = 72;
        static final int TRANSACTION_showRearDisplayDialog = 73;
        public Stub() { super(); }
        public static com.android.internal.statusbar.IStatusBarService asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements com.android.internal.statusbar.IStatusBarService {
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
            public void onNotificationClear(java.lang.String p0, int p1, java.lang.String p2, int p3, int p4, com.android.internal.statusbar.NotificationVisibility p5) throws android.os.RemoteException {}
            public void onNotificationVisibilityChanged(com.android.internal.statusbar.NotificationVisibility[] p0, com.android.internal.statusbar.NotificationVisibility[] p1) throws android.os.RemoteException {}
            public void onNotificationExpansionChanged(java.lang.String p0, boolean p1, boolean p2, int p3) throws android.os.RemoteException {}
            public void onNotificationDirectReplied(java.lang.String p0) throws android.os.RemoteException {}
            public void onNotificationSmartSuggestionsAdded(java.lang.String p0, int p1, int p2, boolean p3, boolean p4) throws android.os.RemoteException {}
            public void onNotificationSmartReplySent(java.lang.String p0, int p1, java.lang.CharSequence p2, int p3, boolean p4) throws android.os.RemoteException {}
            public void onNotificationSettingsViewed(java.lang.String p0) throws android.os.RemoteException {}
            public void onNotificationBubbleChanged(java.lang.String p0, boolean p1, int p2) throws android.os.RemoteException {}
            public void onBubbleMetadataFlagChanged(java.lang.String p0, int p1) throws android.os.RemoteException {}
            public void hideCurrentInputMethodForBubbles(int p0) throws android.os.RemoteException {}
            public void grantInlineReplyUriPermission(java.lang.String p0, android.net.Uri p1, android.os.UserHandle p2, java.lang.String p3) throws android.os.RemoteException {}
            public void clearInlineReplyUriPermissions(java.lang.String p0) throws android.os.RemoteException {}
            public void onNotificationFeedbackReceived(java.lang.String p0, android.os.Bundle p1) throws android.os.RemoteException {}
            public void onGlobalActionsShown() throws android.os.RemoteException {}
            public void onGlobalActionsHidden() throws android.os.RemoteException {}
            public void shutdown() throws android.os.RemoteException {}
            public void reboot(boolean p0) throws android.os.RemoteException {}
            public void restart() throws android.os.RemoteException {}
            public void addTile(android.content.ComponentName p0) throws android.os.RemoteException {}
            public void remTile(android.content.ComponentName p0) throws android.os.RemoteException {}
            public void clickTile(android.content.ComponentName p0) throws android.os.RemoteException {}
            public void handleSystemKey(android.view.KeyEvent p0) throws android.os.RemoteException {}
            public int getLastSystemKey() throws android.os.RemoteException { return 0; }
            public void showPinningEnterExitToast(boolean p0) throws android.os.RemoteException {}
            public void showPinningEscapeToast() throws android.os.RemoteException {}
            public void showAuthenticationDialog(android.hardware.biometrics.PromptInfo p0, android.hardware.biometrics.IBiometricSysuiReceiver p1, int[] p2, boolean p3, boolean p4, int p5, long p6, java.lang.String p7, long p8) throws android.os.RemoteException {}
            public void onBiometricAuthenticated(int p0) throws android.os.RemoteException {}
            public void onBiometricHelp(int p0, java.lang.String p1) throws android.os.RemoteException {}
            public void onBiometricError(int p0, int p1, int p2) throws android.os.RemoteException {}
            public void hideAuthenticationDialog(long p0) throws android.os.RemoteException {}
            public void setBiometicContextListener(android.hardware.biometrics.IBiometricContextListener p0) throws android.os.RemoteException {}
            public void setUdfpsRefreshRateCallback(android.hardware.fingerprint.IUdfpsRefreshRateRequestCallback p0) throws android.os.RemoteException {}
            public void showInattentiveSleepWarning() throws android.os.RemoteException {}
            public void dismissInattentiveSleepWarning(boolean p0) throws android.os.RemoteException {}
            public void startTracing() throws android.os.RemoteException {}
            public void stopTracing() throws android.os.RemoteException {}
            public boolean isTracing() throws android.os.RemoteException { return false; }
            public void suppressAmbientDisplay(boolean p0) throws android.os.RemoteException {}
            public void requestTileServiceListeningState(android.content.ComponentName p0, int p1) throws android.os.RemoteException {}
            public void requestAddTile(android.content.ComponentName p0, java.lang.CharSequence p1, android.graphics.drawable.Icon p2, int p3, com.android.internal.statusbar.IAddTileResultCallback p4) throws android.os.RemoteException {}
            public void cancelRequestAddTile(java.lang.String p0) throws android.os.RemoteException {}
            public void setNavBarMode(int p0) throws android.os.RemoteException {}
            public int getNavBarMode() throws android.os.RemoteException { return 0; }
            public void registerSessionListener(int p0, com.android.internal.statusbar.ISessionListener p1) throws android.os.RemoteException {}
            public void unregisterSessionListener(int p0, com.android.internal.statusbar.ISessionListener p1) throws android.os.RemoteException {}
            public void onSessionStarted(int p0, com.android.internal.logging.InstanceId p1) throws android.os.RemoteException {}
            public void onSessionEnded(int p0, com.android.internal.logging.InstanceId p1) throws android.os.RemoteException {}
            public void updateMediaTapToTransferSenderDisplay(int p0, android.media.MediaRoute2Info p1, com.android.internal.statusbar.IUndoMediaTransferCallback p2) throws android.os.RemoteException {}
            public void updateMediaTapToTransferReceiverDisplay(int p0, android.media.MediaRoute2Info p1, android.graphics.drawable.Icon p2, java.lang.CharSequence p3) throws android.os.RemoteException {}
            public void registerNearbyMediaDevicesProvider(android.media.INearbyMediaDevicesProvider p0) throws android.os.RemoteException {}
            public void unregisterNearbyMediaDevicesProvider(android.media.INearbyMediaDevicesProvider p0) throws android.os.RemoteException {}
            public void showRearDisplayDialog(int p0) throws android.os.RemoteException {}
        }
    }
}
