package android.view.accessibility;

public interface IAccessibilityInteractionConnection extends android.os.IInterface {
    public void findAccessibilityNodeInfoByAccessibilityId(long p0, android.graphics.Region p1, int p2, android.view.accessibility.IAccessibilityInteractionConnectionCallback p3, int p4, int p5, long p6, android.view.MagnificationSpec p7, android.os.Bundle p8) throws android.os.RemoteException;
    public void findAccessibilityNodeInfosByViewId(long p0, java.lang.String p1, android.graphics.Region p2, int p3, android.view.accessibility.IAccessibilityInteractionConnectionCallback p4, int p5, int p6, long p7, android.view.MagnificationSpec p8) throws android.os.RemoteException;
    public void findAccessibilityNodeInfosByText(long p0, java.lang.String p1, android.graphics.Region p2, int p3, android.view.accessibility.IAccessibilityInteractionConnectionCallback p4, int p5, int p6, long p7, android.view.MagnificationSpec p8) throws android.os.RemoteException;
    public void findFocus(long p0, int p1, android.graphics.Region p2, int p3, android.view.accessibility.IAccessibilityInteractionConnectionCallback p4, int p5, int p6, long p7, android.view.MagnificationSpec p8) throws android.os.RemoteException;
    public void focusSearch(long p0, int p1, android.graphics.Region p2, int p3, android.view.accessibility.IAccessibilityInteractionConnectionCallback p4, int p5, int p6, long p7, android.view.MagnificationSpec p8) throws android.os.RemoteException;
    public void performAccessibilityAction(long p0, int p1, android.os.Bundle p2, int p3, android.view.accessibility.IAccessibilityInteractionConnectionCallback p4, int p5, int p6, long p7) throws android.os.RemoteException;
    public void clearAccessibilityFocus() throws android.os.RemoteException;
    public void notifyOutsideTouch() throws android.os.RemoteException;

    public static class Default implements android.view.accessibility.IAccessibilityInteractionConnection {
        public Default() {}
        public void findAccessibilityNodeInfoByAccessibilityId(long p0, android.graphics.Region p1, int p2, android.view.accessibility.IAccessibilityInteractionConnectionCallback p3, int p4, int p5, long p6, android.view.MagnificationSpec p7, android.os.Bundle p8) throws android.os.RemoteException {}
        public void findAccessibilityNodeInfosByViewId(long p0, java.lang.String p1, android.graphics.Region p2, int p3, android.view.accessibility.IAccessibilityInteractionConnectionCallback p4, int p5, int p6, long p7, android.view.MagnificationSpec p8) throws android.os.RemoteException {}
        public void findAccessibilityNodeInfosByText(long p0, java.lang.String p1, android.graphics.Region p2, int p3, android.view.accessibility.IAccessibilityInteractionConnectionCallback p4, int p5, int p6, long p7, android.view.MagnificationSpec p8) throws android.os.RemoteException {}
        public void findFocus(long p0, int p1, android.graphics.Region p2, int p3, android.view.accessibility.IAccessibilityInteractionConnectionCallback p4, int p5, int p6, long p7, android.view.MagnificationSpec p8) throws android.os.RemoteException {}
        public void focusSearch(long p0, int p1, android.graphics.Region p2, int p3, android.view.accessibility.IAccessibilityInteractionConnectionCallback p4, int p5, int p6, long p7, android.view.MagnificationSpec p8) throws android.os.RemoteException {}
        public void performAccessibilityAction(long p0, int p1, android.os.Bundle p2, int p3, android.view.accessibility.IAccessibilityInteractionConnectionCallback p4, int p5, int p6, long p7) throws android.os.RemoteException {}
        public void clearAccessibilityFocus() throws android.os.RemoteException {}
        public void notifyOutsideTouch() throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.view.accessibility.IAccessibilityInteractionConnection {
        public static final java.lang.String DESCRIPTOR = "android.view.accessibility.IAccessibilityInteractionConnection";
        static final int TRANSACTION_findAccessibilityNodeInfoByAccessibilityId = 1;
        static final int TRANSACTION_findAccessibilityNodeInfosByViewId = 2;
        static final int TRANSACTION_findAccessibilityNodeInfosByText = 3;
        static final int TRANSACTION_findFocus = 4;
        static final int TRANSACTION_focusSearch = 5;
        static final int TRANSACTION_performAccessibilityAction = 6;
        static final int TRANSACTION_clearAccessibilityFocus = 7;
        static final int TRANSACTION_notifyOutsideTouch = 8;
        public Stub() { super(); }
        public static android.view.accessibility.IAccessibilityInteractionConnection asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.view.accessibility.IAccessibilityInteractionConnection p0) { return false; }
        public static android.view.accessibility.IAccessibilityInteractionConnection getDefaultImpl() { return null; }

        private static class Proxy implements android.view.accessibility.IAccessibilityInteractionConnection {
            private android.os.IBinder mRemote;
            public static android.view.accessibility.IAccessibilityInteractionConnection sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void findAccessibilityNodeInfoByAccessibilityId(long p0, android.graphics.Region p1, int p2, android.view.accessibility.IAccessibilityInteractionConnectionCallback p3, int p4, int p5, long p6, android.view.MagnificationSpec p7, android.os.Bundle p8) throws android.os.RemoteException {}
            public void findAccessibilityNodeInfosByViewId(long p0, java.lang.String p1, android.graphics.Region p2, int p3, android.view.accessibility.IAccessibilityInteractionConnectionCallback p4, int p5, int p6, long p7, android.view.MagnificationSpec p8) throws android.os.RemoteException {}
            public void findAccessibilityNodeInfosByText(long p0, java.lang.String p1, android.graphics.Region p2, int p3, android.view.accessibility.IAccessibilityInteractionConnectionCallback p4, int p5, int p6, long p7, android.view.MagnificationSpec p8) throws android.os.RemoteException {}
            public void findFocus(long p0, int p1, android.graphics.Region p2, int p3, android.view.accessibility.IAccessibilityInteractionConnectionCallback p4, int p5, int p6, long p7, android.view.MagnificationSpec p8) throws android.os.RemoteException {}
            public void focusSearch(long p0, int p1, android.graphics.Region p2, int p3, android.view.accessibility.IAccessibilityInteractionConnectionCallback p4, int p5, int p6, long p7, android.view.MagnificationSpec p8) throws android.os.RemoteException {}
            public void performAccessibilityAction(long p0, int p1, android.os.Bundle p2, int p3, android.view.accessibility.IAccessibilityInteractionConnectionCallback p4, int p5, int p6, long p7) throws android.os.RemoteException {}
            public void clearAccessibilityFocus() throws android.os.RemoteException {}
            public void notifyOutsideTouch() throws android.os.RemoteException {}
        }
    }
}
