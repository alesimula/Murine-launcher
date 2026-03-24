package android.accessibilityservice;

public interface IAccessibilityServiceClient extends android.os.IInterface {
    public void init(android.accessibilityservice.IAccessibilityServiceConnection p0, int p1, android.os.IBinder p2) throws android.os.RemoteException;
    public void onAccessibilityEvent(android.view.accessibility.AccessibilityEvent p0, boolean p1) throws android.os.RemoteException;
    public void onInterrupt() throws android.os.RemoteException;
    public void onGesture(android.accessibilityservice.AccessibilityGestureEvent p0) throws android.os.RemoteException;
    public void clearAccessibilityCache() throws android.os.RemoteException;
    public void onKeyEvent(android.view.KeyEvent p0, int p1) throws android.os.RemoteException;
    public void onMagnificationChanged(int p0, android.graphics.Region p1, float p2, float p3, float p4) throws android.os.RemoteException;
    public void onSoftKeyboardShowModeChanged(int p0) throws android.os.RemoteException;
    public void onPerformGestureResult(int p0, boolean p1) throws android.os.RemoteException;
    public void onFingerprintCapturingGesturesChanged(boolean p0) throws android.os.RemoteException;
    public void onFingerprintGesture(int p0) throws android.os.RemoteException;
    public void onAccessibilityButtonClicked(int p0) throws android.os.RemoteException;
    public void onAccessibilityButtonAvailabilityChanged(boolean p0) throws android.os.RemoteException;
    public void onSystemActionsChanged() throws android.os.RemoteException;

    public static class Default implements android.accessibilityservice.IAccessibilityServiceClient {
        public Default() {}
        public void init(android.accessibilityservice.IAccessibilityServiceConnection p0, int p1, android.os.IBinder p2) throws android.os.RemoteException {}
        public void onAccessibilityEvent(android.view.accessibility.AccessibilityEvent p0, boolean p1) throws android.os.RemoteException {}
        public void onInterrupt() throws android.os.RemoteException {}
        public void onGesture(android.accessibilityservice.AccessibilityGestureEvent p0) throws android.os.RemoteException {}
        public void clearAccessibilityCache() throws android.os.RemoteException {}
        public void onKeyEvent(android.view.KeyEvent p0, int p1) throws android.os.RemoteException {}
        public void onMagnificationChanged(int p0, android.graphics.Region p1, float p2, float p3, float p4) throws android.os.RemoteException {}
        public void onSoftKeyboardShowModeChanged(int p0) throws android.os.RemoteException {}
        public void onPerformGestureResult(int p0, boolean p1) throws android.os.RemoteException {}
        public void onFingerprintCapturingGesturesChanged(boolean p0) throws android.os.RemoteException {}
        public void onFingerprintGesture(int p0) throws android.os.RemoteException {}
        public void onAccessibilityButtonClicked(int p0) throws android.os.RemoteException {}
        public void onAccessibilityButtonAvailabilityChanged(boolean p0) throws android.os.RemoteException {}
        public void onSystemActionsChanged() throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.accessibilityservice.IAccessibilityServiceClient {
        private static final java.lang.String DESCRIPTOR = "android.accessibilityservice.IAccessibilityServiceClient";
        static final int TRANSACTION_init = 1;
        static final int TRANSACTION_onAccessibilityEvent = 2;
        static final int TRANSACTION_onInterrupt = 3;
        static final int TRANSACTION_onGesture = 4;
        static final int TRANSACTION_clearAccessibilityCache = 5;
        static final int TRANSACTION_onKeyEvent = 6;
        static final int TRANSACTION_onMagnificationChanged = 7;
        static final int TRANSACTION_onSoftKeyboardShowModeChanged = 8;
        static final int TRANSACTION_onPerformGestureResult = 9;
        static final int TRANSACTION_onFingerprintCapturingGesturesChanged = 10;
        static final int TRANSACTION_onFingerprintGesture = 11;
        static final int TRANSACTION_onAccessibilityButtonClicked = 12;
        static final int TRANSACTION_onAccessibilityButtonAvailabilityChanged = 13;
        static final int TRANSACTION_onSystemActionsChanged = 14;
        public Stub() { super(); }
        public static android.accessibilityservice.IAccessibilityServiceClient asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.accessibilityservice.IAccessibilityServiceClient p0) { return false; }
        public static android.accessibilityservice.IAccessibilityServiceClient getDefaultImpl() { return null; }

        private static class Proxy implements android.accessibilityservice.IAccessibilityServiceClient {
            private android.os.IBinder mRemote;
            public static android.accessibilityservice.IAccessibilityServiceClient sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void init(android.accessibilityservice.IAccessibilityServiceConnection p0, int p1, android.os.IBinder p2) throws android.os.RemoteException {}
            public void onAccessibilityEvent(android.view.accessibility.AccessibilityEvent p0, boolean p1) throws android.os.RemoteException {}
            public void onInterrupt() throws android.os.RemoteException {}
            public void onGesture(android.accessibilityservice.AccessibilityGestureEvent p0) throws android.os.RemoteException {}
            public void clearAccessibilityCache() throws android.os.RemoteException {}
            public void onKeyEvent(android.view.KeyEvent p0, int p1) throws android.os.RemoteException {}
            public void onMagnificationChanged(int p0, android.graphics.Region p1, float p2, float p3, float p4) throws android.os.RemoteException {}
            public void onSoftKeyboardShowModeChanged(int p0) throws android.os.RemoteException {}
            public void onPerformGestureResult(int p0, boolean p1) throws android.os.RemoteException {}
            public void onFingerprintCapturingGesturesChanged(boolean p0) throws android.os.RemoteException {}
            public void onFingerprintGesture(int p0) throws android.os.RemoteException {}
            public void onAccessibilityButtonClicked(int p0) throws android.os.RemoteException {}
            public void onAccessibilityButtonAvailabilityChanged(boolean p0) throws android.os.RemoteException {}
            public void onSystemActionsChanged() throws android.os.RemoteException {}
        }
    }
}
