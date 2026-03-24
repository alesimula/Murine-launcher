package android.hardware;

final class LegacySensorManager {
    public LegacySensorManager(android.hardware.SensorManager p0) {}
    public int getSensors() { return 0; }
    public boolean registerListener(android.hardware.SensorListener p0, int p1, int p2) { return false; }
    public void unregisterListener(android.hardware.SensorListener p0, int p1) {}
    static void onRotationChanged(int p0) {}
    static int getRotation() { return 0; }

    private static final class LegacyListener implements android.hardware.SensorEventListener {
        LegacyListener(android.hardware.SensorListener p0) {}
        boolean registerSensor(int p0) { return false; }
        boolean unregisterSensor(int p0) { return false; }
        boolean hasSensors() { return false; }
        public void onAccuracyChanged(android.hardware.Sensor p0, int p1) {}
        public void onSensorChanged(android.hardware.SensorEvent p0) {}
    }

    private static final class LmsFilter {
        public LmsFilter() {}
        public float filter(long p0, float p1) { return 0.0f; }
    }
}
