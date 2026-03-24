package android.view;

public abstract class OrientationEventListener {
    private static final java.lang.String TAG = "OrientationEventListener";
    private static final boolean DEBUG = false;
    private static final boolean localLOGV = false;
    private int mOrientation;
    private android.hardware.SensorManager mSensorManager;
    private boolean mEnabled;
    private int mRate;
    private android.hardware.Sensor mSensor;
    private android.hardware.SensorEventListener mSensorEventListener;
    private android.view.OrientationListener mOldListener;
    public static final int ORIENTATION_UNKNOWN = -1;
    public OrientationEventListener(android.content.Context p0) {}
    public OrientationEventListener(android.content.Context p0, int p1) {}
    void registerListener(android.view.OrientationListener p0) {}
    public void enable() {}
    public void disable() {}
    public boolean canDetectOrientation() { return false; }
    public abstract void onOrientationChanged(int p0);

    class SensorEventListenerImpl implements android.hardware.SensorEventListener {
        private static final int _DATA_X = 0;
        private static final int _DATA_Y = 1;
        private static final int _DATA_Z = 2;
        SensorEventListenerImpl(android.view.OrientationEventListener p0) {}
        public void onSensorChanged(android.hardware.SensorEvent p0) {}
        public void onAccuracyChanged(android.hardware.Sensor p0, int p1) {}
    }
}
