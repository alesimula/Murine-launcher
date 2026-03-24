package android.service.timezone;

@android.annotation.SystemApi
public final class TimeZoneProviderSuggestion implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.service.timezone.TimeZoneProviderSuggestion> CREATOR = null;
    public long getElapsedRealtimeMillis() { return 0L; }
    @android.annotation.NonNull
    public java.util.List<java.lang.String> getTimeZoneIds() { return null; }
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public boolean isEquivalentTo(android.service.timezone.TimeZoneProviderSuggestion p0) { return false; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }

    public static final class Builder {
        public Builder() {}
        @android.annotation.NonNull
        public android.service.timezone.TimeZoneProviderSuggestion.Builder setTimeZoneIds(java.util.List<java.lang.String> p0) { return null; }
        @android.annotation.NonNull
        public android.service.timezone.TimeZoneProviderSuggestion.Builder setElapsedRealtimeMillis(long p0) { return null; }
        @android.annotation.NonNull
        public android.service.timezone.TimeZoneProviderSuggestion build() { return null; }
    }
}
