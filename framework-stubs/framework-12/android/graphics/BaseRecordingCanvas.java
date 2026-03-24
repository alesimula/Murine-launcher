package android.graphics;

public class BaseRecordingCanvas extends android.graphics.Canvas {
    public BaseRecordingCanvas(long p0) { super(); }
    public final void drawArc(float p0, float p1, float p2, float p3, float p4, float p5, boolean p6, android.graphics.Paint p7) {}
    public final void drawArc(android.graphics.RectF p0, float p1, float p2, boolean p3, android.graphics.Paint p4) {}
    public final void drawARGB(int p0, int p1, int p2, int p3) {}
    public final void drawBitmap(android.graphics.Bitmap p0, float p1, float p2, android.graphics.Paint p3) {}
    public final void drawBitmap(android.graphics.Bitmap p0, android.graphics.Matrix p1, android.graphics.Paint p2) {}
    public final void drawBitmap(android.graphics.Bitmap p0, android.graphics.Rect p1, android.graphics.Rect p2, android.graphics.Paint p3) {}
    public final void drawBitmap(android.graphics.Bitmap p0, android.graphics.Rect p1, android.graphics.RectF p2, android.graphics.Paint p3) {}
    @java.lang.Deprecated
    public final void drawBitmap(int[] p0, int p1, int p2, float p3, float p4, int p5, int p6, boolean p7, android.graphics.Paint p8) {}
    @java.lang.Deprecated
    public final void drawBitmap(int[] p0, int p1, int p2, int p3, int p4, int p5, int p6, boolean p7, android.graphics.Paint p8) {}
    public final void drawBitmapMesh(android.graphics.Bitmap p0, int p1, int p2, float[] p3, int p4, int[] p5, int p6, android.graphics.Paint p7) {}
    public final void drawCircle(float p0, float p1, float p2, android.graphics.Paint p3) {}
    public final void drawColor(int p0) {}
    public final void drawColor(int p0, android.graphics.PorterDuff.Mode p1) {}
    public final void drawColor(int p0, android.graphics.BlendMode p1) {}
    public final void drawColor(long p0, android.graphics.BlendMode p1) {}
    public final void drawLine(float p0, float p1, float p2, float p3, android.graphics.Paint p4) {}
    public final void drawLines(float[] p0, int p1, int p2, android.graphics.Paint p3) {}
    public final void drawLines(float[] p0, android.graphics.Paint p1) {}
    public final void drawOval(float p0, float p1, float p2, float p3, android.graphics.Paint p4) {}
    public final void drawOval(android.graphics.RectF p0, android.graphics.Paint p1) {}
    public final void drawPaint(android.graphics.Paint p0) {}
    public final void drawPatch(android.graphics.NinePatch p0, android.graphics.Rect p1, android.graphics.Paint p2) {}
    public final void drawPatch(android.graphics.NinePatch p0, android.graphics.RectF p1, android.graphics.Paint p2) {}
    public final void drawPath(android.graphics.Path p0, android.graphics.Paint p1) {}
    public final void drawPicture(android.graphics.Picture p0) {}
    public final void drawPicture(android.graphics.Picture p0, android.graphics.Rect p1) {}
    public final void drawPicture(android.graphics.Picture p0, android.graphics.RectF p1) {}
    public final void drawPoint(float p0, float p1, android.graphics.Paint p2) {}
    public final void drawPoints(float[] p0, int p1, int p2, android.graphics.Paint p3) {}
    public final void drawPoints(float[] p0, android.graphics.Paint p1) {}
    @java.lang.Deprecated
    public final void drawPosText(char[] p0, int p1, int p2, float[] p3, android.graphics.Paint p4) {}
    @java.lang.Deprecated
    public final void drawPosText(java.lang.String p0, float[] p1, android.graphics.Paint p2) {}
    public final void drawRect(float p0, float p1, float p2, float p3, android.graphics.Paint p4) {}
    public final void drawRect(android.graphics.Rect p0, android.graphics.Paint p1) {}
    public final void drawRect(android.graphics.RectF p0, android.graphics.Paint p1) {}
    public final void drawRGB(int p0, int p1, int p2) {}
    public final void drawRoundRect(float p0, float p1, float p2, float p3, float p4, float p5, android.graphics.Paint p6) {}
    public final void drawRoundRect(android.graphics.RectF p0, float p1, float p2, android.graphics.Paint p3) {}
    public final void drawDoubleRoundRect(android.graphics.RectF p0, float p1, float p2, android.graphics.RectF p3, float p4, float p5, android.graphics.Paint p6) {}
    public final void drawDoubleRoundRect(android.graphics.RectF p0, float[] p1, android.graphics.RectF p2, float[] p3, android.graphics.Paint p4) {}
    public void drawGlyphs(int[] p0, int p1, float[] p2, int p3, int p4, android.graphics.fonts.Font p5, android.graphics.Paint p6) {}
    public final void drawText(char[] p0, int p1, int p2, float p3, float p4, android.graphics.Paint p5) {}
    public final void drawText(java.lang.CharSequence p0, int p1, int p2, float p3, float p4, android.graphics.Paint p5) {}
    public final void drawText(java.lang.String p0, float p1, float p2, android.graphics.Paint p3) {}
    public final void drawText(java.lang.String p0, int p1, int p2, float p3, float p4, android.graphics.Paint p5) {}
    public final void drawTextOnPath(char[] p0, int p1, int p2, android.graphics.Path p3, float p4, float p5, android.graphics.Paint p6) {}
    public final void drawTextOnPath(java.lang.String p0, android.graphics.Path p1, float p2, float p3, android.graphics.Paint p4) {}
    public final void drawTextRun(char[] p0, int p1, int p2, int p3, int p4, float p5, float p6, boolean p7, android.graphics.Paint p8) {}
    public final void drawTextRun(java.lang.CharSequence p0, int p1, int p2, int p3, int p4, float p5, float p6, boolean p7, android.graphics.Paint p8) {}
    public void drawTextRun(android.graphics.text.MeasuredText p0, int p1, int p2, int p3, int p4, float p5, float p6, boolean p7, android.graphics.Paint p8) {}
    public final void drawVertices(android.graphics.Canvas.VertexMode p0, int p1, float[] p2, int p3, float[] p4, int p5, int[] p6, int p7, short[] p8, int p9, int p10, android.graphics.Paint p11) {}
    public void punchHole(float p0, float p1, float p2, float p3, float p4, float p5) {}
    private static native void nDrawBitmap(long p0, long p1, float p2, float p3, long p4, int p5, int p6, int p7);
    private static native void nDrawBitmap(long p0, long p1, float p2, float p3, float p4, float p5, float p6, float p7, float p8, float p9, long p10, int p11, int p12);
    private static native void nDrawBitmap(long p0, int[] p1, int p2, int p3, float p4, float p5, int p6, int p7, boolean p8, long p9);
    private static native void nDrawColor(long p0, int p1, int p2);
    private static native void nDrawColor(long p0, long p1, long p2, int p3);
    private static native void nDrawPaint(long p0, long p1);
    private static native void nDrawPoint(long p0, float p1, float p2, long p3);
    private static native void nDrawPoints(long p0, float[] p1, int p2, int p3, long p4);
    private static native void nDrawLine(long p0, float p1, float p2, float p3, float p4, long p5);
    private static native void nDrawLines(long p0, float[] p1, int p2, int p3, long p4);
    private static native void nDrawRect(long p0, float p1, float p2, float p3, float p4, long p5);
    private static native void nDrawOval(long p0, float p1, float p2, float p3, float p4, long p5);
    private static native void nDrawCircle(long p0, float p1, float p2, float p3, long p4);
    private static native void nDrawArc(long p0, float p1, float p2, float p3, float p4, float p5, float p6, boolean p7, long p8);
    private static native void nDrawRoundRect(long p0, float p1, float p2, float p3, float p4, float p5, float p6, long p7);
    private static native void nDrawDoubleRoundRect(long p0, float p1, float p2, float p3, float p4, float p5, float p6, float p7, float p8, float p9, float p10, float p11, float p12, long p13);
    private static native void nDrawDoubleRoundRect(long p0, float p1, float p2, float p3, float p4, float[] p5, float p6, float p7, float p8, float p9, float[] p10, long p11);
    private static native void nDrawPath(long p0, long p1, long p2);
    private static native void nDrawRegion(long p0, long p1, long p2);
    private static native void nDrawNinePatch(long p0, long p1, long p2, float p3, float p4, float p5, float p6, long p7, int p8, int p9);
    private static native void nDrawBitmapMatrix(long p0, long p1, long p2, long p3);
    private static native void nDrawBitmapMesh(long p0, long p1, int p2, int p3, float[] p4, int p5, int[] p6, int p7, long p8);
    private static native void nDrawVertices(long p0, int p1, int p2, float[] p3, int p4, float[] p5, int p6, int[] p7, int p8, short[] p9, int p10, int p11, long p12);
    private static native void nDrawGlyphs(long p0, int[] p1, float[] p2, int p3, int p4, int p5, long p6, long p7);
    private static native void nDrawText(long p0, char[] p1, int p2, int p3, float p4, float p5, int p6, long p7);
    private static native void nDrawText(long p0, java.lang.String p1, int p2, int p3, float p4, float p5, int p6, long p7);
    private static native void nDrawTextRun(long p0, java.lang.String p1, int p2, int p3, int p4, int p5, float p6, float p7, boolean p8, long p9);
    private static native void nDrawTextRun(long p0, char[] p1, int p2, int p3, int p4, int p5, float p6, float p7, boolean p8, long p9, long p10);
    private static native void nDrawTextOnPath(long p0, char[] p1, int p2, int p3, long p4, float p5, float p6, int p7, long p8);
    private static native void nDrawTextOnPath(long p0, java.lang.String p1, long p2, float p3, float p4, int p5, long p6);
    private static native void nPunchHole(long p0, float p1, float p2, float p3, float p4, float p5, float p6);
}
