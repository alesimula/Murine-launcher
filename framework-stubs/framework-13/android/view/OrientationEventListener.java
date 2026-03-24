package android.view;

public abstract class OrientationEventListener {
    public static final int ORIENTATION_UNKNOWN = -1;
    public OrientationEventListener(android.content.Context p0) {}
    public OrientationEventListener(android.content.Context p0, int p1) {}
    void registerListener(android.view.OrientationListener p0) {}
    public void enable() {}
    public void disable() {}
    public boolean canDetectOrientation() { return false; }
    public abstract void onOrientationChanged(int p0);

    class SensorEventListenerImpl implements android.hardware.SensorEventListener {
        SensorEventListenerImpl(android.view.OrientationEventListener p0) {}
        public void onSensorChanged(android.hardware.SensorEvent p0) {}
        public void onAccuracyChanged(android.hardware.Sensor p0, int p1) {}
    }
}
