package android.app;

public class ContentProviderHolder implements android.os.Parcelable {
    @android.annotation.UnsupportedAppUsage
    public final android.content.pm.ProviderInfo info = null;
    @android.annotation.UnsupportedAppUsage
    public android.content.IContentProvider provider;
    public android.os.IBinder connection;
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=115609023L)
    public boolean noReleaseNeeded;
    public static final android.os.Parcelable.Creator<android.app.ContentProviderHolder> CREATOR = null;
    @android.annotation.UnsupportedAppUsage
    public ContentProviderHolder(android.content.pm.ProviderInfo p0) {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    @android.annotation.UnsupportedAppUsage
    private ContentProviderHolder(android.os.Parcel p0) {}
}
