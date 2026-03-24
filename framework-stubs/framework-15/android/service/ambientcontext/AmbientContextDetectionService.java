package android.service.ambientcontext;

@android.annotation.SystemApi
public abstract class AmbientContextDetectionService extends android.app.Service {
    public static final java.lang.String SERVICE_INTERFACE = "android.service.ambientcontext.AmbientContextDetectionService";
    public AmbientContextDetectionService() { super(); }
    @android.annotation.Nullable
    public final android.os.IBinder onBind(android.content.Intent p0) { return null; }
    public abstract void onStartDetection(android.app.ambientcontext.AmbientContextEventRequest p0, java.lang.String p1, java.util.function.Consumer<android.service.ambientcontext.AmbientContextDetectionResult> p2, java.util.function.Consumer<android.service.ambientcontext.AmbientContextDetectionServiceStatus> p3);
    public abstract void onStopDetection(java.lang.String p0);
    public abstract void onQueryServiceStatus(int[] p0, java.lang.String p1, java.util.function.Consumer<android.service.ambientcontext.AmbientContextDetectionServiceStatus> p2);
}
