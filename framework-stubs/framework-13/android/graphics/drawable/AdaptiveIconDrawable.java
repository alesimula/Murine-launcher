package android.graphics.drawable;

public class AdaptiveIconDrawable extends android.graphics.drawable.Drawable implements android.graphics.drawable.Drawable.Callback {
    public static final float MASK_SIZE = 100.0f;
    android.graphics.drawable.AdaptiveIconDrawable.LayerState mLayerState;
    AdaptiveIconDrawable() { super(); }
    AdaptiveIconDrawable(android.graphics.drawable.AdaptiveIconDrawable.LayerState p0, android.content.res.Resources p1) { super(); }
    android.graphics.drawable.AdaptiveIconDrawable.LayerState createConstantState(android.graphics.drawable.AdaptiveIconDrawable.LayerState p0, android.content.res.Resources p1) { return null; }
    public AdaptiveIconDrawable(android.graphics.drawable.Drawable p0, android.graphics.drawable.Drawable p1) { super(); }
    public AdaptiveIconDrawable(android.graphics.drawable.Drawable p0, android.graphics.drawable.Drawable p1, android.graphics.drawable.Drawable p2) { super(); }
    public void inflate(android.content.res.Resources p0, org.xmlpull.v1.XmlPullParser p1, android.util.AttributeSet p2, android.content.res.Resources.Theme p3) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {}
    public static float getExtraInsetFraction() { return 0.0f; }
    public static float getExtraInsetPercentage() { return 0.0f; }
    public android.graphics.Path getIconMask() { return null; }
    public android.graphics.drawable.Drawable getForeground() { return null; }
    public android.graphics.drawable.Drawable getBackground() { return null; }
    public android.graphics.drawable.Drawable getMonochrome() { return null; }
    protected void onBoundsChange(android.graphics.Rect p0) {}
    public void draw(android.graphics.Canvas p0) {}
    public void invalidateSelf() {}
    public void getOutline(android.graphics.Outline p0) {}
    public android.graphics.Region getSafeZone() { return null; }
    public android.graphics.Region getTransparentRegion() { return null; }
    public void applyTheme(android.content.res.Resources.Theme p0) {}
    public int getSourceDrawableResId() { return 0; }
    public boolean canApplyTheme() { return false; }
    public boolean isProjected() { return false; }
    public void invalidateDrawable(android.graphics.drawable.Drawable p0) {}
    public void scheduleDrawable(android.graphics.drawable.Drawable p0, java.lang.Runnable p1, long p2) {}
    public void unscheduleDrawable(android.graphics.drawable.Drawable p0, java.lang.Runnable p1) {}
    public int getChangingConfigurations() { return 0; }
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
    public int getIntrinsicWidth() { return 0; }
    public int getIntrinsicHeight() { return 0; }
    public android.graphics.drawable.Drawable.ConstantState getConstantState() { return null; }
    public android.graphics.drawable.Drawable mutate() { return null; }
    public void clearMutated() {}

    static class ChildDrawable {
        public android.graphics.drawable.Drawable mDrawable;
        public int[] mThemeAttrs;
        public int mDensity;
        ChildDrawable(int p0) {}
        ChildDrawable(android.graphics.drawable.AdaptiveIconDrawable.ChildDrawable p0, android.graphics.drawable.AdaptiveIconDrawable p1, android.content.res.Resources p2) {}
        public boolean canApplyTheme() { return false; }
        public final void setDensity(int p0) {}
    }

    static class LayerState extends android.graphics.drawable.Drawable.ConstantState {
        static final int N_CHILDREN = 3;
        android.graphics.drawable.AdaptiveIconDrawable.ChildDrawable[] mChildren;
        int mDensity;
        int mSrcDensityOverride;
        int mOpacityOverride;
        int mChangingConfigurations;
        int mChildrenChangingConfigurations;
        int mSourceDrawableId;
        LayerState(android.graphics.drawable.AdaptiveIconDrawable.LayerState p0, android.graphics.drawable.AdaptiveIconDrawable p1, android.content.res.Resources p2) { super(); }
        public final void setDensity(int p0) {}
        public boolean canApplyTheme() { return false; }
        public android.graphics.drawable.Drawable newDrawable() { return null; }
        public android.graphics.drawable.Drawable newDrawable(android.content.res.Resources p0) { return null; }
        public int getChangingConfigurations() { return 0; }
        public final int getOpacity() { return 0; }
        public final boolean isStateful() { return false; }
        public final boolean hasFocusStateSpecified() { return false; }
        public final boolean canConstantState() { return false; }
        public void invalidateCache() {}
    }
}
