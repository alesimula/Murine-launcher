package android.net;

public class NetworkTemplate implements android.os.Parcelable {
    private static final java.lang.String TAG = "NetworkTemplate";
    private static final int BACKUP_VERSION = 1;
    public static final int MATCH_MOBILE = 1;
    public static final int MATCH_WIFI = 4;
    public static final int MATCH_ETHERNET = 5;
    public static final int MATCH_MOBILE_WILDCARD = 6;
    public static final int MATCH_WIFI_WILDCARD = 7;
    public static final int MATCH_BLUETOOTH = 8;
    public static final int MATCH_PROXY = 9;
    public static final int MATCH_CARRIER = 10;
    public static final int SUBSCRIBER_ID_MATCH_RULE_EXACT = 0;
    public static final int SUBSCRIBER_ID_MATCH_RULE_ALL = 1;
    public static final java.lang.String WIFI_NETWORKID_ALL = null;
    public static final int NETWORK_TYPE_ALL = -1;
    public static final int NETWORK_TYPE_5G_NSA = -2;
    public static final int OEM_MANAGED_ALL = -1;
    public static final int OEM_MANAGED_NO = 0;
    public static final int OEM_MANAGED_YES = -2;
    private static boolean sForceAllNetworkTypes;
    private final int mMatchRule = 0;
    private final java.lang.String mSubscriberId = null;
    private final java.lang.String[] mMatchSubscriberIds = null;
    private final java.lang.String mNetworkId = null;
    private final int mMetered = 0;
    private final int mRoaming = 0;
    private final int mDefaultNetwork = 0;
    private final int mSubType = 0;
    private final int mSubscriberIdMatchRule = 0;
    private final int mOemManaged = 0;
    public static final android.os.Parcelable.Creator<android.net.NetworkTemplate> CREATOR = null;
    private static boolean isKnownMatchRule(int p0) { return false; }
    public static void forceAllNetworkTypes() {}
    public static void resetForceAllNetworkTypes() {}
    public static android.net.NetworkTemplate buildTemplateMobileAll(java.lang.String p0) { return null; }
    public static android.net.NetworkTemplate buildTemplateMobileWithRatType(java.lang.String p0, int p1) { return null; }
    public static android.net.NetworkTemplate buildTemplateMobileWildcard() { return null; }
    public static android.net.NetworkTemplate buildTemplateWifiWildcard() { return null; }
    @java.lang.Deprecated
    public static android.net.NetworkTemplate buildTemplateWifi() { return null; }
    public static android.net.NetworkTemplate buildTemplateWifi(java.lang.String p0) { return null; }
    public static android.net.NetworkTemplate buildTemplateWifi(java.lang.String p0, java.lang.String p1) { return null; }
    public static android.net.NetworkTemplate buildTemplateEthernet() { return null; }
    public static android.net.NetworkTemplate buildTemplateBluetooth() { return null; }
    public static android.net.NetworkTemplate buildTemplateProxy() { return null; }
    public static android.net.NetworkTemplate buildTemplateCarrierMetered(java.lang.String p0) { return null; }
    private void checkValidSubscriberIdMatchRule() {}
    public NetworkTemplate(int p0, java.lang.String p1, java.lang.String p2) {}
    public NetworkTemplate(int p0, java.lang.String p1, java.lang.String[] p2, java.lang.String p3) {}
    public NetworkTemplate(int p0, java.lang.String p1, java.lang.String[] p2, java.lang.String p3, int p4, int p5, int p6, int p7, int p8) {}
    public NetworkTemplate(int p0, java.lang.String p1, java.lang.String[] p2, java.lang.String p3, int p4, int p5, int p6, int p7, int p8, int p9) {}
    private NetworkTemplate(android.os.Parcel p0) {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    public java.lang.String toString() { return null; }
    public int hashCode() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    private java.lang.String subscriberIdMatchRuleToString(int p0) { return null; }
    public boolean isMatchRuleMobile() { return false; }
    public boolean isPersistable() { return false; }
    public int getMatchRule() { return 0; }
    public java.lang.String getSubscriberId() { return null; }
    public java.lang.String getNetworkId() { return null; }
    public int getSubscriberIdMatchRule() { return 0; }
    public int getMeteredness() { return 0; }
    public boolean matches(android.net.NetworkIdentity p0) { return false; }
    private boolean matchesMetered(android.net.NetworkIdentity p0) { return false; }
    private boolean matchesRoaming(android.net.NetworkIdentity p0) { return false; }
    private boolean matchesDefaultNetwork(android.net.NetworkIdentity p0) { return false; }
    private boolean matchesOemNetwork(android.net.NetworkIdentity p0) { return false; }
    private boolean matchesCollapsedRatType(android.net.NetworkIdentity p0) { return false; }
    public boolean matchesSubscriberId(java.lang.String p0) { return false; }
    private boolean matchesWifiNetworkId(java.lang.String p0) { return false; }
    private boolean matchesMobile(android.net.NetworkIdentity p0) { return false; }
    public static int getCollapsedRatType(int p0) { return 0; }
    public static final int[] getAllCollapsedRatTypes() { return null; }
    private static int[] toIntArray(java.util.Collection<java.lang.Integer> p0) { return null; }
    private boolean matchesWifi(android.net.NetworkIdentity p0) { return false; }
    private boolean matchesEthernet(android.net.NetworkIdentity p0) { return false; }
    private boolean matchesCarrier(android.net.NetworkIdentity p0) { return false; }
    private boolean matchesMobileWildcard(android.net.NetworkIdentity p0) { return false; }
    private boolean matchesWifiWildcard(android.net.NetworkIdentity p0) { return false; }
    private boolean matchesBluetooth(android.net.NetworkIdentity p0) { return false; }
    private boolean matchesProxy(android.net.NetworkIdentity p0) { return false; }
    private static java.lang.String getMatchRuleName(int p0) { return null; }
    public static android.net.NetworkTemplate normalize(android.net.NetworkTemplate p0, java.lang.String[] p1) { return null; }
    public static android.net.NetworkTemplate normalize(android.net.NetworkTemplate p0, java.util.List<java.lang.String[]> p1) { return null; }
    public byte[] getBytesForBackup() throws java.io.IOException { return null; }
    public static android.net.NetworkTemplate getNetworkTemplateFromBackup(java.io.DataInputStream p0) throws java.io.IOException, android.util.BackupUtils.BadVersionException { return null; }
}
