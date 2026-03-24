package android.media;

public class ImageReader implements java.lang.AutoCloseable {
    public static android.media.ImageReader newInstance(int p0, int p1, int p2, int p3) { return null; }
    public static android.media.ImageReader newInstance(int p0, int p1, int p2, int p3, long p4) { return null; }
    public static android.media.ImageReader newInstance(int p0, int p1, int p2, int p3, android.hardware.camera2.MultiResolutionImageReader p4) { return null; }
    public int getWidth() { return 0; }
    public int getHeight() { return 0; }
    public int getImageFormat() { return 0; }
    public int getHardwareBufferFormat() { return 0; }
    @android.annotation.SuppressLint("MethodNameUnits")
    public int getDataSpace() { return 0; }
    public int getMaxImages() { return 0; }
    public long getUsage() { return 0L; }
    public android.view.Surface getSurface() { return null; }
    public android.media.Image acquireLatestImage() { return null; }
    public android.media.Image acquireNextImageNoThrowISE() { return null; }
    public android.media.Image acquireNextImage() { return null; }
    public void setOnImageAvailableListener(android.media.ImageReader.OnImageAvailableListener p0, android.os.Handler p1) {}
    public void setOnImageAvailableListenerWithExecutor(android.media.ImageReader.OnImageAvailableListener p0, java.util.concurrent.Executor p1) {}
    public void close() {}
    public void discardFreeBuffers() {}
    protected void finalize() throws java.lang.Throwable {}
    public void detachImage(android.media.Image p0) {}
    public static android.media.ImageReader.ImagePlane[] initializeImagePlanes(int p0, android.graphics.GraphicBuffer p1, int p2, int p3, long p4, int p5, int p6, android.graphics.Rect p7) { return null; }
    public static void unlockGraphicBuffer(android.graphics.GraphicBuffer p0) {}

    public static interface OnImageAvailableListener {
        public void onImageAvailable(android.media.ImageReader p0);
    }

    public static final class Builder {
        public Builder(int p0, int p1) {}
        public android.media.ImageReader.Builder setMaxImages(int p0) { return null; }
        public android.media.ImageReader.Builder setUsage(long p0) { return null; }
        public android.media.ImageReader.Builder setImageFormat(int p0) { return null; }
        @android.annotation.SuppressLint("MissingGetterMatchingBuilder")
        public android.media.ImageReader.Builder setDefaultHardwareBufferFormat(int p0) { return null; }
        @android.annotation.SuppressLint("MissingGetterMatchingBuilder")
        public android.media.ImageReader.Builder setDefaultDataSpace(int p0) { return null; }
        public android.media.ImageReader build() { return null; }
    }

    private final class HandlerExecutor implements java.util.concurrent.Executor {
        public HandlerExecutor(android.media.ImageReader p0, android.os.Handler p1) {}
        public void execute(java.lang.Runnable p0) {}
    }

    public static class ImagePlane extends android.media.Image.Plane {
        public java.nio.ByteBuffer getBuffer() { return null; }
        public int getPixelStride() { return 0; }
        public int getRowStride() { return 0; }
    }

    private final class ListenerHandler extends android.os.Handler {
        public ListenerHandler(android.media.ImageReader p0, android.os.Looper p1) { super(); }
    }

    private class SurfaceImage extends android.media.Image {
        public SurfaceImage(android.media.ImageReader p0, int p1) { super(); }
        public void close() {}
        public android.media.ImageReader getReader() { return null; }
        public int getFormat() { return 0; }
        public int getWidth() { return 0; }
        public int getHeight() { return 0; }
        public long getTimestamp() { return 0L; }
        public int getTransform() { return 0; }
        public int getScalingMode() { return 0; }
        public int getPlaneCount() { return 0; }
        public android.hardware.SyncFence getFence() throws java.io.IOException { return null; }
        public android.hardware.HardwareBuffer getHardwareBuffer() { return null; }
        public int getDataSpace() { return 0; }
        public void setTimestamp(long p0) {}
        public android.media.Image.Plane[] getPlanes() { return null; }
        protected final void finalize() throws java.lang.Throwable {}
        public boolean isAttachable() { return false; }
        android.media.ImageReader getOwner() { return null; }
        long getNativeContext() { return 0L; }

        private class SurfacePlane extends android.media.Image.Plane {
            public java.nio.ByteBuffer getBuffer() { return null; }
            public int getPixelStride() { return 0; }
            public int getRowStride() { return 0; }
        }
    }
}
