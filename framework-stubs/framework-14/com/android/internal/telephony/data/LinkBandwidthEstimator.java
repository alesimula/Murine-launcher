package com.android.internal.telephony.data;

public class LinkBandwidthEstimator extends android.os.Handler {
    static final int MSG_SCREEN_STATE_CHANGED = 1;
    static final int MSG_TRAFFIC_STATS_POLL = 2;
    static final int MSG_MODEM_ACTIVITY_RETURNED = 3;
    static final int MSG_DEFAULT_NETWORK_CHANGED = 4;
    static final int MSG_SIGNAL_STRENGTH_CHANGED = 5;
    static final int MSG_NR_FREQUENCY_CHANGED = 6;
    static final int MSG_NR_STATE_CHANGED = 7;
    static final int MSG_ACTIVE_PHONE_CHANGED = 8;
    static final int MSG_DATA_REG_STATE_OR_RAT_CHANGED = 9;
    static final int UNKNOWN_TAC = 2147483647;
    public static final int BW_STATS_COUNT_THRESHOLD = 5;
    public static final int NUM_SIGNAL_LEVEL = 5;
    public static final int LINK_TX = 0;
    public static final int LINK_RX = 1;
    public static final int NUM_LINK_DIRECTION = 2;
    public LinkBandwidthEstimator(com.android.internal.telephony.Phone p0, com.android.internal.telephony.TelephonyFacade p1) { super(); }
    public void handleMessage(android.os.Message p0) {}
    public void registerCallback(com.android.internal.telephony.data.LinkBandwidthEstimator.LinkBandwidthEstimatorCallback p0) {}
    public void unregisterCallback(com.android.internal.telephony.data.LinkBandwidthEstimator.LinkBandwidthEstimatorCallback p0) {}
    public int getDataActivity() { return 0; }
    public java.lang.String getDataRatName(int p0) { return null; }
    public static java.lang.String getDataRatName(int p0, int p1) { return null; }
    public android.util.Pair<java.lang.Integer, java.lang.Integer> getStaticAvgBw(int p0) { return null; }
    void logv(java.lang.String p0) {}
    void logd(java.lang.String p0) {}
    public com.android.internal.telephony.data.LinkBandwidthEstimator.NetworkBandwidth lookupNetwork(java.lang.String p0, int p1, java.lang.String p2) { return null; }
    public void dump(java.io.FileDescriptor p0, java.io.PrintWriter p1, java.lang.String[] p2) {}

    private class BandwidthState {
        int mFilterKbps;
        int mByteDeltaAccThr;
        int mAvgUsedKbps;
        int mBwSampleKbps;
        boolean mBwSampleValid;
        long mBwSampleValidTimeMs;
        int mStaticBwKbps;
        int mLastReportedBwKbps;
        BandwidthState(com.android.internal.telephony.data.LinkBandwidthEstimator p0, int p1) {}
        public boolean hasLargeBwChange() { return false; }
        public void calculateError() {}
    }

    public static class LinkBandwidthEstimatorCallback extends com.android.internal.telephony.data.DataCallback {
        public LinkBandwidthEstimatorCallback(java.util.concurrent.Executor p0) { super(null); }
        public void onDataActivityChanged(int p0) {}
        public void onBandwidthChanged(int p0, int p1) {}
    }

    public class NetworkBandwidth {
        NetworkBandwidth(com.android.internal.telephony.data.LinkBandwidthEstimator p0, java.lang.String p1) {}
        public void update(long p0, int p1, int p2) {}
        public long getValue(int p0, int p1) { return 0L; }
        public int getCount(int p0, int p1) { return 0; }
        public java.lang.String toString() { return null; }
    }

    private static class NetworkKey {
        NetworkKey(java.lang.String p0, int p1, java.lang.String p2) {}
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
        public java.lang.String toString() { return null; }
    }

    private class TelephonyCallbackImpl extends android.telephony.TelephonyCallback implements android.telephony.TelephonyCallback.SignalStrengthsListener, android.telephony.TelephonyCallback.ActiveDataSubscriptionIdListener {
        public void onSignalStrengthsChanged(android.telephony.SignalStrength p0) {}
        public void onActiveDataSubscriptionIdChanged(int p0) {}
    }
}
