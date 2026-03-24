package android.hardware.location;

public final class GeofenceHardwareImpl {
    public static synchronized android.hardware.location.GeofenceHardwareImpl getInstance(android.content.Context p0) { return null; }
    public void setGpsHardwareGeofence(android.location.IGpsGeofenceHardware p0) {}
    public void onCapabilities(int p0) {}
    public void setVersion(int p0) {}
    public void setFusedGeofenceHardware(android.location.IFusedGeofenceHardware p0) {}
    public int[] getMonitoringTypes() { return null; }
    public int getStatusOfMonitoringType(int p0) { return 0; }
    public int getCapabilitiesForMonitoringType(int p0) { return 0; }
    public boolean addCircularFence(int p0, android.hardware.location.GeofenceHardwareRequestParcelable p1, android.hardware.location.IGeofenceHardwareCallback p2) { return false; }
    public boolean removeGeofence(int p0, int p1) { return false; }
    public boolean pauseGeofence(int p0, int p1) { return false; }
    public boolean resumeGeofence(int p0, int p1, int p2) { return false; }
    public boolean registerForMonitorStateChangeCallback(int p0, android.hardware.location.IGeofenceHardwareMonitorCallback p1) { return false; }
    public boolean unregisterForMonitorStateChangeCallback(int p0, android.hardware.location.IGeofenceHardwareMonitorCallback p1) { return false; }
    public void reportGeofenceTransition(int p0, android.location.Location p1, int p2, long p3, int p4, int p5) {}
    public void reportGeofenceMonitorStatus(int p0, int p1, android.location.Location p2, int p3) {}
    public void reportGeofenceAddStatus(int p0, int p1) {}
    public void reportGeofenceRemoveStatus(int p0, int p1) {}
    public void reportGeofencePauseStatus(int p0, int p1) {}
    public void reportGeofenceResumeStatus(int p0, int p1) {}
    int getMonitoringResolutionLevel(int p0) { return 0; }
    int getAllowedResolutionLevel(int p0, int p1) { return 0; }

    private class GeofenceTransition {
        GeofenceTransition(android.hardware.location.GeofenceHardwareImpl p0, int p1, int p2, long p3, android.location.Location p4, int p5, int p6) {}
    }

    class Reaper implements android.os.IBinder.DeathRecipient {
        Reaper(android.hardware.location.GeofenceHardwareImpl p0, android.hardware.location.IGeofenceHardwareCallback p1, int p2) {}
        Reaper(android.hardware.location.GeofenceHardwareImpl p0, android.hardware.location.IGeofenceHardwareMonitorCallback p1, int p2) {}
        public void binderDied() {}
        public int hashCode() { return 0; }
        public boolean equals(java.lang.Object p0) { return false; }
    }
}
