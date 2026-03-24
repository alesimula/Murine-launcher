package android.service.carrier;

public abstract class CarrierService extends android.app.Service {
    public static final java.lang.String CARRIER_SERVICE_INTERFACE = "android.service.carrier.CarrierService";
    public CarrierService() { super(); }
    @java.lang.Deprecated
    public abstract android.os.PersistableBundle onLoadConfig(android.service.carrier.CarrierIdentifier p0);
    @android.annotation.SuppressLint("NullableCollection")
    @android.annotation.Nullable
    public android.os.PersistableBundle onLoadConfig(int p0, android.service.carrier.CarrierIdentifier p1) { return null; }
    @java.lang.Deprecated
    public final void notifyCarrierNetworkChange(boolean p0) {}
    public final void notifyCarrierNetworkChange(int p0, boolean p1) {}
    public android.os.IBinder onBind(android.content.Intent p0) { return null; }

    public class ICarrierServiceWrapper extends android.service.carrier.ICarrierService.Stub {
        public static final int RESULT_OK = 0;
        public static final int RESULT_ERROR = 1;
        public static final java.lang.String KEY_CONFIG_BUNDLE = "config_bundle";
        public ICarrierServiceWrapper(android.service.carrier.CarrierService p0) { super(); }
        public void getCarrierConfig(int p0, android.service.carrier.CarrierIdentifier p1, android.os.ResultReceiver p2) {}
        protected void dump(java.io.FileDescriptor p0, java.io.PrintWriter p1, java.lang.String[] p2) {}
    }
}
