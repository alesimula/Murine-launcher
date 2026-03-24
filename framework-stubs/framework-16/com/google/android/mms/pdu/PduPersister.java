package com.google.android.mms.pdu;

public class PduPersister {
    public static final java.lang.String TEMPORARY_DRM_OBJECT_URI = "content://mms/9223372036854775807/part";
    public static final int PROC_STATUS_TRANSIENT_FAILURE = 1;
    public static final int PROC_STATUS_PERMANENTLY_FAILURE = 2;
    public static final int PROC_STATUS_COMPLETED = 3;
    public static com.google.android.mms.pdu.PduPersister getPduPersister(android.content.Context p0) { return null; }
    public com.google.android.mms.pdu.GenericPdu load(android.net.Uri p0) throws com.google.android.mms.MmsException { return null; }
    public android.net.Uri persistPart(com.google.android.mms.pdu.PduPart p0, long p1, java.util.HashMap<android.net.Uri, java.io.InputStream> p2) throws com.google.android.mms.MmsException { return null; }
    public void updateHeaders(android.net.Uri p0, com.google.android.mms.pdu.SendReq p1) {}
    public void updateParts(android.net.Uri p0, com.google.android.mms.pdu.PduBody p1, java.util.HashMap<android.net.Uri, java.io.InputStream> p2) throws com.google.android.mms.MmsException {}
    public android.net.Uri persist(com.google.android.mms.pdu.GenericPdu p0, android.net.Uri p1, boolean p2, boolean p3, java.util.HashMap<android.net.Uri, java.io.InputStream> p4) throws com.google.android.mms.MmsException { return null; }
    public android.net.Uri move(android.net.Uri p0, android.net.Uri p1) throws com.google.android.mms.MmsException { return null; }
    public static java.lang.String toIsoString(byte[] p0) { return null; }
    public static byte[] getBytes(java.lang.String p0) { return null; }
    public void release() {}
    public android.database.Cursor getPendingMessages(long p0) { return null; }
}
