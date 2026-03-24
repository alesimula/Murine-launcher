package android.graphics.drawable;

public class NinePatchDrawable extends android.graphics.drawable.Drawable {
    NinePatchDrawable() { super(); }
    @java.lang.Deprecated
    public NinePatchDrawable(android.graphics.Bitmap p0, byte[] p1, android.graphics.Rect p2, java.lang.String p3) { super(); }
    public NinePatchDrawable(android.content.res.Resources p0, android.graphics.Bitmap p1, byte[] p2, android.graphics.Rect p3, java.lang.String p4) { super(); }
    public NinePatchDrawable(android.content.res.Resources p0, android.graphics.Bitmap p1, byte[] p2, android.graphics.Rect p3, android.graphics.Rect p4, java.lang.String p5) { super(); }
    @java.lang.Deprecated
    public NinePatchDrawable(android.graphics.NinePatch p0) { super(); }
    public NinePatchDrawable(android.content.res.Resources p0, android.graphics.NinePatch p1) { super(); }
    public void setTargetDensity(android.graphics.Canvas p0) {}
    public void setTargetDensity(android.util.DisplayMetrics p0) {}
    public void setTargetDensity(int p0) {}
    public void draw(android.graphics.Canvas p0) {}
    public int getChangingConfigurations() { return 0; }
    public boolean getPadding(android.graphics.Rect p0) { return false; }
    public void getOutline(android.graphics.Outline p0) {}
    public android.graphics.Insets getOpticalInsets() { return null; }
    public void setAlpha(int p0) {}
    public int getAlpha() { return 0; }
    public void setColorFilter(android.graphics.ColorFilter p0) {}
    public void setTintList(android.content.res.ColorStateList p0) {}
    public void setTintBlendMode(android.graphics.BlendMode p0) {}
    public void setDither(boolean p0) {}
    public void setAutoMirrored(boolean p0) {}
    public boolean isAutoMirrored() { return false; }
    public void setFilterBitmap(boolean p0) {}
    public boolean isFilterBitmap() { return false; }
    public void inflate(android.content.res.Resources p0, org.xmlpull.v1.XmlPullParser p1, android.util.AttributeSet p2, android.content.res.Resources.Theme p3) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {}
    public void applyTheme(android.content.res.Resources.Theme p0) {}
    public boolean canApplyTheme() { return false; }
    public android.graphics.Paint getPaint() { return null; }
    public int getIntrinsicWidth() { return 0; }
    public int getIntrinsicHeight() { return 0; }
    public int getOpacity() { return 0; }
    public android.graphics.Region getTransparentRegion() { return null; }
    public android.graphics.drawable.Drawable.ConstantState getConstantState() { return null; }
    public android.graphics.drawable.Drawable mutate() { return null; }
    public void clearMutated() {}
    protected boolean onStateChange(int[] p0) { return false; }
    public boolean isStateful() { return false; }
    public boolean hasFocusStateSpecified() { return false; }

    static final class NinePatchState extends android.graphics.drawable.Drawable.ConstantState {
        int mChangingConfigurations;
        android.graphics.NinePatch mNinePatch;
        android.content.res.ColorStateList mTint;
        android.graphics.BlendMode mBlendMode;
        android.graphics.Rect mPadding;
        android.graphics.Insets mOpticalInsets;
        float mBaseAlpha;
        boolean mDither;
        boolean mAutoMirrored;
        int[] mThemeAttrs;
        NinePatchState() { super(); }
        NinePatchState(android.graphics.NinePatch p0, android.graphics.Rect p1) { super(); }
        NinePatchState(android.graphics.NinePatch p0, android.graphics.Rect p1, android.graphics.Rect p2) { super(); }
        NinePatchState(android.graphics.NinePatch p0, android.graphics.Rect p1, android.graphics.Rect p2, boolean p3, boolean p4) { super(); }
        NinePatchState(android.graphics.drawable.NinePatchDrawable.NinePatchState p0) { super(); }
        public boolean canApplyTheme() { return false; }
        public android.graphics.drawable.Drawable newDrawable() { return null; }
        public android.graphics.drawable.Drawable newDrawable(android.content.res.Resources p0) { return null; }
        public int getChangingConfigurations() { return 0; }
    }
}
