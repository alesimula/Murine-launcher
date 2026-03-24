package android.nfc.tech;

public final class NfcA implements android.nfc.tech.TagTechnology {
    NfcA() {}
    public void close() throws java.io.IOException {}
    public void connect() throws java.io.IOException {}
    public static android.nfc.tech.NfcA get(android.nfc.Tag p0) { return null; }
    public byte[] getAtqa() { return null; }
    public int getMaxTransceiveLength() { return 0; }
    public short getSak() { return 0; }
    public android.nfc.Tag getTag() { return null; }
    public int getTimeout() { return 0; }
    public boolean isConnected() { return false; }
    public void setTimeout(int p0) {}
    public byte[] transceive(byte[] p0) throws java.io.IOException { return null; }
}
