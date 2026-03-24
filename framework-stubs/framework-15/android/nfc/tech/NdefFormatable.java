package android.nfc.tech;

public final class NdefFormatable implements android.nfc.tech.TagTechnology {
    NdefFormatable() {}
    public void close() throws java.io.IOException {}
    public void connect() throws java.io.IOException {}
    public void format(android.nfc.NdefMessage p0) throws android.nfc.FormatException, java.io.IOException {}
    public void formatReadOnly(android.nfc.NdefMessage p0) throws android.nfc.FormatException, java.io.IOException {}
    public static android.nfc.tech.NdefFormatable get(android.nfc.Tag p0) { return null; }
    public android.nfc.Tag getTag() { return null; }
    public boolean isConnected() { return false; }
}
