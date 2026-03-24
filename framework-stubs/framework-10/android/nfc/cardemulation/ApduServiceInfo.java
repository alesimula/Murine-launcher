package android.nfc.cardemulation;

public final class ApduServiceInfo implements android.os.Parcelable {
    static final java.lang.String TAG = "ApduServiceInfo";
    @android.annotation.UnsupportedAppUsage
    final android.content.pm.ResolveInfo mService = null;
    final java.lang.String mDescription = null;
    final boolean mOnHost = false;
    java.lang.String mOffHostName;
    final java.lang.String mStaticOffHostName = null;
    @android.annotation.UnsupportedAppUsage
    final java.util.HashMap<java.lang.String, android.nfc.cardemulation.AidGroup> mStaticAidGroups = null;
    @android.annotation.UnsupportedAppUsage
    final java.util.HashMap<java.lang.String, android.nfc.cardemulation.AidGroup> mDynamicAidGroups = null;
    final boolean mRequiresDeviceUnlock = false;
    final int mBannerResourceId = 0;
    final int mUid = 0;
    final java.lang.String mSettingsActivityName = null;
    @android.annotation.UnsupportedAppUsage
    public static final android.os.Parcelable.Creator<android.nfc.cardemulation.ApduServiceInfo> CREATOR = null;
    @android.annotation.UnsupportedAppUsage
    public ApduServiceInfo(android.content.pm.ResolveInfo p0, java.lang.String p1, java.util.ArrayList<android.nfc.cardemulation.AidGroup> p2, java.util.ArrayList<android.nfc.cardemulation.AidGroup> p3, boolean p4, int p5, int p6, java.lang.String p7, java.lang.String p8, java.lang.String p9) {}
    @android.annotation.UnsupportedAppUsage
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
    @android.annotation.UnsupportedAppUsage
    public boolean isOnHost() { return false; }
    @android.annotation.UnsupportedAppUsage
    public boolean requiresUnlock() { return false; }
    @android.annotation.UnsupportedAppUsage
    public java.lang.String getDescription() { return null; }
    @android.annotation.UnsupportedAppUsage
    public int getUid() { return 0; }
    public void setOrReplaceDynamicAidGroup(android.nfc.cardemulation.AidGroup p0) {}
    public void setOffHostSecureElement(java.lang.String p0) {}
    public void unsetOffHostSecureElement() {}
    public java.lang.CharSequence loadLabel(android.content.pm.PackageManager p0) { return null; }
    public java.lang.CharSequence loadAppLabel(android.content.pm.PackageManager p0) { return null; }
    public android.graphics.drawable.Drawable loadIcon(android.content.pm.PackageManager p0) { return null; }
    @android.annotation.UnsupportedAppUsage
    public android.graphics.drawable.Drawable loadBanner(android.content.pm.PackageManager p0) { return null; }
    @android.annotation.UnsupportedAppUsage
    public java.lang.String getSettingsActivityName() { return null; }
    public java.lang.String toString() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public void dump(java.io.FileDescriptor p0, java.io.PrintWriter p1, java.lang.String[] p2) {}
}
