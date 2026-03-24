package android.net;

public final class IpSecTransform implements java.lang.AutoCloseable {
    IpSecTransform() {}
    public boolean equals(java.lang.Object p0) { return false; }
    public void close() {}
    protected void finalize() throws java.lang.Throwable {}
    public java.lang.String toString() { return null; }

    public static class Builder {
        public Builder(android.content.Context p0) {}
        @android.annotation.NonNull
        public android.net.IpSecTransform.Builder setEncryption(android.net.IpSecAlgorithm p0) { return null; }
        @android.annotation.NonNull
        public android.net.IpSecTransform.Builder setAuthentication(android.net.IpSecAlgorithm p0) { return null; }
        @android.annotation.NonNull
        public android.net.IpSecTransform.Builder setAuthenticatedEncryption(android.net.IpSecAlgorithm p0) { return null; }
        @android.annotation.NonNull
        public android.net.IpSecTransform.Builder setIpv4Encapsulation(android.net.IpSecManager.UdpEncapsulationSocket p0, int p1) { return null; }
        @android.annotation.NonNull
        public android.net.IpSecTransform buildTransportModeTransform(java.net.InetAddress p0, android.net.IpSecManager.SecurityParameterIndex p1) throws java.io.IOException, android.net.IpSecManager.ResourceUnavailableException, android.net.IpSecManager.SpiUnavailableException { return null; }
        @android.annotation.NonNull
        public android.net.IpSecTransform buildTunnelModeTransform(java.net.InetAddress p0, android.net.IpSecManager.SecurityParameterIndex p1) throws java.io.IOException, android.net.IpSecManager.ResourceUnavailableException, android.net.IpSecManager.SpiUnavailableException { return null; }
    }
}
