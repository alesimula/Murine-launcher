package android.graphics.drawable;

public class ClipDrawable extends android.graphics.drawable.DrawableWrapper {
    public static final int HORIZONTAL = 1;
    public static final int VERTICAL = 2;
    private static final int MAX_LEVEL = 10000;
    private final android.graphics.Rect mTmpRect = null;
    @android.annotation.UnsupportedAppUsage
    private android.graphics.drawable.ClipDrawable.ClipState mState;
    ClipDrawable() { super((android.graphics.drawable.Drawable)null); }
    public ClipDrawable(android.graphics.drawable.Drawable p0, int p1, int p2) { super((android.graphics.drawable.Drawable)null); }
    public void inflate(android.content.res.Resources p0, org.xmlpull.v1.XmlPullParser p1, android.util.AttributeSet p2, android.content.res.Resources.Theme p3) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {}
    public void applyTheme(android.content.res.Resources.Theme p0) {}
    private void verifyRequiredAttributes(android.content.res.TypedArray p0) throws org.xmlpull.v1.XmlPullParserException {}
    private void updateStateFromTypedArray(android.content.res.TypedArray p0) {}
    protected boolean onLevelChange(int p0) { return false; }
    public int getOpacity() { return 0; }
    public void draw(android.graphics.Canvas p0) {}
    android.graphics.drawable.DrawableWrapper.DrawableWrapperState mutateConstantState() { return null; }
    private ClipDrawable(android.graphics.drawable.ClipDrawable.ClipState p0, android.content.res.Resources p1) { super((android.graphics.drawable.Drawable)null); }

    static final class ClipState extends android.graphics.drawable.DrawableWrapper.DrawableWrapperState {
        private int[] mThemeAttrs;
        int mOrientation;
        int mGravity;
        ClipState(android.graphics.drawable.ClipDrawable.ClipState p0, android.content.res.Resources p1) { super(null, null); }
        public android.graphics.drawable.Drawable newDrawable(android.content.res.Resources p0) { return null; }
    }
}
