package android.graphics.drawable;

public class RippleDrawable extends android.graphics.drawable.LayerDrawable {
    private static final java.lang.String TAG = "RippleDrawable";
    public static final int RADIUS_AUTO = -1;
    public static final int STYLE_SOLID = 0;
    public static final int STYLE_PATTERNED = 1;
    private static final int BACKGROUND_OPACITY_DURATION = 80;
    private static final int MASK_UNKNOWN = -1;
    private static final int MASK_NONE = 0;
    private static final int MASK_CONTENT = 1;
    private static final int MASK_EXPLICIT = 2;
    private static final int MAX_RIPPLES = 10;
    private static final android.view.animation.LinearInterpolator LINEAR_INTERPOLATOR = null;
    private static final int DEFAULT_EFFECT_COLOR = -1912602625;
    private static final boolean FORCE_PATTERNED_STYLE = true;
    private final android.graphics.Rect mTempRect = null;
    private final android.graphics.Rect mHotspotBounds = null;
    private final android.graphics.Rect mDrawingBounds = null;
    private final android.graphics.Rect mDirtyBounds = null;
    private android.graphics.drawable.RippleDrawable.RippleState mState;
    private android.graphics.drawable.Drawable mMask;
    private android.graphics.drawable.RippleBackground mBackground;
    private android.graphics.Bitmap mMaskBuffer;
    private android.graphics.BitmapShader mMaskShader;
    private android.graphics.Canvas mMaskCanvas;
    private android.graphics.Matrix mMaskMatrix;
    private android.graphics.PorterDuffColorFilter mMaskColorFilter;
    private android.graphics.PorterDuffColorFilter mFocusColorFilter;
    private boolean mHasValidMask;
    private android.graphics.drawable.RippleForeground mRipple;
    private boolean mRippleActive;
    private float mPendingX;
    private float mPendingY;
    private boolean mHasPending;
    private android.graphics.drawable.RippleForeground[] mExitingRipples;
    private int mExitingRipplesCount;
    private android.graphics.Paint mRipplePaint;
    private int mDensity;
    private boolean mOverrideBounds;
    private boolean mForceSoftware;
    private boolean mAddRipple;
    private float mTargetBackgroundOpacity;
    private android.animation.ValueAnimator mBackgroundAnimation;
    private float mBackgroundOpacity;
    private boolean mRunBackgroundAnimation;
    private boolean mExitingAnimation;
    private java.util.ArrayList<android.graphics.drawable.RippleAnimationSession> mRunningAnimations;
    RippleDrawable() { super((android.graphics.drawable.Drawable[])null); }
    public RippleDrawable(android.content.res.ColorStateList p0, android.graphics.drawable.Drawable p1, android.graphics.drawable.Drawable p2) { super((android.graphics.drawable.Drawable[])null); }
    public void jumpToCurrentState() {}
    private void endPatternedAnimations() {}
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
    public void setEffectColor(android.content.res.ColorStateList p0) {}
    public android.content.res.ColorStateList getEffectColor() { return null; }
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
    private void drawSolid(android.graphics.Canvas p0) {}
    private void exitPatternedBackgroundAnimation() {}
    private void startPatternedAnimation() {}
    private void exitPatternedAnimation() {}
    private void enterPatternedBackgroundAnimation(boolean p0, boolean p1) {}
    private void startBackgroundAnimation() {}
    private void drawPatterned(android.graphics.Canvas p0) {}
    private void drawPatternedBackground(android.graphics.Canvas p0, float p1, float p2) {}
    private float computeRadius() { return 0.0f; }
    private int getComputedRadius() { return 0; }
    private android.graphics.drawable.RippleAnimationSession.AnimationProperties<java.lang.Float, android.graphics.Paint> createAnimationProperties(float p0, float p1, float p2, float p3, float p4, float p5) { return null; }
    private int clampAlpha(int p0) { return 0; }
    private boolean shouldUseCanvasProps(android.graphics.Canvas p0) { return false; }
    public void invalidateSelf() {}
    void invalidateSelf(boolean p0) {}
    private void pruneRipples() {}
    private void updateMaskShaderIfNeeded() {}
    private int getMaskType() { return 0; }
    private void drawContent(android.graphics.Canvas p0) {}
    private void drawBackgroundAndRipples(android.graphics.Canvas p0) {}
    private void drawMask(android.graphics.Canvas p0) {}
    android.graphics.Paint getRipplePaint() { return null; }
    public android.graphics.Rect getDirtyBounds() { return null; }
    public void setForceSoftware(boolean p0) {}
    public android.graphics.drawable.Drawable.ConstantState getConstantState() { return null; }
    public android.graphics.drawable.Drawable mutate() { return null; }
    android.graphics.drawable.RippleDrawable.RippleState createConstantState(android.graphics.drawable.LayerDrawable.LayerState p0, android.content.res.Resources p1) { return null; }
    private RippleDrawable(android.graphics.drawable.RippleDrawable.RippleState p0, android.content.res.Resources p1) { super((android.graphics.drawable.Drawable[])null); }
    private void updateLocalState() {}

    static class RippleState extends android.graphics.drawable.LayerDrawable.LayerState {
        int[] mTouchThemeAttrs;
        android.content.res.ColorStateList mColor;
        android.content.res.ColorStateList mEffectColor;
        int mMaxRadius;
        int mRippleStyle;
        public RippleState(android.graphics.drawable.LayerDrawable.LayerState p0, android.graphics.drawable.RippleDrawable p1, android.content.res.Resources p2) { super(null, null, null); }
        protected void onDensityChanged(int p0, int p1) {}
        private void applyDensityScaling(int p0, int p1) {}
        public boolean canApplyTheme() { return false; }
        public android.graphics.drawable.Drawable newDrawable() { return null; }
        public android.graphics.drawable.Drawable newDrawable(android.content.res.Resources p0) { return null; }
        public int getChangingConfigurations() { return 0; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    @java.lang.annotation.Target({java.lang.annotation.ElementType.PARAMETER, java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.LOCAL_VARIABLE, java.lang.annotation.ElementType.FIELD})
    public static @interface RippleStyle {
    }
}
