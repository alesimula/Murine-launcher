package android.media;

public class ImageReader implements java.lang.AutoCloseable {
    private static final int ACQUIRE_SUCCESS = 0;
    private static final int ACQUIRE_NO_BUFS = 1;
    private static final int ACQUIRE_MAX_IMAGES = 2;
    private final int mWidth = 0;
    private final int mHeight = 0;
    private final int mFormat = 0;
    private final int mMaxImages = 0;
    private final int mNumPlanes = 0;
    private final android.view.Surface mSurface = null;
    private int mEstimatedNativeAllocBytes;
    private final java.lang.Object mListenerLock = null;
    private final java.lang.Object mCloseLock = null;
    private boolean mIsReaderValid;
    private android.media.ImageReader.OnImageAvailableListener mListener;
    private android.media.ImageReader.ListenerHandler mListenerHandler;
    private java.util.List<android.media.Image> mAcquiredImages;
    private long mNativeContext;
    public static android.media.ImageReader newInstance(int p0, int p1, int p2, int p3) { return null; }
    public static android.media.ImageReader newInstance(int p0, int p1, int p2, int p3, long p4) { return null; }
    protected ImageReader(int p0, int p1, int p2, int p3, long p4) {}
    public int getWidth() { return 0; }
    public int getHeight() { return 0; }
    public int getImageFormat() { return 0; }
    public int getMaxImages() { return 0; }
    public android.view.Surface getSurface() { return null; }
    public android.media.Image acquireLatestImage() { return null; }
    public android.media.Image acquireNextImageNoThrowISE() { return null; }
    private int acquireNextSurfaceImage(android.media.ImageReader.SurfaceImage p0) { return 0; }
    public android.media.Image acquireNextImage() { return null; }
    private void releaseImage(android.media.Image p0) {}
    public void setOnImageAvailableListener(android.media.ImageReader.OnImageAvailableListener p0, android.os.Handler p1) {}
    public void close() {}
    public void discardFreeBuffers() {}
    protected void finalize() throws java.lang.Throwable {}
    void detachImage(android.media.Image p0) {}
    private boolean isImageOwnedbyMe(android.media.Image p0) { return false; }
    private static void postEventFromNative(java.lang.Object p0) {}
    private synchronized native void nativeInit(java.lang.Object p0, int p1, int p2, int p3, int p4, long p5);
    private synchronized native void nativeClose();
    private synchronized native void nativeReleaseImage(android.media.Image p0);
    private synchronized native android.view.Surface nativeGetSurface();
    private synchronized native int nativeDetachImage(android.media.Image p0);
    private synchronized native void nativeDiscardFreeBuffers();
    private synchronized native int nativeImageSetup(android.media.Image p0);
    private static native void nativeClassInit();

    private final class ListenerHandler extends android.os.Handler {
        public ListenerHandler(android.media.ImageReader p0, android.os.Looper p1) { super(); }
        public void handleMessage(android.os.Message p0) {}
    }

    public static interface OnImageAvailableListener {
        public void onImageAvailable(android.media.ImageReader p0);
    }

    private class SurfaceImage extends android.media.Image {
        private long mNativeBuffer;
        private long mTimestamp;
        private int mTransform;
        private int mScalingMode;
        private android.media.ImageReader.SurfaceImage.SurfacePlane[] mPlanes;
        private int mFormat;
        private java.util.concurrent.atomic.AtomicBoolean mIsDetached;
        public SurfaceImage(android.media.ImageReader p0, int p1) { super(); }
        public void close() {}
        public android.media.ImageReader getReader() { return null; }
        public int getFormat() { return 0; }
        public int getWidth() { return 0; }
        public int getHeight() { return 0; }
        public long getTimestamp() { return 0L; }
        public int getTransform() { return 0; }
        public int getScalingMode() { return 0; }
        public android.hardware.HardwareBuffer getHardwareBuffer() { return null; }
        public void setTimestamp(long p0) {}
        public android.media.Image.Plane[] getPlanes() { return null; }
        protected final void finalize() throws java.lang.Throwable {}
        boolean isAttachable() { return false; }
        android.media.ImageReader getOwner() { return null; }
        long getNativeContext() { return 0L; }
        private void setDetached(boolean p0) {}
        private void clearSurfacePlanes() {}
        private synchronized native android.media.ImageReader.SurfaceImage.SurfacePlane[] nativeCreatePlanes(int p0, int p1);
        private synchronized native int nativeGetWidth();
        private synchronized native int nativeGetHeight();
        private synchronized native int nativeGetFormat(int p0);
        private synchronized native android.hardware.HardwareBuffer nativeGetHardwareBuffer();

        private class SurfacePlane extends android.media.Image.Plane {
            private final int mPixelStride = 0;
            private final int mRowStride = 0;
            private java.nio.ByteBuffer mBuffer;
            private SurfacePlane(android.media.ImageReader.SurfaceImage p0, int p1, int p2, java.nio.ByteBuffer p3) { super(); }
            public java.nio.ByteBuffer getBuffer() { return null; }
            public int getPixelStride() { return 0; }
            public int getRowStride() { return 0; }
            private void clearBuffer() {}
        }
    }
}
