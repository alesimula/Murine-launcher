package android.service.wearable;

@android.annotation.SystemApi
public abstract class WearableSensingService extends android.app.Service {
    public static final java.lang.String STATUS_RESPONSE_BUNDLE_KEY = "android.app.wearable.WearableSensingStatusBundleKey";
    public static final java.lang.String SERVICE_INTERFACE = "android.service.wearable.WearableSensingService";
    public WearableSensingService() { super(); }
    public final android.os.IBinder onBind(android.content.Intent p0) { return null; }
    public abstract void onDataStreamProvided(android.os.ParcelFileDescriptor p0, java.util.function.Consumer<java.lang.Integer> p1);
    public abstract void onDataProvided(android.os.PersistableBundle p0, android.os.SharedMemory p1, java.util.function.Consumer<java.lang.Integer> p2);
    public abstract void onStartDetection(android.app.ambientcontext.AmbientContextEventRequest p0, java.lang.String p1, java.util.function.Consumer<android.service.ambientcontext.AmbientContextDetectionServiceStatus> p2, java.util.function.Consumer<android.service.ambientcontext.AmbientContextDetectionResult> p3);
    public abstract void onStopDetection(java.lang.String p0);
    public abstract void onQueryServiceStatus(java.util.Set<java.lang.Integer> p0, java.lang.String p1, java.util.function.Consumer<android.service.ambientcontext.AmbientContextDetectionServiceStatus> p2);
}
