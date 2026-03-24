package android.graphics.drawable;

public class GradientDrawable extends android.graphics.drawable.Drawable {
    public static final int RECTANGLE = 0;
    public static final int OVAL = 1;
    public static final int LINE = 2;
    public static final int RING = 3;
    public static final int LINEAR_GRADIENT = 0;
    public static final int RADIAL_GRADIENT = 1;
    public static final int SWEEP_GRADIENT = 2;
    private static final int RADIUS_TYPE_PIXELS = 0;
    private static final int RADIUS_TYPE_FRACTION = 1;
    private static final int RADIUS_TYPE_FRACTION_PARENT = 2;
    private static final float DEFAULT_INNER_RADIUS_RATIO = 3.0f;
    private static final float DEFAULT_THICKNESS_RATIO = 9.0f;
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=124050917L)
    private android.graphics.drawable.GradientDrawable.GradientState mGradientState;
    @android.annotation.UnsupportedAppUsage
    private final android.graphics.Paint mFillPaint = null;
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=124051827L)
    private android.graphics.Rect mPadding;
    @android.annotation.UnsupportedAppUsage
    private android.graphics.Paint mStrokePaint;
    private android.graphics.ColorFilter mColorFilter;
    private android.graphics.BlendModeColorFilter mBlendModeColorFilter;
    private int mAlpha;
    private final android.graphics.Path mPath = null;
    private final android.graphics.RectF mRect = null;
    private android.graphics.Paint mLayerPaint;
    private boolean mGradientIsDirty;
    private boolean mMutated;
    private android.graphics.Path mRingPath;
    private boolean mPathIsDirty;
    private float mGradientRadius;
    public GradientDrawable() { super(); }
    public GradientDrawable(android.graphics.drawable.GradientDrawable.Orientation p0, int[] p1) { super(); }
    public boolean getPadding(android.graphics.Rect p0) { return false; }
    public void setCornerRadii(float[] p0) {}
    public float[] getCornerRadii() { return null; }
    public void setCornerRadius(float p0) {}
    public float getCornerRadius() { return 0.0f; }
    public void setStroke(int p0, int p1) {}
    public void setStroke(int p0, android.content.res.ColorStateList p1) {}
    public void setStroke(int p0, int p1, float p2, float p3) {}
    public void setStroke(int p0, android.content.res.ColorStateList p1, float p2, float p3) {}
    private void setStrokeInternal(int p0, int p1, float p2, float p3) {}
    public void setSize(int p0, int p1) {}
    public void setShape(int p0) {}
    public int getShape() { return 0; }
    public void setGradientType(int p0) {}
    public int getGradientType() { return 0; }
    public void setGradientCenter(float p0, float p1) {}
    public float getGradientCenterX() { return 0.0f; }
    public float getGradientCenterY() { return 0.0f; }
    public void setGradientRadius(float p0) {}
    public float getGradientRadius() { return 0.0f; }
    public void setUseLevel(boolean p0) {}
    public boolean getUseLevel() { return false; }
    private int modulateAlpha(int p0) { return 0; }
    public android.graphics.drawable.GradientDrawable.Orientation getOrientation() { return null; }
    public void setOrientation(android.graphics.drawable.GradientDrawable.Orientation p0) {}
    public void setColors(int[] p0) {}
    public void setColors(int[] p0, float[] p1) {}
    public int[] getColors() { return null; }
    public void draw(android.graphics.Canvas p0) {}
    public void setXfermode(android.graphics.Xfermode p0) {}
    public void setAntiAlias(boolean p0) {}
    private void buildPathIfDirty() {}
    public void setInnerRadiusRatio(float p0) {}
    public float getInnerRadiusRatio() { return 0.0f; }
    public void setInnerRadius(int p0) {}
    public int getInnerRadius() { return 0; }
    public void setThicknessRatio(float p0) {}
    public float getThicknessRatio() { return 0.0f; }
    public void setThickness(int p0) {}
    public int getThickness() { return 0; }
    public void setPadding(int p0, int p1, int p2, int p3) {}
    private android.graphics.Path buildRing(android.graphics.drawable.GradientDrawable.GradientState p0) { return null; }
    public void setColor(int p0) {}
    public void setColor(android.content.res.ColorStateList p0) {}
    public android.content.res.ColorStateList getColor() { return null; }
    protected boolean onStateChange(int[] p0) { return false; }
    public boolean isStateful() { return false; }
    public boolean hasFocusStateSpecified() { return false; }
    public int getChangingConfigurations() { return 0; }
    public void setAlpha(int p0) {}
    public int getAlpha() { return 0; }
    public void setDither(boolean p0) {}
    public android.graphics.ColorFilter getColorFilter() { return null; }
    public void setColorFilter(android.graphics.ColorFilter p0) {}
    public void setTintList(android.content.res.ColorStateList p0) {}
    public void setTintBlendMode(android.graphics.BlendMode p0) {}
    public int getOpacity() { return 0; }
    protected void onBoundsChange(android.graphics.Rect p0) {}
    protected boolean onLevelChange(int p0) { return false; }
    private boolean ensureValidRect() { return false; }
    public void inflate(android.content.res.Resources p0, org.xmlpull.v1.XmlPullParser p1, android.util.AttributeSet p2, android.content.res.Resources.Theme p3) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {}
    public void applyTheme(android.content.res.Resources.Theme p0) {}
    private void updateStateFromTypedArray(android.content.res.TypedArray p0) {}
    public boolean canApplyTheme() { return false; }
    private void applyThemeChildElements(android.content.res.Resources.Theme p0) {}
    private void inflateChildElements(android.content.res.Resources p0, org.xmlpull.v1.XmlPullParser p1, android.util.AttributeSet p2, android.content.res.Resources.Theme p3) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {}
    private void updateGradientDrawablePadding(android.content.res.TypedArray p0) {}
    private void updateDrawableCorners(android.content.res.TypedArray p0) {}
    private void updateGradientDrawableStroke(android.content.res.TypedArray p0) {}
    private void updateGradientDrawableSolid(android.content.res.TypedArray p0) {}
    private void updateGradientDrawableGradient(android.content.res.Resources p0, android.content.res.TypedArray p1) {}
    private void updateGradientDrawableSize(android.content.res.TypedArray p0) {}
    private static float getFloatOrFraction(android.content.res.TypedArray p0, int p1, float p2) { return 0.0f; }
    public int getIntrinsicWidth() { return 0; }
    public int getIntrinsicHeight() { return 0; }
    public android.graphics.Insets getOpticalInsets() { return null; }
    public android.graphics.drawable.Drawable.ConstantState getConstantState() { return null; }
    private boolean isOpaqueForState() { return false; }
    public void getOutline(android.graphics.Outline p0) {}
    public android.graphics.drawable.Drawable mutate() { return null; }
    public void clearMutated() {}
    static boolean isOpaque(int p0) { return false; }
    private GradientDrawable(android.graphics.drawable.GradientDrawable.GradientState p0, android.content.res.Resources p1) { super(); }
    private void updateLocalState(android.content.res.Resources p0) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Shape {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface RadiusType {
    }

    public static enum Orientation {
        TOP_BOTTOM,
        TR_BL,
        RIGHT_LEFT,
        BR_TL,
        BOTTOM_TOP,
        BL_TR,
        LEFT_RIGHT,
        TL_BR;
        private Orientation() {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface GradientType {
    }

    static final class GradientState extends android.graphics.drawable.Drawable.ConstantState {
        public int mChangingConfigurations;
        @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=124050917L)
        public int mShape;
        @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=124050917L)
        public int mGradient;
        @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=124050917L)
        public int mAngle;
        @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=124050917L)
        public android.graphics.drawable.GradientDrawable.Orientation mOrientation;
        @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=124050917L)
        public android.content.res.ColorStateList mSolidColors;
        public android.content.res.ColorStateList mStrokeColors;
        @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=124050917L)
        public int[] mGradientColors;
        public int[] mTempColors;
        public float[] mTempPositions;
        @android.annotation.UnsupportedAppUsage
        public float[] mPositions;
        @android.annotation.UnsupportedAppUsage(trackingBug=124050917L)
        public int mStrokeWidth;
        @android.annotation.UnsupportedAppUsage(trackingBug=124050917L)
        public float mStrokeDashWidth;
        @android.annotation.UnsupportedAppUsage(trackingBug=124050917L)
        public float mStrokeDashGap;
        @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=124050917L)
        public float mRadius;
        @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=124050917L)
        public float[] mRadiusArray;
        @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=124050917L)
        public android.graphics.Rect mPadding;
        @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=124050917L)
        public int mWidth;
        @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=124050917L)
        public int mHeight;
        @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=124050917L)
        public float mInnerRadiusRatio;
        @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=124050218L)
        public float mThicknessRatio;
        @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=124050917L)
        public int mInnerRadius;
        @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=124050218L)
        public int mThickness;
        public boolean mDither;
        public android.graphics.Insets mOpticalInsets;
        float mCenterX;
        float mCenterY;
        float mGradientRadius;
        int mGradientRadiusType;
        boolean mUseLevel;
        boolean mUseLevelForShape;
        boolean mOpaqueOverBounds;
        boolean mOpaqueOverShape;
        android.content.res.ColorStateList mTint;
        android.graphics.BlendMode mBlendMode;
        int mDensity;
        int[] mThemeAttrs;
        int[] mAttrSize;
        int[] mAttrGradient;
        int[] mAttrSolid;
        int[] mAttrStroke;
        int[] mAttrCorners;
        int[] mAttrPadding;
        public GradientState(android.graphics.drawable.GradientDrawable.Orientation p0, int[] p1) { super(); }
        public GradientState(android.graphics.drawable.GradientDrawable.GradientState p0, android.content.res.Resources p1) { super(); }
        public final void setDensity(int p0) {}
        public boolean hasCenterColor() { return false; }
        private void applyDensityScaling(int p0, int p1) {}
        public boolean canApplyTheme() { return false; }
        public android.graphics.drawable.Drawable newDrawable() { return null; }
        public android.graphics.drawable.Drawable newDrawable(android.content.res.Resources p0) { return null; }
        public int getChangingConfigurations() { return 0; }
        public void setShape(int p0) {}
        public void setGradientType(int p0) {}
        public void setGradientCenter(float p0, float p1) {}
        public void setOrientation(android.graphics.drawable.GradientDrawable.Orientation p0) {}
        public android.graphics.drawable.GradientDrawable.Orientation getOrientation() { return null; }
        private void updateGradientStateOrientation() {}
        private int getAngleFromOrientation(android.graphics.drawable.GradientDrawable.Orientation p0) { return 0; }
        public void setGradientColors(int[] p0) {}
        public void setSolidColors(android.content.res.ColorStateList p0) {}
        private void computeOpacity() {}
        public void setStroke(int p0, android.content.res.ColorStateList p1, float p2, float p3) {}
        public void setCornerRadius(float p0) {}
        public void setCornerRadii(float[] p0) {}
        public void setSize(int p0, int p1) {}
        public void setGradientRadius(float p0, int p1) {}
    }
}
