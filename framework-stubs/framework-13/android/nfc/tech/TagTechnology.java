package android.nfc.tech;

public interface TagTechnology extends java.io.Closeable {
    public static final int NFC_A = 1;
    public static final int NFC_B = 2;
    public static final int ISO_DEP = 3;
    public static final int NFC_F = 4;
    public static final int NFC_V = 5;
    public static final int NDEF = 6;
    public static final int NDEF_FORMATABLE = 7;
    public static final int MIFARE_CLASSIC = 8;
    public static final int MIFARE_ULTRALIGHT = 9;
    public static final int NFC_BARCODE = 10;
    public android.nfc.Tag getTag();
    public void connect() throws java.io.IOException;
    public void reconnect() throws java.io.IOException;
    public void close() throws java.io.IOException;
    public boolean isConnected();
}
