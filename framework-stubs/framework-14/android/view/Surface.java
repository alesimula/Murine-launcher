package android.view;

public class Surface implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.view.Surface> CREATOR = null;
    final java.lang.Object mLock = null;
    long mNativeObject;
    public static final int SCALING_MODE_FREEZE = 0;
    public static final int SCALING_MODE_SCALE_TO_WINDOW = 1;
    public static final int SCALING_MODE_SCALE_CROP = 2;
    public static final int SCALING_MODE_NO_SCALE_CROP = 3;
    public static final int ROTATION_0 = 0;
    public static final int ROTATION_90 = 1;
    public static final int ROTATION_180 = 2;
    public static final int ROTATION_270 = 3;
    public static final int FRAME_RATE_COMPATIBILITY_DEFAULT = 0;
    public static final int FRAME_RATE_COMPATIBILITY_FIXED_SOURCE = 1;
    public static final int FRAME_RATE_COMPATIBILITY_EXACT = 100;
    public static final int FRAME_RATE_COMPATIBILITY_NO_VOTE = 101;
    public static final int FRAME_RATE_COMPATIBILITY_MIN = 102;
    public static final int CHANGE_FRAME_RATE_ONLY_IF_SEAMLESS = 0;
    public static final int CHANGE_FRAME_RATE_ALWAYS = 1;
    public Surface() {}
    public Surface(android.view.SurfaceControl p0) {}
    public Surface(android.graphics.SurfaceTexture p0) {}
    protected void finalize() throws java.lang.Throwable {}
    public void release() {}
    public void destroy() {}
    public void hwuiDestroy() {}
    public boolean isValid() { return false; }
    public int getGenerationId() { return 0; }
    public long getNextFrameNumber() { return 0L; }
    public boolean isConsumerRunningBehind() { return false; }
    public android.graphics.Point getDefaultSize() { return null; }
    public android.graphics.Canvas lockCanvas(android.graphics.Rect p0) throws android.view.Surface.OutOfResourcesException, java.lang.IllegalArgumentException { return null; }
    public void unlockCanvasAndPost(android.graphics.Canvas p0) {}
    public android.graphics.Canvas lockHardwareCanvas() { return null; }
    public android.graphics.Canvas lockHardwareWideColorGamutCanvas() { return null; }
    @java.lang.Deprecated
    public void unlockCanvas(android.graphics.Canvas p0) {}
    void setCompatibilityTranslator(android.content.res.CompatibilityInfo.Translator p0) {}
    public void copyFrom(android.view.SurfaceControl p0) {}
    public void copyFrom(android.graphics.BLASTBufferQueue p0) {}
    public void createFrom(android.view.SurfaceControl p0) {}
    @java.lang.Deprecated
    public void transferFrom(android.view.Surface p0) {}
    public int describeContents() { return 0; }
    public void readFromParcel(android.os.Parcel p0) {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public java.lang.String toString() { return null; }
    public void allocateBuffers() {}
    public void setScalingMode(int p0) {}
    void forceScopedDisconnect() {}
    public void attachAndQueueBufferWithColorSpace(android.hardware.HardwareBuffer p0, android.graphics.ColorSpace p1) {}
    public boolean isSingleBuffered() { return false; }
    public void setSharedBufferModeEnabled(boolean p0) {}
    public boolean isSharedBufferModeEnabled() { return false; }
    public void setAutoRefreshEnabled(boolean p0) {}
    public boolean isAutoRefreshEnabled() { return false; }
    public void setFrameRate(float p0, int p1, int p2) {}
    public void clearFrameRate() {}
    public void setFrameRate(float p0, int p1) {}
    public static java.lang.String rotationToString(int p0) { return null; }

    public static class OutOfResourcesException extends java.lang.RuntimeException {
        public OutOfResourcesException() { super(); }
        public OutOfResourcesException(java.lang.String p0) { super(); }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ChangeFrameRateStrategy {
    }

    private final class CompatibleCanvas extends android.graphics.Canvas {
        public void setMatrix(android.graphics.Matrix p0) {}
        public void getMatrix(android.graphics.Matrix p0) {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface FrameRateCompatibility {
    }

    private final class HwuiContext {
        HwuiContext(android.view.Surface p0, boolean p1) {}
        android.graphics.Canvas lockCanvas(int p0, int p1) { return null; }
        void unlockAndPost(android.graphics.Canvas p0) {}
        void updateSurface() {}
        void destroy() {}
        boolean isWideColorGamut() { return false; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Rotation {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ScalingMode {
    }
}
