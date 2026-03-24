package android.view.textservice;

public final class SpellCheckerInfo implements android.os.Parcelable {
    private static final java.lang.String TAG = null;
    private final android.content.pm.ResolveInfo mService = null;
    private final java.lang.String mId = null;
    private final int mLabel = 0;
    private final java.lang.String mSettingsActivityName = null;
    private final java.util.ArrayList<android.view.textservice.SpellCheckerSubtype> mSubtypes = null;
    public static final android.os.Parcelable.Creator<android.view.textservice.SpellCheckerInfo> CREATOR = null;
    public SpellCheckerInfo(android.content.Context p0, android.content.pm.ResolveInfo p1) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {}
    public SpellCheckerInfo(android.os.Parcel p0) {}
    public java.lang.String getId() { return null; }
    public android.content.ComponentName getComponent() { return null; }
    public java.lang.String getPackageName() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public java.lang.CharSequence loadLabel(android.content.pm.PackageManager p0) { return null; }
    public android.graphics.drawable.Drawable loadIcon(android.content.pm.PackageManager p0) { return null; }
    public android.content.pm.ServiceInfo getServiceInfo() { return null; }
    public java.lang.String getSettingsActivity() { return null; }
    public int getSubtypeCount() { return 0; }
    public android.view.textservice.SpellCheckerSubtype getSubtypeAt(int p0) { return null; }
    public int describeContents() { return 0; }
    public void dump(java.io.PrintWriter p0, java.lang.String p1) {}
}
