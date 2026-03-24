package android.view.accessibility;

public interface IAccessibilityInteractionConnectionCallback extends android.os.IInterface {
    public void setFindAccessibilityNodeInfoResult(android.view.accessibility.AccessibilityNodeInfo p0, int p1) throws android.os.RemoteException;
    public void setFindAccessibilityNodeInfosResult(java.util.List<android.view.accessibility.AccessibilityNodeInfo> p0, int p1) throws android.os.RemoteException;
    public void setPrefetchAccessibilityNodeInfoResult(java.util.List<android.view.accessibility.AccessibilityNodeInfo> p0, int p1) throws android.os.RemoteException;
    public void setPerformAccessibilityActionResult(boolean p0, int p1) throws android.os.RemoteException;

    public static class Default implements android.view.accessibility.IAccessibilityInteractionConnectionCallback {
        public Default() {}
        public void setFindAccessibilityNodeInfoResult(android.view.accessibility.AccessibilityNodeInfo p0, int p1) throws android.os.RemoteException {}
        public void setFindAccessibilityNodeInfosResult(java.util.List<android.view.accessibility.AccessibilityNodeInfo> p0, int p1) throws android.os.RemoteException {}
        public void setPrefetchAccessibilityNodeInfoResult(java.util.List<android.view.accessibility.AccessibilityNodeInfo> p0, int p1) throws android.os.RemoteException {}
        public void setPerformAccessibilityActionResult(boolean p0, int p1) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.view.accessibility.IAccessibilityInteractionConnectionCallback {
        public static final java.lang.String DESCRIPTOR = "android.view.accessibility.IAccessibilityInteractionConnectionCallback";
        static final int TRANSACTION_setFindAccessibilityNodeInfoResult = 1;
        static final int TRANSACTION_setFindAccessibilityNodeInfosResult = 2;
        static final int TRANSACTION_setPrefetchAccessibilityNodeInfoResult = 3;
        static final int TRANSACTION_setPerformAccessibilityActionResult = 4;
        public Stub() { super(); }
        public static android.view.accessibility.IAccessibilityInteractionConnectionCallback asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.view.accessibility.IAccessibilityInteractionConnectionCallback p0) { return false; }
        public static android.view.accessibility.IAccessibilityInteractionConnectionCallback getDefaultImpl() { return null; }

        private static class Proxy implements android.view.accessibility.IAccessibilityInteractionConnectionCallback {
            private android.os.IBinder mRemote;
            public static android.view.accessibility.IAccessibilityInteractionConnectionCallback sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void setFindAccessibilityNodeInfoResult(android.view.accessibility.AccessibilityNodeInfo p0, int p1) throws android.os.RemoteException {}
            public void setFindAccessibilityNodeInfosResult(java.util.List<android.view.accessibility.AccessibilityNodeInfo> p0, int p1) throws android.os.RemoteException {}
            public void setPrefetchAccessibilityNodeInfoResult(java.util.List<android.view.accessibility.AccessibilityNodeInfo> p0, int p1) throws android.os.RemoteException {}
            public void setPerformAccessibilityActionResult(boolean p0, int p1) throws android.os.RemoteException {}
        }
    }
}
