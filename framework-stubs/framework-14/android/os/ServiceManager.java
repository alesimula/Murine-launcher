package android.os;

@android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
public final class ServiceManager {
    public static final com.android.internal.util.StatLogger sStatLogger = null;
    public ServiceManager() {}
    public static android.os.IBinder getService(java.lang.String p0) { return null; }
    public static android.os.IBinder getServiceOrThrow(java.lang.String p0) throws android.os.ServiceManager.ServiceNotFoundException { return null; }
    public static void addService(java.lang.String p0, android.os.IBinder p1) {}
    public static void addService(java.lang.String p0, android.os.IBinder p1, boolean p2) {}
    public static void addService(java.lang.String p0, android.os.IBinder p1, boolean p2, int p3) {}
    public static android.os.IBinder checkService(java.lang.String p0) { return null; }
    public static boolean isDeclared(java.lang.String p0) { return false; }
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    public static java.lang.String[] getDeclaredInstances(java.lang.String p0) { return null; }
    public static android.os.IBinder waitForService(java.lang.String p0) { return null; }
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    public static android.os.IBinder waitForDeclaredService(java.lang.String p0) { return null; }
    public static void registerForNotifications(java.lang.String p0, android.os.IServiceCallback p1) throws android.os.RemoteException {}
    public static java.lang.String[] listServices() { return null; }
    public static android.os.ServiceDebugInfo[] getServiceDebugInfo() { return null; }
    public static void initServiceCache(java.util.Map<java.lang.String, android.os.IBinder> p0) {}

    public static class ServiceNotFoundException extends java.lang.Exception {
        public ServiceNotFoundException(java.lang.String p0) { super(); }
    }

    static interface Stats {
        public static final int GET_SERVICE = 0;
        public static final int COUNT = 1;
    }
}
