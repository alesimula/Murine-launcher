package android.hardware.camera2.extension;

public interface ICaptureProcessorImpl extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.hardware.camera2.extension.ICaptureProcessorImpl";
    public void onOutputSurface(android.view.Surface p0, int p1) throws android.os.RemoteException;
    public void onResolutionUpdate(android.hardware.camera2.extension.Size p0) throws android.os.RemoteException;
    public void onImageFormatUpdate(int p0) throws android.os.RemoteException;
    public void process(java.util.List<android.hardware.camera2.extension.CaptureBundle> p0) throws android.os.RemoteException;

    public static class Default implements android.hardware.camera2.extension.ICaptureProcessorImpl {
        public Default() {}
        public void onOutputSurface(android.view.Surface p0, int p1) throws android.os.RemoteException {}
        public void onResolutionUpdate(android.hardware.camera2.extension.Size p0) throws android.os.RemoteException {}
        public void onImageFormatUpdate(int p0) throws android.os.RemoteException {}
        public void process(java.util.List<android.hardware.camera2.extension.CaptureBundle> p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.hardware.camera2.extension.ICaptureProcessorImpl {
        static final int TRANSACTION_onOutputSurface = 1;
        static final int TRANSACTION_onResolutionUpdate = 2;
        static final int TRANSACTION_onImageFormatUpdate = 3;
        static final int TRANSACTION_process = 4;
        public Stub() { super(); }
        public static android.hardware.camera2.extension.ICaptureProcessorImpl asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.hardware.camera2.extension.ICaptureProcessorImpl p0) { return false; }
        public static android.hardware.camera2.extension.ICaptureProcessorImpl getDefaultImpl() { return null; }

        private static class Proxy implements android.hardware.camera2.extension.ICaptureProcessorImpl {
            private android.os.IBinder mRemote;
            public static android.hardware.camera2.extension.ICaptureProcessorImpl sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onOutputSurface(android.view.Surface p0, int p1) throws android.os.RemoteException {}
            public void onResolutionUpdate(android.hardware.camera2.extension.Size p0) throws android.os.RemoteException {}
            public void onImageFormatUpdate(int p0) throws android.os.RemoteException {}
            public void process(java.util.List<android.hardware.camera2.extension.CaptureBundle> p0) throws android.os.RemoteException {}
        }
    }
}
