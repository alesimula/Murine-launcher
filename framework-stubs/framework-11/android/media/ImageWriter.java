package android.media;

public class ImageWriter implements java.lang.AutoCloseable {
    private final java.lang.Object mListenerLock = null;
    private android.media.ImageWriter.OnImageReleasedListener mListener;
    private android.media.ImageWriter.ListenerHandler mListenerHandler;
    private long mNativeContext;
    private int mWriterFormat;
    private final int mMaxImages = 0;
    private java.util.List<android.media.Image> mDequeuedImages;
    private int mEstimatedNativeAllocBytes;
    public static android.media.ImageWriter newInstance(android.view.Surface p0, int p1) { return null; }
    public static android.media.ImageWriter newInstance(android.view.Surface p0, int p1, int p2) { return null; }
    protected ImageWriter(android.view.Surface p0, int p1, int p2) {}
    public int getMaxImages() { return 0; }
    public android.media.Image dequeueInputImage() { return null; }
    public void queueInputImage(android.media.Image p0) {}
    public int getFormat() { return 0; }
    public void setOnImageReleasedListener(android.media.ImageWriter.OnImageReleasedListener p0, android.os.Handler p1) {}
    public void close() {}
    protected void finalize() throws java.lang.Throwable {}
    private void attachAndQueueInputImage(android.media.Image p0) {}
    private static void postEventFromNative(java.lang.Object p0) {}
    private void abortImage(android.media.Image p0) {}
    private boolean isImageOwnedByMe(android.media.Image p0) { return false; }
    private synchronized native long nativeInit(java.lang.Object p0, android.view.Surface p1, int p2, int p3);
    private synchronized native void nativeClose(long p0);
    private synchronized native void nativeDequeueInputImage(long p0, android.media.Image p1);
    private synchronized native void nativeQueueInputImage(long p0, android.media.Image p1, long p2, int p3, int p4, int p5, int p6, int p7, int p8);
    private synchronized native int nativeAttachAndQueueImage(long p0, long p1, int p2, long p3, int p4, int p5, int p6, int p7, int p8, int p9);
    private synchronized native void cancelImage(long p0, android.media.Image p1);
    private static native void nativeClassInit();

    private final class ListenerHandler extends android.os.Handler {
        public ListenerHandler(android.media.ImageWriter p0, android.os.Looper p1) { super(); }
        public void handleMessage(android.os.Message p0) {}
    }

    public static interface OnImageReleasedListener {
        public void onImageReleased(android.media.ImageWriter p0);
    }

    private static class WriterSurfaceImage extends android.media.Image {
        private android.media.ImageWriter mOwner;
        private long mNativeBuffer;
        private int mNativeFenceFd;
        private android.media.ImageWriter.WriterSurfaceImage.SurfacePlane[] mPlanes;
        private int mHeight;
        private int mWidth;
        private int mFormat;
        private final long DEFAULT_TIMESTAMP = 0L;
        private long mTimestamp;
        private int mTransform;
        private int mScalingMode;
        public WriterSurfaceImage(android.media.ImageWriter p0) { super(); }
        public int getFormat() { return 0; }
        public int getWidth() { return 0; }
        public int getHeight() { return 0; }
        public int getTransform() { return 0; }
        public int getScalingMode() { return 0; }
        public long getTimestamp() { return 0L; }
        public void setTimestamp(long p0) {}
        public android.hardware.HardwareBuffer getHardwareBuffer() { return null; }
        public android.media.Image.Plane[] getPlanes() { return null; }
        boolean isAttachable() { return false; }
        android.media.ImageWriter getOwner() { return null; }
        long getNativeContext() { return 0L; }
        public void close() {}
        protected final void finalize() throws java.lang.Throwable {}
        private void clearSurfacePlanes() {}
        private synchronized native android.media.ImageWriter.WriterSurfaceImage.SurfacePlane[] nativeCreatePlanes(int p0, int p1);
        private synchronized native int nativeGetWidth();
        private synchronized native int nativeGetHeight();
        private synchronized native int nativeGetFormat();
        private synchronized native android.hardware.HardwareBuffer nativeGetHardwareBuffer();

        private class SurfacePlane extends android.media.Image.Plane {
            private java.nio.ByteBuffer mBuffer;
            private final int mPixelStride = 0;
            private final int mRowStride = 0;
            private SurfacePlane(android.media.ImageWriter.WriterSurfaceImage p0, int p1, int p2, java.nio.ByteBuffer p3) { super(); }
            public int getRowStride() { return 0; }
            public int getPixelStride() { return 0; }
            public java.nio.ByteBuffer getBuffer() { return null; }
            private void clearBuffer() {}
        }
    }
}
