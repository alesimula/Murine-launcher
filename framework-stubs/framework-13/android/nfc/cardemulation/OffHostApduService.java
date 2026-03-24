package android.nfc.cardemulation;

public abstract class OffHostApduService extends android.app.Service {
    public static final java.lang.String SERVICE_INTERFACE = "android.nfc.cardemulation.action.OFF_HOST_APDU_SERVICE";
    public static final java.lang.String SERVICE_META_DATA = "android.nfc.cardemulation.off_host_apdu_service";
    public OffHostApduService() { super(); }
    public abstract android.os.IBinder onBind(android.content.Intent p0);
}
