package android.location;

@android.annotation.SystemApi
@android.annotation.FlaggedApi("android.location.flags.gnss_assistance_interface")
public final class GnssAlmanac implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.location.GnssAlmanac> CREATOR = null;
    public long getIssueDateMillis() { return 0L; }
    public int getIoda() { return 0; }
    public int getWeekNumber() { return 0; }
    public int getToaSeconds() { return 0; }
    public boolean isCompleteAlmanacProvided() { return false; }
    @android.annotation.NonNull
    public java.util.List<android.location.GnssAlmanac.GnssSatelliteAlmanac> getGnssSatelliteAlmanacs() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public java.lang.String toString() { return null; }

    public static final class Builder {
        public Builder() {}
        @android.annotation.NonNull
        public android.location.GnssAlmanac.Builder setIssueDateMillis(long p0) { return null; }
        @android.annotation.NonNull
        public android.location.GnssAlmanac.Builder setIoda(int p0) { return null; }
        @android.annotation.NonNull
        public android.location.GnssAlmanac.Builder setWeekNumber(int p0) { return null; }
        @android.annotation.NonNull
        public android.location.GnssAlmanac.Builder setToaSeconds(int p0) { return null; }
        @android.annotation.NonNull
        public android.location.GnssAlmanac.Builder setCompleteAlmanacProvided(boolean p0) { return null; }
        @android.annotation.NonNull
        public android.location.GnssAlmanac.Builder setGnssSatelliteAlmanacs(java.util.List<android.location.GnssAlmanac.GnssSatelliteAlmanac> p0) { return null; }
        @android.annotation.NonNull
        public android.location.GnssAlmanac build() { return null; }
    }

    public static final class GnssSatelliteAlmanac implements android.os.Parcelable {
        @android.annotation.NonNull
        public static final android.os.Parcelable.Creator<android.location.GnssAlmanac.GnssSatelliteAlmanac> CREATOR = null;
        public int getSvid() { return 0; }
        public int getSvHealth() { return 0; }
        public double getEccentricity() { return 0.0; }
        public double getInclination() { return 0.0; }
        public double getOmega() { return 0.0; }
        public double getOmega0() { return 0.0; }
        public double getOmegaDot() { return 0.0; }
        public double getRootA() { return 0.0; }
        public double getM0() { return 0.0; }
        public double getAf0() { return 0.0; }
        public double getAf1() { return 0.0; }
        public int describeContents() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        @android.annotation.NonNull
        public java.lang.String toString() { return null; }

        public static final class Builder {
            public Builder() {}
            @android.annotation.NonNull
            public android.location.GnssAlmanac.GnssSatelliteAlmanac.Builder setSvid(int p0) { return null; }
            @android.annotation.NonNull
            public android.location.GnssAlmanac.GnssSatelliteAlmanac.Builder setSvHealth(int p0) { return null; }
            @android.annotation.NonNull
            public android.location.GnssAlmanac.GnssSatelliteAlmanac.Builder setEccentricity(double p0) { return null; }
            @android.annotation.NonNull
            public android.location.GnssAlmanac.GnssSatelliteAlmanac.Builder setInclination(double p0) { return null; }
            @android.annotation.NonNull
            public android.location.GnssAlmanac.GnssSatelliteAlmanac.Builder setOmega(double p0) { return null; }
            @android.annotation.NonNull
            public android.location.GnssAlmanac.GnssSatelliteAlmanac.Builder setOmega0(double p0) { return null; }
            @android.annotation.NonNull
            public android.location.GnssAlmanac.GnssSatelliteAlmanac.Builder setOmegaDot(double p0) { return null; }
            @android.annotation.NonNull
            public android.location.GnssAlmanac.GnssSatelliteAlmanac.Builder setRootA(double p0) { return null; }
            @android.annotation.NonNull
            public android.location.GnssAlmanac.GnssSatelliteAlmanac.Builder setM0(double p0) { return null; }
            @android.annotation.NonNull
            public android.location.GnssAlmanac.GnssSatelliteAlmanac.Builder setAf0(double p0) { return null; }
            @android.annotation.NonNull
            public android.location.GnssAlmanac.GnssSatelliteAlmanac.Builder setAf1(double p0) { return null; }
            @android.annotation.NonNull
            public android.location.GnssAlmanac.GnssSatelliteAlmanac build() { return null; }
        }
    }
}
