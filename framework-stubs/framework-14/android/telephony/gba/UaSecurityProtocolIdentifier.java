package android.telephony.gba;

@android.annotation.SystemApi
public final class UaSecurityProtocolIdentifier implements android.os.Parcelable {
    public static final int ORG_NONE = 0;
    public static final int ORG_3GPP = 1;
    public static final int ORG_3GPP2 = 2;
    public static final int ORG_OMA = 3;
    public static final int ORG_GSMA = 4;
    public static final int ORG_LOCAL = 255;
    public static final int UA_SECURITY_PROTOCOL_3GPP_SUBSCRIBER_CERTIFICATE = 0;
    public static final int UA_SECURITY_PROTOCOL_3GPP_MBMS = 1;
    public static final int UA_SECURITY_PROTOCOL_3GPP_HTTP_DIGEST_AUTHENTICATION = 2;
    public static final int UA_SECURITY_PROTOCOL_3GPP_HTTP_BASED_MBMS = 3;
    public static final int UA_SECURITY_PROTOCOL_3GPP_SIP_BASED_MBMS = 4;
    public static final int UA_SECURITY_PROTOCOL_3GPP_GENERIC_PUSH_LAYER = 5;
    public static final int UA_SECURITY_PROTOCOL_3GPP_IMS_MEDIA_PLANE = 6;
    public static final int UA_SECURITY_PROTOCOL_3GPP_GENERATION_TMPI = 256;
    public static final int UA_SECURITY_PROTOCOL_3GPP_TLS_DEFAULT = 65536;
    public static final int UA_SECURITY_PROTOCOL_3GPP_TLS_BROWSER = 131072;
    public static final android.os.Parcelable.Creator<android.telephony.gba.UaSecurityProtocolIdentifier> CREATOR = null;
    public byte[] toByteArray() { return null; }
    public int getOrg() { return 0; }
    public int getProtocol() { return 0; }
    public int getTlsCipherSuite() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    public java.lang.String toString() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }

    public static final class Builder {
        public Builder() {}
        public Builder(android.telephony.gba.UaSecurityProtocolIdentifier p0) {}
        public android.telephony.gba.UaSecurityProtocolIdentifier.Builder setOrg(int p0) { return null; }
        public android.telephony.gba.UaSecurityProtocolIdentifier.Builder setProtocol(int p0) { return null; }
        public android.telephony.gba.UaSecurityProtocolIdentifier.Builder setTlsCipherSuite(int p0) { return null; }
        public android.telephony.gba.UaSecurityProtocolIdentifier build() { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface OrganizationCode {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface UaSecurityProtocol3gpp {
    }
}
