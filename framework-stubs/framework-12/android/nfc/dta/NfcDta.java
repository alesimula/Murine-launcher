package android.nfc.dta;

public final class NfcDta {
    private static final java.lang.String TAG = "NfcDta";
    private static android.nfc.INfcDta sService;
    private static java.util.HashMap<android.content.Context, android.nfc.dta.NfcDta> sNfcDtas;
    private final android.content.Context mContext = null;
    private NfcDta(android.content.Context p0, android.nfc.INfcDta p1) {}
    public static synchronized android.nfc.dta.NfcDta getInstance(android.nfc.NfcAdapter p0) { return null; }
    public boolean enableDta() { return false; }
    public boolean disableDta() { return false; }
    public boolean enableServer(java.lang.String p0, int p1, int p2, int p3, int p4) { return false; }
    public boolean disableServer() { return false; }
    public boolean enableClient(java.lang.String p0, int p1, int p2, int p3) { return false; }
    public boolean disableClient() { return false; }
    public boolean registerMessageService(java.lang.String p0) { return false; }
}
