package android.app.time;

@android.annotation.SystemApi
public final class TimeZoneConfiguration implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.app.time.TimeZoneConfiguration> CREATOR = null;
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public boolean isComplete() { return false; }
    public boolean isAutoDetectionEnabled() { return false; }
    public boolean hasIsAutoDetectionEnabled() { return false; }
    public boolean isGeoDetectionEnabled() { return false; }
    public boolean hasIsGeoDetectionEnabled() { return false; }
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }

    @android.annotation.SystemApi
    public static final class Builder {
        public Builder() {}
        public Builder(android.app.time.TimeZoneConfiguration p0) {}
        public android.app.time.TimeZoneConfiguration.Builder mergeProperties(android.app.time.TimeZoneConfiguration p0) { return null; }
        android.app.time.TimeZoneConfiguration.Builder setPropertyBundleInternal(android.os.Bundle p0) { return null; }
        public android.app.time.TimeZoneConfiguration.Builder setAutoDetectionEnabled(boolean p0) { return null; }
        public android.app.time.TimeZoneConfiguration.Builder setGeoDetectionEnabled(boolean p0) { return null; }
        public android.app.time.TimeZoneConfiguration build() { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    static @interface Setting {
    }
}
