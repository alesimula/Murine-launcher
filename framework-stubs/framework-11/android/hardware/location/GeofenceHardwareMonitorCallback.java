package android.hardware.location;

@android.annotation.SystemApi
public abstract class GeofenceHardwareMonitorCallback {
    public GeofenceHardwareMonitorCallback() {}
    @java.lang.Deprecated
    public void onMonitoringSystemChange(int p0, boolean p1, android.location.Location p2) {}
    public void onMonitoringSystemChange(android.hardware.location.GeofenceHardwareMonitorEvent p0) {}
}
