package android.net;

public final class IpConfiguration implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.net.IpConfiguration> CREATOR = null;
    public IpConfiguration() {}
    public IpConfiguration(android.net.IpConfiguration p0) {}
    public int describeContents() { return 0; }
    @android.annotation.Nullable
    public android.net.ProxyInfo getHttpProxy() { return null; }
    @android.annotation.NonNull
    public android.net.IpConfiguration.IpAssignment getIpAssignment() { return null; }
    @android.annotation.NonNull
    public android.net.IpConfiguration.ProxySettings getProxySettings() { return null; }
    @android.annotation.Nullable
    public android.net.StaticIpConfiguration getStaticIpConfiguration() { return null; }
    public void setHttpProxy(android.net.ProxyInfo p0) {}
    public void setIpAssignment(android.net.IpConfiguration.IpAssignment p0) {}
    public void setProxySettings(android.net.IpConfiguration.ProxySettings p0) {}
    public void setStaticIpConfiguration(android.net.StaticIpConfiguration p0) {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        public Builder() {}
        @android.annotation.NonNull
        public android.net.IpConfiguration build() { return null; }
        @android.annotation.NonNull
        public android.net.IpConfiguration.Builder setHttpProxy(android.net.ProxyInfo p0) { return null; }
        @android.annotation.NonNull
        public android.net.IpConfiguration.Builder setStaticIpConfiguration(android.net.StaticIpConfiguration p0) { return null; }
    }

    public static enum IpAssignment {
        DHCP,
        STATIC,
        UNASSIGNED;
        private IpAssignment() {}
    }

    public static enum ProxySettings {
        NONE,
        PAC,
        STATIC,
        UNASSIGNED;
        private ProxySettings() {}
    }
}
