package com.android.internal.telephony;

public class SmsBroadcastUndelivered {
    static final long DEFAULT_PARTIAL_SEGMENT_EXPIRE_AGE = 604800000L;
    static final java.util.Map<java.lang.Integer, java.lang.Integer> PDU_PENDING_MESSAGE_PROJECTION_INDEX_MAPPING = null;
    public static void initialize(android.content.Context p0, com.android.internal.telephony.gsm.GsmInboundSmsHandler p1, com.android.internal.telephony.cdma.CdmaInboundSmsHandler p2) {}
    static void scanRawTable(android.content.Context p0, long p1) {}

    private class ScanRawTableThread extends java.lang.Thread {
        public void run() {}
    }

    private static class SmsReferenceKey {
        final java.lang.String mAddress = null;
        final int mReferenceNumber = 0;
        final int mMessageCount = 0;
        final java.lang.String mQuery = null;
        final boolean mIs3gpp2 = false;
        final java.lang.String mFormat = null;
        SmsReferenceKey(com.android.internal.telephony.InboundSmsTracker p0) {}
        java.lang.String[] getDeleteWhereArgs() { return null; }
        java.lang.String getDeleteWhere() { return null; }
        public int hashCode() { return 0; }
        public boolean equals(java.lang.Object p0) { return false; }
    }
}
