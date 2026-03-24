package android.graphics;

public final class Bitmap implements android.os.Parcelable {
    private static final java.lang.String TAG = "Bitmap";
    public static final int DENSITY_NONE = 0;
    private static final long NATIVE_ALLOCATION_SIZE = 32L;
    private final long mNativePtr = 0L;
    private boolean mRequestPremultiplied;
    private byte[] mNinePatchChunk;
    private android.graphics.NinePatch.InsetStruct mNinePatchInsets;
    private int mWidth;
    private int mHeight;
    private java.lang.ref.WeakReference<android.hardware.HardwareBuffer> mHardwareBuffer;
    private boolean mRecycled;
    private android.graphics.ColorSpace mColorSpace;
    int mDensity;
    private static volatile int sDefaultDensity;
    private static final int WORKING_COMPRESS_STORAGE = 4096;
    public static final android.os.Parcelable.Creator<android.graphics.Bitmap> CREATOR = null;
    public static void setDefaultDensity(int p0) {}
    static int getDefaultDensity() { return 0; }
    Bitmap(long p0, int p1, int p2, int p3, boolean p4, byte[] p5, android.graphics.NinePatch.InsetStruct p6) {}
    Bitmap(long p0, int p1, int p2, int p3, boolean p4, byte[] p5, android.graphics.NinePatch.InsetStruct p6, boolean p7) {}
    public long getNativeInstance() { return 0L; }
    void reinit(int p0, int p1, boolean p2) {}
    public int getDensity() { return 0; }
    public void setDensity(int p0) {}
    public void reconfigure(int p0, int p1, android.graphics.Bitmap.Config p2) {}
    public void setWidth(int p0) {}
    public void setHeight(int p0) {}
    public void setConfig(android.graphics.Bitmap.Config p0) {}
    private void setNinePatchChunk(byte[] p0) {}
    public void recycle() {}
    public final boolean isRecycled() { return false; }
    public int getGenerationId() { return 0; }
    private void checkRecycled(java.lang.String p0) {}
    private void checkHardware(java.lang.String p0) {}
    private static void checkXYSign(int p0, int p1) {}
    private static void checkWidthHeight(int p0, int p1) {}
    public void copyPixelsToBuffer(java.nio.Buffer p0) {}
    public void copyPixelsFromBuffer(java.nio.Buffer p0) {}
    private void noteHardwareBitmapSlowCall() {}
    public android.graphics.Bitmap copy(android.graphics.Bitmap.Config p0, boolean p1) { return null; }
    public android.graphics.Bitmap createAshmemBitmap() { return null; }
    public android.graphics.Bitmap asShared() { return null; }
    public static android.graphics.Bitmap wrapHardwareBuffer(android.hardware.HardwareBuffer p0, android.graphics.ColorSpace p1) { return null; }
    public static android.graphics.Bitmap createScaledBitmap(android.graphics.Bitmap p0, int p1, int p2, boolean p3) { return null; }
    public static android.graphics.Bitmap createBitmap(android.graphics.Bitmap p0) { return null; }
    public static android.graphics.Bitmap createBitmap(android.graphics.Bitmap p0, int p1, int p2, int p3, int p4) { return null; }
    public static android.graphics.Bitmap createBitmap(android.graphics.Bitmap p0, int p1, int p2, int p3, int p4, android.graphics.Matrix p5, boolean p6) { return null; }
    public static android.graphics.Bitmap createBitmap(int p0, int p1, android.graphics.Bitmap.Config p2) { return null; }
    public static android.graphics.Bitmap createBitmap(android.util.DisplayMetrics p0, int p1, int p2, android.graphics.Bitmap.Config p3) { return null; }
    public static android.graphics.Bitmap createBitmap(int p0, int p1, android.graphics.Bitmap.Config p2, boolean p3) { return null; }
    public static android.graphics.Bitmap createBitmap(int p0, int p1, android.graphics.Bitmap.Config p2, boolean p3, android.graphics.ColorSpace p4) { return null; }
    public static android.graphics.Bitmap createBitmap(android.util.DisplayMetrics p0, int p1, int p2, android.graphics.Bitmap.Config p3, boolean p4) { return null; }
    public static android.graphics.Bitmap createBitmap(android.util.DisplayMetrics p0, int p1, int p2, android.graphics.Bitmap.Config p3, boolean p4, android.graphics.ColorSpace p5) { return null; }
    public static android.graphics.Bitmap createBitmap(int[] p0, int p1, int p2, int p3, int p4, android.graphics.Bitmap.Config p5) { return null; }
    public static android.graphics.Bitmap createBitmap(android.util.DisplayMetrics p0, int[] p1, int p2, int p3, int p4, int p5, android.graphics.Bitmap.Config p6) { return null; }
    public static android.graphics.Bitmap createBitmap(int[] p0, int p1, int p2, android.graphics.Bitmap.Config p3) { return null; }
    public static android.graphics.Bitmap createBitmap(android.util.DisplayMetrics p0, int[] p1, int p2, int p3, android.graphics.Bitmap.Config p4) { return null; }
    public static android.graphics.Bitmap createBitmap(android.graphics.Picture p0) { return null; }
    public static android.graphics.Bitmap createBitmap(android.graphics.Picture p0, int p1, int p2, android.graphics.Bitmap.Config p3) { return null; }
    public byte[] getNinePatchChunk() { return null; }
    public void getOpticalInsets(android.graphics.Rect p0) {}
    public android.graphics.NinePatch.InsetStruct getNinePatchInsets() { return null; }
    public boolean compress(android.graphics.Bitmap.CompressFormat p0, int p1, java.io.OutputStream p2) { return false; }
    public final boolean isMutable() { return false; }
    private void setImmutable() {}
    public final boolean isPremultiplied() { return false; }
    public final void setPremultiplied(boolean p0) {}
    public final int getWidth() { return 0; }
    public final int getHeight() { return 0; }
    public int getScaledWidth(android.graphics.Canvas p0) { return 0; }
    public int getScaledHeight(android.graphics.Canvas p0) { return 0; }
    public int getScaledWidth(android.util.DisplayMetrics p0) { return 0; }
    public int getScaledHeight(android.util.DisplayMetrics p0) { return 0; }
    public int getScaledWidth(int p0) { return 0; }
    public int getScaledHeight(int p0) { return 0; }
    public static int scaleFromDensity(int p0, int p1, int p2) { return 0; }
    public final int getRowBytes() { return 0; }
    public final int getByteCount() { return 0; }
    public final int getAllocationByteCount() { return 0; }
    public final android.graphics.Bitmap.Config getConfig() { return null; }
    public final boolean hasAlpha() { return false; }
    public void setHasAlpha(boolean p0) {}
    public final boolean hasMipMap() { return false; }
    public final void setHasMipMap(boolean p0) {}
    public final android.graphics.ColorSpace getColorSpace() { return null; }
    public void setColorSpace(android.graphics.ColorSpace p0) {}
    public void eraseColor(int p0) {}
    public void eraseColor(long p0) {}
    public int getPixel(int p0, int p1) { return 0; }
    private static float clamp(float p0, android.graphics.ColorSpace p1, int p2) { return 0.0f; }
    public android.graphics.Color getColor(int p0, int p1) { return null; }
    public void getPixels(int[] p0, int p1, int p2, int p3, int p4, int p5, int p6) {}
    private void checkPixelAccess(int p0, int p1) {}
    private void checkPixelsAccess(int p0, int p1, int p2, int p3, int p4, int p5, int[] p6) {}
    public void setPixel(int p0, int p1, int p2) {}
    public void setPixels(int[] p0, int p1, int p2, int p3, int p4, int p5, int p6) {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public android.graphics.Bitmap extractAlpha() { return null; }
    public android.graphics.Bitmap extractAlpha(android.graphics.Paint p0, int[] p1) { return null; }
    public boolean sameAs(android.graphics.Bitmap p0) { return false; }
    public void prepareToDraw() {}
    public android.hardware.HardwareBuffer getHardwareBuffer() { return null; }
    private static native android.graphics.Bitmap nativeCreate(int[] p0, int p1, int p2, int p3, int p4, int p5, boolean p6, long p7);
    private static native android.graphics.Bitmap nativeCopy(long p0, int p1, boolean p2);
    private static native android.graphics.Bitmap nativeCopyAshmem(long p0);
    private static native android.graphics.Bitmap nativeCopyAshmemConfig(long p0, int p1);
    private static native long nativeGetNativeFinalizer();
    private static native void nativeRecycle(long p0);
    private static native void nativeReconfigure(long p0, int p1, int p2, int p3, boolean p4);
    private static native boolean nativeCompress(long p0, int p1, int p2, java.io.OutputStream p3, byte[] p4);
    private static native void nativeErase(long p0, int p1);
    private static native void nativeErase(long p0, long p1, long p2);
    private static native int nativeRowBytes(long p0);
    private static native int nativeConfig(long p0);
    private static native int nativeGetPixel(long p0, int p1, int p2);
    private static native long nativeGetColor(long p0, int p1, int p2);
    private static native void nativeGetPixels(long p0, int[] p1, int p2, int p3, int p4, int p5, int p6, int p7);
    private static native void nativeSetPixel(long p0, int p1, int p2, int p3);
    private static native void nativeSetPixels(long p0, int[] p1, int p2, int p3, int p4, int p5, int p6, int p7);
    private static native void nativeCopyPixelsToBuffer(long p0, java.nio.Buffer p1);
    private static native void nativeCopyPixelsFromBuffer(long p0, java.nio.Buffer p1);
    private static native int nativeGenerationId(long p0);
    private static native android.graphics.Bitmap nativeCreateFromParcel(android.os.Parcel p0);
    private static native boolean nativeWriteToParcel(long p0, int p1, android.os.Parcel p2);
    private static native android.graphics.Bitmap nativeExtractAlpha(long p0, long p1, int[] p2);
    private static native boolean nativeHasAlpha(long p0);
    private static native boolean nativeIsPremultiplied(long p0);
    private static native void nativeSetPremultiplied(long p0, boolean p1);
    private static native void nativeSetHasAlpha(long p0, boolean p1, boolean p2);
    private static native boolean nativeHasMipMap(long p0);
    private static native void nativeSetHasMipMap(long p0, boolean p1);
    private static native boolean nativeSameAs(long p0, long p1);
    private static native void nativePrepareToDraw(long p0);
    private static native int nativeGetAllocationByteCount(long p0);
    private static native android.graphics.Bitmap nativeCopyPreserveInternalConfig(long p0);
    private static native android.graphics.Bitmap nativeWrapHardwareBufferBitmap(android.hardware.HardwareBuffer p0, long p1);
    private static native android.hardware.HardwareBuffer nativeGetHardwareBuffer(long p0);
    private static native android.graphics.ColorSpace nativeComputeColorSpace(long p0);
    private static native void nativeSetColorSpace(long p0, long p1);
    private static native boolean nativeIsSRGB(long p0);
    private static native boolean nativeIsSRGBLinear(long p0);
    private static native void nativeSetImmutable(long p0);
    private static native boolean nativeIsImmutable(long p0);
    private static native boolean nativeIsBackedByAshmem(long p0);

    public static enum CompressFormat {
        JPEG,
        PNG,
        WEBP,
        WEBP_LOSSY,
        WEBP_LOSSLESS;
        final int nativeInt = 0;
        private CompressFormat() {}
    }

    public static enum Config {
        ALPHA_8,
        RGB_565,
        ARGB_4444,
        ARGB_8888,
        RGBA_F16,
        HARDWARE;
        final int nativeInt = 0;
        private static android.graphics.Bitmap.Config[] sConfigs;
        private Config() {}
        static android.graphics.Bitmap.Config nativeToConfig(int p0) { return null; }
    }
}
