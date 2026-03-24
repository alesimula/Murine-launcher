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
    public static final java.lang.String ACTION_CHOOSE_ACCESSIBILITY_BUTTON = "com.android.internal.intent.action.CHOOSE_ACCESSIBILITY_BUTTON";
    public static final int ACCESSIBILITY_BUTTON = 0;
    public static final int ACCESSIBILITY_SHORTCUT_KEY = 1;
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
    boolean mIsHighTextContrastEnabled;
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
    public boolean isTouchExplorationEnabled() { return false; }
    public boolean isHighTextContrastEnabled() { return false; }
    public void sendAccessibilityEvent(android.view.accessibility.AccessibilityEvent p0) {}
    public void interrupt() {}
    @java.lang.Deprecated
    public java.util.List<android.content.pm.ServiceInfo> getAccessibilityServiceList() { return null; }
    public java.util.List<android.accessibilityservice.AccessibilityServiceInfo> getInstalledAccessibilityServiceList() { return null; }
    public java.util.List<android.accessibilityservice.AccessibilityServiceInfo> getEnabledAccessibilityServiceList(int p0) { return null; }
    public boolean addAccessibilityStateChangeListener(android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener p0) { return false; }
    public void addAccessibilityStateChangeListener(android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener p0, android.os.Handler p1) {}
    public boolean removeAccessibilityStateChangeListener(android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener p0) { return false; }
    public boolean addTouchExplorationStateChangeListener(android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener p0) { return false; }
    public void addTouchExplorationStateChangeListener(android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener p0, android.os.Handler p1) {}
    public boolean removeTouchExplorationStateChangeListener(android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener p0) { return false; }
    public void addAccessibilityServicesStateChangeListener(java.util.concurrent.Executor p0, android.view.accessibility.AccessibilityManager.AccessibilityServicesStateChangeListener p1) {}
    public void addAccessibilityServicesStateChangeListener(android.view.accessibility.AccessibilityManager.AccessibilityServicesStateChangeListener p0) {}
    public boolean removeAccessibilityServicesStateChangeListener(android.view.accessibility.AccessibilityManager.AccessibilityServicesStateChangeListener p0) { return false; }
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
    public void addHighTextContrastStateChangeListener(android.view.accessibility.AccessibilityManager.HighTextContrastChangeListener p0, android.os.Handler p1) {}
    public void removeHighTextContrastStateChangeListener(android.view.accessibility.AccessibilityManager.HighTextContrastChangeListener p0) {}
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
    public void performAccessibilityShortcut(java.lang.String p0) {}
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
    public void notifyAccessibilityButtonVisibilityChanged(boolean p0) {}
    public void setPictureInPictureActionReplacingConnection(android.view.accessibility.IAccessibilityInteractionConnection p0) {}
    @android.annotation.RequiresPermission("android.permission.MANAGE_ACCESSIBILITY")
    public java.util.List<java.lang.String> getAccessibilityShortcutTargets(int p0) { return null; }
    public java.util.List<android.accessibilityservice.AccessibilityShortcutInfo> getInstalledAccessibilityShortcutListAsUser(android.content.Context p0, int p1) { return null; }
    public void setWindowMagnificationConnection(android.view.accessibility.IWindowMagnificationConnection p0) {}
    public boolean isAudioDescriptionRequested() { return false; }
    public void setSystemAudioCaptioningEnabled(boolean p0, int p1) {}
    public boolean isSystemAudioCaptioningUiEnabled(int p0) { return false; }
    public void setSystemAudioCaptioningUiEnabled(boolean p0, int p1) {}
    public static boolean isAccessibilityButtonSupported() { return false; }

    public static interface AccessibilityPolicy {
        public boolean isEnabled(boolean p0);
        public android.view.accessibility.AccessibilityEvent onAccessibilityEvent(android.view.accessibility.AccessibilityEvent p0, boolean p1, int p2);
        public int getRelevantEventTypes(int p0);
        public java.util.List<android.accessibilityservice.AccessibilityServiceInfo> getInstalledAccessibilityServiceList(java.util.List<android.accessibilityservice.AccessibilityServiceInfo> p0);
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

    public static interface HighTextContrastChangeListener {
        public void onHighTextContrastStateChanged(boolean p0);
    }

    private final class MyCallback implements android.os.Handler.Callback {
        public static final int MSG_SET_STATE = 1;
        public boolean handleMessage(android.os.Message p0) { return false; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ShortcutType {
    }

    public static interface TouchExplorationStateChangeListener {
        public void onTouchExplorationStateChanged(boolean p0);
    }
}
