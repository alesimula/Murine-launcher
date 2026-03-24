package android.graphics.drawable;

public class AnimationDrawable extends android.graphics.drawable.DrawableContainer implements java.lang.Runnable, android.graphics.drawable.Animatable {
    private android.graphics.drawable.AnimationDrawable.AnimationState mAnimationState;
    @android.annotation.UnsupportedAppUsage
    private int mCurFrame;
    private boolean mRunning;
    private boolean mAnimating;
    private boolean mMutated;
    public AnimationDrawable() { super(); }
    public boolean setVisible(boolean p0, boolean p1) { return false; }
    public void start() {}
    public void stop() {}
    public boolean isRunning() { return false; }
    public void run() {}
    public void unscheduleSelf(java.lang.Runnable p0) {}
    public int getNumberOfFrames() { return 0; }
    public android.graphics.drawable.Drawable getFrame(int p0) { return null; }
    public int getDuration(int p0) { return 0; }
    public boolean isOneShot() { return false; }
    public void setOneShot(boolean p0) {}
    public void addFrame(android.graphics.drawable.Drawable p0, int p1) {}
    private void nextFrame(boolean p0) {}
    private void setFrame(int p0, boolean p1, boolean p2) {}
    public void inflate(android.content.res.Resources p0, org.xmlpull.v1.XmlPullParser p1, android.util.AttributeSet p2, android.content.res.Resources.Theme p3) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {}
    private void inflateChildElements(android.content.res.Resources p0, org.xmlpull.v1.XmlPullParser p1, android.util.AttributeSet p2, android.content.res.Resources.Theme p3) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {}
    private void updateStateFromTypedArray(android.content.res.TypedArray p0) {}
    public android.graphics.drawable.Drawable mutate() { return null; }
    android.graphics.drawable.AnimationDrawable.AnimationState cloneConstantState() { return null; }
    public void clearMutated() {}
    protected void setConstantState(android.graphics.drawable.DrawableContainer.DrawableContainerState p0) {}
    private AnimationDrawable(android.graphics.drawable.AnimationDrawable.AnimationState p0, android.content.res.Resources p1) { super(); }

    private static final class AnimationState extends android.graphics.drawable.DrawableContainer.DrawableContainerState {
        private int[] mDurations;
        private boolean mOneShot;
        AnimationState(android.graphics.drawable.AnimationDrawable.AnimationState p0, android.graphics.drawable.AnimationDrawable p1, android.content.res.Resources p2) { super(null, null, null); }
        private void mutate() {}
        public android.graphics.drawable.Drawable newDrawable() { return null; }
        public android.graphics.drawable.Drawable newDrawable(android.content.res.Resources p0) { return null; }
        public void addFrame(android.graphics.drawable.Drawable p0, int p1) {}
        public void growArray(int p0, int p1) {}
    }
}
