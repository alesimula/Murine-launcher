package android.app.time;

public final class TimeZoneDetectorStatus implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.app.time.TimeZoneDetectorStatus> CREATOR = null;
    public TimeZoneDetectorStatus(int p0, android.app.time.TelephonyTimeZoneAlgorithmStatus p1, android.app.time.LocationTimeZoneAlgorithmStatus p2) {}
    public int getDetectorStatus() { return 0; }
    @android.annotation.NonNull
    public android.app.time.TelephonyTimeZoneAlgorithmStatus getTelephonyTimeZoneAlgorithmStatus() { return null; }
    @android.annotation.NonNull
    public android.app.time.LocationTimeZoneAlgorithmStatus getLocationTimeZoneAlgorithmStatus() { return null; }
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
}
