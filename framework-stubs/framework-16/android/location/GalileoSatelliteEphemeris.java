package android.location;

@android.annotation.SystemApi
@android.annotation.FlaggedApi("android.location.flags.gnss_assistance_interface")
public final class GalileoSatelliteEphemeris implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.location.GalileoSatelliteEphemeris> CREATOR = null;
    public int getSvid() { return 0; }
    @android.annotation.NonNull
    public java.util.List<android.location.GalileoSatelliteEphemeris.GalileoSatelliteClockModel> getSatelliteClockModels() { return null; }
    @android.annotation.NonNull
    public android.location.KeplerianOrbitModel getSatelliteOrbitModel() { return null; }
    @android.annotation.NonNull
    public android.location.GalileoSatelliteEphemeris.GalileoSvHealth getSatelliteHealth() { return null; }
    @android.annotation.NonNull
    public android.location.SatelliteEphemerisTime getSatelliteEphemerisTime() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    @android.annotation.NonNull
    public java.lang.String toString() { return null; }

    public static final class Builder {
        public Builder() {}
        @android.annotation.NonNull
        public android.location.GalileoSatelliteEphemeris.Builder setSvid(int p0) { return null; }
        @android.annotation.NonNull
        public android.location.GalileoSatelliteEphemeris.Builder setSatelliteClockModels(java.util.List<android.location.GalileoSatelliteEphemeris.GalileoSatelliteClockModel> p0) { return null; }
        @android.annotation.NonNull
        public android.location.GalileoSatelliteEphemeris.Builder setSatelliteOrbitModel(android.location.KeplerianOrbitModel p0) { return null; }
        @android.annotation.NonNull
        public android.location.GalileoSatelliteEphemeris.Builder setSatelliteHealth(android.location.GalileoSatelliteEphemeris.GalileoSvHealth p0) { return null; }
        @android.annotation.NonNull
        public android.location.GalileoSatelliteEphemeris.Builder setSatelliteEphemerisTime(android.location.SatelliteEphemerisTime p0) { return null; }
        @android.annotation.NonNull
        public android.location.GalileoSatelliteEphemeris build() { return null; }
    }

    public static final class GalileoSatelliteClockModel implements android.os.Parcelable {
        public static final int TYPE_UNDEFINED = 0;
        public static final int TYPE_FNAV = 1;
        public static final int TYPE_INAV = 2;
        @android.annotation.NonNull
        public static final android.os.Parcelable.Creator<android.location.GalileoSatelliteEphemeris.GalileoSatelliteClockModel> CREATOR = null;
        public long getTimeOfClockSeconds() { return 0L; }
        public double getAf0() { return 0.0; }
        public double getAf1() { return 0.0; }
        public double getAf2() { return 0.0; }
        public double getBgdSeconds() { return 0.0; }
        public double getSisaMeters() { return 0.0; }
        public int getSatelliteClockType() { return 0; }
        public int describeContents() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        @android.annotation.NonNull
        public java.lang.String toString() { return null; }

        public static final class Builder {
            public Builder() {}
            @android.annotation.NonNull
            public android.location.GalileoSatelliteEphemeris.GalileoSatelliteClockModel.Builder setTimeOfClockSeconds(long p0) { return null; }
            @android.annotation.NonNull
            public android.location.GalileoSatelliteEphemeris.GalileoSatelliteClockModel.Builder setAf0(double p0) { return null; }
            @android.annotation.NonNull
            public android.location.GalileoSatelliteEphemeris.GalileoSatelliteClockModel.Builder setAf1(double p0) { return null; }
            @android.annotation.NonNull
            public android.location.GalileoSatelliteEphemeris.GalileoSatelliteClockModel.Builder setAf2(double p0) { return null; }
            @android.annotation.NonNull
            public android.location.GalileoSatelliteEphemeris.GalileoSatelliteClockModel.Builder setBgdSeconds(double p0) { return null; }
            @android.annotation.NonNull
            public android.location.GalileoSatelliteEphemeris.GalileoSatelliteClockModel.Builder setSisaMeters(double p0) { return null; }
            @android.annotation.NonNull
            public android.location.GalileoSatelliteEphemeris.GalileoSatelliteClockModel.Builder setSatelliteClockType(int p0) { return null; }
            @android.annotation.NonNull
            public android.location.GalileoSatelliteEphemeris.GalileoSatelliteClockModel build() { return null; }
        }

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface SatelliteClockType {
        }
    }

    public static final class GalileoSvHealth implements android.os.Parcelable {
        public static final int DATA_STATUS_DATA_VALID = 0;
        public static final int DATA_STATUS_WORKING_WITHOUT_GUARANTEE = 1;
        public static final int HEALTH_STATUS_OK = 0;
        public static final int HEALTH_STATUS_OUT_OF_SERVICE = 1;
        public static final int HEALTH_STATUS_EXTENDED_OPERATION_MODE = 2;
        public static final int HEALTH_STATUS_IN_TEST = 3;
        @android.annotation.NonNull
        public static final android.os.Parcelable.Creator<android.location.GalileoSatelliteEphemeris.GalileoSvHealth> CREATOR = null;
        public int getDataValidityStatusE1b() { return 0; }
        public int getSignalHealthStatusE1b() { return 0; }
        public int getDataValidityStatusE5a() { return 0; }
        public int getSignalHealthStatusE5a() { return 0; }
        public int getDataValidityStatusE5b() { return 0; }
        public int getSignalHealthStatusE5b() { return 0; }
        public int describeContents() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        @android.annotation.NonNull
        public java.lang.String toString() { return null; }

        public static final class Builder {
            public Builder() {}
            @android.annotation.NonNull
            public android.location.GalileoSatelliteEphemeris.GalileoSvHealth.Builder setDataValidityStatusE1b(int p0) { return null; }
            @android.annotation.NonNull
            public android.location.GalileoSatelliteEphemeris.GalileoSvHealth.Builder setSignalHealthStatusE1b(int p0) { return null; }
            @android.annotation.NonNull
            public android.location.GalileoSatelliteEphemeris.GalileoSvHealth.Builder setDataValidityStatusE5a(int p0) { return null; }
            @android.annotation.NonNull
            public android.location.GalileoSatelliteEphemeris.GalileoSvHealth.Builder setSignalHealthStatusE5a(int p0) { return null; }
            @android.annotation.NonNull
            public android.location.GalileoSatelliteEphemeris.GalileoSvHealth.Builder setDataValidityStatusE5b(int p0) { return null; }
            @android.annotation.NonNull
            public android.location.GalileoSatelliteEphemeris.GalileoSvHealth.Builder setSignalHealthStatusE5b(int p0) { return null; }
            @android.annotation.NonNull
            public android.location.GalileoSatelliteEphemeris.GalileoSvHealth build() { return null; }
        }

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface GalileoDataValidityStatus {
        }

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface GalileoHealthStatus {
        }
    }
}
