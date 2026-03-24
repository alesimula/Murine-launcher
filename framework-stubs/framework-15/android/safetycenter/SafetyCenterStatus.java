package android.safetycenter;

public final class SafetyCenterStatus implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.safetycenter.SafetyCenterStatus> CREATOR = null;
    public static final int OVERALL_SEVERITY_LEVEL_CRITICAL_WARNING = 1300;
    public static final int OVERALL_SEVERITY_LEVEL_OK = 1100;
    public static final int OVERALL_SEVERITY_LEVEL_RECOMMENDATION = 1200;
    public static final int OVERALL_SEVERITY_LEVEL_UNKNOWN = 1000;
    public static final int REFRESH_STATUS_DATA_FETCH_IN_PROGRESS = 10100;
    public static final int REFRESH_STATUS_FULL_RESCAN_IN_PROGRESS = 10200;
    public static final int REFRESH_STATUS_NONE = 0;
    SafetyCenterStatus() {}
    public int describeContents() { return 0; }
    public int getRefreshStatus() { return 0; }
    public int getSeverityLevel() { return 0; }
    @android.annotation.NonNull
    public java.lang.CharSequence getSummary() { return null; }
    @android.annotation.NonNull
    public java.lang.CharSequence getTitle() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        public Builder(java.lang.CharSequence p0, java.lang.CharSequence p1) {}
        public Builder(android.safetycenter.SafetyCenterStatus p0) {}
        @android.annotation.NonNull
        public android.safetycenter.SafetyCenterStatus build() { return null; }
        @android.annotation.NonNull
        public android.safetycenter.SafetyCenterStatus.Builder setRefreshStatus(int p0) { return null; }
        @android.annotation.NonNull
        public android.safetycenter.SafetyCenterStatus.Builder setSeverityLevel(int p0) { return null; }
        @android.annotation.NonNull
        public android.safetycenter.SafetyCenterStatus.Builder setSummary(java.lang.CharSequence p0) { return null; }
        @android.annotation.NonNull
        public android.safetycenter.SafetyCenterStatus.Builder setTitle(java.lang.CharSequence p0) { return null; }
    }
}
