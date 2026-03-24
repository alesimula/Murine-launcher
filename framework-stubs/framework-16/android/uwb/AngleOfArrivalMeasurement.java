package android.uwb;

public final class AngleOfArrivalMeasurement implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.uwb.AngleOfArrivalMeasurement> CREATOR = null;
    AngleOfArrivalMeasurement() {}
    public int describeContents() { return 0; }
    @android.annotation.Nullable
    public android.uwb.AngleMeasurement getAltitude() { return null; }
    @android.annotation.NonNull
    public android.uwb.AngleMeasurement getAzimuth() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        public Builder(android.uwb.AngleMeasurement p0) {}
        @android.annotation.NonNull
        public android.uwb.AngleOfArrivalMeasurement build() { return null; }
        @android.annotation.NonNull
        public android.uwb.AngleOfArrivalMeasurement.Builder setAltitude(android.uwb.AngleMeasurement p0) { return null; }
    }
}
