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
    public void onEmergencyActionLaunchGestureDetected() throws android.os.RemoteException;
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
    public void showAuthenticationDialog(android.hardware.biometrics.PromptInfo p0, android.hardware.biometrics.IBiometricSysuiReceiver p1, int[] p2, boolean p3, boolean p4, int p5, java.lang.String p6, long p7, int p8) throws android.os.RemoteException;
    public void onBiometricAuthenticated() throws android.os.RemoteException;
    public void onBiometricHelp(int p0, java.lang.String p1) throws android.os.RemoteException;
    public void onBiometricError(int p0, int p1, int p2) throws android.os.RemoteException;
    public void hideAuthenticationDialog() throws android.os.RemoteException;
    public void setUdfpsHbmListener(android.hardware.fingerprint.IUdfpsHbmListener p0) throws android.os.RemoteException;
    public void onDisplayReady(int p0) throws android.os.RemoteException;
    public void onRecentsAnimationStateChanged(boolean p0) throws android.os.RemoteException;
    public void onSystemBarAttributesChanged(int p0, int p1, com.android.internal.view.AppearanceRegion[] p2, boolean p3, int p4, boolean p5) throws android.os.RemoteException;
    public void showTransient(int p0, int[] p1) throws android.os.RemoteException;
    public void abortTransient(int p0, int[] p1) throws android.os.RemoteException;
    public void showInattentiveSleepWarning() throws android.os.RemoteException;
    public void dismissInattentiveSleepWarning(boolean p0) throws android.os.RemoteException;
    public void showToast(int p0, java.lang.String p1, android.os.IBinder p2, java.lang.CharSequence p3, android.os.IBinder p4, int p5, android.app.ITransientNotificationCallback p6) throws android.os.RemoteException;
    public void hideToast(java.lang.String p0, android.os.IBinder p1) throws android.os.RemoteException;
    public void startTracing() throws android.os.RemoteException;
    public void stopTracing() throws android.os.RemoteException;
    public void handleWindowManagerLoggingCommand(java.lang.String[] p0, android.os.ParcelFileDescriptor p1) throws android.os.RemoteException;
    public void suppressAmbientDisplay(boolean p0) throws android.os.RemoteException;
    public void requestWindowMagnificationConnection(boolean p0) throws android.os.RemoteException;
    public void passThroughShellCommand(java.lang.String[] p0, android.os.ParcelFileDescriptor p1) throws android.os.RemoteException;
    public void setNavigationBarLumaSamplingEnabled(int p0, boolean p1) throws android.os.RemoteException;
    public void runGcForTest() throws android.os.RemoteException;

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
        public void onEmergencyActionLaunchGestureDetected() throws android.os.RemoteException {}
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
        public void showAuthenticationDialog(android.hardware.biometrics.PromptInfo p0, android.hardware.biometrics.IBiometricSysuiReceiver p1, int[] p2, boolean p3, boolean p4, int p5, java.lang.String p6, long p7, int p8) throws android.os.RemoteException {}
        public void onBiometricAuthenticated() throws android.os.RemoteException {}
        public void onBiometricHelp(int p0, java.lang.String p1) throws android.os.RemoteException {}
        public void onBiometricError(int p0, int p1, int p2) throws android.os.RemoteException {}
        public void hideAuthenticationDialog() throws android.os.RemoteException {}
        public void setUdfpsHbmListener(android.hardware.fingerprint.IUdfpsHbmListener p0) throws android.os.RemoteException {}
        public void onDisplayReady(int p0) throws android.os.RemoteException {}
        public void onRecentsAnimationStateChanged(boolean p0) throws android.os.RemoteException {}
        public void onSystemBarAttributesChanged(int p0, int p1, com.android.internal.view.AppearanceRegion[] p2, boolean p3, int p4, boolean p5) throws android.os.RemoteException {}
        public void showTransient(int p0, int[] p1) throws android.os.RemoteException {}
        public void abortTransient(int p0, int[] p1) throws android.os.RemoteException {}
        public void showInattentiveSleepWarning() throws android.os.RemoteException {}
        public void dismissInattentiveSleepWarning(boolean p0) throws android.os.RemoteException {}
        public void showToast(int p0, java.lang.String p1, android.os.IBinder p2, java.lang.CharSequence p3, android.os.IBinder p4, int p5, android.app.ITransientNotificationCallback p6) throws android.os.RemoteException {}
        public void hideToast(java.lang.String p0, android.os.IBinder p1) throws android.os.RemoteException {}
        public void startTracing() throws android.os.RemoteException {}
        public void stopTracing() throws android.os.RemoteException {}
        public void handleWindowManagerLoggingCommand(java.lang.String[] p0, android.os.ParcelFileDescriptor p1) throws android.os.RemoteException {}
        public void suppressAmbientDisplay(boolean p0) throws android.os.RemoteException {}
        public void requestWindowMagnificationConnection(boolean p0) throws android.os.RemoteException {}
        public void passThroughShellCommand(java.lang.String[] p0, android.os.ParcelFileDescriptor p1) throws android.os.RemoteException {}
        public void setNavigationBarLumaSamplingEnabled(int p0, boolean p1) throws android.os.RemoteException {}
        public void runGcForTest() throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements com.android.internal.statusbar.IStatusBar {
        public static final java.lang.String DESCRIPTOR = "com.android.internal.statusbar.IStatusBar";
        static final int TRANSACTION_setIcon = 1;
        static final int TRANSACTION_removeIcon = 2;
        static final int TRANSACTION_disable = 3;
        static final int TRANSACTION_animateExpandNotificationsPanel = 4;
        static final int TRANSACTION_animateExpandSettingsPanel = 5;
        static final int TRANSACTION_animateCollapsePanels = 6;
        static final int TRANSACTION_togglePanel = 7;
        static final int TRANSACTION_showWirelessChargingAnimation = 8;
        static final int TRANSACTION_setImeWindowStatus = 9;
        static final int TRANSACTION_setWindowState = 10;
        static final int TRANSACTION_showRecentApps = 11;
        static final int TRANSACTION_hideRecentApps = 12;
        static final int TRANSACTION_toggleRecentApps = 13;
        static final int TRANSACTION_toggleSplitScreen = 14;
        static final int TRANSACTION_preloadRecentApps = 15;
        static final int TRANSACTION_cancelPreloadRecentApps = 16;
        static final int TRANSACTION_showScreenPinningRequest = 17;
        static final int TRANSACTION_dismissKeyboardShortcutsMenu = 18;
        static final int TRANSACTION_toggleKeyboardShortcutsMenu = 19;
        static final int TRANSACTION_appTransitionPending = 20;
        static final int TRANSACTION_appTransitionCancelled = 21;
        static final int TRANSACTION_appTransitionStarting = 22;
        static final int TRANSACTION_appTransitionFinished = 23;
        static final int TRANSACTION_showAssistDisclosure = 24;
        static final int TRANSACTION_startAssist = 25;
        static final int TRANSACTION_onCameraLaunchGestureDetected = 26;
        static final int TRANSACTION_onEmergencyActionLaunchGestureDetected = 27;
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
        static final int TRANSACTION_setUdfpsHbmListener = 44;
        static final int TRANSACTION_onDisplayReady = 45;
        static final int TRANSACTION_onRecentsAnimationStateChanged = 46;
        static final int TRANSACTION_onSystemBarAttributesChanged = 47;
        static final int TRANSACTION_showTransient = 48;
        static final int TRANSACTION_abortTransient = 49;
        static final int TRANSACTION_showInattentiveSleepWarning = 50;
        static final int TRANSACTION_dismissInattentiveSleepWarning = 51;
        static final int TRANSACTION_showToast = 52;
        static final int TRANSACTION_hideToast = 53;
        static final int TRANSACTION_startTracing = 54;
        static final int TRANSACTION_stopTracing = 55;
        static final int TRANSACTION_handleWindowManagerLoggingCommand = 56;
        static final int TRANSACTION_suppressAmbientDisplay = 57;
        static final int TRANSACTION_requestWindowMagnificationConnection = 58;
        static final int TRANSACTION_passThroughShellCommand = 59;
        static final int TRANSACTION_setNavigationBarLumaSamplingEnabled = 60;
        static final int TRANSACTION_runGcForTest = 61;
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
            public void onEmergencyActionLaunchGestureDetected() throws android.os.RemoteException {}
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
            public void showAuthenticationDialog(android.hardware.biometrics.PromptInfo p0, android.hardware.biometrics.IBiometricSysuiReceiver p1, int[] p2, boolean p3, boolean p4, int p5, java.lang.String p6, long p7, int p8) throws android.os.RemoteException {}
            public void onBiometricAuthenticated() throws android.os.RemoteException {}
            public void onBiometricHelp(int p0, java.lang.String p1) throws android.os.RemoteException {}
            public void onBiometricError(int p0, int p1, int p2) throws android.os.RemoteException {}
            public void hideAuthenticationDialog() throws android.os.RemoteException {}
            public void setUdfpsHbmListener(android.hardware.fingerprint.IUdfpsHbmListener p0) throws android.os.RemoteException {}
            public void onDisplayReady(int p0) throws android.os.RemoteException {}
            public void onRecentsAnimationStateChanged(boolean p0) throws android.os.RemoteException {}
            public void onSystemBarAttributesChanged(int p0, int p1, com.android.internal.view.AppearanceRegion[] p2, boolean p3, int p4, boolean p5) throws android.os.RemoteException {}
            public void showTransient(int p0, int[] p1) throws android.os.RemoteException {}
            public void abortTransient(int p0, int[] p1) throws android.os.RemoteException {}
            public void showInattentiveSleepWarning() throws android.os.RemoteException {}
            public void dismissInattentiveSleepWarning(boolean p0) throws android.os.RemoteException {}
            public void showToast(int p0, java.lang.String p1, android.os.IBinder p2, java.lang.CharSequence p3, android.os.IBinder p4, int p5, android.app.ITransientNotificationCallback p6) throws android.os.RemoteException {}
            public void hideToast(java.lang.String p0, android.os.IBinder p1) throws android.os.RemoteException {}
            public void startTracing() throws android.os.RemoteException {}
            public void stopTracing() throws android.os.RemoteException {}
            public void handleWindowManagerLoggingCommand(java.lang.String[] p0, android.os.ParcelFileDescriptor p1) throws android.os.RemoteException {}
            public void suppressAmbientDisplay(boolean p0) throws android.os.RemoteException {}
            public void requestWindowMagnificationConnection(boolean p0) throws android.os.RemoteException {}
            public void passThroughShellCommand(java.lang.String[] p0, android.os.ParcelFileDescriptor p1) throws android.os.RemoteException {}
            public void setNavigationBarLumaSamplingEnabled(int p0, boolean p1) throws android.os.RemoteException {}
            public void runGcForTest() throws android.os.RemoteException {}
        }
    }
}
