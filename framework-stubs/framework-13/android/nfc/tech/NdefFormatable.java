package android.nfc.tech;

public final class NdefFormatable extends android.nfc.tech.BasicTagTechnology {
    public static android.nfc.tech.NdefFormatable get(android.nfc.Tag p0) { return null; }
    public NdefFormatable(android.nfc.Tag p0) throws android.os.RemoteException { super(null, 0); }
    public void format(android.nfc.NdefMessage p0) throws java.io.IOException, android.nfc.FormatException {}
    public void formatReadOnly(android.nfc.NdefMessage p0) throws java.io.IOException, android.nfc.FormatException {}
    void format(android.nfc.NdefMessage p0, boolean p1) throws java.io.IOException, android.nfc.FormatException {}
}
