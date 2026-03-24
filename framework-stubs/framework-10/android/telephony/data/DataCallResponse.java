package android.telephony.data;

@android.annotation.SystemApi
public final class DataCallResponse implements android.os.Parcelable {
    public static final int LINK_STATUS_UNKNOWN = -1;
    public static final int LINK_STATUS_INACTIVE = 0;
    public static final int LINK_STATUS_DORMANT = 1;
    public static final int LINK_STATUS_ACTIVE = 2;
    private final int mCause = 0;
    private final int mSuggestedRetryTime = 0;
    private final int mId = 0;
    private final int mLinkStatus = 0;
    private final int mProtocolType = 0;
    private final java.lang.String mInterfaceName = null;
    private final java.util.List<android.net.LinkAddress> mAddresses = null;
    private final java.util.List<java.net.InetAddress> mDnsAddresses = null;
    private final java.util.List<java.net.InetAddress> mGatewayAddresses = null;
    private final java.util.List<java.net.InetAddress> mPcscfAddresses = null;
    private final int mMtu = 0;
    public static final android.os.Parcelable.Creator<android.telephony.data.DataCallResponse> CREATOR = null;
    public DataCallResponse(int p0, int p1, int p2, int p3, int p4, java.lang.String p5, java.util.List<android.net.LinkAddress> p6, java.util.List<java.net.InetAddress> p7, java.util.List<java.net.InetAddress> p8, java.util.List<java.net.InetAddress> p9, int p10) {}
    public DataCallResponse(android.os.Parcel p0) {}
    public int getCause() { return 0; }
    public int getSuggestedRetryTime() { return 0; }
    public int getId() { return 0; }
    public int getLinkStatus() { return 0; }
    public int getProtocolType() { return 0; }
    public java.lang.String getInterfaceName() { return null; }
    public java.util.List<android.net.LinkAddress> getAddresses() { return null; }
    public java.util.List<java.net.InetAddress> getDnsAddresses() { return null; }
    public java.util.List<java.net.InetAddress> getGatewayAddresses() { return null; }
    public java.util.List<java.net.InetAddress> getPcscfAddresses() { return null; }
    public int getMtu() { return 0; }
    public java.lang.String toString() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface LinkStatus {
    }

    public static final class Builder {
        private int mCause;
        private int mSuggestedRetryTime;
        private int mId;
        private int mLinkStatus;
        private int mProtocolType;
        private java.lang.String mInterfaceName;
        private java.util.List<android.net.LinkAddress> mAddresses;
        private java.util.List<java.net.InetAddress> mDnsAddresses;
        private java.util.List<java.net.InetAddress> mGatewayAddresses;
        private java.util.List<java.net.InetAddress> mPcscfAddresses;
        private int mMtu;
        public Builder() {}
        public android.telephony.data.DataCallResponse.Builder setCause(int p0) { return null; }
        public android.telephony.data.DataCallResponse.Builder setSuggestedRetryTime(int p0) { return null; }
        public android.telephony.data.DataCallResponse.Builder setId(int p0) { return null; }
        public android.telephony.data.DataCallResponse.Builder setLinkStatus(int p0) { return null; }
        public android.telephony.data.DataCallResponse.Builder setProtocolType(int p0) { return null; }
        public android.telephony.data.DataCallResponse.Builder setInterfaceName(java.lang.String p0) { return null; }
        public android.telephony.data.DataCallResponse.Builder setAddresses(java.util.List<android.net.LinkAddress> p0) { return null; }
        public android.telephony.data.DataCallResponse.Builder setDnsAddresses(java.util.List<java.net.InetAddress> p0) { return null; }
        public android.telephony.data.DataCallResponse.Builder setGatewayAddresses(java.util.List<java.net.InetAddress> p0) { return null; }
        public android.telephony.data.DataCallResponse.Builder setPcscfAddresses(java.util.List<java.net.InetAddress> p0) { return null; }
        public android.telephony.data.DataCallResponse.Builder setMtu(int p0) { return null; }
        public android.telephony.data.DataCallResponse build() { return null; }
    }
}
