package android.net.ipsec.ike;

public final class IkeSessionConfiguration {
    public static final int EXTENSION_TYPE_FRAGMENTATION = 1;
    public static final int EXTENSION_TYPE_MOBIKE = 2;
    IkeSessionConfiguration() {}
    @android.annotation.NonNull
    public java.lang.String getRemoteApplicationVersion() { return null; }
    @android.annotation.NonNull
    public java.util.List<byte[]> getRemoteVendorIds() { return null; }
    public boolean isIkeExtensionEnabled(int p0) { return false; }
    @android.annotation.NonNull
    public java.util.List<java.net.InetAddress> getPcscfServers() { return null; }
    @android.annotation.NonNull
    public android.net.ipsec.ike.IkeSessionConnectionInfo getIkeSessionConnectionInfo() { return null; }
    @android.annotation.Nullable
    public android.net.eap.EapInfo getEapInfo() { return null; }

    public static final class Builder {
        public Builder(android.net.ipsec.ike.IkeSessionConnectionInfo p0) {}
        @android.annotation.NonNull
        public android.net.ipsec.ike.IkeSessionConfiguration.Builder addPcscfServer(java.net.InetAddress p0) { return null; }
        @android.annotation.NonNull
        public android.net.ipsec.ike.IkeSessionConfiguration.Builder clearPcscfServers() { return null; }
        @android.annotation.NonNull
        public android.net.ipsec.ike.IkeSessionConfiguration.Builder addRemoteVendorId(byte[] p0) { return null; }
        @android.annotation.NonNull
        public android.net.ipsec.ike.IkeSessionConfiguration.Builder clearRemoteVendorIds() { return null; }
        @android.annotation.NonNull
        public android.net.ipsec.ike.IkeSessionConfiguration.Builder setRemoteApplicationVersion(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        public android.net.ipsec.ike.IkeSessionConfiguration.Builder clearRemoteApplicationVersion() { return null; }
        @android.annotation.NonNull
        public android.net.ipsec.ike.IkeSessionConfiguration.Builder addIkeExtension(int p0) { return null; }
        @android.annotation.NonNull
        public android.net.ipsec.ike.IkeSessionConfiguration.Builder clearIkeExtensions() { return null; }
        @android.annotation.NonNull
        public android.net.ipsec.ike.IkeSessionConfiguration.Builder setEapInfo(android.net.eap.EapInfo p0) { return null; }
        @android.annotation.NonNull
        public android.net.ipsec.ike.IkeSessionConfiguration build() { return null; }
    }
}
