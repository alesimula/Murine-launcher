package android.media;

public class ImageWriter implements java.lang.AutoCloseable {
    @android.annotation.NonNull
    public static android.media.ImageWriter newInstance(android.view.Surface p0, int p1) { return null; }
    @android.annotation.NonNull
    public static android.media.ImageWriter newInstance(android.view.Surface p0, int p1, int p2, int p3, int p4) { return null; }
    @android.annotation.NonNull
    public static android.media.ImageWriter newInstance(android.view.Surface p0, int p1, int p2) { return null; }
    public int getMaxImages() { return 0; }
    public int getWidth() { return 0; }
    public int getHeight() { return 0; }
    public android.media.Image dequeueInputImage() { return null; }
    public void queueInputImage(android.media.Image p0) {}
    public int getFormat() { return 0; }
    public long getUsage() { return 0L; }
    public int getHardwareBufferFormat() { return 0; }
    @android.annotation.SuppressLint("MethodNameUnits")
    public int getDataSpace() { return 0; }
    public void setOnImageReleasedListener(android.media.ImageWriter.OnImageReleasedListener p0, android.os.Handler p1) {}
    public void close() {}
    protected void finalize() throws java.lang.Throwable {}

    public static final class Builder {
        public Builder(android.view.Surface p0) {}
        @android.annotation.SuppressLint("MissingGetterMatchingBuilder")
        @android.annotation.NonNull
        public android.media.ImageWriter.Builder setWidthAndHeight(int p0, int p1) { return null; }
        @android.annotation.NonNull
        public android.media.ImageWriter.Builder setMaxImages(int p0) { return null; }
        @android.annotation.SuppressLint("MissingGetterMatchingBuilder")
        @android.annotation.NonNull
        public android.media.ImageWriter.Builder setImageFormat(int p0) { return null; }
        @android.annotation.NonNull
        public android.media.ImageWriter.Builder setHardwareBufferFormat(int p0) { return null; }
        @android.annotation.NonNull
        public android.media.ImageWriter.Builder setDataSpace(int p0) { return null; }
        @android.annotation.NonNull
        public android.media.ImageWriter.Builder setUsage(long p0) { return null; }
        @android.annotation.NonNull
        public android.media.ImageWriter build() { return null; }
    }

    private final class ListenerHandler extends android.os.Handler {
        public ListenerHandler(android.media.ImageWriter p0, android.os.Looper p1) { super(); }
        public void handleMessage(android.os.Message p0) {}
    }

    public static interface OnImageReleasedListener {
        public void onImageReleased(android.media.ImageWriter p0);
    }

    private static class WriterSurfaceImage extends android.media.Image {
        public WriterSurfaceImage(android.media.ImageWriter p0) { super(); }
        public int getDataSpace() { return 0; }
        public void setDataSpace(int p0) {}
        public int getFormat() { return 0; }
        public int getWidth() { return 0; }
        public int getHeight() { return 0; }
        public int getTransform() { return 0; }
        public int getScalingMode() { return 0; }
        public long getTimestamp() { return 0L; }
        public void setTimestamp(long p0) {}
        public android.hardware.HardwareBuffer getHardwareBuffer() { return null; }
        public android.hardware.SyncFence getFence() throws java.io.IOException { return null; }
        public void setFence(android.hardware.SyncFence p0) throws java.io.IOException {}
        public android.media.Image.Plane[] getPlanes() { return null; }
        public boolean isAttachable() { return false; }
        android.media.ImageWriter getOwner() { return null; }
        long getNativeContext() { return 0L; }
        public void close() {}
        protected final void finalize() throws java.lang.Throwable {}

        private class SurfacePlane extends android.media.Image.Plane {
            public int getRowStride() { return 0; }
            public int getPixelStride() { return 0; }
            public java.nio.ByteBuffer getBuffer() { return null; }
        }
    }
}
