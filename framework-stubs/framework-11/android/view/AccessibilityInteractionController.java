package android.view;

public final class AccessibilityInteractionController {
    private static final java.lang.String LOG_TAG = "AccessibilityInteractionController";
    private static final boolean ENFORCE_NODE_TREE_CONSISTENT = false;
    private static final boolean IGNORE_REQUEST_PREPARERS = true;
    private static final boolean CONSIDER_REQUEST_PREPARERS = false;
    private static final long REQUEST_PREPARER_TIMEOUT_MS = 500L;
    private final java.util.ArrayList<android.view.accessibility.AccessibilityNodeInfo> mTempAccessibilityNodeInfoList = null;
    private final java.lang.Object mLock = null;
    private final android.view.AccessibilityInteractionController.PrivateHandler mHandler = null;
    private final android.view.ViewRootImpl mViewRootImpl = null;
    private final android.view.AccessibilityInteractionController.AccessibilityNodePrefetcher mPrefetcher = null;
    private final long mMyLooperThreadId = 0L;
    private final int mMyProcessId = 0;
    private final android.view.accessibility.AccessibilityManager mA11yManager = null;
    private final java.util.ArrayList<android.view.View> mTempArrayList = null;
    private final android.graphics.Point mTempPoint = null;
    private final android.graphics.Rect mTempRect = null;
    private final android.graphics.Rect mTempRect1 = null;
    private final android.graphics.Rect mTempRect2 = null;
    private final android.graphics.RectF mTempRectF = null;
    private android.view.AccessibilityInteractionController.AddNodeInfosForViewId mAddNodeInfosForViewId;
    private int mNumActiveRequestPreparers;
    private java.util.List<android.view.AccessibilityInteractionController.MessageHolder> mMessagesWaitingForRequestPreparer;
    private int mActiveRequestPreparerId;
    public AccessibilityInteractionController(android.view.ViewRootImpl p0) {}
    private void scheduleMessage(android.os.Message p0, int p1, long p2, boolean p3) {}
    private boolean isShown(android.view.View p0) { return false; }
    public void findAccessibilityNodeInfoByAccessibilityIdClientThread(long p0, android.graphics.Region p1, int p2, android.view.accessibility.IAccessibilityInteractionConnectionCallback p3, int p4, int p5, long p6, android.view.MagnificationSpec p7, android.os.Bundle p8) {}
    private boolean holdOffMessageIfNeeded(android.os.Message p0, int p1, long p2) { return false; }
    private void prepareForExtraDataRequestUiThread(android.os.Message p0) {}
    private void queueMessageToHandleOncePrepared(android.os.Message p0, int p1, long p2) {}
    private void requestPreparerDoneUiThread(android.os.Message p0) {}
    private void requestPreparerTimeoutUiThread() {}
    private void scheduleAllMessagesWaitingForRequestPreparerLocked() {}
    private void findAccessibilityNodeInfoByAccessibilityIdUiThread(android.os.Message p0) {}
    public void findAccessibilityNodeInfosByViewIdClientThread(long p0, java.lang.String p1, android.graphics.Region p2, int p3, android.view.accessibility.IAccessibilityInteractionConnectionCallback p4, int p5, int p6, long p7, android.view.MagnificationSpec p8) {}
    private void findAccessibilityNodeInfosByViewIdUiThread(android.os.Message p0) {}
    public void findAccessibilityNodeInfosByTextClientThread(long p0, java.lang.String p1, android.graphics.Region p2, int p3, android.view.accessibility.IAccessibilityInteractionConnectionCallback p4, int p5, int p6, long p7, android.view.MagnificationSpec p8) {}
    private void findAccessibilityNodeInfosByTextUiThread(android.os.Message p0) {}
    public void findFocusClientThread(long p0, int p1, android.graphics.Region p2, int p3, android.view.accessibility.IAccessibilityInteractionConnectionCallback p4, int p5, int p6, long p7, android.view.MagnificationSpec p8) {}
    private void findFocusUiThread(android.os.Message p0) {}
    public void focusSearchClientThread(long p0, int p1, android.graphics.Region p2, int p3, android.view.accessibility.IAccessibilityInteractionConnectionCallback p4, int p5, int p6, long p7, android.view.MagnificationSpec p8) {}
    private void focusSearchUiThread(android.os.Message p0) {}
    public void performAccessibilityActionClientThread(long p0, int p1, android.os.Bundle p2, int p3, android.view.accessibility.IAccessibilityInteractionConnectionCallback p4, int p5, int p6, long p7) {}
    private void performAccessibilityActionUiThread(android.os.Message p0) {}
    public void clearAccessibilityFocusClientThread() {}
    private void clearAccessibilityFocusUiThread() {}
    public void notifyOutsideTouchClientThread() {}
    private void notifyOutsideTouchUiThread() {}
    private android.view.View findViewByAccessibilityId(int p0) { return null; }
    private void applyAppScaleAndMagnificationSpecIfNeeded(java.util.List<android.view.accessibility.AccessibilityNodeInfo> p0, android.view.MagnificationSpec p1) {}
    private void adjustIsVisibleToUserIfNeeded(java.util.List<android.view.accessibility.AccessibilityNodeInfo> p0, android.graphics.Region p1) {}
    private void adjustIsVisibleToUserIfNeeded(android.view.accessibility.AccessibilityNodeInfo p0, android.graphics.Region p1) {}
    private boolean shouldBypassAdjustIsVisible() { return false; }
    private void adjustBoundsInScreenIfNeeded(java.util.List<android.view.accessibility.AccessibilityNodeInfo> p0) {}
    private void adjustBoundsInScreenIfNeeded(android.view.accessibility.AccessibilityNodeInfo p0) {}
    private boolean shouldBypassAdjustBoundsInScreen() { return false; }
    private void applyScreenMatrixIfNeeded(java.util.List<android.view.accessibility.AccessibilityNodeInfo> p0) {}
    private void applyScreenMatrixIfNeeded(android.view.accessibility.AccessibilityNodeInfo p0) {}
    private boolean shouldBypassApplyScreenMatrix() { return false; }
    private void associateLeashedParentIfNeeded(java.util.List<android.view.accessibility.AccessibilityNodeInfo> p0) {}
    private void associateLeashedParentIfNeeded(android.view.accessibility.AccessibilityNodeInfo p0) {}
    private boolean shouldBypassAssociateLeashedParent() { return false; }
    private void applyAppScaleAndMagnificationSpecIfNeeded(android.view.accessibility.AccessibilityNodeInfo p0, android.view.MagnificationSpec p1) {}
    private boolean shouldApplyAppScaleAndMagnificationSpec(float p0, android.view.MagnificationSpec p1) { return false; }
    private void updateInfosForViewportAndReturnFindNodeResult(java.util.List<android.view.accessibility.AccessibilityNodeInfo> p0, android.view.accessibility.IAccessibilityInteractionConnectionCallback p1, int p2, android.view.MagnificationSpec p3, android.graphics.Region p4) {}
    private void updateInfoForViewportAndReturnFindNodeResult(android.view.accessibility.AccessibilityNodeInfo p0, android.view.accessibility.IAccessibilityInteractionConnectionCallback p1, int p2, android.view.MagnificationSpec p3, android.graphics.Region p4) {}
    private void recycleMagnificationSpecAndRegionIfNeeded(android.view.MagnificationSpec p0, android.graphics.Region p1) {}
    private boolean handleClickableSpanActionUiThread(android.view.View p0, int p1, android.os.Bundle p2) { return false; }

    private class AccessibilityNodePrefetcher {
        private static final int MAX_ACCESSIBILITY_NODE_INFO_BATCH_SIZE = 50;
        private final java.util.ArrayList<android.view.View> mTempViewList = null;
        private AccessibilityNodePrefetcher(android.view.AccessibilityInteractionController p0) {}
        public void prefetchAccessibilityNodeInfos(android.view.View p0, int p1, int p2, java.util.List<android.view.accessibility.AccessibilityNodeInfo> p3, android.os.Bundle p4) {}
        private void enforceNodeTreeConsistent(java.util.List<android.view.accessibility.AccessibilityNodeInfo> p0) {}
        private void prefetchPredecessorsOfRealNode(android.view.View p0, java.util.List<android.view.accessibility.AccessibilityNodeInfo> p1) {}
        private void prefetchSiblingsOfRealNode(android.view.View p0, java.util.List<android.view.accessibility.AccessibilityNodeInfo> p1) {}
        private void prefetchDescendantsOfRealNode(android.view.View p0, java.util.List<android.view.accessibility.AccessibilityNodeInfo> p1) {}
        private void prefetchPredecessorsOfVirtualNode(android.view.accessibility.AccessibilityNodeInfo p0, android.view.View p1, android.view.accessibility.AccessibilityNodeProvider p2, java.util.List<android.view.accessibility.AccessibilityNodeInfo> p3) {}
        private void prefetchSiblingsOfVirtualNode(android.view.accessibility.AccessibilityNodeInfo p0, android.view.View p1, android.view.accessibility.AccessibilityNodeProvider p2, java.util.List<android.view.accessibility.AccessibilityNodeInfo> p3) {}
        private void prefetchDescendantsOfVirtualNode(android.view.accessibility.AccessibilityNodeInfo p0, android.view.accessibility.AccessibilityNodeProvider p1, java.util.List<android.view.accessibility.AccessibilityNodeInfo> p2) {}
    }

    private final class AddNodeInfosForViewId implements java.util.function.Predicate<android.view.View> {
        private int mViewId;
        private java.util.List<android.view.accessibility.AccessibilityNodeInfo> mInfos;
        private AddNodeInfosForViewId(android.view.AccessibilityInteractionController p0) {}
        public void init(int p0, java.util.List<android.view.accessibility.AccessibilityNodeInfo> p1) {}
        public void reset() {}
        public boolean test(android.view.View p0) { return false; }
    }

    private static final class MessageHolder {
        final android.os.Message mMessage = null;
        final int mInterrogatingPid = 0;
        final long mInterrogatingTid = 0L;
        MessageHolder(android.os.Message p0, int p1, long p2) {}
    }

    private class PrivateHandler extends android.os.Handler {
        private static final int MSG_PERFORM_ACCESSIBILITY_ACTION = 1;
        private static final int MSG_FIND_ACCESSIBILITY_NODE_INFO_BY_ACCESSIBILITY_ID = 2;
        private static final int MSG_FIND_ACCESSIBILITY_NODE_INFOS_BY_VIEW_ID = 3;
        private static final int MSG_FIND_ACCESSIBILITY_NODE_INFO_BY_TEXT = 4;
        private static final int MSG_FIND_FOCUS = 5;
        private static final int MSG_FOCUS_SEARCH = 6;
        private static final int MSG_PREPARE_FOR_EXTRA_DATA_REQUEST = 7;
        private static final int MSG_APP_PREPARATION_FINISHED = 8;
        private static final int MSG_APP_PREPARATION_TIMEOUT = 9;
        private static final int FIRST_NO_ACCESSIBILITY_CALLBACK_MSG = 100;
        private static final int MSG_CLEAR_ACCESSIBILITY_FOCUS = 101;
        private static final int MSG_NOTIFY_OUTSIDE_TOUCH = 102;
        public PrivateHandler(android.view.AccessibilityInteractionController p0, android.os.Looper p1) { super(); }
        public java.lang.String getMessageName(android.os.Message p0) { return null; }
        public void handleMessage(android.os.Message p0) {}
        boolean hasAccessibilityCallback(android.os.Message p0) { return false; }
    }
}
