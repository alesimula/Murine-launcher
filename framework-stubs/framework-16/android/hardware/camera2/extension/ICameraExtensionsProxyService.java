package android.hardware.camera2.extension;

public interface ICameraExtensionsProxyService extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.hardware.camera2.extension.ICameraExtensionsProxyService";
    public boolean registerClient(android.os.IBinder p0) throws android.os.RemoteException;
    public void unregisterClient(android.os.IBinder p0) throws android.os.RemoteException;
    public boolean advancedExtensionsSupported() throws android.os.RemoteException;
    public void initializeSession(android.hardware.camera2.extension.IInitializeSessionCallback p0) throws android.os.RemoteException;
    public void releaseSession() throws android.os.RemoteException;
    public android.hardware.camera2.extension.IPreviewExtenderImpl initializePreviewExtension(int p0) throws android.os.RemoteException;
    public android.hardware.camera2.extension.IImageCaptureExtenderImpl initializeImageExtension(int p0) throws android.os.RemoteException;
    public android.hardware.camera2.extension.IAdvancedExtenderImpl initializeAdvancedExtension(int p0) throws android.os.RemoteException;

    public static class Default implements android.hardware.camera2.extension.ICameraExtensionsProxyService {
        public Default() {}
        public boolean registerClient(android.os.IBinder p0) throws android.os.RemoteException { return false; }
        public void unregisterClient(android.os.IBinder p0) throws android.os.RemoteException {}
        public boolean advancedExtensionsSupported() throws android.os.RemoteException { return false; }
        public void initializeSession(android.hardware.camera2.extension.IInitializeSessionCallback p0) throws android.os.RemoteException {}
        public void releaseSession() throws android.os.RemoteException {}
        public android.hardware.camera2.extension.IPreviewExtenderImpl initializePreviewExtension(int p0) throws android.os.RemoteException { return null; }
        public android.hardware.camera2.extension.IImageCaptureExtenderImpl initializeImageExtension(int p0) throws android.os.RemoteException { return null; }
        public android.hardware.camera2.extension.IAdvancedExtenderImpl initializeAdvancedExtension(int p0) throws android.os.RemoteException { return null; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.hardware.camera2.extension.ICameraExtensionsProxyService {
        static final int TRANSACTION_registerClient = 1;
        static final int TRANSACTION_unregisterClient = 2;
        static final int TRANSACTION_advancedExtensionsSupported = 3;
        static final int TRANSACTION_initializeSession = 4;
        static final int TRANSACTION_releaseSession = 5;
        static final int TRANSACTION_initializePreviewExtension = 6;
        static final int TRANSACTION_initializeImageExtension = 7;
        static final int TRANSACTION_initializeAdvancedExtension = 8;
        public Stub() { super(); }
        public static android.hardware.camera2.extension.ICameraExtensionsProxyService asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.hardware.camera2.extension.ICameraExtensionsProxyService {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public boolean registerClient(android.os.IBinder p0) throws android.os.RemoteException { return false; }
            public void unregisterClient(android.os.IBinder p0) throws android.os.RemoteException {}
            public boolean advancedExtensionsSupported() throws android.os.RemoteException { return false; }
            public void initializeSession(android.hardware.camera2.extension.IInitializeSessionCallback p0) throws android.os.RemoteException {}
            public void releaseSession() throws android.os.RemoteException {}
            public android.hardware.camera2.extension.IPreviewExtenderImpl initializePreviewExtension(int p0) throws android.os.RemoteException { return null; }
            public android.hardware.camera2.extension.IImageCaptureExtenderImpl initializeImageExtension(int p0) throws android.os.RemoteException { return null; }
            public android.hardware.camera2.extension.IAdvancedExtenderImpl initializeAdvancedExtension(int p0) throws android.os.RemoteException { return null; }
        }
    }
}
