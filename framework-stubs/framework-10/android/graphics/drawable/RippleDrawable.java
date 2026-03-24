package android.graphics.drawable;

public class RippleDrawable extends android.graphics.drawable.LayerDrawable {
    public static final int RADIUS_AUTO = -1;
    private static final int MASK_UNKNOWN = -1;
    private static final int MASK_NONE = 0;
    private static final int MASK_CONTENT = 1;
    private static final int MASK_EXPLICIT = 2;
    private static final int MAX_RIPPLES = 10;
    private final android.graphics.Rect mTempRect = null;
    private final android.graphics.Rect mHotspotBounds = null;
    private final android.graphics.Rect mDrawingBounds = null;
    private final android.graphics.Rect mDirtyBounds = null;
    @android.annotation.UnsupportedAppUsage
    private android.graphics.drawable.RippleDrawable.RippleState mState;
    private android.graphics.drawable.Drawable mMask;
    private android.graphics.drawable.RippleBackground mBackground;
    private android.graphics.Bitmap mMaskBuffer;
    private android.graphics.BitmapShader mMaskShader;
    private android.graphics.Canvas mMaskCanvas;
    private android.graphics.Matrix mMaskMatrix;
    private android.graphics.PorterDuffColorFilter mMaskColorFilter;
    private boolean mHasValidMask;
    private android.graphics.drawable.RippleForeground mRipple;
    private boolean mRippleActive;
    private float mPendingX;
    private float mPendingY;
    private boolean mHasPending;
    private android.graphics.drawable.RippleForeground[] mExitingRipples;
    private int mExitingRipplesCount;
    private android.graphics.Paint mRipplePaint;
    @android.annotation.UnsupportedAppUsage
    private int mDensity;
    private boolean mOverrideBounds;
    private boolean mForceSoftware;
    RippleDrawable() { super((android.graphics.drawable.Drawable[])null); }
    public RippleDrawable(android.content.res.ColorStateList p0, android.graphics.drawable.Drawable p1, android.graphics.drawable.Drawable p2) { super((android.graphics.drawable.Drawable[])null); }
    public void jumpToCurrentState() {}
    private void cancelExitingRipples() {}
    public int getOpacity() { return 0; }
    protected boolean onStateChange(int[] p0) { return false; }
    private void setRippleActive(boolean p0) {}
    private void setBackgroundActive(boolean p0, boolean p1, boolean p2) {}
    protected void onBoundsChange(android.graphics.Rect p0) {}
    public boolean setVisible(boolean p0, boolean p1) { return false; }
    public boolean isProjected() { return false; }
    private boolean isBounded() { return false; }
    public boolean isStateful() { return false; }
    public boolean hasFocusStateSpecified() { return false; }
    public void setColor(android.content.res.ColorStateList p0) {}
    public void setRadius(int p0) {}
    public int getRadius() { return 0; }
    public void inflate(android.content.res.Resources p0, org.xmlpull.v1.XmlPullParser p1, android.util.AttributeSet p2, android.content.res.Resources.Theme p3) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {}
    public boolean setDrawableByLayerId(int p0, android.graphics.drawable.Drawable p1) { return false; }
    public void setPaddingMode(int p0) {}
    private void updateStateFromTypedArray(android.content.res.TypedArray p0) throws org.xmlpull.v1.XmlPullParserException {}
    private void verifyRequiredAttributes(android.content.res.TypedArray p0) throws org.xmlpull.v1.XmlPullParserException {}
    public void applyTheme(android.content.res.Resources.Theme p0) {}
    public boolean canApplyTheme() { return false; }
    public void setHotspot(float p0, float p1) {}
    private void tryRippleEnter() {}
    private void tryRippleExit() {}
    private void clearHotspots() {}
    public void setHotspotBounds(int p0, int p1, int p2, int p3) {}
    public void getHotspotBounds(android.graphics.Rect p0) {}
    private void onHotspotBoundsChanged() {}
    public void getOutline(android.graphics.Outline p0) {}
    public void draw(android.graphics.Canvas p0) {}
    public void invalidateSelf() {}
    void invalidateSelf(boolean p0) {}
    private void pruneRipples() {}
    private void updateMaskShaderIfNeeded() {}
    private int getMaskType() { return 0; }
    private void drawContent(android.graphics.Canvas p0) {}
    private void drawBackgroundAndRipples(android.graphics.Canvas p0) {}
    private void drawMask(android.graphics.Canvas p0) {}
    @android.annotation.UnsupportedAppUsage
    android.graphics.Paint getRipplePaint() { return null; }
    public android.graphics.Rect getDirtyBounds() { return null; }
    @android.annotation.UnsupportedAppUsage
    public void setForceSoftware(boolean p0) {}
    public android.graphics.drawable.Drawable.ConstantState getConstantState() { return null; }
    public android.graphics.drawable.Drawable mutate() { return null; }
    android.graphics.drawable.RippleDrawable.RippleState createConstantState(android.graphics.drawable.LayerDrawable.LayerState p0, android.content.res.Resources p1) { return null; }
    private RippleDrawable(android.graphics.drawable.RippleDrawable.RippleState p0, android.content.res.Resources p1) { super((android.graphics.drawable.Drawable[])null); }
    private void updateLocalState() {}

    static class RippleState extends android.graphics.drawable.LayerDrawable.LayerState {
        int[] mTouchThemeAttrs;
        @android.annotation.UnsupportedAppUsage
        android.content.res.ColorStateList mColor;
        int mMaxRadius;
        public RippleState(android.graphics.drawable.LayerDrawable.LayerState p0, android.graphics.drawable.RippleDrawable p1, android.content.res.Resources p2) { super(null, null, null); }
        protected void onDensityChanged(int p0, int p1) {}
        private void applyDensityScaling(int p0, int p1) {}
        public boolean canApplyTheme() { return false; }
        public android.graphics.drawable.Drawable newDrawable() { return null; }
        public android.graphics.drawable.Drawable newDrawable(android.content.res.Resources p0) { return null; }
        public int getChangingConfigurations() { return 0; }
    }
}
