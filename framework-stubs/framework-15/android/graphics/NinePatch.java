package android.graphics;

public class NinePatch {
    public long mNativeChunk;
    public NinePatch(android.graphics.Bitmap p0, byte[] p1) {}
    public NinePatch(android.graphics.Bitmap p0, byte[] p1, java.lang.String p2) {}
    protected void finalize() throws java.lang.Throwable {}
    public java.lang.String getName() { return null; }
    public android.graphics.Paint getPaint() { return null; }
    public void setPaint(android.graphics.Paint p0) {}
    public android.graphics.Bitmap getBitmap() { return null; }
    public void draw(android.graphics.Canvas p0, android.graphics.RectF p1) {}
    public void draw(android.graphics.Canvas p0, android.graphics.Rect p1) {}
    public void draw(android.graphics.Canvas p0, android.graphics.Rect p1, android.graphics.Paint p2) {}
    public int getDensity() { return 0; }
    public int getWidth() { return 0; }
    public int getHeight() { return 0; }
    public final boolean hasAlpha() { return false; }
    public final android.graphics.Region getTransparentRegion(android.graphics.Rect p0) { return null; }
    public static native boolean isNinePatchChunk(byte[] p0);

    public static class InsetStruct {
        public final android.graphics.Rect opticalRect = null;
        public final android.graphics.Rect outlineRect = null;
        public final float outlineRadius = 0.0f;
        public final float outlineAlpha = 0.0f;
        InsetStruct(int p0, int p1, int p2, int p3, int p4, int p5, int p6, int p7, float p8, int p9, float p10) {}
        public static android.graphics.Rect scaleInsets(int p0, int p1, int p2, int p3, float p4) { return null; }
    }
}
