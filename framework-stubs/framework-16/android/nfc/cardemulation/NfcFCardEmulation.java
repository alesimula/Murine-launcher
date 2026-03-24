package android.nfc.cardemulation;

public final class NfcFCardEmulation {
    NfcFCardEmulation() {}
    public boolean disableService(android.app.Activity p0) throws java.lang.RuntimeException { return false; }
    public boolean enableService(android.app.Activity p0, android.content.ComponentName p1) throws java.lang.RuntimeException { return false; }
    public static android.nfc.cardemulation.NfcFCardEmulation getInstance(android.nfc.NfcAdapter p0) { return null; }
    public java.lang.String getNfcid2ForService(android.content.ComponentName p0) throws java.lang.RuntimeException { return null; }
    public java.lang.String getSystemCodeForService(android.content.ComponentName p0) throws java.lang.RuntimeException { return null; }
    public boolean registerSystemCodeForService(android.content.ComponentName p0, java.lang.String p1) throws java.lang.RuntimeException { return false; }
    public boolean setNfcid2ForService(android.content.ComponentName p0, java.lang.String p1) throws java.lang.RuntimeException { return false; }
    public boolean unregisterSystemCodeForService(android.content.ComponentName p0) throws java.lang.RuntimeException { return false; }
}
