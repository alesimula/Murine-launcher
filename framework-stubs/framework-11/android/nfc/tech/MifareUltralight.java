package android.nfc.tech;

public final class MifareUltralight extends android.nfc.tech.BasicTagTechnology {
    private static final java.lang.String TAG = "NFC";
    public static final int TYPE_UNKNOWN = -1;
    public static final int TYPE_ULTRALIGHT = 1;
    public static final int TYPE_ULTRALIGHT_C = 2;
    public static final int PAGE_SIZE = 4;
    private static final int NXP_MANUFACTURER_ID = 4;
    private static final int MAX_PAGE_COUNT = 256;
    public static final java.lang.String EXTRA_IS_UL_C = "isulc";
    private int mType;
    public static android.nfc.tech.MifareUltralight get(android.nfc.Tag p0) { return null; }
    public MifareUltralight(android.nfc.Tag p0) throws android.os.RemoteException { super(null, 0); }
    public int getType() { return 0; }
    public byte[] readPages(int p0) throws java.io.IOException { return null; }
    public void writePage(int p0, byte[] p1) throws java.io.IOException {}
    public byte[] transceive(byte[] p0) throws java.io.IOException { return null; }
    public int getMaxTransceiveLength() { return 0; }
    public void setTimeout(int p0) {}
    public int getTimeout() { return 0; }
    private static void validatePageIndex(int p0) {}
}
