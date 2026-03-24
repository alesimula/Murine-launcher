package com.android.internal.widget.remotecompose.player.platform;

public class AndroidPaintContext extends com.android.internal.widget.remotecompose.core.PaintContext {
    android.graphics.Paint mPaint;
    java.util.List<android.graphics.Paint> mPaintList;
    android.graphics.Canvas mCanvas;
    android.graphics.Rect mTmpRect;
    android.graphics.RenderNode mNode;
    android.graphics.Canvas mPreviousCanvas;
    com.android.internal.widget.remotecompose.core.operations.paint.PaintChanges mCachedPaintChanges;
    public AndroidPaintContext(com.android.internal.widget.remotecompose.core.RemoteContext p0, android.graphics.Canvas p1) { super(null); }
    public android.graphics.Canvas getCanvas() { return null; }
    public void setCanvas(android.graphics.Canvas p0) {}
    public void save() {}
    public void saveLayer(float p0, float p1, float p2, float p3) {}
    public void restore() {}
    public void drawBitmap(int p0, int p1, int p2, int p3, int p4, int p5, int p6, int p7, int p8, int p9) {}
    public void scale(float p0, float p1) {}
    public void startGraphicsLayer(int p0, int p1) {}
    public void setGraphicsLayer(java.util.HashMap<java.lang.Integer, java.lang.Object> p0) {}
    public void endGraphicsLayer() {}
    public void translate(float p0, float p1) {}
    public void drawArc(float p0, float p1, float p2, float p3, float p4, float p5) {}
    public void drawSector(float p0, float p1, float p2, float p3, float p4, float p5) {}
    public void drawBitmap(int p0, float p1, float p2, float p3, float p4) {}
    public void drawCircle(float p0, float p1, float p2) {}
    public void drawLine(float p0, float p1, float p2, float p3) {}
    public void drawOval(float p0, float p1, float p2, float p3) {}
    public void drawPath(int p0, float p1, float p2) {}
    public void drawRect(float p0, float p1, float p2, float p3) {}
    public void savePaint() {}
    public void restorePaint() {}
    public void replacePaint(com.android.internal.widget.remotecompose.core.operations.paint.PaintBundle p0) {}
    public void drawRoundRect(float p0, float p1, float p2, float p3, float p4, float p5) {}
    public void drawTextOnPath(int p0, int p1, float p2, float p3) {}
    public void getTextBounds(int p0, int p1, int p2, int p3, float[] p4) {}
    public com.android.internal.widget.remotecompose.core.Platform.ComputedTextLayout layoutComplexText(int p0, int p1, int p2, int p3, int p4, int p5, float p6, int p7) { return null; }
    public void drawTextRun(int p0, int p1, int p2, int p3, int p4, float p5, float p6, boolean p7) {}
    public void drawComplexText(com.android.internal.widget.remotecompose.core.Platform.ComputedTextLayout p0) {}
    public void drawTweenPath(int p0, int p1, float p2, float p3, float p4) {}
    public static android.graphics.BlendMode origamiToBlendMode(int p0) { return null; }
    public void applyPaint(com.android.internal.widget.remotecompose.core.operations.paint.PaintBundle p0) {}
    public void matrixScale(float p0, float p1, float p2, float p3) {}
    public void matrixTranslate(float p0, float p1) {}
    public void matrixSkew(float p0, float p1) {}
    public void matrixRotate(float p0, float p1, float p2) {}
    public void matrixSave() {}
    public void matrixRestore() {}
    public void clipRect(float p0, float p1, float p2, float p3) {}
    public void roundedClipRect(float p0, float p1, float p2, float p3, float p4, float p5) {}
    public void clipPath(int p0, int p1) {}
    public void tweenPath(int p0, int p1, int p2, float p3) {}
    public void combinePath(int p0, int p1, int p2, byte p3) {}
    public void reset() {}
    @android.annotation.Nullable
    public java.lang.String getText(int p0) { return null; }
}
