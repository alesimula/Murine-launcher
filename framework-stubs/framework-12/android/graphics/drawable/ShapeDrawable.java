package android.graphics.drawable;

public class ShapeDrawable extends android.graphics.drawable.Drawable {
    private android.graphics.drawable.ShapeDrawable.ShapeState mShapeState;
    private android.graphics.BlendModeColorFilter mBlendModeColorFilter;
    private boolean mMutated;
    public ShapeDrawable() { super(); }
    public ShapeDrawable(android.graphics.drawable.shapes.Shape p0) { super(); }
    public android.graphics.drawable.shapes.Shape getShape() { return null; }
    public void setShape(android.graphics.drawable.shapes.Shape p0) {}
    public void setShaderFactory(android.graphics.drawable.ShapeDrawable.ShaderFactory p0) {}
    public android.graphics.drawable.ShapeDrawable.ShaderFactory getShaderFactory() { return null; }
    public android.graphics.Paint getPaint() { return null; }
    public void setPadding(int p0, int p1, int p2, int p3) {}
    public void setPadding(android.graphics.Rect p0) {}
    public void setIntrinsicWidth(int p0) {}
    public void setIntrinsicHeight(int p0) {}
    public int getIntrinsicWidth() { return 0; }
    public int getIntrinsicHeight() { return 0; }
    public boolean getPadding(android.graphics.Rect p0) { return false; }
    private static int modulateAlpha(int p0, int p1) { return 0; }
    protected void onDraw(android.graphics.drawable.shapes.Shape p0, android.graphics.Canvas p1, android.graphics.Paint p2) {}
    public void draw(android.graphics.Canvas p0) {}
    public int getChangingConfigurations() { return 0; }
    public void setAlpha(int p0) {}
    public int getAlpha() { return 0; }
    public void setTintList(android.content.res.ColorStateList p0) {}
    public void setTintBlendMode(android.graphics.BlendMode p0) {}
    public void setColorFilter(android.graphics.ColorFilter p0) {}
    public void setXfermode(android.graphics.Xfermode p0) {}
    public int getOpacity() { return 0; }
    public void setDither(boolean p0) {}
    protected void onBoundsChange(android.graphics.Rect p0) {}
    protected boolean onStateChange(int[] p0) { return false; }
    public boolean isStateful() { return false; }
    public boolean hasFocusStateSpecified() { return false; }
    protected boolean inflateTag(java.lang.String p0, android.content.res.Resources p1, org.xmlpull.v1.XmlPullParser p2, android.util.AttributeSet p3) { return false; }
    public void inflate(android.content.res.Resources p0, org.xmlpull.v1.XmlPullParser p1, android.util.AttributeSet p2, android.content.res.Resources.Theme p3) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {}
    public void applyTheme(android.content.res.Resources.Theme p0) {}
    private void updateStateFromTypedArray(android.content.res.TypedArray p0) {}
    private void updateShape() {}
    public void getOutline(android.graphics.Outline p0) {}
    public android.graphics.drawable.Drawable.ConstantState getConstantState() { return null; }
    public android.graphics.drawable.Drawable mutate() { return null; }
    public void clearMutated() {}
    private ShapeDrawable(android.graphics.drawable.ShapeDrawable.ShapeState p0, android.content.res.Resources p1) { super(); }
    private void updateLocalState() {}

    public static abstract class ShaderFactory {
        public ShaderFactory() {}
        public abstract android.graphics.Shader resize(int p0, int p1);
    }

    static final class ShapeState extends android.graphics.drawable.Drawable.ConstantState {
        final android.graphics.Paint mPaint = null;
        int mChangingConfigurations;
        int[] mThemeAttrs;
        android.graphics.drawable.shapes.Shape mShape;
        android.content.res.ColorStateList mTint;
        android.graphics.BlendMode mBlendMode;
        android.graphics.Rect mPadding;
        int mIntrinsicWidth;
        int mIntrinsicHeight;
        int mAlpha;
        android.graphics.drawable.ShapeDrawable.ShaderFactory mShaderFactory;
        ShapeState() { super(); }
        ShapeState(android.graphics.drawable.ShapeDrawable.ShapeState p0) { super(); }
        public boolean canApplyTheme() { return false; }
        public android.graphics.drawable.Drawable newDrawable() { return null; }
        public android.graphics.drawable.Drawable newDrawable(android.content.res.Resources p0) { return null; }
        public int getChangingConfigurations() { return 0; }
    }
}
