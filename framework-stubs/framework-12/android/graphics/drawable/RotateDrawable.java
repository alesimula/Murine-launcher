package android.graphics.drawable;

public class RotateDrawable extends android.graphics.drawable.DrawableWrapper {
    private static final int MAX_LEVEL = 10000;
    private android.graphics.drawable.RotateDrawable.RotateState mState;
    public RotateDrawable() { super((android.graphics.drawable.Drawable)null); }
    public void inflate(android.content.res.Resources p0, org.xmlpull.v1.XmlPullParser p1, android.util.AttributeSet p2, android.content.res.Resources.Theme p3) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {}
    public void applyTheme(android.content.res.Resources.Theme p0) {}
    private void verifyRequiredAttributes(android.content.res.TypedArray p0) throws org.xmlpull.v1.XmlPullParserException {}
    private void updateStateFromTypedArray(android.content.res.TypedArray p0) {}
    public void draw(android.graphics.Canvas p0) {}
    public void setFromDegrees(float p0) {}
    public float getFromDegrees() { return 0.0f; }
    public void setToDegrees(float p0) {}
    public float getToDegrees() { return 0.0f; }
    public void setPivotX(float p0) {}
    public float getPivotX() { return 0.0f; }
    public void setPivotXRelative(boolean p0) {}
    public boolean isPivotXRelative() { return false; }
    public void setPivotY(float p0) {}
    public float getPivotY() { return 0.0f; }
    public void setPivotYRelative(boolean p0) {}
    public boolean isPivotYRelative() { return false; }
    protected boolean onLevelChange(int p0) { return false; }
    android.graphics.drawable.DrawableWrapper.DrawableWrapperState mutateConstantState() { return null; }
    private RotateDrawable(android.graphics.drawable.RotateDrawable.RotateState p0, android.content.res.Resources p1) { super((android.graphics.drawable.Drawable)null); }

    static final class RotateState extends android.graphics.drawable.DrawableWrapper.DrawableWrapperState {
        private int[] mThemeAttrs;
        boolean mPivotXRel;
        float mPivotX;
        boolean mPivotYRel;
        float mPivotY;
        float mFromDegrees;
        float mToDegrees;
        float mCurrentDegrees;
        RotateState(android.graphics.drawable.RotateDrawable.RotateState p0, android.content.res.Resources p1) { super(null, null); }
        public android.graphics.drawable.Drawable newDrawable(android.content.res.Resources p0) { return null; }
    }
}
