package android.window;

public class ScreenCapture {
    public ScreenCapture() {}
    public static int captureDisplay(android.window.ScreenCapture.DisplayCaptureArgs p0, android.window.ScreenCapture.ScreenCaptureListener p1) { return 0; }
    public static android.window.ScreenCapture.ScreenshotHardwareBuffer captureDisplay(android.window.ScreenCapture.DisplayCaptureArgs p0) { return null; }
    public static android.window.ScreenCapture.ScreenshotHardwareBuffer captureLayers(android.view.SurfaceControl p0, android.graphics.Rect p1, float p2) { return null; }
    public static android.window.ScreenCapture.ScreenshotHardwareBuffer captureLayers(android.view.SurfaceControl p0, android.graphics.Rect p1, float p2, int p3) { return null; }
    public static android.window.ScreenCapture.ScreenshotHardwareBuffer captureLayers(android.window.ScreenCapture.LayerCaptureArgs p0) { return null; }
    public static android.window.ScreenCapture.ScreenshotHardwareBuffer captureLayersExcluding(android.view.SurfaceControl p0, android.graphics.Rect p1, float p2, int p3, android.view.SurfaceControl[] p4) { return null; }
    public static int captureLayers(android.window.ScreenCapture.LayerCaptureArgs p0, android.window.ScreenCapture.ScreenCaptureListener p1) { return 0; }
    public static android.window.ScreenCapture.SynchronousScreenCaptureListener createSyncCaptureListener() { return null; }

    public static class CaptureArgs implements android.os.Parcelable {
        public final int mPixelFormat = 0;
        public final android.graphics.Rect mSourceCrop = null;
        public final float mFrameScaleX = 0.0f;
        public final float mFrameScaleY = 0.0f;
        public final boolean mCaptureSecureLayers = false;
        public final boolean mAllowProtected = false;
        public final long mUid = 0L;
        public final boolean mGrayscale = false;
        final android.view.SurfaceControl[] mExcludeLayers = null;
        public final boolean mHintForSeamlessTransition = false;
        public static final android.os.Parcelable.Creator<android.window.ScreenCapture.CaptureArgs> CREATOR = null;
        public void release() {}
        public int describeContents() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}

        public static class Builder<T extends android.window.ScreenCapture.CaptureArgs.Builder<T>> {
            public Builder() {}
            public android.window.ScreenCapture.CaptureArgs build() { return null; }
            public T setPixelFormat(int p0) { return null; }
            public T setSourceCrop(android.graphics.Rect p0) { return null; }
            public T setFrameScale(float p0) { return null; }
            public T setFrameScale(float p0, float p1) { return null; }
            public T setCaptureSecureLayers(boolean p0) { return null; }
            public T setAllowProtected(boolean p0) { return null; }
            public T setUid(long p0) { return null; }
            public T setGrayscale(boolean p0) { return null; }
            public T setExcludeLayers(android.view.SurfaceControl[] p0) { return null; }
            public T setHintForSeamlessTransition(boolean p0) { return null; }
            T getThis() { return null; }
        }
    }

    public static class DisplayCaptureArgs extends android.window.ScreenCapture.CaptureArgs {

        public static class Builder extends android.window.ScreenCapture.CaptureArgs.Builder<android.window.ScreenCapture.DisplayCaptureArgs.Builder> {
            public android.window.ScreenCapture.DisplayCaptureArgs build() { return null; }
            public Builder(android.os.IBinder p0) { super(); }
            public android.window.ScreenCapture.DisplayCaptureArgs.Builder setDisplayToken(android.os.IBinder p0) { return null; }
            public android.window.ScreenCapture.DisplayCaptureArgs.Builder setSize(int p0, int p1) { return null; }
            android.window.ScreenCapture.DisplayCaptureArgs.Builder getThis() { return null; }
        }
    }

    public static class LayerCaptureArgs extends android.window.ScreenCapture.CaptureArgs {

        public static class Builder extends android.window.ScreenCapture.CaptureArgs.Builder<android.window.ScreenCapture.LayerCaptureArgs.Builder> {
            public android.window.ScreenCapture.LayerCaptureArgs build() { return null; }
            public Builder(android.view.SurfaceControl p0, android.window.ScreenCapture.CaptureArgs p1) { super(); }
            public Builder(android.view.SurfaceControl p0) { super(); }
            public android.window.ScreenCapture.LayerCaptureArgs.Builder setLayer(android.view.SurfaceControl p0) { return null; }
            public android.window.ScreenCapture.LayerCaptureArgs.Builder setChildrenOnly(boolean p0) { return null; }
            android.window.ScreenCapture.LayerCaptureArgs.Builder getThis() { return null; }
        }
    }

    public static class ScreenCaptureListener implements android.os.Parcelable {
        final long mNativeObject = 0L;
        public static final android.os.Parcelable.Creator<android.window.ScreenCapture.ScreenCaptureListener> CREATOR = null;
        public ScreenCaptureListener(java.util.function.ObjIntConsumer<android.window.ScreenCapture.ScreenshotHardwareBuffer> p0) {}
        public int describeContents() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }

    public static class ScreenshotHardwareBuffer {
        public ScreenshotHardwareBuffer(android.hardware.HardwareBuffer p0, android.graphics.ColorSpace p1, boolean p2, boolean p3) {}
        public ScreenshotHardwareBuffer(android.hardware.HardwareBuffer p0, android.graphics.ColorSpace p1, boolean p2, boolean p3, android.hardware.HardwareBuffer p4, float p5) {}
        public android.graphics.ColorSpace getColorSpace() { return null; }
        public android.hardware.HardwareBuffer getHardwareBuffer() { return null; }
        public boolean containsSecureLayers() { return false; }
        public boolean containsHdrLayers() { return false; }
        public android.graphics.Bitmap asBitmap() { return null; }
    }

    public static abstract class SynchronousScreenCaptureListener extends android.window.ScreenCapture.ScreenCaptureListener {
        SynchronousScreenCaptureListener(java.util.function.ObjIntConsumer<android.window.ScreenCapture.ScreenshotHardwareBuffer> p0) { super(null); }
        @android.annotation.Nullable
        public abstract android.window.ScreenCapture.ScreenshotHardwareBuffer getBuffer();
    }
}
