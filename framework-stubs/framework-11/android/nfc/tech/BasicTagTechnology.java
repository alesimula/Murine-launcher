package android.nfc.tech;

abstract class BasicTagTechnology implements android.nfc.tech.TagTechnology {
    private static final java.lang.String TAG = "NFC";
    final android.nfc.Tag mTag = null;
    boolean mIsConnected;
    int mSelectedTechnology;
    BasicTagTechnology(android.nfc.Tag p0, int p1) throws android.os.RemoteException {}
    public android.nfc.Tag getTag() { return null; }
    void checkConnected() {}
    public boolean isConnected() { return false; }
    public void connect() throws java.io.IOException {}
    public void reconnect() throws java.io.IOException {}
    public void close() throws java.io.IOException {}
    int getMaxTransceiveLengthInternal() { return 0; }
    byte[] transceive(byte[] p0, boolean p1) throws java.io.IOException { return null; }
}
