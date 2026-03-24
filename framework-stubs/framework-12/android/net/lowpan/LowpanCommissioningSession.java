package android.net.lowpan;

public class LowpanCommissioningSession {
    private final android.net.lowpan.ILowpanInterface mBinder = null;
    private final android.net.lowpan.LowpanBeaconInfo mBeaconInfo = null;
    private final android.net.lowpan.ILowpanInterfaceListener mInternalCallback = null;
    private final android.os.Looper mLooper = null;
    private android.os.Handler mHandler;
    private android.net.lowpan.LowpanCommissioningSession.Callback mCallback;
    private volatile boolean mIsClosed;
    LowpanCommissioningSession(android.net.lowpan.ILowpanInterface p0, android.net.lowpan.LowpanBeaconInfo p1, android.os.Looper p2) {}
    private void lockedCleanup() {}
    public android.net.lowpan.LowpanBeaconInfo getBeaconInfo() { return null; }
    public void sendToCommissioner(byte[] p0) {}
    public synchronized void setCallback(android.net.lowpan.LowpanCommissioningSession.Callback p0, android.os.Handler p1) {}
    public synchronized void close() {}

    public static abstract class Callback {
        public Callback() {}
        public void onReceiveFromCommissioner(byte[] p0) {}
        public void onClosed() {}
    }

    private class InternalCallback extends android.net.lowpan.ILowpanInterfaceListener.Stub {
        private InternalCallback(android.net.lowpan.LowpanCommissioningSession p0) { super(); }
        public void onStateChanged(java.lang.String p0) {}
        public void onReceiveFromCommissioner(byte[] p0) {}
        public void onEnabledChanged(boolean p0) {}
        public void onConnectedChanged(boolean p0) {}
        public void onUpChanged(boolean p0) {}
        public void onRoleChanged(java.lang.String p0) {}
        public void onLowpanIdentityChanged(android.net.lowpan.LowpanIdentity p0) {}
        public void onLinkNetworkAdded(android.net.IpPrefix p0) {}
        public void onLinkNetworkRemoved(android.net.IpPrefix p0) {}
        public void onLinkAddressAdded(java.lang.String p0) {}
        public void onLinkAddressRemoved(java.lang.String p0) {}
    }
}
