package android.hardware.location;

@android.annotation.SystemApi
public final class GeofenceHardware {
    static final int NUM_MONITORS = 2;
    public static final int MONITORING_TYPE_GPS_HARDWARE = 0;
    public static final int MONITORING_TYPE_FUSED_HARDWARE = 1;
    public static final int MONITOR_CURRENTLY_AVAILABLE = 0;
    public static final int MONITOR_CURRENTLY_UNAVAILABLE = 1;
    public static final int MONITOR_UNSUPPORTED = 2;
    public static final int GEOFENCE_ENTERED = 1;
    public static final int GEOFENCE_EXITED = 2;
    public static final int GEOFENCE_UNCERTAIN = 4;
    public static final int GEOFENCE_SUCCESS = 0;
    public static final int GEOFENCE_ERROR_TOO_MANY_GEOFENCES = 1;
    public static final int GEOFENCE_ERROR_ID_EXISTS = 2;
    public static final int GEOFENCE_ERROR_ID_UNKNOWN = 3;
    public static final int GEOFENCE_ERROR_INVALID_TRANSITION = 4;
    public static final int GEOFENCE_FAILURE = 5;
    public static final int GEOFENCE_ERROR_INSUFFICIENT_MEMORY = 6;
    public static final int SOURCE_TECHNOLOGY_GNSS = 1;
    public static final int SOURCE_TECHNOLOGY_WIFI = 2;
    public static final int SOURCE_TECHNOLOGY_SENSORS = 4;
    public static final int SOURCE_TECHNOLOGY_CELL = 8;
    public static final int SOURCE_TECHNOLOGY_BLUETOOTH = 16;
    public GeofenceHardware(android.hardware.location.IGeofenceHardware p0) {}
    public int[] getMonitoringTypes() { return null; }
    public int getStatusOfMonitoringType(int p0) { return 0; }
    public boolean addGeofence(int p0, int p1, android.hardware.location.GeofenceHardwareRequest p2, android.hardware.location.GeofenceHardwareCallback p3) { return false; }
    public boolean removeGeofence(int p0, int p1) { return false; }
    public boolean pauseGeofence(int p0, int p1) { return false; }
    public boolean resumeGeofence(int p0, int p1, int p2) { return false; }
    public boolean registerForMonitorStateChangeCallback(int p0, android.hardware.location.GeofenceHardwareMonitorCallback p1) { return false; }
    public boolean unregisterForMonitorStateChangeCallback(int p0, android.hardware.location.GeofenceHardwareMonitorCallback p1) { return false; }

    class GeofenceHardwareCallbackWrapper extends android.hardware.location.IGeofenceHardwareCallback.Stub {
        GeofenceHardwareCallbackWrapper(android.hardware.location.GeofenceHardware p0, android.hardware.location.GeofenceHardwareCallback p1) { super(); }
        public void onGeofenceTransition(int p0, int p1, android.location.Location p2, long p3, int p4) {}
        public void onGeofenceAdd(int p0, int p1) {}
        public void onGeofenceRemove(int p0, int p1) {}
        public void onGeofencePause(int p0, int p1) {}
        public void onGeofenceResume(int p0, int p1) {}
    }

    class GeofenceHardwareMonitorCallbackWrapper extends android.hardware.location.IGeofenceHardwareMonitorCallback.Stub {
        GeofenceHardwareMonitorCallbackWrapper(android.hardware.location.GeofenceHardware p0, android.hardware.location.GeofenceHardwareMonitorCallback p1) { super(); }
        public void onMonitoringSystemChange(android.hardware.location.GeofenceHardwareMonitorEvent p0) {}
    }
}
