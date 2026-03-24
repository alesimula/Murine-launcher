package android.net;

public class IpConfiguration implements android.os.Parcelable {
    private static final java.lang.String TAG = "IpConfiguration";
    public android.net.IpConfiguration.IpAssignment ipAssignment;
    public android.net.StaticIpConfiguration staticIpConfiguration;
    public android.net.IpConfiguration.ProxySettings proxySettings;
    @android.annotation.UnsupportedAppUsage
    public android.net.ProxyInfo httpProxy;
    public static final android.os.Parcelable.Creator<android.net.IpConfiguration> CREATOR = null;
    private void init(android.net.IpConfiguration.IpAssignment p0, android.net.IpConfiguration.ProxySettings p1, android.net.StaticIpConfiguration p2, android.net.ProxyInfo p3) {}
    public IpConfiguration() {}
    @android.annotation.UnsupportedAppUsage
    public IpConfiguration(android.net.IpConfiguration.IpAssignment p0, android.net.IpConfiguration.ProxySettings p1, android.net.StaticIpConfiguration p2, android.net.ProxyInfo p3) {}
    public IpConfiguration(android.net.IpConfiguration p0) {}
    public android.net.IpConfiguration.IpAssignment getIpAssignment() { return null; }
    public void setIpAssignment(android.net.IpConfiguration.IpAssignment p0) {}
    public android.net.StaticIpConfiguration getStaticIpConfiguration() { return null; }
    public void setStaticIpConfiguration(android.net.StaticIpConfiguration p0) {}
    public android.net.IpConfiguration.ProxySettings getProxySettings() { return null; }
    public void setProxySettings(android.net.IpConfiguration.ProxySettings p0) {}
    public android.net.ProxyInfo getHttpProxy() { return null; }
    public void setHttpProxy(android.net.ProxyInfo p0) {}
    public java.lang.String toString() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static enum ProxySettings {
        NONE,
        STATIC,
        UNASSIGNED,
        PAC;
        private ProxySettings() {}
    }

    public static enum IpAssignment {
        STATIC,
        DHCP,
        UNASSIGNED;
        private IpAssignment() {}
    }
}
