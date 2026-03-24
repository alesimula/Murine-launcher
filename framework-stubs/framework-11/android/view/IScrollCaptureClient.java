package android.view;

public interface IScrollCaptureClient extends android.os.IInterface {
    public void startCapture(android.view.Surface p0) throws android.os.RemoteException;
    public void requestImage(android.graphics.Rect p0) throws android.os.RemoteException;
    public void endCapture() throws android.os.RemoteException;

    public static class Default implements android.view.IScrollCaptureClient {
        public Default() {}
        public void startCapture(android.view.Surface p0) throws android.os.RemoteException {}
        public void requestImage(android.graphics.Rect p0) throws android.os.RemoteException {}
        public void endCapture() throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.view.IScrollCaptureClient {
        private static final java.lang.String DESCRIPTOR = "android.view.IScrollCaptureClient";
        static final int TRANSACTION_startCapture = 1;
        static final int TRANSACTION_requestImage = 2;
        static final int TRANSACTION_endCapture = 3;
        public Stub() { super(); }
        public static android.view.IScrollCaptureClient asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.view.IScrollCaptureClient p0) { return false; }
        public static android.view.IScrollCaptureClient getDefaultImpl() { return null; }

        private static class Proxy implements android.view.IScrollCaptureClient {
            private android.os.IBinder mRemote;
            public static android.view.IScrollCaptureClient sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void startCapture(android.view.Surface p0) throws android.os.RemoteException {}
            public void requestImage(android.graphics.Rect p0) throws android.os.RemoteException {}
            public void endCapture() throws android.os.RemoteException {}
        }
    }
}
