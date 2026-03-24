package android.security.keystore.recovery;

public final class RecoveryCertPath implements android.os.Parcelable {
    private static final java.lang.String CERT_PATH_ENCODING = "PkiPath";
    private final byte[] mEncodedCertPath = null;
    public static final android.os.Parcelable.Creator<android.security.keystore.recovery.RecoveryCertPath> CREATOR = null;
    public static android.security.keystore.recovery.RecoveryCertPath createRecoveryCertPath(java.security.cert.CertPath p0) throws java.security.cert.CertificateException { return null; }
    public java.security.cert.CertPath getCertPath() throws java.security.cert.CertificateException { return null; }
    private RecoveryCertPath(byte[] p0) {}
    private RecoveryCertPath(android.os.Parcel p0) {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    private static byte[] encodeCertPath(java.security.cert.CertPath p0) throws java.security.cert.CertificateEncodingException { return null; }
    private static java.security.cert.CertPath decodeCertPath(byte[] p0) throws java.security.cert.CertificateException { return null; }
}
