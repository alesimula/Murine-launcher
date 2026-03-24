package android.companion.virtual.camera;

public interface IVirtualCameraCallback extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.companion.virtual.camera.IVirtualCameraCallback";
    public void onStreamConfigured(int p0, android.view.Surface p1, int p2, int p3, int p4) throws android.os.RemoteException;
    public void onProcessCaptureRequest(int p0, long p1) throws android.os.RemoteException;
    public void onStreamClosed(int p0) throws android.os.RemoteException;

    public static class Default implements android.companion.virtual.camera.IVirtualCameraCallback {
        public Default() {}
        public void onStreamConfigured(int p0, android.view.Surface p1, int p2, int p3, int p4) throws android.os.RemoteException {}
        public void onProcessCaptureRequest(int p0, long p1) throws android.os.RemoteException {}
        public void onStreamClosed(int p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.companion.virtual.camera.IVirtualCameraCallback {
        static final int TRANSACTION_onStreamConfigured = 1;
        static final int TRANSACTION_onProcessCaptureRequest = 2;
        static final int TRANSACTION_onStreamClosed = 3;
        public Stub() { super(); }
        public static android.companion.virtual.camera.IVirtualCameraCallback asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.companion.virtual.camera.IVirtualCameraCallback {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onStreamConfigured(int p0, android.view.Surface p1, int p2, int p3, int p4) throws android.os.RemoteException {}
            public void onProcessCaptureRequest(int p0, long p1) throws android.os.RemoteException {}
            public void onStreamClosed(int p0) throws android.os.RemoteException {}
        }
    }
}
