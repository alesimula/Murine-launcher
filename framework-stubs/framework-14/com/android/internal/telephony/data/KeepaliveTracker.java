package com.android.internal.telephony.data;

public class KeepaliveTracker extends android.os.Handler {
    public KeepaliveTracker(com.android.internal.telephony.Phone p0, android.os.Looper p1, com.android.internal.telephony.data.DataNetwork p2, com.android.internal.telephony.data.TelephonyNetworkAgent p3) { super(); }
    public void handleMessage(android.os.Message p0) {}
    public void registerForKeepaliveStatus() {}
    public void unregisterForKeepaliveStatus() {}

    private static class KeepaliveRecord {
        public int slotIndex;
        @com.android.internal.telephony.data.KeepaliveStatus.KeepaliveStatusCode
        public int currentStatus;
        KeepaliveRecord(int p0, int p1) {}
    }
}
