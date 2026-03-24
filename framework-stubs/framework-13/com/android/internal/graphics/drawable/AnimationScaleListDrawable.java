package com.android.internal.graphics.drawable;

public class AnimationScaleListDrawable extends android.graphics.drawable.DrawableContainer implements android.graphics.drawable.Animatable {
    public AnimationScaleListDrawable() { super(); }
    protected boolean onStateChange(int[] p0) { return false; }
    public void inflate(android.content.res.Resources p0, org.xmlpull.v1.XmlPullParser p1, android.util.AttributeSet p2, android.content.res.Resources.Theme p3) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {}
    public android.graphics.drawable.Drawable mutate() { return null; }
    public void clearMutated() {}
    public void start() {}
    public void stop() {}
    public boolean isRunning() { return false; }
    public void applyTheme(android.content.res.Resources.Theme p0) {}
    protected void setConstantState(android.graphics.drawable.DrawableContainer.DrawableContainerState p0) {}

    static class AnimationScaleListState extends android.graphics.drawable.DrawableContainer.DrawableContainerState {
        int[] mThemeAttrs;
        int mStaticDrawableIndex;
        int mAnimatableDrawableIndex;
        AnimationScaleListState(com.android.internal.graphics.drawable.AnimationScaleListDrawable.AnimationScaleListState p0, com.android.internal.graphics.drawable.AnimationScaleListDrawable p1, android.content.res.Resources p2) { super(null, null, null); }
        void mutate() {}
        int addDrawable(android.graphics.drawable.Drawable p0) { return 0; }
        public android.graphics.drawable.Drawable newDrawable() { return null; }
        public android.graphics.drawable.Drawable newDrawable(android.content.res.Resources p0) { return null; }
        public boolean canApplyTheme() { return false; }
        public int getCurrentDrawableIndexBasedOnScale() { return 0; }
    }
}
