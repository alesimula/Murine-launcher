package android.companion.virtual.sensor;

@android.annotation.SystemApi
public interface VirtualSensorDirectChannelCallback {
    public void onDirectChannelCreated(int p0, android.os.SharedMemory p1);
    public void onDirectChannelDestroyed(int p0);
    public void onDirectChannelConfigured(int p0, android.companion.virtual.sensor.VirtualSensor p1, int p2, int p3);
}
