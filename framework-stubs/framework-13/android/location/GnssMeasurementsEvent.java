package android.location;

public final class GnssMeasurementsEvent implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.location.GnssMeasurementsEvent> CREATOR = null;
    public android.location.GnssClock getClock() { return null; }
    public java.util.Collection<android.location.GnssMeasurement> getMeasurements() { return null; }
    public java.util.Collection<android.location.GnssAutomaticGainControl> getGnssAutomaticGainControls() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public java.lang.String toString() { return null; }

    public static final class Builder {
        public Builder() {}
        public Builder(android.location.GnssMeasurementsEvent p0) {}
        public android.location.GnssMeasurementsEvent.Builder setClock(android.location.GnssClock p0) { return null; }
        public android.location.GnssMeasurementsEvent.Builder setMeasurements(android.location.GnssMeasurement... p0) { return null; }
        public android.location.GnssMeasurementsEvent.Builder setMeasurements(java.util.Collection<android.location.GnssMeasurement> p0) { return null; }
        public android.location.GnssMeasurementsEvent.Builder setGnssAutomaticGainControls(android.location.GnssAutomaticGainControl... p0) { return null; }
        public android.location.GnssMeasurementsEvent.Builder setGnssAutomaticGainControls(java.util.Collection<android.location.GnssAutomaticGainControl> p0) { return null; }
        public android.location.GnssMeasurementsEvent build() { return null; }
    }

    public static abstract class Callback {
        @java.lang.Deprecated
        public static final int STATUS_NOT_SUPPORTED = 0;
        @java.lang.Deprecated
        public static final int STATUS_READY = 1;
        @java.lang.Deprecated
        public static final int STATUS_LOCATION_DISABLED = 2;
        @java.lang.Deprecated
        public static final int STATUS_NOT_ALLOWED = 3;
        public Callback() {}
        public void onGnssMeasurementsReceived(android.location.GnssMeasurementsEvent p0) {}
        @java.lang.Deprecated
        public void onStatusChanged(int p0) {}

        @java.lang.Deprecated
        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface GnssMeasurementsStatus {
        }
    }
}
