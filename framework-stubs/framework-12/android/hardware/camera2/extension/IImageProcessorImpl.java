package android.hardware.camera2.extension;

public interface IImageProcessorImpl extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.hardware.camera2.extension.IImageProcessorImpl";
    public void onNextImageAvailable(android.hardware.camera2.extension.OutputConfigId p0, android.hardware.camera2.extension.ParcelImage p1, java.lang.String p2) throws android.os.RemoteException;

    public static class Default implements android.hardware.camera2.extension.IImageProcessorImpl {
        public Default() {}
        public void onNextImageAvailable(android.hardware.camera2.extension.OutputConfigId p0, android.hardware.camera2.extension.ParcelImage p1, java.lang.String p2) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.hardware.camera2.extension.IImageProcessorImpl {
        static final int TRANSACTION_onNextImageAvailable = 1;
        public Stub() { super(); }
        public static android.hardware.camera2.extension.IImageProcessorImpl asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.hardware.camera2.extension.IImageProcessorImpl p0) { return false; }
        public static android.hardware.camera2.extension.IImageProcessorImpl getDefaultImpl() { return null; }

        private static class Proxy implements android.hardware.camera2.extension.IImageProcessorImpl {
            private android.os.IBinder mRemote;
            public static android.hardware.camera2.extension.IImageProcessorImpl sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onNextImageAvailable(android.hardware.camera2.extension.OutputConfigId p0, android.hardware.camera2.extension.ParcelImage p1, java.lang.String p2) throws android.os.RemoteException {}
        }
    }
}
