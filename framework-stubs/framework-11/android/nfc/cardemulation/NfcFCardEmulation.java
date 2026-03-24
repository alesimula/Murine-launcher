package android.nfc.cardemulation;

public final class NfcFCardEmulation {
    static final java.lang.String TAG = "NfcFCardEmulation";
    static boolean sIsInitialized;
    static java.util.HashMap<android.content.Context, android.nfc.cardemulation.NfcFCardEmulation> sCardEmus;
    static android.nfc.INfcFCardEmulation sService;
    final android.content.Context mContext = null;
    private NfcFCardEmulation(android.content.Context p0, android.nfc.INfcFCardEmulation p1) {}
    public static synchronized android.nfc.cardemulation.NfcFCardEmulation getInstance(android.nfc.NfcAdapter p0) { return null; }
    public java.lang.String getSystemCodeForService(android.content.ComponentName p0) throws java.lang.RuntimeException { return null; }
    public boolean registerSystemCodeForService(android.content.ComponentName p0, java.lang.String p1) throws java.lang.RuntimeException { return false; }
    public boolean unregisterSystemCodeForService(android.content.ComponentName p0) throws java.lang.RuntimeException { return false; }
    public java.lang.String getNfcid2ForService(android.content.ComponentName p0) throws java.lang.RuntimeException { return null; }
    public boolean setNfcid2ForService(android.content.ComponentName p0, java.lang.String p1) throws java.lang.RuntimeException { return false; }
    public boolean enableService(android.app.Activity p0, android.content.ComponentName p1) throws java.lang.RuntimeException { return false; }
    public boolean disableService(android.app.Activity p0) throws java.lang.RuntimeException { return false; }
    public java.util.List<android.nfc.cardemulation.NfcFServiceInfo> getNfcFServices() { return null; }
    public int getMaxNumOfRegisterableSystemCodes() { return 0; }
    public static boolean isValidSystemCode(java.lang.String p0) { return false; }
    public static boolean isValidNfcid2(java.lang.String p0) { return false; }
    void recoverService() {}
}
