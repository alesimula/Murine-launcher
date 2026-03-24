package com.android.internal.telephony;

public final class NetworkScanRequestTracker {
    public NetworkScanRequestTracker() {}
    public static java.util.Set<java.lang.String> getAllowedMccMncsForLocationRestrictedScan(android.content.Context p0) { return null; }
    public int startNetworkScan(boolean p0, android.telephony.NetworkScanRequest p1, android.os.Messenger p2, android.os.IBinder p3, com.android.internal.telephony.Phone p4, int p5, int p6, java.lang.String p7) { return 0; }
    public void stopNetworkScan(int p0, int p1) {}

    class NetworkScanRequestInfo implements android.os.IBinder.DeathRecipient {
        NetworkScanRequestInfo(com.android.internal.telephony.NetworkScanRequestTracker p0, android.telephony.NetworkScanRequest p1, android.os.Messenger p2, android.os.IBinder p3, int p4, com.android.internal.telephony.Phone p5, int p6, int p7, java.lang.String p8, boolean p9) {}
        synchronized void setIsBinderDead(boolean p0) {}
        synchronized boolean getIsBinderDead() { return false; }
        android.telephony.NetworkScanRequest getRequest() { return null; }
        void unlinkDeathRecipient() {}
        public void binderDied() {}
    }

    private class NetworkScanRequestScheduler {
    }
}
