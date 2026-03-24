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
    public CameraExtensionCharacteristics(android.content.Context p0, java.lang.String p1, java.util.Map<java.lang.String, android.hardware.camera2.CameraCharacteristics> p2) {}
    public static boolean registerClient(android.content.Context p0, android.os.IBinder p1, int p2, java.lang.String p3, java.util.Map<java.lang.String, android.hardware.camera2.impl.CameraMetadataNative> p4) { return false; }
    public static void unregisterClient(android.content.Context p0, android.os.IBinder p1, int p2) {}
    public static void initializeSession(android.hardware.camera2.extension.IInitializeSessionCallback p0, int p1) throws android.os.RemoteException {}
    public static void releaseSession(int p0) {}
    public static boolean areAdvancedExtensionsSupported(int p0) { return false; }
    public static boolean isExtensionSupported(java.lang.String p0, int p1, java.util.Map<java.lang.String, android.hardware.camera2.impl.CameraMetadataNative> p2) { return false; }
    public static android.hardware.camera2.extension.IAdvancedExtenderImpl initializeAdvancedExtension(int p0) { return null; }
    public static android.util.Pair<android.hardware.camera2.extension.IPreviewExtenderImpl, android.hardware.camera2.extension.IImageCaptureExtenderImpl> initializeExtension(int p0) { return null; }
    @android.annotation.NonNull
    public java.util.List<java.lang.Integer> getSupportedExtensions() { return null; }
    @android.annotation.FlaggedApi("com.android.internal.camera.flags.camera_extensions_characteristics_get")
    @android.annotation.Nullable
    public <T extends java.lang.Object> T get(int p0, android.hardware.camera2.CameraCharacteristics.Key<T> p1) { return null; }
    @android.annotation.FlaggedApi("com.android.internal.camera.flags.camera_extensions_characteristics_get")
    @android.annotation.NonNull
    public java.util.Set<android.hardware.camera2.CameraCharacteristics.Key> getKeys(int p0) { return null; }
    public boolean isPostviewAvailable(int p0) { return false; }
    @android.annotation.NonNull
    public java.util.List<android.util.Size> getPostviewSupportedSizes(int p0, android.util.Size p1, int p2) { return null; }
    @android.annotation.NonNull
    public <T extends java.lang.Object> java.util.List<android.util.Size> getExtensionSupportedSizes(int p0, java.lang.Class<T> p1) { return null; }
    @android.annotation.NonNull
    public java.util.List<android.util.Size> getExtensionSupportedSizes(int p0, int p1) { return null; }
    @android.annotation.Nullable
    public android.util.Range<java.lang.Long> getEstimatedCaptureLatencyRangeMillis(int p0, android.util.Size p1, int p2) { return null; }
    public boolean isCaptureProcessProgressAvailable(int p0) { return false; }
    @android.annotation.NonNull
    public java.util.Set<android.hardware.camera2.CaptureRequest.Key> getAvailableCaptureRequestKeys(int p0) { return null; }
    @android.annotation.NonNull
    public java.util.Set<android.hardware.camera2.CaptureResult.Key> getAvailableCaptureResultKeys(int p0) { return null; }

    private static final class CameraExtensionManagerGlobal {
        public static android.hardware.camera2.CameraExtensionCharacteristics.CameraExtensionManagerGlobal get() { return null; }
        public boolean registerClientHelper(android.content.Context p0, android.os.IBinder p1, int p2, boolean p3) { return false; }
        @android.annotation.SuppressLint("NonUserGetterCalled")
        public boolean registerClient(android.content.Context p0, android.os.IBinder p1, int p2, java.lang.String p3, java.util.Map<java.lang.String, android.hardware.camera2.impl.CameraMetadataNative> p4) { return false; }
        public void unregisterClient(android.content.Context p0, android.os.IBinder p1, int p2) {}
        public void initializeSession(android.hardware.camera2.extension.IInitializeSessionCallback p0, int p1) throws android.os.RemoteException {}
        public void releaseSession(int p0) {}
        public boolean areAdvancedExtensionsSupported(int p0) { return false; }
        public android.hardware.camera2.extension.IPreviewExtenderImpl initializePreviewExtension(int p0) throws android.os.RemoteException { return null; }
        public android.hardware.camera2.extension.IImageCaptureExtenderImpl initializeImageExtension(int p0) throws android.os.RemoteException { return null; }
        public android.hardware.camera2.extension.IAdvancedExtenderImpl initializeAdvancedExtension(int p0) throws android.os.RemoteException { return null; }

        private class ExtensionConnectionManager {
            public ExtensionConnectionManager(android.hardware.camera2.CameraExtensionCharacteristics.CameraExtensionManagerGlobal p0) {}
            public android.hardware.camera2.extension.ICameraExtensionsProxyService getProxy(int p0) { return null; }
            public android.content.ServiceConnection getConnection(int p0) { return null; }
            public int getConnectionCount(int p0) { return 0; }
            public boolean areAdvancedExtensionsSupported(int p0) { return false; }
            public boolean isSessionInitialized() { return false; }
            public void setProxy(int p0, android.hardware.camera2.extension.ICameraExtensionsProxyService p1) {}
            public void setConnection(int p0, android.content.ServiceConnection p1) {}
            public void incrementConnectionCount(int p0) {}
            public void decrementConnectionCount(int p0) {}
            public void resetConnectionCount(int p0) {}
            public void setAdvancedExtensionsSupported(int p0, boolean p1) {}
            public void setSessionInitialized(boolean p0) {}

            private class ExtensionConnection {
                public android.hardware.camera2.extension.ICameraExtensionsProxyService mProxy;
                public android.content.ServiceConnection mConnection;
                public int mConnectionCount;
                public boolean mSupportsAdvancedExtensions;
            }
        }

        private class InitializeSessionHandler extends android.hardware.camera2.extension.IInitializeSessionCallback.Stub {
            public InitializeSessionHandler(android.hardware.camera2.CameraExtensionCharacteristics.CameraExtensionManagerGlobal p0, android.content.Context p1) { super(); }
            public void onSuccess() {}
            public void onFailure() {}
        }

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
