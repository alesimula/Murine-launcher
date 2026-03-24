package android.hardware;

final class LegacySensorManager {
    private static boolean sInitialized;
    private static android.view.IWindowManager sWindowManager;
    private static int sRotation;
    private final android.hardware.SensorManager mSensorManager = null;
    private final java.util.HashMap<android.hardware.SensorListener, android.hardware.LegacySensorManager.LegacyListener> mLegacyListenersMap = null;
    public LegacySensorManager(android.hardware.SensorManager p0) {}
    public int getSensors() { return 0; }
    public boolean registerListener(android.hardware.SensorListener p0, int p1, int p2) { return false; }
    private boolean registerLegacyListener(int p0, int p1, android.hardware.SensorListener p2, int p3, int p4) { return false; }
    public void unregisterListener(android.hardware.SensorListener p0, int p1) {}
    private void unregisterLegacyListener(int p0, int p1, android.hardware.SensorListener p2, int p3) {}
    static void onRotationChanged(int p0) {}
    static int getRotation() { return 0; }

    private static final class LmsFilter {
        private static final int SENSORS_RATE_MS = 20;
        private static final int COUNT = 12;
        private static final float PREDICTION_RATIO = 0.3333333432674408f;
        private static final float PREDICTION_TIME = 0.07999999821186066f;
        private float[] mV;
        private long[] mT;
        private int mIndex;
        public LmsFilter() {}
        public float filter(long p0, float p1) { return 0.0f; }
    }

    private static final class LegacyListener implements android.hardware.SensorEventListener {
        private float[] mValues;
        private android.hardware.SensorListener mTarget;
        private int mSensors;
        private final android.hardware.LegacySensorManager.LmsFilter mYawfilter = null;
        LegacyListener(android.hardware.SensorListener p0) {}
        boolean registerSensor(int p0) { return false; }
        boolean unregisterSensor(int p0) { return false; }
        boolean hasSensors() { return false; }
        private static boolean hasOrientationSensor(int p0) { return false; }
        public void onAccuracyChanged(android.hardware.Sensor p0, int p1) {}
        public void onSensorChanged(android.hardware.SensorEvent p0) {}
        private void mapSensorDataToWindow(int p0, float[] p1, int p2) {}
        private static int getLegacySensorType(int p0) { return 0; }
    }
}
