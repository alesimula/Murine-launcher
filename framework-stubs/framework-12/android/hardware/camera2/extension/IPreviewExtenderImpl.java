package android.hardware.camera2.extension;

public interface IPreviewExtenderImpl extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.hardware.camera2.extension.IPreviewExtenderImpl";
    public static final int PROCESSOR_TYPE_REQUEST_UPDATE_ONLY = 0;
    public static final int PROCESSOR_TYPE_IMAGE_PROCESSOR = 1;
    public static final int PROCESSOR_TYPE_NONE = 2;
    public void onInit(java.lang.String p0, android.hardware.camera2.impl.CameraMetadataNative p1) throws android.os.RemoteException;
    public void onDeInit() throws android.os.RemoteException;
    public android.hardware.camera2.extension.CaptureStageImpl onPresetSession() throws android.os.RemoteException;
    public android.hardware.camera2.extension.CaptureStageImpl onEnableSession() throws android.os.RemoteException;
    public android.hardware.camera2.extension.CaptureStageImpl onDisableSession() throws android.os.RemoteException;
    public void init(java.lang.String p0, android.hardware.camera2.impl.CameraMetadataNative p1) throws android.os.RemoteException;
    public boolean isExtensionAvailable(java.lang.String p0, android.hardware.camera2.impl.CameraMetadataNative p1) throws android.os.RemoteException;
    public android.hardware.camera2.extension.CaptureStageImpl getCaptureStage() throws android.os.RemoteException;
    public int getProcessorType() throws android.os.RemoteException;
    public android.hardware.camera2.extension.IPreviewImageProcessorImpl getPreviewImageProcessor() throws android.os.RemoteException;
    public android.hardware.camera2.extension.IRequestUpdateProcessorImpl getRequestUpdateProcessor() throws android.os.RemoteException;
    public java.util.List<android.hardware.camera2.extension.SizeList> getSupportedResolutions() throws android.os.RemoteException;

    public static class Default implements android.hardware.camera2.extension.IPreviewExtenderImpl {
        public Default() {}
        public void onInit(java.lang.String p0, android.hardware.camera2.impl.CameraMetadataNative p1) throws android.os.RemoteException {}
        public void onDeInit() throws android.os.RemoteException {}
        public android.hardware.camera2.extension.CaptureStageImpl onPresetSession() throws android.os.RemoteException { return null; }
        public android.hardware.camera2.extension.CaptureStageImpl onEnableSession() throws android.os.RemoteException { return null; }
        public android.hardware.camera2.extension.CaptureStageImpl onDisableSession() throws android.os.RemoteException { return null; }
        public void init(java.lang.String p0, android.hardware.camera2.impl.CameraMetadataNative p1) throws android.os.RemoteException {}
        public boolean isExtensionAvailable(java.lang.String p0, android.hardware.camera2.impl.CameraMetadataNative p1) throws android.os.RemoteException { return false; }
        public android.hardware.camera2.extension.CaptureStageImpl getCaptureStage() throws android.os.RemoteException { return null; }
        public int getProcessorType() throws android.os.RemoteException { return 0; }
        public android.hardware.camera2.extension.IPreviewImageProcessorImpl getPreviewImageProcessor() throws android.os.RemoteException { return null; }
        public android.hardware.camera2.extension.IRequestUpdateProcessorImpl getRequestUpdateProcessor() throws android.os.RemoteException { return null; }
        public java.util.List<android.hardware.camera2.extension.SizeList> getSupportedResolutions() throws android.os.RemoteException { return null; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.hardware.camera2.extension.IPreviewExtenderImpl {
        static final int TRANSACTION_onInit = 1;
        static final int TRANSACTION_onDeInit = 2;
        static final int TRANSACTION_onPresetSession = 3;
        static final int TRANSACTION_onEnableSession = 4;
        static final int TRANSACTION_onDisableSession = 5;
        static final int TRANSACTION_init = 6;
        static final int TRANSACTION_isExtensionAvailable = 7;
        static final int TRANSACTION_getCaptureStage = 8;
        static final int TRANSACTION_getProcessorType = 9;
        static final int TRANSACTION_getPreviewImageProcessor = 10;
        static final int TRANSACTION_getRequestUpdateProcessor = 11;
        static final int TRANSACTION_getSupportedResolutions = 12;
        public Stub() { super(); }
        public static android.hardware.camera2.extension.IPreviewExtenderImpl asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.hardware.camera2.extension.IPreviewExtenderImpl p0) { return false; }
        public static android.hardware.camera2.extension.IPreviewExtenderImpl getDefaultImpl() { return null; }

        private static class Proxy implements android.hardware.camera2.extension.IPreviewExtenderImpl {
            private android.os.IBinder mRemote;
            public static android.hardware.camera2.extension.IPreviewExtenderImpl sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onInit(java.lang.String p0, android.hardware.camera2.impl.CameraMetadataNative p1) throws android.os.RemoteException {}
            public void onDeInit() throws android.os.RemoteException {}
            public android.hardware.camera2.extension.CaptureStageImpl onPresetSession() throws android.os.RemoteException { return null; }
            public android.hardware.camera2.extension.CaptureStageImpl onEnableSession() throws android.os.RemoteException { return null; }
            public android.hardware.camera2.extension.CaptureStageImpl onDisableSession() throws android.os.RemoteException { return null; }
            public void init(java.lang.String p0, android.hardware.camera2.impl.CameraMetadataNative p1) throws android.os.RemoteException {}
            public boolean isExtensionAvailable(java.lang.String p0, android.hardware.camera2.impl.CameraMetadataNative p1) throws android.os.RemoteException { return false; }
            public android.hardware.camera2.extension.CaptureStageImpl getCaptureStage() throws android.os.RemoteException { return null; }
            public int getProcessorType() throws android.os.RemoteException { return 0; }
            public android.hardware.camera2.extension.IPreviewImageProcessorImpl getPreviewImageProcessor() throws android.os.RemoteException { return null; }
            public android.hardware.camera2.extension.IRequestUpdateProcessorImpl getRequestUpdateProcessor() throws android.os.RemoteException { return null; }
            public java.util.List<android.hardware.camera2.extension.SizeList> getSupportedResolutions() throws android.os.RemoteException { return null; }
        }
    }
}
