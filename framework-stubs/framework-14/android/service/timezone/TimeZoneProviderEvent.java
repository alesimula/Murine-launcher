package android.service.timezone;

public final class TimeZoneProviderEvent implements android.os.Parcelable {
    public static final int EVENT_TYPE_PERMANENT_FAILURE = 1;
    public static final int EVENT_TYPE_SUGGESTION = 2;
    public static final int EVENT_TYPE_UNCERTAIN = 3;
    public static final android.os.Parcelable.Creator<android.service.timezone.TimeZoneProviderEvent> CREATOR = null;
    public static android.service.timezone.TimeZoneProviderEvent createSuggestionEvent(long p0, android.service.timezone.TimeZoneProviderSuggestion p1, android.service.timezone.TimeZoneProviderStatus p2) { return null; }
    public static android.service.timezone.TimeZoneProviderEvent createUncertainEvent(long p0, android.service.timezone.TimeZoneProviderStatus p1) { return null; }
    public static android.service.timezone.TimeZoneProviderEvent createPermanentFailureEvent(long p0, java.lang.String p1) { return null; }
    public int getType() { return 0; }
    public long getCreationElapsedMillis() { return 0L; }
    public android.service.timezone.TimeZoneProviderSuggestion getSuggestion() { return null; }
    public java.lang.String getFailureCause() { return null; }
    public android.service.timezone.TimeZoneProviderStatus getTimeZoneProviderStatus() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public java.lang.String toString() { return null; }
    public boolean isEquivalentTo(android.service.timezone.TimeZoneProviderEvent p0) { return false; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE, java.lang.annotation.ElementType.TYPE_PARAMETER})
    public static @interface EventType {
    }
}
