package com.android.internal.statusbar;

public interface IStatusBar extends android.os.IInterface {
    public void setIcon(java.lang.String p0, com.android.internal.statusbar.StatusBarIcon p1) throws android.os.RemoteException;
    public void removeIcon(java.lang.String p0) throws android.os.RemoteException;
    public void disable(int p0, int p1, int p2) throws android.os.RemoteException;
    public void animateExpandNotificationsPanel() throws android.os.RemoteException;
    public void animateExpandSettingsPanel(java.lang.String p0) throws android.os.RemoteException;
    public void animateCollapsePanels() throws android.os.RemoteException;
    public void togglePanel() throws android.os.RemoteException;
    public void showWirelessChargingAnimation(int p0) throws android.os.RemoteException;
    public void setSystemUiVisibility(int p0, int p1, int p2, int p3, int p4, android.graphics.Rect p5, android.graphics.Rect p6, boolean p7) throws android.os.RemoteException;
    public void topAppWindowChanged(int p0, boolean p1) throws android.os.RemoteException;
    public void setImeWindowStatus(int p0, android.os.IBinder p1, int p2, int p3, boolean p4) throws android.os.RemoteException;
    public void setWindowState(int p0, int p1, int p2) throws android.os.RemoteException;
    public void showRecentApps(boolean p0) throws android.os.RemoteException;
    public void hideRecentApps(boolean p0, boolean p1) throws android.os.RemoteException;
    public void toggleRecentApps() throws android.os.RemoteException;
    public void toggleSplitScreen() throws android.os.RemoteException;
    public void preloadRecentApps() throws android.os.RemoteException;
    public void cancelPreloadRecentApps() throws android.os.RemoteException;
    public void showScreenPinningRequest(int p0) throws android.os.RemoteException;
    public void dismissKeyboardShortcutsMenu() throws android.os.RemoteException;
    public void toggleKeyboardShortcutsMenu(int p0) throws android.os.RemoteException;
    public void appTransitionPending(int p0) throws android.os.RemoteException;
    public void appTransitionCancelled(int p0) throws android.os.RemoteException;
    public void appTransitionStarting(int p0, long p1, long p2) throws android.os.RemoteException;
    public void appTransitionFinished(int p0) throws android.os.RemoteException;
    public void showAssistDisclosure() throws android.os.RemoteException;
    public void startAssist(android.os.Bundle p0) throws android.os.RemoteException;
    public void onCameraLaunchGestureDetected(int p0) throws android.os.RemoteException;
    public void showPictureInPictureMenu() throws android.os.RemoteException;
    public void showGlobalActionsMenu() throws android.os.RemoteException;
    public void onProposedRotationChanged(int p0, boolean p1) throws android.os.RemoteException;
    public void setTopAppHidesStatusBar(boolean p0) throws android.os.RemoteException;
    public void addQsTile(android.content.ComponentName p0) throws android.os.RemoteException;
    public void remQsTile(android.content.ComponentName p0) throws android.os.RemoteException;
    public void clickQsTile(android.content.ComponentName p0) throws android.os.RemoteException;
    public void handleSystemKey(int p0) throws android.os.RemoteException;
    public void showPinningEnterExitToast(boolean p0) throws android.os.RemoteException;
    public void showPinningEscapeToast() throws android.os.RemoteException;
    public void showShutdownUi(boolean p0, java.lang.String p1) throws android.os.RemoteException;
    public void showBiometricDialog(android.os.Bundle p0, android.hardware.biometrics.IBiometricServiceReceiverInternal p1, int p2, boolean p3, int p4) throws android.os.RemoteException;
    public void onBiometricAuthenticated(boolean p0, java.lang.String p1) throws android.os.RemoteException;
    public void onBiometricHelp(java.lang.String p0) throws android.os.RemoteException;
    public void onBiometricError(java.lang.String p0) throws android.os.RemoteException;
    public void hideBiometricDialog() throws android.os.RemoteException;
    public void onDisplayReady(int p0) throws android.os.RemoteException;
    public void onRecentsAnimationStateChanged(boolean p0) throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements com.android.internal.statusbar.IStatusBar {
        private static final java.lang.String DESCRIPTOR = "com.android.internal.statusbar.IStatusBar";
        static final int TRANSACTION_setIcon = 1;
        static final int TRANSACTION_removeIcon = 2;
        static final int TRANSACTION_disable = 3;
        static final int TRANSACTION_animateExpandNotificationsPanel = 4;
        static final int TRANSACTION_animateExpandSettingsPanel = 5;
        static final int TRANSACTION_animateCollapsePanels = 6;
        static final int TRANSACTION_togglePanel = 7;
        static final int TRANSACTION_showWirelessChargingAnimation = 8;
        static final int TRANSACTION_setSystemUiVisibility = 9;
        static final int TRANSACTION_topAppWindowChanged = 10;
        static final int TRANSACTION_setImeWindowStatus = 11;
        static final int TRANSACTION_setWindowState = 12;
        static final int TRANSACTION_showRecentApps = 13;
        static final int TRANSACTION_hideRecentApps = 14;
        static final int TRANSACTION_toggleRecentApps = 15;
        static final int TRANSACTION_toggleSplitScreen = 16;
        static final int TRANSACTION_preloadRecentApps = 17;
        static final int TRANSACTION_cancelPreloadRecentApps = 18;
        static final int TRANSACTION_showScreenPinningRequest = 19;
        static final int TRANSACTION_dismissKeyboardShortcutsMenu = 20;
        static final int TRANSACTION_toggleKeyboardShortcutsMenu = 21;
        static final int TRANSACTION_appTransitionPending = 22;
        static final int TRANSACTION_appTransitionCancelled = 23;
        static final int TRANSACTION_appTransitionStarting = 24;
        static final int TRANSACTION_appTransitionFinished = 25;
        static final int TRANSACTION_showAssistDisclosure = 26;
        static final int TRANSACTION_startAssist = 27;
        static final int TRANSACTION_onCameraLaunchGestureDetected = 28;
        static final int TRANSACTION_showPictureInPictureMenu = 29;
        static final int TRANSACTION_showGlobalActionsMenu = 30;
        static final int TRANSACTION_onProposedRotationChanged = 31;
        static final int TRANSACTION_setTopAppHidesStatusBar = 32;
        static final int TRANSACTION_addQsTile = 33;
        static final int TRANSACTION_remQsTile = 34;
        static final int TRANSACTION_clickQsTile = 35;
        static final int TRANSACTION_handleSystemKey = 36;
        static final int TRANSACTION_showPinningEnterExitToast = 37;
        static final int TRANSACTION_showPinningEscapeToast = 38;
        static final int TRANSACTION_showShutdownUi = 39;
        static final int TRANSACTION_showBiometricDialog = 40;
        static final int TRANSACTION_onBiometricAuthenticated = 41;
        static final int TRANSACTION_onBiometricHelp = 42;
        static final int TRANSACTION_onBiometricError = 43;
        static final int TRANSACTION_hideBiometricDialog = 44;
        static final int TRANSACTION_onDisplayReady = 45;
        static final int TRANSACTION_onRecentsAnimationStateChanged = 46;
        public Stub() { super(); }
        public static com.android.internal.statusbar.IStatusBar asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(com.android.internal.statusbar.IStatusBar p0) { return false; }
        public static com.android.internal.statusbar.IStatusBar getDefaultImpl() { return null; }

        private static class Proxy implements com.android.internal.statusbar.IStatusBar {
            private android.os.IBinder mRemote;
            public static com.android.internal.statusbar.IStatusBar sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void setIcon(java.lang.String p0, com.android.internal.statusbar.StatusBarIcon p1) throws android.os.RemoteException {}
            public void removeIcon(java.lang.String p0) throws android.os.RemoteException {}
            public void disable(int p0, int p1, int p2) throws android.os.RemoteException {}
            public void animateExpandNotificationsPanel() throws android.os.RemoteException {}
            public void animateExpandSettingsPanel(java.lang.String p0) throws android.os.RemoteException {}
            public void animateCollapsePanels() throws android.os.RemoteException {}
            public void togglePanel() throws android.os.RemoteException {}
            public void showWirelessChargingAnimation(int p0) throws android.os.RemoteException {}
            public void setSystemUiVisibility(int p0, int p1, int p2, int p3, int p4, android.graphics.Rect p5, android.graphics.Rect p6, boolean p7) throws android.os.RemoteException {}
            public void topAppWindowChanged(int p0, boolean p1) throws android.os.RemoteException {}
            public void setImeWindowStatus(int p0, android.os.IBinder p1, int p2, int p3, boolean p4) throws android.os.RemoteException {}
            public void setWindowState(int p0, int p1, int p2) throws android.os.RemoteException {}
            public void showRecentApps(boolean p0) throws android.os.RemoteException {}
            public void hideRecentApps(boolean p0, boolean p1) throws android.os.RemoteException {}
            public void toggleRecentApps() throws android.os.RemoteException {}
            public void toggleSplitScreen() throws android.os.RemoteException {}
            public void preloadRecentApps() throws android.os.RemoteException {}
            public void cancelPreloadRecentApps() throws android.os.RemoteException {}
            public void showScreenPinningRequest(int p0) throws android.os.RemoteException {}
            public void dismissKeyboardShortcutsMenu() throws android.os.RemoteException {}
            public void toggleKeyboardShortcutsMenu(int p0) throws android.os.RemoteException {}
            public void appTransitionPending(int p0) throws android.os.RemoteException {}
            public void appTransitionCancelled(int p0) throws android.os.RemoteException {}
            public void appTransitionStarting(int p0, long p1, long p2) throws android.os.RemoteException {}
            public void appTransitionFinished(int p0) throws android.os.RemoteException {}
            public void showAssistDisclosure() throws android.os.RemoteException {}
            public void startAssist(android.os.Bundle p0) throws android.os.RemoteException {}
            public void onCameraLaunchGestureDetected(int p0) throws android.os.RemoteException {}
            public void showPictureInPictureMenu() throws android.os.RemoteException {}
            public void showGlobalActionsMenu() throws android.os.RemoteException {}
            public void onProposedRotationChanged(int p0, boolean p1) throws android.os.RemoteException {}
            public void setTopAppHidesStatusBar(boolean p0) throws android.os.RemoteException {}
            public void addQsTile(android.content.ComponentName p0) throws android.os.RemoteException {}
            public void remQsTile(android.content.ComponentName p0) throws android.os.RemoteException {}
            public void clickQsTile(android.content.ComponentName p0) throws android.os.RemoteException {}
            public void handleSystemKey(int p0) throws android.os.RemoteException {}
            public void showPinningEnterExitToast(boolean p0) throws android.os.RemoteException {}
            public void showPinningEscapeToast() throws android.os.RemoteException {}
            public void showShutdownUi(boolean p0, java.lang.String p1) throws android.os.RemoteException {}
            public void showBiometricDialog(android.os.Bundle p0, android.hardware.biometrics.IBiometricServiceReceiverInternal p1, int p2, boolean p3, int p4) throws android.os.RemoteException {}
            public void onBiometricAuthenticated(boolean p0, java.lang.String p1) throws android.os.RemoteException {}
            public void onBiometricHelp(java.lang.String p0) throws android.os.RemoteException {}
            public void onBiometricError(java.lang.String p0) throws android.os.RemoteException {}
            public void hideBiometricDialog() throws android.os.RemoteException {}
            public void onDisplayReady(int p0) throws android.os.RemoteException {}
            public void onRecentsAnimationStateChanged(boolean p0) throws android.os.RemoteException {}
        }
    }

    public static class Default implements com.android.internal.statusbar.IStatusBar {
        public Default() {}
        public void setIcon(java.lang.String p0, com.android.internal.statusbar.StatusBarIcon p1) throws android.os.RemoteException {}
        public void removeIcon(java.lang.String p0) throws android.os.RemoteException {}
        public void disable(int p0, int p1, int p2) throws android.os.RemoteException {}
        public void animateExpandNotificationsPanel() throws android.os.RemoteException {}
        public void animateExpandSettingsPanel(java.lang.String p0) throws android.os.RemoteException {}
        public void animateCollapsePanels() throws android.os.RemoteException {}
        public void togglePanel() throws android.os.RemoteException {}
        public void showWirelessChargingAnimation(int p0) throws android.os.RemoteException {}
        public void setSystemUiVisibility(int p0, int p1, int p2, int p3, int p4, android.graphics.Rect p5, android.graphics.Rect p6, boolean p7) throws android.os.RemoteException {}
        public void topAppWindowChanged(int p0, boolean p1) throws android.os.RemoteException {}
        public void setImeWindowStatus(int p0, android.os.IBinder p1, int p2, int p3, boolean p4) throws android.os.RemoteException {}
        public void setWindowState(int p0, int p1, int p2) throws android.os.RemoteException {}
        public void showRecentApps(boolean p0) throws android.os.RemoteException {}
        public void hideRecentApps(boolean p0, boolean p1) throws android.os.RemoteException {}
        public void toggleRecentApps() throws android.os.RemoteException {}
        public void toggleSplitScreen() throws android.os.RemoteException {}
        public void preloadRecentApps() throws android.os.RemoteException {}
        public void cancelPreloadRecentApps() throws android.os.RemoteException {}
        public void showScreenPinningRequest(int p0) throws android.os.RemoteException {}
        public void dismissKeyboardShortcutsMenu() throws android.os.RemoteException {}
        public void toggleKeyboardShortcutsMenu(int p0) throws android.os.RemoteException {}
        public void appTransitionPending(int p0) throws android.os.RemoteException {}
        public void appTransitionCancelled(int p0) throws android.os.RemoteException {}
        public void appTransitionStarting(int p0, long p1, long p2) throws android.os.RemoteException {}
        public void appTransitionFinished(int p0) throws android.os.RemoteException {}
        public void showAssistDisclosure() throws android.os.RemoteException {}
        public void startAssist(android.os.Bundle p0) throws android.os.RemoteException {}
        public void onCameraLaunchGestureDetected(int p0) throws android.os.RemoteException {}
        public void showPictureInPictureMenu() throws android.os.RemoteException {}
        public void showGlobalActionsMenu() throws android.os.RemoteException {}
        public void onProposedRotationChanged(int p0, boolean p1) throws android.os.RemoteException {}
        public void setTopAppHidesStatusBar(boolean p0) throws android.os.RemoteException {}
        public void addQsTile(android.content.ComponentName p0) throws android.os.RemoteException {}
        public void remQsTile(android.content.ComponentName p0) throws android.os.RemoteException {}
        public void clickQsTile(android.content.ComponentName p0) throws android.os.RemoteException {}
        public void handleSystemKey(int p0) throws android.os.RemoteException {}
        public void showPinningEnterExitToast(boolean p0) throws android.os.RemoteException {}
        public void showPinningEscapeToast() throws android.os.RemoteException {}
        public void showShutdownUi(boolean p0, java.lang.String p1) throws android.os.RemoteException {}
        public void showBiometricDialog(android.os.Bundle p0, android.hardware.biometrics.IBiometricServiceReceiverInternal p1, int p2, boolean p3, int p4) throws android.os.RemoteException {}
        public void onBiometricAuthenticated(boolean p0, java.lang.String p1) throws android.os.RemoteException {}
        public void onBiometricHelp(java.lang.String p0) throws android.os.RemoteException {}
        public void onBiometricError(java.lang.String p0) throws android.os.RemoteException {}
        public void hideBiometricDialog() throws android.os.RemoteException {}
        public void onDisplayReady(int p0) throws android.os.RemoteException {}
        public void onRecentsAnimationStateChanged(boolean p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }
}
