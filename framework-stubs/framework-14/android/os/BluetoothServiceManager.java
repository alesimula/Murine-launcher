package android.os;

@android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
public class BluetoothServiceManager {
    public static final java.lang.String BLUETOOTH_MANAGER_SERVICE = "bluetooth_manager";
    public BluetoothServiceManager() {}
    public android.os.BluetoothServiceManager.ServiceRegisterer getBluetoothManagerServiceRegisterer() { return null; }

    public static class ServiceNotFoundException extends android.os.ServiceManager.ServiceNotFoundException {
        public ServiceNotFoundException(java.lang.String p0) { super(null); }
    }

    public static final class ServiceRegisterer {
        public ServiceRegisterer(java.lang.String p0) {}
        public void register(android.os.IBinder p0) {}
        public android.os.IBinder get() { return null; }
        public android.os.IBinder getOrThrow() throws android.os.BluetoothServiceManager.ServiceNotFoundException { return null; }
        public android.os.IBinder tryGet() { return null; }
    }
}
