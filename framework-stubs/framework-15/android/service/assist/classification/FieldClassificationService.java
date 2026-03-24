package android.service.assist.classification;

@android.annotation.SystemApi
public abstract class FieldClassificationService extends android.app.Service {
    static boolean sDebug;
    static boolean sVerbose;
    public static final java.lang.String SERVICE_INTERFACE = "android.service.assist.classification.FieldClassificationService";
    public FieldClassificationService() { super(); }
    public void onCreate() {}
    public final android.os.IBinder onBind(android.content.Intent p0) { return null; }
    public void onConnected() {}
    public abstract void onClassificationRequest(android.service.assist.classification.FieldClassificationRequest p0, android.os.CancellationSignal p1, android.os.OutcomeReceiver<android.service.assist.classification.FieldClassificationResponse, java.lang.Exception> p2);
    public void onDisconnected() {}

    private final class FieldClassificationServiceImpl extends android.service.assist.classification.IFieldClassificationService.Stub {
        public void onConnected(boolean p0, boolean p1) {}
        public void onDisconnected() {}
        public void onFieldClassificationRequest(android.service.assist.classification.FieldClassificationRequest p0, android.service.assist.classification.IFieldClassificationCallback p1) {}
    }
}
