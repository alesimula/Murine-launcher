package android.graphics.drawable;

public class AnimatedRotateDrawable extends android.graphics.drawable.DrawableWrapper implements android.graphics.drawable.Animatable {
    public AnimatedRotateDrawable() { super((android.graphics.drawable.Drawable)null); }
    public void draw(android.graphics.Canvas p0) {}
    public void start() {}
    public void stop() {}
    public boolean isRunning() { return false; }
    public boolean setVisible(boolean p0, boolean p1) { return false; }
    public void inflate(android.content.res.Resources p0, org.xmlpull.v1.XmlPullParser p1, android.util.AttributeSet p2, android.content.res.Resources.Theme p3) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {}
    public void applyTheme(android.content.res.Resources.Theme p0) {}
    public void setFramesCount(int p0) {}
    public void setFramesDuration(int p0) {}
    android.graphics.drawable.DrawableWrapper.DrawableWrapperState mutateConstantState() { return null; }

    static final class AnimatedRotateState extends android.graphics.drawable.DrawableWrapper.DrawableWrapperState {
        boolean mPivotXRel;
        float mPivotX;
        boolean mPivotYRel;
        float mPivotY;
        int mFrameDuration;
        int mFramesCount;
        public AnimatedRotateState(android.graphics.drawable.AnimatedRotateDrawable.AnimatedRotateState p0, android.content.res.Resources p1) { super(null, null); }
        public android.graphics.drawable.Drawable newDrawable(android.content.res.Resources p0) { return null; }
    }
}
