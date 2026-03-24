package android.hardware.camera2.legacy;

public class LegacyRequestMapper {
    private static final java.lang.String TAG = "LegacyRequestMapper";
    private static final boolean DEBUG = false;
    private static final byte DEFAULT_JPEG_QUALITY = 85;
    public LegacyRequestMapper() {}
    public static void convertRequestMetadata(android.hardware.camera2.legacy.LegacyRequest p0) {}
    private static boolean checkForCompleteGpsData(android.location.Location p0) { return false; }
    static int filterSupportedCaptureIntent(int p0) { return 0; }
    private static java.util.List<android.hardware.Camera.Area> convertMeteringRegionsToLegacy(android.graphics.Rect p0, android.hardware.camera2.legacy.ParameterUtils.ZoomData p1, android.hardware.camera2.params.MeteringRectangle[] p2, int p3, java.lang.String p4) { return null; }
    private static void mapAeAndFlashMode(android.hardware.camera2.CaptureRequest p0, android.hardware.Camera.Parameters p1) {}
    private static java.lang.String convertAeAntiBandingModeToLegacy(int p0) { return null; }
    private static int[] convertAeFpsRangeToLegacy(android.util.Range<java.lang.Integer> p0) { return null; }
    private static java.lang.String convertAwbModeToLegacy(int p0) { return null; }
    private static <T extends java.lang.Object> T getIfSupported(android.hardware.camera2.CaptureRequest p0, android.hardware.camera2.CaptureRequest.Key<T> p1, T p2, boolean p3, T p4) { return null; }
}
