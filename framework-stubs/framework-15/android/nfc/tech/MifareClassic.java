package android.nfc.tech;

public final class MifareClassic implements android.nfc.tech.TagTechnology {
    public static final int BLOCK_SIZE = 16;
    public static final byte[] KEY_DEFAULT = null;
    public static final byte[] KEY_MIFARE_APPLICATION_DIRECTORY = null;
    public static final byte[] KEY_NFC_FORUM = null;
    public static final int SIZE_1K = 1024;
    public static final int SIZE_2K = 2048;
    public static final int SIZE_4K = 4096;
    public static final int SIZE_MINI = 320;
    public static final int TYPE_CLASSIC = 0;
    public static final int TYPE_PLUS = 1;
    public static final int TYPE_PRO = 2;
    public static final int TYPE_UNKNOWN = -1;
    MifareClassic() {}
    public boolean authenticateSectorWithKeyA(int p0, byte[] p1) throws java.io.IOException { return false; }
    public boolean authenticateSectorWithKeyB(int p0, byte[] p1) throws java.io.IOException { return false; }
    public int blockToSector(int p0) { return 0; }
    public void close() throws java.io.IOException {}
    public void connect() throws java.io.IOException {}
    public void decrement(int p0, int p1) throws java.io.IOException {}
    public static android.nfc.tech.MifareClassic get(android.nfc.Tag p0) { return null; }
    public int getBlockCount() { return 0; }
    public int getBlockCountInSector(int p0) { return 0; }
    public int getMaxTransceiveLength() { return 0; }
    public int getSectorCount() { return 0; }
    public int getSize() { return 0; }
    public android.nfc.Tag getTag() { return null; }
    public int getTimeout() { return 0; }
    public int getType() { return 0; }
    public void increment(int p0, int p1) throws java.io.IOException {}
    public boolean isConnected() { return false; }
    public byte[] readBlock(int p0) throws java.io.IOException { return null; }
    public void restore(int p0) throws java.io.IOException {}
    public int sectorToBlock(int p0) { return 0; }
    public void setTimeout(int p0) {}
    public byte[] transceive(byte[] p0) throws java.io.IOException { return null; }
    public void transfer(int p0) throws java.io.IOException {}
    public void writeBlock(int p0, byte[] p1) throws java.io.IOException {}
}
