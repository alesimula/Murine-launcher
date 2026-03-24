package android.graphics;

public class BitmapShader extends android.graphics.Shader {
    android.graphics.Bitmap mBitmap;
    private int mTileX;
    private int mTileY;
    private boolean mFilterFromPaint;
    public BitmapShader(android.graphics.Bitmap p0, android.graphics.Shader.TileMode p1, android.graphics.Shader.TileMode p2) { super(); }
    private BitmapShader(android.graphics.Bitmap p0, int p1, int p2) { super(); }
    protected long createNativeInstance(long p0, boolean p1) { return 0L; }
    protected boolean shouldDiscardNativeInstance(boolean p0) { return false; }
    private static native long nativeCreate(long p0, long p1, int p2, int p3, boolean p4);
}
