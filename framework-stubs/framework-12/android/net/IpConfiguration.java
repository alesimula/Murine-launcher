package android.net;

public final class IpConfiguration implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.net.IpConfiguration> CREATOR = null;
    public IpConfiguration() {}
    public IpConfiguration(android.net.IpConfiguration p0) {}
    @android.annotation.NonNull
    public android.net.IpConfiguration.IpAssignment getIpAssignment() { return null; }
    public void setIpAssignment(android.net.IpConfiguration.IpAssignment p0) {}
    @android.annotation.Nullable
    public android.net.StaticIpConfiguration getStaticIpConfiguration() { return null; }
    public void setStaticIpConfiguration(android.net.StaticIpConfiguration p0) {}
    @android.annotation.NonNull
    public android.net.IpConfiguration.ProxySettings getProxySettings() { return null; }
    public void setProxySettings(android.net.IpConfiguration.ProxySettings p0) {}
    @android.annotation.Nullable
    public android.net.ProxyInfo getHttpProxy() { return null; }
    public void setHttpProxy(android.net.ProxyInfo p0) {}
    public java.lang.String toString() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static enum IpAssignment {
        STATIC,
        DHCP,
        UNASSIGNED;
        private IpAssignment() {}
    }

    public static enum ProxySettings {
        NONE,
        STATIC,
        UNASSIGNED,
        PAC;
        private ProxySettings() {}
    }
}
