package android.hardware.location;

@android.annotation.SystemApi
public final class GeofenceHardwareRequest {
    static final int GEOFENCE_TYPE_CIRCLE = 0;
    public GeofenceHardwareRequest() {}
    public static android.hardware.location.GeofenceHardwareRequest createCircularGeofence(double p0, double p1, double p2) { return null; }
    public void setLastTransition(int p0) {}
    public void setUnknownTimer(int p0) {}
    public void setMonitorTransitions(int p0) {}
    public void setNotificationResponsiveness(int p0) {}
    public void setSourceTechnologies(int p0) {}
    public double getLatitude() { return 0.0; }
    public double getLongitude() { return 0.0; }
    public double getRadius() { return 0.0; }
    public int getMonitorTransitions() { return 0; }
    public int getUnknownTimer() { return 0; }
    public int getNotificationResponsiveness() { return 0; }
    public int getLastTransition() { return 0; }
    public int getSourceTechnologies() { return 0; }
    int getType() { return 0; }
}
