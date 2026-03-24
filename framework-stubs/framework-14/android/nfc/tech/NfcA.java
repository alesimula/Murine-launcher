package android.nfc.tech;

public final class NfcA extends android.nfc.tech.BasicTagTechnology {
    public static final java.lang.String EXTRA_SAK = "sak";
    public static final java.lang.String EXTRA_ATQA = "atqa";
    public static android.nfc.tech.NfcA get(android.nfc.Tag p0) { return null; }
    public NfcA(android.nfc.Tag p0) throws android.os.RemoteException { super(null, 0); }
    public byte[] getAtqa() { return null; }
    public short getSak() { return 0; }
    public byte[] transceive(byte[] p0) throws java.io.IOException { return null; }
    public int getMaxTransceiveLength() { return 0; }
    public void setTimeout(int p0) {}
    public int getTimeout() { return 0; }
}
