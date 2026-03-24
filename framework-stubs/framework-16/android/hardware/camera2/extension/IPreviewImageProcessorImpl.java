package android.hardware.camera2.extension;

public interface IPreviewImageProcessorImpl extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.hardware.camera2.extension.IPreviewImageProcessorImpl";
    public void onOutputSurface(android.view.Surface p0, int p1) throws android.os.RemoteException;
    public void onResolutionUpdate(android.hardware.camera2.extension.Size p0) throws android.os.RemoteException;
    public void onImageFormatUpdate(int p0) throws android.os.RemoteException;
    public void process(android.hardware.camera2.extension.ParcelImage p0, android.hardware.camera2.impl.CameraMetadataNative p1, int p2, android.hardware.camera2.extension.IProcessResultImpl p3) throws android.os.RemoteException;

    public static class Default implements android.hardware.camera2.extension.IPreviewImageProcessorImpl {
        public Default() {}
        public void onOutputSurface(android.view.Surface p0, int p1) throws android.os.RemoteException {}
        public void onResolutionUpdate(android.hardware.camera2.extension.Size p0) throws android.os.RemoteException {}
        public void onImageFormatUpdate(int p0) throws android.os.RemoteException {}
        public void process(android.hardware.camera2.extension.ParcelImage p0, android.hardware.camera2.impl.CameraMetadataNative p1, int p2, android.hardware.camera2.extension.IProcessResultImpl p3) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.hardware.camera2.extension.IPreviewImageProcessorImpl {
        static final int TRANSACTION_onOutputSurface = 1;
        static final int TRANSACTION_onResolutionUpdate = 2;
        static final int TRANSACTION_onImageFormatUpdate = 3;
        static final int TRANSACTION_process = 4;
        public Stub() { super(); }
        public static android.hardware.camera2.extension.IPreviewImageProcessorImpl asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.hardware.camera2.extension.IPreviewImageProcessorImpl {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onOutputSurface(android.view.Surface p0, int p1) throws android.os.RemoteException {}
            public void onResolutionUpdate(android.hardware.camera2.extension.Size p0) throws android.os.RemoteException {}
            public void onImageFormatUpdate(int p0) throws android.os.RemoteException {}
            public void process(android.hardware.camera2.extension.ParcelImage p0, android.hardware.camera2.impl.CameraMetadataNative p1, int p2, android.hardware.camera2.extension.IProcessResultImpl p3) throws android.os.RemoteException {}
        }
    }
}
