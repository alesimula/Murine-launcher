package android.transition;

public abstract class TransitionPropagation {
    public TransitionPropagation() {}
    public abstract long getStartDelay(android.view.ViewGroup p0, android.transition.Transition p1, android.transition.TransitionValues p2, android.transition.TransitionValues p3);
    public abstract void captureValues(android.transition.TransitionValues p0);
    public abstract java.lang.String[] getPropagationProperties();
}
