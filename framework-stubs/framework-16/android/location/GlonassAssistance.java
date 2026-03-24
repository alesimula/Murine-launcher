package android.location;

@android.annotation.SystemApi
@android.annotation.FlaggedApi("android.location.flags.gnss_assistance_interface")
public final class GlonassAssistance implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.location.GlonassAssistance> CREATOR = null;
    @android.annotation.Nullable
    public android.location.GlonassAlmanac getAlmanac() { return null; }
    @android.annotation.Nullable
    public android.location.UtcModel getUtcModel() { return null; }
    @android.annotation.NonNull
    public java.util.List<android.location.TimeModel> getTimeModels() { return null; }
    @android.annotation.NonNull
    public java.util.List<android.location.GlonassSatelliteEphemeris> getSatelliteEphemeris() { return null; }
    @android.annotation.NonNull
    public java.util.List<android.location.GnssAssistance.GnssSatelliteCorrections> getSatelliteCorrections() { return null; }
    @android.annotation.NonNull
    public java.util.List<android.location.RealTimeIntegrityModel> getRealTimeIntegrityModels() { return null; }
    @android.annotation.NonNull
    public java.util.List<android.location.AuxiliaryInformation> getAuxiliaryInformation() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    @android.annotation.NonNull
    public java.lang.String toString() { return null; }

    public static final class Builder {
        public Builder() {}
        @android.annotation.NonNull
        public android.location.GlonassAssistance.Builder setAlmanac(android.location.GlonassAlmanac p0) { return null; }
        @android.annotation.NonNull
        public android.location.GlonassAssistance.Builder setUtcModel(android.location.UtcModel p0) { return null; }
        @android.annotation.NonNull
        public android.location.GlonassAssistance.Builder setAuxiliaryInformation(java.util.List<android.location.AuxiliaryInformation> p0) { return null; }
        @android.annotation.NonNull
        public android.location.GlonassAssistance.Builder setTimeModels(java.util.List<android.location.TimeModel> p0) { return null; }
        @android.annotation.NonNull
        public android.location.GlonassAssistance.Builder setSatelliteEphemeris(java.util.List<android.location.GlonassSatelliteEphemeris> p0) { return null; }
        @android.annotation.NonNull
        public android.location.GlonassAssistance.Builder setSatelliteCorrections(java.util.List<android.location.GnssAssistance.GnssSatelliteCorrections> p0) { return null; }
        @android.annotation.NonNull
        public android.location.GlonassAssistance.Builder setRealTimeIntegrityModels(java.util.List<android.location.RealTimeIntegrityModel> p0) { return null; }
        @android.annotation.NonNull
        public android.location.GlonassAssistance build() { return null; }
    }
}
