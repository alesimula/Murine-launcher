package android.nfc.cardemulation;

public class ApduServiceInfo implements android.os.Parcelable {
    static final java.lang.String TAG = "ApduServiceInfo";
    protected android.content.pm.ResolveInfo mService;
    protected java.lang.String mDescription;
    protected boolean mOnHost;
    java.lang.String mOffHostName;
    final java.lang.String mStaticOffHostName = null;
    protected java.util.HashMap<java.lang.String, android.nfc.cardemulation.AidGroup> mStaticAidGroups;
    protected java.util.HashMap<java.lang.String, android.nfc.cardemulation.AidGroup> mDynamicAidGroups;
    protected boolean mRequiresDeviceUnlock;
    protected int mBannerResourceId;
    protected int mUid;
    protected java.lang.String mSettingsActivityName;
    public static final android.os.Parcelable.Creator<android.nfc.cardemulation.ApduServiceInfo> CREATOR = null;
    public ApduServiceInfo(android.content.pm.ResolveInfo p0, boolean p1, java.lang.String p2, java.util.ArrayList<android.nfc.cardemulation.AidGroup> p3, java.util.ArrayList<android.nfc.cardemulation.AidGroup> p4, boolean p5, int p6, int p7, java.lang.String p8, java.lang.String p9, java.lang.String p10) {}
    public ApduServiceInfo(android.content.pm.PackageManager p0, android.content.pm.ResolveInfo p1, boolean p2) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {}
    public android.content.ComponentName getComponent() { return null; }
    public java.lang.String getOffHostSecureElement() { return null; }
    public java.util.List<java.lang.String> getAids() { return null; }
    public java.util.List<java.lang.String> getPrefixAids() { return null; }
    public java.util.List<java.lang.String> getSubsetAids() { return null; }
    public android.nfc.cardemulation.AidGroup getDynamicAidGroupForCategory(java.lang.String p0) { return null; }
    public boolean removeDynamicAidGroupForCategory(java.lang.String p0) { return false; }
    public java.util.ArrayList<android.nfc.cardemulation.AidGroup> getAidGroups() { return null; }
    public java.lang.String getCategoryForAid(java.lang.String p0) { return null; }
    public boolean hasCategory(java.lang.String p0) { return false; }
    public boolean isOnHost() { return false; }
    public boolean requiresUnlock() { return false; }
    public java.lang.String getDescription() { return null; }
    public int getUid() { return 0; }
    public void setOrReplaceDynamicAidGroup(android.nfc.cardemulation.AidGroup p0) {}
    public void setOffHostSecureElement(java.lang.String p0) {}
    public void unsetOffHostSecureElement() {}
    public java.lang.CharSequence loadLabel(android.content.pm.PackageManager p0) { return null; }
    public java.lang.CharSequence loadAppLabel(android.content.pm.PackageManager p0) { return null; }
    public android.graphics.drawable.Drawable loadIcon(android.content.pm.PackageManager p0) { return null; }
    public android.graphics.drawable.Drawable loadBanner(android.content.pm.PackageManager p0) { return null; }
    public java.lang.String getSettingsActivityName() { return null; }
    public java.lang.String toString() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public void dump(java.io.FileDescriptor p0, java.io.PrintWriter p1, java.lang.String[] p2) {}
    public void dumpDebug(android.util.proto.ProtoOutputStream p0) {}
}
