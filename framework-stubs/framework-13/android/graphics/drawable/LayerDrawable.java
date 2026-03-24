package android.graphics.drawable;

public class LayerDrawable extends android.graphics.drawable.Drawable implements android.graphics.drawable.Drawable.Callback {
    public static final int PADDING_MODE_NEST = 0;
    public static final int PADDING_MODE_STACK = 1;
    public static final int INSET_UNDEFINED = -2147483648;
    android.graphics.drawable.LayerDrawable.LayerState mLayerState;
    public LayerDrawable(android.graphics.drawable.Drawable[] p0) { super(); }
    LayerDrawable(android.graphics.drawable.Drawable[] p0, android.graphics.drawable.LayerDrawable.LayerState p1) { super(); }
    LayerDrawable() { super(); }
    LayerDrawable(android.graphics.drawable.LayerDrawable.LayerState p0, android.content.res.Resources p1) { super(); }
    android.graphics.drawable.LayerDrawable.LayerState createConstantState(android.graphics.drawable.LayerDrawable.LayerState p0, android.content.res.Resources p1) { return null; }
    public void inflate(android.content.res.Resources p0, org.xmlpull.v1.XmlPullParser p1, android.util.AttributeSet p2, android.content.res.Resources.Theme p3) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {}
    public void applyTheme(android.content.res.Resources.Theme p0) {}
    public boolean canApplyTheme() { return false; }
    public boolean isProjected() { return false; }
    int addLayer(android.graphics.drawable.LayerDrawable.ChildDrawable p0) { return 0; }
    android.graphics.drawable.LayerDrawable.ChildDrawable addLayer(android.graphics.drawable.Drawable p0, int[] p1, int p2, int p3, int p4, int p5, int p6) { return null; }
    public int addLayer(android.graphics.drawable.Drawable p0) { return 0; }
    public android.graphics.drawable.Drawable findDrawableByLayerId(int p0) { return null; }
    public void setId(int p0, int p1) {}
    public int getId(int p0) { return 0; }
    public int getNumberOfLayers() { return 0; }
    public boolean setDrawableByLayerId(int p0, android.graphics.drawable.Drawable p1) { return false; }
    public int findIndexByLayerId(int p0) { return 0; }
    public void setDrawable(int p0, android.graphics.drawable.Drawable p1) {}
    public android.graphics.drawable.Drawable getDrawable(int p0) { return null; }
    public void setLayerSize(int p0, int p1, int p2) {}
    public void setLayerWidth(int p0, int p1) {}
    public int getLayerWidth(int p0) { return 0; }
    public void setLayerHeight(int p0, int p1) {}
    public int getLayerHeight(int p0) { return 0; }
    public void setLayerGravity(int p0, int p1) {}
    public int getLayerGravity(int p0) { return 0; }
    public void setLayerInset(int p0, int p1, int p2, int p3, int p4) {}
    public void setLayerInsetRelative(int p0, int p1, int p2, int p3, int p4) {}
    public void setLayerInsetLeft(int p0, int p1) {}
    public int getLayerInsetLeft(int p0) { return 0; }
    public void setLayerInsetRight(int p0, int p1) {}
    public int getLayerInsetRight(int p0) { return 0; }
    public void setLayerInsetTop(int p0, int p1) {}
    public int getLayerInsetTop(int p0) { return 0; }
    public void setLayerInsetBottom(int p0, int p1) {}
    public int getLayerInsetBottom(int p0) { return 0; }
    public void setLayerInsetStart(int p0, int p1) {}
    public int getLayerInsetStart(int p0) { return 0; }
    public void setLayerInsetEnd(int p0, int p1) {}
    public int getLayerInsetEnd(int p0) { return 0; }
    public void setPaddingMode(int p0) {}
    public int getPaddingMode() { return 0; }
    public void invalidateDrawable(android.graphics.drawable.Drawable p0) {}
    public void scheduleDrawable(android.graphics.drawable.Drawable p0, java.lang.Runnable p1, long p2) {}
    public void unscheduleDrawable(android.graphics.drawable.Drawable p0, java.lang.Runnable p1) {}
    public void draw(android.graphics.Canvas p0) {}
    public int getChangingConfigurations() { return 0; }
    public boolean getPadding(android.graphics.Rect p0) { return false; }
    public void setPadding(int p0, int p1, int p2, int p3) {}
    public void setPaddingRelative(int p0, int p1, int p2, int p3) {}
    public int getLeftPadding() { return 0; }
    public int getRightPadding() { return 0; }
    public int getStartPadding() { return 0; }
    public int getEndPadding() { return 0; }
    public int getTopPadding() { return 0; }
    public int getBottomPadding() { return 0; }
    public void getOutline(android.graphics.Outline p0) {}
    public void setHotspot(float p0, float p1) {}
    public void setHotspotBounds(int p0, int p1, int p2, int p3) {}
    public void getHotspotBounds(android.graphics.Rect p0) {}
    public boolean setVisible(boolean p0, boolean p1) { return false; }
    public void setDither(boolean p0) {}
    public void setAlpha(int p0) {}
    public int getAlpha() { return 0; }
    public void setColorFilter(android.graphics.ColorFilter p0) {}
    public void setTintList(android.content.res.ColorStateList p0) {}
    public void setTintBlendMode(android.graphics.BlendMode p0) {}
    public void setOpacity(int p0) {}
    public int getOpacity() { return 0; }
    public void setAutoMirrored(boolean p0) {}
    public boolean isAutoMirrored() { return false; }
    public void jumpToCurrentState() {}
    public boolean isStateful() { return false; }
    public boolean hasFocusStateSpecified() { return false; }
    protected boolean onStateChange(int[] p0) { return false; }
    protected boolean onLevelChange(int p0) { return false; }
    protected void onBoundsChange(android.graphics.Rect p0) {}
    public int getIntrinsicWidth() { return 0; }
    public int getIntrinsicHeight() { return 0; }
    void ensurePadding() {}
    void refreshPadding() {}
    public android.graphics.drawable.Drawable.ConstantState getConstantState() { return null; }
    public android.graphics.drawable.Drawable mutate() { return null; }
    public void clearMutated() {}
    public boolean onLayoutDirectionChanged(int p0) { return false; }

    static class ChildDrawable {
        public android.graphics.drawable.Drawable mDrawable;
        public int[] mThemeAttrs;
        public int mDensity;
        public int mInsetL;
        public int mInsetT;
        public int mInsetR;
        public int mInsetB;
        public int mInsetS;
        public int mInsetE;
        public int mWidth;
        public int mHeight;
        public int mGravity;
        public int mId;
        ChildDrawable(int p0) {}
        ChildDrawable(android.graphics.drawable.LayerDrawable.ChildDrawable p0, android.graphics.drawable.LayerDrawable p1, android.content.res.Resources p2) {}
        public boolean canApplyTheme() { return false; }
        public final void setDensity(int p0) {}
    }

    static class LayerState extends android.graphics.drawable.Drawable.ConstantState {
        int mNumChildren;
        android.graphics.drawable.LayerDrawable.ChildDrawable[] mChildren;
        int mDensity;
        int mPaddingTop;
        int mPaddingBottom;
        int mPaddingLeft;
        int mPaddingRight;
        int mPaddingStart;
        int mPaddingEnd;
        int mOpacityOverride;
        int mChangingConfigurations;
        int mChildrenChangingConfigurations;
        LayerState(android.graphics.drawable.LayerDrawable.LayerState p0, android.graphics.drawable.LayerDrawable p1, android.content.res.Resources p2) { super(); }
        public final void setDensity(int p0) {}
        protected void onDensityChanged(int p0, int p1) {}
        public boolean canApplyTheme() { return false; }
        public android.graphics.drawable.Drawable newDrawable() { return null; }
        public android.graphics.drawable.Drawable newDrawable(android.content.res.Resources p0) { return null; }
        public int getChangingConfigurations() { return 0; }
        public final int getOpacity() { return 0; }
        public final boolean isStateful() { return false; }
        public final boolean hasFocusStateSpecified() { return false; }
        public final boolean canConstantState() { return false; }
        void invalidateCache() {}
    }
}
