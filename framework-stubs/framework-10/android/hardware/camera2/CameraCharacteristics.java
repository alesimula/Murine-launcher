package android.hardware.camera2;

public final class CameraCharacteristics extends android.hardware.camera2.CameraMetadata<android.hardware.camera2.CameraCharacteristics.Key<?>> {
    @android.annotation.UnsupportedAppUsage
    private final android.hardware.camera2.impl.CameraMetadataNative mProperties = null;
    private java.util.List<android.hardware.camera2.CameraCharacteristics.Key<?>> mKeys;
    private java.util.List<android.hardware.camera2.CameraCharacteristics.Key<?>> mKeysNeedingPermission;
    private java.util.List<android.hardware.camera2.CaptureRequest.Key<?>> mAvailableRequestKeys;
    private java.util.List<android.hardware.camera2.CaptureRequest.Key<?>> mAvailableSessionKeys;
    private java.util.List<android.hardware.camera2.CaptureRequest.Key<?>> mAvailablePhysicalRequestKeys;
    private java.util.List<android.hardware.camera2.CaptureResult.Key<?>> mAvailableResultKeys;
    private java.util.ArrayList<android.hardware.camera2.params.RecommendedStreamConfigurationMap> mRecommendedConfigurations;
    @android.hardware.camera2.impl.PublicKey
    public static final android.hardware.camera2.CameraCharacteristics.Key<int[]> COLOR_CORRECTION_AVAILABLE_ABERRATION_MODES = null;
    @android.hardware.camera2.impl.PublicKey
    public static final android.hardware.camera2.CameraCharacteristics.Key<int[]> CONTROL_AE_AVAILABLE_ANTIBANDING_MODES = null;
    @android.hardware.camera2.impl.PublicKey
    public static final android.hardware.camera2.CameraCharacteristics.Key<int[]> CONTROL_AE_AVAILABLE_MODES = null;
    @android.hardware.camera2.impl.PublicKey
    public static final android.hardware.camera2.CameraCharacteristics.Key<android.util.Range<java.lang.Integer>[]> CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES = null;
    @android.hardware.camera2.impl.PublicKey
    public static final android.hardware.camera2.CameraCharacteristics.Key<android.util.Range<java.lang.Integer>> CONTROL_AE_COMPENSATION_RANGE = null;
    @android.hardware.camera2.impl.PublicKey
    public static final android.hardware.camera2.CameraCharacteristics.Key<android.util.Rational> CONTROL_AE_COMPENSATION_STEP = null;
    @android.hardware.camera2.impl.PublicKey
    public static final android.hardware.camera2.CameraCharacteristics.Key<int[]> CONTROL_AF_AVAILABLE_MODES = null;
    @android.hardware.camera2.impl.PublicKey
    public static final android.hardware.camera2.CameraCharacteristics.Key<int[]> CONTROL_AVAILABLE_EFFECTS = null;
    @android.hardware.camera2.impl.PublicKey
    public static final android.hardware.camera2.CameraCharacteristics.Key<int[]> CONTROL_AVAILABLE_SCENE_MODES = null;
    @android.hardware.camera2.impl.PublicKey
    public static final android.hardware.camera2.CameraCharacteristics.Key<int[]> CONTROL_AVAILABLE_VIDEO_STABILIZATION_MODES = null;
    @android.hardware.camera2.impl.PublicKey
    public static final android.hardware.camera2.CameraCharacteristics.Key<int[]> CONTROL_AWB_AVAILABLE_MODES = null;
    public static final android.hardware.camera2.CameraCharacteristics.Key<int[]> CONTROL_MAX_REGIONS = null;
    @android.hardware.camera2.impl.PublicKey
    @android.hardware.camera2.impl.SyntheticKey
    public static final android.hardware.camera2.CameraCharacteristics.Key<java.lang.Integer> CONTROL_MAX_REGIONS_AE = null;
    @android.hardware.camera2.impl.PublicKey
    @android.hardware.camera2.impl.SyntheticKey
    public static final android.hardware.camera2.CameraCharacteristics.Key<java.lang.Integer> CONTROL_MAX_REGIONS_AWB = null;
    @android.hardware.camera2.impl.PublicKey
    @android.hardware.camera2.impl.SyntheticKey
    public static final android.hardware.camera2.CameraCharacteristics.Key<java.lang.Integer> CONTROL_MAX_REGIONS_AF = null;
    public static final android.hardware.camera2.CameraCharacteristics.Key<android.hardware.camera2.params.HighSpeedVideoConfiguration[]> CONTROL_AVAILABLE_HIGH_SPEED_VIDEO_CONFIGURATIONS = null;
    @android.hardware.camera2.impl.PublicKey
    public static final android.hardware.camera2.CameraCharacteristics.Key<java.lang.Boolean> CONTROL_AE_LOCK_AVAILABLE = null;
    @android.hardware.camera2.impl.PublicKey
    public static final android.hardware.camera2.CameraCharacteristics.Key<java.lang.Boolean> CONTROL_AWB_LOCK_AVAILABLE = null;
    @android.hardware.camera2.impl.PublicKey
    public static final android.hardware.camera2.CameraCharacteristics.Key<int[]> CONTROL_AVAILABLE_MODES = null;
    @android.hardware.camera2.impl.PublicKey
    public static final android.hardware.camera2.CameraCharacteristics.Key<android.util.Range<java.lang.Integer>> CONTROL_POST_RAW_SENSITIVITY_BOOST_RANGE = null;
    @android.hardware.camera2.impl.PublicKey
    public static final android.hardware.camera2.CameraCharacteristics.Key<int[]> EDGE_AVAILABLE_EDGE_MODES = null;
    @android.hardware.camera2.impl.PublicKey
    public static final android.hardware.camera2.CameraCharacteristics.Key<java.lang.Boolean> FLASH_INFO_AVAILABLE = null;
    @android.hardware.camera2.impl.PublicKey
    public static final android.hardware.camera2.CameraCharacteristics.Key<int[]> HOT_PIXEL_AVAILABLE_HOT_PIXEL_MODES = null;
    @android.hardware.camera2.impl.PublicKey
    public static final android.hardware.camera2.CameraCharacteristics.Key<android.util.Size[]> JPEG_AVAILABLE_THUMBNAIL_SIZES = null;
    @android.hardware.camera2.impl.PublicKey
    public static final android.hardware.camera2.CameraCharacteristics.Key<float[]> LENS_INFO_AVAILABLE_APERTURES = null;
    @android.hardware.camera2.impl.PublicKey
    public static final android.hardware.camera2.CameraCharacteristics.Key<float[]> LENS_INFO_AVAILABLE_FILTER_DENSITIES = null;
    @android.hardware.camera2.impl.PublicKey
    public static final android.hardware.camera2.CameraCharacteristics.Key<float[]> LENS_INFO_AVAILABLE_FOCAL_LENGTHS = null;
    @android.hardware.camera2.impl.PublicKey
    public static final android.hardware.camera2.CameraCharacteristics.Key<int[]> LENS_INFO_AVAILABLE_OPTICAL_STABILIZATION = null;
    @android.hardware.camera2.impl.PublicKey
    public static final android.hardware.camera2.CameraCharacteristics.Key<java.lang.Float> LENS_INFO_HYPERFOCAL_DISTANCE = null;
    @android.hardware.camera2.impl.PublicKey
    public static final android.hardware.camera2.CameraCharacteristics.Key<java.lang.Float> LENS_INFO_MINIMUM_FOCUS_DISTANCE = null;
    public static final android.hardware.camera2.CameraCharacteristics.Key<android.util.Size> LENS_INFO_SHADING_MAP_SIZE = null;
    @android.hardware.camera2.impl.PublicKey
    public static final android.hardware.camera2.CameraCharacteristics.Key<java.lang.Integer> LENS_INFO_FOCUS_DISTANCE_CALIBRATION = null;
    @android.hardware.camera2.impl.PublicKey
    public static final android.hardware.camera2.CameraCharacteristics.Key<java.lang.Integer> LENS_FACING = null;
    @android.hardware.camera2.impl.PublicKey
    public static final android.hardware.camera2.CameraCharacteristics.Key<float[]> LENS_POSE_ROTATION = null;
    @android.hardware.camera2.impl.PublicKey
    public static final android.hardware.camera2.CameraCharacteristics.Key<float[]> LENS_POSE_TRANSLATION = null;
    @android.hardware.camera2.impl.PublicKey
    public static final android.hardware.camera2.CameraCharacteristics.Key<float[]> LENS_INTRINSIC_CALIBRATION = null;
    @java.lang.Deprecated
    @android.hardware.camera2.impl.PublicKey
    public static final android.hardware.camera2.CameraCharacteristics.Key<float[]> LENS_RADIAL_DISTORTION = null;
    @android.hardware.camera2.impl.PublicKey
    public static final android.hardware.camera2.CameraCharacteristics.Key<java.lang.Integer> LENS_POSE_REFERENCE = null;
    @android.hardware.camera2.impl.PublicKey
    public static final android.hardware.camera2.CameraCharacteristics.Key<float[]> LENS_DISTORTION = null;
    @android.hardware.camera2.impl.PublicKey
    public static final android.hardware.camera2.CameraCharacteristics.Key<int[]> NOISE_REDUCTION_AVAILABLE_NOISE_REDUCTION_MODES = null;
    @java.lang.Deprecated
    public static final android.hardware.camera2.CameraCharacteristics.Key<java.lang.Byte> QUIRKS_USE_PARTIAL_RESULT = null;
    public static final android.hardware.camera2.CameraCharacteristics.Key<int[]> REQUEST_MAX_NUM_OUTPUT_STREAMS = null;
    @android.hardware.camera2.impl.PublicKey
    @android.hardware.camera2.impl.SyntheticKey
    public static final android.hardware.camera2.CameraCharacteristics.Key<java.lang.Integer> REQUEST_MAX_NUM_OUTPUT_RAW = null;
    @android.hardware.camera2.impl.PublicKey
    @android.hardware.camera2.impl.SyntheticKey
    public static final android.hardware.camera2.CameraCharacteristics.Key<java.lang.Integer> REQUEST_MAX_NUM_OUTPUT_PROC = null;
    @android.hardware.camera2.impl.PublicKey
    @android.hardware.camera2.impl.SyntheticKey
    public static final android.hardware.camera2.CameraCharacteristics.Key<java.lang.Integer> REQUEST_MAX_NUM_OUTPUT_PROC_STALLING = null;
    @android.hardware.camera2.impl.PublicKey
    public static final android.hardware.camera2.CameraCharacteristics.Key<java.lang.Integer> REQUEST_MAX_NUM_INPUT_STREAMS = null;
    @android.hardware.camera2.impl.PublicKey
    public static final android.hardware.camera2.CameraCharacteristics.Key<java.lang.Byte> REQUEST_PIPELINE_MAX_DEPTH = null;
    @android.hardware.camera2.impl.PublicKey
    public static final android.hardware.camera2.CameraCharacteristics.Key<java.lang.Integer> REQUEST_PARTIAL_RESULT_COUNT = null;
    @android.hardware.camera2.impl.PublicKey
    public static final android.hardware.camera2.CameraCharacteristics.Key<int[]> REQUEST_AVAILABLE_CAPABILITIES = null;
    public static final android.hardware.camera2.CameraCharacteristics.Key<int[]> REQUEST_AVAILABLE_REQUEST_KEYS = null;
    public static final android.hardware.camera2.CameraCharacteristics.Key<int[]> REQUEST_AVAILABLE_RESULT_KEYS = null;
    public static final android.hardware.camera2.CameraCharacteristics.Key<int[]> REQUEST_AVAILABLE_CHARACTERISTICS_KEYS = null;
    public static final android.hardware.camera2.CameraCharacteristics.Key<int[]> REQUEST_AVAILABLE_SESSION_KEYS = null;
    public static final android.hardware.camera2.CameraCharacteristics.Key<int[]> REQUEST_AVAILABLE_PHYSICAL_CAMERA_REQUEST_KEYS = null;
    public static final android.hardware.camera2.CameraCharacteristics.Key<int[]> REQUEST_CHARACTERISTIC_KEYS_NEEDING_PERMISSION = null;
    @java.lang.Deprecated
    public static final android.hardware.camera2.CameraCharacteristics.Key<int[]> SCALER_AVAILABLE_FORMATS = null;
    @java.lang.Deprecated
    public static final android.hardware.camera2.CameraCharacteristics.Key<long[]> SCALER_AVAILABLE_JPEG_MIN_DURATIONS = null;
    @java.lang.Deprecated
    public static final android.hardware.camera2.CameraCharacteristics.Key<android.util.Size[]> SCALER_AVAILABLE_JPEG_SIZES = null;
    @android.hardware.camera2.impl.PublicKey
    public static final android.hardware.camera2.CameraCharacteristics.Key<java.lang.Float> SCALER_AVAILABLE_MAX_DIGITAL_ZOOM = null;
    @java.lang.Deprecated
    public static final android.hardware.camera2.CameraCharacteristics.Key<long[]> SCALER_AVAILABLE_PROCESSED_MIN_DURATIONS = null;
    @java.lang.Deprecated
    public static final android.hardware.camera2.CameraCharacteristics.Key<android.util.Size[]> SCALER_AVAILABLE_PROCESSED_SIZES = null;
    public static final android.hardware.camera2.CameraCharacteristics.Key<android.hardware.camera2.params.ReprocessFormatsMap> SCALER_AVAILABLE_INPUT_OUTPUT_FORMATS_MAP = null;
    public static final android.hardware.camera2.CameraCharacteristics.Key<android.hardware.camera2.params.StreamConfiguration[]> SCALER_AVAILABLE_STREAM_CONFIGURATIONS = null;
    public static final android.hardware.camera2.CameraCharacteristics.Key<android.hardware.camera2.params.StreamConfigurationDuration[]> SCALER_AVAILABLE_MIN_FRAME_DURATIONS = null;
    public static final android.hardware.camera2.CameraCharacteristics.Key<android.hardware.camera2.params.StreamConfigurationDuration[]> SCALER_AVAILABLE_STALL_DURATIONS = null;
    @android.hardware.camera2.impl.PublicKey
    @android.hardware.camera2.impl.SyntheticKey
    public static final android.hardware.camera2.CameraCharacteristics.Key<android.hardware.camera2.params.StreamConfigurationMap> SCALER_STREAM_CONFIGURATION_MAP = null;
    @android.hardware.camera2.impl.PublicKey
    public static final android.hardware.camera2.CameraCharacteristics.Key<java.lang.Integer> SCALER_CROPPING_TYPE = null;
    public static final android.hardware.camera2.CameraCharacteristics.Key<android.hardware.camera2.params.RecommendedStreamConfiguration[]> SCALER_AVAILABLE_RECOMMENDED_STREAM_CONFIGURATIONS = null;
    public static final android.hardware.camera2.CameraCharacteristics.Key<android.hardware.camera2.params.ReprocessFormatsMap> SCALER_AVAILABLE_RECOMMENDED_INPUT_OUTPUT_FORMATS_MAP = null;
    @android.hardware.camera2.impl.PublicKey
    @android.hardware.camera2.impl.SyntheticKey
    public static final android.hardware.camera2.CameraCharacteristics.Key<android.hardware.camera2.params.MandatoryStreamCombination[]> SCALER_MANDATORY_STREAM_COMBINATIONS = null;
    @android.hardware.camera2.impl.PublicKey
    public static final android.hardware.camera2.CameraCharacteristics.Key<android.graphics.Rect> SENSOR_INFO_ACTIVE_ARRAY_SIZE = null;
    @android.hardware.camera2.impl.PublicKey
    public static final android.hardware.camera2.CameraCharacteristics.Key<android.util.Range<java.lang.Integer>> SENSOR_INFO_SENSITIVITY_RANGE = null;
    @android.hardware.camera2.impl.PublicKey
    public static final android.hardware.camera2.CameraCharacteristics.Key<java.lang.Integer> SENSOR_INFO_COLOR_FILTER_ARRANGEMENT = null;
    @android.hardware.camera2.impl.PublicKey
    public static final android.hardware.camera2.CameraCharacteristics.Key<android.util.Range<java.lang.Long>> SENSOR_INFO_EXPOSURE_TIME_RANGE = null;
    @android.hardware.camera2.impl.PublicKey
    public static final android.hardware.camera2.CameraCharacteristics.Key<java.lang.Long> SENSOR_INFO_MAX_FRAME_DURATION = null;
    @android.hardware.camera2.impl.PublicKey
    public static final android.hardware.camera2.CameraCharacteristics.Key<android.util.SizeF> SENSOR_INFO_PHYSICAL_SIZE = null;
    @android.hardware.camera2.impl.PublicKey
    public static final android.hardware.camera2.CameraCharacteristics.Key<android.util.Size> SENSOR_INFO_PIXEL_ARRAY_SIZE = null;
    @android.hardware.camera2.impl.PublicKey
    public static final android.hardware.camera2.CameraCharacteristics.Key<java.lang.Integer> SENSOR_INFO_WHITE_LEVEL = null;
    @android.hardware.camera2.impl.PublicKey
    public static final android.hardware.camera2.CameraCharacteristics.Key<java.lang.Integer> SENSOR_INFO_TIMESTAMP_SOURCE = null;
    @android.hardware.camera2.impl.PublicKey
    public static final android.hardware.camera2.CameraCharacteristics.Key<java.lang.Boolean> SENSOR_INFO_LENS_SHADING_APPLIED = null;
    @android.hardware.camera2.impl.PublicKey
    public static final android.hardware.camera2.CameraCharacteristics.Key<android.graphics.Rect> SENSOR_INFO_PRE_CORRECTION_ACTIVE_ARRAY_SIZE = null;
    @android.hardware.camera2.impl.PublicKey
    public static final android.hardware.camera2.CameraCharacteristics.Key<java.lang.Integer> SENSOR_REFERENCE_ILLUMINANT1 = null;
    @android.hardware.camera2.impl.PublicKey
    public static final android.hardware.camera2.CameraCharacteristics.Key<java.lang.Byte> SENSOR_REFERENCE_ILLUMINANT2 = null;
    @android.hardware.camera2.impl.PublicKey
    public static final android.hardware.camera2.CameraCharacteristics.Key<android.hardware.camera2.params.ColorSpaceTransform> SENSOR_CALIBRATION_TRANSFORM1 = null;
    @android.hardware.camera2.impl.PublicKey
    public static final android.hardware.camera2.CameraCharacteristics.Key<android.hardware.camera2.params.ColorSpaceTransform> SENSOR_CALIBRATION_TRANSFORM2 = null;
    @android.hardware.camera2.impl.PublicKey
    public static final android.hardware.camera2.CameraCharacteristics.Key<android.hardware.camera2.params.ColorSpaceTransform> SENSOR_COLOR_TRANSFORM1 = null;
    @android.hardware.camera2.impl.PublicKey
    public static final android.hardware.camera2.CameraCharacteristics.Key<android.hardware.camera2.params.ColorSpaceTransform> SENSOR_COLOR_TRANSFORM2 = null;
    @android.hardware.camera2.impl.PublicKey
    public static final android.hardware.camera2.CameraCharacteristics.Key<android.hardware.camera2.params.ColorSpaceTransform> SENSOR_FORWARD_MATRIX1 = null;
    @android.hardware.camera2.impl.PublicKey
    public static final android.hardware.camera2.CameraCharacteristics.Key<android.hardware.camera2.params.ColorSpaceTransform> SENSOR_FORWARD_MATRIX2 = null;
    @android.hardware.camera2.impl.PublicKey
    public static final android.hardware.camera2.CameraCharacteristics.Key<android.hardware.camera2.params.BlackLevelPattern> SENSOR_BLACK_LEVEL_PATTERN = null;
    @android.hardware.camera2.impl.PublicKey
    public static final android.hardware.camera2.CameraCharacteristics.Key<java.lang.Integer> SENSOR_MAX_ANALOG_SENSITIVITY = null;
    @android.hardware.camera2.impl.PublicKey
    public static final android.hardware.camera2.CameraCharacteristics.Key<java.lang.Integer> SENSOR_ORIENTATION = null;
    @android.hardware.camera2.impl.PublicKey
    public static final android.hardware.camera2.CameraCharacteristics.Key<int[]> SENSOR_AVAILABLE_TEST_PATTERN_MODES = null;
    @android.hardware.camera2.impl.PublicKey
    public static final android.hardware.camera2.CameraCharacteristics.Key<android.graphics.Rect[]> SENSOR_OPTICAL_BLACK_REGIONS = null;
    @android.hardware.camera2.impl.PublicKey
    public static final android.hardware.camera2.CameraCharacteristics.Key<int[]> SHADING_AVAILABLE_MODES = null;
    @android.hardware.camera2.impl.PublicKey
    public static final android.hardware.camera2.CameraCharacteristics.Key<int[]> STATISTICS_INFO_AVAILABLE_FACE_DETECT_MODES = null;
    @android.hardware.camera2.impl.PublicKey
    public static final android.hardware.camera2.CameraCharacteristics.Key<java.lang.Integer> STATISTICS_INFO_MAX_FACE_COUNT = null;
    @android.hardware.camera2.impl.PublicKey
    public static final android.hardware.camera2.CameraCharacteristics.Key<boolean[]> STATISTICS_INFO_AVAILABLE_HOT_PIXEL_MAP_MODES = null;
    @android.hardware.camera2.impl.PublicKey
    public static final android.hardware.camera2.CameraCharacteristics.Key<int[]> STATISTICS_INFO_AVAILABLE_LENS_SHADING_MAP_MODES = null;
    @android.hardware.camera2.impl.PublicKey
    public static final android.hardware.camera2.CameraCharacteristics.Key<int[]> STATISTICS_INFO_AVAILABLE_OIS_DATA_MODES = null;
    @android.hardware.camera2.impl.PublicKey
    public static final android.hardware.camera2.CameraCharacteristics.Key<java.lang.Integer> TONEMAP_MAX_CURVE_POINTS = null;
    @android.hardware.camera2.impl.PublicKey
    public static final android.hardware.camera2.CameraCharacteristics.Key<int[]> TONEMAP_AVAILABLE_TONE_MAP_MODES = null;
    public static final android.hardware.camera2.CameraCharacteristics.Key<int[]> LED_AVAILABLE_LEDS = null;
    @android.hardware.camera2.impl.PublicKey
    public static final android.hardware.camera2.CameraCharacteristics.Key<java.lang.Integer> INFO_SUPPORTED_HARDWARE_LEVEL = null;
    @android.hardware.camera2.impl.PublicKey
    public static final android.hardware.camera2.CameraCharacteristics.Key<java.lang.String> INFO_VERSION = null;
    @android.hardware.camera2.impl.PublicKey
    public static final android.hardware.camera2.CameraCharacteristics.Key<java.lang.Integer> SYNC_MAX_LATENCY = null;
    @android.hardware.camera2.impl.PublicKey
    public static final android.hardware.camera2.CameraCharacteristics.Key<java.lang.Integer> REPROCESS_MAX_CAPTURE_STALL = null;
    public static final android.hardware.camera2.CameraCharacteristics.Key<android.hardware.camera2.params.StreamConfiguration[]> DEPTH_AVAILABLE_DEPTH_STREAM_CONFIGURATIONS = null;
    public static final android.hardware.camera2.CameraCharacteristics.Key<android.hardware.camera2.params.StreamConfigurationDuration[]> DEPTH_AVAILABLE_DEPTH_MIN_FRAME_DURATIONS = null;
    public static final android.hardware.camera2.CameraCharacteristics.Key<android.hardware.camera2.params.StreamConfigurationDuration[]> DEPTH_AVAILABLE_DEPTH_STALL_DURATIONS = null;
    @android.hardware.camera2.impl.PublicKey
    public static final android.hardware.camera2.CameraCharacteristics.Key<java.lang.Boolean> DEPTH_DEPTH_IS_EXCLUSIVE = null;
    public static final android.hardware.camera2.CameraCharacteristics.Key<android.hardware.camera2.params.RecommendedStreamConfiguration[]> DEPTH_AVAILABLE_RECOMMENDED_DEPTH_STREAM_CONFIGURATIONS = null;
    public static final android.hardware.camera2.CameraCharacteristics.Key<android.hardware.camera2.params.StreamConfiguration[]> DEPTH_AVAILABLE_DYNAMIC_DEPTH_STREAM_CONFIGURATIONS = null;
    public static final android.hardware.camera2.CameraCharacteristics.Key<android.hardware.camera2.params.StreamConfigurationDuration[]> DEPTH_AVAILABLE_DYNAMIC_DEPTH_MIN_FRAME_DURATIONS = null;
    public static final android.hardware.camera2.CameraCharacteristics.Key<android.hardware.camera2.params.StreamConfigurationDuration[]> DEPTH_AVAILABLE_DYNAMIC_DEPTH_STALL_DURATIONS = null;
    public static final android.hardware.camera2.CameraCharacteristics.Key<byte[]> LOGICAL_MULTI_CAMERA_PHYSICAL_IDS = null;
    @android.hardware.camera2.impl.PublicKey
    public static final android.hardware.camera2.CameraCharacteristics.Key<java.lang.Integer> LOGICAL_MULTI_CAMERA_SENSOR_SYNC_TYPE = null;
    @android.hardware.camera2.impl.PublicKey
    public static final android.hardware.camera2.CameraCharacteristics.Key<int[]> DISTORTION_CORRECTION_AVAILABLE_MODES = null;
    public static final android.hardware.camera2.CameraCharacteristics.Key<android.hardware.camera2.params.StreamConfiguration[]> HEIC_AVAILABLE_HEIC_STREAM_CONFIGURATIONS = null;
    public static final android.hardware.camera2.CameraCharacteristics.Key<android.hardware.camera2.params.StreamConfigurationDuration[]> HEIC_AVAILABLE_HEIC_MIN_FRAME_DURATIONS = null;
    public static final android.hardware.camera2.CameraCharacteristics.Key<android.hardware.camera2.params.StreamConfigurationDuration[]> HEIC_AVAILABLE_HEIC_STALL_DURATIONS = null;
    public CameraCharacteristics(android.hardware.camera2.impl.CameraMetadataNative p0) { super(); }
    public android.hardware.camera2.impl.CameraMetadataNative getNativeCopy() { return null; }
    public <T extends java.lang.Object> T get(android.hardware.camera2.CameraCharacteristics.Key<T> p0) { return null; }
    protected <T extends java.lang.Object> T getProtected(android.hardware.camera2.CameraCharacteristics.Key<?> p0) { return null; }
    protected java.lang.Class<android.hardware.camera2.CameraCharacteristics.Key<?>> getKeyClass() { return null; }
    public java.util.List<android.hardware.camera2.CameraCharacteristics.Key<?>> getKeys() { return null; }
    public java.util.List<android.hardware.camera2.CameraCharacteristics.Key<?>> getKeysNeedingPermission() { return null; }
    public android.hardware.camera2.params.RecommendedStreamConfigurationMap getRecommendedStreamConfigurationMap(int p0) { return null; }
    public java.util.List<android.hardware.camera2.CaptureRequest.Key<?>> getAvailableSessionKeys() { return null; }
    public java.util.List<android.hardware.camera2.CaptureRequest.Key<?>> getAvailablePhysicalCameraRequestKeys() { return null; }
    public java.util.List<android.hardware.camera2.CaptureRequest.Key<?>> getAvailableCaptureRequestKeys() { return null; }
    public java.util.List<android.hardware.camera2.CaptureResult.Key<?>> getAvailableCaptureResultKeys() { return null; }
    private <TKey extends java.lang.Object> java.util.List<TKey> getAvailableKeyList(java.lang.Class<?> p0, java.lang.Class<TKey> p1, int[] p2, boolean p3) { return null; }
    public java.util.Set<java.lang.String> getPhysicalCameraIds() { return null; }

    public static final class Key<T extends java.lang.Object> {
        private final android.hardware.camera2.impl.CameraMetadataNative.Key<T> mKey = null;
        @android.annotation.UnsupportedAppUsage
        public Key(java.lang.String p0, java.lang.Class<T> p1, long p2) {}
        public Key(java.lang.String p0, java.lang.String p1, java.lang.Class<T> p2) {}
        public Key(java.lang.String p0, java.lang.Class<T> p1) {}
        @android.annotation.UnsupportedAppUsage
        public Key(java.lang.String p0, android.hardware.camera2.utils.TypeReference<T> p1) {}
        public java.lang.String getName() { return null; }
        public long getVendorId() { return 0L; }
        public final int hashCode() { return 0; }
        public final boolean equals(java.lang.Object p0) { return false; }
        public java.lang.String toString() { return null; }
        @android.annotation.UnsupportedAppUsage
        public android.hardware.camera2.impl.CameraMetadataNative.Key<T> getNativeKey() { return null; }
        private Key(android.hardware.camera2.impl.CameraMetadataNative.Key<?> p0) {}
    }
}
