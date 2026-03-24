package android.hardware;

@java.lang.Deprecated
public class Camera {
    public static final java.lang.String ACTION_NEW_PICTURE = "android.hardware.action.NEW_PICTURE";
    public static final java.lang.String ACTION_NEW_VIDEO = "android.hardware.action.NEW_VIDEO";
    public static final int CAMERA_HAL_API_VERSION_1_0 = 256;
    public static final int CAMERA_HAL_API_VERSION_3_0 = 768;
    public static final int CAMERA_ERROR_UNKNOWN = 1;
    public static final int CAMERA_ERROR_EVICTED = 2;
    public static final int CAMERA_ERROR_DISABLED = 3;
    public static final int CAMERA_ERROR_SERVER_DIED = 100;
    public static native int getNumberOfCameras();
    public static void getCameraInfo(int p0, android.hardware.Camera.CameraInfo p1) {}
    public static android.hardware.Camera open(int p0) { return null; }
    public static android.hardware.Camera open() { return null; }
    public static android.hardware.Camera openLegacy(int p0, int p1) { return null; }
    Camera(int p0) {}
    public static boolean checkInitErrors(int p0) { return false; }
    public static android.hardware.Camera openUninitialized() { return null; }
    Camera() {}
    protected void finalize() {}
    public final void release() {}
    public final native void unlock();
    public final native void lock();
    public final native void reconnect() throws java.io.IOException;
    public final void setPreviewDisplay(android.view.SurfaceHolder p0) throws java.io.IOException {}
    public final native void setPreviewSurface(android.view.Surface p0) throws java.io.IOException;
    public final native void setPreviewTexture(android.graphics.SurfaceTexture p0) throws java.io.IOException;
    public final native void startPreview();
    public final void stopPreview() {}
    public final native boolean previewEnabled();
    public final void setPreviewCallback(android.hardware.Camera.PreviewCallback p0) {}
    public final void setOneShotPreviewCallback(android.hardware.Camera.PreviewCallback p0) {}
    public final void setPreviewCallbackWithBuffer(android.hardware.Camera.PreviewCallback p0) {}
    public final void addCallbackBuffer(byte[] p0) {}
    public final void addRawImageCallbackBuffer(byte[] p0) {}
    public final android.renderscript.Allocation createPreviewAllocation(android.renderscript.RenderScript p0, int p1) throws android.renderscript.RSIllegalArgumentException { return null; }
    public final void setPreviewCallbackAllocation(android.renderscript.Allocation p0) throws java.io.IOException {}
    public final void autoFocus(android.hardware.Camera.AutoFocusCallback p0) {}
    public final void cancelAutoFocus() {}
    public void setAutoFocusMoveCallback(android.hardware.Camera.AutoFocusMoveCallback p0) {}
    public final void takePicture(android.hardware.Camera.ShutterCallback p0, android.hardware.Camera.PictureCallback p1, android.hardware.Camera.PictureCallback p2) {}
    public final void takePicture(android.hardware.Camera.ShutterCallback p0, android.hardware.Camera.PictureCallback p1, android.hardware.Camera.PictureCallback p2, android.hardware.Camera.PictureCallback p3) {}
    public final native void startSmoothZoom(int p0);
    public final native void stopSmoothZoom();
    public final native void setDisplayOrientation(int p0);
    public final boolean enableShutterSound(boolean p0) { return false; }
    public final boolean disableShutterSound() { return false; }
    public final void setZoomChangeListener(android.hardware.Camera.OnZoomChangeListener p0) {}
    public final void setFaceDetectionListener(android.hardware.Camera.FaceDetectionListener p0) {}
    public final void startFaceDetection() {}
    public final void stopFaceDetection() {}
    public final void setErrorCallback(android.hardware.Camera.ErrorCallback p0) {}
    public final void setDetailedErrorCallback(android.hardware.Camera.ErrorCallback p0) {}
    public void setParameters(android.hardware.Camera.Parameters p0) {}
    public android.hardware.Camera.Parameters getParameters() { return null; }
    public static android.hardware.Camera.Parameters getEmptyParameters() { return null; }
    public static android.hardware.Camera.Parameters getParametersCopy(android.hardware.Camera.Parameters p0) { return null; }
    public final native void setAudioRestriction(int p0);
    public final native int getAudioRestriction();

    @java.lang.Deprecated
    public static interface AutoFocusCallback {
        public void onAutoFocus(boolean p0, android.hardware.Camera p1);
    }

    @java.lang.Deprecated
    public static interface OnZoomChangeListener {
        public void onZoomChange(int p0, boolean p1, android.hardware.Camera p2);
    }

    @java.lang.Deprecated
    public class Parameters {
        public static final java.lang.String WHITE_BALANCE_AUTO = "auto";
        public static final java.lang.String WHITE_BALANCE_INCANDESCENT = "incandescent";
        public static final java.lang.String WHITE_BALANCE_FLUORESCENT = "fluorescent";
        public static final java.lang.String WHITE_BALANCE_WARM_FLUORESCENT = "warm-fluorescent";
        public static final java.lang.String WHITE_BALANCE_DAYLIGHT = "daylight";
        public static final java.lang.String WHITE_BALANCE_CLOUDY_DAYLIGHT = "cloudy-daylight";
        public static final java.lang.String WHITE_BALANCE_TWILIGHT = "twilight";
        public static final java.lang.String WHITE_BALANCE_SHADE = "shade";
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
        public static final java.lang.String SCENE_MODE_BARCODE = "barcode";
        public static final java.lang.String SCENE_MODE_HDR = "hdr";
        public static final java.lang.String FOCUS_MODE_AUTO = "auto";
        public static final java.lang.String FOCUS_MODE_INFINITY = "infinity";
        public static final java.lang.String FOCUS_MODE_MACRO = "macro";
        public static final java.lang.String FOCUS_MODE_FIXED = "fixed";
        public static final java.lang.String FOCUS_MODE_EDOF = "edof";
        public static final java.lang.String FOCUS_MODE_CONTINUOUS_VIDEO = "continuous-video";
        public static final java.lang.String FOCUS_MODE_CONTINUOUS_PICTURE = "continuous-picture";
        public static final int FOCUS_DISTANCE_NEAR_INDEX = 0;
        public static final int FOCUS_DISTANCE_OPTIMAL_INDEX = 1;
        public static final int FOCUS_DISTANCE_FAR_INDEX = 2;
        public static final int PREVIEW_FPS_MIN_INDEX = 0;
        public static final int PREVIEW_FPS_MAX_INDEX = 1;
        public void copyFrom(android.hardware.Camera.Parameters p0) {}
        public boolean same(android.hardware.Camera.Parameters p0) { return false; }
        @java.lang.Deprecated
        public void dump() {}
        public java.lang.String flatten() { return null; }
        public void unflatten(java.lang.String p0) {}
        public void remove(java.lang.String p0) {}
        public void set(java.lang.String p0, java.lang.String p1) {}
        public void set(java.lang.String p0, int p1) {}
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
    }

    @java.lang.Deprecated
    public static interface PreviewCallback {
        public void onPreviewFrame(byte[] p0, android.hardware.Camera p1);
    }

    @java.lang.Deprecated
    public static interface FaceDetectionListener {
        public void onFaceDetection(android.hardware.Camera.Face[] p0, android.hardware.Camera p1);
    }

    @java.lang.Deprecated
    public static class Area {
        public android.graphics.Rect rect;
        public int weight;
        public Area(android.graphics.Rect p0, int p1) {}
        public boolean equals(java.lang.Object p0) { return false; }
    }

    @java.lang.Deprecated
    public class Size {
        public int width;
        public int height;
        public Size(android.hardware.Camera p0, int p1, int p2) {}
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
    }

    @java.lang.Deprecated
    public static interface AutoFocusMoveCallback {
        public void onAutoFocusMoving(boolean p0, android.hardware.Camera p1);
    }

    @java.lang.Deprecated
    public static interface PictureCallback {
        public void onPictureTaken(byte[] p0, android.hardware.Camera p1);
    }

    @java.lang.Deprecated
    public static interface ShutterCallback {
        public void onShutter();
    }

    @java.lang.Deprecated
    public static class CameraInfo {
        public static final int CAMERA_FACING_BACK = 0;
        public static final int CAMERA_FACING_FRONT = 1;
        public int facing;
        public int orientation;
        public boolean canDisableShutterSound;
        public CameraInfo() {}
    }

    @java.lang.Deprecated
    public static interface ErrorCallback {
        public void onError(int p0, android.hardware.Camera p1);
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

    private class EventHandler extends android.os.Handler {
        public EventHandler(android.hardware.Camera p0, android.hardware.Camera p1, android.os.Looper p2) { super(); }
        public void handleMessage(android.os.Message p0) {}
    }

    private static class IAppOpsCallbackWrapper extends com.android.internal.app.IAppOpsCallback.Stub {
        IAppOpsCallbackWrapper(android.hardware.Camera p0) { super(); }
        public void opChanged(int p0, int p1, java.lang.String p2) {}
    }
}
