package android.se.omapi;

@android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
@android.annotation.FlaggedApi("android.nfc.enable_nfc_mainline")
public class SeServiceManager {
    public SeServiceManager() {}
    @android.annotation.FlaggedApi("android.nfc.enable_nfc_mainline")
    @android.annotation.NonNull
    public android.se.omapi.SeServiceManager.ServiceRegisterer getSeManagerServiceRegisterer() { return null; }

    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    @android.annotation.FlaggedApi("android.nfc.enable_nfc_mainline")
    public static class ServiceNotFoundException extends android.os.ServiceManager.ServiceNotFoundException {
        @android.annotation.FlaggedApi("android.nfc.enable_nfc_mainline")
        public ServiceNotFoundException(java.lang.String p0) { super(null); }
    }

    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    @android.annotation.FlaggedApi("android.nfc.enable_nfc_mainline")
    public static final class ServiceRegisterer {
        public ServiceRegisterer(java.lang.String p0) {}
        @android.annotation.FlaggedApi("android.nfc.enable_nfc_mainline")
        public void register(android.os.IBinder p0) {}
        @android.annotation.FlaggedApi("android.nfc.enable_nfc_mainline")
        @android.annotation.Nullable
        public android.os.IBinder get() { return null; }
        @android.annotation.FlaggedApi("android.nfc.enable_nfc_mainline")
        @android.annotation.NonNull
        public android.os.IBinder getOrThrow() throws android.se.omapi.SeServiceManager.ServiceNotFoundException { return null; }
        @android.annotation.FlaggedApi("android.nfc.enable_nfc_mainline")
        @android.annotation.Nullable
        public android.os.IBinder tryGet() { return null; }
    }
}
