package android.transition;

public abstract class VisibilityPropagation extends android.transition.TransitionPropagation {
    private static final java.lang.String PROPNAME_VISIBILITY = "android:visibilityPropagation:visibility";
    private static final java.lang.String PROPNAME_VIEW_CENTER = "android:visibilityPropagation:center";
    private static final java.lang.String[] VISIBILITY_PROPAGATION_VALUES = null;
    public VisibilityPropagation() { super(); }
    public void captureValues(android.transition.TransitionValues p0) {}
    public java.lang.String[] getPropagationProperties() { return null; }
    public int getViewVisibility(android.transition.TransitionValues p0) { return 0; }
    public int getViewX(android.transition.TransitionValues p0) { return 0; }
    public int getViewY(android.transition.TransitionValues p0) { return 0; }
    private static int getViewCoordinate(android.transition.TransitionValues p0, int p1) { return 0; }
}
