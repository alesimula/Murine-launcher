package android.hardware.camera2.extension;

public interface IRequestProcessorImpl extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.hardware.camera2.extension.IRequestProcessorImpl";
    public void setImageProcessor(android.hardware.camera2.extension.OutputConfigId p0, android.hardware.camera2.extension.IImageProcessorImpl p1) throws android.os.RemoteException;
    public int submit(android.hardware.camera2.extension.Request p0, android.hardware.camera2.extension.IRequestCallback p1) throws android.os.RemoteException;
    public int submitBurst(java.util.List<android.hardware.camera2.extension.Request> p0, android.hardware.camera2.extension.IRequestCallback p1) throws android.os.RemoteException;
    public int setRepeating(android.hardware.camera2.extension.Request p0, android.hardware.camera2.extension.IRequestCallback p1) throws android.os.RemoteException;
    public void abortCaptures() throws android.os.RemoteException;
    public void stopRepeating() throws android.os.RemoteException;

    public static class Default implements android.hardware.camera2.extension.IRequestProcessorImpl {
        public Default() {}
        public void setImageProcessor(android.hardware.camera2.extension.OutputConfigId p0, android.hardware.camera2.extension.IImageProcessorImpl p1) throws android.os.RemoteException {}
        public int submit(android.hardware.camera2.extension.Request p0, android.hardware.camera2.extension.IRequestCallback p1) throws android.os.RemoteException { return 0; }
        public int submitBurst(java.util.List<android.hardware.camera2.extension.Request> p0, android.hardware.camera2.extension.IRequestCallback p1) throws android.os.RemoteException { return 0; }
        public int setRepeating(android.hardware.camera2.extension.Request p0, android.hardware.camera2.extension.IRequestCallback p1) throws android.os.RemoteException { return 0; }
        public void abortCaptures() throws android.os.RemoteException {}
        public void stopRepeating() throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.hardware.camera2.extension.IRequestProcessorImpl {
        static final int TRANSACTION_setImageProcessor = 1;
        static final int TRANSACTION_submit = 2;
        static final int TRANSACTION_submitBurst = 3;
        static final int TRANSACTION_setRepeating = 4;
        static final int TRANSACTION_abortCaptures = 5;
        static final int TRANSACTION_stopRepeating = 6;
        public Stub() { super(); }
        public static android.hardware.camera2.extension.IRequestProcessorImpl asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.hardware.camera2.extension.IRequestProcessorImpl {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void setImageProcessor(android.hardware.camera2.extension.OutputConfigId p0, android.hardware.camera2.extension.IImageProcessorImpl p1) throws android.os.RemoteException {}
            public int submit(android.hardware.camera2.extension.Request p0, android.hardware.camera2.extension.IRequestCallback p1) throws android.os.RemoteException { return 0; }
            public int submitBurst(java.util.List<android.hardware.camera2.extension.Request> p0, android.hardware.camera2.extension.IRequestCallback p1) throws android.os.RemoteException { return 0; }
            public int setRepeating(android.hardware.camera2.extension.Request p0, android.hardware.camera2.extension.IRequestCallback p1) throws android.os.RemoteException { return 0; }
            public void abortCaptures() throws android.os.RemoteException {}
            public void stopRepeating() throws android.os.RemoteException {}
        }
    }
}
