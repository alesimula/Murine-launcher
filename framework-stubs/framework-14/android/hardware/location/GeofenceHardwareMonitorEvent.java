package android.hardware.location;

@android.annotation.SystemApi
public class GeofenceHardwareMonitorEvent implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.location.GeofenceHardwareMonitorEvent> CREATOR = null;
    public GeofenceHardwareMonitorEvent(int p0, int p1, int p2, android.location.Location p3) {}
    public int getMonitoringType() { return 0; }
    public int getMonitoringStatus() { return 0; }
    public int getSourceTechnologies() { return 0; }
    public android.location.Location getLocation() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public java.lang.String toString() { return null; }
}
