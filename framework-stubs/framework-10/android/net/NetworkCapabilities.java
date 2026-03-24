package android.net;

public final class NetworkCapabilities implements android.os.Parcelable {
    private static final java.lang.String TAG = "NetworkCapabilities";
    private static final int INVALID_UID = -1;
    @android.annotation.UnsupportedAppUsage
    private long mNetworkCapabilities;
    private long mUnwantedNetworkCapabilities;
    public static final int NET_CAPABILITY_MMS = 0;
    public static final int NET_CAPABILITY_SUPL = 1;
    public static final int NET_CAPABILITY_DUN = 2;
    public static final int NET_CAPABILITY_FOTA = 3;
    public static final int NET_CAPABILITY_IMS = 4;
    public static final int NET_CAPABILITY_CBS = 5;
    public static final int NET_CAPABILITY_WIFI_P2P = 6;
    public static final int NET_CAPABILITY_IA = 7;
    public static final int NET_CAPABILITY_RCS = 8;
    public static final int NET_CAPABILITY_XCAP = 9;
    public static final int NET_CAPABILITY_EIMS = 10;
    public static final int NET_CAPABILITY_NOT_METERED = 11;
    public static final int NET_CAPABILITY_INTERNET = 12;
    public static final int NET_CAPABILITY_NOT_RESTRICTED = 13;
    public static final int NET_CAPABILITY_TRUSTED = 14;
    public static final int NET_CAPABILITY_NOT_VPN = 15;
    public static final int NET_CAPABILITY_VALIDATED = 16;
    public static final int NET_CAPABILITY_CAPTIVE_PORTAL = 17;
    public static final int NET_CAPABILITY_NOT_ROAMING = 18;
    public static final int NET_CAPABILITY_FOREGROUND = 19;
    public static final int NET_CAPABILITY_NOT_CONGESTED = 20;
    public static final int NET_CAPABILITY_NOT_SUSPENDED = 21;
    @android.annotation.SystemApi
    public static final int NET_CAPABILITY_OEM_PAID = 22;
    public static final int NET_CAPABILITY_MCX = 23;
    @android.annotation.SystemApi
    public static final int NET_CAPABILITY_PARTIAL_CONNECTIVITY = 24;
    private static final int MIN_NET_CAPABILITY = 0;
    private static final int MAX_NET_CAPABILITY = 24;
    private static final long MUTABLE_CAPABILITIES = 20922368L;
    private static final long NON_REQUESTABLE_CAPABILITIES = 20905984L;
    private static final long DEFAULT_CAPABILITIES = 57344L;
    static final long RESTRICTED_CAPABILITIES = 8390588L;
    private static final long FORCE_RESTRICTED_CAPABILITIES = 4194304L;
    static final long UNRESTRICTED_CAPABILITIES = 4163L;
    private static final long CONNECTIVITY_MANAGED_CAPABILITIES = 17498112L;
    private long mTransportTypes;
    public static final int TRANSPORT_CELLULAR = 0;
    public static final int TRANSPORT_WIFI = 1;
    public static final int TRANSPORT_BLUETOOTH = 2;
    public static final int TRANSPORT_ETHERNET = 3;
    public static final int TRANSPORT_VPN = 4;
    public static final int TRANSPORT_WIFI_AWARE = 5;
    public static final int TRANSPORT_LOWPAN = 6;
    public static final int TRANSPORT_TEST = 7;
    public static final int MIN_TRANSPORT = 0;
    public static final int MAX_TRANSPORT = 7;
    private static final java.lang.String[] TRANSPORT_NAMES = null;
    private int mEstablishingVpnAppUid;
    public static final int LINK_BANDWIDTH_UNSPECIFIED = 0;
    private int mLinkUpBandwidthKbps;
    private int mLinkDownBandwidthKbps;
    private android.net.NetworkSpecifier mNetworkSpecifier;
    private android.net.TransportInfo mTransportInfo;
    public static final int SIGNAL_STRENGTH_UNSPECIFIED = -2147483648;
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28)
    private int mSignalStrength;
    private android.util.ArraySet<android.net.UidRange> mUids;
    private java.lang.String mSSID;
    public static final android.os.Parcelable.Creator<android.net.NetworkCapabilities> CREATOR = null;
    @android.annotation.UnsupportedAppUsage
    public NetworkCapabilities() {}
    public NetworkCapabilities(android.net.NetworkCapabilities p0) {}
    public void clearAll() {}
    public void set(android.net.NetworkCapabilities p0) {}
    @android.annotation.UnsupportedAppUsage
    public android.net.NetworkCapabilities addCapability(int p0) { return null; }
    public void addUnwantedCapability(int p0) {}
    @android.annotation.UnsupportedAppUsage
    public android.net.NetworkCapabilities removeCapability(int p0) { return null; }
    public android.net.NetworkCapabilities setCapability(int p0, boolean p1) { return null; }
    public int[] getCapabilities() { return null; }
    public int[] getUnwantedCapabilities() { return null; }
    public void setCapabilities(int[] p0, int[] p1) {}
    @java.lang.Deprecated
    public void setCapabilities(int[] p0) {}
    public boolean hasCapability(int p0) { return false; }
    public boolean hasUnwantedCapability(int p0) { return false; }
    public boolean hasConnectivityManagedCapability() { return false; }
    private void combineNetCapabilities(android.net.NetworkCapabilities p0) {}
    public java.lang.String describeFirstNonRequestableCapability() { return null; }
    private boolean satisfiedByNetCapabilities(android.net.NetworkCapabilities p0, boolean p1) { return false; }
    public boolean equalsNetCapabilities(android.net.NetworkCapabilities p0) { return false; }
    private boolean equalsNetCapabilitiesRequestable(android.net.NetworkCapabilities p0) { return false; }
    public void maybeMarkCapabilitiesRestricted() {}
    public static boolean isValidTransport(int p0) { return false; }
    @android.annotation.UnsupportedAppUsage
    public android.net.NetworkCapabilities addTransportType(int p0) { return null; }
    public android.net.NetworkCapabilities removeTransportType(int p0) { return null; }
    public android.net.NetworkCapabilities setTransportType(int p0, boolean p1) { return null; }
    @android.annotation.SystemApi
    public int[] getTransportTypes() { return null; }
    public void setTransportTypes(int[] p0) {}
    public boolean hasTransport(int p0) { return false; }
    private void combineTransportTypes(android.net.NetworkCapabilities p0) {}
    private boolean satisfiedByTransportTypes(android.net.NetworkCapabilities p0) { return false; }
    public boolean equalsTransportTypes(android.net.NetworkCapabilities p0) { return false; }
    public void setEstablishingVpnAppUid(int p0) {}
    public int getEstablishingVpnAppUid() { return 0; }
    public android.net.NetworkCapabilities setLinkUpstreamBandwidthKbps(int p0) { return null; }
    public int getLinkUpstreamBandwidthKbps() { return 0; }
    public android.net.NetworkCapabilities setLinkDownstreamBandwidthKbps(int p0) { return null; }
    public int getLinkDownstreamBandwidthKbps() { return 0; }
    private void combineLinkBandwidths(android.net.NetworkCapabilities p0) {}
    private boolean satisfiedByLinkBandwidths(android.net.NetworkCapabilities p0) { return false; }
    private boolean equalsLinkBandwidths(android.net.NetworkCapabilities p0) { return false; }
    public static int minBandwidth(int p0, int p1) { return 0; }
    public static int maxBandwidth(int p0, int p1) { return 0; }
    public android.net.NetworkCapabilities setNetworkSpecifier(android.net.NetworkSpecifier p0) { return null; }
    public android.net.NetworkCapabilities setTransportInfo(android.net.TransportInfo p0) { return null; }
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=115609023L)
    public android.net.NetworkSpecifier getNetworkSpecifier() { return null; }
    public android.net.TransportInfo getTransportInfo() { return null; }
    private void combineSpecifiers(android.net.NetworkCapabilities p0) {}
    private boolean satisfiedBySpecifier(android.net.NetworkCapabilities p0) { return false; }
    private boolean equalsSpecifier(android.net.NetworkCapabilities p0) { return false; }
    private void combineTransportInfos(android.net.NetworkCapabilities p0) {}
    private boolean equalsTransportInfo(android.net.NetworkCapabilities p0) { return false; }
    @android.annotation.UnsupportedAppUsage
    public android.net.NetworkCapabilities setSignalStrength(int p0) { return null; }
    @android.annotation.UnsupportedAppUsage
    public boolean hasSignalStrength() { return false; }
    public int getSignalStrength() { return 0; }
    private void combineSignalStrength(android.net.NetworkCapabilities p0) {}
    private boolean satisfiedBySignalStrength(android.net.NetworkCapabilities p0) { return false; }
    private boolean equalsSignalStrength(android.net.NetworkCapabilities p0) { return false; }
    public android.net.NetworkCapabilities setSingleUid(int p0) { return null; }
    public android.net.NetworkCapabilities setUids(java.util.Set<android.net.UidRange> p0) { return null; }
    public java.util.Set<android.net.UidRange> getUids() { return null; }
    public boolean appliesToUid(int p0) { return false; }
    public boolean equalsUids(android.net.NetworkCapabilities p0) { return false; }
    public boolean satisfiedByUids(android.net.NetworkCapabilities p0) { return false; }
    public boolean appliesToUidRange(android.net.UidRange p0) { return false; }
    private void combineUids(android.net.NetworkCapabilities p0) {}
    public android.net.NetworkCapabilities setSSID(java.lang.String p0) { return null; }
    public java.lang.String getSSID() { return null; }
    public boolean equalsSSID(android.net.NetworkCapabilities p0) { return false; }
    public boolean satisfiedBySSID(android.net.NetworkCapabilities p0) { return false; }
    private void combineSSIDs(android.net.NetworkCapabilities p0) {}
    public void combineCapabilities(android.net.NetworkCapabilities p0) {}
    private boolean satisfiedByNetworkCapabilities(android.net.NetworkCapabilities p0, boolean p1) { return false; }
    @android.annotation.SystemApi
    public boolean satisfiedByNetworkCapabilities(android.net.NetworkCapabilities p0) { return false; }
    public boolean satisfiedByImmutableNetworkCapabilities(android.net.NetworkCapabilities p0) { return false; }
    public java.lang.String describeImmutableDifferences(android.net.NetworkCapabilities p0) { return null; }
    public boolean equalRequestableCapabilities(android.net.NetworkCapabilities p0) { return false; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public java.lang.String toString() { return null; }
    public static void appendStringRepresentationOfBitMaskToStringBuilder(java.lang.StringBuilder p0, long p1, android.net.NetworkCapabilities.NameOf p2, java.lang.String p3) {}
    public void writeToProto(android.util.proto.ProtoOutputStream p0, long p1) {}
    public static java.lang.String capabilityNamesOf(int[] p0) { return null; }
    public static java.lang.String capabilityNameOf(int p0) { return null; }
    @android.annotation.UnsupportedAppUsage
    public static java.lang.String transportNamesOf(int[] p0) { return null; }
    public static java.lang.String transportNameOf(int p0) { return null; }
    private static void checkValidTransportType(int p0) {}
    private static boolean isValidCapability(int p0) { return false; }
    private static void checkValidCapability(int p0) {}
    public boolean isMetered() { return false; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Transport {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface NetCapability {
    }

    private static interface NameOf {
        public java.lang.String nameOf(int p0);
    }
}
