package com.android.internal.telephony;

public class InboundSmsTracker {
    public static final int DEST_PORT_FLAG_NO_PORT = 65536;
    public static final int DEST_PORT_FLAG_3GPP2 = 262144;
    public static final int DEST_PORT_FLAG_3GPP2_WAP_PDU = 524288;
    public static final java.lang.String SELECT_BY_REFERENCE = "address=? AND reference_number=? AND count=? AND (destination_port & 524288=0) AND deleted=0";
    public static final java.lang.String SELECT_BY_REFERENCE_3GPP2WAP = "address=? AND reference_number=? AND count=? AND (destination_port & 524288=524288) AND deleted=0";
    public InboundSmsTracker(android.content.Context p0, byte[] p1, long p2, int p3, boolean p4, boolean p5, java.lang.String p6, java.lang.String p7, java.lang.String p8, boolean p9, int p10, int p11) {}
    public InboundSmsTracker(android.content.Context p0, byte[] p1, long p2, int p3, boolean p4, java.lang.String p5, java.lang.String p6, int p7, int p8, int p9, boolean p10, java.lang.String p11, boolean p12, int p13, int p14) {}
    public InboundSmsTracker(android.content.Context p0, android.database.Cursor p1, boolean p2) {}
    public android.content.ContentValues getContentValues() { return null; }
    public static int getRealDestPort(int p0) { return 0; }
    public void setDeleteWhere(java.lang.String p0, java.lang.String[] p1) {}
    public java.lang.String toString() { return null; }
    public byte[] getPdu() { return null; }
    public long getTimestamp() { return 0L; }
    public int getDestPort() { return 0; }
    public boolean is3gpp2() { return false; }
    public boolean isClass0() { return false; }
    public int getSubId() { return 0; }
    public java.lang.String getFormat() { return null; }
    public java.lang.String getQueryForSegments() { return null; }
    public android.util.Pair<java.lang.String, java.lang.String[]> getExactMatchDupDetectQuery() { return null; }
    public android.util.Pair<java.lang.String, java.lang.String[]> getInexactMatchDupDetectQuery() { return null; }
    public int getIndexOffset() { return 0; }
    public java.lang.String getAddress() { return null; }
    public java.lang.String getDisplayAddress() { return null; }
    public java.lang.String getMessageBody() { return null; }
    public int getReferenceNumber() { return 0; }
    public int getSequenceNumber() { return 0; }
    public int getMessageCount() { return 0; }
    public java.lang.String getDeleteWhere() { return null; }
    public java.lang.String[] getDeleteWhereArgs() { return null; }
    public long getMessageId() { return 0L; }
    public int getSource() { return 0; }
    public com.android.internal.telephony.InboundSmsHandler.SmsBroadcastReceiver getSmsBroadcastReceiver(com.android.internal.telephony.InboundSmsHandler p0) { return null; }
}
