package android.app.time;

public final class TimeConfiguration implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.app.time.TimeConfiguration> CREATOR = null;
    public boolean isAutoDetectionEnabled() { return false; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }

    public static final class Builder {
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
