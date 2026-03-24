package android.content.res;

public class GradientColor extends android.content.res.ComplexColor {
    private static final java.lang.String TAG = "GradientColor";
    private static final boolean DBG_GRADIENT = false;
    private static final int TILE_MODE_CLAMP = 0;
    private static final int TILE_MODE_REPEAT = 1;
    private static final int TILE_MODE_MIRROR = 2;
    private android.content.res.GradientColor.GradientColorFactory mFactory;
    private int mChangingConfigurations;
    private int mDefaultColor;
    private android.graphics.Shader mShader;
    private int mGradientType;
    private float mCenterX;
    private float mCenterY;
    private float mStartX;
    private float mStartY;
    private float mEndX;
    private float mEndY;
    private int mStartColor;
    private int mCenterColor;
    private int mEndColor;
    private boolean mHasCenterColor;
    private int mTileMode;
    private float mGradientRadius;
    private int[] mItemColors;
    private float[] mItemOffsets;
    private int[] mThemeAttrs;
    private int[][] mItemsThemeAttrs;
    private GradientColor() { super(); }
    private GradientColor(android.content.res.GradientColor p0) { super(); }
    private static android.graphics.Shader.TileMode parseTileMode(int p0) { return null; }
    private void updateRootElementState(android.content.res.TypedArray p0) {}
    private void validateXmlContent() throws org.xmlpull.v1.XmlPullParserException {}
    public android.graphics.Shader getShader() { return null; }
    public static android.content.res.GradientColor createFromXml(android.content.res.Resources p0, android.content.res.XmlResourceParser p1, android.content.res.Resources.Theme p2) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException { return null; }
    static android.content.res.GradientColor createFromXmlInner(android.content.res.Resources p0, org.xmlpull.v1.XmlPullParser p1, android.util.AttributeSet p2, android.content.res.Resources.Theme p3) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException { return null; }
    private void inflate(android.content.res.Resources p0, org.xmlpull.v1.XmlPullParser p1, android.util.AttributeSet p2, android.content.res.Resources.Theme p3) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {}
    private void inflateChildElements(android.content.res.Resources p0, org.xmlpull.v1.XmlPullParser p1, android.util.AttributeSet p2, android.content.res.Resources.Theme p3) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {}
    private void applyItemsAttrsTheme(android.content.res.Resources.Theme p0) {}
    private void onColorsChange() {}
    public int getDefaultColor() { return 0; }
    public android.content.res.ConstantState<android.content.res.ComplexColor> getConstantState() { return null; }
    public android.content.res.GradientColor obtainForTheme(android.content.res.Resources.Theme p0) { return null; }
    public int getChangingConfigurations() { return 0; }
    private void applyTheme(android.content.res.Resources.Theme p0) {}
    private void applyRootAttrsTheme(android.content.res.Resources.Theme p0) {}
    public boolean canApplyTheme() { return false; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    private static @interface GradientTileMode {
    }

    private static class GradientColorFactory extends android.content.res.ConstantState<android.content.res.ComplexColor> {
        private final android.content.res.GradientColor mSrc = null;
        public GradientColorFactory(android.content.res.GradientColor p0) { super(); }
        public int getChangingConfigurations() { return 0; }
        public android.content.res.GradientColor newInstance() { return null; }
        public android.content.res.GradientColor newInstance(android.content.res.Resources p0, android.content.res.Resources.Theme p1) { return null; }
    }
}
