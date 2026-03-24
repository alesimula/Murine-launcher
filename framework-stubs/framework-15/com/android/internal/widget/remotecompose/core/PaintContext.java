package com.android.internal.widget.remotecompose.core;

public abstract class PaintContext {
    protected com.android.internal.widget.remotecompose.core.RemoteContext mContext;
    public PaintContext(com.android.internal.widget.remotecompose.core.RemoteContext p0) {}
    public void setContext(com.android.internal.widget.remotecompose.core.RemoteContext p0) {}
    public abstract void drawBitmap(int p0, int p1, int p2, int p3, int p4, int p5, int p6, int p7, int p8, int p9);
    public abstract void scale(float p0, float p1);
    public abstract void translate(float p0, float p1);
    public abstract void drawArc(float p0, float p1, float p2, float p3, float p4, float p5);
    public abstract void drawBitmap(int p0, float p1, float p2, float p3, float p4);
    public abstract void drawCircle(float p0, float p1, float p2);
    public abstract void drawLine(float p0, float p1, float p2, float p3);
    public abstract void drawOval(float p0, float p1, float p2, float p3);
    public abstract void drawPath(int p0, float p1, float p2);
    public abstract void drawRect(float p0, float p1, float p2, float p3);
    public abstract void drawRoundRect(float p0, float p1, float p2, float p3, float p4, float p5);
    public abstract void drawTextOnPath(int p0, int p1, float p2, float p3);
    public abstract void getTextBounds(int p0, int p1, int p2, boolean p3, float[] p4);
    public abstract void drawTextRun(int p0, int p1, int p2, int p3, int p4, float p5, float p6, boolean p7);
    public abstract void drawTweenPath(int p0, int p1, float p2, float p3, float p4);
    public abstract void applyPaint(com.android.internal.widget.remotecompose.core.operations.paint.PaintBundle p0);
    public abstract void matrixScale(float p0, float p1, float p2, float p3);
    public abstract void matrixTranslate(float p0, float p1);
    public abstract void matrixSkew(float p0, float p1);
    public abstract void matrixRotate(float p0, float p1, float p2);
    public abstract void matrixSave();
    public abstract void matrixRestore();
    public abstract void clipRect(float p0, float p1, float p2, float p3);
    public abstract void clipPath(int p0, int p1);
    public abstract void reset();
}
