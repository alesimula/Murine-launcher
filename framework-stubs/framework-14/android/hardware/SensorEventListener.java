package android.hardware;

public interface SensorEventListener {
    public void onSensorChanged(android.hardware.SensorEvent p0);
    public void onAccuracyChanged(android.hardware.Sensor p0, int p1);
}
