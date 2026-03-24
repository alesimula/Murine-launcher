package android.net.nsd;

public final class NsdServiceInfo implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.net.nsd.NsdServiceInfo> CREATOR = null;
    public NsdServiceInfo() {}
    public int describeContents() { return 0; }
    public java.util.Map<java.lang.String, byte[]> getAttributes() { return null; }
    @java.lang.Deprecated
    public java.net.InetAddress getHost() { return null; }
    @android.annotation.NonNull
    public java.util.List<java.net.InetAddress> getHostAddresses() { return null; }
    @android.annotation.FlaggedApi("com.android.net.flags.ipv6_over_ble")
    @android.annotation.Nullable
    public java.lang.String getHostname() { return null; }
    @android.annotation.Nullable
    public android.net.Network getNetwork() { return null; }
    public int getPort() { return 0; }
    public java.lang.String getServiceName() { return null; }
    public java.lang.String getServiceType() { return null; }
    @android.annotation.FlaggedApi("com.android.net.flags.nsd_subtypes_support_enabled")
    @android.annotation.NonNull
    public java.util.Set<java.lang.String> getSubtypes() { return null; }
    public void removeAttribute(java.lang.String p0) {}
    public void setAttribute(java.lang.String p0, java.lang.String p1) {}
    @java.lang.Deprecated
    public void setHost(java.net.InetAddress p0) {}
    public void setHostAddresses(java.util.List<java.net.InetAddress> p0) {}
    public void setNetwork(android.net.Network p0) {}
    public void setPort(int p0) {}
    public void setServiceName(java.lang.String p0) {}
    public void setServiceType(java.lang.String p0) {}
    @android.annotation.FlaggedApi("com.android.net.flags.nsd_subtypes_support_enabled")
    public void setSubtypes(java.util.Set<java.lang.String> p0) {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
