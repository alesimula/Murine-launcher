package android.telephony.satellite;

@android.annotation.SystemApi
@android.annotation.FlaggedApi("com.android.internal.telephony.flags.satellite_system_apis")
public final class SystemSelectionSpecifier implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.telephony.satellite.SystemSelectionSpecifier> CREATOR = null;
    public SystemSelectionSpecifier(java.lang.String p0, android.util.IntArray p1, android.util.IntArray p2, android.telephony.satellite.SatelliteInfo[] p3, android.util.IntArray p4) {}
    public SystemSelectionSpecifier(android.telephony.satellite.SystemSelectionSpecifier.Builder p0) {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    @android.annotation.NonNull
    public java.lang.String toString() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    @android.annotation.NonNull
    public java.lang.String getMccMnc() { return null; }
    @android.annotation.NonNull
    public int[] getBands() { return null; }
    @android.annotation.NonNull
    public int[] getEarfcns() { return null; }
    @android.annotation.NonNull
    public java.util.List<android.telephony.satellite.SatelliteInfo> getSatelliteInfos() { return null; }
    @android.annotation.NonNull
    public int[] getTagIds() { return null; }

    public static final class Builder {
        public Builder() {}
        @android.annotation.NonNull
        public android.telephony.satellite.SystemSelectionSpecifier.Builder setMccMnc(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        public android.telephony.satellite.SystemSelectionSpecifier.Builder setBands(int[] p0) { return null; }
        @android.annotation.NonNull
        public android.telephony.satellite.SystemSelectionSpecifier.Builder setEarfcns(int[] p0) { return null; }
        @android.annotation.NonNull
        public android.telephony.satellite.SystemSelectionSpecifier.Builder setSatelliteInfos(java.util.List<android.telephony.satellite.SatelliteInfo> p0) { return null; }
        @android.annotation.NonNull
        public android.telephony.satellite.SystemSelectionSpecifier.Builder setTagIds(int[] p0) { return null; }
        @android.annotation.NonNull
        public android.telephony.satellite.SystemSelectionSpecifier build() { return null; }
    }
}
