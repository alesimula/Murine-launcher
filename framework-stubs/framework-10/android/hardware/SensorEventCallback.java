package android.hardware;

public abstract class SensorEventCallback implements android.hardware.SensorEventListener2 {
    public SensorEventCallback() {}
    public void onSensorChanged(android.hardware.SensorEvent p0) {}
    public void onAccuracyChanged(android.hardware.Sensor p0, int p1) {}
    public void onFlushCompleted(android.hardware.Sensor p0) {}
    public void onSensorAdditionalInfo(android.hardware.SensorAdditionalInfo p0) {}
}
