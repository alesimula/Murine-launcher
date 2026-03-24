package android.location;

@android.annotation.SystemApi
@android.annotation.FlaggedApi("android.location.flags.gnss_assistance_interface")
public final class QzssSatelliteEphemeris implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.location.QzssSatelliteEphemeris> CREATOR = null;
    public int getSvid() { return 0; }
    @android.annotation.NonNull
    public android.location.GpsSatelliteEphemeris.GpsL2Params getGpsL2Params() { return null; }
    @android.annotation.NonNull
    public android.location.GpsSatelliteEphemeris.GpsSatelliteClockModel getSatelliteClockModel() { return null; }
    @android.annotation.NonNull
    public android.location.KeplerianOrbitModel getSatelliteOrbitModel() { return null; }
    @android.annotation.NonNull
    public android.location.GpsSatelliteEphemeris.GpsSatelliteHealth getSatelliteHealth() { return null; }
    @android.annotation.NonNull
    public android.location.SatelliteEphemerisTime getSatelliteEphemerisTime() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    @android.annotation.NonNull
    public java.lang.String toString() { return null; }

    public static final class Builder {
        public Builder() {}
        @android.annotation.NonNull
        public android.location.QzssSatelliteEphemeris.Builder setSvid(int p0) { return null; }
        @android.annotation.NonNull
        public android.location.QzssSatelliteEphemeris.Builder setGpsL2Params(android.location.GpsSatelliteEphemeris.GpsL2Params p0) { return null; }
        @android.annotation.NonNull
        public android.location.QzssSatelliteEphemeris.Builder setSatelliteClockModel(android.location.GpsSatelliteEphemeris.GpsSatelliteClockModel p0) { return null; }
        @android.annotation.NonNull
        public android.location.QzssSatelliteEphemeris.Builder setSatelliteOrbitModel(android.location.KeplerianOrbitModel p0) { return null; }
        @android.annotation.NonNull
        public android.location.QzssSatelliteEphemeris.Builder setSatelliteHealth(android.location.GpsSatelliteEphemeris.GpsSatelliteHealth p0) { return null; }
        @android.annotation.NonNull
        public android.location.QzssSatelliteEphemeris.Builder setSatelliteEphemerisTime(android.location.SatelliteEphemerisTime p0) { return null; }
        @android.annotation.NonNull
        public android.location.QzssSatelliteEphemeris build() { return null; }
    }
}
