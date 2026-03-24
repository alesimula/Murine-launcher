package android.graphics.drawable;

public class ColorDrawable extends android.graphics.drawable.Drawable {
    private final android.graphics.Paint mPaint = null;
    @android.view.ViewDebug.ExportedProperty(deepExport=true, prefix="state_")
    private android.graphics.drawable.ColorDrawable.ColorState mColorState;
    private android.graphics.BlendModeColorFilter mBlendModeColorFilter;
    private boolean mMutated;
    public ColorDrawable() { super(); }
    public ColorDrawable(int p0) { super(); }
    public int getChangingConfigurations() { return 0; }
    public android.graphics.drawable.Drawable mutate() { return null; }
    public void clearMutated() {}
    public void draw(android.graphics.Canvas p0) {}
    public int getColor() { return 0; }
    public void setColor(int p0) {}
    public int getAlpha() { return 0; }
    public void setAlpha(int p0) {}
    public void setColorFilter(android.graphics.ColorFilter p0) {}
    public android.graphics.ColorFilter getColorFilter() { return null; }
    public void setTintList(android.content.res.ColorStateList p0) {}
    public void setTintBlendMode(android.graphics.BlendMode p0) {}
    protected boolean onStateChange(int[] p0) { return false; }
    public boolean isStateful() { return false; }
    public boolean hasFocusStateSpecified() { return false; }
    public void setXfermode(android.graphics.Xfermode p0) {}
    public android.graphics.Xfermode getXfermode() { return null; }
    public int getOpacity() { return 0; }
    public void getOutline(android.graphics.Outline p0) {}
    public void inflate(android.content.res.Resources p0, org.xmlpull.v1.XmlPullParser p1, android.util.AttributeSet p2, android.content.res.Resources.Theme p3) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {}
    private void updateStateFromTypedArray(android.content.res.TypedArray p0) {}
    public boolean canApplyTheme() { return false; }
    public void applyTheme(android.content.res.Resources.Theme p0) {}
    public android.graphics.drawable.Drawable.ConstantState getConstantState() { return null; }
    private ColorDrawable(android.graphics.drawable.ColorDrawable.ColorState p0, android.content.res.Resources p1) { super(); }
    private void updateLocalState(android.content.res.Resources p0) {}

    static final class ColorState extends android.graphics.drawable.Drawable.ConstantState {
        int[] mThemeAttrs;
        int mBaseColor;
        @android.view.ViewDebug.ExportedProperty
        int mUseColor;
        int mChangingConfigurations;
        android.content.res.ColorStateList mTint;
        android.graphics.BlendMode mBlendMode;
        ColorState() { super(); }
        ColorState(android.graphics.drawable.ColorDrawable.ColorState p0) { super(); }
        public boolean canApplyTheme() { return false; }
        public android.graphics.drawable.Drawable newDrawable() { return null; }
        public android.graphics.drawable.Drawable newDrawable(android.content.res.Resources p0) { return null; }
        public int getChangingConfigurations() { return 0; }
    }
}
