package android.net.wifi.rtt;

@android.annotation.FlaggedApi("com.android.wifi.flags.secure_ranging")
public final class SecureRangingConfig implements android.os.Parcelable {
    @android.annotation.FlaggedApi("com.android.wifi.flags.secure_ranging")
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.net.wifi.rtt.SecureRangingConfig> CREATOR = null;
    SecureRangingConfig() {}
    @android.annotation.FlaggedApi("com.android.wifi.flags.secure_ranging")
    public int describeContents() { return 0; }
    @android.annotation.FlaggedApi("com.android.wifi.flags.secure_ranging")
    @android.annotation.NonNull
    public android.net.wifi.rtt.PasnConfig getPasnConfig() { return null; }
    @android.annotation.FlaggedApi("com.android.wifi.flags.secure_ranging")
    public boolean isRangingFrameProtectionEnabled() { return false; }
    @android.annotation.FlaggedApi("com.android.wifi.flags.secure_ranging")
    public boolean isSecureHeLtfEnabled() { return false; }
    @android.annotation.FlaggedApi("com.android.wifi.flags.secure_ranging")
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @android.annotation.FlaggedApi("com.android.wifi.flags.secure_ranging")
    public static final class Builder {
        @android.annotation.FlaggedApi("com.android.wifi.flags.secure_ranging")
        public Builder(android.net.wifi.rtt.PasnConfig p0) {}
        @android.annotation.FlaggedApi("com.android.wifi.flags.secure_ranging")
        @android.annotation.NonNull
        public android.net.wifi.rtt.SecureRangingConfig build() { return null; }
        @android.annotation.FlaggedApi("com.android.wifi.flags.secure_ranging")
        @android.annotation.NonNull
        public android.net.wifi.rtt.SecureRangingConfig.Builder setRangingFrameProtectionEnabled(boolean p0) { return null; }
        @android.annotation.FlaggedApi("com.android.wifi.flags.secure_ranging")
        @android.annotation.NonNull
        public android.net.wifi.rtt.SecureRangingConfig.Builder setSecureHeLtfEnabled(boolean p0) { return null; }
    }
}
