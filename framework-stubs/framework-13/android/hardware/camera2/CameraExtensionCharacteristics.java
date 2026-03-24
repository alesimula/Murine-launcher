package android.hardware.camera2;

public final class CameraExtensionCharacteristics {
    public static final int EXTENSION_AUTOMATIC = 0;
    public static final int EXTENSION_FACE_RETOUCH = 1;
    @java.lang.Deprecated
    public static final int EXTENSION_BEAUTY = 1;
    public static final int EXTENSION_BOKEH = 2;
    public static final int EXTENSION_HDR = 3;
    public static final int EXTENSION_NIGHT = 4;
    public static final int NON_PROCESSING_INPUT_FORMAT = 34;
    public static final int PROCESSING_INPUT_FORMAT = 35;
    public CameraExtensionCharacteristics(android.content.Context p0, java.lang.String p1, android.hardware.camera2.CameraCharacteristics p2) {}
    public static long registerClient(android.content.Context p0) { return 0L; }
    public static void unregisterClient(long p0) {}
    public static void initializeSession(android.hardware.camera2.extension.IInitializeSessionCallback p0) throws android.os.RemoteException {}
    public static void releaseSession() {}
    public static boolean areAdvancedExtensionsSupported() { return false; }
    public static boolean isExtensionSupported(java.lang.String p0, int p1, android.hardware.camera2.CameraCharacteristics p2) { return false; }
    public static android.hardware.camera2.extension.IAdvancedExtenderImpl initializeAdvancedExtension(int p0) { return null; }
    public static android.util.Pair<android.hardware.camera2.extension.IPreviewExtenderImpl, android.hardware.camera2.extension.IImageCaptureExtenderImpl> initializeExtension(int p0) { return null; }
    public java.util.List<java.lang.Integer> getSupportedExtensions() { return null; }
    public <T extends java.lang.Object> java.util.List<android.util.Size> getExtensionSupportedSizes(int p0, java.lang.Class<T> p1) { return null; }
    public java.util.List<android.util.Size> getExtensionSupportedSizes(int p0, int p1) { return null; }
    public android.util.Range<java.lang.Long> getEstimatedCaptureLatencyRangeMillis(int p0, android.util.Size p1, int p2) { return null; }
    public java.util.Set<android.hardware.camera2.CaptureRequest.Key> getAvailableCaptureRequestKeys(int p0) { return null; }
    public java.util.Set<android.hardware.camera2.CaptureResult.Key> getAvailableCaptureResultKeys(int p0) { return null; }

    private static final class CameraExtensionManagerGlobal {
        public static android.hardware.camera2.CameraExtensionCharacteristics.CameraExtensionManagerGlobal get() { return null; }
        public long registerClient(android.content.Context p0) { return 0L; }
        public void unregisterClient(long p0) {}
        public void initializeSession(android.hardware.camera2.extension.IInitializeSessionCallback p0) throws android.os.RemoteException {}
        public void releaseSession() {}
        public boolean areAdvancedExtensionsSupported() { return false; }
        public android.hardware.camera2.extension.IPreviewExtenderImpl initializePreviewExtension(int p0) throws android.os.RemoteException { return null; }
        public android.hardware.camera2.extension.IImageCaptureExtenderImpl initializeImageExtension(int p0) throws android.os.RemoteException { return null; }
        public android.hardware.camera2.extension.IAdvancedExtenderImpl initializeAdvancedExtension(int p0) throws android.os.RemoteException { return null; }

        private static class InitializerFuture implements java.util.concurrent.Future<java.lang.Boolean> {
            android.os.ConditionVariable mCondVar;
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
