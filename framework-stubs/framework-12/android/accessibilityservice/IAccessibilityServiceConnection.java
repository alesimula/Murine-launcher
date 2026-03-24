package android.accessibilityservice;

public interface IAccessibilityServiceConnection extends android.os.IInterface {
    public void setServiceInfo(android.accessibilityservice.AccessibilityServiceInfo p0) throws android.os.RemoteException;
    public java.lang.String[] findAccessibilityNodeInfoByAccessibilityId(int p0, long p1, int p2, android.view.accessibility.IAccessibilityInteractionConnectionCallback p3, int p4, long p5, android.os.Bundle p6) throws android.os.RemoteException;
    public java.lang.String[] findAccessibilityNodeInfosByText(int p0, long p1, java.lang.String p2, int p3, android.view.accessibility.IAccessibilityInteractionConnectionCallback p4, long p5) throws android.os.RemoteException;
    public java.lang.String[] findAccessibilityNodeInfosByViewId(int p0, long p1, java.lang.String p2, int p3, android.view.accessibility.IAccessibilityInteractionConnectionCallback p4, long p5) throws android.os.RemoteException;
    public java.lang.String[] findFocus(int p0, long p1, int p2, int p3, android.view.accessibility.IAccessibilityInteractionConnectionCallback p4, long p5) throws android.os.RemoteException;
    public java.lang.String[] focusSearch(int p0, long p1, int p2, int p3, android.view.accessibility.IAccessibilityInteractionConnectionCallback p4, long p5) throws android.os.RemoteException;
    public boolean performAccessibilityAction(int p0, long p1, int p2, android.os.Bundle p3, int p4, android.view.accessibility.IAccessibilityInteractionConnectionCallback p5, long p6) throws android.os.RemoteException;
    public android.view.accessibility.AccessibilityWindowInfo getWindow(int p0) throws android.os.RemoteException;
    public android.view.accessibility.AccessibilityWindowInfo.WindowListSparseArray getWindows() throws android.os.RemoteException;
    public android.accessibilityservice.AccessibilityServiceInfo getServiceInfo() throws android.os.RemoteException;
    public boolean performGlobalAction(int p0) throws android.os.RemoteException;
    public java.util.List<android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction> getSystemActions() throws android.os.RemoteException;
    public void disableSelf() throws android.os.RemoteException;
    public void setOnKeyEventResult(boolean p0, int p1) throws android.os.RemoteException;
    public float getMagnificationScale(int p0) throws android.os.RemoteException;
    public float getMagnificationCenterX(int p0) throws android.os.RemoteException;
    public float getMagnificationCenterY(int p0) throws android.os.RemoteException;
    public android.graphics.Region getMagnificationRegion(int p0) throws android.os.RemoteException;
    public boolean resetMagnification(int p0, boolean p1) throws android.os.RemoteException;
    public boolean setMagnificationScaleAndCenter(int p0, float p1, float p2, float p3, boolean p4) throws android.os.RemoteException;
    public void setMagnificationCallbackEnabled(int p0, boolean p1) throws android.os.RemoteException;
    public boolean setSoftKeyboardShowMode(int p0) throws android.os.RemoteException;
    public int getSoftKeyboardShowMode() throws android.os.RemoteException;
    public void setSoftKeyboardCallbackEnabled(boolean p0) throws android.os.RemoteException;
    public boolean switchToInputMethod(java.lang.String p0) throws android.os.RemoteException;
    public boolean isAccessibilityButtonAvailable() throws android.os.RemoteException;
    public void sendGesture(int p0, android.content.pm.ParceledListSlice p1) throws android.os.RemoteException;
    public void dispatchGesture(int p0, android.content.pm.ParceledListSlice p1, int p2) throws android.os.RemoteException;
    public boolean isFingerprintGestureDetectionAvailable() throws android.os.RemoteException;
    public android.os.IBinder getOverlayWindowToken(int p0) throws android.os.RemoteException;
    public int getWindowIdForLeashToken(android.os.IBinder p0) throws android.os.RemoteException;
    public void takeScreenshot(int p0, android.os.RemoteCallback p1) throws android.os.RemoteException;
    public void setGestureDetectionPassthroughRegion(int p0, android.graphics.Region p1) throws android.os.RemoteException;
    public void setTouchExplorationPassthroughRegion(int p0, android.graphics.Region p1) throws android.os.RemoteException;
    public void setFocusAppearance(int p0, int p1) throws android.os.RemoteException;
    public void logTrace(long p0, java.lang.String p1, java.lang.String p2, int p3, long p4, int p5, android.os.Bundle p6) throws android.os.RemoteException;

    public static class Default implements android.accessibilityservice.IAccessibilityServiceConnection {
        public Default() {}
        public void setServiceInfo(android.accessibilityservice.AccessibilityServiceInfo p0) throws android.os.RemoteException {}
        public java.lang.String[] findAccessibilityNodeInfoByAccessibilityId(int p0, long p1, int p2, android.view.accessibility.IAccessibilityInteractionConnectionCallback p3, int p4, long p5, android.os.Bundle p6) throws android.os.RemoteException { return null; }
        public java.lang.String[] findAccessibilityNodeInfosByText(int p0, long p1, java.lang.String p2, int p3, android.view.accessibility.IAccessibilityInteractionConnectionCallback p4, long p5) throws android.os.RemoteException { return null; }
        public java.lang.String[] findAccessibilityNodeInfosByViewId(int p0, long p1, java.lang.String p2, int p3, android.view.accessibility.IAccessibilityInteractionConnectionCallback p4, long p5) throws android.os.RemoteException { return null; }
        public java.lang.String[] findFocus(int p0, long p1, int p2, int p3, android.view.accessibility.IAccessibilityInteractionConnectionCallback p4, long p5) throws android.os.RemoteException { return null; }
        public java.lang.String[] focusSearch(int p0, long p1, int p2, int p3, android.view.accessibility.IAccessibilityInteractionConnectionCallback p4, long p5) throws android.os.RemoteException { return null; }
        public boolean performAccessibilityAction(int p0, long p1, int p2, android.os.Bundle p3, int p4, android.view.accessibility.IAccessibilityInteractionConnectionCallback p5, long p6) throws android.os.RemoteException { return false; }
        public android.view.accessibility.AccessibilityWindowInfo getWindow(int p0) throws android.os.RemoteException { return null; }
        public android.view.accessibility.AccessibilityWindowInfo.WindowListSparseArray getWindows() throws android.os.RemoteException { return null; }
        public android.accessibilityservice.AccessibilityServiceInfo getServiceInfo() throws android.os.RemoteException { return null; }
        public boolean performGlobalAction(int p0) throws android.os.RemoteException { return false; }
        public java.util.List<android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction> getSystemActions() throws android.os.RemoteException { return null; }
        public void disableSelf() throws android.os.RemoteException {}
        public void setOnKeyEventResult(boolean p0, int p1) throws android.os.RemoteException {}
        public float getMagnificationScale(int p0) throws android.os.RemoteException { return 0.0f; }
        public float getMagnificationCenterX(int p0) throws android.os.RemoteException { return 0.0f; }
        public float getMagnificationCenterY(int p0) throws android.os.RemoteException { return 0.0f; }
        public android.graphics.Region getMagnificationRegion(int p0) throws android.os.RemoteException { return null; }
        public boolean resetMagnification(int p0, boolean p1) throws android.os.RemoteException { return false; }
        public boolean setMagnificationScaleAndCenter(int p0, float p1, float p2, float p3, boolean p4) throws android.os.RemoteException { return false; }
        public void setMagnificationCallbackEnabled(int p0, boolean p1) throws android.os.RemoteException {}
        public boolean setSoftKeyboardShowMode(int p0) throws android.os.RemoteException { return false; }
        public int getSoftKeyboardShowMode() throws android.os.RemoteException { return 0; }
        public void setSoftKeyboardCallbackEnabled(boolean p0) throws android.os.RemoteException {}
        public boolean switchToInputMethod(java.lang.String p0) throws android.os.RemoteException { return false; }
        public boolean isAccessibilityButtonAvailable() throws android.os.RemoteException { return false; }
        public void sendGesture(int p0, android.content.pm.ParceledListSlice p1) throws android.os.RemoteException {}
        public void dispatchGesture(int p0, android.content.pm.ParceledListSlice p1, int p2) throws android.os.RemoteException {}
        public boolean isFingerprintGestureDetectionAvailable() throws android.os.RemoteException { return false; }
        public android.os.IBinder getOverlayWindowToken(int p0) throws android.os.RemoteException { return null; }
        public int getWindowIdForLeashToken(android.os.IBinder p0) throws android.os.RemoteException { return 0; }
        public void takeScreenshot(int p0, android.os.RemoteCallback p1) throws android.os.RemoteException {}
        public void setGestureDetectionPassthroughRegion(int p0, android.graphics.Region p1) throws android.os.RemoteException {}
        public void setTouchExplorationPassthroughRegion(int p0, android.graphics.Region p1) throws android.os.RemoteException {}
        public void setFocusAppearance(int p0, int p1) throws android.os.RemoteException {}
        public void logTrace(long p0, java.lang.String p1, java.lang.String p2, int p3, long p4, int p5, android.os.Bundle p6) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.accessibilityservice.IAccessibilityServiceConnection {
        public static final java.lang.String DESCRIPTOR = "android.accessibilityservice.IAccessibilityServiceConnection";
        static final int TRANSACTION_setServiceInfo = 1;
        static final int TRANSACTION_findAccessibilityNodeInfoByAccessibilityId = 2;
        static final int TRANSACTION_findAccessibilityNodeInfosByText = 3;
        static final int TRANSACTION_findAccessibilityNodeInfosByViewId = 4;
        static final int TRANSACTION_findFocus = 5;
        static final int TRANSACTION_focusSearch = 6;
        static final int TRANSACTION_performAccessibilityAction = 7;
        static final int TRANSACTION_getWindow = 8;
        static final int TRANSACTION_getWindows = 9;
        static final int TRANSACTION_getServiceInfo = 10;
        static final int TRANSACTION_performGlobalAction = 11;
        static final int TRANSACTION_getSystemActions = 12;
        static final int TRANSACTION_disableSelf = 13;
        static final int TRANSACTION_setOnKeyEventResult = 14;
        static final int TRANSACTION_getMagnificationScale = 15;
        static final int TRANSACTION_getMagnificationCenterX = 16;
        static final int TRANSACTION_getMagnificationCenterY = 17;
        static final int TRANSACTION_getMagnificationRegion = 18;
        static final int TRANSACTION_resetMagnification = 19;
        static final int TRANSACTION_setMagnificationScaleAndCenter = 20;
        static final int TRANSACTION_setMagnificationCallbackEnabled = 21;
        static final int TRANSACTION_setSoftKeyboardShowMode = 22;
        static final int TRANSACTION_getSoftKeyboardShowMode = 23;
        static final int TRANSACTION_setSoftKeyboardCallbackEnabled = 24;
        static final int TRANSACTION_switchToInputMethod = 25;
        static final int TRANSACTION_isAccessibilityButtonAvailable = 26;
        static final int TRANSACTION_sendGesture = 27;
        static final int TRANSACTION_dispatchGesture = 28;
        static final int TRANSACTION_isFingerprintGestureDetectionAvailable = 29;
        static final int TRANSACTION_getOverlayWindowToken = 30;
        static final int TRANSACTION_getWindowIdForLeashToken = 31;
        static final int TRANSACTION_takeScreenshot = 32;
        static final int TRANSACTION_setGestureDetectionPassthroughRegion = 33;
        static final int TRANSACTION_setTouchExplorationPassthroughRegion = 34;
        static final int TRANSACTION_setFocusAppearance = 35;
        static final int TRANSACTION_logTrace = 36;
        public Stub() { super(); }
        public static android.accessibilityservice.IAccessibilityServiceConnection asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.accessibilityservice.IAccessibilityServiceConnection p0) { return false; }
        public static android.accessibilityservice.IAccessibilityServiceConnection getDefaultImpl() { return null; }

        private static class Proxy implements android.accessibilityservice.IAccessibilityServiceConnection {
            private android.os.IBinder mRemote;
            public static android.accessibilityservice.IAccessibilityServiceConnection sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void setServiceInfo(android.accessibilityservice.AccessibilityServiceInfo p0) throws android.os.RemoteException {}
            public java.lang.String[] findAccessibilityNodeInfoByAccessibilityId(int p0, long p1, int p2, android.view.accessibility.IAccessibilityInteractionConnectionCallback p3, int p4, long p5, android.os.Bundle p6) throws android.os.RemoteException { return null; }
            public java.lang.String[] findAccessibilityNodeInfosByText(int p0, long p1, java.lang.String p2, int p3, android.view.accessibility.IAccessibilityInteractionConnectionCallback p4, long p5) throws android.os.RemoteException { return null; }
            public java.lang.String[] findAccessibilityNodeInfosByViewId(int p0, long p1, java.lang.String p2, int p3, android.view.accessibility.IAccessibilityInteractionConnectionCallback p4, long p5) throws android.os.RemoteException { return null; }
            public java.lang.String[] findFocus(int p0, long p1, int p2, int p3, android.view.accessibility.IAccessibilityInteractionConnectionCallback p4, long p5) throws android.os.RemoteException { return null; }
            public java.lang.String[] focusSearch(int p0, long p1, int p2, int p3, android.view.accessibility.IAccessibilityInteractionConnectionCallback p4, long p5) throws android.os.RemoteException { return null; }
            public boolean performAccessibilityAction(int p0, long p1, int p2, android.os.Bundle p3, int p4, android.view.accessibility.IAccessibilityInteractionConnectionCallback p5, long p6) throws android.os.RemoteException { return false; }
            public android.view.accessibility.AccessibilityWindowInfo getWindow(int p0) throws android.os.RemoteException { return null; }
            public android.view.accessibility.AccessibilityWindowInfo.WindowListSparseArray getWindows() throws android.os.RemoteException { return null; }
            public android.accessibilityservice.AccessibilityServiceInfo getServiceInfo() throws android.os.RemoteException { return null; }
            public boolean performGlobalAction(int p0) throws android.os.RemoteException { return false; }
            public java.util.List<android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction> getSystemActions() throws android.os.RemoteException { return null; }
            public void disableSelf() throws android.os.RemoteException {}
            public void setOnKeyEventResult(boolean p0, int p1) throws android.os.RemoteException {}
            public float getMagnificationScale(int p0) throws android.os.RemoteException { return 0.0f; }
            public float getMagnificationCenterX(int p0) throws android.os.RemoteException { return 0.0f; }
            public float getMagnificationCenterY(int p0) throws android.os.RemoteException { return 0.0f; }
            public android.graphics.Region getMagnificationRegion(int p0) throws android.os.RemoteException { return null; }
            public boolean resetMagnification(int p0, boolean p1) throws android.os.RemoteException { return false; }
            public boolean setMagnificationScaleAndCenter(int p0, float p1, float p2, float p3, boolean p4) throws android.os.RemoteException { return false; }
            public void setMagnificationCallbackEnabled(int p0, boolean p1) throws android.os.RemoteException {}
            public boolean setSoftKeyboardShowMode(int p0) throws android.os.RemoteException { return false; }
            public int getSoftKeyboardShowMode() throws android.os.RemoteException { return 0; }
            public void setSoftKeyboardCallbackEnabled(boolean p0) throws android.os.RemoteException {}
            public boolean switchToInputMethod(java.lang.String p0) throws android.os.RemoteException { return false; }
            public boolean isAccessibilityButtonAvailable() throws android.os.RemoteException { return false; }
            public void sendGesture(int p0, android.content.pm.ParceledListSlice p1) throws android.os.RemoteException {}
            public void dispatchGesture(int p0, android.content.pm.ParceledListSlice p1, int p2) throws android.os.RemoteException {}
            public boolean isFingerprintGestureDetectionAvailable() throws android.os.RemoteException { return false; }
            public android.os.IBinder getOverlayWindowToken(int p0) throws android.os.RemoteException { return null; }
            public int getWindowIdForLeashToken(android.os.IBinder p0) throws android.os.RemoteException { return 0; }
            public void takeScreenshot(int p0, android.os.RemoteCallback p1) throws android.os.RemoteException {}
            public void setGestureDetectionPassthroughRegion(int p0, android.graphics.Region p1) throws android.os.RemoteException {}
            public void setTouchExplorationPassthroughRegion(int p0, android.graphics.Region p1) throws android.os.RemoteException {}
            public void setFocusAppearance(int p0, int p1) throws android.os.RemoteException {}
            public void logTrace(long p0, java.lang.String p1, java.lang.String p2, int p3, long p4, int p5, android.os.Bundle p6) throws android.os.RemoteException {}
        }
    }
}
