package android.hardware.camera2.utils;

public class SurfaceUtils {
    private static final int USAGE_RENDERSCRIPT = 1048576;
    private static final int USAGE_HW_COMPOSER = 2048;
    private static final int BGRA_8888 = 5;
    private static final int BAD_VALUE = Integer.valueOf(0);
    public SurfaceUtils() {}
    public static boolean isSurfaceForPreview(android.view.Surface p0) { return false; }
    public static boolean isSurfaceForHwVideoEncoder(android.view.Surface p0) { return false; }
    public static long getSurfaceId(android.view.Surface p0) { return 0L; }
    public static long getSurfaceUsage(android.view.Surface p0) { return 0L; }
    public static android.util.Size getSurfaceSize(android.view.Surface p0) { return null; }
    public static int getSurfaceFormat(android.view.Surface p0) { return 0; }
    public static int detectSurfaceFormat(android.view.Surface p0) { return 0; }
    public static int getSurfaceDataspace(android.view.Surface p0) { return 0; }
    public static boolean isFlexibleConsumer(android.view.Surface p0) { return false; }
    private static void checkHighSpeedSurfaceFormat(android.view.Surface p0) {}
    public static void checkConstrainedHighSpeedSurfaces(java.util.Collection<android.view.Surface> p0, android.util.Range<java.lang.Integer> p1, android.hardware.camera2.params.StreamConfigurationMap p2) {}
    private static native int nativeDetectSurfaceType(android.view.Surface p0);
    private static native int nativeDetectSurfaceDataspace(android.view.Surface p0);
    private static native long nativeDetectSurfaceUsageFlags(android.view.Surface p0);
    private static native int nativeDetectSurfaceDimens(android.view.Surface p0, int[] p1);
    private static native long nativeGetSurfaceId(android.view.Surface p0);
}
