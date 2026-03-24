package android.net;

public class IpSecManager {
    public static final int DIRECTION_FWD = 2;
    public static final int DIRECTION_IN = 0;
    public static final int DIRECTION_OUT = 1;
    IpSecManager() {}
    @android.annotation.NonNull
    public android.net.IpSecManager.SecurityParameterIndex allocateSecurityParameterIndex(java.net.InetAddress p0) throws android.net.IpSecManager.ResourceUnavailableException { return null; }
    @android.annotation.NonNull
    public android.net.IpSecManager.SecurityParameterIndex allocateSecurityParameterIndex(java.net.InetAddress p0, int p1) throws android.net.IpSecManager.ResourceUnavailableException, android.net.IpSecManager.SpiUnavailableException { return null; }
    public void applyTransportModeTransform(java.net.Socket p0, int p1, android.net.IpSecTransform p2) throws java.io.IOException {}
    public void applyTransportModeTransform(java.net.DatagramSocket p0, int p1, android.net.IpSecTransform p2) throws java.io.IOException {}
    public void applyTransportModeTransform(java.io.FileDescriptor p0, int p1, android.net.IpSecTransform p2) throws java.io.IOException {}
    public void removeTransportModeTransforms(java.net.Socket p0) throws java.io.IOException {}
    public void removeTransportModeTransforms(java.net.DatagramSocket p0) throws java.io.IOException {}
    public void removeTransportModeTransforms(java.io.FileDescriptor p0) throws java.io.IOException {}
    @android.annotation.NonNull
    public android.net.IpSecManager.UdpEncapsulationSocket openUdpEncapsulationSocket(int p0) throws java.io.IOException, android.net.IpSecManager.ResourceUnavailableException { return null; }
    @android.annotation.NonNull
    public android.net.IpSecManager.UdpEncapsulationSocket openUdpEncapsulationSocket() throws java.io.IOException, android.net.IpSecManager.ResourceUnavailableException { return null; }
    @android.annotation.NonNull
    public android.net.IpSecManager.IpSecTunnelInterface createIpSecTunnelInterface(java.net.InetAddress p0, java.net.InetAddress p1, android.net.Network p2) throws java.io.IOException, android.net.IpSecManager.ResourceUnavailableException { return null; }
    public void applyTunnelModeTransform(android.net.IpSecManager.IpSecTunnelInterface p0, int p1, android.net.IpSecTransform p2) throws java.io.IOException {}

    public static final class IpSecTunnelInterface implements java.lang.AutoCloseable {
        @android.annotation.NonNull
        public java.lang.String getInterfaceName() { return null; }
        public void addAddress(java.net.InetAddress p0, int p1) throws java.io.IOException {}
        public void removeAddress(java.net.InetAddress p0, int p1) throws java.io.IOException {}
        public void setUnderlyingNetwork(android.net.Network p0) throws java.io.IOException {}
        public void close() {}
        protected void finalize() throws java.lang.Throwable {}
        @android.annotation.NonNull
        public java.lang.String toString() { return null; }
    }

    public static final class ResourceUnavailableException extends android.util.AndroidException {
        ResourceUnavailableException() { super(); }
    }

    public static final class SecurityParameterIndex implements java.lang.AutoCloseable {
        public int getSpi() { return 0; }
        public void close() {}
        protected void finalize() throws java.lang.Throwable {}
        public java.lang.String toString() { return null; }
    }

    public static final class SpiUnavailableException extends android.util.AndroidException {
        SpiUnavailableException() { super(); }
        public int getSpi() { return 0; }
    }

    public static final class UdpEncapsulationSocket implements java.lang.AutoCloseable {
        public java.io.FileDescriptor getFileDescriptor() { return null; }
        public int getPort() { return 0; }
        public void close() throws java.io.IOException {}
        protected void finalize() throws java.lang.Throwable {}
        public int getResourceId() { return 0; }
        public java.lang.String toString() { return null; }
    }
}
