package android.telephony;

@android.annotation.SystemApi
public final class UiccAccessRule implements android.os.Parcelable {
    private static final java.lang.String TAG = "UiccAccessRule";
    private static final int ENCODING_VERSION = 1;
    public static final android.os.Parcelable.Creator<android.telephony.UiccAccessRule> CREATOR = null;
    private final byte[] mCertificateHash = null;
    private final java.lang.String mPackageName = null;
    private final long mAccessType = 0L;
    public static byte[] encodeRules(android.telephony.UiccAccessRule[] p0) { return null; }
    public static android.telephony.UiccAccessRule[] decodeRules(byte[] p0) { return null; }
    public UiccAccessRule(byte[] p0, java.lang.String p1, long p2) {}
    UiccAccessRule(android.os.Parcel p0) {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public java.lang.String getPackageName() { return null; }
    public java.lang.String getCertificateHexString() { return null; }
    public int getCarrierPrivilegeStatus(android.content.pm.PackageInfo p0) { return 0; }
    public int getCarrierPrivilegeStatus(android.content.pm.Signature p0, java.lang.String p1) { return 0; }
    private boolean matches(byte[] p0, java.lang.String p1) { return false; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
    private static byte[] getCertHash(android.content.pm.Signature p0, java.lang.String p1) { return null; }
}
