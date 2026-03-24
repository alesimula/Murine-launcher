package android.graphics.drawable;

public class ColorStateListDrawable extends android.graphics.drawable.Drawable implements android.graphics.drawable.Drawable.Callback {
    private android.graphics.drawable.ColorDrawable mColorDrawable;
    private android.graphics.drawable.ColorStateListDrawable.ColorStateListDrawableState mState;
    private boolean mMutated;
    public ColorStateListDrawable() { super(); }
    public ColorStateListDrawable(android.content.res.ColorStateList p0) { super(); }
    private ColorStateListDrawable(android.graphics.drawable.ColorStateListDrawable.ColorStateListDrawableState p0) { super(); }
    public void draw(android.graphics.Canvas p0) {}
    public int getAlpha() { return 0; }
    public boolean isStateful() { return false; }
    public boolean hasFocusStateSpecified() { return false; }
    public android.graphics.drawable.Drawable getCurrent() { return null; }
    public void applyTheme(android.content.res.Resources.Theme p0) {}
    public boolean canApplyTheme() { return false; }
    public void setAlpha(int p0) {}
    public void clearAlpha() {}
    public void setTintList(android.content.res.ColorStateList p0) {}
    public void setTintBlendMode(android.graphics.BlendMode p0) {}
    public android.graphics.ColorFilter getColorFilter() { return null; }
    public void setColorFilter(android.graphics.ColorFilter p0) {}
    public int getOpacity() { return 0; }
    protected void onBoundsChange(android.graphics.Rect p0) {}
    protected boolean onStateChange(int[] p0) { return false; }
    public void invalidateDrawable(android.graphics.drawable.Drawable p0) {}
    public void scheduleDrawable(android.graphics.drawable.Drawable p0, java.lang.Runnable p1, long p2) {}
    public void unscheduleDrawable(android.graphics.drawable.Drawable p0, java.lang.Runnable p1) {}
    public android.graphics.drawable.Drawable.ConstantState getConstantState() { return null; }
    public android.content.res.ColorStateList getColorStateList() { return null; }
    public int getChangingConfigurations() { return 0; }
    public android.graphics.drawable.Drawable mutate() { return null; }
    public void clearMutated() {}
    public void setColorStateList(android.content.res.ColorStateList p0) {}
    private void initializeColorDrawable() {}

    static final class ColorStateListDrawableState extends android.graphics.drawable.Drawable.ConstantState {
        android.content.res.ColorStateList mColor;
        android.content.res.ColorStateList mTint;
        int mAlpha;
        android.graphics.BlendMode mBlendMode;
        int mChangingConfigurations;
        ColorStateListDrawableState() { super(); }
        ColorStateListDrawableState(android.graphics.drawable.ColorStateListDrawable.ColorStateListDrawableState p0) { super(); }
        public android.graphics.drawable.Drawable newDrawable() { return null; }
        public int getChangingConfigurations() { return 0; }
        public boolean isStateful() { return false; }
        public boolean hasFocusStateSpecified() { return false; }
        public boolean canApplyTheme() { return false; }
    }
}
