package android.app;

public final class UiAutomation {
    public static final int ROTATION_UNFREEZE = -2;
    public static final int ROTATION_FREEZE_CURRENT = -1;
    public static final int ROTATION_FREEZE_0 = 0;
    public static final int ROTATION_FREEZE_90 = 1;
    public static final int ROTATION_FREEZE_180 = 2;
    public static final int ROTATION_FREEZE_270 = 3;
    public static final int FLAG_DONT_SUPPRESS_ACCESSIBILITY_SERVICES = 1;
    public static final int FLAG_DONT_USE_ACCESSIBILITY = 2;
    public static final int FLAG_NOT_ACCESSIBILITY_TOOL = 4;
    @android.annotation.NonNull
    public static final java.util.Set<java.lang.String> ALL_PERMISSIONS = null;
    public UiAutomation(android.content.Context p0, android.app.IUiAutomationConnection p1) {}
    @java.lang.Deprecated
    public UiAutomation(android.os.Looper p0, android.app.IUiAutomationConnection p1) {}
    public void connect() {}
    public void connect(int p0) {}
    public void connectWithTimeout(int p0, long p1) throws java.util.concurrent.TimeoutException {}
    public int getFlags() { return 0; }
    public void disconnect() {}
    public int getConnectionId() { return 0; }
    public boolean isDestroyed() { return false; }
    public void setOnAccessibilityEventListener(android.app.UiAutomation.OnAccessibilityEventListener p0) {}
    public void destroy() {}
    public boolean clearCache() { return false; }
    public boolean isNodeInCache(android.view.accessibility.AccessibilityNodeInfo p0) { return false; }
    @android.annotation.Nullable
    public android.view.accessibility.AccessibilityCache getCache() { return null; }
    public void adoptShellPermissionIdentity() {}
    public void adoptShellPermissionIdentity(java.lang.String... p0) {}
    public void dropShellPermissionIdentity() {}
    @android.annotation.NonNull
    public java.util.Set<java.lang.String> getAdoptedShellPermissions() { return null; }
    @android.annotation.SuppressLint("UnflaggedApi")
    public void addOverridePermissionState(int p0, java.lang.String p1, int p2) {}
    @android.annotation.SuppressLint("UnflaggedApi")
    public void removeOverridePermissionState(int p0, java.lang.String p1) {}
    @android.annotation.SuppressLint("UnflaggedApi")
    public void clearOverridePermissionStates(int p0) {}
    @android.annotation.SuppressLint("UnflaggedApi")
    public void clearAllOverridePermissionStates() {}
    public final boolean performGlobalAction(int p0) { return false; }
    public android.view.accessibility.AccessibilityNodeInfo findFocus(int p0) { return null; }
    public final android.accessibilityservice.AccessibilityServiceInfo getServiceInfo() { return null; }
    public final void setServiceInfo(android.accessibilityservice.AccessibilityServiceInfo p0) {}
    public java.util.List<android.view.accessibility.AccessibilityWindowInfo> getWindows() { return null; }
    @android.annotation.NonNull
    public android.util.SparseArray<java.util.List<android.view.accessibility.AccessibilityWindowInfo>> getWindowsOnAllDisplays() { return null; }
    public android.view.accessibility.AccessibilityNodeInfo getRootInActiveWindow() { return null; }
    @android.annotation.Nullable
    public android.view.accessibility.AccessibilityNodeInfo getRootInActiveWindow(int p0) { return null; }
    public boolean injectInputEvent(android.view.InputEvent p0, boolean p1) { return false; }
    @java.lang.Deprecated
    @android.annotation.SuppressLint("UnflaggedApi")
    public boolean injectInputEvent(android.view.InputEvent p0, boolean p1, boolean p2) { return false; }
    @java.lang.Deprecated
    @android.annotation.SuppressLint("UnflaggedApi")
    public void injectInputEventToInputFilter(android.view.InputEvent p0) {}
    public void setAnimationScale(float p0) {}
    public void syncInputTransactions() {}
    public void syncInputTransactions(boolean p0) {}
    public boolean setRotation(int p0) { return false; }
    public android.view.accessibility.AccessibilityEvent executeAndWaitForEvent(java.lang.Runnable p0, android.app.UiAutomation.AccessibilityEventFilter p1, long p2) throws java.util.concurrent.TimeoutException { return null; }
    public void waitForIdle(long p0, long p1) throws java.util.concurrent.TimeoutException {}
    public android.graphics.Bitmap takeScreenshot() { return null; }
    @android.annotation.NonNull
    @android.annotation.SuppressLint("UnflaggedApi")
    public android.graphics.Bitmap takeScreenshot(int p0) throws java.io.IOException { return null; }
    @android.annotation.Nullable
    public android.graphics.Bitmap takeScreenshot(android.view.Window p0) { return null; }
    public void setRunAsMonkey(boolean p0) {}
    public boolean clearWindowContentFrameStats(int p0) { return false; }
    public android.view.WindowContentFrameStats getWindowContentFrameStats(int p0) { return null; }
    @java.lang.Deprecated
    public void clearWindowAnimationFrameStats() {}
    @java.lang.Deprecated
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
    @android.annotation.SuppressLint("ArrayReturn")
    @android.annotation.NonNull
    public android.os.ParcelFileDescriptor[] executeShellCommandRw(java.lang.String p0) { return null; }
    @android.annotation.SuppressLint("ArrayReturn")
    @android.annotation.NonNull
    public android.os.ParcelFileDescriptor[] executeShellCommandRwe(java.lang.String p0) { return null; }
    public int getDisplayId() { return 0; }
    public java.lang.String toString() { return null; }

    public static interface AccessibilityEventFilter {
        public boolean accept(android.view.accessibility.AccessibilityEvent p0);
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    private static @interface ConnectionState {
        public static final int DISCONNECTED = 0;
        public static final int CONNECTING = 1;
        public static final int CONNECTED = 2;
        public static final int FAILED = 3;
    }

    private class IAccessibilityServiceClientImpl extends android.accessibilityservice.AccessibilityService.IAccessibilityServiceClientWrapper {
        public IAccessibilityServiceClientImpl(android.app.UiAutomation p0, android.os.Looper p1, int p2) { super((android.content.Context)null, (java.util.concurrent.Executor)null, (android.accessibilityservice.AccessibilityService.Callbacks)null); }
    }

    public static interface OnAccessibilityEventListener {
        public void onAccessibilityEvent(android.view.accessibility.AccessibilityEvent p0);
    }
}
