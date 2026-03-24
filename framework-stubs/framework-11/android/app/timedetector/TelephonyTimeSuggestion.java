package android.app.timedetector;

public final class TelephonyTimeSuggestion implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.app.timedetector.TelephonyTimeSuggestion> CREATOR = null;
    private final int mSlotIndex = 0;
    private final android.os.TimestampedValue<java.lang.Long> mUtcTime = null;
    private java.util.ArrayList<java.lang.String> mDebugInfo;
    private TelephonyTimeSuggestion(android.app.timedetector.TelephonyTimeSuggestion.Builder p0) {}
    private static android.app.timedetector.TelephonyTimeSuggestion createFromParcel(android.os.Parcel p0) { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int getSlotIndex() { return 0; }
    public android.os.TimestampedValue<java.lang.Long> getUtcTime() { return null; }
    public java.util.List<java.lang.String> getDebugInfo() { return null; }
    public void addDebugInfo(java.lang.String p0) {}
    public void addDebugInfo(java.util.List<java.lang.String> p0) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }

    public static final class Builder {
        private final int mSlotIndex = 0;
        private android.os.TimestampedValue<java.lang.Long> mUtcTime;
        private java.util.List<java.lang.String> mDebugInfo;
        public Builder(int p0) {}
        public android.app.timedetector.TelephonyTimeSuggestion.Builder setUtcTime(android.os.TimestampedValue<java.lang.Long> p0) { return null; }
        public android.app.timedetector.TelephonyTimeSuggestion.Builder addDebugInfo(java.lang.String p0) { return null; }
        public android.app.timedetector.TelephonyTimeSuggestion build() { return null; }
    }
}
