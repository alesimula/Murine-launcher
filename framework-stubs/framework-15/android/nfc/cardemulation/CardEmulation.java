package android.nfc.cardemulation;

public final class CardEmulation {
    @java.lang.Deprecated
    public static final java.lang.String ACTION_CHANGE_DEFAULT = "android.nfc.cardemulation.action.ACTION_CHANGE_DEFAULT";
    public static final java.lang.String CATEGORY_OTHER = "other";
    public static final java.lang.String CATEGORY_PAYMENT = "payment";
    public static final java.lang.String EXTRA_CATEGORY = "category";
    public static final java.lang.String EXTRA_SERVICE_COMPONENT = "component";
    public static final int SELECTION_MODE_ALWAYS_ASK = 1;
    public static final int SELECTION_MODE_ASK_IF_CONFLICT = 2;
    public static final int SELECTION_MODE_PREFER_DEFAULT = 0;
    CardEmulation() {}
    public boolean categoryAllowsForegroundPreference(java.lang.String p0) { return false; }
    @android.annotation.Nullable
    public java.util.List<java.lang.String> getAidsForPreferredPaymentService() { return null; }
    public java.util.List<java.lang.String> getAidsForService(android.content.ComponentName p0, java.lang.String p1) { return null; }
    @android.annotation.Nullable
    public java.lang.CharSequence getDescriptionForPreferredPaymentService() { return null; }
    public static android.nfc.cardemulation.CardEmulation getInstance(android.nfc.NfcAdapter p0) { return null; }
    @android.annotation.Nullable
    public java.lang.String getRouteDestinationForPreferredPaymentService() { return null; }
    public int getSelectionModeForCategory(java.lang.String p0) { return 0; }
    public boolean isDefaultServiceForAid(android.content.ComponentName p0, java.lang.String p1) { return false; }
    public boolean isDefaultServiceForCategory(android.content.ComponentName p0, java.lang.String p1) { return false; }
    public boolean registerAidsForService(android.content.ComponentName p0, java.lang.String p1, java.util.List<java.lang.String> p2) { return false; }
    public boolean registerPollingLoopFilterForService(android.content.ComponentName p0, java.lang.String p1, boolean p2) { return false; }
    public boolean registerPollingLoopPatternFilterForService(android.content.ComponentName p0, java.lang.String p1, boolean p2) { return false; }
    public boolean removeAidsForService(android.content.ComponentName p0, java.lang.String p1) { return false; }
    public boolean removePollingLoopFilterForService(android.content.ComponentName p0, java.lang.String p1) { return false; }
    public boolean removePollingLoopPatternFilterForService(android.content.ComponentName p0, java.lang.String p1) { return false; }
    @android.annotation.NonNull
    public boolean setOffHostForService(android.content.ComponentName p0, java.lang.String p1) { return false; }
    public boolean setPreferredService(android.app.Activity p0, android.content.ComponentName p1) { return false; }
    public boolean setShouldDefaultToObserveModeForService(android.content.ComponentName p0, boolean p1) { return false; }
    public boolean supportsAidPrefixRegistration() { return false; }
    @android.annotation.NonNull
    public boolean unsetOffHostForService(android.content.ComponentName p0) { return false; }
    public boolean unsetPreferredService(android.app.Activity p0) { return false; }
    @android.annotation.Nullable
    public static android.content.ComponentName getPreferredPaymentService(android.content.Context p0) { return null; }
    @android.annotation.NonNull
    public java.util.List<android.nfc.cardemulation.ApduServiceInfo> getServices(java.lang.String p0, int p1) { return null; }
}
