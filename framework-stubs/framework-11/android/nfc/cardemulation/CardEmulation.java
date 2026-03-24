package android.nfc.cardemulation;

public final class CardEmulation {
    private static final java.util.regex.Pattern AID_PATTERN = null;
    static final java.lang.String TAG = "CardEmulation";
    public static final java.lang.String ACTION_CHANGE_DEFAULT = "android.nfc.cardemulation.action.ACTION_CHANGE_DEFAULT";
    public static final java.lang.String EXTRA_CATEGORY = "category";
    public static final java.lang.String EXTRA_SERVICE_COMPONENT = "component";
    public static final java.lang.String CATEGORY_PAYMENT = "payment";
    public static final java.lang.String CATEGORY_OTHER = "other";
    public static final int SELECTION_MODE_PREFER_DEFAULT = 0;
    public static final int SELECTION_MODE_ALWAYS_ASK = 1;
    public static final int SELECTION_MODE_ASK_IF_CONFLICT = 2;
    static boolean sIsInitialized;
    static java.util.HashMap<android.content.Context, android.nfc.cardemulation.CardEmulation> sCardEmus;
    static android.nfc.INfcCardEmulation sService;
    final android.content.Context mContext = null;
    private CardEmulation(android.content.Context p0, android.nfc.INfcCardEmulation p1) {}
    public static synchronized android.nfc.cardemulation.CardEmulation getInstance(android.nfc.NfcAdapter p0) { return null; }
    public boolean isDefaultServiceForCategory(android.content.ComponentName p0, java.lang.String p1) { return false; }
    public boolean isDefaultServiceForAid(android.content.ComponentName p0, java.lang.String p1) { return false; }
    public boolean categoryAllowsForegroundPreference(java.lang.String p0) { return false; }
    public int getSelectionModeForCategory(java.lang.String p0) { return 0; }
    public boolean registerAidsForService(android.content.ComponentName p0, java.lang.String p1, java.util.List<java.lang.String> p2) { return false; }
    public boolean unsetOffHostForService(android.content.ComponentName p0) { return false; }
    public boolean setOffHostForService(android.content.ComponentName p0, java.lang.String p1) { return false; }
    public java.util.List<java.lang.String> getAidsForService(android.content.ComponentName p0, java.lang.String p1) { return null; }
    public boolean removeAidsForService(android.content.ComponentName p0, java.lang.String p1) { return false; }
    public boolean setPreferredService(android.app.Activity p0, android.content.ComponentName p1) { return false; }
    public boolean unsetPreferredService(android.app.Activity p0) { return false; }
    public boolean supportsAidPrefixRegistration() { return false; }
    public java.util.List<java.lang.String> getAidsForPreferredPaymentService() { return null; }
    public java.lang.String getRouteDestinationForPreferredPaymentService() { return null; }
    public java.lang.CharSequence getDescriptionForPreferredPaymentService() { return null; }
    public boolean setDefaultServiceForCategory(android.content.ComponentName p0, java.lang.String p1) { return false; }
    public boolean setDefaultForNextTap(android.content.ComponentName p0) { return false; }
    public java.util.List<android.nfc.cardemulation.ApduServiceInfo> getServices(java.lang.String p0) { return null; }
    public static boolean isValidAid(java.lang.String p0) { return false; }
    void recoverService() {}
}
