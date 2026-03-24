package android.app;

public class ContentProviderHolder implements android.os.Parcelable {
    public final android.content.pm.ProviderInfo info = null;
    public android.content.IContentProvider provider;
    public android.os.IBinder connection;
    public boolean noReleaseNeeded;
    public boolean mLocal;
    public static final android.os.Parcelable.Creator<android.app.ContentProviderHolder> CREATOR = null;
    public ContentProviderHolder(android.content.pm.ProviderInfo p0) {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    private ContentProviderHolder(android.os.Parcel p0) {}
}
