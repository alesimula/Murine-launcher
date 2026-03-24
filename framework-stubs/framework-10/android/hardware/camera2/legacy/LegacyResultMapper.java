package android.hardware.camera2.legacy;

public class LegacyResultMapper {
    private static final java.lang.String TAG = "LegacyResultMapper";
    private static final boolean DEBUG = false;
    private android.hardware.camera2.legacy.LegacyRequest mCachedRequest;
    private android.hardware.camera2.impl.CameraMetadataNative mCachedResult;
    public LegacyResultMapper() {}
    public android.hardware.camera2.impl.CameraMetadataNative cachedConvertResultMetadata(android.hardware.camera2.legacy.LegacyRequest p0, long p1) { return null; }
    private static android.hardware.camera2.impl.CameraMetadataNative convertResultMetadata(android.hardware.camera2.legacy.LegacyRequest p0) { return null; }
    private static void mapAe(android.hardware.camera2.impl.CameraMetadataNative p0, android.hardware.camera2.CameraCharacteristics p1, android.hardware.camera2.CaptureRequest p2, android.graphics.Rect p3, android.hardware.camera2.legacy.ParameterUtils.ZoomData p4, android.hardware.Camera.Parameters p5) {}
    private static void mapAf(android.hardware.camera2.impl.CameraMetadataNative p0, android.graphics.Rect p1, android.hardware.camera2.legacy.ParameterUtils.ZoomData p2, android.hardware.Camera.Parameters p3) {}
    private static void mapAwb(android.hardware.camera2.impl.CameraMetadataNative p0, android.hardware.Camera.Parameters p1) {}
    private static android.hardware.camera2.params.MeteringRectangle[] getMeteringRectangles(android.graphics.Rect p0, android.hardware.camera2.legacy.ParameterUtils.ZoomData p1, java.util.List<android.hardware.Camera.Area> p2, java.lang.String p3) { return null; }
    private static void mapAeAndFlashMode(android.hardware.camera2.impl.CameraMetadataNative p0, android.hardware.camera2.CameraCharacteristics p1, android.hardware.Camera.Parameters p2) {}
    private static int convertLegacyAfMode(java.lang.String p0) { return 0; }
    private static int convertLegacyAwbMode(java.lang.String p0) { return 0; }
    private static void mapScaler(android.hardware.camera2.impl.CameraMetadataNative p0, android.hardware.camera2.legacy.ParameterUtils.ZoomData p1, android.hardware.Camera.Parameters p2) {}
}
