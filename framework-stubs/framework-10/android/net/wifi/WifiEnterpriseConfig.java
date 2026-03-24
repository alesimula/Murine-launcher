package android.net.wifi;

public class WifiEnterpriseConfig implements android.os.Parcelable {
    public static final java.lang.String EMPTY_VALUE = "NULL";
    public static final java.lang.String EAP_KEY = "eap";
    public static final java.lang.String PHASE2_KEY = "phase2";
    public static final java.lang.String IDENTITY_KEY = "identity";
    public static final java.lang.String ANON_IDENTITY_KEY = "anonymous_identity";
    public static final java.lang.String PASSWORD_KEY = "password";
    public static final java.lang.String SUBJECT_MATCH_KEY = "subject_match";
    public static final java.lang.String ALTSUBJECT_MATCH_KEY = "altsubject_match";
    public static final java.lang.String DOM_SUFFIX_MATCH_KEY = "domain_suffix_match";
    public static final java.lang.String OPP_KEY_CACHING = "proactive_key_caching";
    public static final java.lang.String ENGINE_ID_KEYSTORE = "keystore";
    public static final java.lang.String KEYSTORE_URI = "keystore://";
    public static final java.lang.String KEYSTORES_URI = "keystores://";
    public static final java.lang.String ENGINE_ENABLE = "1";
    public static final java.lang.String ENGINE_DISABLE = "0";
    public static final java.lang.String CA_CERT_PREFIX = "keystore://CACERT_";
    public static final java.lang.String CLIENT_CERT_PREFIX = "keystore://USRCERT_";
    public static final java.lang.String CLIENT_CERT_KEY = "client_cert";
    public static final java.lang.String CA_CERT_KEY = "ca_cert";
    public static final java.lang.String CA_PATH_KEY = "ca_path";
    public static final java.lang.String ENGINE_KEY = "engine";
    public static final java.lang.String ENGINE_ID_KEY = "engine_id";
    public static final java.lang.String PRIVATE_KEY_ID_KEY = "key_id";
    public static final java.lang.String REALM_KEY = "realm";
    public static final java.lang.String PLMN_KEY = "plmn";
    public static final java.lang.String CA_CERT_ALIAS_DELIMITER = " ";
    private static final java.lang.String[] SUPPLICANT_CONFIG_KEYS = null;
    private static final java.util.List<java.lang.String> UNQUOTED_KEYS = null;
    @android.annotation.UnsupportedAppUsage
    private java.util.HashMap<java.lang.String, java.lang.String> mFields;
    private java.security.cert.X509Certificate[] mCaCerts;
    private java.security.PrivateKey mClientPrivateKey;
    private java.security.cert.X509Certificate[] mClientCertificateChain;
    private int mEapMethod;
    private int mPhase2Method;
    private boolean mIsAppInstalledDeviceKeyAndCert;
    private boolean mIsAppInstalledCaCert;
    private static final java.lang.String TAG = "WifiEnterpriseConfig";
    public static final android.os.Parcelable.Creator<android.net.wifi.WifiEnterpriseConfig> CREATOR = null;
    public WifiEnterpriseConfig() {}
    private void copyFrom(android.net.wifi.WifiEnterpriseConfig p0, boolean p1, java.lang.String p2) {}
    public WifiEnterpriseConfig(android.net.wifi.WifiEnterpriseConfig p0) {}
    public void copyFromExternal(android.net.wifi.WifiEnterpriseConfig p0, java.lang.String p1) {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public boolean saveToSupplicant(android.net.wifi.WifiEnterpriseConfig.SupplicantSaver p0) { return false; }
    public void loadFromSupplicant(android.net.wifi.WifiEnterpriseConfig.SupplicantLoader p0) {}
    public void setEapMethod(int p0) {}
    public int getEapMethod() { return 0; }
    public void setPhase2Method(int p0) {}
    public int getPhase2Method() { return 0; }
    public void setIdentity(java.lang.String p0) {}
    public java.lang.String getIdentity() { return null; }
    public void setAnonymousIdentity(java.lang.String p0) {}
    public java.lang.String getAnonymousIdentity() { return null; }
    public void setPassword(java.lang.String p0) {}
    public java.lang.String getPassword() { return null; }
    public static java.lang.String encodeCaCertificateAlias(java.lang.String p0) { return null; }
    public static java.lang.String decodeCaCertificateAlias(java.lang.String p0) { return null; }
    @android.annotation.UnsupportedAppUsage
    public void setCaCertificateAlias(java.lang.String p0) {}
    public void setCaCertificateAliases(java.lang.String[] p0) {}
    @android.annotation.UnsupportedAppUsage
    public java.lang.String getCaCertificateAlias() { return null; }
    public java.lang.String[] getCaCertificateAliases() { return null; }
    public void setCaCertificate(java.security.cert.X509Certificate p0) {}
    public java.security.cert.X509Certificate getCaCertificate() { return null; }
    public void setCaCertificates(java.security.cert.X509Certificate[] p0) {}
    public java.security.cert.X509Certificate[] getCaCertificates() { return null; }
    public void resetCaCertificate() {}
    public void setCaPath(java.lang.String p0) {}
    public java.lang.String getCaPath() { return null; }
    @android.annotation.UnsupportedAppUsage
    public void setClientCertificateAlias(java.lang.String p0) {}
    @android.annotation.UnsupportedAppUsage
    public java.lang.String getClientCertificateAlias() { return null; }
    public void setClientKeyEntry(java.security.PrivateKey p0, java.security.cert.X509Certificate p1) {}
    public void setClientKeyEntryWithCertificateChain(java.security.PrivateKey p0, java.security.cert.X509Certificate[] p1) {}
    public java.security.cert.X509Certificate getClientCertificate() { return null; }
    public java.security.cert.X509Certificate[] getClientCertificateChain() { return null; }
    public void resetClientKeyEntry() {}
    public java.security.PrivateKey getClientPrivateKey() { return null; }
    public void setSubjectMatch(java.lang.String p0) {}
    public java.lang.String getSubjectMatch() { return null; }
    public void setAltSubjectMatch(java.lang.String p0) {}
    public java.lang.String getAltSubjectMatch() { return null; }
    public void setDomainSuffixMatch(java.lang.String p0) {}
    public java.lang.String getDomainSuffixMatch() { return null; }
    public void setRealm(java.lang.String p0) {}
    public java.lang.String getRealm() { return null; }
    public void setPlmn(java.lang.String p0) {}
    public java.lang.String getPlmn() { return null; }
    public java.lang.String getKeyId(android.net.wifi.WifiEnterpriseConfig p0) { return null; }
    private java.lang.String removeDoubleQuotes(java.lang.String p0) { return null; }
    private java.lang.String convertToQuotedString(java.lang.String p0) { return null; }
    private int getStringIndex(java.lang.String[] p0, java.lang.String p1, int p2) { return 0; }
    private java.lang.String getFieldValue(java.lang.String p0, java.lang.String p1) { return null; }
    public java.lang.String getFieldValue(java.lang.String p0) { return null; }
    private void setFieldValue(java.lang.String p0, java.lang.String p1, java.lang.String p2) {}
    public void setFieldValue(java.lang.String p0, java.lang.String p1) {}
    public java.lang.String toString() { return null; }
    private boolean isEapMethodValid() { return false; }
    public boolean isAppInstalledDeviceKeyAndCert() { return false; }
    public boolean isAppInstalledCaCert() { return false; }

    public static interface SupplicantSaver {
        public boolean saveValue(java.lang.String p0, java.lang.String p1);
    }

    public static interface SupplicantLoader {
        public java.lang.String loadValue(java.lang.String p0);
    }

    public static final class Phase2 {
        public static final int NONE = 0;
        public static final int PAP = 1;
        public static final int MSCHAP = 2;
        public static final int MSCHAPV2 = 3;
        public static final int GTC = 4;
        public static final int SIM = 5;
        public static final int AKA = 6;
        public static final int AKA_PRIME = 7;
        private static final java.lang.String AUTH_PREFIX = "auth=";
        private static final java.lang.String AUTHEAP_PREFIX = "autheap=";
        public static final java.lang.String[] strings = null;
        private Phase2() {}
    }

    public static final class Eap {
        public static final int NONE = -1;
        public static final int PEAP = 0;
        public static final int TLS = 1;
        public static final int TTLS = 2;
        public static final int PWD = 3;
        public static final int SIM = 4;
        public static final int AKA = 5;
        public static final int AKA_PRIME = 6;
        public static final int UNAUTH_TLS = 7;
        public static final java.lang.String[] strings = null;
        private Eap() {}
    }
}
