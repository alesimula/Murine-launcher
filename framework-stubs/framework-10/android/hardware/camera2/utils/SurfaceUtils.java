package android.hardware.camera2.utils;

public class SurfaceUtils {
    public SurfaceUtils() {}
    public static boolean isSurfaceForPreview(android.view.Surface p0) { return false; }
    public static boolean isSurfaceForHwVideoEncoder(android.view.Surface p0) { return false; }
    public static long getSurfaceId(android.view.Surface p0) { return 0L; }
    @android.annotation.UnsupportedAppUsage
    public static android.util.Size getSurfaceSize(android.view.Surface p0) { return null; }
    public static int getSurfaceFormat(android.view.Surface p0) { return 0; }
    public static int getSurfaceDataspace(android.view.Surface p0) { return 0; }
    public static boolean isFlexibleConsumer(android.view.Surface p0) { return false; }
    private static void checkHighSpeedSurfaceFormat(android.view.Surface p0) {}
    public static void checkConstrainedHighSpeedSurfaces(java.util.Collection<android.view.Surface> p0, android.util.Range<java.lang.Integer> p1, android.hardware.camera2.params.StreamConfigurationMap p2) {}
}
