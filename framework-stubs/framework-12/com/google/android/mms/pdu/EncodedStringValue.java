package com.google.android.mms.pdu;

public class EncodedStringValue implements java.lang.Cloneable {
    private static final java.lang.String TAG = "EncodedStringValue";
    private static final boolean DEBUG = false;
    private static final boolean LOCAL_LOGV = false;
    private int mCharacterSet;
    private byte[] mData;
    public EncodedStringValue(int p0, byte[] p1) {}
    public EncodedStringValue(byte[] p0) {}
    public EncodedStringValue(java.lang.String p0) {}
    public int getCharacterSet() { return 0; }
    public void setCharacterSet(int p0) {}
    public byte[] getTextString() { return null; }
    public void setTextString(byte[] p0) {}
    public java.lang.String getString() { return null; }
    public void appendTextString(byte[] p0) {}
    public java.lang.Object clone() throws java.lang.CloneNotSupportedException { return null; }
    public com.google.android.mms.pdu.EncodedStringValue[] split(java.lang.String p0) { return null; }
    public static com.google.android.mms.pdu.EncodedStringValue[] extract(java.lang.String p0) { return null; }
    public static java.lang.String concat(com.google.android.mms.pdu.EncodedStringValue[] p0) { return null; }
    public static com.google.android.mms.pdu.EncodedStringValue copy(com.google.android.mms.pdu.EncodedStringValue p0) { return null; }
    public static com.google.android.mms.pdu.EncodedStringValue[] encodeStrings(java.lang.String[] p0) { return null; }
}
