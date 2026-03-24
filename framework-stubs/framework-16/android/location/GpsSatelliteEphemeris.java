package android.location;

@android.annotation.SystemApi
@android.annotation.FlaggedApi("android.location.flags.gnss_assistance_interface")
public final class GpsSatelliteEphemeris implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.location.GpsSatelliteEphemeris> CREATOR = null;
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
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    @android.annotation.NonNull
    public java.lang.String toString() { return null; }

    public static final class Builder {
        public Builder() {}
        @android.annotation.NonNull
        public android.location.GpsSatelliteEphemeris.Builder setSvid(int p0) { return null; }
        @android.annotation.NonNull
        public android.location.GpsSatelliteEphemeris.Builder setGpsL2Params(android.location.GpsSatelliteEphemeris.GpsL2Params p0) { return null; }
        @android.annotation.NonNull
        public android.location.GpsSatelliteEphemeris.Builder setSatelliteClockModel(android.location.GpsSatelliteEphemeris.GpsSatelliteClockModel p0) { return null; }
        @android.annotation.NonNull
        public android.location.GpsSatelliteEphemeris.Builder setSatelliteOrbitModel(android.location.KeplerianOrbitModel p0) { return null; }
        @android.annotation.NonNull
        public android.location.GpsSatelliteEphemeris.Builder setSatelliteHealth(android.location.GpsSatelliteEphemeris.GpsSatelliteHealth p0) { return null; }
        @android.annotation.NonNull
        public android.location.GpsSatelliteEphemeris.Builder setSatelliteEphemerisTime(android.location.SatelliteEphemerisTime p0) { return null; }
        @android.annotation.NonNull
        public android.location.GpsSatelliteEphemeris build() { return null; }
    }

    public static final class GpsL2Params implements android.os.Parcelable {
        @android.annotation.NonNull
        public static final android.os.Parcelable.Creator<android.location.GpsSatelliteEphemeris.GpsL2Params> CREATOR = null;
        public int getL2Code() { return 0; }
        public int getL2Flag() { return 0; }
        public int describeContents() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        @android.annotation.NonNull
        public java.lang.String toString() { return null; }

        public static final class Builder {
            public Builder() {}
            @android.annotation.NonNull
            public android.location.GpsSatelliteEphemeris.GpsL2Params.Builder setL2Code(int p0) { return null; }
            @android.annotation.NonNull
            public android.location.GpsSatelliteEphemeris.GpsL2Params.Builder setL2Flag(int p0) { return null; }
            @android.annotation.NonNull
            public android.location.GpsSatelliteEphemeris.GpsL2Params build() { return null; }
        }
    }

    public static final class GpsSatelliteClockModel implements android.os.Parcelable {
        @android.annotation.NonNull
        public static final android.os.Parcelable.Creator<android.location.GpsSatelliteEphemeris.GpsSatelliteClockModel> CREATOR = null;
        public long getTimeOfClockSeconds() { return 0L; }
        public double getAf0() { return 0.0; }
        public double getAf1() { return 0.0; }
        public double getAf2() { return 0.0; }
        public double getTgd() { return 0.0; }
        public int getIodc() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public int describeContents() { return 0; }
        @android.annotation.NonNull
        public java.lang.String toString() { return null; }

        public static final class Builder {
            public Builder() {}
            @android.annotation.NonNull
            public android.location.GpsSatelliteEphemeris.GpsSatelliteClockModel.Builder setTimeOfClockSeconds(long p0) { return null; }
            @android.annotation.NonNull
            public android.location.GpsSatelliteEphemeris.GpsSatelliteClockModel.Builder setAf0(double p0) { return null; }
            @android.annotation.NonNull
            public android.location.GpsSatelliteEphemeris.GpsSatelliteClockModel.Builder setAf1(double p0) { return null; }
            @android.annotation.NonNull
            public android.location.GpsSatelliteEphemeris.GpsSatelliteClockModel.Builder setAf2(double p0) { return null; }
            @android.annotation.NonNull
            public android.location.GpsSatelliteEphemeris.GpsSatelliteClockModel.Builder setTgd(double p0) { return null; }
            @android.annotation.NonNull
            public android.location.GpsSatelliteEphemeris.GpsSatelliteClockModel.Builder setIodc(int p0) { return null; }
            @android.annotation.NonNull
            public android.location.GpsSatelliteEphemeris.GpsSatelliteClockModel build() { return null; }
        }
    }

    public static final class GpsSatelliteHealth implements android.os.Parcelable {
        @android.annotation.NonNull
        public static final android.os.Parcelable.Creator<android.location.GpsSatelliteEphemeris.GpsSatelliteHealth> CREATOR = null;
        public int getSvHealth() { return 0; }
        public double getSvAccur() { return 0.0; }
        public double getFitInt() { return 0.0; }
        public int describeContents() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        @android.annotation.NonNull
        public java.lang.String toString() { return null; }

        public static final class Builder {
            public Builder() {}
            @android.annotation.NonNull
            public android.location.GpsSatelliteEphemeris.GpsSatelliteHealth.Builder setSvHealth(int p0) { return null; }
            @android.annotation.NonNull
            public android.location.GpsSatelliteEphemeris.GpsSatelliteHealth.Builder setSvAccur(double p0) { return null; }
            @android.annotation.NonNull
            public android.location.GpsSatelliteEphemeris.GpsSatelliteHealth.Builder setFitInt(double p0) { return null; }
            @android.annotation.NonNull
            public android.location.GpsSatelliteEphemeris.GpsSatelliteHealth build() { return null; }
        }
    }
}
