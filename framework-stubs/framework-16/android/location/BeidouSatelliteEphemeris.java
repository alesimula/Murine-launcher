package android.location;

@android.annotation.SystemApi
@android.annotation.FlaggedApi("android.location.flags.gnss_assistance_interface")
public final class BeidouSatelliteEphemeris implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.location.BeidouSatelliteEphemeris> CREATOR = null;
    public int getSvid() { return 0; }
    @android.annotation.NonNull
    public android.location.BeidouSatelliteEphemeris.BeidouSatelliteClockModel getSatelliteClockModel() { return null; }
    @android.annotation.NonNull
    public android.location.KeplerianOrbitModel getSatelliteOrbitModel() { return null; }
    @android.annotation.NonNull
    public android.location.BeidouSatelliteEphemeris.BeidouSatelliteHealth getSatelliteHealth() { return null; }
    @android.annotation.NonNull
    public android.location.BeidouSatelliteEphemeris.BeidouSatelliteEphemerisTime getSatelliteEphemerisTime() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    @android.annotation.NonNull
    public java.lang.String toString() { return null; }

    public static final class BeidouSatelliteClockModel implements android.os.Parcelable {
        @android.annotation.NonNull
        public static final android.os.Parcelable.Creator<android.location.BeidouSatelliteEphemeris.BeidouSatelliteClockModel> CREATOR = null;
        public long getTimeOfClockSeconds() { return 0L; }
        public double getAf0() { return 0.0; }
        public double getAf1() { return 0.0; }
        public double getAf2() { return 0.0; }
        public double getTgd1() { return 0.0; }
        public double getTgd2() { return 0.0; }
        public int getAodc() { return 0; }
        public int describeContents() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        @android.annotation.NonNull
        public java.lang.String toString() { return null; }

        public static final class Builder {
            public Builder() {}
            @android.annotation.NonNull
            public android.location.BeidouSatelliteEphemeris.BeidouSatelliteClockModel.Builder setTimeOfClockSeconds(long p0) { return null; }
            @android.annotation.NonNull
            public android.location.BeidouSatelliteEphemeris.BeidouSatelliteClockModel.Builder setAf0(double p0) { return null; }
            @android.annotation.NonNull
            public android.location.BeidouSatelliteEphemeris.BeidouSatelliteClockModel.Builder setAf1(double p0) { return null; }
            @android.annotation.NonNull
            public android.location.BeidouSatelliteEphemeris.BeidouSatelliteClockModel.Builder setAf2(double p0) { return null; }
            @android.annotation.NonNull
            public android.location.BeidouSatelliteEphemeris.BeidouSatelliteClockModel.Builder setTgd1(double p0) { return null; }
            @android.annotation.NonNull
            public android.location.BeidouSatelliteEphemeris.BeidouSatelliteClockModel.Builder setTgd2(double p0) { return null; }
            @android.annotation.NonNull
            public android.location.BeidouSatelliteEphemeris.BeidouSatelliteClockModel.Builder setAodc(int p0) { return null; }
            @android.annotation.NonNull
            public android.location.BeidouSatelliteEphemeris.BeidouSatelliteClockModel build() { return null; }
        }
    }

    public static final class BeidouSatelliteEphemerisTime implements android.os.Parcelable {
        @android.annotation.NonNull
        public static final android.os.Parcelable.Creator<android.location.BeidouSatelliteEphemeris.BeidouSatelliteEphemerisTime> CREATOR = null;
        public int getAode() { return 0; }
        public int getBeidouWeekNumber() { return 0; }
        public int getToeSeconds() { return 0; }
        public int describeContents() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public java.lang.String toString() { return null; }

        public static final class Builder {
            public Builder() {}
            @android.annotation.NonNull
            public android.location.BeidouSatelliteEphemeris.BeidouSatelliteEphemerisTime.Builder setAode(int p0) { return null; }
            @android.annotation.NonNull
            public android.location.BeidouSatelliteEphemeris.BeidouSatelliteEphemerisTime.Builder setBeidouWeekNumber(int p0) { return null; }
            @android.annotation.NonNull
            public android.location.BeidouSatelliteEphemeris.BeidouSatelliteEphemerisTime.Builder setToeSeconds(int p0) { return null; }
            @android.annotation.NonNull
            public android.location.BeidouSatelliteEphemeris.BeidouSatelliteEphemerisTime build() { return null; }
        }
    }

    public static final class BeidouSatelliteHealth implements android.os.Parcelable {
        @android.annotation.NonNull
        public static final android.os.Parcelable.Creator<android.location.BeidouSatelliteEphemeris.BeidouSatelliteHealth> CREATOR = null;
        public int getSatH1() { return 0; }
        public double getSvAccur() { return 0.0; }
        public int describeContents() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        @android.annotation.NonNull
        public java.lang.String toString() { return null; }

        public static final class Builder {
            public Builder() {}
            @android.annotation.NonNull
            public android.location.BeidouSatelliteEphemeris.BeidouSatelliteHealth.Builder setSatH1(int p0) { return null; }
            @android.annotation.NonNull
            public android.location.BeidouSatelliteEphemeris.BeidouSatelliteHealth.Builder setSvAccur(double p0) { return null; }
            @android.annotation.NonNull
            public android.location.BeidouSatelliteEphemeris.BeidouSatelliteHealth build() { return null; }
        }
    }

    public static final class Builder {
        public Builder() {}
        @android.annotation.NonNull
        public android.location.BeidouSatelliteEphemeris.Builder setSvid(int p0) { return null; }
        @android.annotation.NonNull
        public android.location.BeidouSatelliteEphemeris.Builder setSatelliteClockModel(android.location.BeidouSatelliteEphemeris.BeidouSatelliteClockModel p0) { return null; }
        @android.annotation.NonNull
        public android.location.BeidouSatelliteEphemeris.Builder setSatelliteOrbitModel(android.location.KeplerianOrbitModel p0) { return null; }
        @android.annotation.NonNull
        public android.location.BeidouSatelliteEphemeris.Builder setSatelliteHealth(android.location.BeidouSatelliteEphemeris.BeidouSatelliteHealth p0) { return null; }
        @android.annotation.NonNull
        public android.location.BeidouSatelliteEphemeris.Builder setSatelliteEphemerisTime(android.location.BeidouSatelliteEphemeris.BeidouSatelliteEphemerisTime p0) { return null; }
        @android.annotation.NonNull
        public android.location.BeidouSatelliteEphemeris build() { return null; }
    }
}
