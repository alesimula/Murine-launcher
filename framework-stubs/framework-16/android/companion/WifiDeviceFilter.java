package android.companion;

public final class WifiDeviceFilter implements android.companion.DeviceFilter<android.net.wifi.ScanResult> {
    static com.android.internal.util.Parcelling<java.util.regex.Pattern> sParcellingForNamePattern;
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.companion.WifiDeviceFilter> CREATOR = null;
    public boolean matches(android.net.wifi.ScanResult p0) { return false; }
    public java.lang.String getDeviceDisplayName(android.net.wifi.ScanResult p0) { return null; }
    public int getMediumType() { return 0; }
    WifiDeviceFilter(java.util.regex.Pattern p0, android.net.MacAddress p1, android.net.MacAddress p2) {}
    @android.annotation.Nullable
    public java.util.regex.Pattern getNamePattern() { return null; }
    @android.annotation.Nullable
    public android.net.MacAddress getBssid() { return null; }
    @android.annotation.NonNull
    public android.net.MacAddress getBssidMask() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    WifiDeviceFilter(android.os.Parcel p0) {}

    public static final class Builder {
        public Builder() {}
        @android.annotation.NonNull
        public android.companion.WifiDeviceFilter.Builder setNamePattern(java.util.regex.Pattern p0) { return null; }
        @android.annotation.NonNull
        public android.companion.WifiDeviceFilter.Builder setBssid(android.net.MacAddress p0) { return null; }
        @android.annotation.NonNull
        public android.companion.WifiDeviceFilter.Builder setBssidMask(android.net.MacAddress p0) { return null; }
        @android.annotation.NonNull
        public android.companion.WifiDeviceFilter build() { return null; }
    }
}
