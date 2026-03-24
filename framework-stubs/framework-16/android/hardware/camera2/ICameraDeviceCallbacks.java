package android.hardware.camera2;

public interface ICameraDeviceCallbacks extends android.os.IInterface {
    public static final int ERROR_CAMERA_INVALID_ERROR = -1;
    public static final int ERROR_CAMERA_DISCONNECTED = 0;
    public static final int ERROR_CAMERA_DEVICE = 1;
    public static final int ERROR_CAMERA_SERVICE = 2;
    public static final int ERROR_CAMERA_REQUEST = 3;
    public static final int ERROR_CAMERA_RESULT = 4;
    public static final int ERROR_CAMERA_BUFFER = 5;
    public static final int ERROR_CAMERA_DISABLED = 6;
    public void onDeviceError(int p0, android.hardware.camera2.impl.CaptureResultExtras p1) throws android.os.RemoteException;
    public void onDeviceIdle() throws android.os.RemoteException;
    public void onCaptureStarted(android.hardware.camera2.impl.CaptureResultExtras p0, long p1) throws android.os.RemoteException;
    public void onResultReceived(android.hardware.camera2.CameraMetadataInfo p0, android.hardware.camera2.impl.CaptureResultExtras p1, android.hardware.camera2.impl.PhysicalCaptureResultInfo[] p2) throws android.os.RemoteException;
    public void onPrepared(int p0) throws android.os.RemoteException;
    public void onRepeatingRequestError(long p0, int p1) throws android.os.RemoteException;
    public void onRequestQueueEmpty() throws android.os.RemoteException;
    public void onClientSharedAccessPriorityChanged(boolean p0) throws android.os.RemoteException;

    public static class Default implements android.hardware.camera2.ICameraDeviceCallbacks {
        public Default() {}
        public void onDeviceError(int p0, android.hardware.camera2.impl.CaptureResultExtras p1) throws android.os.RemoteException {}
        public void onDeviceIdle() throws android.os.RemoteException {}
        public void onCaptureStarted(android.hardware.camera2.impl.CaptureResultExtras p0, long p1) throws android.os.RemoteException {}
        public void onResultReceived(android.hardware.camera2.CameraMetadataInfo p0, android.hardware.camera2.impl.CaptureResultExtras p1, android.hardware.camera2.impl.PhysicalCaptureResultInfo[] p2) throws android.os.RemoteException {}
        public void onPrepared(int p0) throws android.os.RemoteException {}
        public void onRepeatingRequestError(long p0, int p1) throws android.os.RemoteException {}
        public void onRequestQueueEmpty() throws android.os.RemoteException {}
        public void onClientSharedAccessPriorityChanged(boolean p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.hardware.camera2.ICameraDeviceCallbacks {
        public static final java.lang.String DESCRIPTOR = "android.hardware.camera2.ICameraDeviceCallbacks";
        static final int TRANSACTION_onDeviceError = 1;
        static final int TRANSACTION_onDeviceIdle = 2;
        static final int TRANSACTION_onCaptureStarted = 3;
        static final int TRANSACTION_onResultReceived = 4;
        static final int TRANSACTION_onPrepared = 5;
        static final int TRANSACTION_onRepeatingRequestError = 6;
        static final int TRANSACTION_onRequestQueueEmpty = 7;
        static final int TRANSACTION_onClientSharedAccessPriorityChanged = 8;
        public Stub() { super(); }
        public static android.hardware.camera2.ICameraDeviceCallbacks asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.hardware.camera2.ICameraDeviceCallbacks {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onDeviceError(int p0, android.hardware.camera2.impl.CaptureResultExtras p1) throws android.os.RemoteException {}
            public void onDeviceIdle() throws android.os.RemoteException {}
            public void onCaptureStarted(android.hardware.camera2.impl.CaptureResultExtras p0, long p1) throws android.os.RemoteException {}
            public void onResultReceived(android.hardware.camera2.CameraMetadataInfo p0, android.hardware.camera2.impl.CaptureResultExtras p1, android.hardware.camera2.impl.PhysicalCaptureResultInfo[] p2) throws android.os.RemoteException {}
            public void onPrepared(int p0) throws android.os.RemoteException {}
            public void onRepeatingRequestError(long p0, int p1) throws android.os.RemoteException {}
            public void onRequestQueueEmpty() throws android.os.RemoteException {}
            public void onClientSharedAccessPriorityChanged(boolean p0) throws android.os.RemoteException {}
        }
    }
}
