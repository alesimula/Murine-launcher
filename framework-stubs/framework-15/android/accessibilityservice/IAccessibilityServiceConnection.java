package android.accessibilityservice;

public interface IAccessibilityServiceConnection extends android.os.IInterface {
    @android.annotation.RequiresNoPermission
    public void setServiceInfo(android.accessibilityservice.AccessibilityServiceInfo p0) throws android.os.RemoteException;
    @android.annotation.RequiresNoPermission
    public void setAttributionTag(java.lang.String p0) throws android.os.RemoteException;
    @android.annotation.RequiresNoPermission
    public java.lang.String[] findAccessibilityNodeInfoByAccessibilityId(int p0, long p1, int p2, android.view.accessibility.IAccessibilityInteractionConnectionCallback p3, int p4, long p5, android.os.Bundle p6) throws android.os.RemoteException;
    @android.annotation.RequiresNoPermission
    public java.lang.String[] findAccessibilityNodeInfosByText(int p0, long p1, java.lang.String p2, int p3, android.view.accessibility.IAccessibilityInteractionConnectionCallback p4, long p5) throws android.os.RemoteException;
    @android.annotation.RequiresNoPermission
    public java.lang.String[] findAccessibilityNodeInfosByViewId(int p0, long p1, java.lang.String p2, int p3, android.view.accessibility.IAccessibilityInteractionConnectionCallback p4, long p5) throws android.os.RemoteException;
    @android.annotation.RequiresNoPermission
    public java.lang.String[] findFocus(int p0, long p1, int p2, int p3, android.view.accessibility.IAccessibilityInteractionConnectionCallback p4, long p5) throws android.os.RemoteException;
    @android.annotation.RequiresNoPermission
    public java.lang.String[] focusSearch(int p0, long p1, int p2, int p3, android.view.accessibility.IAccessibilityInteractionConnectionCallback p4, long p5) throws android.os.RemoteException;
    @android.annotation.RequiresNoPermission
    public boolean performAccessibilityAction(int p0, long p1, int p2, android.os.Bundle p3, int p4, android.view.accessibility.IAccessibilityInteractionConnectionCallback p5, long p6) throws android.os.RemoteException;
    @android.annotation.RequiresNoPermission
    public android.view.accessibility.AccessibilityWindowInfo getWindow(int p0) throws android.os.RemoteException;
    @android.annotation.RequiresNoPermission
    public android.view.accessibility.AccessibilityWindowInfo.WindowListSparseArray getWindows() throws android.os.RemoteException;
    @android.annotation.RequiresNoPermission
    public android.accessibilityservice.AccessibilityServiceInfo getServiceInfo() throws android.os.RemoteException;
    @android.annotation.RequiresNoPermission
    public boolean performGlobalAction(int p0) throws android.os.RemoteException;
    @android.annotation.RequiresNoPermission
    public java.util.List<android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction> getSystemActions() throws android.os.RemoteException;
    @android.annotation.RequiresNoPermission
    public void disableSelf() throws android.os.RemoteException;
    @android.annotation.RequiresNoPermission
    public void setOnKeyEventResult(boolean p0, int p1) throws android.os.RemoteException;
    @android.annotation.RequiresNoPermission
    public android.accessibilityservice.MagnificationConfig getMagnificationConfig(int p0) throws android.os.RemoteException;
    @android.annotation.RequiresNoPermission
    public float getMagnificationScale(int p0) throws android.os.RemoteException;
    @android.annotation.RequiresNoPermission
    public float getMagnificationCenterX(int p0) throws android.os.RemoteException;
    @android.annotation.RequiresNoPermission
    public float getMagnificationCenterY(int p0) throws android.os.RemoteException;
    @android.annotation.RequiresNoPermission
    public android.graphics.Region getMagnificationRegion(int p0) throws android.os.RemoteException;
    @android.annotation.RequiresNoPermission
    public android.graphics.Region getCurrentMagnificationRegion(int p0) throws android.os.RemoteException;
    @android.annotation.RequiresNoPermission
    public boolean resetMagnification(int p0, boolean p1) throws android.os.RemoteException;
    @android.annotation.RequiresNoPermission
    public boolean resetCurrentMagnification(int p0, boolean p1) throws android.os.RemoteException;
    @android.annotation.RequiresNoPermission
    public boolean setMagnificationConfig(int p0, android.accessibilityservice.MagnificationConfig p1, boolean p2) throws android.os.RemoteException;
    @android.annotation.RequiresNoPermission
    public void setMagnificationCallbackEnabled(int p0, boolean p1) throws android.os.RemoteException;
    @android.annotation.RequiresNoPermission
    public boolean setSoftKeyboardShowMode(int p0) throws android.os.RemoteException;
    @android.annotation.RequiresNoPermission
    public int getSoftKeyboardShowMode() throws android.os.RemoteException;
    @android.annotation.RequiresNoPermission
    public void setSoftKeyboardCallbackEnabled(boolean p0) throws android.os.RemoteException;
    @android.annotation.RequiresNoPermission
    public boolean switchToInputMethod(java.lang.String p0) throws android.os.RemoteException;
    @android.annotation.RequiresNoPermission
    public int setInputMethodEnabled(java.lang.String p0, boolean p1) throws android.os.RemoteException;
    @android.annotation.RequiresNoPermission
    public boolean isAccessibilityButtonAvailable() throws android.os.RemoteException;
    @android.annotation.RequiresNoPermission
    public void sendGesture(int p0, android.content.pm.ParceledListSlice p1) throws android.os.RemoteException;
    @android.annotation.RequiresNoPermission
    public void dispatchGesture(int p0, android.content.pm.ParceledListSlice p1, int p2) throws android.os.RemoteException;
    @android.annotation.RequiresNoPermission
    public boolean isFingerprintGestureDetectionAvailable() throws android.os.RemoteException;
    @android.annotation.RequiresNoPermission
    public android.os.IBinder getOverlayWindowToken(int p0) throws android.os.RemoteException;
    @android.annotation.RequiresNoPermission
    public int getWindowIdForLeashToken(android.os.IBinder p0) throws android.os.RemoteException;
    @android.annotation.RequiresNoPermission
    public void takeScreenshot(int p0, android.os.RemoteCallback p1) throws android.os.RemoteException;
    @android.annotation.RequiresNoPermission
    public void takeScreenshotOfWindow(int p0, int p1, android.window.ScreenCapture.ScreenCaptureListener p2, android.view.accessibility.IAccessibilityInteractionConnectionCallback p3) throws android.os.RemoteException;
    @android.annotation.RequiresNoPermission
    public void setGestureDetectionPassthroughRegion(int p0, android.graphics.Region p1) throws android.os.RemoteException;
    @android.annotation.RequiresNoPermission
    public void setTouchExplorationPassthroughRegion(int p0, android.graphics.Region p1) throws android.os.RemoteException;
    @android.annotation.RequiresNoPermission
    public void setFocusAppearance(int p0, int p1) throws android.os.RemoteException;
    @android.annotation.RequiresNoPermission
    public void setCacheEnabled(boolean p0) throws android.os.RemoteException;
    @android.annotation.RequiresNoPermission
    public void logTrace(long p0, java.lang.String p1, long p2, java.lang.String p3, int p4, long p5, int p6, android.os.Bundle p7) throws android.os.RemoteException;
    @android.annotation.RequiresNoPermission
    public void setServiceDetectsGesturesEnabled(int p0, boolean p1) throws android.os.RemoteException;
    @android.annotation.RequiresNoPermission
    public void requestTouchExploration(int p0) throws android.os.RemoteException;
    @android.annotation.RequiresNoPermission
    public void requestDragging(int p0, int p1) throws android.os.RemoteException;
    @android.annotation.RequiresNoPermission
    public void requestDelegating(int p0) throws android.os.RemoteException;
    @android.annotation.RequiresNoPermission
    public void onDoubleTap(int p0) throws android.os.RemoteException;
    @android.annotation.RequiresNoPermission
    public void onDoubleTapAndHold(int p0) throws android.os.RemoteException;
    @android.annotation.RequiresNoPermission
    public void setAnimationScale(float p0) throws android.os.RemoteException;
    @android.annotation.RequiresNoPermission
    public void setInstalledAndEnabledServices(java.util.List<android.accessibilityservice.AccessibilityServiceInfo> p0) throws android.os.RemoteException;
    @android.annotation.RequiresNoPermission
    public java.util.List<android.accessibilityservice.AccessibilityServiceInfo> getInstalledAndEnabledServices() throws android.os.RemoteException;
    @android.annotation.RequiresNoPermission
    public void attachAccessibilityOverlayToDisplay(int p0, int p1, android.view.SurfaceControl p2, android.view.accessibility.IAccessibilityInteractionConnectionCallback p3) throws android.os.RemoteException;
    @android.annotation.RequiresNoPermission
    public void attachAccessibilityOverlayToWindow(int p0, int p1, android.view.SurfaceControl p2, android.view.accessibility.IAccessibilityInteractionConnectionCallback p3) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.BLUETOOTH_CONNECT")
    public void connectBluetoothBrailleDisplay(java.lang.String p0, android.accessibilityservice.IBrailleDisplayController p1) throws android.os.RemoteException;
    @android.annotation.RequiresNoPermission
    public void connectUsbBrailleDisplay(android.hardware.usb.UsbDevice p0, android.accessibilityservice.IBrailleDisplayController p1) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.MANAGE_ACCESSIBILITY")
    public void setTestBrailleDisplayData(java.util.List<android.os.Bundle> p0) throws android.os.RemoteException;

    public static class Default implements android.accessibilityservice.IAccessibilityServiceConnection {
        public Default() {}
        public void setServiceInfo(android.accessibilityservice.AccessibilityServiceInfo p0) throws android.os.RemoteException {}
        public void setAttributionTag(java.lang.String p0) throws android.os.RemoteException {}
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
        public android.accessibilityservice.MagnificationConfig getMagnificationConfig(int p0) throws android.os.RemoteException { return null; }
        public float getMagnificationScale(int p0) throws android.os.RemoteException { return 0.0f; }
        public float getMagnificationCenterX(int p0) throws android.os.RemoteException { return 0.0f; }
        public float getMagnificationCenterY(int p0) throws android.os.RemoteException { return 0.0f; }
        public android.graphics.Region getMagnificationRegion(int p0) throws android.os.RemoteException { return null; }
        public android.graphics.Region getCurrentMagnificationRegion(int p0) throws android.os.RemoteException { return null; }
        public boolean resetMagnification(int p0, boolean p1) throws android.os.RemoteException { return false; }
        public boolean resetCurrentMagnification(int p0, boolean p1) throws android.os.RemoteException { return false; }
        public boolean setMagnificationConfig(int p0, android.accessibilityservice.MagnificationConfig p1, boolean p2) throws android.os.RemoteException { return false; }
        public void setMagnificationCallbackEnabled(int p0, boolean p1) throws android.os.RemoteException {}
        public boolean setSoftKeyboardShowMode(int p0) throws android.os.RemoteException { return false; }
        public int getSoftKeyboardShowMode() throws android.os.RemoteException { return 0; }
        public void setSoftKeyboardCallbackEnabled(boolean p0) throws android.os.RemoteException {}
        public boolean switchToInputMethod(java.lang.String p0) throws android.os.RemoteException { return false; }
        public int setInputMethodEnabled(java.lang.String p0, boolean p1) throws android.os.RemoteException { return 0; }
        public boolean isAccessibilityButtonAvailable() throws android.os.RemoteException { return false; }
        public void sendGesture(int p0, android.content.pm.ParceledListSlice p1) throws android.os.RemoteException {}
        public void dispatchGesture(int p0, android.content.pm.ParceledListSlice p1, int p2) throws android.os.RemoteException {}
        public boolean isFingerprintGestureDetectionAvailable() throws android.os.RemoteException { return false; }
        public android.os.IBinder getOverlayWindowToken(int p0) throws android.os.RemoteException { return null; }
        public int getWindowIdForLeashToken(android.os.IBinder p0) throws android.os.RemoteException { return 0; }
        public void takeScreenshot(int p0, android.os.RemoteCallback p1) throws android.os.RemoteException {}
        public void takeScreenshotOfWindow(int p0, int p1, android.window.ScreenCapture.ScreenCaptureListener p2, android.view.accessibility.IAccessibilityInteractionConnectionCallback p3) throws android.os.RemoteException {}
        public void setGestureDetectionPassthroughRegion(int p0, android.graphics.Region p1) throws android.os.RemoteException {}
        public void setTouchExplorationPassthroughRegion(int p0, android.graphics.Region p1) throws android.os.RemoteException {}
        public void setFocusAppearance(int p0, int p1) throws android.os.RemoteException {}
        public void setCacheEnabled(boolean p0) throws android.os.RemoteException {}
        public void logTrace(long p0, java.lang.String p1, long p2, java.lang.String p3, int p4, long p5, int p6, android.os.Bundle p7) throws android.os.RemoteException {}
        public void setServiceDetectsGesturesEnabled(int p0, boolean p1) throws android.os.RemoteException {}
        public void requestTouchExploration(int p0) throws android.os.RemoteException {}
        public void requestDragging(int p0, int p1) throws android.os.RemoteException {}
        public void requestDelegating(int p0) throws android.os.RemoteException {}
        public void onDoubleTap(int p0) throws android.os.RemoteException {}
        public void onDoubleTapAndHold(int p0) throws android.os.RemoteException {}
        public void setAnimationScale(float p0) throws android.os.RemoteException {}
        public void setInstalledAndEnabledServices(java.util.List<android.accessibilityservice.AccessibilityServiceInfo> p0) throws android.os.RemoteException {}
        public java.util.List<android.accessibilityservice.AccessibilityServiceInfo> getInstalledAndEnabledServices() throws android.os.RemoteException { return null; }
        public void attachAccessibilityOverlayToDisplay(int p0, int p1, android.view.SurfaceControl p2, android.view.accessibility.IAccessibilityInteractionConnectionCallback p3) throws android.os.RemoteException {}
        public void attachAccessibilityOverlayToWindow(int p0, int p1, android.view.SurfaceControl p2, android.view.accessibility.IAccessibilityInteractionConnectionCallback p3) throws android.os.RemoteException {}
        public void connectBluetoothBrailleDisplay(java.lang.String p0, android.accessibilityservice.IBrailleDisplayController p1) throws android.os.RemoteException {}
        public void connectUsbBrailleDisplay(android.hardware.usb.UsbDevice p0, android.accessibilityservice.IBrailleDisplayController p1) throws android.os.RemoteException {}
        public void setTestBrailleDisplayData(java.util.List<android.os.Bundle> p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.accessibilityservice.IAccessibilityServiceConnection {
        public static final java.lang.String DESCRIPTOR = "android.accessibilityservice.IAccessibilityServiceConnection";
        static final int TRANSACTION_setServiceInfo = 1;
        static final int TRANSACTION_setAttributionTag = 2;
        static final int TRANSACTION_findAccessibilityNodeInfoByAccessibilityId = 3;
        static final int TRANSACTION_findAccessibilityNodeInfosByText = 4;
        static final int TRANSACTION_findAccessibilityNodeInfosByViewId = 5;
        static final int TRANSACTION_findFocus = 6;
        static final int TRANSACTION_focusSearch = 7;
        static final int TRANSACTION_performAccessibilityAction = 8;
        static final int TRANSACTION_getWindow = 9;
        static final int TRANSACTION_getWindows = 10;
        static final int TRANSACTION_getServiceInfo = 11;
        static final int TRANSACTION_performGlobalAction = 12;
        static final int TRANSACTION_getSystemActions = 13;
        static final int TRANSACTION_disableSelf = 14;
        static final int TRANSACTION_setOnKeyEventResult = 15;
        static final int TRANSACTION_getMagnificationConfig = 16;
        static final int TRANSACTION_getMagnificationScale = 17;
        static final int TRANSACTION_getMagnificationCenterX = 18;
        static final int TRANSACTION_getMagnificationCenterY = 19;
        static final int TRANSACTION_getMagnificationRegion = 20;
        static final int TRANSACTION_getCurrentMagnificationRegion = 21;
        static final int TRANSACTION_resetMagnification = 22;
        static final int TRANSACTION_resetCurrentMagnification = 23;
        static final int TRANSACTION_setMagnificationConfig = 24;
        static final int TRANSACTION_setMagnificationCallbackEnabled = 25;
        static final int TRANSACTION_setSoftKeyboardShowMode = 26;
        static final int TRANSACTION_getSoftKeyboardShowMode = 27;
        static final int TRANSACTION_setSoftKeyboardCallbackEnabled = 28;
        static final int TRANSACTION_switchToInputMethod = 29;
        static final int TRANSACTION_setInputMethodEnabled = 30;
        static final int TRANSACTION_isAccessibilityButtonAvailable = 31;
        static final int TRANSACTION_sendGesture = 32;
        static final int TRANSACTION_dispatchGesture = 33;
        static final int TRANSACTION_isFingerprintGestureDetectionAvailable = 34;
        static final int TRANSACTION_getOverlayWindowToken = 35;
        static final int TRANSACTION_getWindowIdForLeashToken = 36;
        static final int TRANSACTION_takeScreenshot = 37;
        static final int TRANSACTION_takeScreenshotOfWindow = 38;
        static final int TRANSACTION_setGestureDetectionPassthroughRegion = 39;
        static final int TRANSACTION_setTouchExplorationPassthroughRegion = 40;
        static final int TRANSACTION_setFocusAppearance = 41;
        static final int TRANSACTION_setCacheEnabled = 42;
        static final int TRANSACTION_logTrace = 43;
        static final int TRANSACTION_setServiceDetectsGesturesEnabled = 44;
        static final int TRANSACTION_requestTouchExploration = 45;
        static final int TRANSACTION_requestDragging = 46;
        static final int TRANSACTION_requestDelegating = 47;
        static final int TRANSACTION_onDoubleTap = 48;
        static final int TRANSACTION_onDoubleTapAndHold = 49;
        static final int TRANSACTION_setAnimationScale = 50;
        static final int TRANSACTION_setInstalledAndEnabledServices = 51;
        static final int TRANSACTION_getInstalledAndEnabledServices = 52;
        static final int TRANSACTION_attachAccessibilityOverlayToDisplay = 53;
        static final int TRANSACTION_attachAccessibilityOverlayToWindow = 54;
        static final int TRANSACTION_connectBluetoothBrailleDisplay = 55;
        static final int TRANSACTION_connectUsbBrailleDisplay = 56;
        static final int TRANSACTION_setTestBrailleDisplayData = 57;
        public Stub(android.os.PermissionEnforcer p0) { super(); }
        @java.lang.Deprecated
        public Stub() { super(); }
        public static android.accessibilityservice.IAccessibilityServiceConnection asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        protected void connectBluetoothBrailleDisplay_enforcePermission() throws java.lang.SecurityException {}
        protected void setTestBrailleDisplayData_enforcePermission() throws java.lang.SecurityException {}
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.accessibilityservice.IAccessibilityServiceConnection {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void setServiceInfo(android.accessibilityservice.AccessibilityServiceInfo p0) throws android.os.RemoteException {}
            public void setAttributionTag(java.lang.String p0) throws android.os.RemoteException {}
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
            public android.accessibilityservice.MagnificationConfig getMagnificationConfig(int p0) throws android.os.RemoteException { return null; }
            public float getMagnificationScale(int p0) throws android.os.RemoteException { return 0.0f; }
            public float getMagnificationCenterX(int p0) throws android.os.RemoteException { return 0.0f; }
            public float getMagnificationCenterY(int p0) throws android.os.RemoteException { return 0.0f; }
            public android.graphics.Region getMagnificationRegion(int p0) throws android.os.RemoteException { return null; }
            public android.graphics.Region getCurrentMagnificationRegion(int p0) throws android.os.RemoteException { return null; }
            public boolean resetMagnification(int p0, boolean p1) throws android.os.RemoteException { return false; }
            public boolean resetCurrentMagnification(int p0, boolean p1) throws android.os.RemoteException { return false; }
            public boolean setMagnificationConfig(int p0, android.accessibilityservice.MagnificationConfig p1, boolean p2) throws android.os.RemoteException { return false; }
            public void setMagnificationCallbackEnabled(int p0, boolean p1) throws android.os.RemoteException {}
            public boolean setSoftKeyboardShowMode(int p0) throws android.os.RemoteException { return false; }
            public int getSoftKeyboardShowMode() throws android.os.RemoteException { return 0; }
            public void setSoftKeyboardCallbackEnabled(boolean p0) throws android.os.RemoteException {}
            public boolean switchToInputMethod(java.lang.String p0) throws android.os.RemoteException { return false; }
            public int setInputMethodEnabled(java.lang.String p0, boolean p1) throws android.os.RemoteException { return 0; }
            public boolean isAccessibilityButtonAvailable() throws android.os.RemoteException { return false; }
            public void sendGesture(int p0, android.content.pm.ParceledListSlice p1) throws android.os.RemoteException {}
            public void dispatchGesture(int p0, android.content.pm.ParceledListSlice p1, int p2) throws android.os.RemoteException {}
            public boolean isFingerprintGestureDetectionAvailable() throws android.os.RemoteException { return false; }
            public android.os.IBinder getOverlayWindowToken(int p0) throws android.os.RemoteException { return null; }
            public int getWindowIdForLeashToken(android.os.IBinder p0) throws android.os.RemoteException { return 0; }
            public void takeScreenshot(int p0, android.os.RemoteCallback p1) throws android.os.RemoteException {}
            public void takeScreenshotOfWindow(int p0, int p1, android.window.ScreenCapture.ScreenCaptureListener p2, android.view.accessibility.IAccessibilityInteractionConnectionCallback p3) throws android.os.RemoteException {}
            public void setGestureDetectionPassthroughRegion(int p0, android.graphics.Region p1) throws android.os.RemoteException {}
            public void setTouchExplorationPassthroughRegion(int p0, android.graphics.Region p1) throws android.os.RemoteException {}
            public void setFocusAppearance(int p0, int p1) throws android.os.RemoteException {}
            public void setCacheEnabled(boolean p0) throws android.os.RemoteException {}
            public void logTrace(long p0, java.lang.String p1, long p2, java.lang.String p3, int p4, long p5, int p6, android.os.Bundle p7) throws android.os.RemoteException {}
            public void setServiceDetectsGesturesEnabled(int p0, boolean p1) throws android.os.RemoteException {}
            public void requestTouchExploration(int p0) throws android.os.RemoteException {}
            public void requestDragging(int p0, int p1) throws android.os.RemoteException {}
            public void requestDelegating(int p0) throws android.os.RemoteException {}
            public void onDoubleTap(int p0) throws android.os.RemoteException {}
            public void onDoubleTapAndHold(int p0) throws android.os.RemoteException {}
            public void setAnimationScale(float p0) throws android.os.RemoteException {}
            public void setInstalledAndEnabledServices(java.util.List<android.accessibilityservice.AccessibilityServiceInfo> p0) throws android.os.RemoteException {}
            public java.util.List<android.accessibilityservice.AccessibilityServiceInfo> getInstalledAndEnabledServices() throws android.os.RemoteException { return null; }
            public void attachAccessibilityOverlayToDisplay(int p0, int p1, android.view.SurfaceControl p2, android.view.accessibility.IAccessibilityInteractionConnectionCallback p3) throws android.os.RemoteException {}
            public void attachAccessibilityOverlayToWindow(int p0, int p1, android.view.SurfaceControl p2, android.view.accessibility.IAccessibilityInteractionConnectionCallback p3) throws android.os.RemoteException {}
            public void connectBluetoothBrailleDisplay(java.lang.String p0, android.accessibilityservice.IBrailleDisplayController p1) throws android.os.RemoteException {}
            public void connectUsbBrailleDisplay(android.hardware.usb.UsbDevice p0, android.accessibilityservice.IBrailleDisplayController p1) throws android.os.RemoteException {}
            public void setTestBrailleDisplayData(java.util.List<android.os.Bundle> p0) throws android.os.RemoteException {}
        }
    }
}
