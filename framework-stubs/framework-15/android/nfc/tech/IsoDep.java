package android.nfc.tech;

public final class IsoDep implements android.nfc.tech.TagTechnology {
    IsoDep() {}
    public void close() throws java.io.IOException {}
    public void connect() throws java.io.IOException {}
    public static android.nfc.tech.IsoDep get(android.nfc.Tag p0) { return null; }
    public byte[] getHiLayerResponse() { return null; }
    public byte[] getHistoricalBytes() { return null; }
    public int getMaxTransceiveLength() { return 0; }
    public android.nfc.Tag getTag() { return null; }
    public int getTimeout() { return 0; }
    public boolean isConnected() { return false; }
    public boolean isExtendedLengthApduSupported() { return false; }
    public void setTimeout(int p0) {}
    public byte[] transceive(byte[] p0) throws java.io.IOException { return null; }
}
