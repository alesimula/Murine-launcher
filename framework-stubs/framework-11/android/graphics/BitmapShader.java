package android.graphics;

public class BitmapShader extends android.graphics.Shader {
    public android.graphics.Bitmap mBitmap;
    private int mTileX;
    private int mTileY;
    public BitmapShader(android.graphics.Bitmap p0, android.graphics.Shader.TileMode p1, android.graphics.Shader.TileMode p2) { super(); }
    private BitmapShader(android.graphics.Bitmap p0, int p1, int p2) { super(); }
    long createNativeInstance(long p0) { return 0L; }
    private static native long nativeCreate(long p0, long p1, int p2, int p3);
}
