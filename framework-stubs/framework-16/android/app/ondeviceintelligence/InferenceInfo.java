package android.app.ondeviceintelligence;

@android.annotation.SystemApi
@android.annotation.FlaggedApi("android.app.ondeviceintelligence.flags.enable_on_device_intelligence_module")
public final class InferenceInfo implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.app.ondeviceintelligence.InferenceInfo> CREATOR = null;
    InferenceInfo(int p0, long p1, long p2, long p3) {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int getUid() { return 0; }
    public long getStartTimeMillis() { return 0L; }
    public long getEndTimeMillis() { return 0L; }
    public long getSuspendedTimeMillis() { return 0L; }
    public int describeContents() { return 0; }

    public static final class Builder {
        public Builder(int p0) {}
        @android.annotation.NonNull
        public android.app.ondeviceintelligence.InferenceInfo.Builder setStartTimeMillis(long p0) { return null; }
        @android.annotation.NonNull
        public android.app.ondeviceintelligence.InferenceInfo.Builder setEndTimeMillis(long p0) { return null; }
        @android.annotation.NonNull
        public android.app.ondeviceintelligence.InferenceInfo.Builder setSuspendedTimeMillis(long p0) { return null; }
        @android.annotation.NonNull
        public android.app.ondeviceintelligence.InferenceInfo build() { return null; }
    }
}
