package android.app;

public final class WallpaperInfo implements android.os.Parcelable {
    static final java.lang.String TAG = "WallpaperInfo";
    final android.content.pm.ResolveInfo mService = null;
    final java.lang.String mSettingsActivityName = null;
    final int mThumbnailResource = 0;
    final int mAuthorResource = 0;
    final int mDescriptionResource = 0;
    final int mContextUriResource = 0;
    final int mContextDescriptionResource = 0;
    final boolean mShowMetadataInPreview = false;
    final boolean mSupportsAmbientMode = false;
    final java.lang.String mSettingsSliceUri = null;
    final boolean mSupportMultipleDisplays = false;
    public static final android.os.Parcelable.Creator<android.app.WallpaperInfo> CREATOR = null;
    public WallpaperInfo(android.content.Context p0, android.content.pm.ResolveInfo p1) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {}
    WallpaperInfo(android.os.Parcel p0) {}
    public java.lang.String getPackageName() { return null; }
    public java.lang.String getServiceName() { return null; }
    public android.content.pm.ServiceInfo getServiceInfo() { return null; }
    public android.content.ComponentName getComponent() { return null; }
    public java.lang.CharSequence loadLabel(android.content.pm.PackageManager p0) { return null; }
    public android.graphics.drawable.Drawable loadIcon(android.content.pm.PackageManager p0) { return null; }
    public android.graphics.drawable.Drawable loadThumbnail(android.content.pm.PackageManager p0) { return null; }
    public java.lang.CharSequence loadAuthor(android.content.pm.PackageManager p0) throws android.content.res.Resources.NotFoundException { return null; }
    public java.lang.CharSequence loadDescription(android.content.pm.PackageManager p0) throws android.content.res.Resources.NotFoundException { return null; }
    public android.net.Uri loadContextUri(android.content.pm.PackageManager p0) throws android.content.res.Resources.NotFoundException { return null; }
    public java.lang.CharSequence loadContextDescription(android.content.pm.PackageManager p0) throws android.content.res.Resources.NotFoundException { return null; }
    public boolean getShowMetadataInPreview() { return false; }
    @android.annotation.SystemApi
    public boolean supportsAmbientMode() { return false; }
    public java.lang.String getSettingsActivity() { return null; }
    public android.net.Uri getSettingsSliceUri() { return null; }
    public boolean supportsMultipleDisplays() { return false; }
    public void dump(android.util.Printer p0, java.lang.String p1) {}
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
}
