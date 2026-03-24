package android.graphics;

public class Canvas extends android.graphics.BaseCanvas {
    private static int sCompatiblityVersion;
    public static boolean sCompatibilityRestore;
    public static boolean sCompatibilitySetBitmap;
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=117521088L)
    private android.graphics.Bitmap mBitmap;
    private android.graphics.DrawFilter mDrawFilter;
    private static final int MAXMIMUM_BITMAP_SIZE = 32766;
    private java.lang.Runnable mFinalizer;
    public static final int MATRIX_SAVE_FLAG = 1;
    public static final int CLIP_SAVE_FLAG = 2;
    public static final int HAS_ALPHA_LAYER_SAVE_FLAG = 4;
    public static final int FULL_COLOR_LAYER_SAVE_FLAG = 8;
    public static final int CLIP_TO_LAYER_SAVE_FLAG = 16;
    public static final int ALL_SAVE_FLAG = 31;
    @android.annotation.UnsupportedAppUsage
    public long getNativeCanvasWrapper() { return 0L; }
    public boolean isRecordingFor(java.lang.Object p0) { return false; }
    public Canvas() { super(); }
    public Canvas(android.graphics.Bitmap p0) { super(); }
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=115609023L)
    public Canvas(long p0) { super(); }
    @java.lang.Deprecated
    @android.annotation.UnsupportedAppUsage
    protected javax.microedition.khronos.opengles.GL getGL() { return null; }
    public boolean isHardwareAccelerated() { return false; }
    public void setBitmap(android.graphics.Bitmap p0) {}
    @java.lang.Deprecated
    public void insertReorderBarrier() {}
    @java.lang.Deprecated
    public void insertInorderBarrier() {}
    public void enableZ() {}
    public void disableZ() {}
    public boolean isOpaque() { return false; }
    public int getWidth() { return 0; }
    public int getHeight() { return 0; }
    public int getDensity() { return 0; }
    public void setDensity(int p0) {}
    @android.annotation.UnsupportedAppUsage
    public void setScreenDensity(int p0) {}
    public int getMaximumBitmapWidth() { return 0; }
    public int getMaximumBitmapHeight() { return 0; }
    private static void checkValidSaveFlags(int p0) {}
    public int save() { return 0; }
    public int save(int p0) { return 0; }
    public int saveLayer(android.graphics.RectF p0, android.graphics.Paint p1, int p2) { return 0; }
    public int saveLayer(android.graphics.RectF p0, android.graphics.Paint p1) { return 0; }
    public int saveUnclippedLayer(int p0, int p1, int p2, int p3) { return 0; }
    public void restoreUnclippedLayer(int p0, android.graphics.Paint p1) {}
    public int saveLayer(float p0, float p1, float p2, float p3, android.graphics.Paint p4, int p5) { return 0; }
    public int saveLayer(float p0, float p1, float p2, float p3, android.graphics.Paint p4) { return 0; }
    public int saveLayerAlpha(android.graphics.RectF p0, int p1, int p2) { return 0; }
    public int saveLayerAlpha(android.graphics.RectF p0, int p1) { return 0; }
    public int saveLayerAlpha(float p0, float p1, float p2, float p3, int p4, int p5) { return 0; }
    public int saveLayerAlpha(float p0, float p1, float p2, float p3, int p4) { return 0; }
    public void restore() {}
    public int getSaveCount() { return 0; }
    public void restoreToCount(int p0) {}
    public void translate(float p0, float p1) {}
    public void scale(float p0, float p1) {}
    public final void scale(float p0, float p1, float p2, float p3) {}
    public void rotate(float p0) {}
    public final void rotate(float p0, float p1, float p2) {}
    public void skew(float p0, float p1) {}
    public void concat(android.graphics.Matrix p0) {}
    public void setMatrix(android.graphics.Matrix p0) {}
    @java.lang.Deprecated
    public void getMatrix(android.graphics.Matrix p0) {}
    @java.lang.Deprecated
    public final android.graphics.Matrix getMatrix() { return null; }
    private static void checkValidClipOp(android.graphics.Region.Op p0) {}
    @java.lang.Deprecated
    public boolean clipRect(android.graphics.RectF p0, android.graphics.Region.Op p1) { return false; }
    @java.lang.Deprecated
    public boolean clipRect(android.graphics.Rect p0, android.graphics.Region.Op p1) { return false; }
    public boolean clipRectUnion(android.graphics.Rect p0) { return false; }
    public boolean clipRect(android.graphics.RectF p0) { return false; }
    public boolean clipOutRect(android.graphics.RectF p0) { return false; }
    public boolean clipRect(android.graphics.Rect p0) { return false; }
    public boolean clipOutRect(android.graphics.Rect p0) { return false; }
    @java.lang.Deprecated
    public boolean clipRect(float p0, float p1, float p2, float p3, android.graphics.Region.Op p4) { return false; }
    public boolean clipRect(float p0, float p1, float p2, float p3) { return false; }
    public boolean clipOutRect(float p0, float p1, float p2, float p3) { return false; }
    public boolean clipRect(int p0, int p1, int p2, int p3) { return false; }
    public boolean clipOutRect(int p0, int p1, int p2, int p3) { return false; }
    @java.lang.Deprecated
    public boolean clipPath(android.graphics.Path p0, android.graphics.Region.Op p1) { return false; }
    public boolean clipPath(android.graphics.Path p0) { return false; }
    public boolean clipOutPath(android.graphics.Path p0) { return false; }
    @java.lang.Deprecated
    public boolean clipRegion(android.graphics.Region p0, android.graphics.Region.Op p1) { return false; }
    @java.lang.Deprecated
    public boolean clipRegion(android.graphics.Region p0) { return false; }
    public android.graphics.DrawFilter getDrawFilter() { return null; }
    public void setDrawFilter(android.graphics.DrawFilter p0) {}
    public boolean quickReject(android.graphics.RectF p0, android.graphics.Canvas.EdgeType p1) { return false; }
    public boolean quickReject(android.graphics.Path p0, android.graphics.Canvas.EdgeType p1) { return false; }
    public boolean quickReject(float p0, float p1, float p2, float p3, android.graphics.Canvas.EdgeType p4) { return false; }
    public boolean getClipBounds(android.graphics.Rect p0) { return false; }
    public final android.graphics.Rect getClipBounds() { return null; }
    public void drawPicture(android.graphics.Picture p0) {}
    public void drawPicture(android.graphics.Picture p0, android.graphics.RectF p1) {}
    public void drawPicture(android.graphics.Picture p0, android.graphics.Rect p1) {}
    @android.annotation.UnsupportedAppUsage
    public void release() {}
    @android.annotation.UnsupportedAppUsage
    public static void freeCaches() {}
    @android.annotation.UnsupportedAppUsage
    public static void freeTextLayoutCaches() {}
    public static void setCompatibilityVersion(int p0) {}
    private static native void nFreeCaches();
    private static native void nFreeTextLayoutCaches();
    private static native long nGetNativeFinalizer();
    private static native void nSetCompatibilityVersion(int p0);
    private static native long nInitRaster(long p0);
    private static native void nSetBitmap(long p0, long p1);
    private static native boolean nGetClipBounds(long p0, android.graphics.Rect p1);
    private static native boolean nIsOpaque(long p0);
    private static native int nGetWidth(long p0);
    private static native int nGetHeight(long p0);
    private static native int nSave(long p0, int p1);
    private static native int nSaveLayer(long p0, float p1, float p2, float p3, float p4, long p5, int p6);
    private static native int nSaveLayerAlpha(long p0, float p1, float p2, float p3, float p4, int p5, int p6);
    private static native int nSaveUnclippedLayer(long p0, int p1, int p2, int p3, int p4);
    private static native void nRestoreUnclippedLayer(long p0, int p1, long p2);
    private static native boolean nRestore(long p0);
    private static native void nRestoreToCount(long p0, int p1);
    private static native int nGetSaveCount(long p0);
    private static native void nTranslate(long p0, float p1, float p2);
    private static native void nScale(long p0, float p1, float p2);
    private static native void nRotate(long p0, float p1);
    private static native void nSkew(long p0, float p1, float p2);
    private static native void nConcat(long p0, long p1);
    private static native void nSetMatrix(long p0, long p1);
    private static native boolean nClipRect(long p0, float p1, float p2, float p3, float p4, int p5);
    private static native boolean nClipPath(long p0, long p1, int p2);
    private static native void nSetDrawFilter(long p0, long p1);
    private static native void nGetMatrix(long p0, long p1);
    private static native boolean nQuickReject(long p0, long p1);
    private static native boolean nQuickReject(long p0, float p1, float p2, float p3, float p4);
    public void drawArc(android.graphics.RectF p0, float p1, float p2, boolean p3, android.graphics.Paint p4) {}
    public void drawArc(float p0, float p1, float p2, float p3, float p4, float p5, boolean p6, android.graphics.Paint p7) {}
    public void drawARGB(int p0, int p1, int p2, int p3) {}
    public void drawBitmap(android.graphics.Bitmap p0, float p1, float p2, android.graphics.Paint p3) {}
    public void drawBitmap(android.graphics.Bitmap p0, android.graphics.Rect p1, android.graphics.RectF p2, android.graphics.Paint p3) {}
    public void drawBitmap(android.graphics.Bitmap p0, android.graphics.Rect p1, android.graphics.Rect p2, android.graphics.Paint p3) {}
    @java.lang.Deprecated
    public void drawBitmap(int[] p0, int p1, int p2, float p3, float p4, int p5, int p6, boolean p7, android.graphics.Paint p8) {}
    @java.lang.Deprecated
    public void drawBitmap(int[] p0, int p1, int p2, int p3, int p4, int p5, int p6, boolean p7, android.graphics.Paint p8) {}
    public void drawBitmap(android.graphics.Bitmap p0, android.graphics.Matrix p1, android.graphics.Paint p2) {}
    public void drawBitmapMesh(android.graphics.Bitmap p0, int p1, int p2, float[] p3, int p4, int[] p5, int p6, android.graphics.Paint p7) {}
    public void drawCircle(float p0, float p1, float p2, android.graphics.Paint p3) {}
    public void drawColor(int p0) {}
    public void drawColor(long p0) {}
    public void drawColor(int p0, android.graphics.PorterDuff.Mode p1) {}
    public void drawColor(int p0, android.graphics.BlendMode p1) {}
    public void drawColor(long p0, android.graphics.BlendMode p1) {}
    public void drawLine(float p0, float p1, float p2, float p3, android.graphics.Paint p4) {}
    public void drawLines(float[] p0, int p1, int p2, android.graphics.Paint p3) {}
    public void drawLines(float[] p0, android.graphics.Paint p1) {}
    public void drawOval(android.graphics.RectF p0, android.graphics.Paint p1) {}
    public void drawOval(float p0, float p1, float p2, float p3, android.graphics.Paint p4) {}
    public void drawPaint(android.graphics.Paint p0) {}
    public void drawPatch(android.graphics.NinePatch p0, android.graphics.Rect p1, android.graphics.Paint p2) {}
    public void drawPatch(android.graphics.NinePatch p0, android.graphics.RectF p1, android.graphics.Paint p2) {}
    public void drawPath(android.graphics.Path p0, android.graphics.Paint p1) {}
    public void drawPoint(float p0, float p1, android.graphics.Paint p2) {}
    public void drawPoints(float[] p0, int p1, int p2, android.graphics.Paint p3) {}
    public void drawPoints(float[] p0, android.graphics.Paint p1) {}
    @java.lang.Deprecated
    public void drawPosText(char[] p0, int p1, int p2, float[] p3, android.graphics.Paint p4) {}
    @java.lang.Deprecated
    public void drawPosText(java.lang.String p0, float[] p1, android.graphics.Paint p2) {}
    public void drawRect(android.graphics.RectF p0, android.graphics.Paint p1) {}
    public void drawRect(android.graphics.Rect p0, android.graphics.Paint p1) {}
    public void drawRect(float p0, float p1, float p2, float p3, android.graphics.Paint p4) {}
    public void drawRGB(int p0, int p1, int p2) {}
    public void drawRoundRect(android.graphics.RectF p0, float p1, float p2, android.graphics.Paint p3) {}
    public void drawRoundRect(float p0, float p1, float p2, float p3, float p4, float p5, android.graphics.Paint p6) {}
    public void drawDoubleRoundRect(android.graphics.RectF p0, float p1, float p2, android.graphics.RectF p3, float p4, float p5, android.graphics.Paint p6) {}
    public void drawDoubleRoundRect(android.graphics.RectF p0, float[] p1, android.graphics.RectF p2, float[] p3, android.graphics.Paint p4) {}
    public void drawText(char[] p0, int p1, int p2, float p3, float p4, android.graphics.Paint p5) {}
    public void drawText(java.lang.String p0, float p1, float p2, android.graphics.Paint p3) {}
    public void drawText(java.lang.String p0, int p1, int p2, float p3, float p4, android.graphics.Paint p5) {}
    public void drawText(java.lang.CharSequence p0, int p1, int p2, float p3, float p4, android.graphics.Paint p5) {}
    public void drawTextOnPath(char[] p0, int p1, int p2, android.graphics.Path p3, float p4, float p5, android.graphics.Paint p6) {}
    public void drawTextOnPath(java.lang.String p0, android.graphics.Path p1, float p2, float p3, android.graphics.Paint p4) {}
    public void drawTextRun(char[] p0, int p1, int p2, int p3, int p4, float p5, float p6, boolean p7, android.graphics.Paint p8) {}
    public void drawTextRun(java.lang.CharSequence p0, int p1, int p2, int p3, int p4, float p5, float p6, boolean p7, android.graphics.Paint p8) {}
    public void drawTextRun(android.graphics.text.MeasuredText p0, int p1, int p2, int p3, int p4, float p5, float p6, boolean p7, android.graphics.Paint p8) {}
    public void drawVertices(android.graphics.Canvas.VertexMode p0, int p1, float[] p2, int p3, float[] p4, int p5, int[] p6, int p7, short[] p8, int p9, int p10, android.graphics.Paint p11) {}
    public void drawRenderNode(android.graphics.RenderNode p0) {}

    public static enum VertexMode {
        TRIANGLES,
        TRIANGLE_STRIP,
        TRIANGLE_FAN;
        public final int nativeInt = 0;
        private VertexMode() {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Saveflags {
    }

    private static class NoImagePreloadHolder {
        private NoImagePreloadHolder() {}
    }

    public static enum EdgeType {
        BW,
        AA;
        public final int nativeInt = 0;
        private EdgeType() {}
    }
}
