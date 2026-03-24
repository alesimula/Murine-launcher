package com.google.android.mms.pdu;

public class PduParser {
    private static final int QUOTE = 127;
    private static final int LENGTH_QUOTE = 31;
    private static final int TEXT_MIN = 32;
    private static final int TEXT_MAX = 127;
    private static final int SHORT_INTEGER_MAX = 127;
    private static final int SHORT_LENGTH_MAX = 30;
    private static final int LONG_INTEGER_LENGTH_MAX = 8;
    private static final int QUOTED_STRING_FLAG = 34;
    private static final int END_STRING_FLAG = 0;
    private static final int TYPE_TEXT_STRING = 0;
    private static final int TYPE_QUOTED_STRING = 1;
    private static final int TYPE_TOKEN_STRING = 2;
    private static final int THE_FIRST_PART = 0;
    private static final int THE_LAST_PART = 1;
    private java.io.ByteArrayInputStream mPduDataStream;
    private com.google.android.mms.pdu.PduHeaders mHeaders;
    private com.google.android.mms.pdu.PduBody mBody;
    private static byte[] mTypeParam;
    private static byte[] mStartParam;
    private static final java.lang.String LOG_TAG = "PduParser";
    private static final boolean DEBUG = false;
    private static final boolean LOCAL_LOGV = false;
    private final boolean mParseContentDisposition = false;
    public PduParser(byte[] p0, boolean p1) {}
    public com.google.android.mms.pdu.GenericPdu parse() { return null; }
    protected com.google.android.mms.pdu.PduHeaders parseHeaders(java.io.ByteArrayInputStream p0) { return null; }
    protected com.google.android.mms.pdu.PduBody parseParts(java.io.ByteArrayInputStream p0) { return null; }
    private static void log(java.lang.String p0) {}
    protected static int parseUnsignedInt(java.io.ByteArrayInputStream p0) { return 0; }
    protected static int parseValueLength(java.io.ByteArrayInputStream p0) { return 0; }
    protected static com.google.android.mms.pdu.EncodedStringValue parseEncodedStringValue(java.io.ByteArrayInputStream p0) { return null; }
    protected static byte[] parseWapString(java.io.ByteArrayInputStream p0, int p1) { return null; }
    protected static boolean isTokenCharacter(int p0) { return false; }
    protected static boolean isText(int p0) { return false; }
    protected static byte[] getWapString(java.io.ByteArrayInputStream p0, int p1) { return null; }
    protected static int extractByteValue(java.io.ByteArrayInputStream p0) { return 0; }
    protected static int parseShortInteger(java.io.ByteArrayInputStream p0) { return 0; }
    protected static long parseLongInteger(java.io.ByteArrayInputStream p0) { return 0L; }
    protected static long parseIntegerValue(java.io.ByteArrayInputStream p0) { return 0L; }
    protected static int skipWapValue(java.io.ByteArrayInputStream p0, int p1) { return 0; }
    protected static void parseContentTypeParams(java.io.ByteArrayInputStream p0, java.util.HashMap<java.lang.Integer, java.lang.Object> p1, java.lang.Integer p2) {}
    protected static byte[] parseContentType(java.io.ByteArrayInputStream p0, java.util.HashMap<java.lang.Integer, java.lang.Object> p1) { return null; }
    protected boolean parsePartHeaders(java.io.ByteArrayInputStream p0, com.google.android.mms.pdu.PduPart p1, int p2) { return false; }
    private static int checkPartPosition(com.google.android.mms.pdu.PduPart p0) { return 0; }
    protected static boolean checkMandatoryHeader(com.google.android.mms.pdu.PduHeaders p0) { return false; }
}
