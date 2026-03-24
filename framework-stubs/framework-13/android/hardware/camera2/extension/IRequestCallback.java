package android.hardware.camera2.extension;

public interface IRequestCallback extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.hardware.camera2.extension.IRequestCallback";
    public void onCaptureStarted(int p0, long p1, long p2) throws android.os.RemoteException;
    public void onCaptureProgressed(int p0, android.hardware.camera2.extension.ParcelCaptureResult p1) throws android.os.RemoteException;
    public void onCaptureCompleted(int p0, android.hardware.camera2.extension.ParcelTotalCaptureResult p1) throws android.os.RemoteException;
    public void onCaptureFailed(int p0, android.hardware.camera2.extension.CaptureFailure p1) throws android.os.RemoteException;
    public void onCaptureBufferLost(int p0, long p1, int p2) throws android.os.RemoteException;
    public void onCaptureSequenceCompleted(int p0, long p1) throws android.os.RemoteException;
    public void onCaptureSequenceAborted(int p0) throws android.os.RemoteException;

    public static class Default implements android.hardware.camera2.extension.IRequestCallback {
        public Default() {}
        public void onCaptureStarted(int p0, long p1, long p2) throws android.os.RemoteException {}
        public void onCaptureProgressed(int p0, android.hardware.camera2.extension.ParcelCaptureResult p1) throws android.os.RemoteException {}
        public void onCaptureCompleted(int p0, android.hardware.camera2.extension.ParcelTotalCaptureResult p1) throws android.os.RemoteException {}
        public void onCaptureFailed(int p0, android.hardware.camera2.extension.CaptureFailure p1) throws android.os.RemoteException {}
        public void onCaptureBufferLost(int p0, long p1, int p2) throws android.os.RemoteException {}
        public void onCaptureSequenceCompleted(int p0, long p1) throws android.os.RemoteException {}
        public void onCaptureSequenceAborted(int p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.hardware.camera2.extension.IRequestCallback {
        static final int TRANSACTION_onCaptureStarted = 1;
        static final int TRANSACTION_onCaptureProgressed = 2;
        static final int TRANSACTION_onCaptureCompleted = 3;
        static final int TRANSACTION_onCaptureFailed = 4;
        static final int TRANSACTION_onCaptureBufferLost = 5;
        static final int TRANSACTION_onCaptureSequenceCompleted = 6;
        static final int TRANSACTION_onCaptureSequenceAborted = 7;
        public Stub() { super(); }
        public static android.hardware.camera2.extension.IRequestCallback asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.hardware.camera2.extension.IRequestCallback {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onCaptureStarted(int p0, long p1, long p2) throws android.os.RemoteException {}
            public void onCaptureProgressed(int p0, android.hardware.camera2.extension.ParcelCaptureResult p1) throws android.os.RemoteException {}
            public void onCaptureCompleted(int p0, android.hardware.camera2.extension.ParcelTotalCaptureResult p1) throws android.os.RemoteException {}
            public void onCaptureFailed(int p0, android.hardware.camera2.extension.CaptureFailure p1) throws android.os.RemoteException {}
            public void onCaptureBufferLost(int p0, long p1, int p2) throws android.os.RemoteException {}
            public void onCaptureSequenceCompleted(int p0, long p1) throws android.os.RemoteException {}
            public void onCaptureSequenceAborted(int p0) throws android.os.RemoteException {}
        }
    }
}
