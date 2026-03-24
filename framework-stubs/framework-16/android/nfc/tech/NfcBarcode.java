package android.nfc.tech;

public final class NfcBarcode implements android.nfc.tech.TagTechnology {
    public static final int TYPE_KOVIO = 1;
    public static final int TYPE_UNKNOWN = -1;
    NfcBarcode() {}
    public void close() throws java.io.IOException {}
    public void connect() throws java.io.IOException {}
    public static android.nfc.tech.NfcBarcode get(android.nfc.Tag p0) { return null; }
    public byte[] getBarcode() { return null; }
    public android.nfc.Tag getTag() { return null; }
    public int getType() { return 0; }
    public boolean isConnected() { return false; }
}
