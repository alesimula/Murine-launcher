package android.app.wallpaper;

@android.annotation.FlaggedApi("android.app.live_wallpaper_content_handling")
public final class WallpaperDescription implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.app.wallpaper.WallpaperDescription> CREATOR = null;
    public android.content.ComponentName getComponent() { return null; }
    public java.lang.String getId() { return null; }
    public android.net.Uri getThumbnail() { return null; }
    public java.lang.CharSequence getTitle() { return null; }
    public java.util.List<java.lang.CharSequence> getDescription() { return null; }
    public android.net.Uri getContextUri() { return null; }
    public java.lang.CharSequence getContextDescription() { return null; }
    public android.os.PersistableBundle getContent() { return null; }
    @android.annotation.SystemApi
    public android.util.SparseArray<android.graphics.Rect> getCropHints() { return null; }
    public float getSampleSize() { return 0.0f; }
    public java.lang.String toString() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public void saveToXml(com.android.modules.utils.TypedXmlSerializer p0) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException {}
    public static android.app.wallpaper.WallpaperDescription restoreFromXml(com.android.modules.utils.TypedXmlPullParser p0) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException { return null; }
    WallpaperDescription(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public android.app.wallpaper.WallpaperDescription.Builder toBuilder() { return null; }

    public static final class Builder {
        public Builder() {}
        public android.app.wallpaper.WallpaperDescription.Builder setComponent(android.content.ComponentName p0) { return null; }
        public android.app.wallpaper.WallpaperDescription.Builder setId(java.lang.String p0) { return null; }
        public android.app.wallpaper.WallpaperDescription.Builder setThumbnail(android.net.Uri p0) { return null; }
        public android.app.wallpaper.WallpaperDescription.Builder setTitle(java.lang.CharSequence p0) { return null; }
        public android.app.wallpaper.WallpaperDescription.Builder setDescription(java.util.List<java.lang.CharSequence> p0) { return null; }
        public android.app.wallpaper.WallpaperDescription.Builder setContextUri(android.net.Uri p0) { return null; }
        public android.app.wallpaper.WallpaperDescription.Builder setContextDescription(java.lang.CharSequence p0) { return null; }
        public android.app.wallpaper.WallpaperDescription.Builder setContent(android.os.PersistableBundle p0) { return null; }
        @android.annotation.SystemApi
        public android.app.wallpaper.WallpaperDescription.Builder setCropHints(java.util.Map<android.graphics.Point, android.graphics.Rect> p0) { return null; }
        @android.annotation.SystemApi
        public android.app.wallpaper.WallpaperDescription.Builder setCropHints(android.util.SparseArray<android.graphics.Rect> p0) { return null; }
        public android.app.wallpaper.WallpaperDescription.Builder setSampleSize(float p0) { return null; }
        public android.app.wallpaper.WallpaperDescription build() { return null; }
    }
}
