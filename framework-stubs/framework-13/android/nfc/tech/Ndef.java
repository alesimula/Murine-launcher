package android.nfc.tech;

public final class Ndef extends android.nfc.tech.BasicTagTechnology {
    public static final int NDEF_MODE_READ_ONLY = 1;
    public static final int NDEF_MODE_READ_WRITE = 2;
    public static final int NDEF_MODE_UNKNOWN = 3;
    public static final java.lang.String EXTRA_NDEF_MSG = "ndefmsg";
    public static final java.lang.String EXTRA_NDEF_MAXLENGTH = "ndefmaxlength";
    public static final java.lang.String EXTRA_NDEF_CARDSTATE = "ndefcardstate";
    public static final java.lang.String EXTRA_NDEF_TYPE = "ndeftype";
    public static final int TYPE_OTHER = -1;
    public static final int TYPE_1 = 1;
    public static final int TYPE_2 = 2;
    public static final int TYPE_3 = 3;
    public static final int TYPE_4 = 4;
    public static final int TYPE_MIFARE_CLASSIC = 101;
    public static final int TYPE_ICODE_SLI = 102;
    public static final java.lang.String UNKNOWN = "android.ndef.unknown";
    public static final java.lang.String NFC_FORUM_TYPE_1 = "org.nfcforum.ndef.type1";
    public static final java.lang.String NFC_FORUM_TYPE_2 = "org.nfcforum.ndef.type2";
    public static final java.lang.String NFC_FORUM_TYPE_3 = "org.nfcforum.ndef.type3";
    public static final java.lang.String NFC_FORUM_TYPE_4 = "org.nfcforum.ndef.type4";
    public static final java.lang.String MIFARE_CLASSIC = "com.nxp.ndef.mifareclassic";
    public static final java.lang.String ICODE_SLI = "com.nxp.ndef.icodesli";
    public static android.nfc.tech.Ndef get(android.nfc.Tag p0) { return null; }
    public Ndef(android.nfc.Tag p0) throws android.os.RemoteException { super(null, 0); }
    public android.nfc.NdefMessage getCachedNdefMessage() { return null; }
    public java.lang.String getType() { return null; }
    public int getMaxSize() { return 0; }
    public boolean isWritable() { return false; }
    public android.nfc.NdefMessage getNdefMessage() throws java.io.IOException, android.nfc.FormatException { return null; }
    public void writeNdefMessage(android.nfc.NdefMessage p0) throws java.io.IOException, android.nfc.FormatException {}
    public boolean canMakeReadOnly() { return false; }
    public boolean makeReadOnly() throws java.io.IOException { return false; }
}
