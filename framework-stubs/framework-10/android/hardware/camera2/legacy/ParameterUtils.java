package android.hardware.camera2.legacy;

public class ParameterUtils {
    public static final int NORMALIZED_RECTANGLE_MIN = -1000;
    public static final int NORMALIZED_RECTANGLE_MAX = 1000;
    public static final android.graphics.Rect NORMALIZED_RECTANGLE_DEFAULT = null;
    public static final android.hardware.Camera.Area CAMERA_AREA_DEFAULT = null;
    public static final android.graphics.Rect RECTANGLE_EMPTY = null;
    private static final double ASPECT_RATIO_TOLERANCE = 0.05000000074505806;
    private static final java.lang.String TAG = "ParameterUtils";
    private static final boolean DEBUG = false;
    private static final int ZOOM_RATIO_MULTIPLIER = 100;
    public static android.util.Size convertSize(android.hardware.Camera.Size p0) { return null; }
    public static java.util.List<android.util.Size> convertSizeList(java.util.List<android.hardware.Camera.Size> p0) { return null; }
    public static android.util.Size[] convertSizeListToArray(java.util.List<android.hardware.Camera.Size> p0) { return null; }
    public static boolean containsSize(java.util.List<android.hardware.Camera.Size> p0, int p1, int p2) { return false; }
    public static android.util.Size getLargestSupportedJpegSizeByArea(android.hardware.Camera.Parameters p0) { return null; }
    public static java.lang.String stringFromArea(android.hardware.Camera.Area p0) { return null; }
    public static java.lang.String stringFromAreaList(java.util.List<android.hardware.Camera.Area> p0) { return null; }
    public static int getClosestAvailableZoomCrop(android.hardware.Camera.Parameters p0, android.graphics.Rect p1, android.util.Size p2, android.graphics.Rect p3, android.graphics.Rect p4, android.graphics.Rect p5) { return 0; }
    private static android.graphics.Rect getPreviewCropRectangleUnzoomed(android.graphics.Rect p0, android.util.Size p1) { return null; }
    private static android.graphics.Rect shrinkToSameAspectRatioCentered(android.graphics.Rect p0, android.graphics.Rect p1) { return null; }
    public static java.util.List<android.graphics.Rect> getAvailableZoomCropRectangles(android.hardware.Camera.Parameters p0, android.graphics.Rect p1) { return null; }
    public static java.util.List<android.graphics.Rect> getAvailablePreviewZoomCropRectangles(android.hardware.Camera.Parameters p0, android.graphics.Rect p1, android.util.Size p2) { return null; }
    private static java.util.List<android.graphics.Rect> getAvailableCropRectangles(android.hardware.Camera.Parameters p0, android.graphics.Rect p1, android.util.Size p2) { return null; }
    public static float getMaxZoomRatio(android.hardware.Camera.Parameters p0) { return 0.0f; }
    private static android.util.SizeF getZoomRatio(android.util.Size p0, android.util.Size p1) { return null; }
    public static android.hardware.camera2.legacy.ParameterUtils.ZoomData convertScalerCropRegion(android.graphics.Rect p0, android.graphics.Rect p1, android.util.Size p2, android.hardware.Camera.Parameters p3) { return null; }
    public static android.hardware.camera2.legacy.ParameterUtils.MeteringData convertMeteringRectangleToLegacy(android.graphics.Rect p0, android.hardware.camera2.params.MeteringRectangle p1, android.hardware.camera2.legacy.ParameterUtils.ZoomData p2) { return null; }
    public static android.hardware.camera2.legacy.ParameterUtils.WeightedRectangle convertCameraAreaToActiveArrayRectangle(android.graphics.Rect p0, android.hardware.camera2.legacy.ParameterUtils.ZoomData p1, android.hardware.Camera.Area p2) { return null; }
    public static android.hardware.camera2.params.Face convertFaceFromLegacy(android.hardware.Camera.Face p0, android.graphics.Rect p1, android.hardware.camera2.legacy.ParameterUtils.ZoomData p2) { return null; }
    private static android.graphics.Point convertCameraPointToActiveArrayPoint(android.graphics.Rect p0, android.hardware.camera2.legacy.ParameterUtils.ZoomData p1, android.graphics.Point p2, boolean p3) { return null; }
    private static android.hardware.camera2.legacy.ParameterUtils.WeightedRectangle convertCameraAreaToActiveArrayRectangle(android.graphics.Rect p0, android.hardware.camera2.legacy.ParameterUtils.ZoomData p1, android.hardware.Camera.Area p2, boolean p3) { return null; }
    private ParameterUtils() {}

    public static class ZoomData {
        public final int zoomIndex = 0;
        public final android.graphics.Rect previewCrop = null;
        public final android.graphics.Rect reportedCrop = null;
        public ZoomData(int p0, android.graphics.Rect p1, android.graphics.Rect p2) {}
    }

    public static class WeightedRectangle {
        public final android.graphics.Rect rect = null;
        public final int weight = 0;
        public WeightedRectangle(android.graphics.Rect p0, int p1) {}
        public android.hardware.camera2.params.MeteringRectangle toMetering() { return null; }
        public android.hardware.camera2.params.Face toFace(int p0, android.graphics.Point p1, android.graphics.Point p2, android.graphics.Point p3) { return null; }
        public android.hardware.camera2.params.Face toFace() { return null; }
        private static int clipLower(int p0, int p1, android.graphics.Rect p2, java.lang.String p3) { return 0; }
        private static int clip(int p0, int p1, int p2, android.graphics.Rect p3, java.lang.String p4) { return 0; }
    }

    public static class MeteringData {
        public final android.hardware.Camera.Area meteringArea = null;
        public final android.graphics.Rect previewMetering = null;
        public final android.graphics.Rect reportedMetering = null;
        public MeteringData(android.hardware.Camera.Area p0, android.graphics.Rect p1, android.graphics.Rect p2) {}
    }
}
