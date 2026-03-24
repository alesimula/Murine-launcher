package android.graphics.drawable;

public abstract class DrawableWrapper extends android.graphics.drawable.Drawable implements android.graphics.drawable.Drawable.Callback {
    DrawableWrapper(android.graphics.drawable.DrawableWrapper.DrawableWrapperState p0, android.content.res.Resources p1) { super(); }
    public DrawableWrapper(android.graphics.drawable.Drawable p0) { super(); }
    public void setXfermode(android.graphics.Xfermode p0) {}
    public void setDrawable(android.graphics.drawable.Drawable p0) {}
    @android.annotation.Nullable
    public android.graphics.drawable.Drawable getDrawable() { return null; }
    public void inflate(android.content.res.Resources p0, org.xmlpull.v1.XmlPullParser p1, android.util.AttributeSet p2, android.content.res.Resources.Theme p3) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {}
    public void applyTheme(android.content.res.Resources.Theme p0) {}
    public boolean canApplyTheme() { return false; }
    public void invalidateDrawable(android.graphics.drawable.Drawable p0) {}
    public void scheduleDrawable(android.graphics.drawable.Drawable p0, java.lang.Runnable p1, long p2) {}
    public void unscheduleDrawable(android.graphics.drawable.Drawable p0, java.lang.Runnable p1) {}
    public void draw(android.graphics.Canvas p0) {}
    public int getChangingConfigurations() { return 0; }
    public boolean getPadding(android.graphics.Rect p0) { return false; }
    public android.graphics.Insets getOpticalInsets() { return null; }
    public void setHotspot(float p0, float p1) {}
    public void setHotspotBounds(int p0, int p1, int p2, int p3) {}
    public void getHotspotBounds(android.graphics.Rect p0) {}
    public boolean setVisible(boolean p0, boolean p1) { return false; }
    public void setAlpha(int p0) {}
    public int getAlpha() { return 0; }
    public void setColorFilter(android.graphics.ColorFilter p0) {}
    public android.graphics.ColorFilter getColorFilter() { return null; }
    public void setTintList(android.content.res.ColorStateList p0) {}
    public void setTintBlendMode(android.graphics.BlendMode p0) {}
    public boolean onLayoutDirectionChanged(int p0) { return false; }
    public int getOpacity() { return 0; }
    public boolean isStateful() { return false; }
    public boolean hasFocusStateSpecified() { return false; }
    protected boolean onStateChange(int[] p0) { return false; }
    public void jumpToCurrentState() {}
    protected boolean onLevelChange(int p0) { return false; }
    protected void onBoundsChange(android.graphics.Rect p0) {}
    public int getIntrinsicWidth() { return 0; }
    public int getIntrinsicHeight() { return 0; }
    public void getOutline(android.graphics.Outline p0) {}
    @android.annotation.Nullable
    public android.graphics.drawable.Drawable.ConstantState getConstantState() { return null; }
    @android.annotation.NonNull
    public android.graphics.drawable.Drawable mutate() { return null; }
    android.graphics.drawable.DrawableWrapper.DrawableWrapperState mutateConstantState() { return null; }
    public void clearMutated() {}

    static abstract class DrawableWrapperState extends android.graphics.drawable.Drawable.ConstantState {
        int mChangingConfigurations;
        int mDensity;
        int mSrcDensityOverride;
        android.graphics.drawable.Drawable.ConstantState mDrawableState;
        DrawableWrapperState(android.graphics.drawable.DrawableWrapper.DrawableWrapperState p0, android.content.res.Resources p1) { super(); }
        public final void setDensity(int p0) {}
        void onDensityChanged(int p0, int p1) {}
        public boolean canApplyTheme() { return false; }
        public android.graphics.drawable.Drawable newDrawable() { return null; }
        public abstract android.graphics.drawable.Drawable newDrawable(android.content.res.Resources p0);
        public int getChangingConfigurations() { return 0; }
        public boolean canConstantState() { return false; }
    }
}
