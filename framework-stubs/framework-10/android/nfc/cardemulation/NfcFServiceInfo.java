package android.nfc.cardemulation;

public final class NfcFServiceInfo implements android.os.Parcelable {
    static final java.lang.String TAG = "NfcFServiceInfo";
    private static final java.lang.String DEFAULT_T3T_PMM = "FFFFFFFFFFFFFFFF";
    final android.content.pm.ResolveInfo mService = null;
    final java.lang.String mDescription = null;
    final java.lang.String mSystemCode = null;
    java.lang.String mDynamicSystemCode;
    final java.lang.String mNfcid2 = null;
    java.lang.String mDynamicNfcid2;
    final int mUid = 0;
    final java.lang.String mT3tPmm = null;
    public static final android.os.Parcelable.Creator<android.nfc.cardemulation.NfcFServiceInfo> CREATOR = null;
    public NfcFServiceInfo(android.content.pm.ResolveInfo p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, java.lang.String p4, java.lang.String p5, int p6, java.lang.String p7) {}
    public NfcFServiceInfo(android.content.pm.PackageManager p0, android.content.pm.ResolveInfo p1) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {}
    public android.content.ComponentName getComponent() { return null; }
    public java.lang.String getSystemCode() { return null; }
    public void setOrReplaceDynamicSystemCode(java.lang.String p0) {}
    public java.lang.String getNfcid2() { return null; }
    public void setOrReplaceDynamicNfcid2(java.lang.String p0) {}
    public java.lang.String getDescription() { return null; }
    public int getUid() { return 0; }
    public java.lang.String getT3tPmm() { return null; }
    public java.lang.CharSequence loadLabel(android.content.pm.PackageManager p0) { return null; }
    public android.graphics.drawable.Drawable loadIcon(android.content.pm.PackageManager p0) { return null; }
    public java.lang.String toString() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public void dump(java.io.FileDescriptor p0, java.io.PrintWriter p1, java.lang.String[] p2) {}
}
