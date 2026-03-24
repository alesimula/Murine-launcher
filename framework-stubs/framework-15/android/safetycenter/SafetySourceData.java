package android.safetycenter;

public final class SafetySourceData implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.safetycenter.SafetySourceData> CREATOR = null;
    public static final int SEVERITY_LEVEL_CRITICAL_WARNING = 400;
    public static final int SEVERITY_LEVEL_INFORMATION = 200;
    public static final int SEVERITY_LEVEL_RECOMMENDATION = 300;
    public static final int SEVERITY_LEVEL_UNSPECIFIED = 100;
    SafetySourceData() {}
    public int describeContents() { return 0; }
    @android.annotation.NonNull
    public android.os.Bundle getExtras() { return null; }
    @android.annotation.NonNull
    public java.util.List<android.safetycenter.SafetySourceIssue> getIssues() { return null; }
    @android.annotation.Nullable
    public android.safetycenter.SafetySourceStatus getStatus() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        public Builder() {}
        public Builder(android.safetycenter.SafetySourceData p0) {}
        @android.annotation.NonNull
        public android.safetycenter.SafetySourceData.Builder addIssue(android.safetycenter.SafetySourceIssue p0) { return null; }
        @android.annotation.NonNull
        public android.safetycenter.SafetySourceData build() { return null; }
        @android.annotation.NonNull
        public android.safetycenter.SafetySourceData.Builder clearExtras() { return null; }
        @android.annotation.NonNull
        public android.safetycenter.SafetySourceData.Builder clearIssues() { return null; }
        @android.annotation.NonNull
        public android.safetycenter.SafetySourceData.Builder setExtras(android.os.Bundle p0) { return null; }
        @android.annotation.NonNull
        public android.safetycenter.SafetySourceData.Builder setStatus(android.safetycenter.SafetySourceStatus p0) { return null; }
    }
}
