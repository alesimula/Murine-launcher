package android.nfc;

public final class NdefRecord implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.nfc.NdefRecord> CREATOR = null;
    public static final byte[] RTD_ALTERNATIVE_CARRIER = null;
    public static final byte[] RTD_HANDOVER_CARRIER = null;
    public static final byte[] RTD_HANDOVER_REQUEST = null;
    public static final byte[] RTD_HANDOVER_SELECT = null;
    public static final byte[] RTD_SMART_POSTER = null;
    public static final byte[] RTD_TEXT = null;
    public static final byte[] RTD_URI = null;
    public static final short TNF_ABSOLUTE_URI = 3;
    public static final short TNF_EMPTY = 0;
    public static final short TNF_EXTERNAL_TYPE = 4;
    public static final short TNF_MIME_MEDIA = 2;
    public static final short TNF_UNCHANGED = 6;
    public static final short TNF_UNKNOWN = 5;
    public static final short TNF_WELL_KNOWN = 1;
    public NdefRecord(short p0, byte[] p1, byte[] p2, byte[] p3) {}
    @java.lang.Deprecated
    public NdefRecord(byte[] p0) throws android.nfc.FormatException {}
    public static android.nfc.NdefRecord createApplicationRecord(java.lang.String p0) { return null; }
    public static android.nfc.NdefRecord createExternal(java.lang.String p0, java.lang.String p1, byte[] p2) { return null; }
    public static android.nfc.NdefRecord createMime(java.lang.String p0, byte[] p1) { return null; }
    public static android.nfc.NdefRecord createTextRecord(java.lang.String p0, java.lang.String p1) { return null; }
    public static android.nfc.NdefRecord createUri(android.net.Uri p0) { return null; }
    public static android.nfc.NdefRecord createUri(java.lang.String p0) { return null; }
    public int describeContents() { return 0; }
    public byte[] getId() { return null; }
    public byte[] getPayload() { return null; }
    public short getTnf() { return 0; }
    public byte[] getType() { return null; }
    @java.lang.Deprecated
    public byte[] toByteArray() { return null; }
    public java.lang.String toMimeType() { return null; }
    public android.net.Uri toUri() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
