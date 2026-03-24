package android.app.wallpaper;

@android.annotation.FlaggedApi("android.app.live_wallpaper_content_handling")
public final class WallpaperInstance implements android.os.Parcelable {
    public static final java.lang.String DEFAULT_ID = "default_id";
    public static final android.os.Parcelable.Creator<android.app.wallpaper.WallpaperInstance> CREATOR = null;
    public WallpaperInstance(android.app.WallpaperInfo p0, android.app.wallpaper.WallpaperDescription p1) {}
    public WallpaperInstance(android.app.WallpaperInfo p0, android.app.wallpaper.WallpaperDescription p1, java.lang.String p2) {}
    public android.app.WallpaperInfo getInfo() { return null; }
    public java.lang.String getId() { return null; }
    public android.app.wallpaper.WallpaperDescription getDescription() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    WallpaperInstance(android.os.Parcel p0) {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
}
