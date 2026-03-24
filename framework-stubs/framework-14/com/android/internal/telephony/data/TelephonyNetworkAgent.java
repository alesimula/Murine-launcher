package com.android.internal.telephony.data;

public class TelephonyNetworkAgent extends android.net.NetworkAgent {
    public TelephonyNetworkAgent(com.android.internal.telephony.Phone p0, android.os.Looper p1, com.android.internal.telephony.data.DataNetwork p2, android.net.NetworkScore p3, android.net.NetworkAgentConfig p4, android.net.NetworkProvider p5, com.android.internal.telephony.data.TelephonyNetworkAgent.TelephonyNetworkAgentCallback p6) { super((android.content.Context)null, (android.os.Looper)null, (java.lang.String)null, (android.net.NetworkCapabilities)null, (android.net.LinkProperties)null, 0, (android.net.NetworkAgentConfig)null, (android.net.NetworkProvider)null); }
    public void onNetworkUnwanted() {}
    public int getId() { return 0; }
    public void onValidationStatus(int p0, android.net.Uri p1) {}
    public void onBandwidthUpdateRequested() {}
    public void onStartSocketKeepalive(int p0, java.time.Duration p1, android.net.KeepalivePacketData p2) {}
    public void onStopSocketKeepalive(int p0) {}
    public void onQosCallbackRegistered(int p0, android.net.QosFilter p1) {}
    public void onQosCallbackUnregistered(int p0) {}
    public void abandon() {}
    public void registerCallback(com.android.internal.telephony.data.TelephonyNetworkAgent.TelephonyNetworkAgentCallback p0) {}
    public void unregisterCallback(com.android.internal.telephony.data.TelephonyNetworkAgent.TelephonyNetworkAgentCallback p0) {}
    protected void log(java.lang.String p0) {}
    public void dump(java.io.FileDescriptor p0, java.io.PrintWriter p1, java.lang.String[] p2) {}

    public static abstract class TelephonyNetworkAgentCallback extends com.android.internal.telephony.data.DataCallback {
        public TelephonyNetworkAgentCallback(java.util.concurrent.Executor p0) { super(null); }
        public void onValidationStatus(int p0, android.net.Uri p1) {}
        public void onQosCallbackRegistered(int p0, android.net.QosFilter p1) {}
        public void onQosCallbackUnregistered(int p0) {}
        public void onStartSocketKeepalive(int p0, java.time.Duration p1, android.net.KeepalivePacketData p2) {}
        public void onStopSocketKeepalive(int p0) {}
    }
}
