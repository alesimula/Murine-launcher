package android.hardware;

public class SensorEvent {
    public final float[] values = null;
    public android.hardware.Sensor sensor;
    public int accuracy;
    public long timestamp;
    @android.annotation.SuppressLint("MutableBareField")
    public boolean firstEventAfterDiscontinuity;
    SensorEvent(int p0) {}
    public SensorEvent(android.hardware.Sensor p0, int p1, long p2, float[] p3) {}
}
