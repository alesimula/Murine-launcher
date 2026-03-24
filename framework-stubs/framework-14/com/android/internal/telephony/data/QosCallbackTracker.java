package com.android.internal.telephony.data;

public class QosCallbackTracker extends android.os.Handler {
    public QosCallbackTracker(com.android.internal.telephony.data.TelephonyNetworkAgent p0, com.android.internal.telephony.Phone p1) { super(); }
    public void addFilter(int p0, com.android.internal.telephony.data.QosCallbackTracker.IFilter p1) {}
    public void removeFilter(int p0) {}
    public void updateSessions(java.util.List<android.telephony.data.QosBearerSession> p0) {}

    public static interface IFilter {
        public boolean matchesLocalAddress(java.net.InetAddress p0, int p1, int p2);
        public boolean matchesRemoteAddress(java.net.InetAddress p0, int p1, int p2);
        public boolean matchesProtocol(int p0);
    }
}
