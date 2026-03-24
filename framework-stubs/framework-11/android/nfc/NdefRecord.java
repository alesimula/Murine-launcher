package android.nfc;

public final class NdefRecord implements android.os.Parcelable {
    public static final short TNF_EMPTY = 0;
    public static final short TNF_WELL_KNOWN = 1;
    public static final short TNF_MIME_MEDIA = 2;
    public static final short TNF_ABSOLUTE_URI = 3;
    public static final short TNF_EXTERNAL_TYPE = 4;
    public static final short TNF_UNKNOWN = 5;
    public static final short TNF_UNCHANGED = 6;
    public static final short TNF_RESERVED = 7;
    public static final byte[] RTD_TEXT = null;
    public static final byte[] RTD_URI = null;
    public static final byte[] RTD_SMART_POSTER = null;
    public static final byte[] RTD_ALTERNATIVE_CARRIER = null;
    public static final byte[] RTD_HANDOVER_CARRIER = null;
    public static final byte[] RTD_HANDOVER_REQUEST = null;
    public static final byte[] RTD_HANDOVER_SELECT = null;
    public static final byte[] RTD_ANDROID_APP = null;
    private static final byte FLAG_MB = -128;
    private static final byte FLAG_ME = 64;
    private static final byte FLAG_CF = 32;
    private static final byte FLAG_SR = 16;
    private static final byte FLAG_IL = 8;
    private static final java.lang.String[] URI_PREFIX_MAP = null;
    private static final int MAX_PAYLOAD_SIZE = 10485760;
    private static final byte[] EMPTY_BYTE_ARRAY = null;
    private final short mTnf = 0;
    private final byte[] mType = null;
    private final byte[] mId = null;
    private final byte[] mPayload = null;
    public static final android.os.Parcelable.Creator<android.nfc.NdefRecord> CREATOR = null;
    public static android.nfc.NdefRecord createApplicationRecord(java.lang.String p0) { return null; }
    public static android.nfc.NdefRecord createUri(android.net.Uri p0) { return null; }
    public static android.nfc.NdefRecord createUri(java.lang.String p0) { return null; }
    public static android.nfc.NdefRecord createMime(java.lang.String p0, byte[] p1) { return null; }
    public static android.nfc.NdefRecord createExternal(java.lang.String p0, java.lang.String p1, byte[] p2) { return null; }
    public static android.nfc.NdefRecord createTextRecord(java.lang.String p0, java.lang.String p1) { return null; }
    public NdefRecord(short p0, byte[] p1, byte[] p2, byte[] p3) {}
    @java.lang.Deprecated
    public NdefRecord(byte[] p0) throws android.nfc.FormatException {}
    public short getTnf() { return 0; }
    public byte[] getType() { return null; }
    public byte[] getId() { return null; }
    public byte[] getPayload() { return null; }
    @java.lang.Deprecated
    public byte[] toByteArray() { return null; }
    public java.lang.String toMimeType() { return null; }
    public android.net.Uri toUri() { return null; }
    private android.net.Uri toUri(boolean p0) { return null; }
    private android.net.Uri parseWktUri() { return null; }
    static android.nfc.NdefRecord[] parse(java.nio.ByteBuffer p0, boolean p1) throws android.nfc.FormatException { return null; }
    private static void ensureSanePayloadSize(long p0) throws android.nfc.FormatException {}
    static java.lang.String validateTnf(short p0, byte[] p1, byte[] p2, byte[] p3) { return null; }
    void writeToByteBuffer(java.nio.ByteBuffer p0, boolean p1, boolean p2) {}
    int getByteLength() { return 0; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int hashCode() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public java.lang.String toString() { return null; }
    public void dumpDebug(android.util.proto.ProtoOutputStream p0) {}
    private static java.lang.StringBuilder bytesToString(byte[] p0) { return null; }
}
