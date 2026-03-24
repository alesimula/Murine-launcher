package com.google.android.mms.pdu;

public class PduPersister {
    private static final java.lang.String TAG = "PduPersister";
    private static final boolean DEBUG = false;
    private static final boolean LOCAL_LOGV = false;
    private static final long DUMMY_THREAD_ID = 9223372036854775807L;
    public static final java.lang.String TEMPORARY_DRM_OBJECT_URI = "content://mms/9223372036854775807/part";
    public static final int PROC_STATUS_TRANSIENT_FAILURE = 1;
    public static final int PROC_STATUS_PERMANENTLY_FAILURE = 2;
    public static final int PROC_STATUS_COMPLETED = 3;
    private static com.google.android.mms.pdu.PduPersister sPersister;
    private static final com.google.android.mms.util.PduCache PDU_CACHE_INSTANCE = null;
    private static final int[] ADDRESS_FIELDS = null;
    private static final java.lang.String[] PDU_PROJECTION = null;
    private static final int PDU_COLUMN_ID = 0;
    private static final int PDU_COLUMN_MESSAGE_BOX = 1;
    private static final int PDU_COLUMN_THREAD_ID = 2;
    private static final int PDU_COLUMN_RETRIEVE_TEXT = 3;
    private static final int PDU_COLUMN_SUBJECT = 4;
    private static final int PDU_COLUMN_CONTENT_LOCATION = 5;
    private static final int PDU_COLUMN_CONTENT_TYPE = 6;
    private static final int PDU_COLUMN_MESSAGE_CLASS = 7;
    private static final int PDU_COLUMN_MESSAGE_ID = 8;
    private static final int PDU_COLUMN_RESPONSE_TEXT = 9;
    private static final int PDU_COLUMN_TRANSACTION_ID = 10;
    private static final int PDU_COLUMN_CONTENT_CLASS = 11;
    private static final int PDU_COLUMN_DELIVERY_REPORT = 12;
    private static final int PDU_COLUMN_MESSAGE_TYPE = 13;
    private static final int PDU_COLUMN_MMS_VERSION = 14;
    private static final int PDU_COLUMN_PRIORITY = 15;
    private static final int PDU_COLUMN_READ_REPORT = 16;
    private static final int PDU_COLUMN_READ_STATUS = 17;
    private static final int PDU_COLUMN_REPORT_ALLOWED = 18;
    private static final int PDU_COLUMN_RETRIEVE_STATUS = 19;
    private static final int PDU_COLUMN_STATUS = 20;
    private static final int PDU_COLUMN_DATE = 21;
    private static final int PDU_COLUMN_DELIVERY_TIME = 22;
    private static final int PDU_COLUMN_EXPIRY = 23;
    private static final int PDU_COLUMN_MESSAGE_SIZE = 24;
    private static final int PDU_COLUMN_SUBJECT_CHARSET = 25;
    private static final int PDU_COLUMN_RETRIEVE_TEXT_CHARSET = 26;
    private static final java.lang.String[] PART_PROJECTION = null;
    private static final int PART_COLUMN_ID = 0;
    private static final int PART_COLUMN_CHARSET = 1;
    private static final int PART_COLUMN_CONTENT_DISPOSITION = 2;
    private static final int PART_COLUMN_CONTENT_ID = 3;
    private static final int PART_COLUMN_CONTENT_LOCATION = 4;
    private static final int PART_COLUMN_CONTENT_TYPE = 5;
    private static final int PART_COLUMN_FILENAME = 6;
    private static final int PART_COLUMN_NAME = 7;
    private static final int PART_COLUMN_TEXT = 8;
    private static final java.util.HashMap<android.net.Uri, java.lang.Integer> MESSAGE_BOX_MAP = null;
    private static final java.util.HashMap<java.lang.Integer, java.lang.Integer> CHARSET_COLUMN_INDEX_MAP = null;
    private static final java.util.HashMap<java.lang.Integer, java.lang.Integer> ENCODED_STRING_COLUMN_INDEX_MAP = null;
    private static final java.util.HashMap<java.lang.Integer, java.lang.Integer> TEXT_STRING_COLUMN_INDEX_MAP = null;
    private static final java.util.HashMap<java.lang.Integer, java.lang.Integer> OCTET_COLUMN_INDEX_MAP = null;
    private static final java.util.HashMap<java.lang.Integer, java.lang.Integer> LONG_COLUMN_INDEX_MAP = null;
    private static final java.util.HashMap<java.lang.Integer, java.lang.String> CHARSET_COLUMN_NAME_MAP = null;
    private static final java.util.HashMap<java.lang.Integer, java.lang.String> ENCODED_STRING_COLUMN_NAME_MAP = null;
    private static final java.util.HashMap<java.lang.Integer, java.lang.String> TEXT_STRING_COLUMN_NAME_MAP = null;
    private static final java.util.HashMap<java.lang.Integer, java.lang.String> OCTET_COLUMN_NAME_MAP = null;
    private static final java.util.HashMap<java.lang.Integer, java.lang.String> LONG_COLUMN_NAME_MAP = null;
    private final android.content.Context mContext = null;
    private final android.content.ContentResolver mContentResolver = null;
    private final android.drm.DrmManagerClient mDrmManagerClient = null;
    private PduPersister(android.content.Context p0) {}
    public static com.google.android.mms.pdu.PduPersister getPduPersister(android.content.Context p0) { return null; }
    private void setEncodedStringValueToHeaders(android.database.Cursor p0, int p1, com.google.android.mms.pdu.PduHeaders p2, int p3) {}
    private void setTextStringToHeaders(android.database.Cursor p0, int p1, com.google.android.mms.pdu.PduHeaders p2, int p3) {}
    private void setOctetToHeaders(android.database.Cursor p0, int p1, com.google.android.mms.pdu.PduHeaders p2, int p3) throws com.google.android.mms.InvalidHeaderValueException {}
    private void setLongToHeaders(android.database.Cursor p0, int p1, com.google.android.mms.pdu.PduHeaders p2, int p3) {}
    private java.lang.Integer getIntegerFromPartColumn(android.database.Cursor p0, int p1) { return null; }
    private byte[] getByteArrayFromPartColumn(android.database.Cursor p0, int p1) { return null; }
    private com.google.android.mms.pdu.PduPart[] loadParts(long p0) throws com.google.android.mms.MmsException { return null; }
    private void loadAddress(long p0, com.google.android.mms.pdu.PduHeaders p1) {}
    public com.google.android.mms.pdu.GenericPdu load(android.net.Uri p0) throws com.google.android.mms.MmsException { return null; }
    private void persistAddress(long p0, int p1, com.google.android.mms.pdu.EncodedStringValue[] p2) {}
    private static java.lang.String getPartContentType(com.google.android.mms.pdu.PduPart p0) { return null; }
    public android.net.Uri persistPart(com.google.android.mms.pdu.PduPart p0, long p1, java.util.HashMap<android.net.Uri, java.io.InputStream> p2) throws com.google.android.mms.MmsException { return null; }
    private void persistData(com.google.android.mms.pdu.PduPart p0, android.net.Uri p1, java.lang.String p2, java.util.HashMap<android.net.Uri, java.io.InputStream> p3) throws com.google.android.mms.MmsException {}
    private void updateAddress(long p0, int p1, com.google.android.mms.pdu.EncodedStringValue[] p2) {}
    public void updateHeaders(android.net.Uri p0, com.google.android.mms.pdu.SendReq p1) {}
    private void updatePart(android.net.Uri p0, com.google.android.mms.pdu.PduPart p1, java.util.HashMap<android.net.Uri, java.io.InputStream> p2) throws com.google.android.mms.MmsException {}
    public void updateParts(android.net.Uri p0, com.google.android.mms.pdu.PduBody p1, java.util.HashMap<android.net.Uri, java.io.InputStream> p2) throws com.google.android.mms.MmsException {}
    public android.net.Uri persist(com.google.android.mms.pdu.GenericPdu p0, android.net.Uri p1, boolean p2, boolean p3, java.util.HashMap<android.net.Uri, java.io.InputStream> p4) throws com.google.android.mms.MmsException { return null; }
    private void loadRecipients(int p0, java.util.HashSet<java.lang.String> p1, java.util.HashMap<java.lang.Integer, com.google.android.mms.pdu.EncodedStringValue[]> p2, boolean p3) {}
    public android.net.Uri move(android.net.Uri p0, android.net.Uri p1) throws com.google.android.mms.MmsException { return null; }
    public static java.lang.String toIsoString(byte[] p0) { return null; }
    public static byte[] getBytes(java.lang.String p0) { return null; }
    public void release() {}
    public android.database.Cursor getPendingMessages(long p0) { return null; }
}
