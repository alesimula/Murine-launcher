package android.media.quality;

@android.annotation.FlaggedApi("android.media.tv.flags.media_quality_fw")
public final class PictureProfile implements android.os.Parcelable {
    public static final int TYPE_SYSTEM = 1;
    public static final int TYPE_APPLICATION = 2;
    public static final java.lang.String NAME_DEFAULT = "default";
    public static final int ERROR_UNKNOWN = 0;
    public static final int ERROR_NO_PERMISSION = 1;
    public static final int ERROR_DUPLICATE = 2;
    public static final int ERROR_INVALID_ARGUMENT = 3;
    public static final int ERROR_NOT_ALLOWLISTED = 4;
    public static final java.lang.String STATUS_SDR = "SDR";
    public static final java.lang.String STATUS_HDR10 = "HDR10";
    public static final java.lang.String STATUS_DOLBY_VISION = "DOLBY_VISION";
    public static final java.lang.String STATUS_TCH = "TCH";
    public static final java.lang.String STATUS_HLG = "HLG";
    public static final java.lang.String STATUS_HDR10_PLUS = "HDR10_PLUS";
    public static final java.lang.String STATUS_HDR_VIVID = "HDR_VIVID";
    public static final java.lang.String STATUS_IMAX_SDR = "IMAX_SDR";
    public static final java.lang.String STATUS_IMAX_HDR10 = "IMAX_HDR10";
    public static final java.lang.String STATUS_IMAX_HDR10_PLUS = "IMAX_HDR10_PLUS";
    public static final java.lang.String STATUS_FMM_SDR = "FMM_SDR";
    public static final java.lang.String STATUS_FMM_HDR10 = "FMM_HDR10";
    public static final java.lang.String STATUS_FMM_HDR10_PLUS = "FMM_HDR10_PLUS";
    public static final java.lang.String STATUS_FMM_HLG = "FMM_HLG";
    public static final java.lang.String STATUS_FMM_DOLBY = "FMM_DOLBY";
    public static final java.lang.String STATUS_FMM_TCH = "FMM_TCH";
    public static final java.lang.String STATUS_FMM_HDR_VIVID = "FMM_HDR_VIVID";
    public static final java.lang.String NAME_STANDARD = "standard";
    public static final java.lang.String NAME_VIVID = "vivid";
    public static final java.lang.String NAME_SPORTS = "sports";
    public static final java.lang.String NAME_GAME = "game";
    public static final java.lang.String NAME_MOVIE = "movie";
    public static final java.lang.String NAME_ENERGY_SAVING = "energy_saving";
    public static final java.lang.String NAME_USER = "user";
    public static final android.os.Parcelable.Creator<android.media.quality.PictureProfile> CREATOR = null;
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    public PictureProfile(java.lang.String p0, int p1, java.lang.String p2, java.lang.String p3, java.lang.String p4, android.os.PersistableBundle p5, android.media.quality.PictureProfileHandle p6) {}
    public java.lang.String getProfileId() { return null; }
    public void setProfileId(java.lang.String p0) {}
    public int getProfileType() { return 0; }
    public java.lang.String getName() { return null; }
    public java.lang.String getInputId() { return null; }
    public java.lang.String getPackageName() { return null; }
    public android.os.PersistableBundle getParameters() { return null; }
    public android.media.quality.PictureProfileHandle getHandle() { return null; }

    public static final class Builder {
        public Builder(java.lang.String p0) {}
        public Builder(android.media.quality.PictureProfile p0) {}
        public android.media.quality.PictureProfile.Builder setProfileId(java.lang.String p0) { return null; }
        @android.annotation.SystemApi
        public android.media.quality.PictureProfile.Builder setProfileType(int p0) { return null; }
        @android.annotation.SystemApi
        public android.media.quality.PictureProfile.Builder setInputId(java.lang.String p0) { return null; }
        @android.annotation.SystemApi
        public android.media.quality.PictureProfile.Builder setPackageName(java.lang.String p0) { return null; }
        public android.media.quality.PictureProfile.Builder setParameters(android.os.PersistableBundle p0) { return null; }
        public android.media.quality.PictureProfile.Builder setHandle(android.media.quality.PictureProfileHandle p0) { return null; }
        public android.media.quality.PictureProfile build() { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ErrorCode {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ProfileName {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ProfileType {
    }
}
