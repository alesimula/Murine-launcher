package android.hardware.camera2;

public final class CaptureRequest extends android.hardware.camera2.CameraMetadata<android.hardware.camera2.CaptureRequest.Key<?>> implements android.os.Parcelable {
    public static final int REQUEST_TYPE_REGULAR = 0;
    public static final int REQUEST_TYPE_REPROCESS = 1;
    public static final int REQUEST_TYPE_ZSL_STILL = 2;
    public static final int REQUEST_TYPE_COUNT = 3;
    public static final android.os.Parcelable.Creator<android.hardware.camera2.CaptureRequest> CREATOR = null;
    @android.hardware.camera2.impl.PublicKey
    public static final android.hardware.camera2.CaptureRequest.Key<java.lang.Integer> COLOR_CORRECTION_MODE = null;
    @android.hardware.camera2.impl.PublicKey
    public static final android.hardware.camera2.CaptureRequest.Key<android.hardware.camera2.params.ColorSpaceTransform> COLOR_CORRECTION_TRANSFORM = null;
    @android.hardware.camera2.impl.PublicKey
    public static final android.hardware.camera2.CaptureRequest.Key<android.hardware.camera2.params.RggbChannelVector> COLOR_CORRECTION_GAINS = null;
    @android.hardware.camera2.impl.PublicKey
    public static final android.hardware.camera2.CaptureRequest.Key<java.lang.Integer> COLOR_CORRECTION_ABERRATION_MODE = null;
    @android.hardware.camera2.impl.PublicKey
    public static final android.hardware.camera2.CaptureRequest.Key<java.lang.Integer> CONTROL_AE_ANTIBANDING_MODE = null;
    @android.hardware.camera2.impl.PublicKey
    public static final android.hardware.camera2.CaptureRequest.Key<java.lang.Integer> CONTROL_AE_EXPOSURE_COMPENSATION = null;
    @android.hardware.camera2.impl.PublicKey
    public static final android.hardware.camera2.CaptureRequest.Key<java.lang.Boolean> CONTROL_AE_LOCK = null;
    @android.hardware.camera2.impl.PublicKey
    public static final android.hardware.camera2.CaptureRequest.Key<java.lang.Integer> CONTROL_AE_MODE = null;
    @android.hardware.camera2.impl.PublicKey
    public static final android.hardware.camera2.CaptureRequest.Key<android.hardware.camera2.params.MeteringRectangle[]> CONTROL_AE_REGIONS = null;
    @android.hardware.camera2.impl.PublicKey
    public static final android.hardware.camera2.CaptureRequest.Key<android.util.Range<java.lang.Integer>> CONTROL_AE_TARGET_FPS_RANGE = null;
    @android.hardware.camera2.impl.PublicKey
    public static final android.hardware.camera2.CaptureRequest.Key<java.lang.Integer> CONTROL_AE_PRECAPTURE_TRIGGER = null;
    @android.hardware.camera2.impl.PublicKey
    public static final android.hardware.camera2.CaptureRequest.Key<java.lang.Integer> CONTROL_AF_MODE = null;
    @android.hardware.camera2.impl.PublicKey
    public static final android.hardware.camera2.CaptureRequest.Key<android.hardware.camera2.params.MeteringRectangle[]> CONTROL_AF_REGIONS = null;
    @android.hardware.camera2.impl.PublicKey
    public static final android.hardware.camera2.CaptureRequest.Key<java.lang.Integer> CONTROL_AF_TRIGGER = null;
    @android.hardware.camera2.impl.PublicKey
    public static final android.hardware.camera2.CaptureRequest.Key<java.lang.Boolean> CONTROL_AWB_LOCK = null;
    @android.hardware.camera2.impl.PublicKey
    public static final android.hardware.camera2.CaptureRequest.Key<java.lang.Integer> CONTROL_AWB_MODE = null;
    @android.hardware.camera2.impl.PublicKey
    public static final android.hardware.camera2.CaptureRequest.Key<android.hardware.camera2.params.MeteringRectangle[]> CONTROL_AWB_REGIONS = null;
    @android.hardware.camera2.impl.PublicKey
    public static final android.hardware.camera2.CaptureRequest.Key<java.lang.Integer> CONTROL_CAPTURE_INTENT = null;
    @android.hardware.camera2.impl.PublicKey
    public static final android.hardware.camera2.CaptureRequest.Key<java.lang.Integer> CONTROL_EFFECT_MODE = null;
    @android.hardware.camera2.impl.PublicKey
    public static final android.hardware.camera2.CaptureRequest.Key<java.lang.Integer> CONTROL_MODE = null;
    @android.hardware.camera2.impl.PublicKey
    public static final android.hardware.camera2.CaptureRequest.Key<java.lang.Integer> CONTROL_SCENE_MODE = null;
    @android.hardware.camera2.impl.PublicKey
    public static final android.hardware.camera2.CaptureRequest.Key<java.lang.Integer> CONTROL_VIDEO_STABILIZATION_MODE = null;
    @android.hardware.camera2.impl.PublicKey
    public static final android.hardware.camera2.CaptureRequest.Key<java.lang.Integer> CONTROL_POST_RAW_SENSITIVITY_BOOST = null;
    @android.hardware.camera2.impl.PublicKey
    public static final android.hardware.camera2.CaptureRequest.Key<java.lang.Boolean> CONTROL_ENABLE_ZSL = null;
    @android.hardware.camera2.impl.PublicKey
    public static final android.hardware.camera2.CaptureRequest.Key<java.lang.Integer> CONTROL_EXTENDED_SCENE_MODE = null;
    @android.hardware.camera2.impl.PublicKey
    public static final android.hardware.camera2.CaptureRequest.Key<java.lang.Float> CONTROL_ZOOM_RATIO = null;
    public static final android.hardware.camera2.CaptureRequest.Key<java.lang.Boolean> CONTROL_AF_REGIONS_SET = null;
    public static final android.hardware.camera2.CaptureRequest.Key<java.lang.Boolean> CONTROL_AE_REGIONS_SET = null;
    public static final android.hardware.camera2.CaptureRequest.Key<java.lang.Boolean> CONTROL_AWB_REGIONS_SET = null;
    @android.hardware.camera2.impl.PublicKey
    public static final android.hardware.camera2.CaptureRequest.Key<java.lang.Integer> EDGE_MODE = null;
    @android.hardware.camera2.impl.PublicKey
    public static final android.hardware.camera2.CaptureRequest.Key<java.lang.Integer> FLASH_MODE = null;
    @android.hardware.camera2.impl.PublicKey
    public static final android.hardware.camera2.CaptureRequest.Key<java.lang.Integer> HOT_PIXEL_MODE = null;
    @android.hardware.camera2.impl.PublicKey
    @android.hardware.camera2.impl.SyntheticKey
    public static final android.hardware.camera2.CaptureRequest.Key<android.location.Location> JPEG_GPS_LOCATION = null;
    public static final android.hardware.camera2.CaptureRequest.Key<double[]> JPEG_GPS_COORDINATES = null;
    public static final android.hardware.camera2.CaptureRequest.Key<java.lang.String> JPEG_GPS_PROCESSING_METHOD = null;
    public static final android.hardware.camera2.CaptureRequest.Key<java.lang.Long> JPEG_GPS_TIMESTAMP = null;
    @android.hardware.camera2.impl.PublicKey
    public static final android.hardware.camera2.CaptureRequest.Key<java.lang.Integer> JPEG_ORIENTATION = null;
    @android.hardware.camera2.impl.PublicKey
    public static final android.hardware.camera2.CaptureRequest.Key<java.lang.Byte> JPEG_QUALITY = null;
    @android.hardware.camera2.impl.PublicKey
    public static final android.hardware.camera2.CaptureRequest.Key<java.lang.Byte> JPEG_THUMBNAIL_QUALITY = null;
    @android.hardware.camera2.impl.PublicKey
    public static final android.hardware.camera2.CaptureRequest.Key<android.util.Size> JPEG_THUMBNAIL_SIZE = null;
    @android.hardware.camera2.impl.PublicKey
    public static final android.hardware.camera2.CaptureRequest.Key<java.lang.Float> LENS_APERTURE = null;
    @android.hardware.camera2.impl.PublicKey
    public static final android.hardware.camera2.CaptureRequest.Key<java.lang.Float> LENS_FILTER_DENSITY = null;
    @android.hardware.camera2.impl.PublicKey
    public static final android.hardware.camera2.CaptureRequest.Key<java.lang.Float> LENS_FOCAL_LENGTH = null;
    @android.hardware.camera2.impl.PublicKey
    public static final android.hardware.camera2.CaptureRequest.Key<java.lang.Float> LENS_FOCUS_DISTANCE = null;
    @android.hardware.camera2.impl.PublicKey
    public static final android.hardware.camera2.CaptureRequest.Key<java.lang.Integer> LENS_OPTICAL_STABILIZATION_MODE = null;
    @android.hardware.camera2.impl.PublicKey
    public static final android.hardware.camera2.CaptureRequest.Key<java.lang.Integer> NOISE_REDUCTION_MODE = null;
    public static final android.hardware.camera2.CaptureRequest.Key<java.lang.Integer> REQUEST_ID = null;
    @android.hardware.camera2.impl.PublicKey
    public static final android.hardware.camera2.CaptureRequest.Key<android.graphics.Rect> SCALER_CROP_REGION = null;
    @android.hardware.camera2.impl.PublicKey
    public static final android.hardware.camera2.CaptureRequest.Key<java.lang.Integer> SCALER_ROTATE_AND_CROP = null;
    public static final android.hardware.camera2.CaptureRequest.Key<java.lang.Boolean> SCALER_CROP_REGION_SET = null;
    @android.hardware.camera2.impl.PublicKey
    public static final android.hardware.camera2.CaptureRequest.Key<java.lang.Long> SENSOR_EXPOSURE_TIME = null;
    @android.hardware.camera2.impl.PublicKey
    public static final android.hardware.camera2.CaptureRequest.Key<java.lang.Long> SENSOR_FRAME_DURATION = null;
    @android.hardware.camera2.impl.PublicKey
    public static final android.hardware.camera2.CaptureRequest.Key<java.lang.Integer> SENSOR_SENSITIVITY = null;
    @android.hardware.camera2.impl.PublicKey
    public static final android.hardware.camera2.CaptureRequest.Key<int[]> SENSOR_TEST_PATTERN_DATA = null;
    @android.hardware.camera2.impl.PublicKey
    public static final android.hardware.camera2.CaptureRequest.Key<java.lang.Integer> SENSOR_TEST_PATTERN_MODE = null;
    @android.hardware.camera2.impl.PublicKey
    public static final android.hardware.camera2.CaptureRequest.Key<java.lang.Integer> SENSOR_PIXEL_MODE = null;
    @android.hardware.camera2.impl.PublicKey
    public static final android.hardware.camera2.CaptureRequest.Key<java.lang.Integer> SHADING_MODE = null;
    @android.hardware.camera2.impl.PublicKey
    public static final android.hardware.camera2.CaptureRequest.Key<java.lang.Integer> STATISTICS_FACE_DETECT_MODE = null;
    @android.hardware.camera2.impl.PublicKey
    public static final android.hardware.camera2.CaptureRequest.Key<java.lang.Boolean> STATISTICS_HOT_PIXEL_MAP_MODE = null;
    @android.hardware.camera2.impl.PublicKey
    public static final android.hardware.camera2.CaptureRequest.Key<java.lang.Integer> STATISTICS_LENS_SHADING_MAP_MODE = null;
    @android.hardware.camera2.impl.PublicKey
    public static final android.hardware.camera2.CaptureRequest.Key<java.lang.Integer> STATISTICS_OIS_DATA_MODE = null;
    public static final android.hardware.camera2.CaptureRequest.Key<float[]> TONEMAP_CURVE_BLUE = null;
    public static final android.hardware.camera2.CaptureRequest.Key<float[]> TONEMAP_CURVE_GREEN = null;
    public static final android.hardware.camera2.CaptureRequest.Key<float[]> TONEMAP_CURVE_RED = null;
    @android.hardware.camera2.impl.PublicKey
    @android.hardware.camera2.impl.SyntheticKey
    public static final android.hardware.camera2.CaptureRequest.Key<android.hardware.camera2.params.TonemapCurve> TONEMAP_CURVE = null;
    @android.hardware.camera2.impl.PublicKey
    public static final android.hardware.camera2.CaptureRequest.Key<java.lang.Integer> TONEMAP_MODE = null;
    @android.hardware.camera2.impl.PublicKey
    public static final android.hardware.camera2.CaptureRequest.Key<java.lang.Float> TONEMAP_GAMMA = null;
    @android.hardware.camera2.impl.PublicKey
    public static final android.hardware.camera2.CaptureRequest.Key<java.lang.Integer> TONEMAP_PRESET_CURVE = null;
    public static final android.hardware.camera2.CaptureRequest.Key<java.lang.Boolean> LED_TRANSMIT = null;
    @android.hardware.camera2.impl.PublicKey
    public static final android.hardware.camera2.CaptureRequest.Key<java.lang.Boolean> BLACK_LEVEL_LOCK = null;
    @android.hardware.camera2.impl.PublicKey
    public static final android.hardware.camera2.CaptureRequest.Key<java.lang.Float> REPROCESS_EFFECTIVE_EXPOSURE_FACTOR = null;
    @android.hardware.camera2.impl.PublicKey
    public static final android.hardware.camera2.CaptureRequest.Key<java.lang.Integer> DISTORTION_CORRECTION_MODE = null;
    public int getRequestType() { return 0; }
    public <T extends java.lang.Object> T get(android.hardware.camera2.CaptureRequest.Key<T> p0) { return null; }
    protected <T extends java.lang.Object> T getProtected(android.hardware.camera2.CaptureRequest.Key<?> p0) { return null; }
    protected java.lang.Class<android.hardware.camera2.CaptureRequest.Key<?>> getKeyClass() { return null; }
    public java.util.List<android.hardware.camera2.CaptureRequest.Key<?>> getKeys() { return null; }
    public java.lang.Object getTag() { return null; }
    public boolean isReprocess() { return false; }
    public boolean isPartOfCRequestList() { return false; }
    public android.hardware.camera2.impl.CameraMetadataNative getNativeCopy() { return null; }
    public int getReprocessableSessionId() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public boolean containsTarget(android.view.Surface p0) { return false; }
    public java.util.Collection<android.view.Surface> getTargets() { return null; }
    public java.lang.String getLogicalCameraId() { return null; }
    public void convertSurfaceToStreamId(android.util.SparseArray<android.hardware.camera2.params.OutputConfiguration> p0) {}
    public void recoverStreamIdToSurface() {}

    public static final class Builder {
        public Builder(android.hardware.camera2.impl.CameraMetadataNative p0, boolean p1, int p2, java.lang.String p3, java.util.Set<java.lang.String> p4) {}
        public void addTarget(android.view.Surface p0) {}
        public void removeTarget(android.view.Surface p0) {}
        public <T extends java.lang.Object> void set(android.hardware.camera2.CaptureRequest.Key<T> p0, T p1) {}
        public <T extends java.lang.Object> T get(android.hardware.camera2.CaptureRequest.Key<T> p0) { return null; }
        public <T extends java.lang.Object> android.hardware.camera2.CaptureRequest.Builder setPhysicalCameraKey(android.hardware.camera2.CaptureRequest.Key<T> p0, T p1, java.lang.String p2) { return null; }
        public <T extends java.lang.Object> T getPhysicalCameraKey(android.hardware.camera2.CaptureRequest.Key<T> p0, java.lang.String p1) { return null; }
        public void setTag(java.lang.Object p0) {}
        public void setPartOfCHSRequestList(boolean p0) {}
        public android.hardware.camera2.CaptureRequest build() { return null; }
        public boolean isEmpty() { return false; }
    }

    public static final class Key<T extends java.lang.Object> {
        public Key(java.lang.String p0, java.lang.Class<T> p1, long p2) {}
        public Key(java.lang.String p0, java.lang.Class<T> p1) {}
        public Key(java.lang.String p0, android.hardware.camera2.utils.TypeReference<T> p1) {}
        public java.lang.String getName() { return null; }
        public long getVendorId() { return 0L; }
        public final int hashCode() { return 0; }
        public final boolean equals(java.lang.Object p0) { return false; }
        public java.lang.String toString() { return null; }
        public android.hardware.camera2.impl.CameraMetadataNative.Key<T> getNativeKey() { return null; }
        Key(android.hardware.camera2.impl.CameraMetadataNative.Key<?> p0) {}
    }
}
