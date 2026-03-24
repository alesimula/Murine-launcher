package android.view;

public interface IScrollCaptureController extends android.os.IInterface {
    public void onClientConnected(android.view.IScrollCaptureClient p0, android.graphics.Rect p1, android.graphics.Point p2) throws android.os.RemoteException;
    public void onClientUnavailable() throws android.os.RemoteException;
    public void onCaptureStarted() throws android.os.RemoteException;
    public void onCaptureBufferSent(long p0, android.graphics.Rect p1) throws android.os.RemoteException;
    public void onConnectionClosed() throws android.os.RemoteException;

    public static class Default implements android.view.IScrollCaptureController {
        public Default() {}
        public void onClientConnected(android.view.IScrollCaptureClient p0, android.graphics.Rect p1, android.graphics.Point p2) throws android.os.RemoteException {}
        public void onClientUnavailable() throws android.os.RemoteException {}
        public void onCaptureStarted() throws android.os.RemoteException {}
        public void onCaptureBufferSent(long p0, android.graphics.Rect p1) throws android.os.RemoteException {}
        public void onConnectionClosed() throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.view.IScrollCaptureController {
        private static final java.lang.String DESCRIPTOR = "android.view.IScrollCaptureController";
        static final int TRANSACTION_onClientConnected = 1;
        static final int TRANSACTION_onClientUnavailable = 2;
        static final int TRANSACTION_onCaptureStarted = 3;
        static final int TRANSACTION_onCaptureBufferSent = 4;
        static final int TRANSACTION_onConnectionClosed = 5;
        public Stub() { super(); }
        public static android.view.IScrollCaptureController asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.view.IScrollCaptureController p0) { return false; }
        public static android.view.IScrollCaptureController getDefaultImpl() { return null; }

        private static class Proxy implements android.view.IScrollCaptureController {
            private android.os.IBinder mRemote;
            public static android.view.IScrollCaptureController sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onClientConnected(android.view.IScrollCaptureClient p0, android.graphics.Rect p1, android.graphics.Point p2) throws android.os.RemoteException {}
            public void onClientUnavailable() throws android.os.RemoteException {}
            public void onCaptureStarted() throws android.os.RemoteException {}
            public void onCaptureBufferSent(long p0, android.graphics.Rect p1) throws android.os.RemoteException {}
            public void onConnectionClosed() throws android.os.RemoteException {}
        }
    }
}
