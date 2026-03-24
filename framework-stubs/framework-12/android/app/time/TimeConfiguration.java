package android.app.time;

public final class TimeConfiguration implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.app.time.TimeConfiguration> CREATOR = null;
    private static final java.lang.String SETTING_AUTO_DETECTION_ENABLED = "autoDetectionEnabled";
    private final android.os.Bundle mBundle = null;
    private TimeConfiguration(android.app.time.TimeConfiguration.Builder p0) {}
    public boolean isAutoDetectionEnabled() { return false; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    private static android.app.time.TimeConfiguration readFromParcel(android.os.Parcel p0) { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }

    public static final class Builder {
        private final android.os.Bundle mBundle = null;
        public Builder() {}
        public Builder(android.app.time.TimeConfiguration p0) {}
        public android.app.time.TimeConfiguration.Builder setAutoDetectionEnabled(boolean p0) { return null; }
        android.app.time.TimeConfiguration.Builder merge(android.os.Bundle p0) { return null; }
        public android.app.time.TimeConfiguration build() { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    static @interface Setting {
    }
}
