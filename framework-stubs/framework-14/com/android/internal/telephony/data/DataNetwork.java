package com.android.internal.telephony.data;

public class DataNetwork extends com.android.internal.telephony.StateMachine {
    public static final int TEAR_DOWN_REASON_NONE = 0;
    public static final int TEAR_DOWN_REASON_CONNECTIVITY_SERVICE_UNWANTED = 1;
    public static final int TEAR_DOWN_REASON_SIM_REMOVAL = 2;
    public static final int TEAR_DOWN_REASON_AIRPLANE_MODE_ON = 3;
    public static final int TEAR_DOWN_REASON_DATA_DISABLED = 4;
    public static final int TEAR_DOWN_REASON_NO_LIVE_REQUEST = 5;
    public static final int TEAR_DOWN_REASON_RAT_NOT_ALLOWED = 6;
    public static final int TEAR_DOWN_REASON_ROAMING_DISABLED = 7;
    public static final int TEAR_DOWN_REASON_CONCURRENT_VOICE_DATA_NOT_ALLOWED = 8;
    public static final int TEAR_DOWN_REASON_DATA_SERVICE_NOT_READY = 10;
    public static final int TEAR_DOWN_REASON_POWER_OFF_BY_CARRIER = 11;
    public static final int TEAR_DOWN_REASON_DATA_STALL = 12;
    public static final int TEAR_DOWN_REASON_HANDOVER_FAILED = 13;
    public static final int TEAR_DOWN_REASON_HANDOVER_NOT_ALLOWED = 14;
    public static final int TEAR_DOWN_REASON_VCN_REQUESTED = 15;
    public static final int TEAR_DOWN_REASON_VOPS_NOT_SUPPORTED = 16;
    public static final int TEAR_DOWN_REASON_DEFAULT_DATA_UNSELECTED = 17;
    public static final int TEAR_DOWN_REASON_NOT_IN_SERVICE = 18;
    public static final int TEAR_DOWN_REASON_DATA_CONFIG_NOT_READY = 19;
    public static final int TEAR_DOWN_REASON_PENDING_TEAR_DOWN_ALL = 20;
    public static final int TEAR_DOWN_REASON_NO_SUITABLE_DATA_PROFILE = 21;
    public static final int TEAR_DOWN_REASON_CDMA_EMERGENCY_CALLBACK_MODE = 22;
    public static final int TEAR_DOWN_REASON_RETRY_SCHEDULED = 23;
    public static final int TEAR_DOWN_REASON_DATA_THROTTLED = 24;
    public static final int TEAR_DOWN_REASON_DATA_PROFILE_INVALID = 25;
    public static final int TEAR_DOWN_REASON_DATA_PROFILE_NOT_PREFERRED = 26;
    public static final int TEAR_DOWN_REASON_NOT_ALLOWED_BY_POLICY = 27;
    public static final int TEAR_DOWN_REASON_ILLEGAL_STATE = 28;
    public static final int TEAR_DOWN_REASON_ONLY_ALLOWED_SINGLE_NETWORK = 29;
    public static final int TEAR_DOWN_REASON_PREFERRED_DATA_SWITCHED = 30;
    public static final int BANDWIDTH_SOURCE_UNKNOWN = 0;
    public static final int BANDWIDTH_SOURCE_MODEM = 1;
    public static final int BANDWIDTH_SOURCE_CARRIER_CONFIG = 2;
    public static final int BANDWIDTH_SOURCE_BANDWIDTH_ESTIMATOR = 3;
    public DataNetwork(com.android.internal.telephony.Phone p0, android.os.Looper p1, android.util.SparseArray<com.android.internal.telephony.data.DataServiceManager> p2, android.telephony.data.DataProfile p3, com.android.internal.telephony.data.DataNetworkController.NetworkRequestList p4, int p5, com.android.internal.telephony.data.DataEvaluation.DataAllowedReason p6, com.android.internal.telephony.data.DataNetwork.DataNetworkCallback p7) { super((java.lang.String)null); }
    protected void unhandledMessage(android.os.Message p0) {}
    public boolean attachNetworkRequests(com.android.internal.telephony.data.DataNetworkController.NetworkRequestList p0) { return false; }
    public void onAttachNetworkRequests(com.android.internal.telephony.data.DataNetworkController.NetworkRequestList p0) {}
    public void detachNetworkRequest(com.android.internal.telephony.data.TelephonyNetworkRequest p0, boolean p1) {}
    public android.net.NetworkCapabilities getNetworkCapabilities() { return null; }
    public android.net.LinkProperties getLinkProperties() { return null; }
    public android.telephony.data.DataProfile getDataProfile() { return null; }
    public void tearDown(int p0) {}
    public boolean shouldDelayImsTearDownDueToInCall() { return false; }
    public java.lang.Runnable tearDownWhenConditionMet(int p0, long p1) { return null; }
    public int getId() { return 0; }
    public int getLinkStatus() { return 0; }
    public int getApnTypeNetworkCapability() { return 0; }
    public int getPriority() { return 0; }
    public com.android.internal.telephony.data.DataNetworkController.NetworkRequestList getAttachedNetworkRequestList() { return null; }
    public boolean isConnecting() { return false; }
    public boolean isConnected() { return false; }
    public boolean isDisconnecting() { return false; }
    public boolean isDisconnected() { return false; }
    public boolean isHandoverInProgress() { return false; }
    public boolean isSuspended() { return false; }
    public int getTransport() { return 0; }
    public boolean isInternetSupported() { return false; }
    public boolean isEmergencySupl() { return false; }
    public boolean startHandover(int p0, com.android.internal.telephony.data.DataRetryManager.DataHandoverRetryEntry p1) { return false; }
    public int getLastKnownDataNetworkType() { return 0; }
    public java.util.Map<java.lang.Integer, android.telephony.PcoData> getPcoData() { return null; }
    public boolean hasNetworkCapabilityInNetworkRequests(int p0) { return false; }
    public static java.lang.String tearDownReasonToString(int p0) { return null; }
    public java.lang.String toString() { return null; }
    public java.lang.String name() { return null; }
    protected void log(java.lang.String p0) {}
    protected void loge(java.lang.String p0) {}
    protected void logv(java.lang.String p0) {}
    public void dump(java.io.FileDescriptor p0, java.io.PrintWriter p1, java.lang.String[] p2) {}

    public static @interface BandwidthEstimationSource {
    }

    private final class ConnectedState extends com.android.internal.telephony.State {
        public void enter() {}
        public boolean processMessage(android.os.Message p0) { return false; }
    }

    private final class ConnectingState extends com.android.internal.telephony.State {
        public void enter() {}
        public void exit() {}
        public boolean processMessage(android.os.Message p0) { return false; }
    }

    public static abstract class DataNetworkCallback extends com.android.internal.telephony.data.DataCallback {
        public DataNetworkCallback(java.util.concurrent.Executor p0) { super(null); }
        public abstract void onSetupDataFailed(com.android.internal.telephony.data.DataNetwork p0, com.android.internal.telephony.data.DataNetworkController.NetworkRequestList p1, int p2, long p3);
        public abstract void onConnected(com.android.internal.telephony.data.DataNetwork p0);
        public abstract void onValidationStatusChanged(com.android.internal.telephony.data.DataNetwork p0, int p1, android.net.Uri p2);
        public abstract void onSuspendedStateChanged(com.android.internal.telephony.data.DataNetwork p0, boolean p1);
        public abstract void onAttachFailed(com.android.internal.telephony.data.DataNetwork p0, com.android.internal.telephony.data.DataNetworkController.NetworkRequestList p1);
        public abstract void onDisconnected(com.android.internal.telephony.data.DataNetwork p0, int p1, int p2);
        public abstract void onHandoverSucceeded(com.android.internal.telephony.data.DataNetwork p0);
        public abstract void onHandoverFailed(com.android.internal.telephony.data.DataNetwork p0, int p1, long p2, int p3);
        public abstract void onLinkStatusChanged(com.android.internal.telephony.data.DataNetwork p0, int p1);
        public abstract void onPcoDataChanged(com.android.internal.telephony.data.DataNetwork p0);
        public abstract void onNetworkCapabilitiesChanged(com.android.internal.telephony.data.DataNetwork p0);
        public abstract void onTrackNetworkUnwanted(com.android.internal.telephony.data.DataNetwork p0);
        public abstract void onRetryUnsatisfiedNetworkRequest(com.android.internal.telephony.data.TelephonyNetworkRequest p0);
    }

    private final class DefaultState extends com.android.internal.telephony.State {
        public void enter() {}
        public void exit() {}
        public boolean processMessage(android.os.Message p0) { return false; }
    }

    private final class DisconnectedState extends com.android.internal.telephony.State {
        public void enter() {}
        public boolean processMessage(android.os.Message p0) { return false; }
    }

    private final class DisconnectingState extends com.android.internal.telephony.State {
        public void enter() {}
        public void exit() {}
        public boolean processMessage(android.os.Message p0) { return false; }
    }

    private final class HandoverState extends com.android.internal.telephony.State {
        public void enter() {}
        public void exit() {}
        public boolean processMessage(android.os.Message p0) { return false; }
    }

    public static class NetworkBandwidth {
        public final int downlinkBandwidthKbps = 0;
        public final int uplinkBandwidthKbps = 0;
        public NetworkBandwidth(int p0, int p1) {}
        public java.lang.String toString() { return null; }
    }

    public static @interface TearDownReason {
    }
}
