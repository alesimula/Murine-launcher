package android.net;

public abstract class NetworkAgent {
    public static final int DSCP_POLICY_STATUS_DELETED = 4;
    public static final int DSCP_POLICY_STATUS_INSUFFICIENT_PROCESSING_RESOURCES = 3;
    public static final int DSCP_POLICY_STATUS_POLICY_NOT_FOUND = 5;
    public static final int DSCP_POLICY_STATUS_REQUESTED_CLASSIFIER_NOT_SUPPORTED = 2;
    public static final int DSCP_POLICY_STATUS_REQUEST_DECLINED = 1;
    public static final int DSCP_POLICY_STATUS_SUCCESS = 0;
    public static final int VALIDATION_STATUS_NOT_VALID = 2;
    public static final int VALIDATION_STATUS_VALID = 1;
    public NetworkAgent(android.content.Context p0, android.os.Looper p1, java.lang.String p2, android.net.NetworkCapabilities p3, android.net.LinkProperties p4, int p5, android.net.NetworkAgentConfig p6, android.net.NetworkProvider p7) {}
    public NetworkAgent(android.content.Context p0, android.os.Looper p1, java.lang.String p2, android.net.NetworkCapabilities p3, android.net.LinkProperties p4, android.net.NetworkScore p5, android.net.NetworkAgentConfig p6, android.net.NetworkProvider p7) {}
    @android.annotation.Nullable
    public android.net.Network getNetwork() { return null; }
    public void markConnected() {}
    public void onAddKeepalivePacketFilter(int p0, android.net.KeepalivePacketData p1) {}
    public void onAutomaticReconnectDisabled() {}
    public void onBandwidthUpdateRequested() {}
    public void onDscpPolicyStatusUpdated(int p0, int p1) {}
    public void onNetworkCreated() {}
    public void onNetworkDestroyed() {}
    public void onNetworkUnwanted() {}
    public void onQosCallbackRegistered(int p0, android.net.QosFilter p1) {}
    public void onQosCallbackUnregistered(int p0) {}
    public void onRemoveKeepalivePacketFilter(int p0) {}
    public void onSaveAcceptUnvalidated(boolean p0) {}
    public void onSignalStrengthThresholdsUpdated(int[] p0) {}
    public void onStartSocketKeepalive(int p0, java.time.Duration p1, android.net.KeepalivePacketData p2) {}
    public void onStopSocketKeepalive(int p0) {}
    public void onValidationStatus(int p0, android.net.Uri p1) {}
    @android.annotation.NonNull
    public android.net.Network register() { return null; }
    public void sendAddDscpPolicy(android.net.DscpPolicy p0) {}
    public void sendLinkProperties(android.net.LinkProperties p0) {}
    public void sendNetworkCapabilities(android.net.NetworkCapabilities p0) {}
    public void sendNetworkScore(android.net.NetworkScore p0) {}
    public void sendNetworkScore(int p0) {}
    public final void sendQosCallbackError(int p0, int p1) {}
    public final void sendQosSessionAvailable(int p0, int p1, android.net.QosSessionAttributes p2) {}
    public final void sendQosSessionLost(int p0, int p1, int p2) {}
    public void sendRemoveAllDscpPolicies() {}
    public void sendRemoveDscpPolicy(int p0) {}
    public final void sendSocketKeepaliveEvent(int p0, int p1) {}
    @java.lang.Deprecated
    public void setLegacySubtype(int p0, java.lang.String p1) {}
    public void setLingerDuration(java.time.Duration p0) {}
    public void setTeardownDelayMillis(int p0) {}
    public void setUnderlyingNetworks(java.util.List<android.net.Network> p0) {}
    public void unregister() {}
    public void unregisterAfterReplacement(int p0) {}
}
