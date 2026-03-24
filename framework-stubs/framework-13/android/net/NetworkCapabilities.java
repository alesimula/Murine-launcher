package android.net;

public final class NetworkCapabilities implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.net.NetworkCapabilities> CREATOR = null;
    public static final int NET_CAPABILITY_BIP = 31;
    public static final int NET_CAPABILITY_CAPTIVE_PORTAL = 17;
    public static final int NET_CAPABILITY_CBS = 5;
    public static final int NET_CAPABILITY_DUN = 2;
    public static final int NET_CAPABILITY_EIMS = 10;
    public static final int NET_CAPABILITY_ENTERPRISE = 29;
    public static final int NET_CAPABILITY_FOREGROUND = 19;
    public static final int NET_CAPABILITY_FOTA = 3;
    public static final int NET_CAPABILITY_HEAD_UNIT = 32;
    public static final int NET_CAPABILITY_IA = 7;
    public static final int NET_CAPABILITY_IMS = 4;
    public static final int NET_CAPABILITY_INTERNET = 12;
    public static final int NET_CAPABILITY_MCX = 23;
    public static final int NET_CAPABILITY_MMS = 0;
    public static final int NET_CAPABILITY_MMTEL = 33;
    public static final int NET_CAPABILITY_NOT_CONGESTED = 20;
    public static final int NET_CAPABILITY_NOT_METERED = 11;
    public static final int NET_CAPABILITY_NOT_RESTRICTED = 13;
    public static final int NET_CAPABILITY_NOT_ROAMING = 18;
    public static final int NET_CAPABILITY_NOT_SUSPENDED = 21;
    public static final int NET_CAPABILITY_NOT_VCN_MANAGED = 28;
    public static final int NET_CAPABILITY_NOT_VPN = 15;
    public static final int NET_CAPABILITY_OEM_PAID = 22;
    public static final int NET_CAPABILITY_OEM_PRIVATE = 26;
    public static final int NET_CAPABILITY_PARTIAL_CONNECTIVITY = 24;
    public static final int NET_CAPABILITY_PRIORITIZE_BANDWIDTH = 35;
    public static final int NET_CAPABILITY_PRIORITIZE_LATENCY = 34;
    public static final int NET_CAPABILITY_RCS = 8;
    public static final int NET_CAPABILITY_SUPL = 1;
    public static final int NET_CAPABILITY_TEMPORARILY_NOT_METERED = 25;
    public static final int NET_CAPABILITY_TRUSTED = 14;
    public static final int NET_CAPABILITY_VALIDATED = 16;
    public static final int NET_CAPABILITY_VEHICLE_INTERNAL = 27;
    public static final int NET_CAPABILITY_VSIM = 30;
    public static final int NET_CAPABILITY_WIFI_P2P = 6;
    public static final int NET_CAPABILITY_XCAP = 9;
    public static final int NET_ENTERPRISE_ID_1 = 1;
    public static final int NET_ENTERPRISE_ID_2 = 2;
    public static final int NET_ENTERPRISE_ID_3 = 3;
    public static final int NET_ENTERPRISE_ID_4 = 4;
    public static final int NET_ENTERPRISE_ID_5 = 5;
    public static final long REDACT_ALL = -1L;
    public static final long REDACT_FOR_ACCESS_FINE_LOCATION = 1L;
    public static final long REDACT_FOR_LOCAL_MAC_ADDRESS = 2L;
    public static final long REDACT_FOR_NETWORK_SETTINGS = 4L;
    public static final long REDACT_NONE = 0L;
    public static final int SIGNAL_STRENGTH_UNSPECIFIED = -2147483648;
    public static final int TRANSPORT_BLUETOOTH = 2;
    public static final int TRANSPORT_CELLULAR = 0;
    public static final int TRANSPORT_ETHERNET = 3;
    public static final int TRANSPORT_LOWPAN = 6;
    public static final int TRANSPORT_TEST = 7;
    public static final int TRANSPORT_USB = 8;
    public static final int TRANSPORT_VPN = 4;
    public static final int TRANSPORT_WIFI = 1;
    public static final int TRANSPORT_WIFI_AWARE = 5;
    public NetworkCapabilities() {}
    public NetworkCapabilities(android.net.NetworkCapabilities p0) {}
    @android.annotation.NonNull
    public int[] getEnterpriseIds() { return null; }
    public boolean hasEnterpriseId(int p0) { return false; }
    @android.annotation.NonNull
    public int[] getCapabilities() { return null; }
    @android.annotation.Nullable
    public java.util.List<android.net.Network> getUnderlyingNetworks() { return null; }
    public boolean hasCapability(int p0) { return false; }
    public boolean hasForbiddenCapability(int p0) { return false; }
    @android.annotation.Nullable
    public static java.lang.String getCapabilityCarrierName(int p0) { return null; }
    @android.annotation.NonNull
    public int[] getTransportTypes() { return null; }
    public boolean hasTransport(int p0) { return false; }
    public int getOwnerUid() { return 0; }
    @android.annotation.NonNull
    public int[] getAdministratorUids() { return null; }
    public int getLinkUpstreamBandwidthKbps() { return 0; }
    public int getLinkDownstreamBandwidthKbps() { return 0; }
    @android.annotation.Nullable
    public android.net.NetworkSpecifier getNetworkSpecifier() { return null; }
    @android.annotation.Nullable
    public android.net.TransportInfo getTransportInfo() { return null; }
    public int getSignalStrength() { return 0; }
    @android.annotation.Nullable
    public java.util.Set<android.util.Range<java.lang.Integer>> getUids() { return null; }
    @android.annotation.NonNull
    public java.util.Set<java.lang.Integer> getAllowedUids() { return null; }
    @android.annotation.Nullable
    public java.lang.String getSsid() { return null; }
    public boolean satisfiedByNetworkCapabilities(android.net.NetworkCapabilities p0) { return false; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    @android.annotation.NonNull
    public java.lang.String toString() { return null; }
    public boolean isPrivateDnsBroken() { return false; }
    @android.annotation.NonNull
    public java.util.Set<java.lang.Integer> getSubscriptionIds() { return null; }

    public static final class Builder {
        public Builder() {}
        public Builder(android.net.NetworkCapabilities p0) {}
        @android.annotation.NonNull
        public static android.net.NetworkCapabilities.Builder withoutDefaultCapabilities() { return null; }
        @android.annotation.NonNull
        public android.net.NetworkCapabilities.Builder addTransportType(int p0) { return null; }
        @android.annotation.NonNull
        public android.net.NetworkCapabilities.Builder removeTransportType(int p0) { return null; }
        @android.annotation.NonNull
        public android.net.NetworkCapabilities.Builder addCapability(int p0) { return null; }
        @android.annotation.NonNull
        public android.net.NetworkCapabilities.Builder removeCapability(int p0) { return null; }
        @android.annotation.NonNull
        public android.net.NetworkCapabilities.Builder addEnterpriseId(int p0) { return null; }
        @android.annotation.NonNull
        public android.net.NetworkCapabilities.Builder removeEnterpriseId(int p0) { return null; }
        @android.annotation.NonNull
        public android.net.NetworkCapabilities.Builder setOwnerUid(int p0) { return null; }
        @android.annotation.NonNull
        public android.net.NetworkCapabilities.Builder setAdministratorUids(int[] p0) { return null; }
        @android.annotation.NonNull
        public android.net.NetworkCapabilities.Builder setLinkUpstreamBandwidthKbps(int p0) { return null; }
        @android.annotation.NonNull
        public android.net.NetworkCapabilities.Builder setLinkDownstreamBandwidthKbps(int p0) { return null; }
        @android.annotation.NonNull
        public android.net.NetworkCapabilities.Builder setNetworkSpecifier(android.net.NetworkSpecifier p0) { return null; }
        @android.annotation.NonNull
        public android.net.NetworkCapabilities.Builder setTransportInfo(android.net.TransportInfo p0) { return null; }
        @android.annotation.NonNull
        public android.net.NetworkCapabilities.Builder setSignalStrength(int p0) { return null; }
        @android.annotation.NonNull
        public android.net.NetworkCapabilities.Builder setSsid(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        public android.net.NetworkCapabilities.Builder setRequestorUid(int p0) { return null; }
        @android.annotation.NonNull
        public android.net.NetworkCapabilities.Builder setRequestorPackageName(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        public android.net.NetworkCapabilities.Builder setSubscriptionIds(java.util.Set<java.lang.Integer> p0) { return null; }
        @android.annotation.NonNull
        public android.net.NetworkCapabilities.Builder setUids(java.util.Set<android.util.Range<java.lang.Integer>> p0) { return null; }
        @android.annotation.NonNull
        public android.net.NetworkCapabilities.Builder setAllowedUids(java.util.Set<java.lang.Integer> p0) { return null; }
        @android.annotation.NonNull
        public android.net.NetworkCapabilities.Builder setUnderlyingNetworks(java.util.List<android.net.Network> p0) { return null; }
        @android.annotation.NonNull
        public android.net.NetworkCapabilities build() { return null; }
    }
}
