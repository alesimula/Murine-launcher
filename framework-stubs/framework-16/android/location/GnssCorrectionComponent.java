package android.location;

@android.annotation.SystemApi
@android.annotation.FlaggedApi("android.location.flags.gnss_assistance_interface")
public final class GnssCorrectionComponent implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.location.GnssCorrectionComponent> CREATOR = null;
    public GnssCorrectionComponent(java.lang.String p0, android.location.GnssCorrectionComponent.GnssInterval p1, android.location.GnssCorrectionComponent.PseudorangeCorrection p2) {}
    @android.annotation.NonNull
    public java.lang.String getSourceKey() { return null; }
    @android.annotation.NonNull
    public android.location.GnssCorrectionComponent.GnssInterval getValidityInterval() { return null; }
    @android.annotation.NonNull
    public android.location.GnssCorrectionComponent.PseudorangeCorrection getPseudorangeCorrection() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class GnssInterval implements android.os.Parcelable {
        @android.annotation.NonNull
        public static final android.os.Parcelable.Creator<android.location.GnssCorrectionComponent.GnssInterval> CREATOR = null;
        public GnssInterval(long p0, long p1) {}
        public long getStartMillisSinceGpsEpoch() { return 0L; }
        public long getEndMillisSinceGpsEpoch() { return 0L; }
        public int describeContents() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        @android.annotation.NonNull
        public java.lang.String toString() { return null; }
    }

    public static final class PseudorangeCorrection implements android.os.Parcelable {
        @android.annotation.NonNull
        public static final android.os.Parcelable.Creator<android.location.GnssCorrectionComponent.PseudorangeCorrection> CREATOR = null;
        public PseudorangeCorrection(double p0, double p1, double p2) {}
        public double getCorrectionMeters() { return 0.0; }
        public double getCorrectionUncertaintyMeters() { return 0.0; }
        public double getCorrectionRateMetersPerSecond() { return 0.0; }
        public int describeContents() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        @android.annotation.NonNull
        public java.lang.String toString() { return null; }
    }
}
