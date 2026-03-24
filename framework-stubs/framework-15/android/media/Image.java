package android.media;

public abstract class Image implements java.lang.AutoCloseable {
    protected boolean mIsImageValid;
    protected Image() {}
    protected void throwISEIfImageIsInvalid() {}
    public abstract int getFormat();
    public abstract int getWidth();
    public abstract int getHeight();
    public abstract long getTimestamp();
    public abstract int getTransform();
    public abstract int getScalingMode();
    @android.annotation.NonNull
    public android.hardware.SyncFence getFence() throws java.io.IOException { return null; }
    public int getPlaneCount() { return 0; }
    @android.annotation.Nullable
    public android.hardware.HardwareBuffer getHardwareBuffer() { return null; }
    public void setTimestamp(long p0) {}
    public void setFence(android.hardware.SyncFence p0) throws java.io.IOException {}
    @android.annotation.SuppressLint("MethodNameUnits")
    public int getDataSpace() { return 0; }
    public void setDataSpace(int p0) {}
    public android.graphics.Rect getCropRect() { return null; }
    public void setCropRect(android.graphics.Rect p0) {}
    public abstract android.media.Image.Plane[] getPlanes();
    public abstract void close();
    public boolean isAttachable() { return false; }
    java.lang.Object getOwner() { return null; }
    long getNativeContext() { return 0L; }

    public static abstract class Plane {
        protected Plane() {}
        public abstract int getRowStride();
        public abstract int getPixelStride();
        public abstract java.nio.ByteBuffer getBuffer();
    }
}
