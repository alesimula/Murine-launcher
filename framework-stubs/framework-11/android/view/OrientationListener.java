package android.view;

@java.lang.Deprecated
public abstract class OrientationListener implements android.hardware.SensorListener {
    private android.view.OrientationEventListener mOrientationEventLis;
    public static final int ORIENTATION_UNKNOWN = -1;
    public OrientationListener(android.content.Context p0) {}
    public OrientationListener(android.content.Context p0, int p1) {}
    public void enable() {}
    public void disable() {}
    public void onAccuracyChanged(int p0, int p1) {}
    public void onSensorChanged(int p0, float[] p1) {}
    public abstract void onOrientationChanged(int p0);

    class OrientationEventListenerInternal extends android.view.OrientationEventListener {
        OrientationEventListenerInternal(android.view.OrientationListener p0, android.content.Context p1) { super((android.content.Context)null); }
        OrientationEventListenerInternal(android.view.OrientationListener p0, android.content.Context p1, int p2) { super((android.content.Context)null); }
        public void onOrientationChanged(int p0) {}
    }
}
