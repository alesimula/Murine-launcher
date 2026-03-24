package android.nfc.tech;

public final class NfcF extends android.nfc.tech.BasicTagTechnology {
    public static final java.lang.String EXTRA_SC = "systemcode";
    public static final java.lang.String EXTRA_PMM = "pmm";
    public static android.nfc.tech.NfcF get(android.nfc.Tag p0) { return null; }
    public NfcF(android.nfc.Tag p0) throws android.os.RemoteException { super(null, 0); }
    public byte[] getSystemCode() { return null; }
    public byte[] getManufacturer() { return null; }
    public byte[] transceive(byte[] p0) throws java.io.IOException { return null; }
    public int getMaxTransceiveLength() { return 0; }
    public void setTimeout(int p0) {}
    public int getTimeout() { return 0; }
}
