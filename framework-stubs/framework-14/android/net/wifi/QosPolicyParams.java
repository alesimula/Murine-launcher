package android.net.wifi;

public final class QosPolicyParams implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.net.wifi.QosPolicyParams> CREATOR = null;
    public static final int DESTINATION_PORT_ANY = -1;
    public static final int DIRECTION_DOWNLINK = 1;
    public static final int DIRECTION_UPLINK = 0;
    public static final int DSCP_ANY = -1;
    public static final int IP_VERSION_4 = 4;
    public static final int IP_VERSION_6 = 6;
    public static final int IP_VERSION_ANY = -1;
    public static final int PROTOCOL_ANY = -1;
    public static final int PROTOCOL_ESP = 50;
    public static final int PROTOCOL_TCP = 6;
    public static final int PROTOCOL_UDP = 17;
    public static final int USER_PRIORITY_ANY = -1;
    public static final int USER_PRIORITY_BACKGROUND_HIGH = 2;
    public static final int USER_PRIORITY_BACKGROUND_LOW = 1;
    public static final int USER_PRIORITY_BEST_EFFORT_HIGH = 3;
    public static final int USER_PRIORITY_BEST_EFFORT_LOW = 0;
    public static final int USER_PRIORITY_VIDEO_HIGH = 5;
    public static final int USER_PRIORITY_VIDEO_LOW = 4;
    public static final int USER_PRIORITY_VOICE_HIGH = 7;
    public static final int USER_PRIORITY_VOICE_LOW = 6;
    QosPolicyParams() {}
    public int getPolicyId() { return 0; }
    public int getDscp() { return 0; }
    public int getUserPriority() { return 0; }
    @android.annotation.Nullable
    public java.net.InetAddress getSourceAddress() { return null; }
    @android.annotation.Nullable
    public java.net.InetAddress getDestinationAddress() { return null; }
    public int getSourcePort() { return 0; }
    public int getProtocol() { return 0; }
    public int getDestinationPort() { return 0; }
    @android.annotation.Nullable
    public int[] getDestinationPortRange() { return null; }
    public int getDirection() { return 0; }
    public int getIpVersion() { return 0; }
    @android.annotation.Nullable
    public byte[] getFlowLabel() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        public Builder(int p0, int p1) {}
        @android.annotation.NonNull
        public android.net.wifi.QosPolicyParams.Builder setSourceAddress(java.net.InetAddress p0) { return null; }
        @android.annotation.NonNull
        public android.net.wifi.QosPolicyParams.Builder setDestinationAddress(java.net.InetAddress p0) { return null; }
        @android.annotation.NonNull
        public android.net.wifi.QosPolicyParams.Builder setDscp(int p0) { return null; }
        @android.annotation.NonNull
        public android.net.wifi.QosPolicyParams.Builder setUserPriority(int p0) { return null; }
        @android.annotation.NonNull
        public android.net.wifi.QosPolicyParams.Builder setSourcePort(int p0) { return null; }
        @android.annotation.NonNull
        public android.net.wifi.QosPolicyParams.Builder setProtocol(int p0) { return null; }
        @android.annotation.NonNull
        public android.net.wifi.QosPolicyParams.Builder setDestinationPort(int p0) { return null; }
        @android.annotation.NonNull
        public android.net.wifi.QosPolicyParams.Builder setDestinationPortRange(int p0, int p1) { return null; }
        @android.annotation.NonNull
        public android.net.wifi.QosPolicyParams.Builder setIpVersion(int p0) { return null; }
        @android.annotation.NonNull
        public android.net.wifi.QosPolicyParams.Builder setFlowLabel(byte[] p0) { return null; }
        @android.annotation.NonNull
        public android.net.wifi.QosPolicyParams build() { return null; }
    }
}
