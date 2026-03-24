package android.nfc.tech;

public final class IsoDep extends android.nfc.tech.BasicTagTechnology {
    public static final java.lang.String EXTRA_HI_LAYER_RESP = "hiresp";
    public static final java.lang.String EXTRA_HIST_BYTES = "histbytes";
    public static android.nfc.tech.IsoDep get(android.nfc.Tag p0) { return null; }
    public IsoDep(android.nfc.Tag p0) throws android.os.RemoteException { super(null, 0); }
    public void setTimeout(int p0) {}
    public int getTimeout() { return 0; }
    public byte[] getHistoricalBytes() { return null; }
    public byte[] getHiLayerResponse() { return null; }
    public byte[] transceive(byte[] p0) throws java.io.IOException { return null; }
    public int getMaxTransceiveLength() { return 0; }
    public boolean isExtendedLengthApduSupported() { return false; }
}
