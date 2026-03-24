package android.transition;

public class TransitionSet extends android.transition.Transition {
    static final int FLAG_CHANGE_EPICENTER = 8;
    java.util.ArrayList<android.transition.Transition> mTransitions;
    int mCurrentListeners;
    boolean mStarted;
    public static final int ORDERING_TOGETHER = 0;
    public static final int ORDERING_SEQUENTIAL = 1;
    public TransitionSet() { super(); }
    public TransitionSet(android.content.Context p0, android.util.AttributeSet p1) { super(); }
    public android.transition.TransitionSet setOrdering(int p0) { return null; }
    public int getOrdering() { return 0; }
    public android.transition.TransitionSet addTransition(android.transition.Transition p0) { return null; }
    public int getTransitionCount() { return 0; }
    public android.transition.Transition getTransitionAt(int p0) { return null; }
    public android.transition.TransitionSet setDuration(long p0) { return null; }
    public android.transition.TransitionSet setStartDelay(long p0) { return null; }
    public android.transition.TransitionSet setInterpolator(android.animation.TimeInterpolator p0) { return null; }
    public android.transition.TransitionSet addTarget(android.view.View p0) { return null; }
    public android.transition.TransitionSet addTarget(int p0) { return null; }
    public android.transition.TransitionSet addTarget(java.lang.String p0) { return null; }
    public android.transition.TransitionSet addTarget(java.lang.Class p0) { return null; }
    public android.transition.TransitionSet addListener(android.transition.Transition.TransitionListener p0) { return null; }
    public android.transition.TransitionSet removeTarget(int p0) { return null; }
    public android.transition.TransitionSet removeTarget(android.view.View p0) { return null; }
    public android.transition.TransitionSet removeTarget(java.lang.Class p0) { return null; }
    public android.transition.TransitionSet removeTarget(java.lang.String p0) { return null; }
    public android.transition.Transition excludeTarget(android.view.View p0, boolean p1) { return null; }
    public android.transition.Transition excludeTarget(java.lang.String p0, boolean p1) { return null; }
    public android.transition.Transition excludeTarget(int p0, boolean p1) { return null; }
    public android.transition.Transition excludeTarget(java.lang.Class p0, boolean p1) { return null; }
    public android.transition.TransitionSet removeListener(android.transition.Transition.TransitionListener p0) { return null; }
    public void setPathMotion(android.transition.PathMotion p0) {}
    public android.transition.TransitionSet removeTransition(android.transition.Transition p0) { return null; }
    protected void createAnimators(android.view.ViewGroup p0, android.transition.TransitionValuesMaps p1, android.transition.TransitionValuesMaps p2, java.util.ArrayList<android.transition.TransitionValues> p3, java.util.ArrayList<android.transition.TransitionValues> p4) {}
    protected void runAnimators() {}
    public void captureStartValues(android.transition.TransitionValues p0) {}
    public void captureEndValues(android.transition.TransitionValues p0) {}
    void capturePropagationValues(android.transition.TransitionValues p0) {}
    public void pause(android.view.View p0) {}
    public void resume(android.view.View p0) {}
    protected void cancel() {}
    void forceToEnd(android.view.ViewGroup p0) {}
    android.transition.TransitionSet setSceneRoot(android.view.ViewGroup p0) { return null; }
    void setCanRemoveViews(boolean p0) {}
    public void setPropagation(android.transition.TransitionPropagation p0) {}
    public void setEpicenterCallback(android.transition.Transition.EpicenterCallback p0) {}
    java.lang.String toString(java.lang.String p0) { return null; }
    public android.transition.TransitionSet clone() { return null; }

    static class TransitionSetListener extends android.transition.TransitionListenerAdapter {
        android.transition.TransitionSet mTransitionSet;
        TransitionSetListener(android.transition.TransitionSet p0) { super(); }
        public void onTransitionStart(android.transition.Transition p0) {}
        public void onTransitionEnd(android.transition.Transition p0) {}
    }
}
