package android.companion;

public abstract class CompanionDeviceService extends android.app.Service {
    private static final java.lang.String LOG_TAG = "CompanionDeviceService";
    public static final java.lang.String SERVICE_INTERFACE = "android.companion.CompanionDeviceService";
    private final android.companion.CompanionDeviceService.Stub mRemote = null;
    public CompanionDeviceService() { super(); }
    public abstract void onDeviceAppeared(java.lang.String p0);
    public abstract void onDeviceDisappeared(java.lang.String p0);
    public final android.os.IBinder onBind(android.content.Intent p0) { return null; }

    class Stub extends android.companion.ICompanionDeviceService.Stub {
        Stub(android.companion.CompanionDeviceService p0) { super(); }
        public void onDeviceAppeared(java.lang.String p0) {}
        public void onDeviceDisappeared(java.lang.String p0) {}
    }
}
