package android.hardware.camera2.extension;

public interface IImageCaptureExtenderImpl extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.hardware.camera2.extension.IImageCaptureExtenderImpl";
    public void onInit(android.os.IBinder p0, java.lang.String p1, android.hardware.camera2.impl.CameraMetadataNative p2) throws android.os.RemoteException;
    public void onDeInit(android.os.IBinder p0) throws android.os.RemoteException;
    public android.hardware.camera2.extension.CaptureStageImpl onPresetSession() throws android.os.RemoteException;
    public android.hardware.camera2.extension.CaptureStageImpl onEnableSession() throws android.os.RemoteException;
    public android.hardware.camera2.extension.CaptureStageImpl onDisableSession() throws android.os.RemoteException;
    public int getSessionType() throws android.os.RemoteException;
    public boolean isExtensionAvailable(java.lang.String p0, android.hardware.camera2.impl.CameraMetadataNative p1) throws android.os.RemoteException;
    public void init(java.lang.String p0, android.hardware.camera2.impl.CameraMetadataNative p1) throws android.os.RemoteException;
    public android.hardware.camera2.extension.ICaptureProcessorImpl getCaptureProcessor() throws android.os.RemoteException;
    public java.util.List<android.hardware.camera2.extension.CaptureStageImpl> getCaptureStages() throws android.os.RemoteException;
    public int getMaxCaptureStage() throws android.os.RemoteException;
    public java.util.List<android.hardware.camera2.extension.SizeList> getSupportedResolutions() throws android.os.RemoteException;
    public java.util.List<android.hardware.camera2.extension.SizeList> getSupportedPostviewResolutions(android.hardware.camera2.extension.Size p0) throws android.os.RemoteException;
    public android.hardware.camera2.extension.LatencyRange getEstimatedCaptureLatencyRange(android.hardware.camera2.extension.Size p0) throws android.os.RemoteException;
    public android.hardware.camera2.impl.CameraMetadataNative getAvailableCaptureRequestKeys() throws android.os.RemoteException;
    public android.hardware.camera2.impl.CameraMetadataNative getAvailableCaptureResultKeys() throws android.os.RemoteException;
    public boolean isCaptureProcessProgressAvailable() throws android.os.RemoteException;
    public android.hardware.camera2.extension.LatencyPair getRealtimeCaptureLatency() throws android.os.RemoteException;
    public boolean isPostviewAvailable() throws android.os.RemoteException;

    public static class Default implements android.hardware.camera2.extension.IImageCaptureExtenderImpl {
        public Default() {}
        public void onInit(android.os.IBinder p0, java.lang.String p1, android.hardware.camera2.impl.CameraMetadataNative p2) throws android.os.RemoteException {}
        public void onDeInit(android.os.IBinder p0) throws android.os.RemoteException {}
        public android.hardware.camera2.extension.CaptureStageImpl onPresetSession() throws android.os.RemoteException { return null; }
        public android.hardware.camera2.extension.CaptureStageImpl onEnableSession() throws android.os.RemoteException { return null; }
        public android.hardware.camera2.extension.CaptureStageImpl onDisableSession() throws android.os.RemoteException { return null; }
        public int getSessionType() throws android.os.RemoteException { return 0; }
        public boolean isExtensionAvailable(java.lang.String p0, android.hardware.camera2.impl.CameraMetadataNative p1) throws android.os.RemoteException { return false; }
        public void init(java.lang.String p0, android.hardware.camera2.impl.CameraMetadataNative p1) throws android.os.RemoteException {}
        public android.hardware.camera2.extension.ICaptureProcessorImpl getCaptureProcessor() throws android.os.RemoteException { return null; }
        public java.util.List<android.hardware.camera2.extension.CaptureStageImpl> getCaptureStages() throws android.os.RemoteException { return null; }
        public int getMaxCaptureStage() throws android.os.RemoteException { return 0; }
        public java.util.List<android.hardware.camera2.extension.SizeList> getSupportedResolutions() throws android.os.RemoteException { return null; }
        public java.util.List<android.hardware.camera2.extension.SizeList> getSupportedPostviewResolutions(android.hardware.camera2.extension.Size p0) throws android.os.RemoteException { return null; }
        public android.hardware.camera2.extension.LatencyRange getEstimatedCaptureLatencyRange(android.hardware.camera2.extension.Size p0) throws android.os.RemoteException { return null; }
        public android.hardware.camera2.impl.CameraMetadataNative getAvailableCaptureRequestKeys() throws android.os.RemoteException { return null; }
        public android.hardware.camera2.impl.CameraMetadataNative getAvailableCaptureResultKeys() throws android.os.RemoteException { return null; }
        public boolean isCaptureProcessProgressAvailable() throws android.os.RemoteException { return false; }
        public android.hardware.camera2.extension.LatencyPair getRealtimeCaptureLatency() throws android.os.RemoteException { return null; }
        public boolean isPostviewAvailable() throws android.os.RemoteException { return false; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.hardware.camera2.extension.IImageCaptureExtenderImpl {
        static final int TRANSACTION_onInit = 1;
        static final int TRANSACTION_onDeInit = 2;
        static final int TRANSACTION_onPresetSession = 3;
        static final int TRANSACTION_onEnableSession = 4;
        static final int TRANSACTION_onDisableSession = 5;
        static final int TRANSACTION_getSessionType = 6;
        static final int TRANSACTION_isExtensionAvailable = 7;
        static final int TRANSACTION_init = 8;
        static final int TRANSACTION_getCaptureProcessor = 9;
        static final int TRANSACTION_getCaptureStages = 10;
        static final int TRANSACTION_getMaxCaptureStage = 11;
        static final int TRANSACTION_getSupportedResolutions = 12;
        static final int TRANSACTION_getSupportedPostviewResolutions = 13;
        static final int TRANSACTION_getEstimatedCaptureLatencyRange = 14;
        static final int TRANSACTION_getAvailableCaptureRequestKeys = 15;
        static final int TRANSACTION_getAvailableCaptureResultKeys = 16;
        static final int TRANSACTION_isCaptureProcessProgressAvailable = 17;
        static final int TRANSACTION_getRealtimeCaptureLatency = 18;
        static final int TRANSACTION_isPostviewAvailable = 19;
        public Stub() { super(); }
        public static android.hardware.camera2.extension.IImageCaptureExtenderImpl asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.hardware.camera2.extension.IImageCaptureExtenderImpl {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onInit(android.os.IBinder p0, java.lang.String p1, android.hardware.camera2.impl.CameraMetadataNative p2) throws android.os.RemoteException {}
            public void onDeInit(android.os.IBinder p0) throws android.os.RemoteException {}
            public android.hardware.camera2.extension.CaptureStageImpl onPresetSession() throws android.os.RemoteException { return null; }
            public android.hardware.camera2.extension.CaptureStageImpl onEnableSession() throws android.os.RemoteException { return null; }
            public android.hardware.camera2.extension.CaptureStageImpl onDisableSession() throws android.os.RemoteException { return null; }
            public int getSessionType() throws android.os.RemoteException { return 0; }
            public boolean isExtensionAvailable(java.lang.String p0, android.hardware.camera2.impl.CameraMetadataNative p1) throws android.os.RemoteException { return false; }
            public void init(java.lang.String p0, android.hardware.camera2.impl.CameraMetadataNative p1) throws android.os.RemoteException {}
            public android.hardware.camera2.extension.ICaptureProcessorImpl getCaptureProcessor() throws android.os.RemoteException { return null; }
            public java.util.List<android.hardware.camera2.extension.CaptureStageImpl> getCaptureStages() throws android.os.RemoteException { return null; }
            public int getMaxCaptureStage() throws android.os.RemoteException { return 0; }
            public java.util.List<android.hardware.camera2.extension.SizeList> getSupportedResolutions() throws android.os.RemoteException { return null; }
            public java.util.List<android.hardware.camera2.extension.SizeList> getSupportedPostviewResolutions(android.hardware.camera2.extension.Size p0) throws android.os.RemoteException { return null; }
            public android.hardware.camera2.extension.LatencyRange getEstimatedCaptureLatencyRange(android.hardware.camera2.extension.Size p0) throws android.os.RemoteException { return null; }
            public android.hardware.camera2.impl.CameraMetadataNative getAvailableCaptureRequestKeys() throws android.os.RemoteException { return null; }
            public android.hardware.camera2.impl.CameraMetadataNative getAvailableCaptureResultKeys() throws android.os.RemoteException { return null; }
            public boolean isCaptureProcessProgressAvailable() throws android.os.RemoteException { return false; }
            public android.hardware.camera2.extension.LatencyPair getRealtimeCaptureLatency() throws android.os.RemoteException { return null; }
            public boolean isPostviewAvailable() throws android.os.RemoteException { return false; }
        }
    }
}
