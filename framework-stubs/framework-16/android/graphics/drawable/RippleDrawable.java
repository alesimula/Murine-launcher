package android.graphics.drawable;

public class RippleDrawable extends android.graphics.drawable.LayerDrawable {
    public static final int RADIUS_AUTO = -1;
    public static final int STYLE_SOLID = 0;
    public static final int STYLE_PATTERNED = 1;
    RippleDrawable() { super((android.graphics.drawable.Drawable[])null); }
    public RippleDrawable(android.content.res.ColorStateList p0, android.graphics.drawable.Drawable p1, android.graphics.drawable.Drawable p2) { super((android.graphics.drawable.Drawable[])null); }
    public void jumpToCurrentState() {}
    public int getOpacity() { return 0; }
    protected boolean onStateChange(int[] p0) { return false; }
    public void setBackgroundActive(boolean p0, boolean p1, boolean p2, boolean p3) {}
    protected void onBoundsChange(android.graphics.Rect p0) {}
    public boolean setVisible(boolean p0, boolean p1) { return false; }
    public boolean isProjected() { return false; }
    public boolean isStateful() { return false; }
    public boolean hasFocusStateSpecified() { return false; }
    public void setColor(android.content.res.ColorStateList p0) {}
    public void setEffectColor(android.content.res.ColorStateList p0) {}
    @android.annotation.NonNull
    public android.content.res.ColorStateList getEffectColor() { return null; }
    public void setRadius(int p0) {}
    public int getRadius() { return 0; }
    public void inflate(android.content.res.Resources p0, org.xmlpull.v1.XmlPullParser p1, android.util.AttributeSet p2, android.content.res.Resources.Theme p3) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {}
    public boolean setDrawableByLayerId(int p0, android.graphics.drawable.Drawable p1) { return false; }
    public void setPaddingMode(int p0) {}
    public void applyTheme(android.content.res.Resources.Theme p0) {}
    public boolean canApplyTheme() { return false; }
    public void setHotspot(float p0, float p1) {}
    public void setHotspotBounds(int p0, int p1, int p2, int p3) {}
    public void getHotspotBounds(android.graphics.Rect p0) {}
    public void getOutline(android.graphics.Outline p0) {}
    public void draw(android.graphics.Canvas p0) {}
    public float getTargetBackgroundOpacity() { return 0.0f; }
    public void invalidateSelf() {}
    void invalidateSelf(boolean p0) {}
    android.graphics.Paint updateRipplePaint() { return null; }
    public android.graphics.Rect getDirtyBounds() { return null; }
    public void setForceSoftware(boolean p0) {}
    public android.graphics.drawable.Drawable.ConstantState getConstantState() { return null; }
    public android.graphics.drawable.Drawable mutate() { return null; }
    android.graphics.drawable.RippleDrawable.RippleState createConstantState(android.graphics.drawable.LayerDrawable.LayerState p0, android.content.res.Resources p1) { return null; }

    static class RippleState extends android.graphics.drawable.LayerDrawable.LayerState {
        int[] mTouchThemeAttrs;
        android.content.res.ColorStateList mColor;
        android.content.res.ColorStateList mEffectColor;
        int mMaxRadius;
        int mRippleStyle;
        public RippleState(android.graphics.drawable.LayerDrawable.LayerState p0, android.graphics.drawable.RippleDrawable p1, android.content.res.Resources p2) { super(null, null, null); }
        protected void onDensityChanged(int p0, int p1) {}
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
