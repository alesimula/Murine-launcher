package android.net.wifi.rtt;

@android.annotation.FlaggedApi("com.android.wifi.flags.secure_ranging")
public final class PasnConfig implements android.os.Parcelable {
    public static final int AKM_FILS_EAP_SHA256 = 64;
    public static final int AKM_FILS_EAP_SHA384 = 128;
    public static final int AKM_FT_EAP_SHA256 = 4;
    public static final int AKM_FT_EAP_SHA384 = 16;
    public static final int AKM_FT_PSK_SHA256 = 8;
    public static final int AKM_FT_PSK_SHA384 = 32;
    public static final int AKM_NONE = 0;
    public static final int AKM_PASN = 1;
    public static final int AKM_SAE = 2;
    public static final int CIPHER_CCMP_128 = 1;
    public static final int CIPHER_CCMP_256 = 2;
    public static final int CIPHER_GCMP_128 = 4;
    public static final int CIPHER_GCMP_256 = 8;
    public static final int CIPHER_NONE = 0;
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.net.wifi.rtt.PasnConfig> CREATOR = null;
    PasnConfig() {}
    public int describeContents() { return 0; }
    public int getBaseAkms() { return 0; }
    public int getCiphers() { return 0; }
    @android.annotation.Nullable
    public byte[] getPasnComebackCookie() { return null; }
    @android.annotation.Nullable
    public java.lang.String getPassword() { return null; }
    @android.annotation.Nullable
    public android.net.wifi.WifiSsid getWifiSsid() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @android.annotation.FlaggedApi("com.android.wifi.flags.secure_ranging")
    public static final class Builder {
        public Builder(int p0, int p1) {}
        @android.annotation.NonNull
        public android.net.wifi.rtt.PasnConfig build() { return null; }
        @android.annotation.NonNull
        public android.net.wifi.rtt.PasnConfig.Builder setPasnComebackCookie(byte[] p0) { return null; }
        @android.annotation.NonNull
        public android.net.wifi.rtt.PasnConfig.Builder setPassword(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        public android.net.wifi.rtt.PasnConfig.Builder setWifiSsid(android.net.wifi.WifiSsid p0) { return null; }
    }
}
