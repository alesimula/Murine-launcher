package android.nfc;

@android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
public class NfcServiceManager {
    public NfcServiceManager() {}
    public android.nfc.NfcServiceManager.ServiceRegisterer getNfcManagerServiceRegisterer() { return null; }

    public static class ServiceNotFoundException extends android.os.ServiceManager.ServiceNotFoundException {
        public ServiceNotFoundException(java.lang.String p0) { super(null); }
    }

    public static final class ServiceRegisterer {
        public ServiceRegisterer(java.lang.String p0) {}
        public void register(android.os.IBinder p0) {}
        public android.os.IBinder get() { return null; }
        public android.os.IBinder getOrThrow() throws android.nfc.NfcServiceManager.ServiceNotFoundException { return null; }
        public android.os.IBinder tryGet() { return null; }
    }
}
