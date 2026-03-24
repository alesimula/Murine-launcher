package android.nfc.tech;

public final class Ndef implements android.nfc.tech.TagTechnology {
    public static final java.lang.String MIFARE_CLASSIC = "com.nxp.ndef.mifareclassic";
    public static final java.lang.String NFC_FORUM_TYPE_1 = "org.nfcforum.ndef.type1";
    public static final java.lang.String NFC_FORUM_TYPE_2 = "org.nfcforum.ndef.type2";
    public static final java.lang.String NFC_FORUM_TYPE_3 = "org.nfcforum.ndef.type3";
    public static final java.lang.String NFC_FORUM_TYPE_4 = "org.nfcforum.ndef.type4";
    Ndef() {}
    public boolean canMakeReadOnly() { return false; }
    public void close() throws java.io.IOException {}
    public void connect() throws java.io.IOException {}
    public static android.nfc.tech.Ndef get(android.nfc.Tag p0) { return null; }
    public android.nfc.NdefMessage getCachedNdefMessage() { return null; }
    public int getMaxSize() { return 0; }
    public android.nfc.NdefMessage getNdefMessage() throws android.nfc.FormatException, java.io.IOException { return null; }
    public android.nfc.Tag getTag() { return null; }
    public java.lang.String getType() { return null; }
    public boolean isConnected() { return false; }
    public boolean isWritable() { return false; }
    public boolean makeReadOnly() throws java.io.IOException { return false; }
    public void writeNdefMessage(android.nfc.NdefMessage p0) throws android.nfc.FormatException, java.io.IOException {}
}
