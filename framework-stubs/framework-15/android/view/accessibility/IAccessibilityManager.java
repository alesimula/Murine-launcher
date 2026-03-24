package android.view.accessibility;

public interface IAccessibilityManager extends android.os.IInterface {
    @android.annotation.RequiresNoPermission
    public void interrupt(int p0) throws android.os.RemoteException;
    @android.annotation.RequiresNoPermission
    public void sendAccessibilityEvent(android.view.accessibility.AccessibilityEvent p0, int p1) throws android.os.RemoteException;
    @android.annotation.RequiresNoPermission
    public long addClient(android.view.accessibility.IAccessibilityManagerClient p0, int p1) throws android.os.RemoteException;
    @android.annotation.RequiresNoPermission
    public boolean removeClient(android.view.accessibility.IAccessibilityManagerClient p0, int p1) throws android.os.RemoteException;
    @android.annotation.RequiresNoPermission
    public android.content.pm.ParceledListSlice<android.accessibilityservice.AccessibilityServiceInfo> getInstalledAccessibilityServiceList(int p0) throws android.os.RemoteException;
    @android.annotation.RequiresNoPermission
    public java.util.List<android.accessibilityservice.AccessibilityServiceInfo> getEnabledAccessibilityServiceList(int p0, int p1) throws android.os.RemoteException;
    @android.annotation.RequiresNoPermission
    public int addAccessibilityInteractionConnection(android.view.IWindow p0, android.os.IBinder p1, android.view.accessibility.IAccessibilityInteractionConnection p2, java.lang.String p3, int p4) throws android.os.RemoteException;
    @android.annotation.RequiresNoPermission
    public void removeAccessibilityInteractionConnection(android.view.IWindow p0) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.MODIFY_ACCESSIBILITY_DATA")
    public void setPictureInPictureActionReplacingConnection(android.view.accessibility.IAccessibilityInteractionConnection p0) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.RETRIEVE_WINDOW_CONTENT")
    public void registerUiTestAutomationService(android.os.IBinder p0, android.accessibilityservice.IAccessibilityServiceClient p1, android.accessibilityservice.AccessibilityServiceInfo p2, int p3, int p4) throws android.os.RemoteException;
    @android.annotation.RequiresNoPermission
    public void unregisterUiTestAutomationService(android.accessibilityservice.IAccessibilityServiceClient p0) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.RETRIEVE_WINDOW_CONTENT")
    public android.os.IBinder getWindowToken(int p0, int p1) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.STATUS_BAR_SERVICE")
    public void notifyAccessibilityButtonClicked(int p0, java.lang.String p1) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.STATUS_BAR_SERVICE")
    public void notifyAccessibilityButtonVisibilityChanged(boolean p0) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.MANAGE_ACCESSIBILITY")
    public void performAccessibilityShortcut(java.lang.String p0) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.MANAGE_ACCESSIBILITY")
    public java.util.List<java.lang.String> getAccessibilityShortcutTargets(int p0) throws android.os.RemoteException;
    @android.annotation.RequiresNoPermission
    public boolean sendFingerprintGesture(int p0) throws android.os.RemoteException;
    @android.annotation.RequiresNoPermission
    public int getAccessibilityWindowId(android.os.IBinder p0) throws android.os.RemoteException;
    @android.annotation.RequiresNoPermission
    public long getRecommendedTimeoutMillis() throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.MANAGE_ACCESSIBILITY")
    public void registerSystemAction(android.app.RemoteAction p0, int p1) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.MANAGE_ACCESSIBILITY")
    public void unregisterSystemAction(int p0) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.STATUS_BAR_SERVICE")
    public void setMagnificationConnection(android.view.accessibility.IMagnificationConnection p0) throws android.os.RemoteException;
    @android.annotation.RequiresNoPermission
    public void associateEmbeddedHierarchy(android.os.IBinder p0, android.os.IBinder p1) throws android.os.RemoteException;
    @android.annotation.RequiresNoPermission
    public void disassociateEmbeddedHierarchy(android.os.IBinder p0) throws android.os.RemoteException;
    @android.annotation.RequiresNoPermission
    public int getFocusStrokeWidth() throws android.os.RemoteException;
    @android.annotation.RequiresNoPermission
    public int getFocusColor() throws android.os.RemoteException;
    @android.annotation.RequiresNoPermission
    public boolean isAudioDescriptionByDefaultEnabled() throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.SET_SYSTEM_AUDIO_CAPTION")
    public void setSystemAudioCaptioningEnabled(boolean p0, int p1) throws android.os.RemoteException;
    @android.annotation.RequiresNoPermission
    public boolean isSystemAudioCaptioningUiEnabled(int p0) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.SET_SYSTEM_AUDIO_CAPTION")
    public void setSystemAudioCaptioningUiEnabled(boolean p0, int p1) throws android.os.RemoteException;
    @android.annotation.RequiresNoPermission
    public void setAccessibilityWindowAttributes(int p0, int p1, int p2, android.view.accessibility.AccessibilityWindowAttributes p3) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.CREATE_VIRTUAL_DEVICE")
    public boolean registerProxyForDisplay(android.accessibilityservice.IAccessibilityServiceClient p0, int p1) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.CREATE_VIRTUAL_DEVICE")
    public boolean unregisterProxyForDisplay(int p0) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.INJECT_EVENTS")
    public void injectInputEventToInputFilter(android.view.InputEvent p0) throws android.os.RemoteException;
    @android.annotation.RequiresNoPermission
    public boolean startFlashNotificationSequence(java.lang.String p0, int p1, android.os.IBinder p2) throws android.os.RemoteException;
    @android.annotation.RequiresNoPermission
    public boolean stopFlashNotificationSequence(java.lang.String p0) throws android.os.RemoteException;
    @android.annotation.RequiresNoPermission
    public boolean startFlashNotificationEvent(java.lang.String p0, int p1, java.lang.String p2) throws android.os.RemoteException;
    @android.annotation.RequiresNoPermission
    public boolean isAccessibilityTargetAllowed(java.lang.String p0, int p1, int p2) throws android.os.RemoteException;
    @android.annotation.RequiresNoPermission
    public boolean sendRestrictedDialogIntent(java.lang.String p0, int p1, int p2) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.MANAGE_ACCESSIBILITY")
    public boolean isAccessibilityServiceWarningRequired(android.accessibilityservice.AccessibilityServiceInfo p0) throws android.os.RemoteException;
    @android.annotation.RequiresNoPermission
    public android.view.accessibility.IAccessibilityManager.WindowTransformationSpec getWindowTransformationSpec(int p0) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.INTERNAL_SYSTEM_WINDOW")
    public void attachAccessibilityOverlayToDisplay(int p0, android.view.SurfaceControl p1) throws android.os.RemoteException;
    @android.annotation.EnforcePermission(allOf={"android.permission.STATUS_BAR_SERVICE", "android.permission.MANAGE_ACCESSIBILITY"})
    public void notifyQuickSettingsTilesChanged(int p0, java.util.List<android.content.ComponentName> p1) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.MANAGE_ACCESSIBILITY")
    public void enableShortcutsForTargets(boolean p0, int p1, java.util.List<java.lang.String> p2, int p3) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.MANAGE_ACCESSIBILITY")
    public android.os.Bundle getA11yFeatureToTileMap(int p0) throws android.os.RemoteException;

    public static class Default implements android.view.accessibility.IAccessibilityManager {
        public Default() {}
        public void interrupt(int p0) throws android.os.RemoteException {}
        public void sendAccessibilityEvent(android.view.accessibility.AccessibilityEvent p0, int p1) throws android.os.RemoteException {}
        public long addClient(android.view.accessibility.IAccessibilityManagerClient p0, int p1) throws android.os.RemoteException { return 0L; }
        public boolean removeClient(android.view.accessibility.IAccessibilityManagerClient p0, int p1) throws android.os.RemoteException { return false; }
        public android.content.pm.ParceledListSlice<android.accessibilityservice.AccessibilityServiceInfo> getInstalledAccessibilityServiceList(int p0) throws android.os.RemoteException { return null; }
        public java.util.List<android.accessibilityservice.AccessibilityServiceInfo> getEnabledAccessibilityServiceList(int p0, int p1) throws android.os.RemoteException { return null; }
        public int addAccessibilityInteractionConnection(android.view.IWindow p0, android.os.IBinder p1, android.view.accessibility.IAccessibilityInteractionConnection p2, java.lang.String p3, int p4) throws android.os.RemoteException { return 0; }
        public void removeAccessibilityInteractionConnection(android.view.IWindow p0) throws android.os.RemoteException {}
        public void setPictureInPictureActionReplacingConnection(android.view.accessibility.IAccessibilityInteractionConnection p0) throws android.os.RemoteException {}
        public void registerUiTestAutomationService(android.os.IBinder p0, android.accessibilityservice.IAccessibilityServiceClient p1, android.accessibilityservice.AccessibilityServiceInfo p2, int p3, int p4) throws android.os.RemoteException {}
        public void unregisterUiTestAutomationService(android.accessibilityservice.IAccessibilityServiceClient p0) throws android.os.RemoteException {}
        public android.os.IBinder getWindowToken(int p0, int p1) throws android.os.RemoteException { return null; }
        public void notifyAccessibilityButtonClicked(int p0, java.lang.String p1) throws android.os.RemoteException {}
        public void notifyAccessibilityButtonVisibilityChanged(boolean p0) throws android.os.RemoteException {}
        public void performAccessibilityShortcut(java.lang.String p0) throws android.os.RemoteException {}
        public java.util.List<java.lang.String> getAccessibilityShortcutTargets(int p0) throws android.os.RemoteException { return null; }
        public boolean sendFingerprintGesture(int p0) throws android.os.RemoteException { return false; }
        public int getAccessibilityWindowId(android.os.IBinder p0) throws android.os.RemoteException { return 0; }
        public long getRecommendedTimeoutMillis() throws android.os.RemoteException { return 0L; }
        public void registerSystemAction(android.app.RemoteAction p0, int p1) throws android.os.RemoteException {}
        public void unregisterSystemAction(int p0) throws android.os.RemoteException {}
        public void setMagnificationConnection(android.view.accessibility.IMagnificationConnection p0) throws android.os.RemoteException {}
        public void associateEmbeddedHierarchy(android.os.IBinder p0, android.os.IBinder p1) throws android.os.RemoteException {}
        public void disassociateEmbeddedHierarchy(android.os.IBinder p0) throws android.os.RemoteException {}
        public int getFocusStrokeWidth() throws android.os.RemoteException { return 0; }
        public int getFocusColor() throws android.os.RemoteException { return 0; }
        public boolean isAudioDescriptionByDefaultEnabled() throws android.os.RemoteException { return false; }
        public void setSystemAudioCaptioningEnabled(boolean p0, int p1) throws android.os.RemoteException {}
        public boolean isSystemAudioCaptioningUiEnabled(int p0) throws android.os.RemoteException { return false; }
        public void setSystemAudioCaptioningUiEnabled(boolean p0, int p1) throws android.os.RemoteException {}
        public void setAccessibilityWindowAttributes(int p0, int p1, int p2, android.view.accessibility.AccessibilityWindowAttributes p3) throws android.os.RemoteException {}
        public boolean registerProxyForDisplay(android.accessibilityservice.IAccessibilityServiceClient p0, int p1) throws android.os.RemoteException { return false; }
        public boolean unregisterProxyForDisplay(int p0) throws android.os.RemoteException { return false; }
        public void injectInputEventToInputFilter(android.view.InputEvent p0) throws android.os.RemoteException {}
        public boolean startFlashNotificationSequence(java.lang.String p0, int p1, android.os.IBinder p2) throws android.os.RemoteException { return false; }
        public boolean stopFlashNotificationSequence(java.lang.String p0) throws android.os.RemoteException { return false; }
        public boolean startFlashNotificationEvent(java.lang.String p0, int p1, java.lang.String p2) throws android.os.RemoteException { return false; }
        public boolean isAccessibilityTargetAllowed(java.lang.String p0, int p1, int p2) throws android.os.RemoteException { return false; }
        public boolean sendRestrictedDialogIntent(java.lang.String p0, int p1, int p2) throws android.os.RemoteException { return false; }
        public boolean isAccessibilityServiceWarningRequired(android.accessibilityservice.AccessibilityServiceInfo p0) throws android.os.RemoteException { return false; }
        public android.view.accessibility.IAccessibilityManager.WindowTransformationSpec getWindowTransformationSpec(int p0) throws android.os.RemoteException { return null; }
        public void attachAccessibilityOverlayToDisplay(int p0, android.view.SurfaceControl p1) throws android.os.RemoteException {}
        public void notifyQuickSettingsTilesChanged(int p0, java.util.List<android.content.ComponentName> p1) throws android.os.RemoteException {}
        public void enableShortcutsForTargets(boolean p0, int p1, java.util.List<java.lang.String> p2, int p3) throws android.os.RemoteException {}
        public android.os.Bundle getA11yFeatureToTileMap(int p0) throws android.os.RemoteException { return null; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.view.accessibility.IAccessibilityManager {
        public static final java.lang.String DESCRIPTOR = "android.view.accessibility.IAccessibilityManager";
        static final int TRANSACTION_interrupt = 1;
        static final int TRANSACTION_sendAccessibilityEvent = 2;
        static final int TRANSACTION_addClient = 3;
        static final int TRANSACTION_removeClient = 4;
        static final int TRANSACTION_getInstalledAccessibilityServiceList = 5;
        static final int TRANSACTION_getEnabledAccessibilityServiceList = 6;
        static final int TRANSACTION_addAccessibilityInteractionConnection = 7;
        static final int TRANSACTION_removeAccessibilityInteractionConnection = 8;
        static final int TRANSACTION_setPictureInPictureActionReplacingConnection = 9;
        static final int TRANSACTION_registerUiTestAutomationService = 10;
        static final int TRANSACTION_unregisterUiTestAutomationService = 11;
        static final int TRANSACTION_getWindowToken = 12;
        static final int TRANSACTION_notifyAccessibilityButtonClicked = 13;
        static final int TRANSACTION_notifyAccessibilityButtonVisibilityChanged = 14;
        static final int TRANSACTION_performAccessibilityShortcut = 15;
        static final int TRANSACTION_getAccessibilityShortcutTargets = 16;
        static final int TRANSACTION_sendFingerprintGesture = 17;
        static final int TRANSACTION_getAccessibilityWindowId = 18;
        static final int TRANSACTION_getRecommendedTimeoutMillis = 19;
        static final int TRANSACTION_registerSystemAction = 20;
        static final int TRANSACTION_unregisterSystemAction = 21;
        static final int TRANSACTION_setMagnificationConnection = 22;
        static final int TRANSACTION_associateEmbeddedHierarchy = 23;
        static final int TRANSACTION_disassociateEmbeddedHierarchy = 24;
        static final int TRANSACTION_getFocusStrokeWidth = 25;
        static final int TRANSACTION_getFocusColor = 26;
        static final int TRANSACTION_isAudioDescriptionByDefaultEnabled = 27;
        static final int TRANSACTION_setSystemAudioCaptioningEnabled = 28;
        static final int TRANSACTION_isSystemAudioCaptioningUiEnabled = 29;
        static final int TRANSACTION_setSystemAudioCaptioningUiEnabled = 30;
        static final int TRANSACTION_setAccessibilityWindowAttributes = 31;
        static final int TRANSACTION_registerProxyForDisplay = 32;
        static final int TRANSACTION_unregisterProxyForDisplay = 33;
        static final int TRANSACTION_injectInputEventToInputFilter = 34;
        static final int TRANSACTION_startFlashNotificationSequence = 35;
        static final int TRANSACTION_stopFlashNotificationSequence = 36;
        static final int TRANSACTION_startFlashNotificationEvent = 37;
        static final int TRANSACTION_isAccessibilityTargetAllowed = 38;
        static final int TRANSACTION_sendRestrictedDialogIntent = 39;
        static final int TRANSACTION_isAccessibilityServiceWarningRequired = 40;
        static final int TRANSACTION_getWindowTransformationSpec = 41;
        static final int TRANSACTION_attachAccessibilityOverlayToDisplay = 42;
        static final int TRANSACTION_notifyQuickSettingsTilesChanged = 43;
        static final java.lang.String[] PERMISSIONS_notifyQuickSettingsTilesChanged = null;
        static final int TRANSACTION_enableShortcutsForTargets = 44;
        static final int TRANSACTION_getA11yFeatureToTileMap = 45;
        public Stub(android.os.PermissionEnforcer p0) { super(); }
        @java.lang.Deprecated
        public Stub() { super(); }
        public static android.view.accessibility.IAccessibilityManager asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        protected void setPictureInPictureActionReplacingConnection_enforcePermission() throws java.lang.SecurityException {}
        protected void registerUiTestAutomationService_enforcePermission() throws java.lang.SecurityException {}
        protected void getWindowToken_enforcePermission() throws java.lang.SecurityException {}
        protected void notifyAccessibilityButtonClicked_enforcePermission() throws java.lang.SecurityException {}
        protected void notifyAccessibilityButtonVisibilityChanged_enforcePermission() throws java.lang.SecurityException {}
        protected void performAccessibilityShortcut_enforcePermission() throws java.lang.SecurityException {}
        protected void getAccessibilityShortcutTargets_enforcePermission() throws java.lang.SecurityException {}
        protected void registerSystemAction_enforcePermission() throws java.lang.SecurityException {}
        protected void unregisterSystemAction_enforcePermission() throws java.lang.SecurityException {}
        protected void setMagnificationConnection_enforcePermission() throws java.lang.SecurityException {}
        protected void setSystemAudioCaptioningEnabled_enforcePermission() throws java.lang.SecurityException {}
        protected void setSystemAudioCaptioningUiEnabled_enforcePermission() throws java.lang.SecurityException {}
        protected void registerProxyForDisplay_enforcePermission() throws java.lang.SecurityException {}
        protected void unregisterProxyForDisplay_enforcePermission() throws java.lang.SecurityException {}
        protected void injectInputEventToInputFilter_enforcePermission() throws java.lang.SecurityException {}
        protected void isAccessibilityServiceWarningRequired_enforcePermission() throws java.lang.SecurityException {}
        protected void attachAccessibilityOverlayToDisplay_enforcePermission() throws java.lang.SecurityException {}
        protected void notifyQuickSettingsTilesChanged_enforcePermission() throws java.lang.SecurityException {}
        protected void enableShortcutsForTargets_enforcePermission() throws java.lang.SecurityException {}
        protected void getA11yFeatureToTileMap_enforcePermission() throws java.lang.SecurityException {}
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.view.accessibility.IAccessibilityManager {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void interrupt(int p0) throws android.os.RemoteException {}
            public void sendAccessibilityEvent(android.view.accessibility.AccessibilityEvent p0, int p1) throws android.os.RemoteException {}
            public long addClient(android.view.accessibility.IAccessibilityManagerClient p0, int p1) throws android.os.RemoteException { return 0L; }
            public boolean removeClient(android.view.accessibility.IAccessibilityManagerClient p0, int p1) throws android.os.RemoteException { return false; }
            public android.content.pm.ParceledListSlice<android.accessibilityservice.AccessibilityServiceInfo> getInstalledAccessibilityServiceList(int p0) throws android.os.RemoteException { return null; }
            public java.util.List<android.accessibilityservice.AccessibilityServiceInfo> getEnabledAccessibilityServiceList(int p0, int p1) throws android.os.RemoteException { return null; }
            public int addAccessibilityInteractionConnection(android.view.IWindow p0, android.os.IBinder p1, android.view.accessibility.IAccessibilityInteractionConnection p2, java.lang.String p3, int p4) throws android.os.RemoteException { return 0; }
            public void removeAccessibilityInteractionConnection(android.view.IWindow p0) throws android.os.RemoteException {}
            public void setPictureInPictureActionReplacingConnection(android.view.accessibility.IAccessibilityInteractionConnection p0) throws android.os.RemoteException {}
            public void registerUiTestAutomationService(android.os.IBinder p0, android.accessibilityservice.IAccessibilityServiceClient p1, android.accessibilityservice.AccessibilityServiceInfo p2, int p3, int p4) throws android.os.RemoteException {}
            public void unregisterUiTestAutomationService(android.accessibilityservice.IAccessibilityServiceClient p0) throws android.os.RemoteException {}
            public android.os.IBinder getWindowToken(int p0, int p1) throws android.os.RemoteException { return null; }
            public void notifyAccessibilityButtonClicked(int p0, java.lang.String p1) throws android.os.RemoteException {}
            public void notifyAccessibilityButtonVisibilityChanged(boolean p0) throws android.os.RemoteException {}
            public void performAccessibilityShortcut(java.lang.String p0) throws android.os.RemoteException {}
            public java.util.List<java.lang.String> getAccessibilityShortcutTargets(int p0) throws android.os.RemoteException { return null; }
            public boolean sendFingerprintGesture(int p0) throws android.os.RemoteException { return false; }
            public int getAccessibilityWindowId(android.os.IBinder p0) throws android.os.RemoteException { return 0; }
            public long getRecommendedTimeoutMillis() throws android.os.RemoteException { return 0L; }
            public void registerSystemAction(android.app.RemoteAction p0, int p1) throws android.os.RemoteException {}
            public void unregisterSystemAction(int p0) throws android.os.RemoteException {}
            public void setMagnificationConnection(android.view.accessibility.IMagnificationConnection p0) throws android.os.RemoteException {}
            public void associateEmbeddedHierarchy(android.os.IBinder p0, android.os.IBinder p1) throws android.os.RemoteException {}
            public void disassociateEmbeddedHierarchy(android.os.IBinder p0) throws android.os.RemoteException {}
            public int getFocusStrokeWidth() throws android.os.RemoteException { return 0; }
            public int getFocusColor() throws android.os.RemoteException { return 0; }
            public boolean isAudioDescriptionByDefaultEnabled() throws android.os.RemoteException { return false; }
            public void setSystemAudioCaptioningEnabled(boolean p0, int p1) throws android.os.RemoteException {}
            public boolean isSystemAudioCaptioningUiEnabled(int p0) throws android.os.RemoteException { return false; }
            public void setSystemAudioCaptioningUiEnabled(boolean p0, int p1) throws android.os.RemoteException {}
            public void setAccessibilityWindowAttributes(int p0, int p1, int p2, android.view.accessibility.AccessibilityWindowAttributes p3) throws android.os.RemoteException {}
            public boolean registerProxyForDisplay(android.accessibilityservice.IAccessibilityServiceClient p0, int p1) throws android.os.RemoteException { return false; }
            public boolean unregisterProxyForDisplay(int p0) throws android.os.RemoteException { return false; }
            public void injectInputEventToInputFilter(android.view.InputEvent p0) throws android.os.RemoteException {}
            public boolean startFlashNotificationSequence(java.lang.String p0, int p1, android.os.IBinder p2) throws android.os.RemoteException { return false; }
            public boolean stopFlashNotificationSequence(java.lang.String p0) throws android.os.RemoteException { return false; }
            public boolean startFlashNotificationEvent(java.lang.String p0, int p1, java.lang.String p2) throws android.os.RemoteException { return false; }
            public boolean isAccessibilityTargetAllowed(java.lang.String p0, int p1, int p2) throws android.os.RemoteException { return false; }
            public boolean sendRestrictedDialogIntent(java.lang.String p0, int p1, int p2) throws android.os.RemoteException { return false; }
            public boolean isAccessibilityServiceWarningRequired(android.accessibilityservice.AccessibilityServiceInfo p0) throws android.os.RemoteException { return false; }
            public android.view.accessibility.IAccessibilityManager.WindowTransformationSpec getWindowTransformationSpec(int p0) throws android.os.RemoteException { return null; }
            public void attachAccessibilityOverlayToDisplay(int p0, android.view.SurfaceControl p1) throws android.os.RemoteException {}
            public void notifyQuickSettingsTilesChanged(int p0, java.util.List<android.content.ComponentName> p1) throws android.os.RemoteException {}
            public void enableShortcutsForTargets(boolean p0, int p1, java.util.List<java.lang.String> p2, int p3) throws android.os.RemoteException {}
            public android.os.Bundle getA11yFeatureToTileMap(int p0) throws android.os.RemoteException { return null; }
        }
    }

    public static class WindowTransformationSpec implements android.os.Parcelable {
        public float[] transformationMatrix;
        public android.view.MagnificationSpec magnificationSpec;
        public static final android.os.Parcelable.Creator<android.view.accessibility.IAccessibilityManager.WindowTransformationSpec> CREATOR = null;
        public WindowTransformationSpec() {}
        public final void writeToParcel(android.os.Parcel p0, int p1) {}
        public final void readFromParcel(android.os.Parcel p0) {}
        public int describeContents() { return 0; }
    }
}
