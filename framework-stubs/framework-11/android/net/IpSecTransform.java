package android.net;

public final class IpSecTransform implements java.lang.AutoCloseable {
    private static final java.lang.String TAG = "IpSecTransform";
    public static final int MODE_TRANSPORT = 0;
    public static final int MODE_TUNNEL = 1;
    public static final int ENCAP_NONE = 0;
    public static final int ENCAP_ESPINUDP_NON_IKE = 1;
    public static final int ENCAP_ESPINUDP = 2;
    private final android.net.IpSecConfig mConfig = null;
    private int mResourceId;
    private final android.content.Context mContext = null;
    private android.net.ConnectivityManager.PacketKeepalive mKeepalive;
    private android.os.Handler mCallbackHandler;
    private final android.net.ConnectivityManager.PacketKeepaliveCallback mKeepaliveCallback = null;
    private android.net.IpSecTransform.NattKeepaliveCallback mUserKeepaliveCallback;
    public IpSecTransform(android.content.Context p0, android.net.IpSecConfig p1) {}
    private android.net.IIpSecService getIpSecService() { return null; }
    private void checkResultStatus(int p0) throws java.io.IOException, android.net.IpSecManager.ResourceUnavailableException, android.net.IpSecManager.SpiUnavailableException {}
    private android.net.IpSecTransform activate() throws java.io.IOException, android.net.IpSecManager.ResourceUnavailableException, android.net.IpSecManager.SpiUnavailableException { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public void close() {}
    protected void finalize() throws java.lang.Throwable {}
    android.net.IpSecConfig getConfig() { return null; }
    public int getResourceId() { return 0; }
    public void startNattKeepalive(android.net.IpSecTransform.NattKeepaliveCallback p0, int p1, android.os.Handler p2) throws java.io.IOException {}
    public void stopNattKeepalive() {}
    public java.lang.String toString() { return null; }

    public static class Builder {
        private android.content.Context mContext;
        private android.net.IpSecConfig mConfig;
        public android.net.IpSecTransform.Builder setEncryption(android.net.IpSecAlgorithm p0) { return null; }
        public android.net.IpSecTransform.Builder setAuthentication(android.net.IpSecAlgorithm p0) { return null; }
        public android.net.IpSecTransform.Builder setAuthenticatedEncryption(android.net.IpSecAlgorithm p0) { return null; }
        public android.net.IpSecTransform.Builder setIpv4Encapsulation(android.net.IpSecManager.UdpEncapsulationSocket p0, int p1) { return null; }
        public android.net.IpSecTransform buildTransportModeTransform(java.net.InetAddress p0, android.net.IpSecManager.SecurityParameterIndex p1) throws android.net.IpSecManager.ResourceUnavailableException, android.net.IpSecManager.SpiUnavailableException, java.io.IOException { return null; }
        @android.annotation.SystemApi
        public android.net.IpSecTransform buildTunnelModeTransform(java.net.InetAddress p0, android.net.IpSecManager.SecurityParameterIndex p1) throws android.net.IpSecManager.ResourceUnavailableException, android.net.IpSecManager.SpiUnavailableException, java.io.IOException { return null; }
        public Builder(android.content.Context p0) {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface EncapType {
    }

    public static class NattKeepaliveCallback {
        public static final int ERROR_INVALID_NETWORK = 1;
        public static final int ERROR_HARDWARE_UNSUPPORTED = 2;
        public static final int ERROR_HARDWARE_ERROR = 3;
        public NattKeepaliveCallback() {}
        public void onStarted() {}
        public void onStopped() {}
        public void onError(int p0) {}
    }
}
