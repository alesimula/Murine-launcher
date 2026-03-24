package android.media;

public abstract class Image implements java.lang.AutoCloseable {
    protected boolean mIsImageValid;
    private android.graphics.Rect mCropRect;
    @android.annotation.UnsupportedAppUsage
    protected Image() {}
    protected void throwISEIfImageIsInvalid() {}
    public abstract int getFormat();
    public abstract int getWidth();
    public abstract int getHeight();
    public abstract long getTimestamp();
    public abstract int getTransform();
    public abstract int getScalingMode();
    public android.hardware.HardwareBuffer getHardwareBuffer() { return null; }
    public void setTimestamp(long p0) {}
    public android.graphics.Rect getCropRect() { return null; }
    public void setCropRect(android.graphics.Rect p0) {}
    public abstract android.media.Image.Plane[] getPlanes();
    public abstract void close();
    boolean isAttachable() { return false; }
    java.lang.Object getOwner() { return null; }
    long getNativeContext() { return 0L; }

    public static abstract class Plane {
        @android.annotation.UnsupportedAppUsage
        protected Plane() {}
        public abstract int getRowStride();
        public abstract int getPixelStride();
        public abstract java.nio.ByteBuffer getBuffer();
    }
}
