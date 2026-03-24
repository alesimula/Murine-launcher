package android.transition;

public class TransitionManager {
    android.util.ArrayMap<android.transition.Scene, android.transition.Transition> mSceneTransitions;
    android.util.ArrayMap<android.transition.Scene, android.util.ArrayMap<android.transition.Scene, android.transition.Transition>> mScenePairTransitions;
    public TransitionManager() {}
    public void setDefaultTransition(android.transition.Transition p0) {}
    public static android.transition.Transition getDefaultTransition() { return null; }
    public void setTransition(android.transition.Scene p0, android.transition.Transition p1) {}
    public void setTransition(android.transition.Scene p0, android.transition.Scene p1, android.transition.Transition p2) {}
    public android.transition.Transition getTransition(android.transition.Scene p0) { return null; }
    public void transitionTo(android.transition.Scene p0) {}
    public static void go(android.transition.Scene p0) {}
    public static void go(android.transition.Scene p0, android.transition.Transition p1) {}
    public static void beginDelayedTransition(android.view.ViewGroup p0) {}
    public static void beginDelayedTransition(android.view.ViewGroup p0, android.transition.Transition p1) {}
    public static void endTransitions(android.view.ViewGroup p0) {}

    private static class MultiListener implements android.view.ViewTreeObserver.OnPreDrawListener, android.view.View.OnAttachStateChangeListener {
        android.transition.Transition mTransition;
        android.view.ViewGroup mSceneRoot;
        final android.view.ViewTreeObserver mViewTreeObserver = null;
        MultiListener(android.transition.Transition p0, android.view.ViewGroup p1) {}
        public void onViewAttachedToWindow(android.view.View p0) {}
        public void onViewDetachedFromWindow(android.view.View p0) {}
        public boolean onPreDraw() { return false; }
    }
}
