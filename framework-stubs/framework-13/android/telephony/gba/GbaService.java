package android.telephony.gba;

@android.annotation.SystemApi
public class GbaService extends android.app.Service {
    public static final java.lang.String SERVICE_INTERFACE = "android.telephony.gba.GbaService";
    public GbaService() { super(); }
    public void onAuthenticationRequest(int p0, int p1, int p2, android.net.Uri p3, byte[] p4, boolean p5) {}
    public final void reportKeysAvailable(int p0, byte[] p1, java.lang.String p2) throws java.lang.RuntimeException {}
    public final void reportAuthenticationFailure(int p0, int p1) throws java.lang.RuntimeException {}
    public android.os.IBinder onBind(android.content.Intent p0) { return null; }
    public void onDestroy() {}

    private class GbaServiceHandler extends android.os.Handler {
        GbaServiceHandler(android.telephony.gba.GbaService p0, android.os.Looper p1) { super(); }
        public void handleMessage(android.os.Message p0) {}
    }

    private class IGbaServiceWrapper extends android.telephony.gba.IGbaService.Stub {
        public void authenticationRequest(android.telephony.gba.GbaAuthRequest p0) {}
    }
}
