package android.media;

public final class MediaMetadata implements android.os.Parcelable {
    public static final java.lang.String METADATA_KEY_TITLE = "android.media.metadata.TITLE";
    public static final java.lang.String METADATA_KEY_ARTIST = "android.media.metadata.ARTIST";
    public static final java.lang.String METADATA_KEY_DURATION = "android.media.metadata.DURATION";
    public static final java.lang.String METADATA_KEY_ALBUM = "android.media.metadata.ALBUM";
    public static final java.lang.String METADATA_KEY_AUTHOR = "android.media.metadata.AUTHOR";
    public static final java.lang.String METADATA_KEY_WRITER = "android.media.metadata.WRITER";
    public static final java.lang.String METADATA_KEY_COMPOSER = "android.media.metadata.COMPOSER";
    public static final java.lang.String METADATA_KEY_COMPILATION = "android.media.metadata.COMPILATION";
    public static final java.lang.String METADATA_KEY_DATE = "android.media.metadata.DATE";
    public static final java.lang.String METADATA_KEY_YEAR = "android.media.metadata.YEAR";
    public static final java.lang.String METADATA_KEY_GENRE = "android.media.metadata.GENRE";
    public static final java.lang.String METADATA_KEY_TRACK_NUMBER = "android.media.metadata.TRACK_NUMBER";
    public static final java.lang.String METADATA_KEY_NUM_TRACKS = "android.media.metadata.NUM_TRACKS";
    public static final java.lang.String METADATA_KEY_DISC_NUMBER = "android.media.metadata.DISC_NUMBER";
    public static final java.lang.String METADATA_KEY_ALBUM_ARTIST = "android.media.metadata.ALBUM_ARTIST";
    public static final java.lang.String METADATA_KEY_ART = "android.media.metadata.ART";
    public static final java.lang.String METADATA_KEY_ART_URI = "android.media.metadata.ART_URI";
    public static final java.lang.String METADATA_KEY_ALBUM_ART = "android.media.metadata.ALBUM_ART";
    public static final java.lang.String METADATA_KEY_ALBUM_ART_URI = "android.media.metadata.ALBUM_ART_URI";
    public static final java.lang.String METADATA_KEY_USER_RATING = "android.media.metadata.USER_RATING";
    public static final java.lang.String METADATA_KEY_RATING = "android.media.metadata.RATING";
    public static final java.lang.String METADATA_KEY_DISPLAY_TITLE = "android.media.metadata.DISPLAY_TITLE";
    public static final java.lang.String METADATA_KEY_DISPLAY_SUBTITLE = "android.media.metadata.DISPLAY_SUBTITLE";
    public static final java.lang.String METADATA_KEY_DISPLAY_DESCRIPTION = "android.media.metadata.DISPLAY_DESCRIPTION";
    public static final java.lang.String METADATA_KEY_DISPLAY_ICON = "android.media.metadata.DISPLAY_ICON";
    public static final java.lang.String METADATA_KEY_DISPLAY_ICON_URI = "android.media.metadata.DISPLAY_ICON_URI";
    public static final java.lang.String METADATA_KEY_MEDIA_ID = "android.media.metadata.MEDIA_ID";
    public static final java.lang.String METADATA_KEY_MEDIA_URI = "android.media.metadata.MEDIA_URI";
    public static final java.lang.String METADATA_KEY_BT_FOLDER_TYPE = "android.media.metadata.BT_FOLDER_TYPE";
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.media.MediaMetadata> CREATOR = null;
    public boolean containsKey(java.lang.String p0) { return false; }
    @android.annotation.Nullable
    public java.lang.CharSequence getText(java.lang.String p0) { return null; }
    @android.annotation.Nullable
    public java.lang.String getString(java.lang.String p0) { return null; }
    public long getLong(java.lang.String p0) { return 0L; }
    @android.annotation.Nullable
    public android.media.Rating getRating(java.lang.String p0) { return null; }
    @android.annotation.Nullable
    public android.graphics.Bitmap getBitmap(java.lang.String p0) { return null; }
    public int getBitmapDimensionLimit() { return 0; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int size() { return 0; }
    public java.util.Set<java.lang.String> keySet() { return null; }
    @android.annotation.NonNull
    public android.media.MediaDescription getDescription() { return null; }
    @android.annotation.Nullable
    public static java.lang.String getKeyFromMetadataEditorKey(int p0) { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface BitmapKey {
    }

    public static final class Builder {
        public Builder() {}
        public Builder(android.media.MediaMetadata p0) {}
        public android.media.MediaMetadata.Builder putText(java.lang.String p0, java.lang.CharSequence p1) { return null; }
        public android.media.MediaMetadata.Builder putString(java.lang.String p0, java.lang.String p1) { return null; }
        public android.media.MediaMetadata.Builder putLong(java.lang.String p0, long p1) { return null; }
        public android.media.MediaMetadata.Builder putRating(java.lang.String p0, android.media.Rating p1) { return null; }
        public android.media.MediaMetadata.Builder putBitmap(java.lang.String p0, android.graphics.Bitmap p1) { return null; }
        @android.annotation.NonNull
        public android.media.MediaMetadata.Builder setBitmapDimensionLimit(int p0) { return null; }
        public android.media.MediaMetadata build() { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface LongKey {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface RatingKey {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface TextKey {
    }
}
