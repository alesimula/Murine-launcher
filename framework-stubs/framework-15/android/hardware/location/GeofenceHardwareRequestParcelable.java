package android.hardware.location;

public final class GeofenceHardwareRequestParcelable implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.hardware.location.GeofenceHardwareRequestParcelable> CREATOR = null;
    public GeofenceHardwareRequestParcelable(int p0, android.hardware.location.GeofenceHardwareRequest p1) {}
    public int getId() { return 0; }
    public double getLatitude() { return 0.0; }
    public double getLongitude() { return 0.0; }
    public double getRadius() { return 0.0; }
    public int getMonitorTransitions() { return 0; }
    public int getUnknownTimer() { return 0; }
    public int getNotificationResponsiveness() { return 0; }
    public int getLastTransition() { return 0; }
    int getType() { return 0; }
    int getSourceTechnologies() { return 0; }
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
