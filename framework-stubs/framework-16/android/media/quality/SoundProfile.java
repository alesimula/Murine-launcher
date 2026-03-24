package android.media.quality;

@android.annotation.FlaggedApi("android.media.tv.flags.media_quality_fw")
public final class SoundProfile implements android.os.Parcelable {
    public static final int TYPE_SYSTEM = 1;
    public static final int TYPE_APPLICATION = 2;
    public static final int ERROR_UNKNOWN = 0;
    public static final int ERROR_NO_PERMISSION = 1;
    public static final int ERROR_DUPLICATE = 2;
    public static final int ERROR_INVALID_ARGUMENT = 3;
    public static final int ERROR_NOT_ALLOWLISTED = 4;
    public static final android.os.Parcelable.Creator<android.media.quality.SoundProfile> CREATOR = null;
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    public SoundProfile(java.lang.String p0, int p1, java.lang.String p2, java.lang.String p3, java.lang.String p4, android.os.PersistableBundle p5, android.media.quality.SoundProfileHandle p6) {}
    public java.lang.String getProfileId() { return null; }
    public void setProfileId(java.lang.String p0) {}
    public int getProfileType() { return 0; }
    public java.lang.String getName() { return null; }
    public java.lang.String getInputId() { return null; }
    public java.lang.String getPackageName() { return null; }
    public android.os.PersistableBundle getParameters() { return null; }
    public android.media.quality.SoundProfileHandle getHandle() { return null; }

    public static final class Builder {
        public Builder(java.lang.String p0) {}
        public Builder(android.media.quality.SoundProfile p0) {}
        public android.media.quality.SoundProfile.Builder setProfileId(java.lang.String p0) { return null; }
        @android.annotation.SystemApi
        public android.media.quality.SoundProfile.Builder setProfileType(int p0) { return null; }
        @android.annotation.SystemApi
        public android.media.quality.SoundProfile.Builder setInputId(java.lang.String p0) { return null; }
        @android.annotation.SystemApi
        public android.media.quality.SoundProfile.Builder setPackageName(java.lang.String p0) { return null; }
        public android.media.quality.SoundProfile.Builder setParameters(android.os.PersistableBundle p0) { return null; }
        public android.media.quality.SoundProfile.Builder setHandle(android.media.quality.SoundProfileHandle p0) { return null; }
        public android.media.quality.SoundProfile build() { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ErrorCode {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ProfileType {
    }
}
