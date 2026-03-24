package android.location;

@android.annotation.SystemApi
@android.annotation.FlaggedApi("android.location.flags.gnss_assistance_interface")
public final class BeidouAssistance implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.location.BeidouAssistance> CREATOR = null;
    @android.annotation.Nullable
    public android.location.GnssAlmanac getAlmanac() { return null; }
    @android.annotation.Nullable
    public android.location.KlobucharIonosphericModel getIonosphericModel() { return null; }
    @android.annotation.Nullable
    public android.location.UtcModel getUtcModel() { return null; }
    @android.annotation.Nullable
    public android.location.LeapSecondsModel getLeapSecondsModel() { return null; }
    @android.annotation.NonNull
    public java.util.List<android.location.AuxiliaryInformation> getAuxiliaryInformation() { return null; }
    @android.annotation.NonNull
    public java.util.List<android.location.TimeModel> getTimeModels() { return null; }
    @android.annotation.NonNull
    public java.util.List<android.location.BeidouSatelliteEphemeris> getSatelliteEphemeris() { return null; }
    @android.annotation.NonNull
    public java.util.List<android.location.RealTimeIntegrityModel> getRealTimeIntegrityModels() { return null; }
    @android.annotation.NonNull
    public java.util.List<android.location.GnssAssistance.GnssSatelliteCorrections> getSatelliteCorrections() { return null; }
    public int describeContents() { return 0; }
    @android.annotation.NonNull
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        public Builder() {}
        @android.annotation.NonNull
        public android.location.BeidouAssistance.Builder setAlmanac(android.location.GnssAlmanac p0) { return null; }
        @android.annotation.NonNull
        public android.location.BeidouAssistance.Builder setIonosphericModel(android.location.KlobucharIonosphericModel p0) { return null; }
        @android.annotation.NonNull
        public android.location.BeidouAssistance.Builder setUtcModel(android.location.UtcModel p0) { return null; }
        @android.annotation.NonNull
        public android.location.BeidouAssistance.Builder setLeapSecondsModel(android.location.LeapSecondsModel p0) { return null; }
        @android.annotation.NonNull
        public android.location.BeidouAssistance.Builder setAuxiliaryInformation(java.util.List<android.location.AuxiliaryInformation> p0) { return null; }
        @android.annotation.NonNull
        public android.location.BeidouAssistance.Builder setTimeModels(java.util.List<android.location.TimeModel> p0) { return null; }
        @android.annotation.NonNull
        public android.location.BeidouAssistance.Builder setSatelliteEphemeris(java.util.List<android.location.BeidouSatelliteEphemeris> p0) { return null; }
        @android.annotation.NonNull
        public android.location.BeidouAssistance.Builder setRealTimeIntegrityModels(java.util.List<android.location.RealTimeIntegrityModel> p0) { return null; }
        @android.annotation.NonNull
        public android.location.BeidouAssistance.Builder setSatelliteCorrections(java.util.List<android.location.GnssAssistance.GnssSatelliteCorrections> p0) { return null; }
        @android.annotation.NonNull
        public android.location.BeidouAssistance build() { return null; }
    }
}
