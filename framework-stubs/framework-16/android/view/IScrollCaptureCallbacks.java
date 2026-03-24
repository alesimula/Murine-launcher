package android.view;

public interface IScrollCaptureCallbacks extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.view.IScrollCaptureCallbacks";
    public void onCaptureStarted() throws android.os.RemoteException;
    public void onImageRequestCompleted(int p0, android.graphics.Rect p1) throws android.os.RemoteException;
    public void onCaptureEnded() throws android.os.RemoteException;

    public static class Default implements android.view.IScrollCaptureCallbacks {
        public Default() {}
        public void onCaptureStarted() throws android.os.RemoteException {}
        public void onImageRequestCompleted(int p0, android.graphics.Rect p1) throws android.os.RemoteException {}
        public void onCaptureEnded() throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.view.IScrollCaptureCallbacks {
        static final int TRANSACTION_onCaptureStarted = 1;
        static final int TRANSACTION_onImageRequestCompleted = 2;
        static final int TRANSACTION_onCaptureEnded = 3;
        public Stub() { super(); }
        public static android.view.IScrollCaptureCallbacks asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.view.IScrollCaptureCallbacks {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onCaptureStarted() throws android.os.RemoteException {}
            public void onImageRequestCompleted(int p0, android.graphics.Rect p1) throws android.os.RemoteException {}
            public void onCaptureEnded() throws android.os.RemoteException {}
        }
    }
}
