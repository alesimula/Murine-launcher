package android.view.accessibility;

public abstract class AccessibilityNodeProvider {
    public static final int HOST_VIEW_ID = -1;
    public AccessibilityNodeProvider() {}
    public android.view.accessibility.AccessibilityNodeInfo createAccessibilityNodeInfo(int p0) { return null; }
    public void addExtraDataToAccessibilityNodeInfo(int p0, android.view.accessibility.AccessibilityNodeInfo p1, java.lang.String p2, android.os.Bundle p3) {}
    public boolean performAction(int p0, int p1, android.os.Bundle p2) { return false; }
    public java.util.List<android.view.accessibility.AccessibilityNodeInfo> findAccessibilityNodeInfosByText(java.lang.String p0, int p1) { return null; }
    public android.view.accessibility.AccessibilityNodeInfo findFocus(int p0) { return null; }
}
