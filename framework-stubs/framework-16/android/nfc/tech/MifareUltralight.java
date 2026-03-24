package android.nfc.tech;

public final class MifareUltralight implements android.nfc.tech.TagTechnology {
    public static final int PAGE_SIZE = 4;
    public static final int TYPE_ULTRALIGHT = 1;
    public static final int TYPE_ULTRALIGHT_C = 2;
    public static final int TYPE_UNKNOWN = -1;
    MifareUltralight() {}
    public void close() throws java.io.IOException {}
    public void connect() throws java.io.IOException {}
    public static android.nfc.tech.MifareUltralight get(android.nfc.Tag p0) { return null; }
    public int getMaxTransceiveLength() { return 0; }
    public android.nfc.Tag getTag() { return null; }
    public int getTimeout() { return 0; }
    public int getType() { return 0; }
    public boolean isConnected() { return false; }
    public byte[] readPages(int p0) throws java.io.IOException { return null; }
    public void setTimeout(int p0) {}
    public byte[] transceive(byte[] p0) throws java.io.IOException { return null; }
    public void writePage(int p0, byte[] p1) throws java.io.IOException {}
}
