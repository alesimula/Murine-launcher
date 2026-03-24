package android.nfc.tech;

public final class NfcB implements android.nfc.tech.TagTechnology {
    NfcB() {}
    public void close() throws java.io.IOException {}
    public void connect() throws java.io.IOException {}
    public static android.nfc.tech.NfcB get(android.nfc.Tag p0) { return null; }
    public byte[] getApplicationData() { return null; }
    public int getMaxTransceiveLength() { return 0; }
    public byte[] getProtocolInfo() { return null; }
    public android.nfc.Tag getTag() { return null; }
    public boolean isConnected() { return false; }
    public byte[] transceive(byte[] p0) throws java.io.IOException { return null; }
}
