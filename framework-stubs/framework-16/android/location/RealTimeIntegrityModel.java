package android.location;

@android.annotation.SystemApi
@android.annotation.FlaggedApi("android.location.flags.gnss_assistance_interface")
public final class RealTimeIntegrityModel implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.location.RealTimeIntegrityModel> CREATOR = null;
    public int getBadSvid() { return 0; }
    @android.annotation.NonNull
    public java.util.List<android.location.GnssSignalType> getBadSignalTypes() { return null; }
    public long getPublishDateSeconds() { return 0L; }
    public long getStartDateSeconds() { return 0L; }
    public long getEndDateSeconds() { return 0L; }
    @android.annotation.NonNull
    public java.lang.String getAdvisoryType() { return null; }
    @android.annotation.NonNull
    public java.lang.String getAdvisoryNumber() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    @android.annotation.NonNull
    public java.lang.String toString() { return null; }

    public static final class Builder {
        public Builder() {}
        @android.annotation.NonNull
        public android.location.RealTimeIntegrityModel.Builder setBadSvid(int p0) { return null; }
        @android.annotation.NonNull
        public android.location.RealTimeIntegrityModel.Builder setBadSignalTypes(java.util.List<android.location.GnssSignalType> p0) { return null; }
        @android.annotation.NonNull
        public android.location.RealTimeIntegrityModel.Builder setPublishDateSeconds(long p0) { return null; }
        @android.annotation.NonNull
        public android.location.RealTimeIntegrityModel.Builder setStartDateSeconds(long p0) { return null; }
        @android.annotation.NonNull
        public android.location.RealTimeIntegrityModel.Builder setEndDateSeconds(long p0) { return null; }
        @android.annotation.NonNull
        public android.location.RealTimeIntegrityModel.Builder setAdvisoryType(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        public android.location.RealTimeIntegrityModel.Builder setAdvisoryNumber(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        public android.location.RealTimeIntegrityModel build() { return null; }
    }
}
