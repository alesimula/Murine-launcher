package android.nfc.tech;

public final class NfcV implements android.nfc.tech.TagTechnology {
    NfcV() {}
    public void close() throws java.io.IOException {}
    public void connect() throws java.io.IOException {}
    public static android.nfc.tech.NfcV get(android.nfc.Tag p0) { return null; }
    public byte getDsfId() { return 0; }
    public int getMaxTransceiveLength() { return 0; }
    public byte getResponseFlags() { return 0; }
    public android.nfc.Tag getTag() { return null; }
    public boolean isConnected() { return false; }
    public byte[] transceive(byte[] p0) throws java.io.IOException { return null; }
}
