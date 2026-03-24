package android.hardware.camera2.extension;

public interface IAdvancedExtenderImpl extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.hardware.camera2.extension.IAdvancedExtenderImpl";
    public boolean isExtensionAvailable(java.lang.String p0) throws android.os.RemoteException;
    public void init(java.lang.String p0) throws android.os.RemoteException;
    public android.hardware.camera2.extension.LatencyRange getEstimatedCaptureLatencyRange(java.lang.String p0, android.hardware.camera2.extension.Size p1, int p2) throws android.os.RemoteException;
    public java.util.List<android.hardware.camera2.extension.SizeList> getSupportedPreviewOutputResolutions(java.lang.String p0) throws android.os.RemoteException;
    public java.util.List<android.hardware.camera2.extension.SizeList> getSupportedCaptureOutputResolutions(java.lang.String p0) throws android.os.RemoteException;
    public android.hardware.camera2.extension.ISessionProcessorImpl getSessionProcessor() throws android.os.RemoteException;

    public static class Default implements android.hardware.camera2.extension.IAdvancedExtenderImpl {
        public Default() {}
        public boolean isExtensionAvailable(java.lang.String p0) throws android.os.RemoteException { return false; }
        public void init(java.lang.String p0) throws android.os.RemoteException {}
        public android.hardware.camera2.extension.LatencyRange getEstimatedCaptureLatencyRange(java.lang.String p0, android.hardware.camera2.extension.Size p1, int p2) throws android.os.RemoteException { return null; }
        public java.util.List<android.hardware.camera2.extension.SizeList> getSupportedPreviewOutputResolutions(java.lang.String p0) throws android.os.RemoteException { return null; }
        public java.util.List<android.hardware.camera2.extension.SizeList> getSupportedCaptureOutputResolutions(java.lang.String p0) throws android.os.RemoteException { return null; }
        public android.hardware.camera2.extension.ISessionProcessorImpl getSessionProcessor() throws android.os.RemoteException { return null; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.hardware.camera2.extension.IAdvancedExtenderImpl {
        static final int TRANSACTION_isExtensionAvailable = 1;
        static final int TRANSACTION_init = 2;
        static final int TRANSACTION_getEstimatedCaptureLatencyRange = 3;
        static final int TRANSACTION_getSupportedPreviewOutputResolutions = 4;
        static final int TRANSACTION_getSupportedCaptureOutputResolutions = 5;
        static final int TRANSACTION_getSessionProcessor = 6;
        public Stub() { super(); }
        public static android.hardware.camera2.extension.IAdvancedExtenderImpl asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.hardware.camera2.extension.IAdvancedExtenderImpl p0) { return false; }
        public static android.hardware.camera2.extension.IAdvancedExtenderImpl getDefaultImpl() { return null; }

        private static class Proxy implements android.hardware.camera2.extension.IAdvancedExtenderImpl {
            private android.os.IBinder mRemote;
            public static android.hardware.camera2.extension.IAdvancedExtenderImpl sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public boolean isExtensionAvailable(java.lang.String p0) throws android.os.RemoteException { return false; }
            public void init(java.lang.String p0) throws android.os.RemoteException {}
            public android.hardware.camera2.extension.LatencyRange getEstimatedCaptureLatencyRange(java.lang.String p0, android.hardware.camera2.extension.Size p1, int p2) throws android.os.RemoteException { return null; }
            public java.util.List<android.hardware.camera2.extension.SizeList> getSupportedPreviewOutputResolutions(java.lang.String p0) throws android.os.RemoteException { return null; }
            public java.util.List<android.hardware.camera2.extension.SizeList> getSupportedCaptureOutputResolutions(java.lang.String p0) throws android.os.RemoteException { return null; }
            public android.hardware.camera2.extension.ISessionProcessorImpl getSessionProcessor() throws android.os.RemoteException { return null; }
        }
    }
}
