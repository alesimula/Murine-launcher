package android.net.wifi.hotspot2.pps;

public final class Credential implements android.os.Parcelable {
    private static final java.lang.String TAG = "Credential";
    private static final int MAX_REALM_BYTES = 253;
    private long mCreationTimeInMillis;
    private long mExpirationTimeInMillis;
    private java.lang.String mRealm;
    private boolean mCheckAaaServerCertStatus;
    private android.net.wifi.hotspot2.pps.Credential.UserCredential mUserCredential;
    private android.net.wifi.hotspot2.pps.Credential.CertificateCredential mCertCredential;
    private android.net.wifi.hotspot2.pps.Credential.SimCredential mSimCredential;
    private java.security.cert.X509Certificate[] mCaCertificates;
    private java.security.cert.X509Certificate[] mClientCertificateChain;
    private java.security.PrivateKey mClientPrivateKey;
    public static final android.os.Parcelable.Creator<android.net.wifi.hotspot2.pps.Credential> CREATOR = null;
    public void setCreationTimeInMillis(long p0) {}
    public long getCreationTimeInMillis() { return 0L; }
    public void setExpirationTimeInMillis(long p0) {}
    public long getExpirationTimeInMillis() { return 0L; }
    public void setRealm(java.lang.String p0) {}
    public java.lang.String getRealm() { return null; }
    public void setCheckAaaServerCertStatus(boolean p0) {}
    public boolean getCheckAaaServerCertStatus() { return false; }
    public void setUserCredential(android.net.wifi.hotspot2.pps.Credential.UserCredential p0) {}
    public android.net.wifi.hotspot2.pps.Credential.UserCredential getUserCredential() { return null; }
    public void setCertCredential(android.net.wifi.hotspot2.pps.Credential.CertificateCredential p0) {}
    public android.net.wifi.hotspot2.pps.Credential.CertificateCredential getCertCredential() { return null; }
    public void setSimCredential(android.net.wifi.hotspot2.pps.Credential.SimCredential p0) {}
    public android.net.wifi.hotspot2.pps.Credential.SimCredential getSimCredential() { return null; }
    public void setCaCertificate(java.security.cert.X509Certificate p0) {}
    public void setCaCertificates(java.security.cert.X509Certificate[] p0) {}
    public java.security.cert.X509Certificate getCaCertificate() { return null; }
    public java.security.cert.X509Certificate[] getCaCertificates() { return null; }
    public void setClientCertificateChain(java.security.cert.X509Certificate[] p0) {}
    public java.security.cert.X509Certificate[] getClientCertificateChain() { return null; }
    public void setClientPrivateKey(java.security.PrivateKey p0) {}
    public java.security.PrivateKey getClientPrivateKey() { return null; }
    public Credential() {}
    public Credential(android.net.wifi.hotspot2.pps.Credential p0) {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    public boolean validate(boolean p0) { return false; }
    private boolean verifyUserCredential(boolean p0) { return false; }
    private boolean verifyCertCredential(boolean p0) { return false; }
    private boolean verifySimCredential() { return false; }
    private static boolean isPrivateKeyEquals(java.security.PrivateKey p0, java.security.PrivateKey p1) { return false; }
    public static boolean isX509CertificateEquals(java.security.cert.X509Certificate p0, java.security.cert.X509Certificate p1) { return false; }
    private static boolean isX509CertificatesEquals(java.security.cert.X509Certificate[] p0, java.security.cert.X509Certificate[] p1) { return false; }
    private static boolean verifySha256Fingerprint(java.security.cert.X509Certificate[] p0, byte[] p1) throws java.security.NoSuchAlgorithmException, java.security.cert.CertificateEncodingException { return false; }

    public static final class UserCredential implements android.os.Parcelable {
        private static final int MAX_USERNAME_BYTES = 63;
        private static final int MAX_PASSWORD_BYTES = 255;
        public static final java.lang.String AUTH_METHOD_PAP = "PAP";
        public static final java.lang.String AUTH_METHOD_MSCHAP = "MS-CHAP";
        public static final java.lang.String AUTH_METHOD_MSCHAPV2 = "MS-CHAP-V2";
        private static final java.util.Set<java.lang.String> SUPPORTED_AUTH = null;
        private java.lang.String mUsername;
        private java.lang.String mPassword;
        private boolean mMachineManaged;
        private java.lang.String mSoftTokenApp;
        private boolean mAbleToShare;
        private int mEapType;
        private java.lang.String mNonEapInnerMethod;
        public static final android.os.Parcelable.Creator<android.net.wifi.hotspot2.pps.Credential.UserCredential> CREATOR = null;
        public void setUsername(java.lang.String p0) {}
        public java.lang.String getUsername() { return null; }
        public void setPassword(java.lang.String p0) {}
        public java.lang.String getPassword() { return null; }
        public void setMachineManaged(boolean p0) {}
        public boolean getMachineManaged() { return false; }
        public void setSoftTokenApp(java.lang.String p0) {}
        public java.lang.String getSoftTokenApp() { return null; }
        public void setAbleToShare(boolean p0) {}
        public boolean getAbleToShare() { return false; }
        public void setEapType(int p0) {}
        public int getEapType() { return 0; }
        public void setNonEapInnerMethod(java.lang.String p0) {}
        public java.lang.String getNonEapInnerMethod() { return null; }
        public UserCredential() {}
        public UserCredential(android.net.wifi.hotspot2.pps.Credential.UserCredential p0) {}
        public int describeContents() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
        public java.lang.String toString() { return null; }
        public boolean validate() { return false; }
    }

    public static final class SimCredential implements android.os.Parcelable {
        private static final int MAX_IMSI_LENGTH = 15;
        private java.lang.String mImsi;
        private int mEapType;
        public static final android.os.Parcelable.Creator<android.net.wifi.hotspot2.pps.Credential.SimCredential> CREATOR = null;
        public void setImsi(java.lang.String p0) {}
        public java.lang.String getImsi() { return null; }
        public void setEapType(int p0) {}
        public int getEapType() { return 0; }
        public SimCredential() {}
        public SimCredential(android.net.wifi.hotspot2.pps.Credential.SimCredential p0) {}
        public int describeContents() { return 0; }
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
        public java.lang.String toString() { return null; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public boolean validate() { return false; }
        private boolean verifyImsi() { return false; }
    }

    public static final class CertificateCredential implements android.os.Parcelable {
        public static final java.lang.String CERT_TYPE_X509V3 = "x509v3";
        private static final int CERT_SHA256_FINGER_PRINT_LENGTH = 32;
        private java.lang.String mCertType;
        private byte[] mCertSha256Fingerprint;
        public static final android.os.Parcelable.Creator<android.net.wifi.hotspot2.pps.Credential.CertificateCredential> CREATOR = null;
        public void setCertType(java.lang.String p0) {}
        public java.lang.String getCertType() { return null; }
        public void setCertSha256Fingerprint(byte[] p0) {}
        public byte[] getCertSha256Fingerprint() { return null; }
        public CertificateCredential() {}
        public CertificateCredential(android.net.wifi.hotspot2.pps.Credential.CertificateCredential p0) {}
        public int describeContents() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
        public java.lang.String toString() { return null; }
        public boolean validate() { return false; }
    }
}
