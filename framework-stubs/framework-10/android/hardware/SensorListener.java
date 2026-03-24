package android.hardware;

@java.lang.Deprecated
public interface SensorListener {
    public void onSensorChanged(int p0, float[] p1);
    public void onAccuracyChanged(int p0, int p1);
}
