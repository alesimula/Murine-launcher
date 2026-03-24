package android.hardware.camera2.impl;

public final class CameraExtensionUtils {
    private static final java.lang.String TAG = "CameraExtensionUtils";
    public static final int JPEG_DEFAULT_QUALITY = 100;
    public static final int JPEG_DEFAULT_ROTATION = 0;
    public static final int[] SUPPORTED_CAPTURE_OUTPUT_FORMATS = null;
    public CameraExtensionUtils() {}
    public static android.hardware.camera2.impl.CameraExtensionUtils.SurfaceInfo querySurface(android.view.Surface p0) { return null; }
    public static android.view.Surface getBurstCaptureSurface(java.util.List<android.hardware.camera2.params.OutputConfiguration> p0, java.util.HashMap<java.lang.Integer, java.util.List<android.util.Size>> p1) { return null; }
    public static android.view.Surface getRepeatingRequestSurface(java.util.List<android.hardware.camera2.params.OutputConfiguration> p0, java.util.List<android.util.Size> p1) { return null; }

    public static final class HandlerExecutor implements java.util.concurrent.Executor {
        private final android.os.Handler mHandler = null;
        public HandlerExecutor(android.os.Handler p0) {}
        public void execute(java.lang.Runnable p0) {}
    }

    public static class SurfaceInfo {
        public int mWidth;
        public int mHeight;
        public int mFormat;
        public long mUsage;
        public SurfaceInfo() {}
    }
}
