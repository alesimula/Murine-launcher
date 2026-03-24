package android.transition;

public class TransitionManager {
    private static java.lang.String LOG_TAG;
    private static android.transition.Transition sDefaultTransition;
    private static final java.lang.String[] EMPTY_STRINGS = null;
    android.util.ArrayMap<android.transition.Scene, android.transition.Transition> mSceneTransitions;
    android.util.ArrayMap<android.transition.Scene, android.util.ArrayMap<android.transition.Scene, android.transition.Transition>> mScenePairTransitions;
    @android.annotation.UnsupportedAppUsage
    private static java.lang.ThreadLocal<java.lang.ref.WeakReference<android.util.ArrayMap<android.view.ViewGroup, java.util.ArrayList<android.transition.Transition>>>> sRunningTransitions;
    @android.annotation.UnsupportedAppUsage
    private static java.util.ArrayList<android.view.ViewGroup> sPendingTransitions;
    public TransitionManager() {}
    public void setDefaultTransition(android.transition.Transition p0) {}
    public static android.transition.Transition getDefaultTransition() { return null; }
    public void setTransition(android.transition.Scene p0, android.transition.Transition p1) {}
    public void setTransition(android.transition.Scene p0, android.transition.Scene p1, android.transition.Transition p2) {}
    public android.transition.Transition getTransition(android.transition.Scene p0) { return null; }
    private static void changeScene(android.transition.Scene p0, android.transition.Transition p1) {}
    @android.annotation.UnsupportedAppUsage
    private static android.util.ArrayMap<android.view.ViewGroup, java.util.ArrayList<android.transition.Transition>> getRunningTransitions() { return null; }
    private static void sceneChangeRunTransition(android.view.ViewGroup p0, android.transition.Transition p1) {}
    private static void sceneChangeSetup(android.view.ViewGroup p0, android.transition.Transition p1) {}
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
        private void removeListeners() {}
        public void onViewAttachedToWindow(android.view.View p0) {}
        public void onViewDetachedFromWindow(android.view.View p0) {}
        public boolean onPreDraw() { return false; }
    }
}
