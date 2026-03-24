package android.nfc.cardemulation;

public abstract class HostNfcFService extends android.app.Service {
    public static final java.lang.String SERVICE_INTERFACE = "android.nfc.cardemulation.action.HOST_NFCF_SERVICE";
    public static final java.lang.String SERVICE_META_DATA = "android.nfc.cardemulation.host_nfcf_service";
    public static final int DEACTIVATION_LINK_LOSS = 0;
    static final java.lang.String TAG = "NfcFService";
    public static final int MSG_COMMAND_PACKET = 0;
    public static final int MSG_RESPONSE_PACKET = 1;
    public static final int MSG_DEACTIVATED = 2;
    public static final java.lang.String KEY_DATA = "data";
    public static final java.lang.String KEY_MESSENGER = "messenger";
    android.os.Messenger mNfcService;
    final android.os.Messenger mMessenger = null;
    public HostNfcFService() { super(); }
    public final android.os.IBinder onBind(android.content.Intent p0) { return null; }
    public final void sendResponsePacket(byte[] p0) {}
    public abstract byte[] processNfcFPacket(byte[] p0, android.os.Bundle p1);
    public abstract void onDeactivated(int p0);

    final class MsgHandler extends android.os.Handler {
        MsgHandler(android.nfc.cardemulation.HostNfcFService p0) { super(); }
        public void handleMessage(android.os.Message p0) {}
    }
}
