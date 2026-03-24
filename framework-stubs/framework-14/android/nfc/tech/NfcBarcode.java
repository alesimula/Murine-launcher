package android.nfc.tech;

public final class NfcBarcode extends android.nfc.tech.BasicTagTechnology {
    public static final int TYPE_KOVIO = 1;
    public static final int TYPE_UNKNOWN = -1;
    public static final java.lang.String EXTRA_BARCODE_TYPE = "barcodetype";
    public static android.nfc.tech.NfcBarcode get(android.nfc.Tag p0) { return null; }
    public NfcBarcode(android.nfc.Tag p0) throws android.os.RemoteException { super(null, 0); }
    public int getType() { return 0; }
    public byte[] getBarcode() { return null; }
}
