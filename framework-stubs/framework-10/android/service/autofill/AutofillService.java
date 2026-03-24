package android.service.autofill;

public abstract class AutofillService extends android.app.Service {
    private static final java.lang.String TAG = "AutofillService";
    public static final java.lang.String SERVICE_INTERFACE = "android.service.autofill.AutofillService";
    public static final java.lang.String SERVICE_META_DATA = "android.autofill";
    private final android.service.autofill.IAutoFillService mInterface = null;
    private android.os.Handler mHandler;
    public AutofillService() { super(); }
    public void onCreate() {}
    public final android.os.IBinder onBind(android.content.Intent p0) { return null; }
    public void onConnected() {}
    public abstract void onFillRequest(android.service.autofill.FillRequest p0, android.os.CancellationSignal p1, android.service.autofill.FillCallback p2);
    public abstract void onSaveRequest(android.service.autofill.SaveRequest p0, android.service.autofill.SaveCallback p1);
    public void onDisconnected() {}
    public final android.service.autofill.FillEventHistory getFillEventHistory() { return null; }
}
