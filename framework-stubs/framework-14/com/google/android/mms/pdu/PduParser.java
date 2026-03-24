package com.google.android.mms.pdu;

public class PduParser {
    public PduParser(byte[] p0, boolean p1) {}
    public com.google.android.mms.pdu.GenericPdu parse() { return null; }
    protected com.google.android.mms.pdu.PduHeaders parseHeaders(java.io.ByteArrayInputStream p0) { return null; }
    protected com.google.android.mms.pdu.PduBody parseParts(java.io.ByteArrayInputStream p0) { return null; }
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
    protected static boolean checkMandatoryHeader(com.google.android.mms.pdu.PduHeaders p0) { return false; }
}
