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
    public static final long SOFTAP_FEATURE_MAC_ADDRESS_CUSTOMIZATION = 8L;
    public static final long SOFTAP_FEATURE_WPA3_SAE = 4L;
    SoftApCapability() {}
    public int getMaxSupportedClients() { return 0; }
    public boolean areFeaturesSupported(long p0) { return false; }
    @android.annotation.NonNull
    public int[] getSupportedChannelList(int p0) { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    @android.annotation.NonNull
    public java.lang.String toString() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
}
