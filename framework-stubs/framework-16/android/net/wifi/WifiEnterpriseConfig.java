package android.net.wifi;

public class WifiEnterpriseConfig implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.net.wifi.WifiEnterpriseConfig> CREATOR = null;
    public static final java.lang.String EXTRA_WAPI_AS_CERTIFICATE_DATA = "android.net.wifi.extra.WAPI_AS_CERTIFICATE_DATA";
    public static final java.lang.String EXTRA_WAPI_AS_CERTIFICATE_NAME = "android.net.wifi.extra.WAPI_AS_CERTIFICATE_NAME";
    public static final java.lang.String EXTRA_WAPI_USER_CERTIFICATE_DATA = "android.net.wifi.extra.WAPI_USER_CERTIFICATE_DATA";
    public static final java.lang.String EXTRA_WAPI_USER_CERTIFICATE_NAME = "android.net.wifi.extra.WAPI_USER_CERTIFICATE_NAME";
    public static final int OCSP_NONE = 0;
    public static final int OCSP_REQUEST_CERT_STATUS = 1;
    public static final int OCSP_REQUIRE_ALL_NON_TRUSTED_CERTS_STATUS = 3;
    public static final int OCSP_REQUIRE_CERT_STATUS = 2;
    public static final int TLS_V1_0 = 0;
    public static final int TLS_V1_1 = 1;
    public static final int TLS_V1_2 = 2;
    public static final int TLS_V1_3 = 3;
    public static final java.lang.String WAPI_AS_CERTIFICATE = "WAPIAS_";
    public static final java.lang.String WAPI_USER_CERTIFICATE = "WAPIUSR_";
    public WifiEnterpriseConfig() {}
    public WifiEnterpriseConfig(android.net.wifi.WifiEnterpriseConfig p0) {}
    public int describeContents() { return 0; }
    public void enableTrustOnFirstUse(boolean p0) {}
    public java.lang.String getAltSubjectMatch() { return null; }
    public java.lang.String getAnonymousIdentity() { return null; }
    @android.annotation.Nullable
    public java.security.cert.X509Certificate getCaCertificate() { return null; }
    @android.annotation.Nullable
    public java.lang.String[] getCaCertificateAliases() { return null; }
    @android.annotation.Nullable
    public java.security.cert.X509Certificate[] getCaCertificates() { return null; }
    @android.annotation.NonNull
    public java.lang.String getCaPath() { return null; }
    public java.security.cert.X509Certificate getClientCertificate() { return null; }
    @android.annotation.NonNull
    public java.lang.String getClientCertificateAlias() { return null; }
    @android.annotation.Nullable
    public java.security.cert.X509Certificate[] getClientCertificateChain() { return null; }
    @android.annotation.Nullable
    public java.lang.String getClientKeyPairAlias() { return null; }
    @android.annotation.Nullable
    public java.security.PrivateKey getClientPrivateKey() { return null; }
    @android.annotation.Nullable
    public java.lang.String getDecoratedIdentityPrefix() { return null; }
    public java.lang.String getDomainSuffixMatch() { return null; }
    public int getEapMethod() { return 0; }
    public java.lang.String getIdentity() { return null; }
    public int getMinimumTlsVersion() { return 0; }
    public int getOcsp() { return 0; }
    public java.lang.String getPassword() { return null; }
    public int getPhase2Method() { return 0; }
    public java.lang.String getPlmn() { return null; }
    public java.lang.String getRealm() { return null; }
    @java.lang.Deprecated
    public java.lang.String getSubjectMatch() { return null; }
    @android.annotation.NonNull
    public java.lang.String getWapiCertSuite() { return null; }
    public boolean hasCaCertificate() { return false; }
    public boolean isAuthenticationSimBased() { return false; }
    public boolean isEapMethodServerCertUsed() { return false; }
    public boolean isServerCertValidationEnabled() { return false; }
    public boolean isTrustOnFirstUseEnabled() { return false; }
    public void setAltSubjectMatch(java.lang.String p0) {}
    public void setAnonymousIdentity(java.lang.String p0) {}
    public void setCaCertificate(java.security.cert.X509Certificate p0) {}
    public void setCaCertificateAliases(java.lang.String[] p0) {}
    public void setCaCertificates(java.security.cert.X509Certificate[] p0) {}
    public void setCaPath(java.lang.String p0) {}
    public void setClientCertificateAlias(java.lang.String p0) {}
    public void setClientKeyEntry(java.security.PrivateKey p0, java.security.cert.X509Certificate p1) {}
    public void setClientKeyEntryWithCertificateChain(java.security.PrivateKey p0, java.security.cert.X509Certificate[] p1) {}
    public void setClientKeyPairAlias(java.lang.String p0) {}
    public void setDecoratedIdentityPrefix(java.lang.String p0) {}
    public void setDomainSuffixMatch(java.lang.String p0) {}
    public void setEapMethod(int p0) {}
    public void setIdentity(java.lang.String p0) {}
    public void setMinimumTlsVersion(int p0) throws java.lang.IllegalArgumentException {}
    public void setOcsp(int p0) {}
    public void setPassword(java.lang.String p0) {}
    public void setPhase2Method(int p0) {}
    public void setPlmn(java.lang.String p0) {}
    public void setRealm(java.lang.String p0) {}
    @java.lang.Deprecated
    public void setSubjectMatch(java.lang.String p0) {}
    public void setWapiCertSuite(java.lang.String p0) {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Eap {
        public static final int AKA = 5;
        public static final int AKA_PRIME = 6;
        public static final int NONE = -1;
        public static final int PEAP = 0;
        public static final int PWD = 3;
        public static final int SIM = 4;
        public static final int TLS = 1;
        public static final int TTLS = 2;
        public static final int UNAUTH_TLS = 7;
        public static final int WAPI_CERT = 8;
        Eap() {}
    }

    public static final class Phase2 {
        public static final int AKA = 6;
        public static final int AKA_PRIME = 7;
        public static final int GTC = 4;
        public static final int MSCHAP = 2;
        public static final int MSCHAPV2 = 3;
        public static final int NONE = 0;
        public static final int PAP = 1;
        public static final int SIM = 5;
        Phase2() {}
    }
}
