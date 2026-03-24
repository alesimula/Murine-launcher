package android.location;

@android.annotation.SystemApi
@android.annotation.FlaggedApi("android.location.flags.gnss_assistance_interface")
public final class SatelliteEphemerisTime implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.location.SatelliteEphemerisTime> CREATOR = null;
    public int getIode() { return 0; }
    public int getWeekNumber() { return 0; }
    public int getToeSeconds() { return 0; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    @android.annotation.NonNull
    public java.lang.String toString() { return null; }

    public static final class Builder {
        public Builder() {}
        @android.annotation.NonNull
        public android.location.SatelliteEphemerisTime.Builder setIode(int p0) { return null; }
        @android.annotation.NonNull
        public android.location.SatelliteEphemerisTime.Builder setWeekNumber(int p0) { return null; }
        @android.annotation.NonNull
        public android.location.SatelliteEphemerisTime.Builder setToeSeconds(int p0) { return null; }
        @android.annotation.NonNull
        public android.location.SatelliteEphemerisTime build() { return null; }
    }
}
