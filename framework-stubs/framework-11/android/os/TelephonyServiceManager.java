package android.os;

public class TelephonyServiceManager {
    public TelephonyServiceManager() {}
    public android.os.TelephonyServiceManager.ServiceRegisterer getTelephonyServiceRegisterer() { return null; }
    public android.os.TelephonyServiceManager.ServiceRegisterer getTelephonyImsServiceRegisterer() { return null; }
    public android.os.TelephonyServiceManager.ServiceRegisterer getTelephonyRcsMessageServiceRegisterer() { return null; }
    public android.os.TelephonyServiceManager.ServiceRegisterer getSubscriptionServiceRegisterer() { return null; }
    public android.os.TelephonyServiceManager.ServiceRegisterer getPhoneSubServiceRegisterer() { return null; }
    public android.os.TelephonyServiceManager.ServiceRegisterer getOpportunisticNetworkServiceRegisterer() { return null; }
    public android.os.TelephonyServiceManager.ServiceRegisterer getCarrierConfigServiceRegisterer() { return null; }
    public android.os.TelephonyServiceManager.ServiceRegisterer getSmsServiceRegisterer() { return null; }
    public android.os.TelephonyServiceManager.ServiceRegisterer getEuiccControllerService() { return null; }
    public android.os.TelephonyServiceManager.ServiceRegisterer getEuiccCardControllerServiceRegisterer() { return null; }
    public android.os.TelephonyServiceManager.ServiceRegisterer getIccPhoneBookServiceRegisterer() { return null; }

    public static class ServiceNotFoundException extends android.os.ServiceManager.ServiceNotFoundException {
        public ServiceNotFoundException(java.lang.String p0) { super(null); }
    }

    public static final class ServiceRegisterer {
        private final java.lang.String mServiceName = null;
        public ServiceRegisterer(java.lang.String p0) {}
        public void register(android.os.IBinder p0) {}
        public android.os.IBinder get() { return null; }
        public android.os.IBinder getOrThrow() throws android.os.TelephonyServiceManager.ServiceNotFoundException { return null; }
        public android.os.IBinder tryGet() { return null; }
    }
}
