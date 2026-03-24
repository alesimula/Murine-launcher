package android.hardware.location;

@android.annotation.SystemApi
public abstract class GeofenceHardwareCallback {
    public GeofenceHardwareCallback() {}
    public void onGeofenceTransition(int p0, int p1, android.location.Location p2, long p3, int p4) {}
    public void onGeofenceAdd(int p0, int p1) {}
    public void onGeofenceRemove(int p0, int p1) {}
    public void onGeofencePause(int p0, int p1) {}
    public void onGeofenceResume(int p0, int p1) {}
}
