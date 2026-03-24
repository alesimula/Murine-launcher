package com.android.internal.widget;

@android.widget.RemoteViews.RemoteView
public final class NotificationProgressBar extends android.widget.ProgressBar implements com.android.internal.widget.NotificationProgressDrawable.BoundsChangeListener {
    public NotificationProgressBar(android.content.Context p0) { super((android.content.Context)null); }
    public NotificationProgressBar(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public NotificationProgressBar(android.content.Context p0, android.util.AttributeSet p1, int p2) { super((android.content.Context)null); }
    public NotificationProgressBar(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) { super((android.content.Context)null); }
    public void setIndeterminateDrawable(android.graphics.drawable.Drawable p0) {}
    @android.view.RemotableViewMethod
    public void setProgressModel(android.os.Bundle p0) {}
    @android.view.RemotableViewMethod(asyncImpl="setProgressTrackerIconAsync")
    public void setProgressTrackerIcon(android.graphics.drawable.Icon p0) {}
    public java.lang.Runnable setProgressTrackerIconAsync(android.graphics.drawable.Icon p0) { return null; }
    public synchronized void setProgress(int p0) {}
    public void setProgress(int p0, boolean p1) {}
    public synchronized void setMin(int p0) {}
    public synchronized void setMax(int p0) {}
    protected boolean verifyDrawable(android.graphics.drawable.Drawable p0) { return false; }
    public void jumpDrawablesToCurrentState() {}
    protected void drawableStateChanged() {}
    public void drawableHotspotChanged(float p0, float p1) {}
    protected void onSizeChanged(int p0, int p1, int p2, int p3) {}
    public void onDrawableBoundsChanged() {}
    public void onResolveDrawables(int p0) {}
    protected synchronized void onDraw(android.graphics.Canvas p0) {}
    protected synchronized void onMeasure(int p0, int p1) {}
    public java.lang.CharSequence getAccessibilityClassName() { return null; }
    public void onRtlPropertiesChanged(int p0) {}
    public static java.util.List<com.android.internal.widget.NotificationProgressBar.Part> processModelAndConvertToViewParts(java.util.List<android.app.Notification.ProgressStyle.Segment> p0, java.util.List<android.app.Notification.ProgressStyle.Point> p1, int p2, int p3) { return null; }
    static int getFadedColor(int p0) { return 0; }
    public static java.util.List<com.android.internal.widget.NotificationProgressDrawable.DrawablePart> processPartsAndConvertToDrawableParts(java.util.List<com.android.internal.widget.NotificationProgressBar.Part> p0, float p1, float p2, float p3, float p4, boolean p5, int p6) { return null; }
    public static android.util.Pair<java.util.List<com.android.internal.widget.NotificationProgressDrawable.DrawablePart>, java.lang.Float> maybeStretchAndRescaleSegments(java.util.List<com.android.internal.widget.NotificationProgressBar.Part> p0, java.util.List<com.android.internal.widget.NotificationProgressDrawable.DrawablePart> p1, float p2, float p3, float p4, boolean p5, float p6) throws com.android.internal.widget.NotificationProgressBar.NotEnoughWidthToFitAllPartsException { return null; }
    public static android.util.Pair<java.util.List<com.android.internal.widget.NotificationProgressDrawable.DrawablePart>, java.lang.Float> processModelAndConvertToFinalDrawableParts(java.util.List<android.app.Notification.ProgressStyle.Segment> p0, java.util.List<android.app.Notification.ProgressStyle.Point> p1, int p2, int p3, float p4, float p5, float p6, float p7, boolean p8, float p9, boolean p10, int p11) throws com.android.internal.widget.NotificationProgressBar.NotEnoughWidthToFitAllPartsException { return null; }

    public static class NotEnoughWidthToFitAllPartsException extends java.lang.Exception {
        public NotEnoughWidthToFitAllPartsException(java.lang.String p0) { super(); }
    }

    public static interface Part {
    }

    public static final class Point implements com.android.internal.widget.NotificationProgressBar.Part {
        public Point(int p0) {}
        public java.lang.String toString() { return null; }
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
    }

    public static final class Segment implements com.android.internal.widget.NotificationProgressBar.Part {
        public Segment(float p0, int p1) {}
        public Segment(float p0, int p1, boolean p2) {}
        public float getWidth() { return 0.0f; }
        public java.lang.String toString() { return null; }
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
    }
}
