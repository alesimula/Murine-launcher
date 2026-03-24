package android.graphics.drawable;

public class ColorDrawable extends android.graphics.drawable.Drawable {
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
    @android.annotation.Nullable
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
    public boolean canApplyTheme() { return false; }
    public void applyTheme(android.content.res.Resources.Theme p0) {}
    public android.graphics.drawable.Drawable.ConstantState getConstantState() { return null; }

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
