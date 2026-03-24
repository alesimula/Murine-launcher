package android.content.pm;

public final class ApkChecksum implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.content.pm.ApkChecksum> CREATOR = null;
    public ApkChecksum(java.lang.String p0, int p1, byte[] p2) {}
    public ApkChecksum(java.lang.String p0, int p1, byte[] p2, java.lang.String p3, java.security.cert.Certificate p4) throws java.security.cert.CertificateEncodingException {}
    public int getType() { return 0; }
    public byte[] getValue() { return null; }
    public byte[] getInstallerCertificateBytes() { return null; }
    public java.security.cert.Certificate getInstallerCertificate() throws java.security.cert.CertificateException { return null; }
    public ApkChecksum(java.lang.String p0, android.content.pm.Checksum p1, java.lang.String p2, byte[] p3) {}
    public java.lang.String getSplitName() { return null; }
    public java.lang.String getInstallerPackageName() { return null; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    ApkChecksum(android.os.Parcel p0) {}
}
