package android.app.time;

@android.annotation.SystemApi
public final class TimeZoneCapabilities implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.app.time.TimeZoneCapabilities> CREATOR = null;
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int getConfigureAutoDetectionEnabledCapability() { return 0; }
    public int getConfigureGeoDetectionEnabledCapability() { return 0; }
    public int getSuggestManualTimeZoneCapability() { return 0; }
    public android.app.time.TimeZoneConfiguration tryApplyConfigChanges(android.app.time.TimeZoneConfiguration p0, android.app.time.TimeZoneConfiguration p1) { return null; }
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }

    public static class Builder {
        public Builder(android.os.UserHandle p0) {}
        public Builder(android.app.time.TimeZoneCapabilities p0) {}
        public android.app.time.TimeZoneCapabilities.Builder setConfigureAutoDetectionEnabledCapability(int p0) { return null; }
        public android.app.time.TimeZoneCapabilities.Builder setConfigureGeoDetectionEnabledCapability(int p0) { return null; }
        public android.app.time.TimeZoneCapabilities.Builder setSuggestManualTimeZoneCapability(int p0) { return null; }
        public android.app.time.TimeZoneCapabilities build() { return null; }
    }
}
