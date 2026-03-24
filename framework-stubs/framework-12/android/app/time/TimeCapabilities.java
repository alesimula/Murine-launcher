package android.app.time;

public final class TimeCapabilities implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.app.time.TimeCapabilities> CREATOR = null;
    private final android.os.UserHandle mUserHandle = null;
    private final int mConfigureAutoTimeDetectionEnabledCapability = 0;
    private final int mSuggestTimeManuallyCapability = 0;
    private TimeCapabilities(android.app.time.TimeCapabilities.Builder p0) {}
    private static android.app.time.TimeCapabilities createFromParcel(android.os.Parcel p0) { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int getConfigureAutoTimeDetectionEnabledCapability() { return 0; }
    public int getSuggestTimeManuallyCapability() { return 0; }
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }

    public static class Builder {
        private final android.os.UserHandle mUserHandle = null;
        private int mConfigureAutoDetectionEnabledCapability;
        private int mSuggestTimeManuallyCapability;
        public Builder(android.app.time.TimeCapabilities p0) {}
        public Builder(android.os.UserHandle p0) {}
        public android.app.time.TimeCapabilities.Builder setConfigureAutoTimeDetectionEnabledCapability(int p0) { return null; }
        public android.app.time.TimeCapabilities.Builder setSuggestTimeManuallyCapability(int p0) { return null; }
        public android.app.time.TimeCapabilities build() { return null; }
        private void verifyCapabilitySet(int p0, java.lang.String p1) {}
    }
}
