package android.graphics.drawable;

public class BitmapDrawable extends android.graphics.drawable.Drawable {
    @java.lang.Deprecated
    public BitmapDrawable() { super(); }
    @java.lang.Deprecated
    public BitmapDrawable(android.content.res.Resources p0) { super(); }
    @java.lang.Deprecated
    public BitmapDrawable(android.graphics.Bitmap p0) { super(); }
    public BitmapDrawable(android.content.res.Resources p0, android.graphics.Bitmap p1) { super(); }
    @java.lang.Deprecated
    public BitmapDrawable(java.lang.String p0) { super(); }
    public BitmapDrawable(android.content.res.Resources p0, java.lang.String p1) { super(); }
    @java.lang.Deprecated
    public BitmapDrawable(java.io.InputStream p0) { super(); }
    public BitmapDrawable(android.content.res.Resources p0, java.io.InputStream p1) { super(); }
    public final android.graphics.Paint getPaint() { return null; }
    public final android.graphics.Bitmap getBitmap() { return null; }
    public void setBitmap(android.graphics.Bitmap p0) {}
    public void setTargetDensity(android.graphics.Canvas p0) {}
    public void setTargetDensity(android.util.DisplayMetrics p0) {}
    public void setTargetDensity(int p0) {}
    public int getGravity() { return 0; }
    public void setGravity(int p0) {}
    public void setMipMap(boolean p0) {}
    public boolean hasMipMap() { return false; }
    public void setAntiAlias(boolean p0) {}
    public boolean hasAntiAlias() { return false; }
    public void setFilterBitmap(boolean p0) {}
    public boolean isFilterBitmap() { return false; }
    public void setDither(boolean p0) {}
    public android.graphics.Shader.TileMode getTileModeX() { return null; }
    public android.graphics.Shader.TileMode getTileModeY() { return null; }
    public void setTileModeX(android.graphics.Shader.TileMode p0) {}
    public final void setTileModeY(android.graphics.Shader.TileMode p0) {}
    public void setTileModeXY(android.graphics.Shader.TileMode p0, android.graphics.Shader.TileMode p1) {}
    public void setAutoMirrored(boolean p0) {}
    public final boolean isAutoMirrored() { return false; }
    public int getChangingConfigurations() { return 0; }
    protected void onBoundsChange(android.graphics.Rect p0) {}
    public void draw(android.graphics.Canvas p0) {}
    public android.graphics.Insets getOpticalInsets() { return null; }
    public void getOutline(android.graphics.Outline p0) {}
    public void setAlpha(int p0) {}
    public int getAlpha() { return 0; }
    public void setColorFilter(android.graphics.ColorFilter p0) {}
    public android.graphics.ColorFilter getColorFilter() { return null; }
    public void setTintList(android.content.res.ColorStateList p0) {}
    public void setTintBlendMode(android.graphics.BlendMode p0) {}
    public void setXfermode(android.graphics.Xfermode p0) {}
    public android.graphics.drawable.Drawable mutate() { return null; }
    public void clearMutated() {}
    protected boolean onStateChange(int[] p0) { return false; }
    public boolean isStateful() { return false; }
    public boolean hasFocusStateSpecified() { return false; }
    public void inflate(android.content.res.Resources p0, org.xmlpull.v1.XmlPullParser p1, android.util.AttributeSet p2, android.content.res.Resources.Theme p3) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {}
    public void applyTheme(android.content.res.Resources.Theme p0) {}
    public boolean canApplyTheme() { return false; }
    public int getIntrinsicWidth() { return 0; }
    public int getIntrinsicHeight() { return 0; }
    public int getOpacity() { return 0; }
    public final android.graphics.drawable.Drawable.ConstantState getConstantState() { return null; }

    static final class BitmapState extends android.graphics.drawable.Drawable.ConstantState {
        final android.graphics.Paint mPaint = null;
        int[] mThemeAttrs;
        android.graphics.Bitmap mBitmap;
        android.content.res.ColorStateList mTint;
        android.graphics.BlendMode mBlendMode;
        int mGravity;
        float mBaseAlpha;
        android.graphics.Shader.TileMode mTileModeX;
        android.graphics.Shader.TileMode mTileModeY;
        int mSrcDensityOverride;
        int mTargetDensity;
        boolean mAutoMirrored;
        int mChangingConfigurations;
        boolean mRebuildShader;
        BitmapState(android.graphics.Bitmap p0) { super(); }
        BitmapState(android.graphics.drawable.BitmapDrawable.BitmapState p0) { super(); }
        public boolean canApplyTheme() { return false; }
        public android.graphics.drawable.Drawable newDrawable() { return null; }
        public android.graphics.drawable.Drawable newDrawable(android.content.res.Resources p0) { return null; }
        public int getChangingConfigurations() { return 0; }
    }
}
