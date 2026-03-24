package android.animation;

public class StateListAnimator implements java.lang.Cloneable {
    private java.util.ArrayList<android.animation.StateListAnimator.Tuple> mTuples;
    private android.animation.StateListAnimator.Tuple mLastMatch;
    private android.animation.Animator mRunningAnimator;
    private java.lang.ref.WeakReference<android.view.View> mViewRef;
    private android.animation.StateListAnimator.StateListAnimatorConstantState mConstantState;
    private android.animation.AnimatorListenerAdapter mAnimatorListener;
    private int mChangingConfigurations;
    public StateListAnimator() {}
    private void initAnimatorListener() {}
    public void addState(int[] p0, android.animation.Animator p1) {}
    public android.animation.Animator getRunningAnimator() { return null; }
    public android.view.View getTarget() { return null; }
    public void setTarget(android.view.View p0) {}
    private void clearTarget() {}
    public android.animation.StateListAnimator clone() { return null; }
    public void setState(int[] p0) {}
    private void start(android.animation.StateListAnimator.Tuple p0) {}
    private void cancel() {}
    public java.util.ArrayList<android.animation.StateListAnimator.Tuple> getTuples() { return null; }
    public void jumpToCurrentState() {}
    public int getChangingConfigurations() { return 0; }
    public void setChangingConfigurations(int p0) {}
    public void appendChangingConfigurations(int p0) {}
    public android.content.res.ConstantState<android.animation.StateListAnimator> createConstantState() { return null; }

    private static class StateListAnimatorConstantState extends android.content.res.ConstantState<android.animation.StateListAnimator> {
        final android.animation.StateListAnimator mAnimator = null;
        int mChangingConf;
        public StateListAnimatorConstantState(android.animation.StateListAnimator p0) { super(); }
        public int getChangingConfigurations() { return 0; }
        public android.animation.StateListAnimator newInstance() { return null; }
    }

    public static class Tuple {
        final int[] mSpecs = null;
        final android.animation.Animator mAnimator = null;
        private Tuple(int[] p0, android.animation.Animator p1) {}
        public int[] getSpecs() { return null; }
        public android.animation.Animator getAnimator() { return null; }
    }
}
