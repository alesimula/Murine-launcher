package com.android.internal.telephony;

public class WspTypeDecoder {
    public static final int PDU_TYPE_PUSH = 6;
    public static final int PDU_TYPE_CONFIRMED_PUSH = 7;
    public static final int PARAMETER_ID_X_WAP_APPLICATION_ID = 47;
    public static final java.lang.String CONTENT_TYPE_B_PUSH_CO = "application/vnd.wap.coc";
    public static final java.lang.String CONTENT_TYPE_B_MMS = "application/vnd.wap.mms-message";
    public static final java.lang.String CONTENT_TYPE_B_PUSH_SYNCML_NOTI = "application/vnd.syncml.notification";
    byte[] mWspData;
    int mDataLength;
    long mUnsigned32bit;
    java.lang.String mStringValue;
    java.util.HashMap<java.lang.String, java.lang.String> mContentParameters;
    public WspTypeDecoder(byte[] p0) {}
    public boolean decodeTextString(int p0) { return false; }
    public boolean decodeTokenText(int p0) { return false; }
    public boolean decodeShortInteger(int p0) { return false; }
    public boolean decodeLongInteger(int p0) { return false; }
    public boolean decodeIntegerValue(int p0) { return false; }
    public boolean decodeUintvarInteger(int p0) { return false; }
    public boolean decodeValueLength(int p0) { return false; }
    public boolean decodeExtensionMedia(int p0) { return false; }
    public boolean decodeConstrainedEncoding(int p0) { return false; }
    public boolean decodeContentType(int p0) { return false; }
    public boolean decodeContentLength(int p0) { return false; }
    public boolean decodeContentLocation(int p0) { return false; }
    public boolean decodeXWapApplicationId(int p0) { return false; }
    public boolean seekXWapApplicationId(int p0, int p1) { return false; }
    public boolean decodeXWapContentURI(int p0) { return false; }
    public boolean decodeXWapInitiatorURI(int p0) { return false; }
    public int getDecodedDataLength() { return 0; }
    public long getValue32() { return 0L; }
    public java.lang.String getValueString() { return null; }
    public java.util.HashMap<java.lang.String, java.lang.String> getContentParameters() { return null; }
}
