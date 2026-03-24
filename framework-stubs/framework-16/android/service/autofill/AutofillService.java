package android.service.autofill;

public abstract class AutofillService extends android.app.Service {
    public static final java.lang.String SERVICE_INTERFACE = "android.service.autofill.AutofillService";
    public static final java.lang.String SERVICE_META_DATA = "android.autofill";
    public static final java.lang.String EXTRA_FILL_RESPONSE = "android.service.autofill.extra.FILL_RESPONSE";
    public static final java.lang.String EXTRA_RESULT = "result";
    public static final java.lang.String EXTRA_ERROR = "error";
    public static final java.lang.String WEBVIEW_REQUESTED_CREDENTIAL_KEY = "webview_requested_credential";
    public AutofillService() { super(); }
    public void onCreate() {}
    public final android.os.IBinder onBind(android.content.Intent p0) { return null; }
    public void onConnected() {}
    public abstract void onFillRequest(android.service.autofill.FillRequest p0, android.os.CancellationSignal p1, android.service.autofill.FillCallback p2);
    public void onFillCredentialRequest(android.service.autofill.FillRequest p0, android.os.CancellationSignal p1, android.service.autofill.FillCallback p2, android.os.IBinder p3) {}
    public void onConvertCredentialRequest(android.service.autofill.ConvertCredentialRequest p0, android.service.autofill.ConvertCredentialCallback p1) {}
    public abstract void onSaveRequest(android.service.autofill.SaveRequest p0, android.service.autofill.SaveCallback p1);
    public void onSavedDatasetsInfoRequest(android.service.autofill.SavedDatasetsInfoCallback p0) {}
    public void onDisconnected() {}
    @android.annotation.FlaggedApi("android.service.autofill.autofill_session_destroyed")
    public void onSessionDestroyed(android.service.autofill.FillEventHistory p0) {}
    @java.lang.Deprecated
    @android.annotation.FlaggedApi("android.service.autofill.autofill_session_destroyed")
    @android.annotation.Nullable
    public final android.service.autofill.FillEventHistory getFillEventHistory() { return null; }
}
