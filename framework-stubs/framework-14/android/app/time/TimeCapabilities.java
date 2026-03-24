package android.app.time;

@android.annotation.SystemApi
public final class TimeCapabilities implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.app.time.TimeCapabilities> CREATOR = null;
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int getConfigureAutoDetectionEnabledCapability() { return 0; }
    public int getSetManualTimeCapability() { return 0; }
    public android.app.time.TimeConfiguration tryApplyConfigChanges(android.app.time.TimeConfiguration p0, android.app.time.TimeConfiguration p1) { return null; }
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }

    public static class Builder {
        public Builder(android.os.UserHandle p0) {}
        public Builder(android.app.time.TimeCapabilities p0) {}
        public android.app.time.TimeCapabilities.Builder setConfigureAutoDetectionEnabledCapability(int p0) { return null; }
        public android.app.time.TimeCapabilities.Builder setSetManualTimeCapability(int p0) { return null; }
        public android.app.time.TimeCapabilities build() { return null; }
    }
}
