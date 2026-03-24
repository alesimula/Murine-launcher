package android.location;

@java.lang.Deprecated
@android.annotation.SystemApi
public class GpsMeasurementsEvent implements android.os.Parcelable {
    public static final int STATUS_NOT_SUPPORTED = 0;
    public static final int STATUS_READY = 1;
    public static final int STATUS_GPS_LOCATION_DISABLED = 2;
    public static final android.os.Parcelable.Creator<android.location.GpsMeasurementsEvent> CREATOR = null;
    public GpsMeasurementsEvent(android.location.GpsClock p0, android.location.GpsMeasurement[] p1) {}
    public android.location.GpsClock getClock() { return null; }
    public java.util.Collection<android.location.GpsMeasurement> getMeasurements() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public java.lang.String toString() { return null; }

    @android.annotation.SystemApi
    public static interface Listener {
        public void onGpsMeasurementsReceived(android.location.GpsMeasurementsEvent p0);
        public void onStatusChanged(int p0);
    }
}
