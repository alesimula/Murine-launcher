package android.net.wifi.aware;

public final class WifiAwareDataPathSecurityConfig implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.net.wifi.aware.WifiAwareDataPathSecurityConfig> CREATOR = null;
    WifiAwareDataPathSecurityConfig() {}
    public int describeContents() { return 0; }
    public int getCipherSuite() { return 0; }
    @android.annotation.Nullable
    public byte[] getPmk() { return null; }
    @android.annotation.Nullable
    public byte[] getPmkId() { return null; }
    @android.annotation.Nullable
    public java.lang.String getPskPassphrase() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        public Builder(int p0) {}
        @android.annotation.NonNull
        public android.net.wifi.aware.WifiAwareDataPathSecurityConfig build() { return null; }
        @android.annotation.NonNull
        public android.net.wifi.aware.WifiAwareDataPathSecurityConfig.Builder setPmk(byte[] p0) { return null; }
        @android.annotation.NonNull
        public android.net.wifi.aware.WifiAwareDataPathSecurityConfig.Builder setPmkId(byte[] p0) { return null; }
        @android.annotation.NonNull
        public android.net.wifi.aware.WifiAwareDataPathSecurityConfig.Builder setPskPassphrase(java.lang.String p0) { return null; }
    }
}
