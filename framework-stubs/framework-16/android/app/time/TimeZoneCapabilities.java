package android.app.time;

@android.annotation.SystemApi
public final class TimeZoneCapabilities implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.app.time.TimeZoneCapabilities> CREATOR = null;
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int getConfigureAutoDetectionEnabledCapability() { return 0; }
    public boolean isUseLocationEnabled() { return false; }
    public int getConfigureGeoDetectionEnabledCapability() { return 0; }
    public int getSetManualTimeZoneCapability() { return 0; }
    public int getConfigureNotificationsEnabledCapability() { return 0; }
    @android.annotation.Nullable
    public android.app.time.TimeZoneConfiguration tryApplyConfigChanges(android.app.time.TimeZoneConfiguration p0, android.app.time.TimeZoneConfiguration p1) { return null; }
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }

    public static class Builder {
        public Builder(android.os.UserHandle p0) {}
        public Builder(android.app.time.TimeZoneCapabilities p0) {}
        public android.app.time.TimeZoneCapabilities.Builder setConfigureAutoDetectionEnabledCapability(int p0) { return null; }
        public android.app.time.TimeZoneCapabilities.Builder setUseLocationEnabled(boolean p0) { return null; }
        public android.app.time.TimeZoneCapabilities.Builder setConfigureGeoDetectionEnabledCapability(int p0) { return null; }
        public android.app.time.TimeZoneCapabilities.Builder setSetManualTimeZoneCapability(int p0) { return null; }
        public android.app.time.TimeZoneCapabilities.Builder setConfigureNotificationsEnabledCapability(int p0) { return null; }
        @android.annotation.NonNull
        public android.app.time.TimeZoneCapabilities build() { return null; }
    }
}
