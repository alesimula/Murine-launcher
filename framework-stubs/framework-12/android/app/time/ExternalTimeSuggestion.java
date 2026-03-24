package android.app.time;

@android.annotation.SystemApi
public final class ExternalTimeSuggestion implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.app.time.ExternalTimeSuggestion> CREATOR = null;
    private final android.os.TimestampedValue<java.lang.Long> mUtcTime = null;
    private java.util.ArrayList<java.lang.String> mDebugInfo;
    public ExternalTimeSuggestion(long p0, long p1) {}
    private static android.app.time.ExternalTimeSuggestion createFromParcel(android.os.Parcel p0) { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public android.os.TimestampedValue<java.lang.Long> getUtcTime() { return null; }
    public java.util.List<java.lang.String> getDebugInfo() { return null; }
    public void addDebugInfo(java.lang.String... p0) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
}
