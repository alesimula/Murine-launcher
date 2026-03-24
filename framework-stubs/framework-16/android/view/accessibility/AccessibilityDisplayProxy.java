package android.view.accessibility;

@android.annotation.SystemApi
public abstract class AccessibilityDisplayProxy {
    android.accessibilityservice.IAccessibilityServiceClient mServiceClient;
    public AccessibilityDisplayProxy(int p0, java.util.concurrent.Executor p1, java.util.List<android.accessibilityservice.AccessibilityServiceInfo> p2) {}
    public int getDisplayId() { return 0; }
    public void onAccessibilityEvent(android.view.accessibility.AccessibilityEvent p0) {}
    public void onProxyConnected() {}
    public void interrupt() {}
    @android.annotation.Nullable
    public android.view.accessibility.AccessibilityNodeInfo findFocus(int p0) { return null; }
    @android.annotation.NonNull
    public java.util.List<android.view.accessibility.AccessibilityWindowInfo> getWindows() { return null; }
    public void setInstalledAndEnabledServices(java.util.List<android.accessibilityservice.AccessibilityServiceInfo> p0) {}
    @android.annotation.NonNull
    public final java.util.List<android.accessibilityservice.AccessibilityServiceInfo> getInstalledAndEnabledServices() { return null; }
    public void setAccessibilityFocusAppearance(int p0, int p1) {}

    private class IAccessibilityServiceClientImpl extends android.accessibilityservice.AccessibilityService.IAccessibilityServiceClientWrapper {
        IAccessibilityServiceClientImpl(android.view.accessibility.AccessibilityDisplayProxy p0, android.content.Context p1, java.util.concurrent.Executor p2) { super((android.content.Context)null, (java.util.concurrent.Executor)null, (android.accessibilityservice.AccessibilityService.Callbacks)null); }
    }
}
