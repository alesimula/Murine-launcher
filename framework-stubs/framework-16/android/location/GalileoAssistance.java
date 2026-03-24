package android.location;

@android.annotation.SystemApi
@android.annotation.FlaggedApi("android.location.flags.gnss_assistance_interface")
public final class GalileoAssistance implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.location.GalileoAssistance> CREATOR = null;
    @android.annotation.Nullable
    public android.location.GnssAlmanac getAlmanac() { return null; }
    @android.annotation.Nullable
    public android.location.GalileoIonosphericModel getIonosphericModel() { return null; }
    @android.annotation.Nullable
    public android.location.UtcModel getUtcModel() { return null; }
    @android.annotation.Nullable
    public android.location.LeapSecondsModel getLeapSecondsModel() { return null; }
    @android.annotation.NonNull
    public java.util.List<android.location.AuxiliaryInformation> getAuxiliaryInformation() { return null; }
    @android.annotation.NonNull
    public java.util.List<android.location.TimeModel> getTimeModels() { return null; }
    @android.annotation.NonNull
    public java.util.List<android.location.GalileoSatelliteEphemeris> getSatelliteEphemeris() { return null; }
    @android.annotation.NonNull
    public java.util.List<android.location.RealTimeIntegrityModel> getRealTimeIntegrityModels() { return null; }
    @android.annotation.NonNull
    public java.util.List<android.location.GnssAssistance.GnssSatelliteCorrections> getSatelliteCorrections() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    @android.annotation.NonNull
    public java.lang.String toString() { return null; }

    public static final class Builder {
        public Builder() {}
        @android.annotation.NonNull
        public android.location.GalileoAssistance.Builder setAlmanac(android.location.GnssAlmanac p0) { return null; }
        @android.annotation.NonNull
        public android.location.GalileoAssistance.Builder setIonosphericModel(android.location.GalileoIonosphericModel p0) { return null; }
        @android.annotation.NonNull
        public android.location.GalileoAssistance.Builder setUtcModel(android.location.UtcModel p0) { return null; }
        @android.annotation.NonNull
        public android.location.GalileoAssistance.Builder setLeapSecondsModel(android.location.LeapSecondsModel p0) { return null; }
        @android.annotation.NonNull
        public android.location.GalileoAssistance.Builder setAuxiliaryInformation(java.util.List<android.location.AuxiliaryInformation> p0) { return null; }
        @android.annotation.NonNull
        public android.location.GalileoAssistance.Builder setTimeModels(java.util.List<android.location.TimeModel> p0) { return null; }
        @android.annotation.NonNull
        public android.location.GalileoAssistance.Builder setSatelliteEphemeris(java.util.List<android.location.GalileoSatelliteEphemeris> p0) { return null; }
        @android.annotation.NonNull
        public android.location.GalileoAssistance.Builder setRealTimeIntegrityModels(java.util.List<android.location.RealTimeIntegrityModel> p0) { return null; }
        @android.annotation.NonNull
        public android.location.GalileoAssistance.Builder setSatelliteCorrections(java.util.List<android.location.GnssAssistance.GnssSatelliteCorrections> p0) { return null; }
        @android.annotation.NonNull
        public android.location.GalileoAssistance build() { return null; }
    }
}
