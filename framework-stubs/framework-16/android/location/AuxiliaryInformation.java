package android.location;

@android.annotation.SystemApi
@android.annotation.FlaggedApi("android.location.flags.gnss_assistance_interface")
public final class AuxiliaryInformation implements android.os.Parcelable {
    public static final int BDS_B1C_ORBIT_TYPE_UNDEFINED = 0;
    public static final int BDS_B1C_ORBIT_TYPE_GEO = 1;
    public static final int BDS_B1C_ORBIT_TYPE_IGSO = 2;
    public static final int BDS_B1C_ORBIT_TYPE_MEO = 3;
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.location.AuxiliaryInformation> CREATOR = null;
    public int getSvid() { return 0; }
    @android.annotation.NonNull
    public java.util.List<android.location.GnssSignalType> getAvailableSignalTypes() { return null; }
    public int getFrequencyChannelNumber() { return 0; }
    public int getSatType() { return 0; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    @android.annotation.NonNull
    public java.lang.String toString() { return null; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface BeidouB1CSatelliteOrbitType {
    }

    public static final class Builder {
        public Builder() {}
        @android.annotation.NonNull
        public android.location.AuxiliaryInformation.Builder setSvid(int p0) { return null; }
        @android.annotation.NonNull
        public android.location.AuxiliaryInformation.Builder setAvailableSignalTypes(java.util.List<android.location.GnssSignalType> p0) { return null; }
        @android.annotation.NonNull
        public android.location.AuxiliaryInformation.Builder setFrequencyChannelNumber(int p0) { return null; }
        @android.annotation.NonNull
        public android.location.AuxiliaryInformation.Builder setSatType(int p0) { return null; }
        @android.annotation.NonNull
        public android.location.AuxiliaryInformation build() { return null; }
    }
}
