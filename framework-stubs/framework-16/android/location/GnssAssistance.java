package android.location;

@android.annotation.SystemApi
@android.annotation.FlaggedApi("android.location.flags.gnss_assistance_interface")
public final class GnssAssistance implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.location.GnssAssistance> CREATOR = null;
    @android.annotation.Nullable
    public android.location.GpsAssistance getGpsAssistance() { return null; }
    @android.annotation.Nullable
    public android.location.GlonassAssistance getGlonassAssistance() { return null; }
    @android.annotation.Nullable
    public android.location.GalileoAssistance getGalileoAssistance() { return null; }
    @android.annotation.Nullable
    public android.location.BeidouAssistance getBeidouAssistance() { return null; }
    @android.annotation.Nullable
    public android.location.QzssAssistance getQzssAssistance() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    @android.annotation.NonNull
    public java.lang.String toString() { return null; }

    public static final class Builder {
        public Builder() {}
        @android.annotation.NonNull
        public android.location.GnssAssistance.Builder setGpsAssistance(android.location.GpsAssistance p0) { return null; }
        @android.annotation.NonNull
        public android.location.GnssAssistance.Builder setGlonassAssistance(android.location.GlonassAssistance p0) { return null; }
        @android.annotation.NonNull
        public android.location.GnssAssistance.Builder setGalileoAssistance(android.location.GalileoAssistance p0) { return null; }
        @android.annotation.NonNull
        public android.location.GnssAssistance.Builder setBeidouAssistance(android.location.BeidouAssistance p0) { return null; }
        @android.annotation.NonNull
        public android.location.GnssAssistance.Builder setQzssAssistance(android.location.QzssAssistance p0) { return null; }
        @android.annotation.NonNull
        public android.location.GnssAssistance build() { return null; }
    }

    public static final class GnssSatelliteCorrections implements android.os.Parcelable {
        int mSvid;
        @android.annotation.NonNull
        java.util.List<android.location.IonosphericCorrection> mIonosphericCorrections;
        @android.annotation.NonNull
        public static final android.os.Parcelable.Creator<android.location.GnssAssistance.GnssSatelliteCorrections> CREATOR = null;
        public GnssSatelliteCorrections(int p0, java.util.List<android.location.IonosphericCorrection> p1) {}
        public int getSvid() { return 0; }
        @android.annotation.NonNull
        public java.util.List<android.location.IonosphericCorrection> getIonosphericCorrections() { return null; }
        public int describeContents() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        @android.annotation.NonNull
        public java.lang.String toString() { return null; }
    }
}
