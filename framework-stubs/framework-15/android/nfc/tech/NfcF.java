package android.nfc.tech;

public final class NfcF implements android.nfc.tech.TagTechnology {
    NfcF() {}
    public void close() throws java.io.IOException {}
    public void connect() throws java.io.IOException {}
    public static android.nfc.tech.NfcF get(android.nfc.Tag p0) { return null; }
    public byte[] getManufacturer() { return null; }
    public int getMaxTransceiveLength() { return 0; }
    public byte[] getSystemCode() { return null; }
    public android.nfc.Tag getTag() { return null; }
    public int getTimeout() { return 0; }
    public boolean isConnected() { return false; }
    public void setTimeout(int p0) {}
    public byte[] transceive(byte[] p0) throws java.io.IOException { return null; }
}
