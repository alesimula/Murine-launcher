package android.nfc.cardemulation;

public abstract class HostNfcFService extends android.app.Service {
    public static final int DEACTIVATION_LINK_LOSS = 0;
    public static final java.lang.String SERVICE_INTERFACE = "android.nfc.cardemulation.action.HOST_NFCF_SERVICE";
    public static final java.lang.String SERVICE_META_DATA = "android.nfc.cardemulation.host_nfcf_service";
    public HostNfcFService() { super(); }
    public final android.os.IBinder onBind(android.content.Intent p0) { return null; }
    public abstract void onDeactivated(int p0);
    public abstract byte[] processNfcFPacket(byte[] p0, android.os.Bundle p1);
    public final void sendResponsePacket(byte[] p0) {}
}
