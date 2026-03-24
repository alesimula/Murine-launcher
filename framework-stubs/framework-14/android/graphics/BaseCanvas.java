package android.graphics;

public abstract class BaseCanvas {
    protected long mNativeCanvasWrapper;
    protected int mScreenDensity;
    protected int mDensity;
    public BaseCanvas() {}
    protected void throwIfCannotDraw(android.graphics.Bitmap p0) {}
    protected static final void checkRange(int p0, int p1, int p2) {}
    public boolean isHardwareAccelerated() { return false; }
    public void drawArc(float p0, float p1, float p2, float p3, float p4, float p5, boolean p6, android.graphics.Paint p7) {}
    public void drawArc(android.graphics.RectF p0, float p1, float p2, boolean p3, android.graphics.Paint p4) {}
    public void drawARGB(int p0, int p1, int p2, int p3) {}
    public void drawBitmap(android.graphics.Bitmap p0, float p1, float p2, android.graphics.Paint p3) {}
    public void drawBitmap(android.graphics.Bitmap p0, android.graphics.Matrix p1, android.graphics.Paint p2) {}
    public void drawBitmap(android.graphics.Bitmap p0, android.graphics.Rect p1, android.graphics.Rect p2, android.graphics.Paint p3) {}
    public void drawBitmap(android.graphics.Bitmap p0, android.graphics.Rect p1, android.graphics.RectF p2, android.graphics.Paint p3) {}
    @java.lang.Deprecated
    public void drawBitmap(int[] p0, int p1, int p2, float p3, float p4, int p5, int p6, boolean p7, android.graphics.Paint p8) {}
    @java.lang.Deprecated
    public void drawBitmap(int[] p0, int p1, int p2, int p3, int p4, int p5, int p6, boolean p7, android.graphics.Paint p8) {}
    public void drawBitmapMesh(android.graphics.Bitmap p0, int p1, int p2, float[] p3, int p4, int[] p5, int p6, android.graphics.Paint p7) {}
    public void drawCircle(float p0, float p1, float p2, android.graphics.Paint p3) {}
    public void drawColor(int p0) {}
    public void drawColor(int p0, android.graphics.PorterDuff.Mode p1) {}
    public void drawColor(int p0, android.graphics.BlendMode p1) {}
    public void drawColor(long p0, android.graphics.BlendMode p1) {}
    public void drawLine(float p0, float p1, float p2, float p3, android.graphics.Paint p4) {}
    public void drawLines(float[] p0, int p1, int p2, android.graphics.Paint p3) {}
    public void drawLines(float[] p0, android.graphics.Paint p1) {}
    public void drawOval(float p0, float p1, float p2, float p3, android.graphics.Paint p4) {}
    public void drawOval(android.graphics.RectF p0, android.graphics.Paint p1) {}
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
    public void drawRect(float p0, float p1, float p2, float p3, android.graphics.Paint p4) {}
    public void drawRect(android.graphics.Rect p0, android.graphics.Paint p1) {}
    public void drawRect(android.graphics.RectF p0, android.graphics.Paint p1) {}
    public void drawRGB(int p0, int p1, int p2) {}
    public void drawRoundRect(float p0, float p1, float p2, float p3, float p4, float p5, android.graphics.Paint p6) {}
    public void drawRoundRect(android.graphics.RectF p0, float p1, float p2, android.graphics.Paint p3) {}
    public void drawDoubleRoundRect(android.graphics.RectF p0, float p1, float p2, android.graphics.RectF p3, float p4, float p5, android.graphics.Paint p6) {}
    public void drawDoubleRoundRect(android.graphics.RectF p0, float[] p1, android.graphics.RectF p2, float[] p3, android.graphics.Paint p4) {}
    public void drawGlyphs(int[] p0, int p1, float[] p2, int p3, int p4, android.graphics.fonts.Font p5, android.graphics.Paint p6) {}
    public void drawText(char[] p0, int p1, int p2, float p3, float p4, android.graphics.Paint p5) {}
    public void drawText(java.lang.CharSequence p0, int p1, int p2, float p3, float p4, android.graphics.Paint p5) {}
    public void drawText(java.lang.String p0, float p1, float p2, android.graphics.Paint p3) {}
    public void drawText(java.lang.String p0, int p1, int p2, float p3, float p4, android.graphics.Paint p5) {}
    public void drawTextOnPath(char[] p0, int p1, int p2, android.graphics.Path p3, float p4, float p5, android.graphics.Paint p6) {}
    public void drawTextOnPath(java.lang.String p0, android.graphics.Path p1, float p2, float p3, android.graphics.Paint p4) {}
    public void drawTextRun(char[] p0, int p1, int p2, int p3, int p4, float p5, float p6, boolean p7, android.graphics.Paint p8) {}
    public void drawTextRun(java.lang.CharSequence p0, int p1, int p2, int p3, int p4, float p5, float p6, boolean p7, android.graphics.Paint p8) {}
    public void drawTextRun(android.graphics.text.MeasuredText p0, int p1, int p2, int p3, int p4, float p5, float p6, boolean p7, android.graphics.Paint p8) {}
    public void drawVertices(android.graphics.Canvas.VertexMode p0, int p1, float[] p2, int p3, float[] p4, int p5, int[] p6, int p7, short[] p8, int p9, int p10, android.graphics.Paint p11) {}
    public void drawMesh(android.graphics.Mesh p0, android.graphics.BlendMode p1, android.graphics.Paint p2) {}
    public void punchHole(float p0, float p1, float p2, float p3, float p4, float p5, float p6) {}
    public void setHwFeaturesInSwModeEnabled(boolean p0) {}
    public boolean isHwFeaturesInSwModeEnabled() { return false; }
    protected boolean onHwFeatureInSwMode() { return false; }
}
