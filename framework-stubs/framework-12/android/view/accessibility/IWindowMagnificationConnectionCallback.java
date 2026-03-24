package android.view.accessibility;

public interface IWindowMagnificationConnectionCallback extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.view.accessibility.IWindowMagnificationConnectionCallback";
    public void onWindowMagnifierBoundsChanged(int p0, android.graphics.Rect p1) throws android.os.RemoteException;
    public void onChangeMagnificationMode(int p0, int p1) throws android.os.RemoteException;
    public void onSourceBoundsChanged(int p0, android.graphics.Rect p1) throws android.os.RemoteException;
    public void onPerformScaleAction(int p0, float p1) throws android.os.RemoteException;
    public void onAccessibilityActionPerformed(int p0) throws android.os.RemoteException;

    public static class Default implements android.view.accessibility.IWindowMagnificationConnectionCallback {
        public Default() {}
        public void onWindowMagnifierBoundsChanged(int p0, android.graphics.Rect p1) throws android.os.RemoteException {}
        public void onChangeMagnificationMode(int p0, int p1) throws android.os.RemoteException {}
        public void onSourceBoundsChanged(int p0, android.graphics.Rect p1) throws android.os.RemoteException {}
        public void onPerformScaleAction(int p0, float p1) throws android.os.RemoteException {}
        public void onAccessibilityActionPerformed(int p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.view.accessibility.IWindowMagnificationConnectionCallback {
        static final int TRANSACTION_onWindowMagnifierBoundsChanged = 1;
        static final int TRANSACTION_onChangeMagnificationMode = 2;
        static final int TRANSACTION_onSourceBoundsChanged = 3;
        static final int TRANSACTION_onPerformScaleAction = 4;
        static final int TRANSACTION_onAccessibilityActionPerformed = 5;
        public Stub() { super(); }
        public static android.view.accessibility.IWindowMagnificationConnectionCallback asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.view.accessibility.IWindowMagnificationConnectionCallback p0) { return false; }
        public static android.view.accessibility.IWindowMagnificationConnectionCallback getDefaultImpl() { return null; }

        private static class Proxy implements android.view.accessibility.IWindowMagnificationConnectionCallback {
            private android.os.IBinder mRemote;
            public static android.view.accessibility.IWindowMagnificationConnectionCallback sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onWindowMagnifierBoundsChanged(int p0, android.graphics.Rect p1) throws android.os.RemoteException {}
            public void onChangeMagnificationMode(int p0, int p1) throws android.os.RemoteException {}
            public void onSourceBoundsChanged(int p0, android.graphics.Rect p1) throws android.os.RemoteException {}
            public void onPerformScaleAction(int p0, float p1) throws android.os.RemoteException {}
            public void onAccessibilityActionPerformed(int p0) throws android.os.RemoteException {}
        }
    }
}
