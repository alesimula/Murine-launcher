package android.inputmethodservice.navigationbar;

final class KeyButtonDrawable extends android.graphics.drawable.Drawable {
    public static final android.util.FloatProperty<android.inputmethodservice.navigationbar.KeyButtonDrawable> KEY_DRAWABLE_ROTATE = null;
    public static final android.util.FloatProperty<android.inputmethodservice.navigationbar.KeyButtonDrawable> KEY_DRAWABLE_TRANSLATE_Y = null;
    KeyButtonDrawable(android.graphics.drawable.Drawable p0, int p1, int p2, boolean p3, android.graphics.Color p4) { super(); }
    public void setDarkIntensity(float p0) {}
    public void setRotation(float p0) {}
    public void setTranslationX(float p0) {}
    public void setTranslationY(float p0) {}
    public void setTranslation(float p0, float p1) {}
    public void setShadowProperties(int p0, int p1, int p2, int p3) {}
    public boolean setVisible(boolean p0, boolean p1) { return false; }
    public void jumpToCurrentState() {}
    public void setAlpha(int p0) {}
    public void setColorFilter(android.graphics.ColorFilter p0) {}
    public float getDarkIntensity() { return 0.0f; }
    public float getRotation() { return 0.0f; }
    public float getTranslationX() { return 0.0f; }
    public float getTranslationY() { return 0.0f; }
    public android.graphics.drawable.Drawable.ConstantState getConstantState() { return null; }
    public int getOpacity() { return 0; }
    public int getIntrinsicHeight() { return 0; }
    public int getIntrinsicWidth() { return 0; }
    public boolean canAnimate() { return false; }
    public void startAnimation() {}
    public void resetAnimation() {}
    public void clearAnimationCallbacks() {}
    public void draw(android.graphics.Canvas p0) {}
    public boolean canApplyTheme() { return false; }
    int getDrawableBackgroundColor() { return 0; }
    boolean hasOvalBg() { return false; }
    public static android.inputmethodservice.navigationbar.KeyButtonDrawable create(android.content.Context p0, int p1, int p2, int p3, boolean p4, android.graphics.Color p5) { return null; }

    private static class ShadowDrawableState extends android.graphics.drawable.Drawable.ConstantState {
        int mChangingConfigurations;
        int mBaseWidth;
        int mBaseHeight;
        float mRotateDegrees;
        float mTranslationX;
        float mTranslationY;
        int mShadowOffsetX;
        int mShadowOffsetY;
        int mShadowSize;
        int mShadowColor;
        float mDarkIntensity;
        int mAlpha;
        boolean mHorizontalFlip;
        boolean mIsHardwareBitmap;
        android.graphics.Bitmap mLastDrawnIcon;
        android.graphics.Bitmap mLastDrawnShadow;
        android.graphics.drawable.Drawable.ConstantState mChildState;
        final int mLightColor = 0;
        final int mDarkColor = 0;
        final boolean mSupportsAnimation = false;
        final android.graphics.Color mOvalBackgroundColor = null;
        ShadowDrawableState(int p0, int p1, boolean p2, boolean p3, android.graphics.Color p4) { super(); }
        public android.graphics.drawable.Drawable newDrawable() { return null; }
        public int getChangingConfigurations() { return 0; }
        public boolean canApplyTheme() { return false; }
    }
}
