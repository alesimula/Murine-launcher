package android.hardware.location;

public class GeofenceHardwareService extends android.app.Service {
    private android.hardware.location.GeofenceHardwareImpl mGeofenceHardwareImpl;
    private android.content.Context mContext;
    private android.os.IBinder mBinder;
    public GeofenceHardwareService() { super(); }
    public void onCreate() {}
    public android.os.IBinder onBind(android.content.Intent p0) { return null; }
    public boolean onUnbind(android.content.Intent p0) { return false; }
    public void onDestroy() {}
    private void checkPermission(int p0, int p1, int p2) {}
}
