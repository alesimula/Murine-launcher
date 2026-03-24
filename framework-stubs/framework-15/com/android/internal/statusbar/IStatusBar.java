package com.android.internal.statusbar;

public interface IStatusBar extends android.os.IInterface {
    public void setIcon(java.lang.String p0, com.android.internal.statusbar.StatusBarIcon p1) throws android.os.RemoteException;
    public void removeIcon(java.lang.String p0) throws android.os.RemoteException;
    public void disable(int p0, int p1, int p2) throws android.os.RemoteException;
    public void animateExpandNotificationsPanel() throws android.os.RemoteException;
    public void animateExpandSettingsPanel(java.lang.String p0) throws android.os.RemoteException;
    public void animateCollapsePanels() throws android.os.RemoteException;
    public void toggleNotificationsPanel() throws android.os.RemoteException;
    public void showWirelessChargingAnimation(int p0) throws android.os.RemoteException;
    public void setImeWindowStatus(int p0, android.os.IBinder p1, int p2, int p3, boolean p4) throws android.os.RemoteException;
    public void setWindowState(int p0, int p1, int p2) throws android.os.RemoteException;
    public void showRecentApps(boolean p0) throws android.os.RemoteException;
    public void hideRecentApps(boolean p0, boolean p1) throws android.os.RemoteException;
    public void toggleRecentApps() throws android.os.RemoteException;
    public void toggleTaskbar() throws android.os.RemoteException;
    public void toggleSplitScreen() throws android.os.RemoteException;
    public void preloadRecentApps() throws android.os.RemoteException;
    public void cancelPreloadRecentApps() throws android.os.RemoteException;
    public void showScreenPinningRequest(int p0) throws android.os.RemoteException;
    public void confirmImmersivePrompt() throws android.os.RemoteException;
    public void immersiveModeChanged(int p0, boolean p1) throws android.os.RemoteException;
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
    public void addQsTileToFrontOrEnd(android.content.ComponentName p0, boolean p1) throws android.os.RemoteException;
    public void remQsTile(android.content.ComponentName p0) throws android.os.RemoteException;
    public void setQsTiles(java.lang.String[] p0) throws android.os.RemoteException;
    public void clickQsTile(android.content.ComponentName p0) throws android.os.RemoteException;
    public void handleSystemKey(android.view.KeyEvent p0) throws android.os.RemoteException;
    public void showPinningEnterExitToast(boolean p0) throws android.os.RemoteException;
    public void showPinningEscapeToast() throws android.os.RemoteException;
    public void showShutdownUi(boolean p0, java.lang.String p1) throws android.os.RemoteException;
    public void showAuthenticationDialog(android.hardware.biometrics.PromptInfo p0, android.hardware.biometrics.IBiometricSysuiReceiver p1, int[] p2, boolean p3, boolean p4, int p5, long p6, java.lang.String p7, long p8) throws android.os.RemoteException;
    public void onBiometricAuthenticated(int p0) throws android.os.RemoteException;
    public void onBiometricHelp(int p0, java.lang.String p1) throws android.os.RemoteException;
    public void onBiometricError(int p0, int p1, int p2) throws android.os.RemoteException;
    public void hideAuthenticationDialog(long p0) throws android.os.RemoteException;
    public void setBiometicContextListener(android.hardware.biometrics.IBiometricContextListener p0) throws android.os.RemoteException;
    public void setUdfpsRefreshRateCallback(android.hardware.fingerprint.IUdfpsRefreshRateRequestCallback p0) throws android.os.RemoteException;
    public void onDisplayReady(int p0) throws android.os.RemoteException;
    public void onRecentsAnimationStateChanged(boolean p0) throws android.os.RemoteException;
    public void onSystemBarAttributesChanged(int p0, int p1, com.android.internal.view.AppearanceRegion[] p2, boolean p3, int p4, int p5, java.lang.String p6, com.android.internal.statusbar.LetterboxDetails[] p7) throws android.os.RemoteException;
    public void showTransient(int p0, int p1, boolean p2) throws android.os.RemoteException;
    public void abortTransient(int p0, int p1) throws android.os.RemoteException;
    public void showInattentiveSleepWarning() throws android.os.RemoteException;
    public void dismissInattentiveSleepWarning(boolean p0) throws android.os.RemoteException;
    public void showToast(int p0, java.lang.String p1, android.os.IBinder p2, java.lang.CharSequence p3, android.os.IBinder p4, int p5, android.app.ITransientNotificationCallback p6, int p7) throws android.os.RemoteException;
    public void hideToast(java.lang.String p0, android.os.IBinder p1) throws android.os.RemoteException;
    public void startTracing() throws android.os.RemoteException;
    public void stopTracing() throws android.os.RemoteException;
    public void suppressAmbientDisplay(boolean p0) throws android.os.RemoteException;
    public void requestMagnificationConnection(boolean p0) throws android.os.RemoteException;
    public void passThroughShellCommand(java.lang.String[] p0, android.os.ParcelFileDescriptor p1) throws android.os.RemoteException;
    public void setNavigationBarLumaSamplingEnabled(int p0, boolean p1) throws android.os.RemoteException;
    public void runGcForTest() throws android.os.RemoteException;
    public void requestTileServiceListeningState(android.content.ComponentName p0) throws android.os.RemoteException;
    public void requestAddTile(int p0, android.content.ComponentName p1, java.lang.CharSequence p2, java.lang.CharSequence p3, android.graphics.drawable.Icon p4, com.android.internal.statusbar.IAddTileResultCallback p5) throws android.os.RemoteException;
    public void cancelRequestAddTile(java.lang.String p0) throws android.os.RemoteException;
    public void updateMediaTapToTransferSenderDisplay(int p0, android.media.MediaRoute2Info p1, com.android.internal.statusbar.IUndoMediaTransferCallback p2) throws android.os.RemoteException;
    public void updateMediaTapToTransferReceiverDisplay(int p0, android.media.MediaRoute2Info p1, android.graphics.drawable.Icon p2, java.lang.CharSequence p3) throws android.os.RemoteException;
    public void registerNearbyMediaDevicesProvider(android.media.INearbyMediaDevicesProvider p0) throws android.os.RemoteException;
    public void unregisterNearbyMediaDevicesProvider(android.media.INearbyMediaDevicesProvider p0) throws android.os.RemoteException;
    public void dumpProto(java.lang.String[] p0, android.os.ParcelFileDescriptor p1) throws android.os.RemoteException;
    public void showRearDisplayDialog(int p0) throws android.os.RemoteException;
    public void moveFocusedTaskToFullscreen(int p0) throws android.os.RemoteException;
    public void moveFocusedTaskToStageSplit(int p0, boolean p1) throws android.os.RemoteException;
    public void setSplitscreenFocus(boolean p0) throws android.os.RemoteException;
    public void showMediaOutputSwitcher(java.lang.String p0, android.os.UserHandle p1) throws android.os.RemoteException;
    public void moveFocusedTaskToDesktop(int p0) throws android.os.RemoteException;

    public static class Default implements com.android.internal.statusbar.IStatusBar {
        public Default() {}
        public void setIcon(java.lang.String p0, com.android.internal.statusbar.StatusBarIcon p1) throws android.os.RemoteException {}
        public void removeIcon(java.lang.String p0) throws android.os.RemoteException {}
        public void disable(int p0, int p1, int p2) throws android.os.RemoteException {}
        public void animateExpandNotificationsPanel() throws android.os.RemoteException {}
        public void animateExpandSettingsPanel(java.lang.String p0) throws android.os.RemoteException {}
        public void animateCollapsePanels() throws android.os.RemoteException {}
        public void toggleNotificationsPanel() throws android.os.RemoteException {}
        public void showWirelessChargingAnimation(int p0) throws android.os.RemoteException {}
        public void setImeWindowStatus(int p0, android.os.IBinder p1, int p2, int p3, boolean p4) throws android.os.RemoteException {}
        public void setWindowState(int p0, int p1, int p2) throws android.os.RemoteException {}
        public void showRecentApps(boolean p0) throws android.os.RemoteException {}
        public void hideRecentApps(boolean p0, boolean p1) throws android.os.RemoteException {}
        public void toggleRecentApps() throws android.os.RemoteException {}
        public void toggleTaskbar() throws android.os.RemoteException {}
        public void toggleSplitScreen() throws android.os.RemoteException {}
        public void preloadRecentApps() throws android.os.RemoteException {}
        public void cancelPreloadRecentApps() throws android.os.RemoteException {}
        public void showScreenPinningRequest(int p0) throws android.os.RemoteException {}
        public void confirmImmersivePrompt() throws android.os.RemoteException {}
        public void immersiveModeChanged(int p0, boolean p1) throws android.os.RemoteException {}
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
        public void addQsTileToFrontOrEnd(android.content.ComponentName p0, boolean p1) throws android.os.RemoteException {}
        public void remQsTile(android.content.ComponentName p0) throws android.os.RemoteException {}
        public void setQsTiles(java.lang.String[] p0) throws android.os.RemoteException {}
        public void clickQsTile(android.content.ComponentName p0) throws android.os.RemoteException {}
        public void handleSystemKey(android.view.KeyEvent p0) throws android.os.RemoteException {}
        public void showPinningEnterExitToast(boolean p0) throws android.os.RemoteException {}
        public void showPinningEscapeToast() throws android.os.RemoteException {}
        public void showShutdownUi(boolean p0, java.lang.String p1) throws android.os.RemoteException {}
        public void showAuthenticationDialog(android.hardware.biometrics.PromptInfo p0, android.hardware.biometrics.IBiometricSysuiReceiver p1, int[] p2, boolean p3, boolean p4, int p5, long p6, java.lang.String p7, long p8) throws android.os.RemoteException {}
        public void onBiometricAuthenticated(int p0) throws android.os.RemoteException {}
        public void onBiometricHelp(int p0, java.lang.String p1) throws android.os.RemoteException {}
        public void onBiometricError(int p0, int p1, int p2) throws android.os.RemoteException {}
        public void hideAuthenticationDialog(long p0) throws android.os.RemoteException {}
        public void setBiometicContextListener(android.hardware.biometrics.IBiometricContextListener p0) throws android.os.RemoteException {}
        public void setUdfpsRefreshRateCallback(android.hardware.fingerprint.IUdfpsRefreshRateRequestCallback p0) throws android.os.RemoteException {}
        public void onDisplayReady(int p0) throws android.os.RemoteException {}
        public void onRecentsAnimationStateChanged(boolean p0) throws android.os.RemoteException {}
        public void onSystemBarAttributesChanged(int p0, int p1, com.android.internal.view.AppearanceRegion[] p2, boolean p3, int p4, int p5, java.lang.String p6, com.android.internal.statusbar.LetterboxDetails[] p7) throws android.os.RemoteException {}
        public void showTransient(int p0, int p1, boolean p2) throws android.os.RemoteException {}
        public void abortTransient(int p0, int p1) throws android.os.RemoteException {}
        public void showInattentiveSleepWarning() throws android.os.RemoteException {}
        public void dismissInattentiveSleepWarning(boolean p0) throws android.os.RemoteException {}
        public void showToast(int p0, java.lang.String p1, android.os.IBinder p2, java.lang.CharSequence p3, android.os.IBinder p4, int p5, android.app.ITransientNotificationCallback p6, int p7) throws android.os.RemoteException {}
        public void hideToast(java.lang.String p0, android.os.IBinder p1) throws android.os.RemoteException {}
        public void startTracing() throws android.os.RemoteException {}
        public void stopTracing() throws android.os.RemoteException {}
        public void suppressAmbientDisplay(boolean p0) throws android.os.RemoteException {}
        public void requestMagnificationConnection(boolean p0) throws android.os.RemoteException {}
        public void passThroughShellCommand(java.lang.String[] p0, android.os.ParcelFileDescriptor p1) throws android.os.RemoteException {}
        public void setNavigationBarLumaSamplingEnabled(int p0, boolean p1) throws android.os.RemoteException {}
        public void runGcForTest() throws android.os.RemoteException {}
        public void requestTileServiceListeningState(android.content.ComponentName p0) throws android.os.RemoteException {}
        public void requestAddTile(int p0, android.content.ComponentName p1, java.lang.CharSequence p2, java.lang.CharSequence p3, android.graphics.drawable.Icon p4, com.android.internal.statusbar.IAddTileResultCallback p5) throws android.os.RemoteException {}
        public void cancelRequestAddTile(java.lang.String p0) throws android.os.RemoteException {}
        public void updateMediaTapToTransferSenderDisplay(int p0, android.media.MediaRoute2Info p1, com.android.internal.statusbar.IUndoMediaTransferCallback p2) throws android.os.RemoteException {}
        public void updateMediaTapToTransferReceiverDisplay(int p0, android.media.MediaRoute2Info p1, android.graphics.drawable.Icon p2, java.lang.CharSequence p3) throws android.os.RemoteException {}
        public void registerNearbyMediaDevicesProvider(android.media.INearbyMediaDevicesProvider p0) throws android.os.RemoteException {}
        public void unregisterNearbyMediaDevicesProvider(android.media.INearbyMediaDevicesProvider p0) throws android.os.RemoteException {}
        public void dumpProto(java.lang.String[] p0, android.os.ParcelFileDescriptor p1) throws android.os.RemoteException {}
        public void showRearDisplayDialog(int p0) throws android.os.RemoteException {}
        public void moveFocusedTaskToFullscreen(int p0) throws android.os.RemoteException {}
        public void moveFocusedTaskToStageSplit(int p0, boolean p1) throws android.os.RemoteException {}
        public void setSplitscreenFocus(boolean p0) throws android.os.RemoteException {}
        public void showMediaOutputSwitcher(java.lang.String p0, android.os.UserHandle p1) throws android.os.RemoteException {}
        public void moveFocusedTaskToDesktop(int p0) throws android.os.RemoteException {}
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
        static final int TRANSACTION_toggleNotificationsPanel = 7;
        static final int TRANSACTION_showWirelessChargingAnimation = 8;
        static final int TRANSACTION_setImeWindowStatus = 9;
        static final int TRANSACTION_setWindowState = 10;
        static final int TRANSACTION_showRecentApps = 11;
        static final int TRANSACTION_hideRecentApps = 12;
        static final int TRANSACTION_toggleRecentApps = 13;
        static final int TRANSACTION_toggleTaskbar = 14;
        static final int TRANSACTION_toggleSplitScreen = 15;
        static final int TRANSACTION_preloadRecentApps = 16;
        static final int TRANSACTION_cancelPreloadRecentApps = 17;
        static final int TRANSACTION_showScreenPinningRequest = 18;
        static final int TRANSACTION_confirmImmersivePrompt = 19;
        static final int TRANSACTION_immersiveModeChanged = 20;
        static final int TRANSACTION_dismissKeyboardShortcutsMenu = 21;
        static final int TRANSACTION_toggleKeyboardShortcutsMenu = 22;
        static final int TRANSACTION_appTransitionPending = 23;
        static final int TRANSACTION_appTransitionCancelled = 24;
        static final int TRANSACTION_appTransitionStarting = 25;
        static final int TRANSACTION_appTransitionFinished = 26;
        static final int TRANSACTION_showAssistDisclosure = 27;
        static final int TRANSACTION_startAssist = 28;
        static final int TRANSACTION_onCameraLaunchGestureDetected = 29;
        static final int TRANSACTION_onEmergencyActionLaunchGestureDetected = 30;
        static final int TRANSACTION_showPictureInPictureMenu = 31;
        static final int TRANSACTION_showGlobalActionsMenu = 32;
        static final int TRANSACTION_onProposedRotationChanged = 33;
        static final int TRANSACTION_setTopAppHidesStatusBar = 34;
        static final int TRANSACTION_addQsTile = 35;
        static final int TRANSACTION_addQsTileToFrontOrEnd = 36;
        static final int TRANSACTION_remQsTile = 37;
        static final int TRANSACTION_setQsTiles = 38;
        static final int TRANSACTION_clickQsTile = 39;
        static final int TRANSACTION_handleSystemKey = 40;
        static final int TRANSACTION_showPinningEnterExitToast = 41;
        static final int TRANSACTION_showPinningEscapeToast = 42;
        static final int TRANSACTION_showShutdownUi = 43;
        static final int TRANSACTION_showAuthenticationDialog = 44;
        static final int TRANSACTION_onBiometricAuthenticated = 45;
        static final int TRANSACTION_onBiometricHelp = 46;
        static final int TRANSACTION_onBiometricError = 47;
        static final int TRANSACTION_hideAuthenticationDialog = 48;
        static final int TRANSACTION_setBiometicContextListener = 49;
        static final int TRANSACTION_setUdfpsRefreshRateCallback = 50;
        static final int TRANSACTION_onDisplayReady = 51;
        static final int TRANSACTION_onRecentsAnimationStateChanged = 52;
        static final int TRANSACTION_onSystemBarAttributesChanged = 53;
        static final int TRANSACTION_showTransient = 54;
        static final int TRANSACTION_abortTransient = 55;
        static final int TRANSACTION_showInattentiveSleepWarning = 56;
        static final int TRANSACTION_dismissInattentiveSleepWarning = 57;
        static final int TRANSACTION_showToast = 58;
        static final int TRANSACTION_hideToast = 59;
        static final int TRANSACTION_startTracing = 60;
        static final int TRANSACTION_stopTracing = 61;
        static final int TRANSACTION_suppressAmbientDisplay = 62;
        static final int TRANSACTION_requestMagnificationConnection = 63;
        static final int TRANSACTION_passThroughShellCommand = 64;
        static final int TRANSACTION_setNavigationBarLumaSamplingEnabled = 65;
        static final int TRANSACTION_runGcForTest = 66;
        static final int TRANSACTION_requestTileServiceListeningState = 67;
        static final int TRANSACTION_requestAddTile = 68;
        static final int TRANSACTION_cancelRequestAddTile = 69;
        static final int TRANSACTION_updateMediaTapToTransferSenderDisplay = 70;
        static final int TRANSACTION_updateMediaTapToTransferReceiverDisplay = 71;
        static final int TRANSACTION_registerNearbyMediaDevicesProvider = 72;
        static final int TRANSACTION_unregisterNearbyMediaDevicesProvider = 73;
        static final int TRANSACTION_dumpProto = 74;
        static final int TRANSACTION_showRearDisplayDialog = 75;
        static final int TRANSACTION_moveFocusedTaskToFullscreen = 76;
        static final int TRANSACTION_moveFocusedTaskToStageSplit = 77;
        static final int TRANSACTION_setSplitscreenFocus = 78;
        static final int TRANSACTION_showMediaOutputSwitcher = 79;
        static final int TRANSACTION_moveFocusedTaskToDesktop = 80;
        public Stub() { super(); }
        public static com.android.internal.statusbar.IStatusBar asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements com.android.internal.statusbar.IStatusBar {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void setIcon(java.lang.String p0, com.android.internal.statusbar.StatusBarIcon p1) throws android.os.RemoteException {}
            public void removeIcon(java.lang.String p0) throws android.os.RemoteException {}
            public void disable(int p0, int p1, int p2) throws android.os.RemoteException {}
            public void animateExpandNotificationsPanel() throws android.os.RemoteException {}
            public void animateExpandSettingsPanel(java.lang.String p0) throws android.os.RemoteException {}
            public void animateCollapsePanels() throws android.os.RemoteException {}
            public void toggleNotificationsPanel() throws android.os.RemoteException {}
            public void showWirelessChargingAnimation(int p0) throws android.os.RemoteException {}
            public void setImeWindowStatus(int p0, android.os.IBinder p1, int p2, int p3, boolean p4) throws android.os.RemoteException {}
            public void setWindowState(int p0, int p1, int p2) throws android.os.RemoteException {}
            public void showRecentApps(boolean p0) throws android.os.RemoteException {}
            public void hideRecentApps(boolean p0, boolean p1) throws android.os.RemoteException {}
            public void toggleRecentApps() throws android.os.RemoteException {}
            public void toggleTaskbar() throws android.os.RemoteException {}
            public void toggleSplitScreen() throws android.os.RemoteException {}
            public void preloadRecentApps() throws android.os.RemoteException {}
            public void cancelPreloadRecentApps() throws android.os.RemoteException {}
            public void showScreenPinningRequest(int p0) throws android.os.RemoteException {}
            public void confirmImmersivePrompt() throws android.os.RemoteException {}
            public void immersiveModeChanged(int p0, boolean p1) throws android.os.RemoteException {}
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
            public void addQsTileToFrontOrEnd(android.content.ComponentName p0, boolean p1) throws android.os.RemoteException {}
            public void remQsTile(android.content.ComponentName p0) throws android.os.RemoteException {}
            public void setQsTiles(java.lang.String[] p0) throws android.os.RemoteException {}
            public void clickQsTile(android.content.ComponentName p0) throws android.os.RemoteException {}
            public void handleSystemKey(android.view.KeyEvent p0) throws android.os.RemoteException {}
            public void showPinningEnterExitToast(boolean p0) throws android.os.RemoteException {}
            public void showPinningEscapeToast() throws android.os.RemoteException {}
            public void showShutdownUi(boolean p0, java.lang.String p1) throws android.os.RemoteException {}
            public void showAuthenticationDialog(android.hardware.biometrics.PromptInfo p0, android.hardware.biometrics.IBiometricSysuiReceiver p1, int[] p2, boolean p3, boolean p4, int p5, long p6, java.lang.String p7, long p8) throws android.os.RemoteException {}
            public void onBiometricAuthenticated(int p0) throws android.os.RemoteException {}
            public void onBiometricHelp(int p0, java.lang.String p1) throws android.os.RemoteException {}
            public void onBiometricError(int p0, int p1, int p2) throws android.os.RemoteException {}
            public void hideAuthenticationDialog(long p0) throws android.os.RemoteException {}
            public void setBiometicContextListener(android.hardware.biometrics.IBiometricContextListener p0) throws android.os.RemoteException {}
            public void setUdfpsRefreshRateCallback(android.hardware.fingerprint.IUdfpsRefreshRateRequestCallback p0) throws android.os.RemoteException {}
            public void onDisplayReady(int p0) throws android.os.RemoteException {}
            public void onRecentsAnimationStateChanged(boolean p0) throws android.os.RemoteException {}
            public void onSystemBarAttributesChanged(int p0, int p1, com.android.internal.view.AppearanceRegion[] p2, boolean p3, int p4, int p5, java.lang.String p6, com.android.internal.statusbar.LetterboxDetails[] p7) throws android.os.RemoteException {}
            public void showTransient(int p0, int p1, boolean p2) throws android.os.RemoteException {}
            public void abortTransient(int p0, int p1) throws android.os.RemoteException {}
            public void showInattentiveSleepWarning() throws android.os.RemoteException {}
            public void dismissInattentiveSleepWarning(boolean p0) throws android.os.RemoteException {}
            public void showToast(int p0, java.lang.String p1, android.os.IBinder p2, java.lang.CharSequence p3, android.os.IBinder p4, int p5, android.app.ITransientNotificationCallback p6, int p7) throws android.os.RemoteException {}
            public void hideToast(java.lang.String p0, android.os.IBinder p1) throws android.os.RemoteException {}
            public void startTracing() throws android.os.RemoteException {}
            public void stopTracing() throws android.os.RemoteException {}
            public void suppressAmbientDisplay(boolean p0) throws android.os.RemoteException {}
            public void requestMagnificationConnection(boolean p0) throws android.os.RemoteException {}
            public void passThroughShellCommand(java.lang.String[] p0, android.os.ParcelFileDescriptor p1) throws android.os.RemoteException {}
            public void setNavigationBarLumaSamplingEnabled(int p0, boolean p1) throws android.os.RemoteException {}
            public void runGcForTest() throws android.os.RemoteException {}
            public void requestTileServiceListeningState(android.content.ComponentName p0) throws android.os.RemoteException {}
            public void requestAddTile(int p0, android.content.ComponentName p1, java.lang.CharSequence p2, java.lang.CharSequence p3, android.graphics.drawable.Icon p4, com.android.internal.statusbar.IAddTileResultCallback p5) throws android.os.RemoteException {}
            public void cancelRequestAddTile(java.lang.String p0) throws android.os.RemoteException {}
            public void updateMediaTapToTransferSenderDisplay(int p0, android.media.MediaRoute2Info p1, com.android.internal.statusbar.IUndoMediaTransferCallback p2) throws android.os.RemoteException {}
            public void updateMediaTapToTransferReceiverDisplay(int p0, android.media.MediaRoute2Info p1, android.graphics.drawable.Icon p2, java.lang.CharSequence p3) throws android.os.RemoteException {}
            public void registerNearbyMediaDevicesProvider(android.media.INearbyMediaDevicesProvider p0) throws android.os.RemoteException {}
            public void unregisterNearbyMediaDevicesProvider(android.media.INearbyMediaDevicesProvider p0) throws android.os.RemoteException {}
            public void dumpProto(java.lang.String[] p0, android.os.ParcelFileDescriptor p1) throws android.os.RemoteException {}
            public void showRearDisplayDialog(int p0) throws android.os.RemoteException {}
            public void moveFocusedTaskToFullscreen(int p0) throws android.os.RemoteException {}
            public void moveFocusedTaskToStageSplit(int p0, boolean p1) throws android.os.RemoteException {}
            public void setSplitscreenFocus(boolean p0) throws android.os.RemoteException {}
            public void showMediaOutputSwitcher(java.lang.String p0, android.os.UserHandle p1) throws android.os.RemoteException {}
            public void moveFocusedTaskToDesktop(int p0) throws android.os.RemoteException {}
        }
    }
}
