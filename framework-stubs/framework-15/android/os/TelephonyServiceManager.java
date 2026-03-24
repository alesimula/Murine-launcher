package android.os;

public class TelephonyServiceManager {
    public TelephonyServiceManager() {}
    @android.annotation.NonNull
    public android.os.TelephonyServiceManager.ServiceRegisterer getTelephonyServiceRegisterer() { return null; }
    @android.annotation.NonNull
    public android.os.TelephonyServiceManager.ServiceRegisterer getTelephonyImsServiceRegisterer() { return null; }
    @android.annotation.NonNull
    public android.os.TelephonyServiceManager.ServiceRegisterer getTelephonyRcsMessageServiceRegisterer() { return null; }
    @android.annotation.NonNull
    public android.os.TelephonyServiceManager.ServiceRegisterer getSubscriptionServiceRegisterer() { return null; }
    @android.annotation.NonNull
    public android.os.TelephonyServiceManager.ServiceRegisterer getPhoneSubServiceRegisterer() { return null; }
    @android.annotation.NonNull
    public android.os.TelephonyServiceManager.ServiceRegisterer getOpportunisticNetworkServiceRegisterer() { return null; }
    @android.annotation.NonNull
    public android.os.TelephonyServiceManager.ServiceRegisterer getCarrierConfigServiceRegisterer() { return null; }
    @android.annotation.NonNull
    public android.os.TelephonyServiceManager.ServiceRegisterer getSmsServiceRegisterer() { return null; }
    @android.annotation.NonNull
    public android.os.TelephonyServiceManager.ServiceRegisterer getEuiccControllerService() { return null; }
    @android.annotation.NonNull
    public android.os.TelephonyServiceManager.ServiceRegisterer getEuiccCardControllerServiceRegisterer() { return null; }
    @android.annotation.NonNull
    public android.os.TelephonyServiceManager.ServiceRegisterer getIccPhoneBookServiceRegisterer() { return null; }

    public static class ServiceNotFoundException extends android.os.ServiceManager.ServiceNotFoundException {
        public ServiceNotFoundException(java.lang.String p0) { super(null); }
    }

    public static final class ServiceRegisterer {
        public ServiceRegisterer(java.lang.String p0) {}
        public void register(android.os.IBinder p0) {}
        @android.annotation.Nullable
        public android.os.IBinder get() { return null; }
        @android.annotation.NonNull
        public android.os.IBinder getOrThrow() throws android.os.TelephonyServiceManager.ServiceNotFoundException { return null; }
        @android.annotation.Nullable
        public android.os.IBinder tryGet() { return null; }
    }
}
