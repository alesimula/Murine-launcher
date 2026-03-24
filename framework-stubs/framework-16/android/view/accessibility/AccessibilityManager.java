package android.view.accessibility;

public final class AccessibilityManager {
    public static final int STATE_FLAG_ACCESSIBILITY_ENABLED = 1;
    public static final int STATE_FLAG_TOUCH_EXPLORATION_ENABLED = 2;
    public static final int STATE_FLAG_HIGH_TEXT_CONTRAST_ENABLED = 4;
    public static final int STATE_FLAG_DISPATCH_DOUBLE_TAP = 8;
    public static final int STATE_FLAG_REQUEST_MULTI_FINGER_GESTURES = 16;
    public static final int STATE_FLAG_TRACE_A11Y_INTERACTION_CONNECTION_ENABLED = 256;
    public static final int STATE_FLAG_TRACE_A11Y_INTERACTION_CONNECTION_CB_ENABLED = 512;
    public static final int STATE_FLAG_TRACE_A11Y_INTERACTION_CLIENT_ENABLED = 1024;
    public static final int STATE_FLAG_TRACE_A11Y_SERVICE_ENABLED = 2048;
    public static final int STATE_FLAG_AUDIO_DESCRIPTION_BY_DEFAULT_ENABLED = 4096;
    public static final int DALTONIZER_DISABLED = -1;
    public static final int DALTONIZER_SIMULATE_MONOCHROMACY = 0;
    public static final int DALTONIZER_CORRECT_DEUTERANOMALY = 12;
    public static final int AUTOCLICK_DELAY_DEFAULT = 600;
    public static final int AUTOCLICK_DELAY_WITH_INDICATOR_DEFAULT = 1000;
    public static final int AUTOCLICK_CURSOR_AREA_SIZE_DEFAULT = 60;
    public static final int AUTOCLICK_CURSOR_AREA_SIZE_MIN = 20;
    public static final int AUTOCLICK_CURSOR_AREA_SIZE_MAX = 100;
    public static final int AUTOCLICK_CURSOR_AREA_INCREMENT_SIZE = 20;
    public static final boolean AUTOCLICK_IGNORE_MINOR_CURSOR_MOVEMENT_DEFAULT = false;
    public static final boolean AUTOCLICK_REVERT_TO_LEFT_CLICK_DEFAULT = true;
    public static final java.lang.String ACTION_CHOOSE_ACCESSIBILITY_BUTTON = "com.android.internal.intent.action.CHOOSE_ACCESSIBILITY_BUTTON";
    public static final int FLASH_REASON_CALL = 1;
    public static final int FLASH_REASON_ALARM = 2;
    public static final int FLASH_REASON_NOTIFICATION = 3;
    public static final int FLASH_REASON_PREVIEW = 4;
    public static final int FLAG_CONTENT_ICONS = 1;
    public static final int FLAG_CONTENT_TEXT = 2;
    public static final int FLAG_CONTENT_CONTROLS = 4;
    static final java.lang.Object sInstanceSync = null;
    final int mUserId = 0;
    final android.os.Handler mHandler = null;
    final android.os.Handler.Callback mCallback = null;
    boolean mIsEnabled;
    int mRelevantEventTypes;
    int mInteractiveUiTimeout;
    int mNonInteractiveUiTimeout;
    boolean mIsTouchExplorationEnabled;
    boolean mIsHighContrastTextEnabled;
    boolean mIsAudioDescriptionByDefaultRequested;
    int mAccessibilityTracingState;
    android.view.accessibility.AccessibilityManager.AccessibilityPolicy mAccessibilityPolicy;
    public static android.view.accessibility.AccessibilityManager getInstance(android.content.Context p0) { return null; }
    public AccessibilityManager(android.content.Context p0, android.view.accessibility.IAccessibilityManager p1, int p2) {}
    public AccessibilityManager(android.content.Context p0, android.os.Handler p1, android.view.accessibility.IAccessibilityManager p2, int p3, boolean p4) {}
    public android.view.accessibility.IAccessibilityManagerClient getClient() { return null; }
    public boolean removeClient() { return false; }
    public android.os.Handler.Callback getCallback() { return null; }
    public boolean isEnabled() { return false; }
    @android.annotation.FlaggedApi("android.view.accessibility.enable_trusted_accessibility_service_api")
    public boolean enableTrustedAccessibilityService(android.content.ComponentName p0) { return false; }
    @android.annotation.FlaggedApi("android.view.accessibility.enable_trusted_accessibility_service_api")
    @android.annotation.RequiresPermission("android.permission.MANAGE_ACCESSIBILITY")
    public void setTrustedAccessibilityServiceForTesting(android.content.ComponentName p0) {}
    public boolean hasAnyDirectConnection() { return false; }
    public boolean isTouchExplorationEnabled() { return false; }
    @android.annotation.FlaggedApi("com.android.graphics.hwui.flags.high_contrast_text_small_text_rect")
    public boolean isHighContrastTextEnabled() { return false; }
    public void sendAccessibilityEvent(android.view.accessibility.AccessibilityEvent p0) {}
    public void interrupt() {}
    @java.lang.Deprecated
    public java.util.List<android.content.pm.ServiceInfo> getAccessibilityServiceList() { return null; }
    public java.util.List<android.accessibilityservice.AccessibilityServiceInfo> getInstalledAccessibilityServiceList() { return null; }
    public java.util.List<android.accessibilityservice.AccessibilityServiceInfo> getEnabledAccessibilityServiceList(int p0, int p1) { return null; }
    public java.util.List<android.accessibilityservice.AccessibilityServiceInfo> getEnabledAccessibilityServiceList(int p0) { return null; }
    @android.annotation.RequiresPermission("android.permission.MANAGE_ACCESSIBILITY")
    public boolean isAccessibilityServiceWarningRequired(android.accessibilityservice.AccessibilityServiceInfo p0) { return false; }
    public boolean addAccessibilityStateChangeListener(android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener p0) { return false; }
    public void addAccessibilityStateChangeListener(android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener p0, android.os.Handler p1) {}
    public boolean removeAccessibilityStateChangeListener(android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener p0) { return false; }
    public boolean addTouchExplorationStateChangeListener(android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener p0) { return false; }
    public void addTouchExplorationStateChangeListener(android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener p0, android.os.Handler p1) {}
    public boolean removeTouchExplorationStateChangeListener(android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener p0) { return false; }
    public void addAccessibilityServicesStateChangeListener(java.util.concurrent.Executor p0, android.view.accessibility.AccessibilityManager.AccessibilityServicesStateChangeListener p1) {}
    public void addAccessibilityServicesStateChangeListener(android.view.accessibility.AccessibilityManager.AccessibilityServicesStateChangeListener p0) {}
    public boolean removeAccessibilityServicesStateChangeListener(android.view.accessibility.AccessibilityManager.AccessibilityServicesStateChangeListener p0) { return false; }
    public void registerUserInitializationCompleteCallback(android.view.accessibility.IUserInitializationCompleteCallback p0) {}
    public void unregisterUserInitializationCompleteCallback(android.view.accessibility.IUserInitializationCompleteCallback p0) {}
    public boolean isRequestFromAccessibilityTool() { return false; }
    public void setRequestFromAccessibilityTool(boolean p0) {}
    public void addAccessibilityRequestPreparer(android.view.accessibility.AccessibilityRequestPreparer p0) {}
    public void removeAccessibilityRequestPreparer(android.view.accessibility.AccessibilityRequestPreparer p0) {}
    public int getRecommendedTimeoutMillis(int p0, int p1) { return 0; }
    public int getAccessibilityFocusStrokeWidth() { return 0; }
    public int getAccessibilityFocusColor() { return 0; }
    public boolean isA11yInteractionConnectionTraceEnabled() { return false; }
    public boolean isA11yInteractionConnectionCBTraceEnabled() { return false; }
    public boolean isA11yInteractionClientTraceEnabled() { return false; }
    public boolean isA11yServiceTraceEnabled() { return false; }
    public java.util.List<android.view.accessibility.AccessibilityRequestPreparer> getRequestPreparersForAccessibilityId(int p0) { return null; }
    public void notifyPerformingAction(int p0) {}
    public int getPerformingAction() { return 0; }
    @android.annotation.FlaggedApi("com.android.graphics.hwui.flags.high_contrast_text_small_text_rect")
    public void addHighContrastTextStateChangeListener(java.util.concurrent.Executor p0, android.view.accessibility.AccessibilityManager.HighContrastTextStateChangeListener p1) {}
    @android.annotation.FlaggedApi("com.android.graphics.hwui.flags.high_contrast_text_small_text_rect")
    public void removeHighContrastTextStateChangeListener(android.view.accessibility.AccessibilityManager.HighContrastTextStateChangeListener p0) {}
    public void addAudioDescriptionRequestedChangeListener(java.util.concurrent.Executor p0, android.view.accessibility.AccessibilityManager.AudioDescriptionRequestedChangeListener p1) {}
    public boolean removeAudioDescriptionRequestedChangeListener(android.view.accessibility.AccessibilityManager.AudioDescriptionRequestedChangeListener p0) { return false; }
    public void setAccessibilityPolicy(android.view.accessibility.AccessibilityManager.AccessibilityPolicy p0) {}
    public boolean isAccessibilityVolumeStreamActive() { return false; }
    public boolean sendFingerprintGesture(int p0) { return false; }
    @android.annotation.SystemApi
    public int getAccessibilityWindowId(android.os.IBinder p0) { return 0; }
    public void associateEmbeddedHierarchy(android.os.IBinder p0, android.os.IBinder p1) {}
    public void disassociateEmbeddedHierarchy(android.os.IBinder p0) {}
    public android.accessibilityservice.AccessibilityServiceInfo getInstalledServiceInfoWithComponentName(android.content.ComponentName p0) { return null; }
    public int addAccessibilityInteractionConnection(android.view.IWindow p0, android.os.IBinder p1, java.lang.String p2, android.view.accessibility.IAccessibilityInteractionConnection p3) { return 0; }
    public void removeAccessibilityInteractionConnection(android.view.IWindow p0) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MANAGE_ACCESSIBILITY")
    public void performAccessibilityShortcut() {}
    @android.annotation.RequiresPermission("android.permission.MANAGE_ACCESSIBILITY")
    public void performAccessibilityShortcut(int p0, int p1, java.lang.String p2) {}
    @android.annotation.RequiresPermission("android.permission.MANAGE_ACCESSIBILITY")
    public void enableShortcutsForTargets(boolean p0, int p1, java.util.Set<java.lang.String> p2, int p3) {}
    @android.annotation.RequiresPermission("android.permission.MANAGE_ACCESSIBILITY")
    @android.annotation.NonNull
    public java.util.Map<android.content.ComponentName, android.content.ComponentName> getA11yFeatureToTileMap(int p0) { return null; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MANAGE_ACCESSIBILITY")
    public void registerSystemAction(android.app.RemoteAction p0, int p1) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MANAGE_ACCESSIBILITY")
    public void unregisterSystemAction(int p0) {}
    @android.annotation.RequiresPermission("android.permission.STATUS_BAR_SERVICE")
    public void notifyAccessibilityButtonClicked(int p0) {}
    @android.annotation.RequiresPermission("android.permission.STATUS_BAR_SERVICE")
    public void notifyAccessibilityButtonClicked(int p0, java.lang.String p1) {}
    @android.annotation.RequiresPermission("android.permission.STATUS_BAR_SERVICE")
    public void notifyAccessibilityButtonLongClicked(int p0) {}
    public void notifyAccessibilityButtonVisibilityChanged(boolean p0) {}
    public void setPictureInPictureActionReplacingConnection(android.view.accessibility.IAccessibilityInteractionConnection p0) {}
    @android.annotation.RequiresPermission("android.permission.MANAGE_ACCESSIBILITY")
    @android.annotation.NonNull
    public java.util.List<java.lang.String> getAccessibilityShortcutTargets(int p0, int p1) { return null; }
    @android.annotation.RequiresPermission("android.permission.MANAGE_ACCESSIBILITY")
    @android.annotation.NonNull
    public java.util.List<java.lang.String> getAccessibilityShortcutTargets(int p0) { return null; }
    @android.annotation.NonNull
    public java.util.List<android.accessibilityservice.AccessibilityShortcutInfo> getInstalledAccessibilityShortcutListAsUser(android.content.Context p0, int p1) { return null; }
    public void setMagnificationConnection(android.view.accessibility.IMagnificationConnection p0) {}
    public boolean isAudioDescriptionRequested() { return false; }
    public void setSystemAudioCaptioningEnabled(boolean p0, int p1) {}
    public boolean isSystemAudioCaptioningUiEnabled(int p0) { return false; }
    public void setSystemAudioCaptioningUiEnabled(boolean p0, int p1) {}
    public void setAccessibilityWindowAttributes(int p0, int p1, android.view.accessibility.AccessibilityWindowAttributes p2) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission(allOf={"android.permission.MANAGE_ACCESSIBILITY", "android.permission.CREATE_VIRTUAL_DEVICE"})
    public boolean registerDisplayProxy(android.view.accessibility.AccessibilityDisplayProxy p0) { return false; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission(allOf={"android.permission.MANAGE_ACCESSIBILITY", "android.permission.CREATE_VIRTUAL_DEVICE"})
    public boolean unregisterDisplayProxy(android.view.accessibility.AccessibilityDisplayProxy p0) { return false; }
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    @android.annotation.FlaggedApi("android.view.accessibility.flash_notification_system_api")
    public boolean startFlashNotificationSequence(android.content.Context p0, int p1) { return false; }
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    @android.annotation.FlaggedApi("android.view.accessibility.flash_notification_system_api")
    public boolean stopFlashNotificationSequence(android.content.Context p0) { return false; }
    public boolean startFlashNotificationEvent(android.content.Context p0, int p1, java.lang.String p2) { return false; }
    public boolean isAccessibilityTargetAllowed(java.lang.String p0, int p1, int p2) { return false; }
    public boolean sendRestrictedDialogIntent(java.lang.String p0, int p1, int p2) { return false; }
    public void notifyAccessibilityStateChanged() {}
    public static boolean isAccessibilityButtonSupported() { return false; }
    public android.view.accessibility.IAccessibilityManager.WindowTransformationSpec getWindowTransformationSpec(int p0) { return null; }
    @android.annotation.RequiresPermission("android.permission.INTERNAL_SYSTEM_WINDOW")
    public void attachAccessibilityOverlayToDisplay(int p0, android.view.SurfaceControl p1) {}
    @android.annotation.RequiresPermission("android.permission.STATUS_BAR_SERVICE")
    public void notifyQuickSettingsTilesChanged(int p0, java.util.List<android.content.ComponentName> p1) {}

    public static interface AccessibilityPolicy {
        public boolean isEnabled(boolean p0);
        @android.annotation.Nullable
        public android.view.accessibility.AccessibilityEvent onAccessibilityEvent(android.view.accessibility.AccessibilityEvent p0, boolean p1, int p2);
        public int getRelevantEventTypes(int p0);
        @android.annotation.NonNull
        public java.util.List<android.accessibilityservice.AccessibilityServiceInfo> getInstalledAccessibilityServiceList(java.util.List<android.accessibilityservice.AccessibilityServiceInfo> p0);
        @android.annotation.Nullable
        public java.util.List<android.accessibilityservice.AccessibilityServiceInfo> getEnabledAccessibilityServiceList(int p0, java.util.List<android.accessibilityservice.AccessibilityServiceInfo> p1);
    }

    public static interface AccessibilityServicesStateChangeListener {
        public void onAccessibilityServicesStateChanged(android.view.accessibility.AccessibilityManager p0);
    }

    public static interface AccessibilityStateChangeListener {
        public void onAccessibilityStateChanged(boolean p0);
    }

    public static interface AudioDescriptionRequestedChangeListener {
        public void onAudioDescriptionRequestedChanged(boolean p0);
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ContentFlag {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface FlashNotificationReason {
    }

    @android.annotation.FlaggedApi("com.android.graphics.hwui.flags.high_contrast_text_small_text_rect")
    public static interface HighContrastTextStateChangeListener {
        public void onHighContrastTextStateChanged(boolean p0);
    }

    private final class MyCallback implements android.os.Handler.Callback {
        public static final int MSG_SET_STATE = 1;
        public boolean handleMessage(android.os.Message p0) { return false; }
    }

    public static interface TouchExplorationStateChangeListener {
        public void onTouchExplorationStateChanged(boolean p0);
    }
}
