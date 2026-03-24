package android.hardware.camera2;

public final class CameraExtensionCharacteristics {
    private static final java.lang.String TAG = "CameraExtensionCharacteristics";
    public static final int EXTENSION_AUTOMATIC = 0;
    public static final int EXTENSION_BEAUTY = 1;
    public static final int EXTENSION_BOKEH = 2;
    public static final int EXTENSION_HDR = 3;
    public static final int EXTENSION_NIGHT = 4;
    public static final int NON_PROCESSING_INPUT_FORMAT = 34;
    public static final int PROCESSING_INPUT_FORMAT = 35;
    private static final int[] EXTENSION_LIST = null;
    private final android.content.Context mContext = null;
    private final java.lang.String mCameraId = null;
    private final android.hardware.camera2.CameraCharacteristics mChars = null;
    public CameraExtensionCharacteristics(android.content.Context p0, java.lang.String p1, android.hardware.camera2.CameraCharacteristics p2) {}
    private static java.util.ArrayList<android.util.Size> getSupportedSizes(java.util.List<android.hardware.camera2.extension.SizeList> p0, java.lang.Integer p1) { return null; }
    private static java.util.List<android.util.Size> generateSupportedSizes(java.util.List<android.hardware.camera2.extension.SizeList> p0, java.lang.Integer p1, android.hardware.camera2.params.StreamConfigurationMap p2) { return null; }
    private static java.util.List<android.util.Size> generateJpegSupportedSizes(java.util.List<android.hardware.camera2.extension.SizeList> p0, android.hardware.camera2.params.StreamConfigurationMap p1) { return null; }
    public static long registerClient(android.content.Context p0) { return 0L; }
    public static void unregisterClient(long p0) {}
    public static void initializeSession(android.hardware.camera2.extension.IInitializeSessionCallback p0) throws android.os.RemoteException {}
    public static void releaseSession() {}
    public static boolean areAdvancedExtensionsSupported() { return false; }
    public static boolean isExtensionSupported(java.lang.String p0, int p1, android.hardware.camera2.CameraCharacteristics p2) { return false; }
    public static android.hardware.camera2.extension.IAdvancedExtenderImpl initializeAdvancedExtension(int p0) { return null; }
    public static android.util.Pair<android.hardware.camera2.extension.IPreviewExtenderImpl, android.hardware.camera2.extension.IImageCaptureExtenderImpl> initializeExtension(int p0) { return null; }
    private static <T extends java.lang.Object> boolean isOutputSupportedFor(java.lang.Class<T> p0) { return false; }
    public java.util.List<java.lang.Integer> getSupportedExtensions() { return null; }
    public <T extends java.lang.Object> java.util.List<android.util.Size> getExtensionSupportedSizes(int p0, java.lang.Class<T> p1) { return null; }
    public java.util.List<android.util.Size> getExtensionSupportedSizes(int p0, int p1) { return null; }
    public android.util.Range<java.lang.Long> getEstimatedCaptureLatencyRangeMillis(int p0, android.util.Size p1, int p2) { return null; }

    private static final class CameraExtensionManagerGlobal {
        private static final java.lang.String TAG = "CameraExtensionManagerGlobal";
        private static final java.lang.String PROXY_PACKAGE_NAME = "com.android.cameraextensions";
        private static final java.lang.String PROXY_SERVICE_NAME = "com.android.cameraextensions.CameraExtensionsProxyService";
        private static final android.hardware.camera2.CameraExtensionCharacteristics.CameraExtensionManagerGlobal GLOBAL_CAMERA_MANAGER = null;
        private final java.lang.Object mLock = null;
        private final int PROXY_SERVICE_DELAY_MS = 0;
        private android.hardware.camera2.CameraExtensionCharacteristics.CameraExtensionManagerGlobal.InitializerFuture mInitFuture;
        private android.content.ServiceConnection mConnection;
        private android.hardware.camera2.extension.ICameraExtensionsProxyService mProxy;
        private boolean mSupportsAdvancedExtensions;
        private CameraExtensionManagerGlobal() {}
        public static android.hardware.camera2.CameraExtensionCharacteristics.CameraExtensionManagerGlobal get() { return null; }
        private void connectToProxyLocked(android.content.Context p0) {}
        public long registerClient(android.content.Context p0) { return 0L; }
        public void unregisterClient(long p0) {}
        public void initializeSession(android.hardware.camera2.extension.IInitializeSessionCallback p0) throws android.os.RemoteException {}
        public void releaseSession() {}
        public boolean areAdvancedExtensionsSupported() { return false; }
        public android.hardware.camera2.extension.IPreviewExtenderImpl initializePreviewExtension(int p0) throws android.os.RemoteException { return null; }
        public android.hardware.camera2.extension.IImageCaptureExtenderImpl initializeImageExtension(int p0) throws android.os.RemoteException { return null; }
        public android.hardware.camera2.extension.IAdvancedExtenderImpl initializeAdvancedExtension(int p0) throws android.os.RemoteException { return null; }

        private static class InitializerFuture implements java.util.concurrent.Future<java.lang.Boolean> {
            private volatile java.lang.Boolean mStatus;
            android.os.ConditionVariable mCondVar;
            private InitializerFuture() {}
            public void setStatus(boolean p0) {}
            public boolean cancel(boolean p0) { return false; }
            public boolean isCancelled() { return false; }
            public boolean isDone() { return false; }
            public java.lang.Boolean get() { return null; }
            public java.lang.Boolean get(long p0, java.util.concurrent.TimeUnit p1) throws java.util.concurrent.TimeoutException { return null; }
        }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Extension {
    }
}
