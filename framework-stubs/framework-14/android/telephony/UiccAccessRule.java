package android.telephony;

@android.annotation.SystemApi
public final class UiccAccessRule implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.telephony.UiccAccessRule> CREATOR = null;
    public static byte[] encodeRules(android.telephony.UiccAccessRule[] p0) { return null; }
    public static android.telephony.UiccAccessRule[] decodeRulesFromCarrierConfig(java.lang.String[] p0) { return null; }
    public static android.telephony.UiccAccessRule[] decodeRules(byte[] p0) { return null; }
    public UiccAccessRule(byte[] p0, java.lang.String p1, long p2) {}
    UiccAccessRule(android.os.Parcel p0) {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public java.lang.String getPackageName() { return null; }
    public java.lang.String getCertificateHexString() { return null; }
    public int getCarrierPrivilegeStatus(android.content.pm.PackageInfo p0) { return 0; }
    public int getCarrierPrivilegeStatus(android.content.pm.Signature p0, java.lang.String p1) { return 0; }
    public boolean matches(java.lang.String p0, java.lang.String p1) { return false; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
    public static java.util.List<android.content.pm.Signature> getSignatures(android.content.pm.PackageInfo p0) { return null; }
    public static byte[] getCertHash(android.content.pm.Signature p0, java.lang.String p1) { return null; }
}
