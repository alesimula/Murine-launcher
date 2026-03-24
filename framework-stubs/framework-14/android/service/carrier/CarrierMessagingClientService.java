package android.service.carrier;

public class CarrierMessagingClientService extends android.app.Service {
    public CarrierMessagingClientService() { super(); }
    public final android.os.IBinder onBind(android.content.Intent p0) { return null; }

    private class ICarrierMessagingClientServiceImpl extends android.service.carrier.ICarrierMessagingClientService.Stub {
    }
}
