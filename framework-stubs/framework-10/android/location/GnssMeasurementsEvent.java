package android.location;

public final class GnssMeasurementsEvent implements android.os.Parcelable {
    private final android.location.GnssClock mClock = null;
    private final java.util.Collection<android.location.GnssMeasurement> mReadOnlyMeasurements = null;
    public static final android.os.Parcelable.Creator<android.location.GnssMeasurementsEvent> CREATOR = null;
    public GnssMeasurementsEvent(android.location.GnssClock p0, android.location.GnssMeasurement[] p1) {}
    public android.location.GnssClock getClock() { return null; }
    public java.util.Collection<android.location.GnssMeasurement> getMeasurements() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public java.lang.String toString() { return null; }

    public static abstract class Callback {
        public static final int STATUS_NOT_SUPPORTED = 0;
        public static final int STATUS_READY = 1;
        public static final int STATUS_LOCATION_DISABLED = 2;
        public static final int STATUS_NOT_ALLOWED = 3;
        public Callback() {}
        public void onGnssMeasurementsReceived(android.location.GnssMeasurementsEvent p0) {}
        public void onStatusChanged(int p0) {}

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface GnssMeasurementsStatus {
        }
    }
}
