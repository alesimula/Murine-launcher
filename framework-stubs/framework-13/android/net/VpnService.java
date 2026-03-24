package android.net;

public class VpnService extends android.app.Service {
    public static final java.lang.String SERVICE_INTERFACE = "android.net.VpnService";
    public static final java.lang.String SERVICE_META_DATA_SUPPORTS_ALWAYS_ON = "android.net.VpnService.SUPPORTS_ALWAYS_ON";
    public VpnService() { super(); }
    public static android.content.Intent prepare(android.content.Context p0) { return null; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.CONTROL_VPN")
    public static void prepareAndAuthorize(android.content.Context p0) {}
    public boolean protect(int p0) { return false; }
    public boolean protect(java.net.Socket p0) { return false; }
    public boolean protect(java.net.DatagramSocket p0) { return false; }
    public boolean addAddress(java.net.InetAddress p0, int p1) { return false; }
    public boolean removeAddress(java.net.InetAddress p0, int p1) { return false; }
    public boolean setUnderlyingNetworks(android.net.Network[] p0) { return false; }
    public final boolean isAlwaysOn() { return false; }
    public final boolean isLockdownEnabled() { return false; }
    public android.os.IBinder onBind(android.content.Intent p0) { return null; }
    public void onRevoke() {}

    public class Builder {
        public Builder(android.net.VpnService p0) {}
        public android.net.VpnService.Builder setSession(java.lang.String p0) { return null; }
        public android.net.VpnService.Builder setConfigureIntent(android.app.PendingIntent p0) { return null; }
        public android.net.VpnService.Builder setMtu(int p0) { return null; }
        public android.net.VpnService.Builder setHttpProxy(android.net.ProxyInfo p0) { return null; }
        public android.net.VpnService.Builder addAddress(java.net.InetAddress p0, int p1) { return null; }
        public android.net.VpnService.Builder addAddress(java.lang.String p0, int p1) { return null; }
        public android.net.VpnService.Builder addRoute(java.net.InetAddress p0, int p1) { return null; }
        public android.net.VpnService.Builder addRoute(android.net.IpPrefix p0) { return null; }
        public android.net.VpnService.Builder addRoute(java.lang.String p0, int p1) { return null; }
        public android.net.VpnService.Builder excludeRoute(android.net.IpPrefix p0) { return null; }
        public android.net.VpnService.Builder addDnsServer(java.net.InetAddress p0) { return null; }
        public android.net.VpnService.Builder addDnsServer(java.lang.String p0) { return null; }
        public android.net.VpnService.Builder addSearchDomain(java.lang.String p0) { return null; }
        public android.net.VpnService.Builder allowFamily(int p0) { return null; }
        public android.net.VpnService.Builder addAllowedApplication(java.lang.String p0) throws android.content.pm.PackageManager.NameNotFoundException { return null; }
        public android.net.VpnService.Builder addDisallowedApplication(java.lang.String p0) throws android.content.pm.PackageManager.NameNotFoundException { return null; }
        public android.net.VpnService.Builder allowBypass() { return null; }
        public android.net.VpnService.Builder setBlocking(boolean p0) { return null; }
        public android.net.VpnService.Builder setUnderlyingNetworks(android.net.Network[] p0) { return null; }
        public android.net.VpnService.Builder setMetered(boolean p0) { return null; }
        public android.os.ParcelFileDescriptor establish() { return null; }
        public java.util.List<android.net.RouteInfo> routes() { return null; }
    }

    private class Callback extends android.os.Binder {
        protected boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) { return false; }
    }
}
