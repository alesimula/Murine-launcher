package android.nfc.tech;

public final class NfcB extends android.nfc.tech.BasicTagTechnology {
    public static final java.lang.String EXTRA_APPDATA = "appdata";
    public static final java.lang.String EXTRA_PROTINFO = "protinfo";
    private byte[] mAppData;
    private byte[] mProtInfo;
    public static android.nfc.tech.NfcB get(android.nfc.Tag p0) { return null; }
    public NfcB(android.nfc.Tag p0) throws android.os.RemoteException { super(null, 0); }
    public byte[] getApplicationData() { return null; }
    public byte[] getProtocolInfo() { return null; }
    public byte[] transceive(byte[] p0) throws java.io.IOException { return null; }
    public int getMaxTransceiveLength() { return 0; }
}
