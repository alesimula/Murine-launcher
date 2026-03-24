package android.hardware.camera2.legacy;

public class LegacyCameraDevice implements java.lang.AutoCloseable {
    private final java.lang.String TAG = null;
    private static final boolean DEBUG = false;
    private final int mCameraId = 0;
    private final android.hardware.camera2.CameraCharacteristics mStaticCharacteristics = null;
    private final android.hardware.camera2.ICameraDeviceCallbacks mDeviceCallbacks = null;
    private final android.hardware.camera2.legacy.CameraDeviceState mDeviceState = null;
    private android.util.SparseArray<android.view.Surface> mConfiguredSurfaces;
    private boolean mClosed;
    private final android.os.ConditionVariable mIdle = null;
    private final android.os.HandlerThread mResultThread = null;
    private final android.os.HandlerThread mCallbackHandlerThread = null;
    private final android.os.Handler mCallbackHandler = null;
    private final android.os.Handler mResultHandler = null;
    private static final int ILLEGAL_VALUE = -1;
    private static final int GRALLOC_USAGE_RENDERSCRIPT = 1048576;
    private static final int GRALLOC_USAGE_SW_READ_OFTEN = 3;
    private static final int GRALLOC_USAGE_HW_TEXTURE = 256;
    private static final int GRALLOC_USAGE_HW_COMPOSER = 2048;
    private static final int GRALLOC_USAGE_HW_RENDER = 512;
    private static final int GRALLOC_USAGE_HW_VIDEO_ENCODER = 65536;
    public static final int MAX_DIMEN_FOR_ROUNDING = 1920;
    public static final int NATIVE_WINDOW_SCALING_MODE_SCALE_TO_WINDOW = 1;
    private final android.hardware.camera2.legacy.CameraDeviceState.CameraDeviceStateListener mStateListener = null;
    private final android.hardware.camera2.legacy.RequestThreadManager mRequestThreadManager = null;
    private android.hardware.camera2.impl.CaptureResultExtras getExtrasFromRequest(android.hardware.camera2.legacy.RequestHolder p0) { return null; }
    private android.hardware.camera2.impl.CaptureResultExtras getExtrasFromRequest(android.hardware.camera2.legacy.RequestHolder p0, int p1, java.lang.Object p2) { return null; }
    static boolean needsConversion(android.view.Surface p0) throws android.hardware.camera2.legacy.LegacyExceptionUtils.BufferQueueAbandonedException { return false; }
    public LegacyCameraDevice(int p0, android.hardware.Camera p1, android.hardware.camera2.CameraCharacteristics p2, android.hardware.camera2.ICameraDeviceCallbacks p3) {}
    public int configureOutputs(android.util.SparseArray<android.view.Surface> p0) { return 0; }
    public int configureOutputs(android.util.SparseArray<android.view.Surface> p0, boolean p1) { return 0; }
    public android.hardware.camera2.utils.SubmitInfo submitRequestList(android.hardware.camera2.CaptureRequest[] p0, boolean p1) { return null; }
    public android.hardware.camera2.utils.SubmitInfo submitRequest(android.hardware.camera2.CaptureRequest p0, boolean p1) { return null; }
    public long cancelRequest(int p0) { return 0L; }
    public void waitUntilIdle() {}
    public long flush() { return 0L; }
    public void setAudioRestriction(int p0) {}
    public int getAudioRestriction() { return 0; }
    public boolean isClosed() { return false; }
    public void close() {}
    protected void finalize() throws java.lang.Throwable {}
    static long findEuclidDistSquare(android.util.Size p0, android.util.Size p1) { return 0L; }
    static android.util.Size findClosestSize(android.util.Size p0, android.util.Size[] p1) { return null; }
    public static android.util.Size getSurfaceSize(android.view.Surface p0) throws android.hardware.camera2.legacy.LegacyExceptionUtils.BufferQueueAbandonedException { return null; }
    public static boolean isFlexibleConsumer(android.view.Surface p0) { return false; }
    public static boolean isPreviewConsumer(android.view.Surface p0) { return false; }
    public static boolean isVideoEncoderConsumer(android.view.Surface p0) { return false; }
    static int detectSurfaceUsageFlags(android.view.Surface p0) { return 0; }
    public static int detectSurfaceType(android.view.Surface p0) throws android.hardware.camera2.legacy.LegacyExceptionUtils.BufferQueueAbandonedException { return 0; }
    public static int detectSurfaceDataspace(android.view.Surface p0) throws android.hardware.camera2.legacy.LegacyExceptionUtils.BufferQueueAbandonedException { return 0; }
    static void connectSurface(android.view.Surface p0) throws android.hardware.camera2.legacy.LegacyExceptionUtils.BufferQueueAbandonedException {}
    static void disconnectSurface(android.view.Surface p0) throws android.hardware.camera2.legacy.LegacyExceptionUtils.BufferQueueAbandonedException {}
    static void produceFrame(android.view.Surface p0, byte[] p1, int p2, int p3, int p4) throws android.hardware.camera2.legacy.LegacyExceptionUtils.BufferQueueAbandonedException {}
    static void setSurfaceFormat(android.view.Surface p0, int p1) throws android.hardware.camera2.legacy.LegacyExceptionUtils.BufferQueueAbandonedException {}
    static void setSurfaceDimens(android.view.Surface p0, int p1, int p2) throws android.hardware.camera2.legacy.LegacyExceptionUtils.BufferQueueAbandonedException {}
    public static long getSurfaceId(android.view.Surface p0) throws android.hardware.camera2.legacy.LegacyExceptionUtils.BufferQueueAbandonedException { return 0L; }
    static java.util.List<java.lang.Long> getSurfaceIds(android.util.SparseArray<android.view.Surface> p0) throws android.hardware.camera2.legacy.LegacyExceptionUtils.BufferQueueAbandonedException { return null; }
    static java.util.List<java.lang.Long> getSurfaceIds(java.util.Collection<android.view.Surface> p0) throws android.hardware.camera2.legacy.LegacyExceptionUtils.BufferQueueAbandonedException { return null; }
    static boolean containsSurfaceId(android.view.Surface p0, java.util.Collection<java.lang.Long> p1) { return false; }
    static void setSurfaceOrientation(android.view.Surface p0, int p1, int p2) throws android.hardware.camera2.legacy.LegacyExceptionUtils.BufferQueueAbandonedException {}
    static android.util.Size getTextureSize(android.graphics.SurfaceTexture p0) throws android.hardware.camera2.legacy.LegacyExceptionUtils.BufferQueueAbandonedException { return null; }
    static void setNextTimestamp(android.view.Surface p0, long p1) throws android.hardware.camera2.legacy.LegacyExceptionUtils.BufferQueueAbandonedException {}
    static void setScalingMode(android.view.Surface p0, int p1) throws android.hardware.camera2.legacy.LegacyExceptionUtils.BufferQueueAbandonedException {}
    private static native int nativeDetectSurfaceType(android.view.Surface p0);
    private static native int nativeDetectSurfaceDataspace(android.view.Surface p0);
    private static native int nativeDetectSurfaceDimens(android.view.Surface p0, int[] p1);
    private static native int nativeConnectSurface(android.view.Surface p0);
    private static native int nativeProduceFrame(android.view.Surface p0, byte[] p1, int p2, int p3, int p4);
    private static native int nativeSetSurfaceFormat(android.view.Surface p0, int p1);
    private static native int nativeSetSurfaceDimens(android.view.Surface p0, int p1, int p2);
    private static native long nativeGetSurfaceId(android.view.Surface p0);
    private static native int nativeSetSurfaceOrientation(android.view.Surface p0, int p1, int p2);
    private static native int nativeDetectTextureDimens(android.graphics.SurfaceTexture p0, int[] p1);
    private static native int nativeSetNextTimestamp(android.view.Surface p0, long p1);
    private static native int nativeDetectSurfaceUsageFlags(android.view.Surface p0);
    private static native int nativeSetScalingMode(android.view.Surface p0, int p1);
    private static native int nativeDisconnectSurface(android.view.Surface p0);
    static native int nativeGetJpegFooterSize();
}
