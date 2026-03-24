package android.media.projection;

public final class MediaProjectionConfig implements android.os.Parcelable {
    @android.annotation.FlaggedApi("com.android.media.projection.flags.app_content_sharing")
    public static final int PROJECTION_SOURCE_DISPLAY = 2;
    public static final int PROJECTION_SOURCE_DISPLAY_REGION = 4;
    @android.annotation.FlaggedApi("com.android.media.projection.flags.app_content_sharing")
    public static final int PROJECTION_SOURCE_APP = 8;
    @android.annotation.FlaggedApi("com.android.media.projection.flags.app_content_sharing")
    public static final int PROJECTION_SOURCE_APP_CONTENT = 16;
    public static final int CAPTURE_REGION_USER_CHOICE = 0;
    public static final int DEFAULT_PROJECTION_SOURCES = 10;
    public static final int CAPTURE_REGION_FIXED_DISPLAY = 1;
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.media.projection.MediaProjectionConfig> CREATOR = null;
    @android.annotation.NonNull
    public static android.media.projection.MediaProjectionConfig createConfigForDefaultDisplay() { return null; }
    @android.annotation.NonNull
    public static android.media.projection.MediaProjectionConfig createConfigForUserChoice() { return null; }
    public java.lang.String toString() { return null; }
    public int getDisplayToCapture() { return 0; }
    public int getRegionToCapture() { return 0; }
    @android.annotation.FlaggedApi("com.android.media.projection.flags.app_content_sharing")
    public int getProjectionSources() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    MediaProjectionConfig(android.os.Parcel p0) {}
    @android.annotation.FlaggedApi("com.android.media.projection.flags.app_content_sharing")
    public boolean isSourceEnabled(int p0) { return false; }
    @android.annotation.FlaggedApi("com.android.media.projection.flags.app_content_sharing")
    public int getInitiallySelectedSource() { return 0; }
    @android.annotation.FlaggedApi("com.android.media.projection.flags.app_content_sharing")
    public boolean isOwnAppContentProvided() { return false; }
    @android.annotation.FlaggedApi("com.android.media.projection.flags.app_content_sharing")
    @android.annotation.Nullable
    public java.lang.CharSequence getRequesterHint() { return null; }

    @android.annotation.FlaggedApi("com.android.media.projection.flags.app_content_sharing")
    public static final class Builder {
        public Builder() {}
        @android.annotation.NonNull
        public android.media.projection.MediaProjectionConfig.Builder setInitiallySelectedSource(int p0) { return null; }
        @android.annotation.NonNull
        @android.annotation.SuppressLint({"MissingGetterMatchingBuilder", "RequiresPermission"})
        public android.media.projection.MediaProjectionConfig.Builder setOwnAppContentProvided(android.content.Context p0, boolean p1) { return null; }
        @android.annotation.NonNull
        public android.media.projection.MediaProjectionConfig.Builder setRequesterHint(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        @android.annotation.SuppressLint("MissingGetterMatchingBuilder")
        public android.media.projection.MediaProjectionConfig.Builder setSourceEnabled(int p0, boolean p1) { return null; }
        @android.annotation.NonNull
        public android.media.projection.MediaProjectionConfig build() { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    @java.lang.Deprecated
    public static @interface CaptureRegion {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface MediaProjectionSource {
    }
}
