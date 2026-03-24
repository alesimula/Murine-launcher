package android.net.wifi;

public class WifiInfo implements android.os.Parcelable {
    private static final java.lang.String TAG = "WifiInfo";
    private static final java.util.EnumMap<android.net.wifi.SupplicantState, android.net.NetworkInfo.DetailedState> stateMap = null;
    @android.annotation.UnsupportedAppUsage
    public static final java.lang.String DEFAULT_MAC_ADDRESS = "02:00:00:00:00:00";
    private android.net.wifi.SupplicantState mSupplicantState;
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=115609023L)
    private java.lang.String mBSSID;
    @android.annotation.UnsupportedAppUsage
    private android.net.wifi.WifiSsid mWifiSsid;
    private int mNetworkId;
    @android.annotation.UnsupportedAppUsage
    public static final int INVALID_RSSI = -127;
    public static final int MIN_RSSI = -126;
    public static final int MAX_RSSI = 200;
    private int mRssi;
    public static final java.lang.String LINK_SPEED_UNITS = "Mbps";
    private int mLinkSpeed;
    public static final int LINK_SPEED_UNKNOWN = -1;
    private int mTxLinkSpeed;
    private int mRxLinkSpeed;
    public static final java.lang.String FREQUENCY_UNITS = "MHz";
    private int mFrequency;
    @android.annotation.UnsupportedAppUsage
    private java.net.InetAddress mIpAddress;
    @android.annotation.UnsupportedAppUsage
    private java.lang.String mMacAddress;
    private boolean mEphemeral;
    private boolean mTrusted;
    private boolean mOsuAp;
    private java.lang.String mFqdn;
    private java.lang.String mProviderFriendlyName;
    private java.lang.String mNetworkSuggestionOrSpecifierPackageName;
    public long txBad;
    public long txRetries;
    public long txSuccess;
    public long rxSuccess;
    public double txBadRate;
    public double txRetriesRate;
    public double txSuccessRate;
    public double rxSuccessRate;
    @android.annotation.UnsupportedAppUsage
    public int score;
    private boolean mMeteredHint;
    @android.annotation.UnsupportedAppUsage
    public static final android.os.Parcelable.Creator<android.net.wifi.WifiInfo> CREATOR = null;
    @android.annotation.UnsupportedAppUsage
    public WifiInfo() {}
    public void reset() {}
    public WifiInfo(android.net.wifi.WifiInfo p0) {}
    public void setSSID(android.net.wifi.WifiSsid p0) {}
    public java.lang.String getSSID() { return null; }
    @android.annotation.UnsupportedAppUsage
    public android.net.wifi.WifiSsid getWifiSsid() { return null; }
    @android.annotation.UnsupportedAppUsage
    public void setBSSID(java.lang.String p0) {}
    public java.lang.String getBSSID() { return null; }
    public int getRssi() { return 0; }
    @android.annotation.UnsupportedAppUsage
    public void setRssi(int p0) {}
    public int getLinkSpeed() { return 0; }
    @android.annotation.UnsupportedAppUsage
    public void setLinkSpeed(int p0) {}
    public int getTxLinkSpeedMbps() { return 0; }
    public void setTxLinkSpeedMbps(int p0) {}
    public int getRxLinkSpeedMbps() { return 0; }
    public void setRxLinkSpeedMbps(int p0) {}
    public int getFrequency() { return 0; }
    public void setFrequency(int p0) {}
    public boolean is24GHz() { return false; }
    @android.annotation.UnsupportedAppUsage
    public boolean is5GHz() { return false; }
    @android.annotation.UnsupportedAppUsage
    public void setMacAddress(java.lang.String p0) {}
    public java.lang.String getMacAddress() { return null; }
    public boolean hasRealMacAddress() { return false; }
    public void setMeteredHint(boolean p0) {}
    @android.annotation.UnsupportedAppUsage
    public boolean getMeteredHint() { return false; }
    public void setEphemeral(boolean p0) {}
    @android.annotation.UnsupportedAppUsage
    public boolean isEphemeral() { return false; }
    public void setTrusted(boolean p0) {}
    public boolean isTrusted() { return false; }
    public void setOsuAp(boolean p0) {}
    @android.annotation.SystemApi
    public boolean isOsuAp() { return false; }
    @android.annotation.SystemApi
    public boolean isPasspointAp() { return false; }
    public void setFQDN(java.lang.String p0) {}
    public java.lang.String getPasspointFqdn() { return null; }
    public void setProviderFriendlyName(java.lang.String p0) {}
    public java.lang.String getPasspointProviderFriendlyName() { return null; }
    public void setNetworkSuggestionOrSpecifierPackageName(java.lang.String p0) {}
    public java.lang.String getNetworkSuggestionOrSpecifierPackageName() { return null; }
    @android.annotation.UnsupportedAppUsage
    public void setNetworkId(int p0) {}
    public int getNetworkId() { return 0; }
    public android.net.wifi.SupplicantState getSupplicantState() { return null; }
    @android.annotation.UnsupportedAppUsage
    public void setSupplicantState(android.net.wifi.SupplicantState p0) {}
    public void setInetAddress(java.net.InetAddress p0) {}
    public int getIpAddress() { return 0; }
    public boolean getHiddenSSID() { return false; }
    public static android.net.NetworkInfo.DetailedState getDetailedStateOf(android.net.wifi.SupplicantState p0) { return null; }
    @android.annotation.UnsupportedAppUsage
    void setSupplicantState(java.lang.String p0) {}
    static android.net.wifi.SupplicantState valueOf(java.lang.String p0) { return null; }
    @android.annotation.UnsupportedAppUsage
    public static java.lang.String removeDoubleQuotes(java.lang.String p0) { return null; }
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
