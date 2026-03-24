package android.animation;

public class LayoutTransition {
    public static final int CHANGE_APPEARING = 0;
    public static final int CHANGE_DISAPPEARING = 1;
    public static final int APPEARING = 2;
    public static final int DISAPPEARING = 3;
    public static final int CHANGING = 4;
    public LayoutTransition() {}
    public void setDuration(long p0) {}
    public void enableTransitionType(int p0) {}
    public void disableTransitionType(int p0) {}
    public boolean isTransitionTypeEnabled(int p0) { return false; }
    public void setStartDelay(int p0, long p1) {}
    public long getStartDelay(int p0) { return 0L; }
    public void setDuration(int p0, long p1) {}
    public long getDuration(int p0) { return 0L; }
    public void setStagger(int p0, long p1) {}
    public long getStagger(int p0) { return 0L; }
    public void setInterpolator(int p0, android.animation.TimeInterpolator p1) {}
    public android.animation.TimeInterpolator getInterpolator(int p0) { return null; }
    public void setAnimator(int p0, android.animation.Animator p1) {}
    public android.animation.Animator getAnimator(int p0) { return null; }
    public void setAnimateParentHierarchy(boolean p0) {}
    public void startChangingAnimations() {}
    public void endChangingAnimations() {}
    public boolean isChangingLayout() { return false; }
    public boolean isRunning() { return false; }
    public void cancel() {}
    public void cancel(int p0) {}
    public void layoutChange(android.view.ViewGroup p0) {}
    public void addChild(android.view.ViewGroup p0, android.view.View p1) {}
    @java.lang.Deprecated
    public void showChild(android.view.ViewGroup p0, android.view.View p1) {}
    public void showChild(android.view.ViewGroup p0, android.view.View p1, int p2) {}
    public void removeChild(android.view.ViewGroup p0, android.view.View p1) {}
    @java.lang.Deprecated
    public void hideChild(android.view.ViewGroup p0, android.view.View p1) {}
    public void hideChild(android.view.ViewGroup p0, android.view.View p1, int p2) {}
    public void addTransitionListener(android.animation.LayoutTransition.TransitionListener p0) {}
    public void removeTransitionListener(android.animation.LayoutTransition.TransitionListener p0) {}
    public java.util.List<android.animation.LayoutTransition.TransitionListener> getTransitionListeners() { return null; }

    private static final class CleanupCallback implements android.view.ViewTreeObserver.OnPreDrawListener, android.view.View.OnAttachStateChangeListener {
        final java.util.Map<android.view.View, android.view.View.OnLayoutChangeListener> layoutChangeListenerMap = null;
        final android.view.ViewGroup parent = null;
        CleanupCallback(java.util.Map<android.view.View, android.view.View.OnLayoutChangeListener> p0, android.view.ViewGroup p1) {}
        public void onViewAttachedToWindow(android.view.View p0) {}
        public void onViewDetachedFromWindow(android.view.View p0) {}
        public boolean onPreDraw() { return false; }
    }

    public static interface TransitionListener {
        public void startTransition(android.animation.LayoutTransition p0, android.view.ViewGroup p1, android.view.View p2, int p3);
        public void endTransition(android.animation.LayoutTransition p0, android.view.ViewGroup p1, android.view.View p2, int p3);
    }
}
