package android.view.accessibility;

public final class AccessibilityManager {
    private static final boolean DEBUG = false;
    private static final java.lang.String LOG_TAG = "AccessibilityManager";
    public static final int STATE_FLAG_ACCESSIBILITY_ENABLED = 1;
    public static final int STATE_FLAG_TOUCH_EXPLORATION_ENABLED = 2;
    public static final int STATE_FLAG_HIGH_TEXT_CONTRAST_ENABLED = 4;
    public static final int DALTONIZER_DISABLED = -1;
    @android.annotation.UnsupportedAppUsage
    public static final int DALTONIZER_SIMULATE_MONOCHROMACY = 0;
    public static final int DALTONIZER_CORRECT_DEUTERANOMALY = 12;
    public static final int AUTOCLICK_DELAY_DEFAULT = 600;
    public static final java.lang.String ACTION_CHOOSE_ACCESSIBILITY_BUTTON = "com.android.internal.intent.action.CHOOSE_ACCESSIBILITY_BUTTON";
    public static final int FLAG_CONTENT_ICONS = 1;
    public static final int FLAG_CONTENT_TEXT = 2;
    public static final int FLAG_CONTENT_CONTROLS = 4;
    @android.annotation.UnsupportedAppUsage
    static final java.lang.Object sInstanceSync = null;
    @android.annotation.UnsupportedAppUsage
    private static android.view.accessibility.AccessibilityManager sInstance;
    @android.annotation.UnsupportedAppUsage
    private final java.lang.Object mLock = null;
    @android.annotation.UnsupportedAppUsage
    private android.view.accessibility.IAccessibilityManager mService;
    @android.annotation.UnsupportedAppUsage
    final int mUserId = 0;
    @android.annotation.UnsupportedAppUsage
    final android.os.Handler mHandler = null;
    final android.os.Handler.Callback mCallback = null;
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28)
    boolean mIsEnabled;
    int mRelevantEventTypes;
    int mInteractiveUiTimeout;
    int mNonInteractiveUiTimeout;
    boolean mIsTouchExplorationEnabled;
    @android.annotation.UnsupportedAppUsage(trackingBug=123768939L)
    boolean mIsHighTextContrastEnabled;
    android.view.accessibility.AccessibilityManager.AccessibilityPolicy mAccessibilityPolicy;
    @android.annotation.UnsupportedAppUsage
    private final android.util.ArrayMap<android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener, android.os.Handler> mAccessibilityStateChangeListeners = null;
    private final android.util.ArrayMap<android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener, android.os.Handler> mTouchExplorationStateChangeListeners = null;
    private final android.util.ArrayMap<android.view.accessibility.AccessibilityManager.HighTextContrastChangeListener, android.os.Handler> mHighTextContrastStateChangeListeners = null;
    private final android.util.ArrayMap<android.view.accessibility.AccessibilityManager.AccessibilityServicesStateChangeListener, android.os.Handler> mServicesStateChangeListeners = null;
    private android.util.SparseArray<java.util.List<android.view.accessibility.AccessibilityRequestPreparer>> mRequestPreparerLists;
    private final android.view.accessibility.IAccessibilityManagerClient.Stub mClient = null;
    @android.annotation.UnsupportedAppUsage
    public static android.view.accessibility.AccessibilityManager getInstance(android.content.Context p0) { return null; }
    public AccessibilityManager(android.content.Context p0, android.view.accessibility.IAccessibilityManager p1, int p2) {}
    public AccessibilityManager(android.os.Handler p0, android.view.accessibility.IAccessibilityManager p1, int p2) {}
    public android.view.accessibility.IAccessibilityManagerClient getClient() { return null; }
    public android.os.Handler.Callback getCallback() { return null; }
    public boolean isEnabled() { return false; }
    public boolean isTouchExplorationEnabled() { return false; }
    @android.annotation.UnsupportedAppUsage
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
    public void addAccessibilityServicesStateChangeListener(android.view.accessibility.AccessibilityManager.AccessibilityServicesStateChangeListener p0, android.os.Handler p1) {}
    public void removeAccessibilityServicesStateChangeListener(android.view.accessibility.AccessibilityManager.AccessibilityServicesStateChangeListener p0) {}
    public void addAccessibilityRequestPreparer(android.view.accessibility.AccessibilityRequestPreparer p0) {}
    public void removeAccessibilityRequestPreparer(android.view.accessibility.AccessibilityRequestPreparer p0) {}
    public int getRecommendedTimeoutMillis(int p0, int p1) { return 0; }
    public java.util.List<android.view.accessibility.AccessibilityRequestPreparer> getRequestPreparersForAccessibilityId(int p0) { return null; }
    public void addHighTextContrastStateChangeListener(android.view.accessibility.AccessibilityManager.HighTextContrastChangeListener p0, android.os.Handler p1) {}
    public void removeHighTextContrastStateChangeListener(android.view.accessibility.AccessibilityManager.HighTextContrastChangeListener p0) {}
    public void setAccessibilityPolicy(android.view.accessibility.AccessibilityManager.AccessibilityPolicy p0) {}
    public boolean isAccessibilityVolumeStreamActive() { return false; }
    public boolean sendFingerprintGesture(int p0) { return false; }
    @android.annotation.SystemApi
    public int getAccessibilityWindowId(android.os.IBinder p0) { return 0; }
    @android.annotation.UnsupportedAppUsage
    private void setStateLocked(int p0) {}
    public android.accessibilityservice.AccessibilityServiceInfo getInstalledServiceInfoWithComponentName(android.content.ComponentName p0) { return null; }
    public int addAccessibilityInteractionConnection(android.view.IWindow p0, java.lang.String p1, android.view.accessibility.IAccessibilityInteractionConnection p2) { return 0; }
    public void removeAccessibilityInteractionConnection(android.view.IWindow p0) {}
    @android.annotation.SystemApi
    public void performAccessibilityShortcut() {}
    public void notifyAccessibilityButtonClicked(int p0) {}
    public void notifyAccessibilityButtonVisibilityChanged(boolean p0) {}
    public void setPictureInPictureActionReplacingConnection(android.view.accessibility.IAccessibilityInteractionConnection p0) {}
    public java.lang.String getAccessibilityShortcutService() { return null; }
    private android.view.accessibility.IAccessibilityManager getServiceLocked() { return null; }
    private void tryConnectToServiceLocked(android.view.accessibility.IAccessibilityManager p0) {}
    private void notifyAccessibilityStateChanged() {}
    private void notifyTouchExplorationStateChanged() {}
    private void notifyHighTextContrastStateChanged() {}
    private void updateUiTimeout(long p0) {}
    public static boolean isAccessibilityButtonSupported() { return false; }

    public static interface TouchExplorationStateChangeListener {
        public void onTouchExplorationStateChanged(boolean p0);
    }

    private final class MyCallback implements android.os.Handler.Callback {
        public static final int MSG_SET_STATE = 1;
        private MyCallback(android.view.accessibility.AccessibilityManager p0) {}
        public boolean handleMessage(android.os.Message p0) { return false; }
    }

    public static interface HighTextContrastChangeListener {
        public void onHighTextContrastStateChanged(boolean p0);
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ContentFlag {
    }

    public static interface AccessibilityStateChangeListener {
        public void onAccessibilityStateChanged(boolean p0);
    }

    public static interface AccessibilityServicesStateChangeListener {
        public void onAccessibilityServicesStateChanged(android.view.accessibility.AccessibilityManager p0);
    }

    public static interface AccessibilityPolicy {
        public boolean isEnabled(boolean p0);
        public android.view.accessibility.AccessibilityEvent onAccessibilityEvent(android.view.accessibility.AccessibilityEvent p0, boolean p1, int p2);
        public int getRelevantEventTypes(int p0);
        public java.util.List<android.accessibilityservice.AccessibilityServiceInfo> getInstalledAccessibilityServiceList(java.util.List<android.accessibilityservice.AccessibilityServiceInfo> p0);
        public java.util.List<android.accessibilityservice.AccessibilityServiceInfo> getEnabledAccessibilityServiceList(int p0, java.util.List<android.accessibilityservice.AccessibilityServiceInfo> p1);
    }
}
