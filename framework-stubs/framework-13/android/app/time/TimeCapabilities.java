package android.app.time;

public final class TimeCapabilities implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.app.time.TimeCapabilities> CREATOR = null;
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int getConfigureAutoTimeDetectionEnabledCapability() { return 0; }
    public int getSuggestTimeManuallyCapability() { return 0; }
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }

    public static class Builder {
        public Builder(android.app.time.TimeCapabilities p0) {}
        public Builder(android.os.UserHandle p0) {}
        public android.app.time.TimeCapabilities.Builder setConfigureAutoTimeDetectionEnabledCapability(int p0) { return null; }
        public android.app.time.TimeCapabilities.Builder setSuggestTimeManuallyCapability(int p0) { return null; }
        public android.app.time.TimeCapabilities build() { return null; }
    }
}
