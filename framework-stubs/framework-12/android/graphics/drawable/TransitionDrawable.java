package android.graphics.drawable;

public class TransitionDrawable extends android.graphics.drawable.LayerDrawable implements android.graphics.drawable.Drawable.Callback {
    private static final int TRANSITION_STARTING = 0;
    private static final int TRANSITION_RUNNING = 1;
    private static final int TRANSITION_NONE = 2;
    private int mTransitionState;
    private boolean mReverse;
    private long mStartTimeMillis;
    private int mFrom;
    private int mTo;
    private int mDuration;
    private int mOriginalDuration;
    private int mAlpha;
    private boolean mCrossFade;
    public TransitionDrawable(android.graphics.drawable.Drawable[] p0) { super((android.graphics.drawable.Drawable[])null); }
    TransitionDrawable() { super((android.graphics.drawable.Drawable[])null); }
    private TransitionDrawable(android.graphics.drawable.TransitionDrawable.TransitionState p0, android.content.res.Resources p1) { super((android.graphics.drawable.Drawable[])null); }
    private TransitionDrawable(android.graphics.drawable.TransitionDrawable.TransitionState p0, android.graphics.drawable.Drawable[] p1) { super((android.graphics.drawable.Drawable[])null); }
    android.graphics.drawable.LayerDrawable.LayerState createConstantState(android.graphics.drawable.LayerDrawable.LayerState p0, android.content.res.Resources p1) { return null; }
    public void startTransition(int p0) {}
    public void showSecondLayer() {}
    public void resetTransition() {}
    public void reverseTransition(int p0) {}
    public void draw(android.graphics.Canvas p0) {}
    public void setCrossFadeEnabled(boolean p0) {}
    public boolean isCrossFadeEnabled() { return false; }

    static class TransitionState extends android.graphics.drawable.LayerDrawable.LayerState {
        TransitionState(android.graphics.drawable.TransitionDrawable.TransitionState p0, android.graphics.drawable.TransitionDrawable p1, android.content.res.Resources p2) { super(null, null, null); }
        public android.graphics.drawable.Drawable newDrawable() { return null; }
        public android.graphics.drawable.Drawable newDrawable(android.content.res.Resources p0) { return null; }
        public int getChangingConfigurations() { return 0; }
    }
}
