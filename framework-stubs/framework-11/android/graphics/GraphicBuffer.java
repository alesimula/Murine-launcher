package android.graphics;

public class GraphicBuffer implements android.os.Parcelable {
    public static final int USAGE_SW_READ_NEVER = 0;
    public static final int USAGE_SW_READ_RARELY = 2;
    public static final int USAGE_SW_READ_OFTEN = 3;
    public static final int USAGE_SW_READ_MASK = 15;
    public static final int USAGE_SW_WRITE_NEVER = 0;
    public static final int USAGE_SW_WRITE_RARELY = 32;
    public static final int USAGE_SW_WRITE_OFTEN = 48;
    public static final int USAGE_SW_WRITE_MASK = 240;
    public static final int USAGE_SOFTWARE_MASK = 255;
    public static final int USAGE_PROTECTED = 16384;
    public static final int USAGE_HW_TEXTURE = 256;
    public static final int USAGE_HW_RENDER = 512;
    public static final int USAGE_HW_2D = 1024;
    public static final int USAGE_HW_COMPOSER = 2048;
    public static final int USAGE_HW_VIDEO_ENCODER = 65536;
    public static final int USAGE_HW_MASK = 466688;
    private final int mWidth = 0;
    private final int mHeight = 0;
    private final int mFormat = 0;
    private final int mUsage = 0;
    private final long mNativeObject = 0L;
    private android.graphics.Canvas mCanvas;
    private int mSaveCount;
    private boolean mDestroyed;
    public static final android.os.Parcelable.Creator<android.graphics.GraphicBuffer> CREATOR = null;
    public static android.graphics.GraphicBuffer create(int p0, int p1, int p2, int p3) { return null; }
    private GraphicBuffer(int p0, int p1, int p2, int p3, long p4) {}
    public static android.graphics.GraphicBuffer createFromExisting(int p0, int p1, int p2, int p3, long p4) { return null; }
    public static final android.graphics.GraphicBuffer createFromHardwareBuffer(android.hardware.HardwareBuffer p0) { return null; }
    public int getWidth() { return 0; }
    public int getHeight() { return 0; }
    public int getFormat() { return 0; }
    public int getUsage() { return 0; }
    public android.graphics.Canvas lockCanvas() { return null; }
    public android.graphics.Canvas lockCanvas(android.graphics.Rect p0) { return null; }
    public void unlockCanvasAndPost(android.graphics.Canvas p0) {}
    public void destroy() {}
    public boolean isDestroyed() { return false; }
    protected void finalize() throws java.lang.Throwable {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    private static native long nCreateGraphicBuffer(int p0, int p1, int p2, int p3);
    private static native void nDestroyGraphicBuffer(long p0);
    private static native void nWriteGraphicBufferToParcel(long p0, android.os.Parcel p1);
    private static native long nReadGraphicBufferFromParcel(android.os.Parcel p0);
    private static native boolean nLockCanvas(long p0, android.graphics.Canvas p1, android.graphics.Rect p2);
    private static native boolean nUnlockCanvasAndPost(long p0, android.graphics.Canvas p1);
    private static native long nWrapGraphicBuffer(long p0);
    private static native android.graphics.GraphicBuffer nCreateFromHardwareBuffer(android.hardware.HardwareBuffer p0);
}
