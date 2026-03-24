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
    public void topAppWindowChanged(int p0, boolean p1, boolean p2) throws android.os.RemoteException;
    public void setImeWindowStatus(int p0, android.os.IBinder p1, int p2, int p3, boolean p4, boolean p5) throws android.os.RemoteException;
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
    public void showAuthenticationDialog(android.os.Bundle p0, android.hardware.biometrics.IBiometricServiceReceiverInternal p1, int p2, boolean p3, int p4, java.lang.String p5, long p6, int p7) throws android.os.RemoteException;
    public void onBiometricAuthenticated() throws android.os.RemoteException;
    public void onBiometricHelp(java.lang.String p0) throws android.os.RemoteException;
    public void onBiometricError(int p0, int p1, int p2) throws android.os.RemoteException;
    public void hideAuthenticationDialog() throws android.os.RemoteException;
    public void showInDisplayFingerprintView() throws android.os.RemoteException;
    public void hideInDisplayFingerprintView() throws android.os.RemoteException;
    public void onDisplayReady(int p0) throws android.os.RemoteException;
    public void onRecentsAnimationStateChanged(boolean p0) throws android.os.RemoteException;
    public void onSystemBarAppearanceChanged(int p0, int p1, com.android.internal.view.AppearanceRegion[] p2, boolean p3) throws android.os.RemoteException;
    public void showTransient(int p0, int[] p1) throws android.os.RemoteException;
    public void abortTransient(int p0, int[] p1) throws android.os.RemoteException;
    public void showInattentiveSleepWarning() throws android.os.RemoteException;
    public void dismissInattentiveSleepWarning(boolean p0) throws android.os.RemoteException;
    public void showToast(int p0, java.lang.String p1, android.os.IBinder p2, java.lang.CharSequence p3, android.os.IBinder p4, int p5, android.app.ITransientNotificationCallback p6) throws android.os.RemoteException;
    public void hideToast(java.lang.String p0, android.os.IBinder p1) throws android.os.RemoteException;
    public void startTracing() throws android.os.RemoteException;
    public void stopTracing() throws android.os.RemoteException;
    public void suppressAmbientDisplay(boolean p0) throws android.os.RemoteException;
    public void toggleCameraFlash() throws android.os.RemoteException;

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
        public void topAppWindowChanged(int p0, boolean p1, boolean p2) throws android.os.RemoteException {}
        public void setImeWindowStatus(int p0, android.os.IBinder p1, int p2, int p3, boolean p4, boolean p5) throws android.os.RemoteException {}
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
        public void showAuthenticationDialog(android.os.Bundle p0, android.hardware.biometrics.IBiometricServiceReceiverInternal p1, int p2, boolean p3, int p4, java.lang.String p5, long p6, int p7) throws android.os.RemoteException {}
        public void onBiometricAuthenticated() throws android.os.RemoteException {}
        public void onBiometricHelp(java.lang.String p0) throws android.os.RemoteException {}
        public void onBiometricError(int p0, int p1, int p2) throws android.os.RemoteException {}
        public void hideAuthenticationDialog() throws android.os.RemoteException {}
        public void showInDisplayFingerprintView() throws android.os.RemoteException {}
        public void hideInDisplayFingerprintView() throws android.os.RemoteException {}
        public void onDisplayReady(int p0) throws android.os.RemoteException {}
        public void onRecentsAnimationStateChanged(boolean p0) throws android.os.RemoteException {}
        public void onSystemBarAppearanceChanged(int p0, int p1, com.android.internal.view.AppearanceRegion[] p2, boolean p3) throws android.os.RemoteException {}
        public void showTransient(int p0, int[] p1) throws android.os.RemoteException {}
        public void abortTransient(int p0, int[] p1) throws android.os.RemoteException {}
        public void showInattentiveSleepWarning() throws android.os.RemoteException {}
        public void dismissInattentiveSleepWarning(boolean p0) throws android.os.RemoteException {}
        public void showToast(int p0, java.lang.String p1, android.os.IBinder p2, java.lang.CharSequence p3, android.os.IBinder p4, int p5, android.app.ITransientNotificationCallback p6) throws android.os.RemoteException {}
        public void hideToast(java.lang.String p0, android.os.IBinder p1) throws android.os.RemoteException {}
        public void startTracing() throws android.os.RemoteException {}
        public void stopTracing() throws android.os.RemoteException {}
        public void suppressAmbientDisplay(boolean p0) throws android.os.RemoteException {}
        public void toggleCameraFlash() throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

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
        static final int TRANSACTION_topAppWindowChanged = 9;
        static final int TRANSACTION_setImeWindowStatus = 10;
        static final int TRANSACTION_setWindowState = 11;
        static final int TRANSACTION_showRecentApps = 12;
        static final int TRANSACTION_hideRecentApps = 13;
        static final int TRANSACTION_toggleRecentApps = 14;
        static final int TRANSACTION_toggleSplitScreen = 15;
        static final int TRANSACTION_preloadRecentApps = 16;
        static final int TRANSACTION_cancelPreloadRecentApps = 17;
        static final int TRANSACTION_showScreenPinningRequest = 18;
        static final int TRANSACTION_dismissKeyboardShortcutsMenu = 19;
        static final int TRANSACTION_toggleKeyboardShortcutsMenu = 20;
        static final int TRANSACTION_appTransitionPending = 21;
        static final int TRANSACTION_appTransitionCancelled = 22;
        static final int TRANSACTION_appTransitionStarting = 23;
        static final int TRANSACTION_appTransitionFinished = 24;
        static final int TRANSACTION_showAssistDisclosure = 25;
        static final int TRANSACTION_startAssist = 26;
        static final int TRANSACTION_onCameraLaunchGestureDetected = 27;
        static final int TRANSACTION_showPictureInPictureMenu = 28;
        static final int TRANSACTION_showGlobalActionsMenu = 29;
        static final int TRANSACTION_onProposedRotationChanged = 30;
        static final int TRANSACTION_setTopAppHidesStatusBar = 31;
        static final int TRANSACTION_addQsTile = 32;
        static final int TRANSACTION_remQsTile = 33;
        static final int TRANSACTION_clickQsTile = 34;
        static final int TRANSACTION_handleSystemKey = 35;
        static final int TRANSACTION_showPinningEnterExitToast = 36;
        static final int TRANSACTION_showPinningEscapeToast = 37;
        static final int TRANSACTION_showShutdownUi = 38;
        static final int TRANSACTION_showAuthenticationDialog = 39;
        static final int TRANSACTION_onBiometricAuthenticated = 40;
        static final int TRANSACTION_onBiometricHelp = 41;
        static final int TRANSACTION_onBiometricError = 42;
        static final int TRANSACTION_hideAuthenticationDialog = 43;
        static final int TRANSACTION_showInDisplayFingerprintView = 44;
        static final int TRANSACTION_hideInDisplayFingerprintView = 45;
        static final int TRANSACTION_onDisplayReady = 46;
        static final int TRANSACTION_onRecentsAnimationStateChanged = 47;
        static final int TRANSACTION_onSystemBarAppearanceChanged = 48;
        static final int TRANSACTION_showTransient = 49;
        static final int TRANSACTION_abortTransient = 50;
        static final int TRANSACTION_showInattentiveSleepWarning = 51;
        static final int TRANSACTION_dismissInattentiveSleepWarning = 52;
        static final int TRANSACTION_showToast = 53;
        static final int TRANSACTION_hideToast = 54;
        static final int TRANSACTION_startTracing = 55;
        static final int TRANSACTION_stopTracing = 56;
        static final int TRANSACTION_suppressAmbientDisplay = 57;
        static final int TRANSACTION_toggleCameraFlash = 58;
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
            public void topAppWindowChanged(int p0, boolean p1, boolean p2) throws android.os.RemoteException {}
            public void setImeWindowStatus(int p0, android.os.IBinder p1, int p2, int p3, boolean p4, boolean p5) throws android.os.RemoteException {}
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
            public void showAuthenticationDialog(android.os.Bundle p0, android.hardware.biometrics.IBiometricServiceReceiverInternal p1, int p2, boolean p3, int p4, java.lang.String p5, long p6, int p7) throws android.os.RemoteException {}
            public void onBiometricAuthenticated() throws android.os.RemoteException {}
            public void onBiometricHelp(java.lang.String p0) throws android.os.RemoteException {}
            public void onBiometricError(int p0, int p1, int p2) throws android.os.RemoteException {}
            public void hideAuthenticationDialog() throws android.os.RemoteException {}
            public void showInDisplayFingerprintView() throws android.os.RemoteException {}
            public void hideInDisplayFingerprintView() throws android.os.RemoteException {}
            public void onDisplayReady(int p0) throws android.os.RemoteException {}
            public void onRecentsAnimationStateChanged(boolean p0) throws android.os.RemoteException {}
            public void onSystemBarAppearanceChanged(int p0, int p1, com.android.internal.view.AppearanceRegion[] p2, boolean p3) throws android.os.RemoteException {}
            public void showTransient(int p0, int[] p1) throws android.os.RemoteException {}
            public void abortTransient(int p0, int[] p1) throws android.os.RemoteException {}
            public void showInattentiveSleepWarning() throws android.os.RemoteException {}
            public void dismissInattentiveSleepWarning(boolean p0) throws android.os.RemoteException {}
            public void showToast(int p0, java.lang.String p1, android.os.IBinder p2, java.lang.CharSequence p3, android.os.IBinder p4, int p5, android.app.ITransientNotificationCallback p6) throws android.os.RemoteException {}
            public void hideToast(java.lang.String p0, android.os.IBinder p1) throws android.os.RemoteException {}
            public void startTracing() throws android.os.RemoteException {}
            public void stopTracing() throws android.os.RemoteException {}
            public void suppressAmbientDisplay(boolean p0) throws android.os.RemoteException {}
            public void toggleCameraFlash() throws android.os.RemoteException {}
        }
    }
}
