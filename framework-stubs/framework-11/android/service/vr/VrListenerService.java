package android.service.vr;

public abstract class VrListenerService extends android.app.Service {
    public static final java.lang.String SERVICE_INTERFACE = "android.service.vr.VrListenerService";
    private final android.os.Handler mHandler = null;
    private static final int MSG_ON_CURRENT_VR_ACTIVITY_CHANGED = 1;
    private final android.service.vr.IVrListener.Stub mBinder = null;
    public android.os.IBinder onBind(android.content.Intent p0) { return null; }
    public VrListenerService() { super(); }
    public void onCurrentVrActivityChanged(android.content.ComponentName p0) {}
    public void onCurrentVrActivityChanged(android.content.ComponentName p0, boolean p1, int p2) {}
    public static final boolean isVrModePackageEnabled(android.content.Context p0, android.content.ComponentName p1) { return false; }

    private final class VrListenerHandler extends android.os.Handler {
        public VrListenerHandler(android.service.vr.VrListenerService p0, android.os.Looper p1) { super(); }
        public void handleMessage(android.os.Message p0) {}
    }
}
