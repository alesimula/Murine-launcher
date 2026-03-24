package android.app.wallpapereffectsgeneration;

@android.annotation.SystemApi
public final class CinematicEffectResponse implements android.os.Parcelable {
    public static final int CINEMATIC_EFFECT_STATUS_ERROR = 0;
    public static final int CINEMATIC_EFFECT_STATUS_OK = 1;
    public static final int CINEMATIC_EFFECT_STATUS_NOT_READY = 2;
    public static final int CINEMATIC_EFFECT_STATUS_PENDING = 3;
    public static final int CINEMATIC_EFFECT_STATUS_TOO_MANY_REQUESTS = 4;
    public static final int CINEMATIC_EFFECT_STATUS_FEATURE_DISABLED = 5;
    public static final int CINEMATIC_EFFECT_STATUS_IMAGE_FORMAT_NOT_SUITABLE = 6;
    public static final int CINEMATIC_EFFECT_STATUS_CONTENT_UNSUPPORTED = 7;
    public static final int CINEMATIC_EFFECT_STATUS_CONTENT_TARGET_ERROR = 8;
    public static final int CINEMATIC_EFFECT_STATUS_CONTENT_TOO_FLAT = 9;
    public static final int CINEMATIC_EFFECT_STATUS_ANIMATION_FAILURE = 10;
    public static final int IMAGE_CONTENT_TYPE_UNKNOWN = 0;
    public static final int IMAGE_CONTENT_TYPE_PEOPLE_PORTRAIT = 1;
    public static final int IMAGE_CONTENT_TYPE_LANDSCAPE = 2;
    public static final int IMAGE_CONTENT_TYPE_OTHER = 3;
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.app.wallpapereffectsgeneration.CinematicEffectResponse> CREATOR = null;
    public int getStatusCode() { return 0; }
    @android.annotation.NonNull
    public java.lang.String getTaskId() { return null; }
    public int getImageContentType() { return 0; }
    @android.annotation.NonNull
    public java.util.List<android.app.wallpapereffectsgeneration.TexturedMesh> getTexturedMeshes() { return null; }
    @android.annotation.Nullable
    public android.app.wallpapereffectsgeneration.CameraAttributes getStartKeyFrame() { return null; }
    @android.annotation.Nullable
    public android.app.wallpapereffectsgeneration.CameraAttributes getEndKeyFrame() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }

    @android.annotation.SystemApi
    public static final class Builder {
        @android.annotation.SystemApi
        public Builder(int p0, java.lang.String p1) {}
        @android.annotation.NonNull
        public android.app.wallpapereffectsgeneration.CinematicEffectResponse.Builder setImageContentType(int p0) { return null; }
        @android.annotation.NonNull
        public android.app.wallpapereffectsgeneration.CinematicEffectResponse.Builder setTexturedMeshes(java.util.List<android.app.wallpapereffectsgeneration.TexturedMesh> p0) { return null; }
        @android.annotation.NonNull
        public android.app.wallpapereffectsgeneration.CinematicEffectResponse.Builder setStartKeyFrame(android.app.wallpapereffectsgeneration.CameraAttributes p0) { return null; }
        @android.annotation.NonNull
        public android.app.wallpapereffectsgeneration.CinematicEffectResponse.Builder setEndKeyFrame(android.app.wallpapereffectsgeneration.CameraAttributes p0) { return null; }
        @android.annotation.NonNull
        public android.app.wallpapereffectsgeneration.CinematicEffectResponse build() { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface CinematicEffectStatusCode {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ImageContentType {
    }
}
