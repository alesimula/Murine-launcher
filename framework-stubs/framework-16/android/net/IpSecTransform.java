package android.net;

public final class IpSecTransform implements java.lang.AutoCloseable {
    IpSecTransform() {}
    public void close() {}
    @android.annotation.FlaggedApi("com.android.net.flags.ipsec_transform_state")
    public void requestIpSecTransformState(java.util.concurrent.Executor p0, android.os.OutcomeReceiver<android.net.IpSecTransformState, java.lang.RuntimeException> p1) {}

    public static class Builder {
        public Builder(android.content.Context p0) {}
        @android.annotation.NonNull
        public android.net.IpSecTransform buildTransportModeTransform(java.net.InetAddress p0, android.net.IpSecManager.SecurityParameterIndex p1) throws java.io.IOException, android.net.IpSecManager.ResourceUnavailableException, android.net.IpSecManager.SpiUnavailableException { return null; }
        @android.annotation.NonNull
        public android.net.IpSecTransform buildTunnelModeTransform(java.net.InetAddress p0, android.net.IpSecManager.SecurityParameterIndex p1) throws java.io.IOException, android.net.IpSecManager.ResourceUnavailableException, android.net.IpSecManager.SpiUnavailableException { return null; }
        @android.annotation.NonNull
        public android.net.IpSecTransform.Builder setAuthenticatedEncryption(android.net.IpSecAlgorithm p0) { return null; }
        @android.annotation.NonNull
        public android.net.IpSecTransform.Builder setAuthentication(android.net.IpSecAlgorithm p0) { return null; }
        @android.annotation.NonNull
        public android.net.IpSecTransform.Builder setEncryption(android.net.IpSecAlgorithm p0) { return null; }
        @android.annotation.NonNull
        public android.net.IpSecTransform.Builder setIpv4Encapsulation(android.net.IpSecManager.UdpEncapsulationSocket p0, int p1) { return null; }
    }
}
