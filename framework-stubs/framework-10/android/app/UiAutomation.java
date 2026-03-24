package android.app;

public final class UiAutomation {
    private static final java.lang.String LOG_TAG = null;
    private static final boolean DEBUG = false;
    private static final int CONNECTION_ID_UNDEFINED = -1;
    private static final long CONNECT_TIMEOUT_MILLIS = 5000L;
    public static final int ROTATION_UNFREEZE = -2;
    public static final int ROTATION_FREEZE_CURRENT = -1;
    public static final int ROTATION_FREEZE_0 = 0;
    public static final int ROTATION_FREEZE_90 = 1;
    public static final int ROTATION_FREEZE_180 = 2;
    public static final int ROTATION_FREEZE_270 = 3;
    public static final int FLAG_DONT_SUPPRESS_ACCESSIBILITY_SERVICES = 1;
    private final java.lang.Object mLock = null;
    private final java.util.ArrayList<android.view.accessibility.AccessibilityEvent> mEventQueue = null;
    private final android.os.Handler mLocalCallbackHandler = null;
    private final android.app.IUiAutomationConnection mUiAutomationConnection = null;
    private android.os.HandlerThread mRemoteCallbackThread;
    private android.accessibilityservice.IAccessibilityServiceClient mClient;
    private int mConnectionId;
    private android.app.UiAutomation.OnAccessibilityEventListener mOnAccessibilityEventListener;
    private boolean mWaitingForEventDelivery;
    private long mLastEventTimeMillis;
    private boolean mIsConnecting;
    private boolean mIsDestroyed;
    private int mFlags;
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=115609023L)
    public UiAutomation(android.os.Looper p0, android.app.IUiAutomationConnection p1) {}
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=115609023L)
    public void connect() {}
    public void connect(int p0) {}
    public int getFlags() { return 0; }
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=115609023L)
    public void disconnect() {}
    public int getConnectionId() { return 0; }
    public boolean isDestroyed() { return false; }
    public void setOnAccessibilityEventListener(android.app.UiAutomation.OnAccessibilityEventListener p0) {}
    public void destroy() {}
    public void adoptShellPermissionIdentity() {}
    public void adoptShellPermissionIdentity(java.lang.String... p0) {}
    public void dropShellPermissionIdentity() {}
    public final boolean performGlobalAction(int p0) { return false; }
    public android.view.accessibility.AccessibilityNodeInfo findFocus(int p0) { return null; }
    public final android.accessibilityservice.AccessibilityServiceInfo getServiceInfo() { return null; }
    public final void setServiceInfo(android.accessibilityservice.AccessibilityServiceInfo p0) {}
    public java.util.List<android.view.accessibility.AccessibilityWindowInfo> getWindows() { return null; }
    public android.view.accessibility.AccessibilityNodeInfo getRootInActiveWindow() { return null; }
    public boolean injectInputEvent(android.view.InputEvent p0, boolean p1) { return false; }
    public void syncInputTransactions() {}
    public boolean setRotation(int p0) { return false; }
    public android.view.accessibility.AccessibilityEvent executeAndWaitForEvent(java.lang.Runnable p0, android.app.UiAutomation.AccessibilityEventFilter p1, long p2) throws java.util.concurrent.TimeoutException { return null; }
    public void waitForIdle(long p0, long p1) throws java.util.concurrent.TimeoutException {}
    public android.graphics.Bitmap takeScreenshot() { return null; }
    public void setRunAsMonkey(boolean p0) {}
    public boolean clearWindowContentFrameStats(int p0) { return false; }
    public android.view.WindowContentFrameStats getWindowContentFrameStats(int p0) { return null; }
    public void clearWindowAnimationFrameStats() {}
    public android.view.WindowAnimationFrameStats getWindowAnimationFrameStats() { return null; }
    public void grantRuntimePermission(java.lang.String p0, java.lang.String p1) {}
    @java.lang.Deprecated
    public boolean grantRuntimePermission(java.lang.String p0, java.lang.String p1, android.os.UserHandle p2) { return false; }
    public void grantRuntimePermissionAsUser(java.lang.String p0, java.lang.String p1, android.os.UserHandle p2) {}
    public void revokeRuntimePermission(java.lang.String p0, java.lang.String p1) {}
    @java.lang.Deprecated
    public boolean revokeRuntimePermission(java.lang.String p0, java.lang.String p1, android.os.UserHandle p2) { return false; }
    public void revokeRuntimePermissionAsUser(java.lang.String p0, java.lang.String p1, android.os.UserHandle p2) {}
    public android.os.ParcelFileDescriptor executeShellCommand(java.lang.String p0) { return null; }
    public android.os.ParcelFileDescriptor[] executeShellCommandRw(java.lang.String p0) { return null; }
    private boolean isConnectedLocked() { return false; }
    private void throwIfConnectedLocked() {}
    private void throwIfNotConnectedLocked() {}
    private void warnIfBetterCommand(java.lang.String p0) {}

    public static interface OnAccessibilityEventListener {
        public void onAccessibilityEvent(android.view.accessibility.AccessibilityEvent p0);
    }

    private class IAccessibilityServiceClientImpl extends android.accessibilityservice.AccessibilityService.IAccessibilityServiceClientWrapper {
        public IAccessibilityServiceClientImpl(android.app.UiAutomation p0, android.os.Looper p1) { super(null, null, null); }
    }

    public static interface AccessibilityEventFilter {
        public boolean accept(android.view.accessibility.AccessibilityEvent p0);
    }
}
