package android.location;

@android.annotation.SystemApi
@android.annotation.FlaggedApi("android.location.flags.gnss_assistance_interface")
public final class GlonassSatelliteEphemeris implements android.os.Parcelable {
    public static final int HEALTH_STATUS_HEALTHY = 0;
    public static final int HEALTH_STATUS_UNHEALTHY = 1;
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.location.GlonassSatelliteEphemeris> CREATOR = null;
    public int getSlotNumber() { return 0; }
    public int getHealthState() { return 0; }
    public double getFrameTimeSeconds() { return 0.0; }
    public int getAgeInDays() { return 0; }
    public int getUpdateIntervalMinutes() { return 0; }
    public boolean isUpdateIntervalOdd() { return false; }
    public boolean isGlonassM() { return false; }
    @android.annotation.NonNull
    public android.location.GlonassSatelliteEphemeris.GlonassSatelliteClockModel getSatelliteClockModel() { return null; }
    @android.annotation.NonNull
    public android.location.GlonassSatelliteEphemeris.GlonassSatelliteOrbitModel getSatelliteOrbitModel() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    @android.annotation.NonNull
    public java.lang.String toString() { return null; }

    public static final class Builder {
        public Builder() {}
        @android.annotation.NonNull
        public android.location.GlonassSatelliteEphemeris.Builder setSlotNumber(int p0) { return null; }
        @android.annotation.NonNull
        public android.location.GlonassSatelliteEphemeris.Builder setHealthState(int p0) { return null; }
        @android.annotation.NonNull
        public android.location.GlonassSatelliteEphemeris.Builder setFrameTimeSeconds(double p0) { return null; }
        @android.annotation.NonNull
        public android.location.GlonassSatelliteEphemeris.Builder setAgeInDays(int p0) { return null; }
        @android.annotation.NonNull
        public android.location.GlonassSatelliteEphemeris.Builder setSatelliteClockModel(android.location.GlonassSatelliteEphemeris.GlonassSatelliteClockModel p0) { return null; }
        @android.annotation.NonNull
        public android.location.GlonassSatelliteEphemeris.Builder setSatelliteOrbitModel(android.location.GlonassSatelliteEphemeris.GlonassSatelliteOrbitModel p0) { return null; }
        @android.annotation.NonNull
        public android.location.GlonassSatelliteEphemeris.Builder setUpdateIntervalMinutes(int p0) { return null; }
        @android.annotation.NonNull
        public android.location.GlonassSatelliteEphemeris.Builder setUpdateIntervalOdd(boolean p0) { return null; }
        @android.annotation.NonNull
        public android.location.GlonassSatelliteEphemeris.Builder setGlonassM(boolean p0) { return null; }
        @android.annotation.NonNull
        public android.location.GlonassSatelliteEphemeris build() { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface GlonassHealthStatus {
    }

    public static final class GlonassSatelliteClockModel implements android.os.Parcelable {
        @android.annotation.NonNull
        public static final android.os.Parcelable.Creator<android.location.GlonassSatelliteEphemeris.GlonassSatelliteClockModel> CREATOR = null;
        public long getTimeOfClockSeconds() { return 0L; }
        public double getClockBias() { return 0.0; }
        public double getFrequencyBias() { return 0.0; }
        public int getFrequencyChannelNumber() { return 0; }
        public double getGroupDelayDiffSeconds() { return 0.0; }
        public boolean isGroupDelayDiffSecondsAvailable() { return false; }
        public int describeContents() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        @android.annotation.NonNull
        public java.lang.String toString() { return null; }

        public static final class Builder {
            public Builder() {}
            @android.annotation.NonNull
            public android.location.GlonassSatelliteEphemeris.GlonassSatelliteClockModel.Builder setTimeOfClockSeconds(long p0) { return null; }
            @android.annotation.NonNull
            public android.location.GlonassSatelliteEphemeris.GlonassSatelliteClockModel.Builder setClockBias(double p0) { return null; }
            @android.annotation.NonNull
            public android.location.GlonassSatelliteEphemeris.GlonassSatelliteClockModel.Builder setFrequencyBias(double p0) { return null; }
            @android.annotation.NonNull
            public android.location.GlonassSatelliteEphemeris.GlonassSatelliteClockModel.Builder setFrequencyChannelNumber(int p0) { return null; }
            @android.annotation.NonNull
            public android.location.GlonassSatelliteEphemeris.GlonassSatelliteClockModel.Builder setGroupDelayDiffSeconds(double p0) { return null; }
            @android.annotation.NonNull
            public android.location.GlonassSatelliteEphemeris.GlonassSatelliteClockModel.Builder setGroupDelayDiffSecondsAvailable(boolean p0) { return null; }
            @android.annotation.NonNull
            public android.location.GlonassSatelliteEphemeris.GlonassSatelliteClockModel build() { return null; }
        }
    }

    public static final class GlonassSatelliteOrbitModel implements android.os.Parcelable {
        @android.annotation.NonNull
        public static final android.os.Parcelable.Creator<android.location.GlonassSatelliteEphemeris.GlonassSatelliteOrbitModel> CREATOR = null;
        public double getX() { return 0.0; }
        public double getXDot() { return 0.0; }
        public double getXAccel() { return 0.0; }
        public double getY() { return 0.0; }
        public double getYDot() { return 0.0; }
        public double getYAccel() { return 0.0; }
        public double getZ() { return 0.0; }
        public double getZDot() { return 0.0; }
        public double getZAccel() { return 0.0; }
        public int describeContents() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        @android.annotation.NonNull
        public java.lang.String toString() { return null; }

        public static final class Builder {
            public Builder() {}
            @android.annotation.NonNull
            public android.location.GlonassSatelliteEphemeris.GlonassSatelliteOrbitModel.Builder setX(double p0) { return null; }
            @android.annotation.NonNull
            public android.location.GlonassSatelliteEphemeris.GlonassSatelliteOrbitModel.Builder setXDot(double p0) { return null; }
            @android.annotation.NonNull
            public android.location.GlonassSatelliteEphemeris.GlonassSatelliteOrbitModel.Builder setXAccel(double p0) { return null; }
            @android.annotation.NonNull
            public android.location.GlonassSatelliteEphemeris.GlonassSatelliteOrbitModel.Builder setY(double p0) { return null; }
            @android.annotation.NonNull
            public android.location.GlonassSatelliteEphemeris.GlonassSatelliteOrbitModel.Builder setYDot(double p0) { return null; }
            @android.annotation.NonNull
            public android.location.GlonassSatelliteEphemeris.GlonassSatelliteOrbitModel.Builder setYAccel(double p0) { return null; }
            @android.annotation.NonNull
            public android.location.GlonassSatelliteEphemeris.GlonassSatelliteOrbitModel.Builder setZ(double p0) { return null; }
            @android.annotation.NonNull
            public android.location.GlonassSatelliteEphemeris.GlonassSatelliteOrbitModel.Builder setZDot(double p0) { return null; }
            @android.annotation.NonNull
            public android.location.GlonassSatelliteEphemeris.GlonassSatelliteOrbitModel.Builder setZAccel(double p0) { return null; }
            @android.annotation.NonNull
            public android.location.GlonassSatelliteEphemeris.GlonassSatelliteOrbitModel build() { return null; }
        }
    }
}
