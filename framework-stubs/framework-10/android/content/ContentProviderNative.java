package android.content;

public abstract class ContentProviderNative extends android.os.Binder implements android.content.IContentProvider {
    public ContentProviderNative() { super(); }
    @android.annotation.UnsupportedAppUsage
    public static android.content.IContentProvider asInterface(android.os.IBinder p0) { return null; }
    public abstract java.lang.String getProviderName();
    public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
    public android.os.IBinder asBinder() { return null; }
}
