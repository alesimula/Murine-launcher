package android.net.wifi.hotspot2.pps;

public final class Credential implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.net.wifi.hotspot2.pps.Credential> CREATOR = null;
    public Credential() {}
    public Credential(android.net.wifi.hotspot2.pps.Credential p0) {}
    public int describeContents() { return 0; }
    public java.security.cert.X509Certificate getCaCertificate() { return null; }
    public android.net.wifi.hotspot2.pps.Credential.CertificateCredential getCertCredential() { return null; }
    public java.security.cert.X509Certificate[] getClientCertificateChain() { return null; }
    public java.security.PrivateKey getClientPrivateKey() { return null; }
    public int getMinimumTlsVersion() { return 0; }
    public java.lang.String getRealm() { return null; }
    public android.net.wifi.hotspot2.pps.Credential.SimCredential getSimCredential() { return null; }
    public android.net.wifi.hotspot2.pps.Credential.UserCredential getUserCredential() { return null; }
    public void setCaCertificate(java.security.cert.X509Certificate p0) {}
    public void setCertCredential(android.net.wifi.hotspot2.pps.Credential.CertificateCredential p0) {}
    public void setClientCertificateChain(java.security.cert.X509Certificate[] p0) {}
    public void setClientPrivateKey(java.security.PrivateKey p0) {}
    public void setMinimumTlsVersion(int p0) throws java.lang.IllegalArgumentException {}
    public void setRealm(java.lang.String p0) {}
    public void setSimCredential(android.net.wifi.hotspot2.pps.Credential.SimCredential p0) {}
    public void setUserCredential(android.net.wifi.hotspot2.pps.Credential.UserCredential p0) {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class CertificateCredential implements android.os.Parcelable {
        @android.annotation.NonNull
        public static final android.os.Parcelable.Creator<android.net.wifi.hotspot2.pps.Credential.CertificateCredential> CREATOR = null;
        public CertificateCredential() {}
        public CertificateCredential(android.net.wifi.hotspot2.pps.Credential.CertificateCredential p0) {}
        public int describeContents() { return 0; }
        public byte[] getCertSha256Fingerprint() { return null; }
        public java.lang.String getCertType() { return null; }
        public void setCertSha256Fingerprint(byte[] p0) {}
        public void setCertType(java.lang.String p0) {}
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }

    public static final class SimCredential implements android.os.Parcelable {
        @android.annotation.NonNull
        public static final android.os.Parcelable.Creator<android.net.wifi.hotspot2.pps.Credential.SimCredential> CREATOR = null;
        public SimCredential() {}
        public SimCredential(android.net.wifi.hotspot2.pps.Credential.SimCredential p0) {}
        public int describeContents() { return 0; }
        public int getEapType() { return 0; }
        public java.lang.String getImsi() { return null; }
        public void setEapType(int p0) {}
        public void setImsi(java.lang.String p0) {}
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }

    public static final class UserCredential implements android.os.Parcelable {
        @android.annotation.NonNull
        public static final android.os.Parcelable.Creator<android.net.wifi.hotspot2.pps.Credential.UserCredential> CREATOR = null;
        public UserCredential() {}
        public UserCredential(android.net.wifi.hotspot2.pps.Credential.UserCredential p0) {}
        public int describeContents() { return 0; }
        public int getEapType() { return 0; }
        public java.lang.String getNonEapInnerMethod() { return null; }
        public java.lang.String getPassword() { return null; }
        public java.lang.String getUsername() { return null; }
        public void setEapType(int p0) {}
        public void setNonEapInnerMethod(java.lang.String p0) {}
        public void setPassword(java.lang.String p0) {}
        public void setUsername(java.lang.String p0) {}
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }
}
