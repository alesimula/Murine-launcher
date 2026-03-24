package android.hardware;

@java.lang.Deprecated
public class Camera {
    private static final java.lang.String TAG = "Camera";
    private static final int CAMERA_MSG_ERROR = 1;
    private static final int CAMERA_MSG_SHUTTER = 2;
    private static final int CAMERA_MSG_FOCUS = 4;
    private static final int CAMERA_MSG_ZOOM = 8;
    private static final int CAMERA_MSG_PREVIEW_FRAME = 16;
    private static final int CAMERA_MSG_VIDEO_FRAME = 32;
    private static final int CAMERA_MSG_POSTVIEW_FRAME = 64;
    private static final int CAMERA_MSG_RAW_IMAGE = 128;
    private static final int CAMERA_MSG_COMPRESSED_IMAGE = 256;
    private static final int CAMERA_MSG_RAW_IMAGE_NOTIFY = 512;
    private static final int CAMERA_MSG_PREVIEW_METADATA = 1024;
    private static final int CAMERA_MSG_FOCUS_MOVE = 2048;
    private static final int CAMERA_MSG_STATS_DATA = 4096;
    private static final int CAMERA_MSG_META_DATA = 8192;
    private long mNativeContext;
    private android.hardware.Camera.EventHandler mEventHandler;
    private android.hardware.Camera.ShutterCallback mShutterCallback;
    private android.hardware.Camera.PictureCallback mRawImageCallback;
    private android.hardware.Camera.PictureCallback mJpegCallback;
    private android.hardware.Camera.PreviewCallback mPreviewCallback;
    private boolean mUsingPreviewAllocation;
    private android.hardware.Camera.PictureCallback mPostviewCallback;
    private android.hardware.Camera.AutoFocusCallback mAutoFocusCallback;
    private android.hardware.Camera.AutoFocusMoveCallback mAutoFocusMoveCallback;
    private android.hardware.Camera.OnZoomChangeListener mZoomListener;
    private android.hardware.Camera.FaceDetectionListener mFaceListener;
    private android.hardware.Camera.ErrorCallback mErrorCallback;
    private android.hardware.Camera.ErrorCallback mDetailedErrorCallback;
    private boolean mOneShot;
    private boolean mWithBuffer;
    private boolean mFaceDetectionRunning;
    private final java.lang.Object mAutoFocusCallbackLock = null;
    private final java.lang.Object mShutterSoundLock = null;
    private com.android.internal.app.IAppOpsService mAppOps;
    private com.android.internal.app.IAppOpsCallback mAppOpsCallback;
    private boolean mHasAppOpsPlayAudio;
    private boolean mShutterSoundEnabledFromApp;
    private static final int NO_ERROR = 0;
    private static final int EACCESS = -13;
    private static final int ENODEV = -19;
    private static final int EBUSY = -16;
    private static final int EINVAL = -22;
    private static final int ENOSYS = -38;
    private static final int EUSERS = -87;
    private static final int EOPNOTSUPP = -95;
    private android.hardware.Camera.CameraDataCallback mCameraDataCallback;
    private android.hardware.Camera.CameraMetaDataCallback mCameraMetaDataCallback;
    public static final java.lang.String ACTION_NEW_PICTURE = "android.hardware.action.NEW_PICTURE";
    public static final java.lang.String ACTION_NEW_VIDEO = "android.hardware.action.NEW_VIDEO";
    public static final int CAMERA_HAL_API_VERSION_1_0 = 256;
    private static final int CAMERA_HAL_API_VERSION_NORMAL_CONNECT = -2;
    private static final int CAMERA_HAL_API_VERSION_UNSPECIFIED = -1;
    private static final int CAMERA_FACE_DETECTION_HW = 0;
    private static final int CAMERA_FACE_DETECTION_SW = 1;
    public static final int CAMERA_ERROR_UNKNOWN = 1;
    public static final int CAMERA_ERROR_EVICTED = 2;
    public static final int CAMERA_ERROR_DISABLED = 3;
    public static final int CAMERA_ERROR_SERVER_DIED = 100;
    public static boolean shouldExposeAuxCamera() { return false; }
    public static int getNumberOfCameras() { return 0; }
    public static native int _getNumberOfCameras();
    public static void getCameraInfo(int p0, android.hardware.Camera.CameraInfo p1) {}
    private static native void _getCameraInfo(int p0, android.hardware.Camera.CameraInfo p1);
    public static android.hardware.Camera open(int p0) { return null; }
    public static android.hardware.Camera open() { return null; }
    public static android.hardware.Camera openLegacy(int p0, int p1) { return null; }
    private Camera(int p0, int p1) {}
    private int cameraInitVersion(int p0, int p1) { return 0; }
    private int cameraInitNormal(int p0) { return 0; }
    public int cameraInitUnspecified(int p0) { return 0; }
    Camera(int p0) {}
    public static boolean checkInitErrors(int p0) { return false; }
    public static android.hardware.Camera openUninitialized() { return null; }
    Camera() {}
    private void initAppOps() {}
    private void releaseAppOps() {}
    protected void finalize() {}
    private final native int native_setup(java.lang.Object p0, int p1, int p2, java.lang.String p3);
    private final native void native_release();
    public final void release() {}
    public final native void unlock();
    public final native void lock();
    public final native void reconnect() throws java.io.IOException;
    public final void setPreviewDisplay(android.view.SurfaceHolder p0) throws java.io.IOException {}
    public final native void setPreviewSurface(android.view.Surface p0) throws java.io.IOException;
    public final native void setPreviewTexture(android.graphics.SurfaceTexture p0) throws java.io.IOException;
    public final native void startPreview();
    public final void stopPreview() {}
    private final native void _stopPreview();
    public final native boolean previewEnabled();
    public final void setPreviewCallback(android.hardware.Camera.PreviewCallback p0) {}
    public final void setOneShotPreviewCallback(android.hardware.Camera.PreviewCallback p0) {}
    private final native void setHasPreviewCallback(boolean p0, boolean p1);
    public final void setPreviewCallbackWithBuffer(android.hardware.Camera.PreviewCallback p0) {}
    public final void addCallbackBuffer(byte[] p0) {}
    public final void addRawImageCallbackBuffer(byte[] p0) {}
    private final void addCallbackBuffer(byte[] p0, int p1) {}
    private final native void _addCallbackBuffer(byte[] p0, int p1);
    public final android.renderscript.Allocation createPreviewAllocation(android.renderscript.RenderScript p0, int p1) throws android.renderscript.RSIllegalArgumentException { return null; }
    public final void setPreviewCallbackAllocation(android.renderscript.Allocation p0) throws java.io.IOException {}
    private final native void setPreviewCallbackSurface(android.view.Surface p0);
    private static void postEventFromNative(java.lang.Object p0, int p1, int p2, int p3, java.lang.Object p4) {}
    public final void autoFocus(android.hardware.Camera.AutoFocusCallback p0) {}
    private final native void native_autoFocus();
    public final void cancelAutoFocus() {}
    private final native void native_cancelAutoFocus();
    public void setAutoFocusMoveCallback(android.hardware.Camera.AutoFocusMoveCallback p0) {}
    private native void enableFocusMoveCallback(int p0);
    public final void takePicture(android.hardware.Camera.ShutterCallback p0, android.hardware.Camera.PictureCallback p1, android.hardware.Camera.PictureCallback p2) {}
    private final native void native_takePicture(int p0);
    public final void takePicture(android.hardware.Camera.ShutterCallback p0, android.hardware.Camera.PictureCallback p1, android.hardware.Camera.PictureCallback p2, android.hardware.Camera.PictureCallback p3) {}
    public final native void startSmoothZoom(int p0);
    public final native void stopSmoothZoom();
    public final native void setDisplayOrientation(int p0);
    public final boolean enableShutterSound(boolean p0) { return false; }
    public final boolean disableShutterSound() { return false; }
    private final native boolean _enableShutterSound(boolean p0);
    private void updateAppOpsPlayAudio() {}
    public final void sendVendorCommand(int p0, int p1, int p2) {}
    private final native void _sendVendorCommand(int p0, int p1, int p2);
    public final void setZoomChangeListener(android.hardware.Camera.OnZoomChangeListener p0) {}
    public final void setFaceDetectionListener(android.hardware.Camera.FaceDetectionListener p0) {}
    public final void startFaceDetection() {}
    public final void stopFaceDetection() {}
    private final native void _startFaceDetection(int p0);
    private final native void _stopFaceDetection();
    public final void setErrorCallback(android.hardware.Camera.ErrorCallback p0) {}
    public final void setDetailedErrorCallback(android.hardware.Camera.ErrorCallback p0) {}
    private final native void native_setParameters(java.lang.String p0);
    private final native java.lang.String native_getParameters();
    public void setParameters(android.hardware.Camera.Parameters p0) {}
    public android.hardware.Camera.Parameters getParameters() { return null; }
    public int getWBCurrentCCT() { return 0; }
    public static android.hardware.Camera.Parameters getEmptyParameters() { return null; }
    private static int byteToInt(byte[] p0, int p1) { return 0; }
    public final void setHistogramMode(android.hardware.Camera.CameraDataCallback p0) {}
    private final native void native_setHistogramMode(boolean p0);
    public final void sendHistogramData() {}
    private final native void native_sendHistogramData();
    public final void setMetadataCb(android.hardware.Camera.CameraMetaDataCallback p0) {}
    private final native void native_setMetadataCb(boolean p0);
    public final void sendMetaData() {}
    private final native void native_sendMetaData();
    public final void setLongshot(boolean p0) {}
    private final native void native_setLongshot(boolean p0);
    public int getCurrentFocusPosition() { return 0; }
    public static android.hardware.Camera.Parameters getParametersCopy(android.hardware.Camera.Parameters p0) { return null; }
    public final native void setAudioRestriction(int p0);
    public final native int getAudioRestriction();

    @java.lang.Deprecated
    public static class Area {
        public android.graphics.Rect rect;
        public int weight;
        public Area(android.graphics.Rect p0, int p1) {}
        public boolean equals(java.lang.Object p0) { return false; }
    }

    @java.lang.Deprecated
    public static interface AutoFocusCallback {
        public void onAutoFocus(boolean p0, android.hardware.Camera p1);
    }

    @java.lang.Deprecated
    public static interface AutoFocusMoveCallback {
        public void onAutoFocusMoving(boolean p0, android.hardware.Camera p1);
    }

    public static interface CameraDataCallback {
        public void onCameraData(int[] p0, android.hardware.Camera p1);
    }

    @java.lang.Deprecated
    public static class CameraInfo {
        public static final int CAMERA_FACING_BACK = 0;
        public static final int CAMERA_FACING_FRONT = 1;
        public static final int CAMERA_SUPPORT_MODE_ZSL = 2;
        public static final int CAMERA_SUPPORT_MODE_NONZSL = 3;
        public int facing;
        public int orientation;
        public boolean canDisableShutterSound;
        public CameraInfo() {}
    }

    public static interface CameraMetaDataCallback {
        public void onCameraMetaData(byte[] p0, android.hardware.Camera p1);
    }

    public class Coordinate {
        public int xCoordinate;
        public int yCoordinate;
        public Coordinate(android.hardware.Camera p0, int p1, int p2) {}
        public boolean equals(java.lang.Object p0) { return false; }
    }

    @java.lang.Deprecated
    public static interface ErrorCallback {
        public void onError(int p0, android.hardware.Camera p1);
    }

    private class EventHandler extends android.os.Handler {
        private final android.hardware.Camera mCamera = null;
        public EventHandler(android.hardware.Camera p0, android.hardware.Camera p1, android.os.Looper p2) { super(); }
        public void handleMessage(android.os.Message p0) {}
    }

    @java.lang.Deprecated
    public static class Face {
        public android.graphics.Rect rect;
        public int score;
        public int id;
        public android.graphics.Point leftEye;
        public android.graphics.Point rightEye;
        public android.graphics.Point mouth;
        public Face() {}
    }

    @java.lang.Deprecated
    public static interface FaceDetectionListener {
        public void onFaceDetection(android.hardware.Camera.Face[] p0, android.hardware.Camera p1);
    }

    private static class IAppOpsCallbackWrapper extends com.android.internal.app.IAppOpsCallback.Stub {
        private final java.lang.ref.WeakReference<android.hardware.Camera> mWeakCamera = null;
        IAppOpsCallbackWrapper(android.hardware.Camera p0) { super(); }
        public void opChanged(int p0, int p1, java.lang.String p2) {}
    }

    @java.lang.Deprecated
    public static interface OnZoomChangeListener {
        public void onZoomChange(int p0, boolean p1, android.hardware.Camera p2);
    }

    @java.lang.Deprecated
    public class Parameters {
        private static final java.lang.String KEY_PREVIEW_SIZE = "preview-size";
        private static final java.lang.String KEY_PREVIEW_FORMAT = "preview-format";
        private static final java.lang.String KEY_PREVIEW_FRAME_RATE = "preview-frame-rate";
        private static final java.lang.String KEY_PREVIEW_FPS_RANGE = "preview-fps-range";
        private static final java.lang.String KEY_PICTURE_SIZE = "picture-size";
        private static final java.lang.String KEY_PICTURE_FORMAT = "picture-format";
        private static final java.lang.String KEY_JPEG_THUMBNAIL_SIZE = "jpeg-thumbnail-size";
        private static final java.lang.String KEY_JPEG_THUMBNAIL_WIDTH = "jpeg-thumbnail-width";
        private static final java.lang.String KEY_JPEG_THUMBNAIL_HEIGHT = "jpeg-thumbnail-height";
        private static final java.lang.String KEY_JPEG_THUMBNAIL_QUALITY = "jpeg-thumbnail-quality";
        private static final java.lang.String KEY_JPEG_QUALITY = "jpeg-quality";
        private static final java.lang.String KEY_ROTATION = "rotation";
        private static final java.lang.String KEY_GPS_LATITUDE = "gps-latitude";
        private static final java.lang.String KEY_GPS_LONGITUDE = "gps-longitude";
        private static final java.lang.String KEY_GPS_ALTITUDE = "gps-altitude";
        private static final java.lang.String KEY_GPS_TIMESTAMP = "gps-timestamp";
        private static final java.lang.String KEY_GPS_PROCESSING_METHOD = "gps-processing-method";
        private static final java.lang.String KEY_WHITE_BALANCE = "whitebalance";
        private static final java.lang.String KEY_EFFECT = "effect";
        private static final java.lang.String KEY_ANTIBANDING = "antibanding";
        private static final java.lang.String KEY_SCENE_MODE = "scene-mode";
        private static final java.lang.String KEY_FLASH_MODE = "flash-mode";
        private static final java.lang.String KEY_FOCUS_MODE = "focus-mode";
        private static final java.lang.String KEY_FOCUS_AREAS = "focus-areas";
        private static final java.lang.String KEY_MAX_NUM_FOCUS_AREAS = "max-num-focus-areas";
        private static final java.lang.String KEY_FOCAL_LENGTH = "focal-length";
        private static final java.lang.String KEY_HORIZONTAL_VIEW_ANGLE = "horizontal-view-angle";
        private static final java.lang.String KEY_VERTICAL_VIEW_ANGLE = "vertical-view-angle";
        private static final java.lang.String KEY_EXPOSURE_COMPENSATION = "exposure-compensation";
        private static final java.lang.String KEY_MAX_EXPOSURE_COMPENSATION = "max-exposure-compensation";
        private static final java.lang.String KEY_MIN_EXPOSURE_COMPENSATION = "min-exposure-compensation";
        private static final java.lang.String KEY_EXPOSURE_COMPENSATION_STEP = "exposure-compensation-step";
        private static final java.lang.String KEY_AUTO_EXPOSURE_LOCK = "auto-exposure-lock";
        private static final java.lang.String KEY_AUTO_EXPOSURE_LOCK_SUPPORTED = "auto-exposure-lock-supported";
        private static final java.lang.String KEY_AUTO_WHITEBALANCE_LOCK = "auto-whitebalance-lock";
        private static final java.lang.String KEY_AUTO_WHITEBALANCE_LOCK_SUPPORTED = "auto-whitebalance-lock-supported";
        private static final java.lang.String KEY_METERING_AREAS = "metering-areas";
        private static final java.lang.String KEY_MAX_NUM_METERING_AREAS = "max-num-metering-areas";
        private static final java.lang.String KEY_ZOOM = "zoom";
        private static final java.lang.String KEY_MAX_ZOOM = "max-zoom";
        private static final java.lang.String KEY_ZOOM_RATIOS = "zoom-ratios";
        private static final java.lang.String KEY_ZOOM_SUPPORTED = "zoom-supported";
        private static final java.lang.String KEY_SMOOTH_ZOOM_SUPPORTED = "smooth-zoom-supported";
        private static final java.lang.String KEY_FOCUS_DISTANCES = "focus-distances";
        private static final java.lang.String KEY_VIDEO_SIZE = "video-size";
        private static final java.lang.String KEY_PREFERRED_PREVIEW_SIZE_FOR_VIDEO = "preferred-preview-size-for-video";
        private static final java.lang.String KEY_MAX_NUM_DETECTED_FACES_HW = "max-num-detected-faces-hw";
        private static final java.lang.String KEY_MAX_NUM_DETECTED_FACES_SW = "max-num-detected-faces-sw";
        private static final java.lang.String KEY_RECORDING_HINT = "recording-hint";
        private static final java.lang.String KEY_VIDEO_SNAPSHOT_SUPPORTED = "video-snapshot-supported";
        private static final java.lang.String KEY_VIDEO_STABILIZATION = "video-stabilization";
        private static final java.lang.String KEY_VIDEO_STABILIZATION_SUPPORTED = "video-stabilization-supported";
        private static final java.lang.String SUPPORTED_VALUES_SUFFIX = "-values";
        private static final java.lang.String TRUE = "true";
        private static final java.lang.String FALSE = "false";
        public static final java.lang.String WHITE_BALANCE_AUTO = "auto";
        public static final java.lang.String WHITE_BALANCE_INCANDESCENT = "incandescent";
        public static final java.lang.String WHITE_BALANCE_FLUORESCENT = "fluorescent";
        public static final java.lang.String WHITE_BALANCE_WARM_FLUORESCENT = "warm-fluorescent";
        public static final java.lang.String WHITE_BALANCE_DAYLIGHT = "daylight";
        public static final java.lang.String WHITE_BALANCE_CLOUDY_DAYLIGHT = "cloudy-daylight";
        public static final java.lang.String WHITE_BALANCE_TWILIGHT = "twilight";
        public static final java.lang.String WHITE_BALANCE_SHADE = "shade";
        public static final java.lang.String WHITE_BALANCE_MANUAL_CCT = "manual-cct";
        public static final java.lang.String EFFECT_NONE = "none";
        public static final java.lang.String EFFECT_MONO = "mono";
        public static final java.lang.String EFFECT_NEGATIVE = "negative";
        public static final java.lang.String EFFECT_SOLARIZE = "solarize";
        public static final java.lang.String EFFECT_SEPIA = "sepia";
        public static final java.lang.String EFFECT_POSTERIZE = "posterize";
        public static final java.lang.String EFFECT_WHITEBOARD = "whiteboard";
        public static final java.lang.String EFFECT_BLACKBOARD = "blackboard";
        public static final java.lang.String EFFECT_AQUA = "aqua";
        public static final java.lang.String ANTIBANDING_AUTO = "auto";
        public static final java.lang.String ANTIBANDING_50HZ = "50hz";
        public static final java.lang.String ANTIBANDING_60HZ = "60hz";
        public static final java.lang.String ANTIBANDING_OFF = "off";
        public static final java.lang.String FLASH_MODE_OFF = "off";
        public static final java.lang.String FLASH_MODE_AUTO = "auto";
        public static final java.lang.String FLASH_MODE_ON = "on";
        public static final java.lang.String FLASH_MODE_RED_EYE = "red-eye";
        public static final java.lang.String FLASH_MODE_TORCH = "torch";
        public static final java.lang.String SCENE_MODE_ASD = "asd";
        public static final java.lang.String SCENE_MODE_AUTO = "auto";
        public static final java.lang.String SCENE_MODE_ACTION = "action";
        public static final java.lang.String SCENE_MODE_PORTRAIT = "portrait";
        public static final java.lang.String SCENE_MODE_LANDSCAPE = "landscape";
        public static final java.lang.String SCENE_MODE_NIGHT = "night";
        public static final java.lang.String SCENE_MODE_NIGHT_PORTRAIT = "night-portrait";
        public static final java.lang.String SCENE_MODE_THEATRE = "theatre";
        public static final java.lang.String SCENE_MODE_BEACH = "beach";
        public static final java.lang.String SCENE_MODE_SNOW = "snow";
        public static final java.lang.String SCENE_MODE_SUNSET = "sunset";
        public static final java.lang.String SCENE_MODE_STEADYPHOTO = "steadyphoto";
        public static final java.lang.String SCENE_MODE_FIREWORKS = "fireworks";
        public static final java.lang.String SCENE_MODE_SPORTS = "sports";
        public static final java.lang.String SCENE_MODE_PARTY = "party";
        public static final java.lang.String SCENE_MODE_CANDLELIGHT = "candlelight";
        public static final java.lang.String SCENE_MODE_BACKLIGHT = "backlight";
        public static final java.lang.String SCENE_MODE_FLOWERS = "flowers";
        public static final java.lang.String SCENE_MODE_BARCODE = "barcode";
        public static final java.lang.String SCENE_MODE_HDR = "hdr";
        public static final java.lang.String FOCUS_MODE_AUTO = "auto";
        public static final java.lang.String FOCUS_MODE_INFINITY = "infinity";
        public static final java.lang.String FOCUS_MODE_MACRO = "macro";
        public static final java.lang.String FOCUS_MODE_FIXED = "fixed";
        public static final java.lang.String FOCUS_MODE_NORMAL = "normal";
        public static final java.lang.String FOCUS_MODE_EDOF = "edof";
        public static final java.lang.String FOCUS_MODE_CONTINUOUS_VIDEO = "continuous-video";
        public static final java.lang.String FOCUS_MODE_CONTINUOUS_PICTURE = "continuous-picture";
        public static final java.lang.String FOCUS_MODE_MANUAL_POSITION = "manual";
        public static final int FOCUS_DISTANCE_NEAR_INDEX = 0;
        public static final int FOCUS_DISTANCE_OPTIMAL_INDEX = 1;
        public static final int FOCUS_DISTANCE_FAR_INDEX = 2;
        public static final int PREVIEW_FPS_MIN_INDEX = 0;
        public static final int PREVIEW_FPS_MAX_INDEX = 1;
        private static final java.lang.String PIXEL_FORMAT_YUV422SP = "yuv422sp";
        private static final java.lang.String PIXEL_FORMAT_YUV420SP = "yuv420sp";
        private static final java.lang.String PIXEL_FORMAT_YUV420SP_ADRENO = "yuv420sp-adreno";
        private static final java.lang.String PIXEL_FORMAT_YUV422I = "yuv422i-yuyv";
        private static final java.lang.String PIXEL_FORMAT_YUV420P = "yuv420p";
        private static final java.lang.String PIXEL_FORMAT_RGB565 = "rgb565";
        private static final java.lang.String PIXEL_FORMAT_JPEG = "jpeg";
        private static final java.lang.String PIXEL_FORMAT_BAYER_RGGB = "bayer-rggb";
        private static final java.lang.String PIXEL_FORMAT_RAW = "raw";
        private static final java.lang.String PIXEL_FORMAT_YV12 = "yv12";
        private static final java.lang.String PIXEL_FORMAT_NV12 = "nv12";
        private final java.util.LinkedHashMap<java.lang.String, java.lang.String> mMap = null;
        private static final java.lang.String KEY_QC_HFR_SIZE = "hfr-size";
        private static final java.lang.String KEY_QC_PREVIEW_FRAME_RATE_MODE = "preview-frame-rate-mode";
        private static final java.lang.String KEY_QC_PREVIEW_FRAME_RATE_AUTO_MODE = "frame-rate-auto";
        private static final java.lang.String KEY_QC_PREVIEW_FRAME_RATE_FIXED_MODE = "frame-rate-fixed";
        private static final java.lang.String KEY_QC_GPS_LATITUDE_REF = "gps-latitude-ref";
        private static final java.lang.String KEY_QC_GPS_LONGITUDE_REF = "gps-longitude-ref";
        private static final java.lang.String KEY_QC_GPS_ALTITUDE_REF = "gps-altitude-ref";
        private static final java.lang.String KEY_QC_GPS_STATUS = "gps-status";
        private static final java.lang.String KEY_QC_EXIF_DATETIME = "exif-datetime";
        private static final java.lang.String KEY_QC_TOUCH_AF_AEC = "touch-af-aec";
        private static final java.lang.String KEY_QC_TOUCH_INDEX_AEC = "touch-index-aec";
        private static final java.lang.String KEY_QC_TOUCH_INDEX_AF = "touch-index-af";
        private static final java.lang.String KEY_QC_MANUAL_FOCUS_POSITION = "manual-focus-position";
        private static final java.lang.String KEY_QC_MANUAL_FOCUS_POS_TYPE = "manual-focus-pos-type";
        private static final java.lang.String KEY_QC_SCENE_DETECT = "scene-detect";
        private static final java.lang.String KEY_QC_ISO_MODE = "iso";
        private static final java.lang.String KEY_QC_EXPOSURE_TIME = "exposure-time";
        private static final java.lang.String KEY_QC_MIN_EXPOSURE_TIME = "min-exposure-time";
        private static final java.lang.String KEY_QC_MAX_EXPOSURE_TIME = "max-exposure-time";
        private static final java.lang.String KEY_QC_LENSSHADE = "lensshade";
        private static final java.lang.String KEY_QC_HISTOGRAM = "histogram";
        private static final java.lang.String KEY_QC_SKIN_TONE_ENHANCEMENT = "skinToneEnhancement";
        private static final java.lang.String KEY_QC_AUTO_EXPOSURE = "auto-exposure";
        private static final java.lang.String KEY_QC_SHARPNESS = "sharpness";
        private static final java.lang.String KEY_QC_MAX_SHARPNESS = "max-sharpness";
        private static final java.lang.String KEY_QC_CONTRAST = "contrast";
        private static final java.lang.String KEY_QC_MAX_CONTRAST = "max-contrast";
        private static final java.lang.String KEY_QC_SATURATION = "saturation";
        private static final java.lang.String KEY_QC_MAX_SATURATION = "max-saturation";
        private static final java.lang.String KEY_QC_DENOISE = "denoise";
        private static final java.lang.String KEY_QC_CONTINUOUS_AF = "continuous-af";
        private static final java.lang.String KEY_QC_SELECTABLE_ZONE_AF = "selectable-zone-af";
        private static final java.lang.String KEY_QC_FACE_DETECTION = "face-detection";
        private static final java.lang.String KEY_QC_MEMORY_COLOR_ENHANCEMENT = "mce";
        private static final java.lang.String KEY_QC_REDEYE_REDUCTION = "redeye-reduction";
        private static final java.lang.String KEY_QC_ZSL = "zsl";
        private static final java.lang.String KEY_QC_CAMERA_MODE = "camera-mode";
        private static final java.lang.String KEY_QC_VIDEO_HIGH_FRAME_RATE = "video-hfr";
        private static final java.lang.String KEY_QC_VIDEO_HDR = "video-hdr";
        private static final java.lang.String KEY_QC_POWER_MODE = "power-mode";
        private static final java.lang.String KEY_QC_POWER_MODE_SUPPORTED = "power-mode-supported";
        private static final java.lang.String KEY_QC_WB_MANUAL_CCT = "wb-manual-cct";
        private static final java.lang.String KEY_QC_MIN_WB_CCT = "min-wb-cct";
        private static final java.lang.String KEY_QC_MAX_WB_CCT = "max-wb-cct";
        private static final java.lang.String KEY_QC_AUTO_HDR_ENABLE = "auto-hdr-enable";
        private static final java.lang.String KEY_QC_VIDEO_ROTATION = "video-rotation";
        public static final java.lang.String KEY_QC_AE_BRACKET_HDR = "ae-bracket-hdr";
        public static final java.lang.String TOUCH_AF_AEC_OFF = "touch-off";
        public static final java.lang.String TOUCH_AF_AEC_ON = "touch-on";
        public static final java.lang.String AUTO_EXPOSURE_FRAME_AVG = "frame-average";
        public static final java.lang.String AUTO_EXPOSURE_CENTER_WEIGHTED = "center-weighted";
        public static final java.lang.String AUTO_EXPOSURE_SPOT_METERING = "spot-metering";
        public static final java.lang.String ISO_AUTO = "auto";
        public static final java.lang.String ISO_HJR = "ISO_HJR";
        public static final java.lang.String ISO_100 = "ISO100";
        public static final java.lang.String ISO_200 = "ISO200";
        public static final java.lang.String ISO_400 = "ISO400";
        public static final java.lang.String ISO_800 = "ISO800";
        public static final java.lang.String ISO_1600 = "ISO1600";
        public static final java.lang.String ISO_3200 = "ISO3200";
        public static final java.lang.String LENSSHADE_ENABLE = "enable";
        public static final java.lang.String LENSSHADE_DISABLE = "disable";
        public static final java.lang.String HISTOGRAM_ENABLE = "enable";
        public static final java.lang.String HISTOGRAM_DISABLE = "disable";
        public static final java.lang.String SKIN_TONE_ENHANCEMENT_ENABLE = "enable";
        public static final java.lang.String SKIN_TONE_ENHANCEMENT_DISABLE = "disable";
        public static final java.lang.String MCE_ENABLE = "enable";
        public static final java.lang.String MCE_DISABLE = "disable";
        public static final java.lang.String ZSL_ON = "on";
        public static final java.lang.String ZSL_OFF = "off";
        public static final java.lang.String AE_BRACKET_HDR_OFF = "Off";
        public static final java.lang.String AE_BRACKET_HDR = "HDR";
        public static final java.lang.String AE_BRACKET = "AE-Bracket";
        public static final java.lang.String LOW_POWER = "Low_Power";
        public static final java.lang.String NORMAL_POWER = "Normal_Power";
        public static final java.lang.String VIDEO_HFR_OFF = "off";
        public static final java.lang.String VIDEO_HFR_2X = "60";
        public static final java.lang.String VIDEO_HFR_3X = "90";
        public static final java.lang.String VIDEO_HFR_4X = "120";
        public static final java.lang.String SCENE_DETECT_OFF = "off";
        public static final java.lang.String SCENE_DETECT_ON = "on";
        public static final java.lang.String CONTINUOUS_AF_OFF = "caf-off";
        public static final java.lang.String CONTINUOUS_AF_ON = "caf-on";
        public static final java.lang.String DENOISE_OFF = "denoise-off";
        public static final java.lang.String DENOISE_ON = "denoise-on";
        public static final java.lang.String REDEYE_REDUCTION_ENABLE = "enable";
        public static final java.lang.String REDEYE_REDUCTION_DISABLE = "disable";
        public static final java.lang.String SELECTABLE_ZONE_AF_AUTO = "auto";
        public static final java.lang.String SELECTABLE_ZONE_AF_SPOTMETERING = "spot-metering";
        public static final java.lang.String SELECTABLE_ZONE_AF_CENTER_WEIGHTED = "center-weighted";
        public static final java.lang.String SELECTABLE_ZONE_AF_FRAME_AVERAGE = "frame-average";
        public static final java.lang.String FACE_DETECTION_OFF = "off";
        public static final java.lang.String FACE_DETECTION_ON = "on";
        public static final java.lang.String VIDEO_ROTATION_0 = "0";
        public static final java.lang.String VIDEO_ROTATION_90 = "90";
        public static final java.lang.String VIDEO_ROTATION_180 = "180";
        public static final java.lang.String VIDEO_ROTATION_270 = "270";
        private static final int MANUAL_FOCUS_POS_TYPE_INDEX = 0;
        private static final int MANUAL_FOCUS_POS_TYPE_DAC = 1;
        private Parameters(android.hardware.Camera p0) {}
        public void copyFrom(android.hardware.Camera.Parameters p0) {}
        private android.hardware.Camera getOuter() { return null; }
        public boolean same(android.hardware.Camera.Parameters p0) { return false; }
        @java.lang.Deprecated
        public void dump() {}
        public java.lang.String flatten() { return null; }
        public void unflatten(java.lang.String p0) {}
        public void remove(java.lang.String p0) {}
        public void set(java.lang.String p0, java.lang.String p1) {}
        public void set(java.lang.String p0, int p1) {}
        private void put(java.lang.String p0, java.lang.String p1) {}
        private void set(java.lang.String p0, java.util.List<android.hardware.Camera.Area> p1) {}
        public java.lang.String get(java.lang.String p0) { return null; }
        public int getInt(java.lang.String p0) { return 0; }
        public void setPreviewSize(int p0, int p1) {}
        public android.hardware.Camera.Size getPreviewSize() { return null; }
        public java.util.List<android.hardware.Camera.Size> getSupportedPreviewSizes() { return null; }
        public java.util.List<android.hardware.Camera.Size> getSupportedVideoSizes() { return null; }
        public android.hardware.Camera.Size getPreferredPreviewSizeForVideo() { return null; }
        public void setJpegThumbnailSize(int p0, int p1) {}
        public android.hardware.Camera.Size getJpegThumbnailSize() { return null; }
        public java.util.List<android.hardware.Camera.Size> getSupportedJpegThumbnailSizes() { return null; }
        public void setJpegThumbnailQuality(int p0) {}
        public int getJpegThumbnailQuality() { return 0; }
        public void setJpegQuality(int p0) {}
        public int getJpegQuality() { return 0; }
        @java.lang.Deprecated
        public void setPreviewFrameRate(int p0) {}
        @java.lang.Deprecated
        public int getPreviewFrameRate() { return 0; }
        @java.lang.Deprecated
        public java.util.List<java.lang.Integer> getSupportedPreviewFrameRates() { return null; }
        public void setPreviewFpsRange(int p0, int p1) {}
        public void getPreviewFpsRange(int[] p0) {}
        public java.util.List<int[]> getSupportedPreviewFpsRange() { return null; }
        public void setPreviewFormat(int p0) {}
        public int getPreviewFormat() { return 0; }
        public java.util.List<java.lang.Integer> getSupportedPreviewFormats() { return null; }
        public void setPictureSize(int p0, int p1) {}
        public android.hardware.Camera.Size getPictureSize() { return null; }
        public java.util.List<android.hardware.Camera.Size> getSupportedPictureSizes() { return null; }
        public void setPictureFormat(int p0) {}
        public int getPictureFormat() { return 0; }
        public java.util.List<java.lang.Integer> getSupportedPictureFormats() { return null; }
        private java.lang.String cameraFormatForPixelFormat(int p0) { return null; }
        private int pixelFormatForCameraFormat(java.lang.String p0) { return 0; }
        public void setRotation(int p0) {}
        public void setGpsLatitude(double p0) {}
        public void setGpsLongitude(double p0) {}
        public void setGpsAltitude(double p0) {}
        public void setGpsTimestamp(long p0) {}
        public void setGpsProcessingMethod(java.lang.String p0) {}
        public void removeGpsData() {}
        public java.lang.String getWhiteBalance() { return null; }
        public void setWhiteBalance(java.lang.String p0) {}
        public java.util.List<java.lang.String> getSupportedWhiteBalance() { return null; }
        public java.lang.String getColorEffect() { return null; }
        public void setColorEffect(java.lang.String p0) {}
        public java.util.List<java.lang.String> getSupportedColorEffects() { return null; }
        public java.lang.String getAntibanding() { return null; }
        public void setAntibanding(java.lang.String p0) {}
        public java.util.List<java.lang.String> getSupportedAntibanding() { return null; }
        public java.lang.String getSceneMode() { return null; }
        public void setSceneMode(java.lang.String p0) {}
        public java.util.List<java.lang.String> getSupportedSceneModes() { return null; }
        public java.lang.String getFlashMode() { return null; }
        public void setFlashMode(java.lang.String p0) {}
        public java.util.List<java.lang.String> getSupportedFlashModes() { return null; }
        public java.lang.String getFocusMode() { return null; }
        public void setFocusMode(java.lang.String p0) {}
        public java.util.List<java.lang.String> getSupportedFocusModes() { return null; }
        public float getFocalLength() { return 0.0f; }
        public float getHorizontalViewAngle() { return 0.0f; }
        public float getVerticalViewAngle() { return 0.0f; }
        public int getExposureCompensation() { return 0; }
        public void setExposureCompensation(int p0) {}
        public int getMaxExposureCompensation() { return 0; }
        public int getMinExposureCompensation() { return 0; }
        public float getExposureCompensationStep() { return 0.0f; }
        public void setAutoExposureLock(boolean p0) {}
        public boolean getAutoExposureLock() { return false; }
        public boolean isAutoExposureLockSupported() { return false; }
        public void setAutoWhiteBalanceLock(boolean p0) {}
        public boolean getAutoWhiteBalanceLock() { return false; }
        public boolean isAutoWhiteBalanceLockSupported() { return false; }
        public int getZoom() { return 0; }
        public void setZoom(int p0) {}
        public boolean isZoomSupported() { return false; }
        public int getMaxZoom() { return 0; }
        public java.util.List<java.lang.Integer> getZoomRatios() { return null; }
        public boolean isSmoothZoomSupported() { return false; }
        public void getFocusDistances(float[] p0) {}
        public int getMaxNumFocusAreas() { return 0; }
        public java.util.List<android.hardware.Camera.Area> getFocusAreas() { return null; }
        public void setFocusAreas(java.util.List<android.hardware.Camera.Area> p0) {}
        public int getMaxNumMeteringAreas() { return 0; }
        public java.util.List<android.hardware.Camera.Area> getMeteringAreas() { return null; }
        public void setMeteringAreas(java.util.List<android.hardware.Camera.Area> p0) {}
        public int getMaxNumDetectedFaces() { return 0; }
        public void setRecordingHint(boolean p0) {}
        public boolean isVideoSnapshotSupported() { return false; }
        public void setVideoStabilization(boolean p0) {}
        public boolean getVideoStabilization() { return false; }
        public boolean isVideoStabilizationSupported() { return false; }
        private java.util.ArrayList<java.lang.String> split(java.lang.String p0) { return null; }
        private java.util.ArrayList<java.lang.Integer> splitInt(java.lang.String p0) { return null; }
        private void splitInt(java.lang.String p0, int[] p1) {}
        private void splitFloat(java.lang.String p0, float[] p1) {}
        private float getFloat(java.lang.String p0, float p1) { return 0.0f; }
        private int getInt(java.lang.String p0, int p1) { return 0; }
        private java.util.ArrayList<android.hardware.Camera.Size> splitSize(java.lang.String p0) { return null; }
        private android.hardware.Camera.Size strToSize(java.lang.String p0) { return null; }
        private java.util.ArrayList<int[]> splitRange(java.lang.String p0) { return null; }
        private java.util.ArrayList<android.hardware.Camera.Area> splitArea(java.lang.String p0) { return null; }
        private boolean same(java.lang.String p0, java.lang.String p1) { return false; }
        public java.util.List<android.hardware.Camera.Size> getSupportedHfrSizes() { return null; }
        public java.util.List<java.lang.String> getSupportedTouchAfAec() { return null; }
        public java.util.List<java.lang.String> getSupportedPreviewFrameRateModes() { return null; }
        public java.util.List<java.lang.String> getSupportedSceneDetectModes() { return null; }
        public java.util.List<java.lang.String> getSupportedIsoValues() { return null; }
        public java.util.List<java.lang.String> getSupportedLensShadeModes() { return null; }
        public java.util.List<java.lang.String> getSupportedHistogramModes() { return null; }
        public java.util.List<java.lang.String> getSupportedSkinToneEnhancementModes() { return null; }
        public java.util.List<java.lang.String> getSupportedAutoexposure() { return null; }
        public java.util.List<java.lang.String> getSupportedMemColorEnhanceModes() { return null; }
        public java.util.List<java.lang.String> getSupportedZSLModes() { return null; }
        public java.util.List<java.lang.String> getSupportedVideoHDRModes() { return null; }
        public java.util.List<java.lang.String> getSupportedVideoHighFrameRateModes() { return null; }
        public java.util.List<java.lang.String> getSupportedContinuousAfModes() { return null; }
        public java.util.List<java.lang.String> getSupportedDenoiseModes() { return null; }
        public java.util.List<java.lang.String> getSupportedSelectableZoneAf() { return null; }
        public java.util.List<java.lang.String> getSupportedFaceDetectionModes() { return null; }
        public java.util.List<java.lang.String> getSupportedRedeyeReductionModes() { return null; }
        public void setGpsAltitudeRef(double p0) {}
        public void setGpsStatus(double p0) {}
        public void setTouchIndexAec(int p0, int p1) {}
        public android.hardware.Camera.Coordinate getTouchIndexAec() { return null; }
        public void setTouchIndexAf(int p0, int p1) {}
        public android.hardware.Camera.Coordinate getTouchIndexAf() { return null; }
        public void setSharpness(int p0) {}
        public void setContrast(int p0) {}
        public void setSaturation(int p0) {}
        public boolean isPowerModeSupported() { return false; }
        public int getSharpness() { return 0; }
        public int getMaxSharpness() { return 0; }
        public int getContrast() { return 0; }
        public int getMaxContrast() { return 0; }
        public int getSaturation() { return 0; }
        public int getMaxSaturation() { return 0; }
        public void setGpsLatitudeRef(java.lang.String p0) {}
        public void setGpsLongitudeRef(java.lang.String p0) {}
        public void setExifDateTime(java.lang.String p0) {}
        public java.lang.String getTouchAfAec() { return null; }
        public void setTouchAfAec(java.lang.String p0) {}
        public java.lang.String getRedeyeReductionMode() { return null; }
        public void setRedeyeReductionMode(java.lang.String p0) {}
        public java.lang.String getPreviewFrameRateMode() { return null; }
        public void setPreviewFrameRateMode(java.lang.String p0) {}
        public java.lang.String getSceneDetectMode() { return null; }
        public void setSceneDetectMode(java.lang.String p0) {}
        public java.lang.String getAEBracket() { return null; }
        public void setPowerMode(java.lang.String p0) {}
        public java.lang.String getPowerMode() { return null; }
        public void setAEBracket(java.lang.String p0) {}
        public java.lang.String getISOValue() { return null; }
        public void setISOValue(java.lang.String p0) {}
        public void setExposureTime(int p0) {}
        public java.lang.String getExposureTime() { return null; }
        public java.lang.String getMinExposureTime() { return null; }
        public java.lang.String getMaxExposureTime() { return null; }
        public java.lang.String getLensShade() { return null; }
        public void setLensShade(java.lang.String p0) {}
        public java.lang.String getAutoExposure() { return null; }
        public void setAutoExposure(java.lang.String p0) {}
        public java.lang.String getMemColorEnhance() { return null; }
        public void setMemColorEnhance(java.lang.String p0) {}
        public void setWBManualCCT(int p0) {}
        public java.lang.String getWBMinCCT() { return null; }
        public java.lang.String getMaxWBCCT() { return null; }
        public java.lang.String getWBCurrentCCT() { return null; }
        public java.lang.String getZSLMode() { return null; }
        public void setZSLMode(java.lang.String p0) {}
        public void setAutoHDRMode(java.lang.String p0) {}
        public java.lang.String getCameraMode() { return null; }
        public void setCameraMode(int p0) {}
        public void setFocusPosition(int p0, int p1) {}
        public java.lang.String getCurrentFocusPosition() { return null; }
        public java.lang.String getVideoHighFrameRate() { return null; }
        public void setVideoHighFrameRate(java.lang.String p0) {}
        public java.lang.String getVideoHDRMode() { return null; }
        public void setVideoHDRMode(java.lang.String p0) {}
        public java.lang.String getDenoise() { return null; }
        public java.lang.String getContinuousAf() { return null; }
        public void setDenoise(java.lang.String p0) {}
        public void setContinuousAf(java.lang.String p0) {}
        public java.lang.String getSelectableZoneAf() { return null; }
        public void setSelectableZoneAf(java.lang.String p0) {}
        public java.lang.String getFaceDetectionMode() { return null; }
        public void setFaceDetectionMode(java.lang.String p0) {}
        public java.lang.String getVideoRotation() { return null; }
        public void setVideoRotation(java.lang.String p0) {}
        public java.util.List<java.lang.String> getSupportedVideoRotationValues() { return null; }
        private java.util.ArrayList<android.hardware.Camera.Coordinate> splitCoordinate(java.lang.String p0) { return null; }
        private android.hardware.Camera.Coordinate strToCoordinate(java.lang.String p0) { return null; }
    }

    @java.lang.Deprecated
    public static interface PictureCallback {
        public void onPictureTaken(byte[] p0, android.hardware.Camera p1);
    }

    @java.lang.Deprecated
    public static interface PreviewCallback {
        public void onPreviewFrame(byte[] p0, android.hardware.Camera p1);
    }

    @java.lang.Deprecated
    public static interface ShutterCallback {
        public void onShutter();
    }

    @java.lang.Deprecated
    public class Size {
        public int width;
        public int height;
        public Size(android.hardware.Camera p0, int p1, int p2) {}
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
    }
}
