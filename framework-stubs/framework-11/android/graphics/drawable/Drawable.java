package android.graphics.drawable;

public abstract class Drawable {
    private static final android.graphics.Rect ZERO_BOUNDS_RECT = null;
    static final android.graphics.PorterDuff.Mode DEFAULT_TINT_MODE = null;
    static final android.graphics.BlendMode DEFAULT_BLEND_MODE = null;
    private int[] mStateSet;
    private int mLevel;
    private int mChangingConfigurations;
    private android.graphics.Rect mBounds;
    private java.lang.ref.WeakReference<android.graphics.drawable.Drawable.Callback> mCallback;
    private boolean mVisible;
    private int mLayoutDirection;
    protected int mSrcDensityOverride;
    private boolean mSetBlendModeInvoked;
    private boolean mSetTintModeInvoked;
    public Drawable() {}
    public abstract void draw(android.graphics.Canvas p0);
    public void setBounds(int p0, int p1, int p2, int p3) {}
    public void setBounds(android.graphics.Rect p0) {}
    public final void copyBounds(android.graphics.Rect p0) {}
    public final android.graphics.Rect copyBounds() { return null; }
    public final android.graphics.Rect getBounds() { return null; }
    public android.graphics.Rect getDirtyBounds() { return null; }
    public void setChangingConfigurations(int p0) {}
    public int getChangingConfigurations() { return 0; }
    @java.lang.Deprecated
    public void setDither(boolean p0) {}
    public void setFilterBitmap(boolean p0) {}
    public boolean isFilterBitmap() { return false; }
    public final void setCallback(android.graphics.drawable.Drawable.Callback p0) {}
    public android.graphics.drawable.Drawable.Callback getCallback() { return null; }
    public void invalidateSelf() {}
    public void scheduleSelf(java.lang.Runnable p0, long p1) {}
    public void unscheduleSelf(java.lang.Runnable p0) {}
    public int getLayoutDirection() { return 0; }
    public final boolean setLayoutDirection(int p0) { return false; }
    public boolean onLayoutDirectionChanged(int p0) { return false; }
    public abstract void setAlpha(int p0);
    public int getAlpha() { return 0; }
    public void setXfermode(android.graphics.Xfermode p0) {}
    public abstract void setColorFilter(android.graphics.ColorFilter p0);
    @java.lang.Deprecated
    public void setColorFilter(int p0, android.graphics.PorterDuff.Mode p1) {}
    public void setTint(int p0) {}
    public void setTintList(android.content.res.ColorStateList p0) {}
    public void setTintMode(android.graphics.PorterDuff.Mode p0) {}
    public void setTintBlendMode(android.graphics.BlendMode p0) {}
    public android.graphics.ColorFilter getColorFilter() { return null; }
    public void clearColorFilter() {}
    public void setHotspot(float p0, float p1) {}
    public void setHotspotBounds(int p0, int p1, int p2, int p3) {}
    public void getHotspotBounds(android.graphics.Rect p0) {}
    public boolean isProjected() { return false; }
    public boolean isStateful() { return false; }
    public boolean hasFocusStateSpecified() { return false; }
    public boolean setState(int[] p0) { return false; }
    public int[] getState() { return null; }
    public void jumpToCurrentState() {}
    public android.graphics.drawable.Drawable getCurrent() { return null; }
    public final boolean setLevel(int p0) { return false; }
    public final int getLevel() { return 0; }
    public boolean setVisible(boolean p0, boolean p1) { return false; }
    public final boolean isVisible() { return false; }
    public void setAutoMirrored(boolean p0) {}
    public boolean isAutoMirrored() { return false; }
    public void applyTheme(android.content.res.Resources.Theme p0) {}
    public boolean canApplyTheme() { return false; }
    @java.lang.Deprecated
    public abstract int getOpacity();
    public static int resolveOpacity(int p0, int p1) { return 0; }
    public android.graphics.Region getTransparentRegion() { return null; }
    protected boolean onStateChange(int[] p0) { return false; }
    protected boolean onLevelChange(int p0) { return false; }
    protected void onBoundsChange(android.graphics.Rect p0) {}
    public int getIntrinsicWidth() { return 0; }
    public int getIntrinsicHeight() { return 0; }
    public int getMinimumWidth() { return 0; }
    public int getMinimumHeight() { return 0; }
    public boolean getPadding(android.graphics.Rect p0) { return false; }
    public android.graphics.Insets getOpticalInsets() { return null; }
    public void getOutline(android.graphics.Outline p0) {}
    public android.graphics.drawable.Drawable mutate() { return null; }
    public void clearMutated() {}
    public static android.graphics.drawable.Drawable createFromStream(java.io.InputStream p0, java.lang.String p1) { return null; }
    public static android.graphics.drawable.Drawable createFromResourceStream(android.content.res.Resources p0, android.util.TypedValue p1, java.io.InputStream p2, java.lang.String p3) { return null; }
    public static android.graphics.drawable.Drawable createFromResourceStream(android.content.res.Resources p0, android.util.TypedValue p1, java.io.InputStream p2, java.lang.String p3, android.graphics.BitmapFactory.Options p4) { return null; }
    private static android.graphics.drawable.Drawable getBitmapDrawable(android.content.res.Resources p0, android.util.TypedValue p1, java.io.InputStream p2) { return null; }
    public static android.graphics.drawable.Drawable createFromXml(android.content.res.Resources p0, org.xmlpull.v1.XmlPullParser p1) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException { return null; }
    public static android.graphics.drawable.Drawable createFromXml(android.content.res.Resources p0, org.xmlpull.v1.XmlPullParser p1, android.content.res.Resources.Theme p2) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException { return null; }
    public static android.graphics.drawable.Drawable createFromXmlForDensity(android.content.res.Resources p0, org.xmlpull.v1.XmlPullParser p1, int p2, android.content.res.Resources.Theme p3) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException { return null; }
    public static android.graphics.drawable.Drawable createFromXmlInner(android.content.res.Resources p0, org.xmlpull.v1.XmlPullParser p1, android.util.AttributeSet p2) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException { return null; }
    public static android.graphics.drawable.Drawable createFromXmlInner(android.content.res.Resources p0, org.xmlpull.v1.XmlPullParser p1, android.util.AttributeSet p2, android.content.res.Resources.Theme p3) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException { return null; }
    static android.graphics.drawable.Drawable createFromXmlInnerForDensity(android.content.res.Resources p0, org.xmlpull.v1.XmlPullParser p1, android.util.AttributeSet p2, int p3, android.content.res.Resources.Theme p4) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException { return null; }
    public static android.graphics.drawable.Drawable createFromPath(java.lang.String p0) { return null; }
    public void inflate(android.content.res.Resources p0, org.xmlpull.v1.XmlPullParser p1, android.util.AttributeSet p2) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {}
    public void inflate(android.content.res.Resources p0, org.xmlpull.v1.XmlPullParser p1, android.util.AttributeSet p2, android.content.res.Resources.Theme p3) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {}
    void inflateWithAttributes(android.content.res.Resources p0, org.xmlpull.v1.XmlPullParser p1, android.content.res.TypedArray p2, int p3) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {}
    final void setSrcDensityOverride(int p0) {}
    public android.graphics.drawable.Drawable.ConstantState getConstantState() { return null; }
    private static android.graphics.drawable.Drawable drawableFromBitmap(android.content.res.Resources p0, android.graphics.Bitmap p1, byte[] p2, android.graphics.Rect p3, android.graphics.Rect p4, java.lang.String p5) { return null; }
    android.graphics.PorterDuffColorFilter updateTintFilter(android.graphics.PorterDuffColorFilter p0, android.content.res.ColorStateList p1, android.graphics.PorterDuff.Mode p2) { return null; }
    android.graphics.BlendModeColorFilter updateBlendModeFilter(android.graphics.BlendModeColorFilter p0, android.content.res.ColorStateList p1, android.graphics.BlendMode p2) { return null; }
    protected static android.content.res.TypedArray obtainAttributes(android.content.res.Resources p0, android.content.res.Resources.Theme p1, android.util.AttributeSet p2, int[] p3) { return null; }
    static float scaleFromDensity(float p0, int p1, int p2) { return 0.0f; }
    static int scaleFromDensity(int p0, int p1, int p2, boolean p3) { return 0; }
    static int resolveDensity(android.content.res.Resources p0, int p1) { return 0; }
    static void rethrowAsRuntimeException(java.lang.Exception p0) throws java.lang.RuntimeException {}
    public static android.graphics.PorterDuff.Mode parseTintMode(int p0, android.graphics.PorterDuff.Mode p1) { return null; }
    public static android.graphics.BlendMode parseBlendMode(int p0, android.graphics.BlendMode p1) { return null; }

    public static interface Callback {
        public void invalidateDrawable(android.graphics.drawable.Drawable p0);
        public void scheduleDrawable(android.graphics.drawable.Drawable p0, java.lang.Runnable p1, long p2);
        public void unscheduleDrawable(android.graphics.drawable.Drawable p0, java.lang.Runnable p1);
    }

    public static abstract class ConstantState {
        public ConstantState() {}
        public abstract android.graphics.drawable.Drawable newDrawable();
        public android.graphics.drawable.Drawable newDrawable(android.content.res.Resources p0) { return null; }
        public android.graphics.drawable.Drawable newDrawable(android.content.res.Resources p0, android.content.res.Resources.Theme p1) { return null; }
        public abstract int getChangingConfigurations();
        public boolean canApplyTheme() { return false; }
    }
}
