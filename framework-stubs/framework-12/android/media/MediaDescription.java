package android.media;

public class MediaDescription implements android.os.Parcelable {
    private final java.lang.String mMediaId = null;
    private final java.lang.CharSequence mTitle = null;
    private final java.lang.CharSequence mSubtitle = null;
    private final java.lang.CharSequence mDescription = null;
    private final android.graphics.Bitmap mIcon = null;
    private final android.net.Uri mIconUri = null;
    private final android.os.Bundle mExtras = null;
    private final android.net.Uri mMediaUri = null;
    public static final java.lang.String EXTRA_BT_FOLDER_TYPE = "android.media.extra.BT_FOLDER_TYPE";
    public static final long BT_FOLDER_TYPE_MIXED = 0L;
    public static final long BT_FOLDER_TYPE_TITLES = 1L;
    public static final long BT_FOLDER_TYPE_ALBUMS = 2L;
    public static final long BT_FOLDER_TYPE_ARTISTS = 3L;
    public static final long BT_FOLDER_TYPE_GENRES = 4L;
    public static final long BT_FOLDER_TYPE_PLAYLISTS = 5L;
    public static final long BT_FOLDER_TYPE_YEARS = 6L;
    public static final android.os.Parcelable.Creator<android.media.MediaDescription> CREATOR = null;
    private MediaDescription(java.lang.String p0, java.lang.CharSequence p1, java.lang.CharSequence p2, java.lang.CharSequence p3, android.graphics.Bitmap p4, android.net.Uri p5, android.os.Bundle p6, android.net.Uri p7) {}
    private MediaDescription(android.os.Parcel p0) {}
    public java.lang.String getMediaId() { return null; }
    public java.lang.CharSequence getTitle() { return null; }
    public java.lang.CharSequence getSubtitle() { return null; }
    public java.lang.CharSequence getDescription() { return null; }
    public android.graphics.Bitmap getIconBitmap() { return null; }
    public android.net.Uri getIconUri() { return null; }
    public android.os.Bundle getExtras() { return null; }
    public android.net.Uri getMediaUri() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public java.lang.String toString() { return null; }

    public static class Builder {
        private java.lang.String mMediaId;
        private java.lang.CharSequence mTitle;
        private java.lang.CharSequence mSubtitle;
        private java.lang.CharSequence mDescription;
        private android.graphics.Bitmap mIcon;
        private android.net.Uri mIconUri;
        private android.os.Bundle mExtras;
        private android.net.Uri mMediaUri;
        public Builder() {}
        public android.media.MediaDescription.Builder setMediaId(java.lang.String p0) { return null; }
        public android.media.MediaDescription.Builder setTitle(java.lang.CharSequence p0) { return null; }
        public android.media.MediaDescription.Builder setSubtitle(java.lang.CharSequence p0) { return null; }
        public android.media.MediaDescription.Builder setDescription(java.lang.CharSequence p0) { return null; }
        public android.media.MediaDescription.Builder setIconBitmap(android.graphics.Bitmap p0) { return null; }
        public android.media.MediaDescription.Builder setIconUri(android.net.Uri p0) { return null; }
        public android.media.MediaDescription.Builder setExtras(android.os.Bundle p0) { return null; }
        public android.media.MediaDescription.Builder setMediaUri(android.net.Uri p0) { return null; }
        public android.media.MediaDescription build() { return null; }
    }
}
