package android.view;

public final class AccessibilityInteractionController {
    public AccessibilityInteractionController(android.view.ViewRootImpl p0) {}
    public void findAccessibilityNodeInfoByAccessibilityIdClientThread(long p0, android.graphics.Region p1, int p2, android.view.accessibility.IAccessibilityInteractionConnectionCallback p3, int p4, int p5, long p6, android.view.MagnificationSpec p7, float[] p8, android.os.Bundle p9) {}
    public void findAccessibilityNodeInfosByViewIdClientThread(long p0, java.lang.String p1, android.graphics.Region p2, int p3, android.view.accessibility.IAccessibilityInteractionConnectionCallback p4, int p5, int p6, long p7, android.view.MagnificationSpec p8, float[] p9) {}
    public void findAccessibilityNodeInfosByTextClientThread(long p0, java.lang.String p1, android.graphics.Region p2, int p3, android.view.accessibility.IAccessibilityInteractionConnectionCallback p4, int p5, int p6, long p7, android.view.MagnificationSpec p8, float[] p9) {}
    public void takeScreenshotOfWindowClientThread(int p0, android.window.ScreenCapture.ScreenCaptureListener p1, android.view.accessibility.IAccessibilityInteractionConnectionCallback p2) {}
    public void getWindowSurfaceInfoClientThread(android.view.accessibility.IWindowSurfaceInfoCallback p0) {}
    public void findFocusClientThread(long p0, int p1, android.graphics.Region p2, int p3, android.view.accessibility.IAccessibilityInteractionConnectionCallback p4, int p5, int p6, long p7, android.view.MagnificationSpec p8, float[] p9) {}
    public void focusSearchClientThread(long p0, int p1, android.graphics.Region p2, int p3, android.view.accessibility.IAccessibilityInteractionConnectionCallback p4, int p5, int p6, long p7, android.view.MagnificationSpec p8, float[] p9) {}
    public void performAccessibilityActionClientThread(long p0, int p1, android.os.Bundle p2, int p3, android.view.accessibility.IAccessibilityInteractionConnectionCallback p4, int p5, int p6, long p7) {}
    public void clearAccessibilityFocusClientThread() {}
    public void notifyOutsideTouchClientThread() {}
    public android.view.View getRootView() { return null; }
    public void destroy() {}
    public void attachAccessibilityOverlayToWindowClientThread(android.view.SurfaceControl p0, int p1, android.view.accessibility.IAccessibilityInteractionConnectionCallback p2) {}

    private class AccessibilityNodePrefetcher {
        public void prefetchAccessibilityNodeInfos(android.view.View p0, android.view.accessibility.AccessibilityNodeInfo p1, java.util.List<android.view.accessibility.AccessibilityNodeInfo> p2) {}
        public boolean shouldStopPrefetching(java.util.List p0) { return false; }
    }

    private final class AddNodeInfosForViewId implements java.util.function.Predicate<android.view.View> {
        public void init(int p0, java.util.List<android.view.accessibility.AccessibilityNodeInfo> p1) {}
        public void reset() {}
        public boolean test(android.view.View p0) { return false; }
    }

    static interface DequeNode {
        public android.view.accessibility.AccessibilityNodeInfo getA11yNodeInfo();
        public void addChildren(android.view.accessibility.AccessibilityNodeInfo p0, android.view.AccessibilityInteractionController.PrefetchDeque p1);
    }

    private static final class MessageHolder {
        final android.os.Message mMessage = null;
        final int mInterrogatingPid = 0;
        final long mInterrogatingTid = 0L;
        MessageHolder(android.os.Message p0, int p1, long p2) {}
    }

    private class PrefetchDeque<E extends android.view.AccessibilityInteractionController.DequeNode> extends java.util.ArrayDeque<E> {
        int mStrategy;
        java.util.List<android.view.accessibility.AccessibilityNodeInfo> mPrefetchOutput;
        PrefetchDeque(int p0, java.util.List<android.view.accessibility.AccessibilityNodeInfo> p1) { super(); }
        void performTraversalAndPrefetch() {}
        E getNext() { return null; }
        boolean isStack() { return false; }
    }

    private class PrivateHandler extends android.os.Handler {
        public PrivateHandler(android.view.AccessibilityInteractionController p0, android.os.Looper p1) { super(); }
        public java.lang.String getMessageName(android.os.Message p0) { return null; }
        public void handleMessage(android.os.Message p0) {}
        boolean hasAccessibilityCallback(android.os.Message p0) { return false; }
        boolean hasUserInteractiveMessagesWaiting() { return false; }
    }

    private static class SatisfiedFindAccessibilityNodeByAccessibilityIdRequest {
        final android.view.accessibility.AccessibilityNodeInfo mSatisfiedRequestNode = null;
        final android.view.accessibility.IAccessibilityInteractionConnectionCallback mSatisfiedRequestCallback = null;
        final int mSatisfiedRequestInteractionId = 0;
        SatisfiedFindAccessibilityNodeByAccessibilityIdRequest(android.view.accessibility.AccessibilityNodeInfo p0, android.view.accessibility.IAccessibilityInteractionConnectionCallback p1, int p2) {}
    }

    private class ViewNode implements android.view.AccessibilityInteractionController.DequeNode {
        android.view.View mView;
        ViewNode(android.view.AccessibilityInteractionController p0, android.view.View p1) {}
        public android.view.accessibility.AccessibilityNodeInfo getA11yNodeInfo() { return null; }
        public void addChildren(android.view.accessibility.AccessibilityNodeInfo p0, android.view.AccessibilityInteractionController.PrefetchDeque p1) {}
    }

    private class VirtualNode implements android.view.AccessibilityInteractionController.DequeNode {
        long mInfoId;
        android.view.accessibility.AccessibilityNodeProvider mProvider;
        VirtualNode(android.view.AccessibilityInteractionController p0, long p1, android.view.accessibility.AccessibilityNodeProvider p2) {}
        public android.view.accessibility.AccessibilityNodeInfo getA11yNodeInfo() { return null; }
        public void addChildren(android.view.accessibility.AccessibilityNodeInfo p0, android.view.AccessibilityInteractionController.PrefetchDeque p1) {}
    }
}
