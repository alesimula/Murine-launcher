package com.android.internal.widget;

public final class NotificationProgressDrawable extends android.graphics.drawable.Drawable {
    public NotificationProgressDrawable() { super(); }
    public float getPointRadius() { return 0.0f; }
    public void setParts(java.util.List<com.android.internal.widget.NotificationProgressDrawable.DrawablePart> p0) {}
    public void setParts(com.android.internal.widget.NotificationProgressDrawable.DrawablePart... p0) {}
    public void updateEndDotColor(int p0) {}
    public void draw(android.graphics.Canvas p0) {}
    public int getChangingConfigurations() { return 0; }
    public void setAlpha(int p0) {}
    public int getAlpha() { return 0; }
    public void setColorFilter(android.graphics.ColorFilter p0) {}
    public int getOpacity() { return 0; }
    public void setBoundsChangeListener(com.android.internal.widget.NotificationProgressDrawable.BoundsChangeListener p0) {}
    protected void onBoundsChange(android.graphics.Rect p0) {}
    public void inflate(android.content.res.Resources p0, org.xmlpull.v1.XmlPullParser p1, android.util.AttributeSet p2, android.content.res.Resources.Theme p3) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {}
    public void applyTheme(android.content.res.Resources.Theme p0) {}
    public boolean canApplyTheme() { return false; }
    static int resolveDensity(android.content.res.Resources p0, int p1) { return 0; }
    public android.graphics.drawable.Drawable mutate() { return null; }
    public void clearMutated() {}
    public android.graphics.drawable.Drawable.ConstantState getConstantState() { return null; }

    public static interface BoundsChangeListener {
        public void onDrawableBoundsChanged();
    }

    public static abstract class DrawablePart {
        protected float mStart;
        protected float mEnd;
        protected final int mColor = 0;
        protected DrawablePart(float p0, float p1, int p2) {}
        public float getStart() { return 0.0f; }
        public void setStart(float p0) {}
        public float getEnd() { return 0.0f; }
        public void setEnd(float p0) {}
        public float getWidth() { return 0.0f; }
        public int getColor() { return 0; }
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
    }

    public static final class DrawablePoint extends com.android.internal.widget.NotificationProgressDrawable.DrawablePart {
        public DrawablePoint(float p0, float p1, int p2) { super(0.0f, 0.0f, 0); }
        public java.lang.String toString() { return null; }
    }

    public static final class DrawableSegment extends com.android.internal.widget.NotificationProgressDrawable.DrawablePart {
        public DrawableSegment(float p0, float p1, int p2) { super(0.0f, 0.0f, 0); }
        public DrawableSegment(float p0, float p1, int p2, boolean p3) { super(0.0f, 0.0f, 0); }
        public java.lang.String toString() { return null; }
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
    }

    static final class State extends android.graphics.drawable.Drawable.ConstantState {
        int mChangingConfigurations;
        float mSegmentHeight;
        float mFadedSegmentHeight;
        float mSegmentCornerRadius;
        float mPointRadius;
        float mPointRectInset;
        float mPointRectCornerRadius;
        int[] mThemeAttrs;
        int[] mThemeAttrsSegments;
        int[] mThemeAttrsPoints;
        int mDensity;
        State() { super(); }
        State(com.android.internal.widget.NotificationProgressDrawable.State p0, android.content.res.Resources p1) { super(); }
        public android.graphics.drawable.Drawable newDrawable() { return null; }
        public android.graphics.drawable.Drawable newDrawable(android.content.res.Resources p0) { return null; }
        public int getChangingConfigurations() { return 0; }
        public boolean canApplyTheme() { return false; }
        public void setDensity(int p0) {}
    }
}
