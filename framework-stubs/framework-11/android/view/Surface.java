package android.view;

public class Surface implements android.os.Parcelable {
    private static final java.lang.String TAG = "Surface";
    public static final android.os.Parcelable.Creator<android.view.Surface> CREATOR = null;
    final java.lang.Object mLock = null;
    private java.lang.String mName;
    long mNativeObject;
    private long mLockedObject;
    private int mGenerationId;
    private final android.graphics.Canvas mCanvas = null;
    private android.graphics.Matrix mCompatibleMatrix;
    private android.view.Surface.HwuiContext mHwuiContext;
    private boolean mIsSingleBuffered;
    private boolean mIsSharedBufferModeEnabled;
    private boolean mIsAutoRefreshEnabled;
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
    private static native long nativeCreateFromSurfaceTexture(android.graphics.SurfaceTexture p0) throws android.view.Surface.OutOfResourcesException;
    private static native long nativeCreateFromSurfaceControl(long p0);
    private static native long nativeGetFromSurfaceControl(long p0, long p1);
    private static native long nativeLockCanvas(long p0, android.graphics.Canvas p1, android.graphics.Rect p2) throws android.view.Surface.OutOfResourcesException;
    private static native void nativeUnlockCanvasAndPost(long p0, android.graphics.Canvas p1);
    private static native void nativeRelease(long p0);
    private static native boolean nativeIsValid(long p0);
    private static native boolean nativeIsConsumerRunningBehind(long p0);
    private static native long nativeReadFromParcel(long p0, android.os.Parcel p1);
    private static native void nativeWriteToParcel(long p0, android.os.Parcel p1);
    private static native void nativeAllocateBuffers(long p0);
    private static native int nativeGetWidth(long p0);
    private static native int nativeGetHeight(long p0);
    private static native long nativeGetNextFrameNumber(long p0);
    private static native int nativeSetScalingMode(long p0, int p1);
    private static native int nativeForceScopedDisconnect(long p0);
    private static native int nativeAttachAndQueueBufferWithColorSpace(long p0, android.graphics.GraphicBuffer p1, int p2);
    private static native int nativeSetSharedBufferModeEnabled(long p0, boolean p1);
    private static native int nativeSetAutoRefreshEnabled(long p0, boolean p1);
    private static native int nativeSetFrameRate(long p0, float p1, int p2);
    public Surface() {}
    public Surface(android.view.SurfaceControl p0) {}
    public Surface(android.graphics.SurfaceTexture p0) {}
    private Surface(long p0) {}
    protected void finalize() throws java.lang.Throwable {}
    public void release() {}
    public void destroy() {}
    public void hwuiDestroy() {}
    public boolean isValid() { return false; }
    public int getGenerationId() { return 0; }
    public long getNextFrameNumber() { return 0L; }
    public boolean isConsumerRunningBehind() { return false; }
    public android.graphics.Canvas lockCanvas(android.graphics.Rect p0) throws android.view.Surface.OutOfResourcesException, java.lang.IllegalArgumentException { return null; }
    public void unlockCanvasAndPost(android.graphics.Canvas p0) {}
    private void unlockSwCanvasAndPost(android.graphics.Canvas p0) {}
    public android.graphics.Canvas lockHardwareCanvas() { return null; }
    public android.graphics.Canvas lockHardwareWideColorGamutCanvas() { return null; }
    @java.lang.Deprecated
    public void unlockCanvas(android.graphics.Canvas p0) {}
    void setCompatibilityTranslator(android.content.res.CompatibilityInfo.Translator p0) {}
    public void copyFrom(android.view.SurfaceControl p0) {}
    public void createFrom(android.view.SurfaceControl p0) {}
    @java.lang.Deprecated
    public void transferFrom(android.view.Surface p0) {}
    public int describeContents() { return 0; }
    public void readFromParcel(android.os.Parcel p0) {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public java.lang.String toString() { return null; }
    private void setNativeObjectLocked(long p0) {}
    private void checkNotReleasedLocked() {}
    public void allocateBuffers() {}
    void setScalingMode(int p0) {}
    void forceScopedDisconnect() {}
    public void attachAndQueueBufferWithColorSpace(android.graphics.GraphicBuffer p0, android.graphics.ColorSpace p1) {}
    public void attachAndQueueBuffer(android.graphics.GraphicBuffer p0) {}
    public boolean isSingleBuffered() { return false; }
    public void setSharedBufferModeEnabled(boolean p0) {}
    public boolean isSharedBufferModeEnabled() { return false; }
    public void setAutoRefreshEnabled(boolean p0) {}
    public boolean isAutoRefreshEnabled() { return false; }
    public void setFrameRate(float p0, int p1) {}
    public static java.lang.String rotationToString(int p0) { return null; }

    private final class CompatibleCanvas extends android.graphics.Canvas {
        private android.graphics.Matrix mOrigMatrix;
        private CompatibleCanvas(android.view.Surface p0) { super(); }
        public void setMatrix(android.graphics.Matrix p0) {}
        public void getMatrix(android.graphics.Matrix p0) {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface FrameRateCompatibility {
    }

    private final class HwuiContext {
        private final android.graphics.RenderNode mRenderNode = null;
        private android.graphics.HardwareRenderer mHardwareRenderer;
        private android.graphics.RecordingCanvas mCanvas;
        private final boolean mIsWideColorGamut = false;
        HwuiContext(android.view.Surface p0, boolean p1) {}
        android.graphics.Canvas lockCanvas(int p0, int p1) { return null; }
        void unlockAndPost(android.graphics.Canvas p0) {}
        void updateSurface() {}
        void destroy() {}
        boolean isWideColorGamut() { return false; }
    }

    public static class OutOfResourcesException extends java.lang.RuntimeException {
        public OutOfResourcesException() { super(); }
        public OutOfResourcesException(java.lang.String p0) { super(); }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Rotation {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ScalingMode {
    }
}
