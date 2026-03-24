package android.hardware.camera2.legacy;

public class LegacyMetadataMapper {
    private static final java.lang.String TAG = "LegacyMetadataMapper";
    private static final boolean DEBUG = false;
    private static final long NS_PER_MS = 1000000L;
    public static final int HAL_PIXEL_FORMAT_RGBA_8888 = 1;
    public static final int HAL_PIXEL_FORMAT_BGRA_8888 = 5;
    public static final int HAL_PIXEL_FORMAT_IMPLEMENTATION_DEFINED = 34;
    public static final int HAL_PIXEL_FORMAT_BLOB = 33;
    private static final float LENS_INFO_MINIMUM_FOCUS_DISTANCE_FIXED_FOCUS = 0.0f;
    private static final int REQUEST_MAX_NUM_OUTPUT_STREAMS_COUNT_RAW = 0;
    private static final int REQUEST_MAX_NUM_OUTPUT_STREAMS_COUNT_PROC = 3;
    private static final int REQUEST_MAX_NUM_OUTPUT_STREAMS_COUNT_PROC_STALL = 1;
    private static final int REQUEST_MAX_NUM_INPUT_STREAMS_COUNT = 0;
    private static final int REQUEST_PIPELINE_MAX_DEPTH_HAL1 = 3;
    private static final int REQUEST_PIPELINE_MAX_DEPTH_OURS = 3;
    private static final long APPROXIMATE_CAPTURE_DELAY_MS = 200L;
    private static final long APPROXIMATE_SENSOR_AREA_PX = 8388608L;
    private static final long APPROXIMATE_JPEG_ENCODE_TIME_MS = 600L;
    static final int UNKNOWN_MODE = -1;
    private static final float PREVIEW_ASPECT_RATIO_TOLERANCE = 0.009999999776482582f;
    static final boolean LIE_ABOUT_AE_STATE = false;
    static final boolean LIE_ABOUT_AE_MAX_REGIONS = false;
    static final boolean LIE_ABOUT_AF = false;
    static final boolean LIE_ABOUT_AF_MAX_REGIONS = false;
    static final boolean LIE_ABOUT_AWB_STATE = false;
    static final boolean LIE_ABOUT_AWB = false;
    private static final java.lang.String[] sLegacySceneModes = null;
    private static final int[] sSceneModes = null;
    private static final java.lang.String[] sLegacyEffectMode = null;
    private static final int[] sEffectModes = null;
    private static final int[] sAllowedTemplates = null;
    public LegacyMetadataMapper() {}
    public static android.hardware.camera2.CameraCharacteristics createCharacteristics(android.hardware.Camera.Parameters p0, android.hardware.Camera.CameraInfo p1, int p2, android.util.Size p3) { return null; }
    public static android.hardware.camera2.CameraCharacteristics createCharacteristics(java.lang.String p0, android.hardware.CameraInfo p1, int p2, android.util.Size p3) { return null; }
    private static void mapCharacteristicsFromInfo(android.hardware.camera2.impl.CameraMetadataNative p0, android.hardware.Camera.CameraInfo p1) {}
    private static void mapCharacteristicsFromParameters(android.hardware.camera2.impl.CameraMetadataNative p0, android.hardware.Camera.Parameters p1) {}
    private static void mapScalerStreamConfigs(android.hardware.camera2.impl.CameraMetadataNative p0, android.hardware.Camera.Parameters p1) {}
    private static void mapControlAe(android.hardware.camera2.impl.CameraMetadataNative p0, android.hardware.Camera.Parameters p1) {}
    private static void mapControlAf(android.hardware.camera2.impl.CameraMetadataNative p0, android.hardware.Camera.Parameters p1) {}
    private static void mapControlAwb(android.hardware.camera2.impl.CameraMetadataNative p0, android.hardware.Camera.Parameters p1) {}
    private static void mapControlOther(android.hardware.camera2.impl.CameraMetadataNative p0, android.hardware.Camera.Parameters p1) {}
    private static void mapLens(android.hardware.camera2.impl.CameraMetadataNative p0, android.hardware.Camera.Parameters p1) {}
    private static void mapFlash(android.hardware.camera2.impl.CameraMetadataNative p0, android.hardware.Camera.Parameters p1) {}
    private static void mapJpeg(android.hardware.camera2.impl.CameraMetadataNative p0, android.hardware.Camera.Parameters p1) {}
    private static void mapRequest(android.hardware.camera2.impl.CameraMetadataNative p0, android.hardware.Camera.Parameters p1) {}
    private static void mapScaler(android.hardware.camera2.impl.CameraMetadataNative p0, android.hardware.Camera.Parameters p1) {}
    private static void mapSensor(android.hardware.camera2.impl.CameraMetadataNative p0, android.hardware.Camera.Parameters p1) {}
    private static void mapStatistics(android.hardware.camera2.impl.CameraMetadataNative p0, android.hardware.Camera.Parameters p1) {}
    private static void mapSync(android.hardware.camera2.impl.CameraMetadataNative p0, android.hardware.Camera.Parameters p1) {}
    private static void appendStreamConfig(java.util.ArrayList<android.hardware.camera2.params.StreamConfiguration> p0, int p1, java.util.List<android.hardware.Camera.Size> p2) {}
    static int convertSceneModeFromLegacy(java.lang.String p0) { return 0; }
    static java.lang.String convertSceneModeToLegacy(int p0) { return null; }
    static int convertEffectModeFromLegacy(java.lang.String p0) { return 0; }
    static java.lang.String convertEffectModeToLegacy(int p0) { return null; }
    private static int convertAntiBandingMode(java.lang.String p0) { return 0; }
    static int convertAntiBandingModeOrDefault(java.lang.String p0) { return 0; }
    private static int[] convertAeFpsRangeToLegacy(android.util.Range<java.lang.Integer> p0) { return null; }
    private static long calculateJpegStallDuration(android.hardware.Camera.Size p0) { return 0L; }
    public static void convertRequestMetadata(android.hardware.camera2.legacy.LegacyRequest p0) {}
    public static android.hardware.camera2.impl.CameraMetadataNative createRequestTemplate(android.hardware.camera2.CameraCharacteristics p0, int p1) { return null; }
    private static int[] getTagsForKeys(android.hardware.camera2.CameraCharacteristics.Key<?>[] p0) { return null; }
    private static int[] getTagsForKeys(android.hardware.camera2.CaptureRequest.Key<?>[] p0) { return null; }
    private static int[] getTagsForKeys(android.hardware.camera2.CaptureResult.Key<?>[] p0) { return null; }
    static java.lang.String convertAfModeToLegacy(int p0, java.util.List<java.lang.String> p1) { return null; }
}
