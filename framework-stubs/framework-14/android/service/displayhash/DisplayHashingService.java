package android.service.displayhash;

@android.annotation.SystemApi
public abstract class DisplayHashingService extends android.app.Service {
    public static final java.lang.String EXTRA_VERIFIED_DISPLAY_HASH = "android.service.displayhash.extra.VERIFIED_DISPLAY_HASH";
    public static final java.lang.String EXTRA_INTERVAL_BETWEEN_REQUESTS = "android.service.displayhash.extra.INTERVAL_BETWEEN_REQUESTS";
    @android.annotation.SystemApi
    public static final java.lang.String SERVICE_INTERFACE = "android.service.displayhash.DisplayHashingService";
    public DisplayHashingService() { super(); }
    public void onCreate() {}
    public final android.os.IBinder onBind(android.content.Intent p0) { return null; }
    public abstract void onGenerateDisplayHash(byte[] p0, android.hardware.HardwareBuffer p1, android.graphics.Rect p2, java.lang.String p3, android.view.displayhash.DisplayHashResultCallback p4);
    public abstract java.util.Map<java.lang.String, android.service.displayhash.DisplayHashParams> onGetDisplayHashAlgorithms();
    public abstract android.view.displayhash.VerifiedDisplayHash onVerifyDisplayHash(byte[] p0, android.view.displayhash.DisplayHash p1);
    public abstract int onGetIntervalBetweenRequestsMillis();

    private final class DisplayHashingServiceWrapper extends android.service.displayhash.IDisplayHashingService.Stub {
        public void generateDisplayHash(byte[] p0, android.hardware.HardwareBuffer p1, android.graphics.Rect p2, java.lang.String p3, android.os.RemoteCallback p4) {}
        public void verifyDisplayHash(byte[] p0, android.view.displayhash.DisplayHash p1, android.os.RemoteCallback p2) {}
        public void getDisplayHashAlgorithms(android.os.RemoteCallback p0) {}
        public void getIntervalBetweenRequestsMillis(android.os.RemoteCallback p0) {}
    }
}
