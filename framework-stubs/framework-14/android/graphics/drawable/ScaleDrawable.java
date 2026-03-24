package android.graphics.drawable;

public class ScaleDrawable extends android.graphics.drawable.DrawableWrapper {
    ScaleDrawable() { super((android.graphics.drawable.Drawable)null); }
    public ScaleDrawable(android.graphics.drawable.Drawable p0, int p1, float p2, float p3) { super((android.graphics.drawable.Drawable)null); }
    public void inflate(android.content.res.Resources p0, org.xmlpull.v1.XmlPullParser p1, android.util.AttributeSet p2, android.content.res.Resources.Theme p3) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {}
    public void applyTheme(android.content.res.Resources.Theme p0) {}
    public void draw(android.graphics.Canvas p0) {}
    public int getOpacity() { return 0; }
    protected boolean onLevelChange(int p0) { return false; }
    protected void onBoundsChange(android.graphics.Rect p0) {}
    android.graphics.drawable.DrawableWrapper.DrawableWrapperState mutateConstantState() { return null; }

    static final class ScaleState extends android.graphics.drawable.DrawableWrapper.DrawableWrapperState {
        float mScaleWidth;
        float mScaleHeight;
        int mGravity;
        boolean mUseIntrinsicSizeAsMin;
        int mInitialLevel;
        ScaleState(android.graphics.drawable.ScaleDrawable.ScaleState p0, android.content.res.Resources p1) { super(null, null); }
        public android.graphics.drawable.Drawable newDrawable(android.content.res.Resources p0) { return null; }
    }
}
