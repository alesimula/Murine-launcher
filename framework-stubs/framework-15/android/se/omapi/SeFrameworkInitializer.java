package android.se.omapi;

@android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
@android.annotation.FlaggedApi("android.nfc.enable_nfc_mainline")
public class SeFrameworkInitializer {
    @android.annotation.FlaggedApi("android.nfc.enable_nfc_mainline")
    public static void setSeServiceManager(android.se.omapi.SeServiceManager p0) {}
    @android.annotation.FlaggedApi("android.nfc.enable_nfc_mainline")
    @android.annotation.Nullable
    public static android.se.omapi.SeServiceManager getSeServiceManager() { return null; }
}
