package android.graphics.drawable;

public class InsetDrawable extends android.graphics.drawable.DrawableWrapper {
    InsetDrawable() { super((android.graphics.drawable.Drawable)null); }
    public InsetDrawable(android.graphics.drawable.Drawable p0, int p1) { super((android.graphics.drawable.Drawable)null); }
    public InsetDrawable(android.graphics.drawable.Drawable p0, float p1) { super((android.graphics.drawable.Drawable)null); }
    public InsetDrawable(android.graphics.drawable.Drawable p0, int p1, int p2, int p3, int p4) { super((android.graphics.drawable.Drawable)null); }
    public InsetDrawable(android.graphics.drawable.Drawable p0, float p1, float p2, float p3, float p4) { super((android.graphics.drawable.Drawable)null); }
    public void inflate(android.content.res.Resources p0, org.xmlpull.v1.XmlPullParser p1, android.util.AttributeSet p2, android.content.res.Resources.Theme p3) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {}
    public void applyTheme(android.content.res.Resources.Theme p0) {}
    public boolean getPadding(android.graphics.Rect p0) { return false; }
    public android.graphics.Insets getOpticalInsets() { return null; }
    public int getOpacity() { return 0; }
    protected void onBoundsChange(android.graphics.Rect p0) {}
    public int getIntrinsicWidth() { return 0; }
    public int getIntrinsicHeight() { return 0; }
    public void getOutline(android.graphics.Outline p0) {}
    android.graphics.drawable.DrawableWrapper.DrawableWrapperState mutateConstantState() { return null; }

    static final class InsetState extends android.graphics.drawable.DrawableWrapper.DrawableWrapperState {
        android.graphics.drawable.InsetDrawable.InsetValue mInsetLeft;
        android.graphics.drawable.InsetDrawable.InsetValue mInsetTop;
        android.graphics.drawable.InsetDrawable.InsetValue mInsetRight;
        android.graphics.drawable.InsetDrawable.InsetValue mInsetBottom;
        InsetState(android.graphics.drawable.InsetDrawable.InsetState p0, android.content.res.Resources p1) { super(null, null); }
        void onDensityChanged(int p0, int p1) {}
        public android.graphics.drawable.Drawable newDrawable(android.content.res.Resources p0) { return null; }
    }

    static final class InsetValue implements java.lang.Cloneable {
        final float mFraction = 0.0f;
        int mDimension;
        public InsetValue() {}
        public InsetValue(float p0, int p1) {}
        int getDimension(int p0) { return 0; }
        void scaleFromDensity(int p0, int p1) {}
        public android.graphics.drawable.InsetDrawable.InsetValue clone() { return null; }
    }
}
