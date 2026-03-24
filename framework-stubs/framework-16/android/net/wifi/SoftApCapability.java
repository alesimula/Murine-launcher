package android.net.wifi;

public final class SoftApCapability implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.net.wifi.SoftApCapability> CREATOR = null;
    public static final long SOFTAP_FEATURE_ACS_OFFLOAD = 1L;
    public static final long SOFTAP_FEATURE_BAND_24G_SUPPORTED = 32L;
    public static final long SOFTAP_FEATURE_BAND_5G_SUPPORTED = 64L;
    public static final long SOFTAP_FEATURE_BAND_60G_SUPPORTED = 256L;
    public static final long SOFTAP_FEATURE_BAND_6G_SUPPORTED = 128L;
    public static final long SOFTAP_FEATURE_CLIENT_FORCE_DISCONNECT = 2L;
    public static final long SOFTAP_FEATURE_IEEE80211_AX = 16L;
    public static final long SOFTAP_FEATURE_IEEE80211_BE = 512L;
    public static final long SOFTAP_FEATURE_MAC_ADDRESS_CUSTOMIZATION = 8L;
    @android.annotation.FlaggedApi("com.android.wifi.flags.mlo_sap")
    public static final long SOFTAP_FEATURE_MLO = 4096L;
    public static final long SOFTAP_FEATURE_WPA3_OWE = 2048L;
    public static final long SOFTAP_FEATURE_WPA3_OWE_TRANSITION = 1024L;
    public static final long SOFTAP_FEATURE_WPA3_SAE = 4L;
    SoftApCapability() {}
    public boolean areFeaturesSupported(long p0) { return false; }
    public int describeContents() { return 0; }
    public int getMaxSupportedClients() { return 0; }
    @android.annotation.NonNull
    public int[] getSupportedChannelList(int p0) { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
