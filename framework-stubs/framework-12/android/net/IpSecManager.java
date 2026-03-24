package android.net;

public final class IpSecManager {
    private static final java.lang.String TAG = "IpSecManager";
    public static final int DIRECTION_IN = 0;
    public static final int DIRECTION_OUT = 1;
    public static final int DIRECTION_FWD = 2;
    public static final int INVALID_SECURITY_PARAMETER_INDEX = 0;
    public static final int INVALID_RESOURCE_ID = -1;
    private final android.content.Context mContext = null;
    private final android.net.IIpSecService mService = null;
    public android.net.IpSecManager.SecurityParameterIndex allocateSecurityParameterIndex(java.net.InetAddress p0) throws android.net.IpSecManager.ResourceUnavailableException { return null; }
    public android.net.IpSecManager.SecurityParameterIndex allocateSecurityParameterIndex(java.net.InetAddress p0, int p1) throws android.net.IpSecManager.SpiUnavailableException, android.net.IpSecManager.ResourceUnavailableException { return null; }
    public void applyTransportModeTransform(java.net.Socket p0, int p1, android.net.IpSecTransform p2) throws java.io.IOException {}
    public void applyTransportModeTransform(java.net.DatagramSocket p0, int p1, android.net.IpSecTransform p2) throws java.io.IOException {}
    public void applyTransportModeTransform(java.io.FileDescriptor p0, int p1, android.net.IpSecTransform p2) throws java.io.IOException {}
    public void removeTransportModeTransforms(java.net.Socket p0) throws java.io.IOException {}
    public void removeTransportModeTransforms(java.net.DatagramSocket p0) throws java.io.IOException {}
    public void removeTransportModeTransforms(java.io.FileDescriptor p0) throws java.io.IOException {}
    public void removeTunnelModeTransform(android.net.Network p0, android.net.IpSecTransform p1) {}
    public android.net.IpSecManager.UdpEncapsulationSocket openUdpEncapsulationSocket(int p0) throws java.io.IOException, android.net.IpSecManager.ResourceUnavailableException { return null; }
    public android.net.IpSecManager.UdpEncapsulationSocket openUdpEncapsulationSocket() throws java.io.IOException, android.net.IpSecManager.ResourceUnavailableException { return null; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MANAGE_IPSEC_TUNNELS")
    public android.net.IpSecManager.IpSecTunnelInterface createIpSecTunnelInterface(java.net.InetAddress p0, java.net.InetAddress p1, android.net.Network p2) throws android.net.IpSecManager.ResourceUnavailableException, java.io.IOException { return null; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MANAGE_IPSEC_TUNNELS")
    public void applyTunnelModeTransform(android.net.IpSecManager.IpSecTunnelInterface p0, int p1, android.net.IpSecTransform p2) throws java.io.IOException {}
    public IpSecManager(android.content.Context p0, android.net.IIpSecService p1) {}
    private static void maybeHandleServiceSpecificException(android.os.ServiceSpecificException p0) {}
    static java.lang.RuntimeException rethrowUncheckedExceptionFromServiceSpecificException(android.os.ServiceSpecificException p0) { return null; }
    static java.io.IOException rethrowCheckedExceptionFromServiceSpecificException(android.os.ServiceSpecificException p0) throws java.io.IOException { return null; }

    @android.annotation.SystemApi
    public static final class IpSecTunnelInterface implements java.lang.AutoCloseable {
        private final java.lang.String mOpPackageName = null;
        private final android.net.IIpSecService mService = null;
        private final java.net.InetAddress mRemoteAddress = null;
        private final java.net.InetAddress mLocalAddress = null;
        private final android.net.Network mUnderlyingNetwork = null;
        private java.lang.String mInterfaceName;
        private int mResourceId;
        public java.lang.String getInterfaceName() { return null; }
        @android.annotation.SystemApi
        @android.annotation.RequiresPermission("android.permission.MANAGE_IPSEC_TUNNELS")
        public void addAddress(java.net.InetAddress p0, int p1) throws java.io.IOException {}
        @android.annotation.SystemApi
        @android.annotation.RequiresPermission("android.permission.MANAGE_IPSEC_TUNNELS")
        public void removeAddress(java.net.InetAddress p0, int p1) throws java.io.IOException {}
        @android.annotation.RequiresPermission("android.permission.MANAGE_IPSEC_TUNNELS")
        public void setUnderlyingNetwork(android.net.Network p0) throws java.io.IOException {}
        private IpSecTunnelInterface(android.content.Context p0, android.net.IIpSecService p1, java.net.InetAddress p2, java.net.InetAddress p3, android.net.Network p4) throws android.net.IpSecManager.ResourceUnavailableException, java.io.IOException {}
        public void close() {}
        protected void finalize() throws java.lang.Throwable {}
        public int getResourceId() { return 0; }
        public java.lang.String toString() { return null; }
    }

    public static final class ResourceUnavailableException extends android.util.AndroidException {
        ResourceUnavailableException(java.lang.String p0) { super(); }
    }

    public static final class SecurityParameterIndex implements java.lang.AutoCloseable {
        private final android.net.IIpSecService mService = null;
        private final java.net.InetAddress mDestinationAddress = null;
        private int mSpi;
        private int mResourceId;
        public int getSpi() { return 0; }
        public void close() {}
        protected void finalize() throws java.lang.Throwable {}
        private SecurityParameterIndex(android.net.IIpSecService p0, java.net.InetAddress p1, int p2) throws android.net.IpSecManager.ResourceUnavailableException, android.net.IpSecManager.SpiUnavailableException {}
        public int getResourceId() { return 0; }
        public java.lang.String toString() { return null; }
    }

    public static final class SpiUnavailableException extends android.util.AndroidException {
        private final int mSpi = 0;
        SpiUnavailableException(java.lang.String p0, int p1) { super(); }
        public int getSpi() { return 0; }
    }

    public static interface Status {
        public static final int OK = 0;
        public static final int RESOURCE_UNAVAILABLE = 1;
        public static final int SPI_UNAVAILABLE = 2;
    }

    public static final class UdpEncapsulationSocket implements java.lang.AutoCloseable {
        private final android.os.ParcelFileDescriptor mPfd = null;
        private final android.net.IIpSecService mService = null;
        private int mResourceId;
        private final int mPort = 0;
        private UdpEncapsulationSocket(android.net.IIpSecService p0, int p1) throws android.net.IpSecManager.ResourceUnavailableException, java.io.IOException {}
        public java.io.FileDescriptor getFileDescriptor() { return null; }
        public int getPort() { return 0; }
        public void close() throws java.io.IOException {}
        protected void finalize() throws java.lang.Throwable {}
        @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
        public int getResourceId() { return 0; }
        public java.lang.String toString() { return null; }
    }
}
