package android.companion;

public final class WifiDeviceFilter implements android.companion.DeviceFilter<android.net.wifi.ScanResult> {
    private final java.util.regex.Pattern mNamePattern = null;
    public static final android.os.Parcelable.Creator<android.companion.WifiDeviceFilter> CREATOR = null;
    private WifiDeviceFilter(java.util.regex.Pattern p0) {}
    @android.annotation.SuppressLint("ParcelClassLoader")
    private WifiDeviceFilter(android.os.Parcel p0) {}
    public java.util.regex.Pattern getNamePattern() { return null; }
    public boolean matches(android.net.wifi.ScanResult p0) { return false; }
    public java.lang.String getDeviceDisplayName(android.net.wifi.ScanResult p0) { return null; }
    public int getMediumType() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }

    public static final class Builder extends android.provider.OneTimeUseBuilder<android.companion.WifiDeviceFilter> {
        private java.util.regex.Pattern mNamePattern;
        public Builder() { super(); }
        public android.companion.WifiDeviceFilter.Builder setNamePattern(java.util.regex.Pattern p0) { return null; }
        public android.companion.WifiDeviceFilter build() { return null; }
    }
}
