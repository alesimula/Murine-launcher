package com.google.android.mms.pdu;

public class PduPart {
    public static final int P_Q = 128;
    public static final int P_CHARSET = 129;
    public static final int P_LEVEL = 130;
    public static final int P_TYPE = 131;
    public static final int P_DEP_NAME = 133;
    public static final int P_DEP_FILENAME = 134;
    public static final int P_DIFFERENCES = 135;
    public static final int P_PADDING = 136;
    public static final int P_CT_MR_TYPE = 137;
    public static final int P_DEP_START = 138;
    public static final int P_DEP_START_INFO = 139;
    public static final int P_DEP_COMMENT = 140;
    public static final int P_DEP_DOMAIN = 141;
    public static final int P_MAX_AGE = 142;
    public static final int P_DEP_PATH = 143;
    public static final int P_SECURE = 144;
    public static final int P_SEC = 145;
    public static final int P_MAC = 146;
    public static final int P_CREATION_DATE = 147;
    public static final int P_MODIFICATION_DATE = 148;
    public static final int P_READ_DATE = 149;
    public static final int P_SIZE = 150;
    public static final int P_NAME = 151;
    public static final int P_FILENAME = 152;
    public static final int P_START = 153;
    public static final int P_START_INFO = 154;
    public static final int P_COMMENT = 155;
    public static final int P_DOMAIN = 156;
    public static final int P_PATH = 157;
    public static final int P_CONTENT_TYPE = 145;
    public static final int P_CONTENT_LOCATION = 142;
    public static final int P_CONTENT_ID = 192;
    public static final int P_DEP_CONTENT_DISPOSITION = 174;
    public static final int P_CONTENT_DISPOSITION = 197;
    public static final int P_CONTENT_TRANSFER_ENCODING = 200;
    public static final java.lang.String CONTENT_TRANSFER_ENCODING = "Content-Transfer-Encoding";
    public static final java.lang.String P_BINARY = "binary";
    public static final java.lang.String P_7BIT = "7bit";
    public static final java.lang.String P_8BIT = "8bit";
    public static final java.lang.String P_BASE64 = "base64";
    public static final java.lang.String P_QUOTED_PRINTABLE = "quoted-printable";
    static final byte[] DISPOSITION_FROM_DATA = null;
    static final byte[] DISPOSITION_ATTACHMENT = null;
    static final byte[] DISPOSITION_INLINE = null;
    public static final int P_DISPOSITION_FROM_DATA = 128;
    public static final int P_DISPOSITION_ATTACHMENT = 129;
    public static final int P_DISPOSITION_INLINE = 130;
    private java.util.Map<java.lang.Integer, java.lang.Object> mPartHeader;
    private android.net.Uri mUri;
    private byte[] mPartData;
    private static final java.lang.String TAG = "PduPart";
    public PduPart() {}
    public void setData(byte[] p0) {}
    public byte[] getData() { return null; }
    public int getDataLength() { return 0; }
    public void setDataUri(android.net.Uri p0) {}
    public android.net.Uri getDataUri() { return null; }
    public void setContentId(byte[] p0) {}
    public byte[] getContentId() { return null; }
    public void setCharset(int p0) {}
    public int getCharset() { return 0; }
    public void setContentLocation(byte[] p0) {}
    public byte[] getContentLocation() { return null; }
    public void setContentDisposition(byte[] p0) {}
    public byte[] getContentDisposition() { return null; }
    public void setContentType(byte[] p0) {}
    public byte[] getContentType() { return null; }
    public void setContentTransferEncoding(byte[] p0) {}
    public byte[] getContentTransferEncoding() { return null; }
    public void setName(byte[] p0) {}
    public byte[] getName() { return null; }
    public void setFilename(byte[] p0) {}
    public byte[] getFilename() { return null; }
    public java.lang.String generateLocation() { return null; }
}
