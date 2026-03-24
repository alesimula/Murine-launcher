package android.net.wifi.hotspot2.pps;

public final class UpdateParameter implements android.os.Parcelable {
    private static final java.lang.String TAG = "UpdateParameter";
    public static final long UPDATE_CHECK_INTERVAL_NEVER = 4294967295L;
    public static final java.lang.String UPDATE_METHOD_OMADM = "OMA-DM-ClientInitiated";
    public static final java.lang.String UPDATE_METHOD_SSP = "SSP-ClientInitiated";
    public static final java.lang.String UPDATE_RESTRICTION_HOMESP = "HomeSP";
    public static final java.lang.String UPDATE_RESTRICTION_ROAMING_PARTNER = "RoamingPartner";
    public static final java.lang.String UPDATE_RESTRICTION_UNRESTRICTED = "Unrestricted";
    private static final int MAX_URI_BYTES = 1023;
    private static final int MAX_URL_BYTES = 1023;
    private static final int MAX_USERNAME_BYTES = 63;
    private static final int MAX_PASSWORD_BYTES = 255;
    private static final int CERTIFICATE_SHA256_BYTES = 32;
    private long mUpdateIntervalInMinutes;
    private java.lang.String mUpdateMethod;
    private java.lang.String mRestriction;
    private java.lang.String mServerUri;
    private java.lang.String mUsername;
    private java.lang.String mBase64EncodedPassword;
    private java.lang.String mTrustRootCertUrl;
    private byte[] mTrustRootCertSha256Fingerprint;
    private java.security.cert.X509Certificate mCaCertificate;
    public static final android.os.Parcelable.Creator<android.net.wifi.hotspot2.pps.UpdateParameter> CREATOR = null;
    public void setUpdateIntervalInMinutes(long p0) {}
    public long getUpdateIntervalInMinutes() { return 0L; }
    public void setUpdateMethod(java.lang.String p0) {}
    public java.lang.String getUpdateMethod() { return null; }
    public void setRestriction(java.lang.String p0) {}
    public java.lang.String getRestriction() { return null; }
    public void setServerUri(java.lang.String p0) {}
    public java.lang.String getServerUri() { return null; }
    public void setUsername(java.lang.String p0) {}
    public java.lang.String getUsername() { return null; }
    public void setBase64EncodedPassword(java.lang.String p0) {}
    public java.lang.String getBase64EncodedPassword() { return null; }
    public void setTrustRootCertUrl(java.lang.String p0) {}
    public java.lang.String getTrustRootCertUrl() { return null; }
    public void setTrustRootCertSha256Fingerprint(byte[] p0) {}
    public byte[] getTrustRootCertSha256Fingerprint() { return null; }
    public void setCaCertificate(java.security.cert.X509Certificate p0) {}
    public java.security.cert.X509Certificate getCaCertificate() { return null; }
    public UpdateParameter() {}
    public UpdateParameter(android.net.wifi.hotspot2.pps.UpdateParameter p0) {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    public boolean validate() { return false; }
}
