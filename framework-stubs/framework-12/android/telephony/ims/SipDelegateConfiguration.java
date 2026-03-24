package android.telephony.ims;

@android.annotation.SystemApi
public final class SipDelegateConfiguration implements android.os.Parcelable {
    public static final int SIP_TRANSPORT_UDP = 0;
    public static final int SIP_TRANSPORT_TCP = 1;
    public static final int UDP_PAYLOAD_SIZE_UNDEFINED = -1;
    private final long mVersion = 0L;
    private final int mTransportType = 0;
    private final java.net.InetSocketAddress mLocalAddress = null;
    private final java.net.InetSocketAddress mSipServerAddress = null;
    private boolean mIsSipCompactFormEnabled;
    private boolean mIsSipKeepaliveEnabled;
    private int mMaxUdpPayloadSize;
    private java.lang.String mPublicUserIdentifier;
    private java.lang.String mPrivateUserIdentifier;
    private java.lang.String mHomeDomain;
    private java.lang.String mImei;
    private android.net.Uri mGruu;
    private java.lang.String mSipAuthHeader;
    private java.lang.String mSipAuthNonce;
    private java.lang.String mServiceRouteHeader;
    private java.lang.String mPathHeader;
    private java.lang.String mUserAgentHeader;
    private java.lang.String mContactUserParam;
    private java.lang.String mPaniHeader;
    private java.lang.String mPlaniHeader;
    private java.lang.String mCniHeader;
    private java.lang.String mAssociatedUriHeader;
    private android.telephony.ims.SipDelegateConfiguration.IpSecConfiguration mIpSecConfiguration;
    private java.net.InetSocketAddress mNatAddress;
    public static final android.os.Parcelable.Creator<android.telephony.ims.SipDelegateConfiguration> CREATOR = null;
    private SipDelegateConfiguration(long p0, int p1, java.net.InetSocketAddress p2, java.net.InetSocketAddress p3) {}
    private SipDelegateConfiguration(android.os.Parcel p0) {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public android.telephony.ims.SipDelegateConfiguration copyAndIncrementVersion() { return null; }
    public long getVersion() { return 0L; }
    public int getTransportType() { return 0; }
    public java.net.InetSocketAddress getLocalAddress() { return null; }
    public java.net.InetSocketAddress getSipServerAddress() { return null; }
    public boolean isSipCompactFormEnabled() { return false; }
    public boolean isSipKeepaliveEnabled() { return false; }
    public int getMaxUdpPayloadSizeBytes() { return 0; }
    public java.lang.String getPublicUserIdentifier() { return null; }
    public java.lang.String getPrivateUserIdentifier() { return null; }
    public java.lang.String getHomeDomain() { return null; }
    public java.lang.String getImei() { return null; }
    public android.telephony.ims.SipDelegateConfiguration.IpSecConfiguration getIpSecConfiguration() { return null; }
    public java.net.InetSocketAddress getNatSocketAddress() { return null; }
    public android.net.Uri getPublicGruuUri() { return null; }
    public java.lang.String getSipAuthenticationHeader() { return null; }
    public java.lang.String getSipAuthenticationNonce() { return null; }
    public java.lang.String getSipServiceRouteHeader() { return null; }
    public java.lang.String getSipPathHeader() { return null; }
    public java.lang.String getSipUserAgentHeader() { return null; }
    public java.lang.String getSipContactUserParameter() { return null; }
    public java.lang.String getSipPaniHeader() { return null; }
    public java.lang.String getSipPlaniHeader() { return null; }
    public java.lang.String getSipCniHeader() { return null; }
    public java.lang.String getSipAssociatedUriHeader() { return null; }
    private void writeAddressToParcel(java.net.InetSocketAddress p0, android.os.Parcel p1) {}
    private java.net.InetSocketAddress readAddressFromParcel(android.os.Parcel p0) { return null; }
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }

    public static final class Builder {
        private final android.telephony.ims.SipDelegateConfiguration mConfig = null;
        public Builder(long p0, int p1, java.net.InetSocketAddress p2, java.net.InetSocketAddress p3) {}
        public Builder(android.telephony.ims.SipDelegateConfiguration p0) {}
        public android.telephony.ims.SipDelegateConfiguration.Builder setSipCompactFormEnabled(boolean p0) { return null; }
        public android.telephony.ims.SipDelegateConfiguration.Builder setSipKeepaliveEnabled(boolean p0) { return null; }
        public android.telephony.ims.SipDelegateConfiguration.Builder setMaxUdpPayloadSizeBytes(int p0) { return null; }
        public android.telephony.ims.SipDelegateConfiguration.Builder setPublicUserIdentifier(java.lang.String p0) { return null; }
        public android.telephony.ims.SipDelegateConfiguration.Builder setPrivateUserIdentifier(java.lang.String p0) { return null; }
        public android.telephony.ims.SipDelegateConfiguration.Builder setHomeDomain(java.lang.String p0) { return null; }
        public android.telephony.ims.SipDelegateConfiguration.Builder setImei(java.lang.String p0) { return null; }
        public android.telephony.ims.SipDelegateConfiguration.Builder setIpSecConfiguration(android.telephony.ims.SipDelegateConfiguration.IpSecConfiguration p0) { return null; }
        public android.telephony.ims.SipDelegateConfiguration.Builder setNatSocketAddress(java.net.InetSocketAddress p0) { return null; }
        public android.telephony.ims.SipDelegateConfiguration.Builder setPublicGruuUri(android.net.Uri p0) { return null; }
        public android.telephony.ims.SipDelegateConfiguration.Builder setSipAuthenticationHeader(java.lang.String p0) { return null; }
        public android.telephony.ims.SipDelegateConfiguration.Builder setSipAuthenticationNonce(java.lang.String p0) { return null; }
        public android.telephony.ims.SipDelegateConfiguration.Builder setSipServiceRouteHeader(java.lang.String p0) { return null; }
        public android.telephony.ims.SipDelegateConfiguration.Builder setSipPathHeader(java.lang.String p0) { return null; }
        public android.telephony.ims.SipDelegateConfiguration.Builder setSipUserAgentHeader(java.lang.String p0) { return null; }
        public android.telephony.ims.SipDelegateConfiguration.Builder setSipContactUserParameter(java.lang.String p0) { return null; }
        public android.telephony.ims.SipDelegateConfiguration.Builder setSipPaniHeader(java.lang.String p0) { return null; }
        public android.telephony.ims.SipDelegateConfiguration.Builder setSipPlaniHeader(java.lang.String p0) { return null; }
        public android.telephony.ims.SipDelegateConfiguration.Builder setSipCniHeader(java.lang.String p0) { return null; }
        public android.telephony.ims.SipDelegateConfiguration.Builder setSipAssociatedUriHeader(java.lang.String p0) { return null; }
        public android.telephony.ims.SipDelegateConfiguration build() { return null; }
    }

    public static final class IpSecConfiguration {
        private final int mLocalTxPort = 0;
        private final int mLocalRxPort = 0;
        private final int mLastLocalTxPort = 0;
        private final int mRemoteTxPort = 0;
        private final int mRemoteRxPort = 0;
        private final int mLastRemoteTxPort = 0;
        private final java.lang.String mSecurityHeader = null;
        public IpSecConfiguration(int p0, int p1, int p2, int p3, int p4, int p5, java.lang.String p6) {}
        public int getLocalTxPort() { return 0; }
        public int getLocalRxPort() { return 0; }
        public int getLastLocalTxPort() { return 0; }
        public int getRemoteTxPort() { return 0; }
        public int getRemoteRxPort() { return 0; }
        public int getLastRemoteTxPort() { return 0; }
        public java.lang.String getSipSecurityVerifyHeader() { return null; }
        public void addToParcel(android.os.Parcel p0) {}
        public static android.telephony.ims.SipDelegateConfiguration.IpSecConfiguration fromParcel(android.os.Parcel p0) { return null; }
        public java.lang.String toString() { return null; }
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface TransportType {
    }
}
