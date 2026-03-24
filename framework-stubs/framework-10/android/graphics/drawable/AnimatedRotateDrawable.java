package android.graphics.drawable;

public class AnimatedRotateDrawable extends android.graphics.drawable.DrawableWrapper implements android.graphics.drawable.Animatable {
    private android.graphics.drawable.AnimatedRotateDrawable.AnimatedRotateState mState;
    private float mCurrentDegrees;
    private float mIncrement;
    private boolean mRunning;
    private final java.lang.Runnable mNextFrame = null;
    public AnimatedRotateDrawable() { super((android.graphics.drawable.Drawable)null); }
    public void draw(android.graphics.Canvas p0) {}
    public void start() {}
    public void stop() {}
    public boolean isRunning() { return false; }
    private void nextFrame() {}
    public boolean setVisible(boolean p0, boolean p1) { return false; }
    public void inflate(android.content.res.Resources p0, org.xmlpull.v1.XmlPullParser p1, android.util.AttributeSet p2, android.content.res.Resources.Theme p3) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {}
    public void applyTheme(android.content.res.Resources.Theme p0) {}
    private void verifyRequiredAttributes(android.content.res.TypedArray p0) throws org.xmlpull.v1.XmlPullParserException {}
    private void updateStateFromTypedArray(android.content.res.TypedArray p0) {}
    @android.annotation.UnsupportedAppUsage
    public void setFramesCount(int p0) {}
    @android.annotation.UnsupportedAppUsage
    public void setFramesDuration(int p0) {}
    android.graphics.drawable.DrawableWrapper.DrawableWrapperState mutateConstantState() { return null; }
    private AnimatedRotateDrawable(android.graphics.drawable.AnimatedRotateDrawable.AnimatedRotateState p0, android.content.res.Resources p1) { super((android.graphics.drawable.Drawable)null); }
    private void updateLocalState() {}

    static final class AnimatedRotateState extends android.graphics.drawable.DrawableWrapper.DrawableWrapperState {
        private int[] mThemeAttrs;
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
