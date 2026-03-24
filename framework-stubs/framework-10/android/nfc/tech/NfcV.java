package android.nfc.tech;

public final class NfcV extends android.nfc.tech.BasicTagTechnology {
    public static final java.lang.String EXTRA_RESP_FLAGS = "respflags";
    public static final java.lang.String EXTRA_DSFID = "dsfid";
    private byte mRespFlags;
    private byte mDsfId;
    public static android.nfc.tech.NfcV get(android.nfc.Tag p0) { return null; }
    public NfcV(android.nfc.Tag p0) throws android.os.RemoteException { super(null, 0); }
    public byte getResponseFlags() { return 0; }
    public byte getDsfId() { return 0; }
    public byte[] transceive(byte[] p0) throws java.io.IOException { return null; }
    public int getMaxTransceiveLength() { return 0; }
}
