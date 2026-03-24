package android.safetycenter.config;

public final class SafetySource implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.safetycenter.config.SafetySource> CREATOR = null;
    public static final int INITIAL_DISPLAY_STATE_DISABLED = 1;
    public static final int INITIAL_DISPLAY_STATE_ENABLED = 0;
    public static final int INITIAL_DISPLAY_STATE_HIDDEN = 2;
    public static final int PROFILE_ALL = 2;
    public static final int PROFILE_NONE = 0;
    public static final int PROFILE_PRIMARY = 1;
    public static final int SAFETY_SOURCE_TYPE_DYNAMIC = 2;
    public static final int SAFETY_SOURCE_TYPE_ISSUE_ONLY = 3;
    public static final int SAFETY_SOURCE_TYPE_STATIC = 1;
    SafetySource() {}
    public boolean areNotificationsAllowed() { return false; }
    public int describeContents() { return 0; }
    @android.annotation.Nullable
    public java.lang.String getDeduplicationGroup() { return null; }
    @android.annotation.NonNull
    public java.lang.String getId() { return null; }
    public int getInitialDisplayState() { return 0; }
    @android.annotation.Nullable
    public java.lang.String getIntentAction() { return null; }
    public int getMaxSeverityLevel() { return 0; }
    @android.annotation.Nullable
    public java.lang.String getOptionalPackageName() { return null; }
    @android.annotation.NonNull
    public java.util.Set<java.lang.String> getPackageCertificateHashes() { return null; }
    @android.annotation.NonNull
    public java.lang.String getPackageName() { return null; }
    public int getProfile() { return 0; }
    public int getSearchTermsResId() { return 0; }
    public int getSummaryResId() { return 0; }
    @android.annotation.FlaggedApi("com.android.permission.flags.private_profile_title_api")
    public int getTitleForPrivateProfileResId() { return 0; }
    public int getTitleForWorkResId() { return 0; }
    public int getTitleResId() { return 0; }
    public int getType() { return 0; }
    public boolean isLoggingAllowed() { return false; }
    public boolean isRefreshOnPageOpenAllowed() { return false; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        public Builder(android.safetycenter.config.SafetySource p0) {}
        public Builder(int p0) {}
        @android.annotation.NonNull
        public android.safetycenter.config.SafetySource.Builder addPackageCertificateHash(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        public android.safetycenter.config.SafetySource build() { return null; }
        @android.annotation.NonNull
        public android.safetycenter.config.SafetySource.Builder setDeduplicationGroup(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        public android.safetycenter.config.SafetySource.Builder setId(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        public android.safetycenter.config.SafetySource.Builder setInitialDisplayState(int p0) { return null; }
        @android.annotation.NonNull
        public android.safetycenter.config.SafetySource.Builder setIntentAction(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        public android.safetycenter.config.SafetySource.Builder setLoggingAllowed(boolean p0) { return null; }
        @android.annotation.NonNull
        public android.safetycenter.config.SafetySource.Builder setMaxSeverityLevel(int p0) { return null; }
        @android.annotation.NonNull
        public android.safetycenter.config.SafetySource.Builder setNotificationsAllowed(boolean p0) { return null; }
        @android.annotation.NonNull
        public android.safetycenter.config.SafetySource.Builder setPackageName(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        public android.safetycenter.config.SafetySource.Builder setProfile(int p0) { return null; }
        @android.annotation.NonNull
        public android.safetycenter.config.SafetySource.Builder setRefreshOnPageOpenAllowed(boolean p0) { return null; }
        @android.annotation.NonNull
        public android.safetycenter.config.SafetySource.Builder setSearchTermsResId(int p0) { return null; }
        @android.annotation.NonNull
        public android.safetycenter.config.SafetySource.Builder setSummaryResId(int p0) { return null; }
        @android.annotation.FlaggedApi("com.android.permission.flags.private_profile_title_api")
        @android.annotation.NonNull
        public android.safetycenter.config.SafetySource.Builder setTitleForPrivateProfileResId(int p0) { return null; }
        @android.annotation.NonNull
        public android.safetycenter.config.SafetySource.Builder setTitleForWorkResId(int p0) { return null; }
        @android.annotation.NonNull
        public android.safetycenter.config.SafetySource.Builder setTitleResId(int p0) { return null; }
    }
}
