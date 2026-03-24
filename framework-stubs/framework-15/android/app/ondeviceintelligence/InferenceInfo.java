package android.app.ondeviceintelligence;

public class InferenceInfo implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.app.ondeviceintelligence.InferenceInfo> CREATOR = null;
    public InferenceInfo(int p0, long p1, long p2, long p3) {}
    protected InferenceInfo(android.os.Parcel p0) {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int getUid() { return 0; }
    public long getStartTimeMs() { return 0L; }
    public long getEndTimeMs() { return 0L; }
    public long getSuspendedTimeMs() { return 0L; }
    public int describeContents() { return 0; }

    public static class Builder {
        public Builder() {}
        public android.app.ondeviceintelligence.InferenceInfo.Builder setUid(int p0) { return null; }
        public android.app.ondeviceintelligence.InferenceInfo.Builder setStartTimeMs(long p0) { return null; }
        public android.app.ondeviceintelligence.InferenceInfo.Builder setEndTimeMs(long p0) { return null; }
        public android.app.ondeviceintelligence.InferenceInfo.Builder setSuspendedTimeMs(long p0) { return null; }
        public android.app.ondeviceintelligence.InferenceInfo build() { return null; }
    }
}
