package android.location;

@android.annotation.SystemApi
@android.annotation.FlaggedApi("android.location.flags.gnss_assistance_interface")
public final class GlonassAlmanac implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.location.GlonassAlmanac> CREATOR = null;
    public GlonassAlmanac(long p0, java.util.List<android.location.GlonassAlmanac.GlonassSatelliteAlmanac> p1) {}
    public long getIssueDateMillis() { return 0L; }
    @android.annotation.NonNull
    public java.util.List<android.location.GlonassAlmanac.GlonassSatelliteAlmanac> getSatelliteAlmanacs() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    @android.annotation.NonNull
    public java.lang.String toString() { return null; }

    public static final class GlonassSatelliteAlmanac implements android.os.Parcelable {
        @android.annotation.NonNull
        public static final android.os.Parcelable.Creator<android.location.GlonassAlmanac.GlonassSatelliteAlmanac> CREATOR = null;
        public int getSlotNumber() { return 0; }
        public int getHealthState() { return 0; }
        public int getFrequencyChannelNumber() { return 0; }
        public int getCalendarDayNumber() { return 0; }
        public boolean isGlonassM() { return false; }
        public double getTau() { return 0.0; }
        public double getTLambda() { return 0.0; }
        public double getLambda() { return 0.0; }
        public double getDeltaI() { return 0.0; }
        public double getDeltaT() { return 0.0; }
        public double getDeltaTDot() { return 0.0; }
        public double getEccentricity() { return 0.0; }
        public double getOmega() { return 0.0; }
        public int describeContents() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        @android.annotation.NonNull
        public java.lang.String toString() { return null; }

        public static final class Builder {
            public Builder() {}
            @android.annotation.NonNull
            public android.location.GlonassAlmanac.GlonassSatelliteAlmanac.Builder setSlotNumber(int p0) { return null; }
            @android.annotation.NonNull
            public android.location.GlonassAlmanac.GlonassSatelliteAlmanac.Builder setHealthState(int p0) { return null; }
            @android.annotation.NonNull
            public android.location.GlonassAlmanac.GlonassSatelliteAlmanac.Builder setFrequencyChannelNumber(int p0) { return null; }
            @android.annotation.NonNull
            public android.location.GlonassAlmanac.GlonassSatelliteAlmanac.Builder setCalendarDayNumber(int p0) { return null; }
            @android.annotation.NonNull
            public android.location.GlonassAlmanac.GlonassSatelliteAlmanac.Builder setGlonassM(boolean p0) { return null; }
            @android.annotation.NonNull
            public android.location.GlonassAlmanac.GlonassSatelliteAlmanac.Builder setTau(double p0) { return null; }
            @android.annotation.NonNull
            public android.location.GlonassAlmanac.GlonassSatelliteAlmanac.Builder setTLambda(double p0) { return null; }
            @android.annotation.NonNull
            public android.location.GlonassAlmanac.GlonassSatelliteAlmanac.Builder setLambda(double p0) { return null; }
            @android.annotation.NonNull
            public android.location.GlonassAlmanac.GlonassSatelliteAlmanac.Builder setDeltaI(double p0) { return null; }
            @android.annotation.NonNull
            public android.location.GlonassAlmanac.GlonassSatelliteAlmanac.Builder setDeltaT(double p0) { return null; }
            @android.annotation.NonNull
            public android.location.GlonassAlmanac.GlonassSatelliteAlmanac.Builder setDeltaTDot(double p0) { return null; }
            @android.annotation.NonNull
            public android.location.GlonassAlmanac.GlonassSatelliteAlmanac.Builder setEccentricity(double p0) { return null; }
            @android.annotation.NonNull
            public android.location.GlonassAlmanac.GlonassSatelliteAlmanac.Builder setOmega(double p0) { return null; }
            @android.annotation.NonNull
            public android.location.GlonassAlmanac.GlonassSatelliteAlmanac build() { return null; }
        }
    }
}
