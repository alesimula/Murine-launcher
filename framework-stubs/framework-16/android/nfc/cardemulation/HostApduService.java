package android.nfc.cardemulation;

public abstract class HostApduService extends android.app.Service {
    public static final int DEACTIVATION_DESELECTED = 1;
    public static final int DEACTIVATION_LINK_LOSS = 0;
    public static final java.lang.String SERVICE_INTERFACE = "android.nfc.cardemulation.action.HOST_APDU_SERVICE";
    public static final java.lang.String SERVICE_META_DATA = "android.nfc.cardemulation.host_apdu_service";
    public HostApduService() { super(); }
    public final void notifyUnhandled() {}
    public final android.os.IBinder onBind(android.content.Intent p0) { return null; }
    public abstract void onDeactivated(int p0);
    public abstract byte[] processCommandApdu(byte[] p0, android.os.Bundle p1);
    public void processPollingFrames(java.util.List<android.nfc.cardemulation.PollingFrame> p0) {}
    public final void sendResponseApdu(byte[] p0) {}
}
