package android.nfc.cardemulation;

public abstract class HostApduService extends android.app.Service {
    public static final java.lang.String SERVICE_INTERFACE = "android.nfc.cardemulation.action.HOST_APDU_SERVICE";
    public static final java.lang.String SERVICE_META_DATA = "android.nfc.cardemulation.host_apdu_service";
    public static final int DEACTIVATION_LINK_LOSS = 0;
    public static final int DEACTIVATION_DESELECTED = 1;
    static final java.lang.String TAG = "ApduService";
    public static final int MSG_COMMAND_APDU = 0;
    public static final int MSG_RESPONSE_APDU = 1;
    public static final int MSG_DEACTIVATED = 2;
    public static final int MSG_UNHANDLED = 3;
    public static final java.lang.String KEY_DATA = "data";
    android.os.Messenger mNfcService;
    final android.os.Messenger mMessenger = null;
    public HostApduService() { super(); }
    public final android.os.IBinder onBind(android.content.Intent p0) { return null; }
    public final void sendResponseApdu(byte[] p0) {}
    public final void notifyUnhandled() {}
    public abstract byte[] processCommandApdu(byte[] p0, android.os.Bundle p1);
    public abstract void onDeactivated(int p0);

    final class MsgHandler extends android.os.Handler {
        MsgHandler(android.nfc.cardemulation.HostApduService p0) { super(); }
        public void handleMessage(android.os.Message p0) {}
    }
}
