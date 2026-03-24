package android.service.timezone;

@android.annotation.SystemApi
public final class TimeZoneProviderSuggestion implements android.os.Parcelable {
    private final java.util.List<java.lang.String> mTimeZoneIds = null;
    private final long mElapsedRealtimeMillis = 0L;
    public static final android.os.Parcelable.Creator<android.service.timezone.TimeZoneProviderSuggestion> CREATOR = null;
    private TimeZoneProviderSuggestion(java.util.List<java.lang.String> p0, long p1) {}
    public long getElapsedRealtimeMillis() { return 0L; }
    public java.util.List<java.lang.String> getTimeZoneIds() { return null; }
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    private static java.util.List<java.lang.String> immutableList(java.util.List<java.lang.String> p0) { return null; }

    public static final class Builder {
        private java.util.List<java.lang.String> mTimeZoneIds;
        private long mElapsedRealtimeMillis;
        public Builder() {}
        public android.service.timezone.TimeZoneProviderSuggestion.Builder setTimeZoneIds(java.util.List<java.lang.String> p0) { return null; }
        public android.service.timezone.TimeZoneProviderSuggestion.Builder setElapsedRealtimeMillis(long p0) { return null; }
        public android.service.timezone.TimeZoneProviderSuggestion build() { return null; }
    }
}
