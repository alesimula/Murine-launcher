package android.service.credentials;

public abstract class CredentialProviderService extends android.app.Service {
    public static final java.lang.String EXTRA_CREATE_CREDENTIAL_REQUEST = "android.service.credentials.extra.CREATE_CREDENTIAL_REQUEST";
    public static final java.lang.String EXTRA_GET_CREDENTIAL_REQUEST = "android.service.credentials.extra.GET_CREDENTIAL_REQUEST";
    public static final java.lang.String EXTRA_CREATE_CREDENTIAL_RESPONSE = "android.service.credentials.extra.CREATE_CREDENTIAL_RESPONSE";
    public static final java.lang.String EXTRA_GET_CREDENTIAL_RESPONSE = "android.service.credentials.extra.GET_CREDENTIAL_RESPONSE";
    public static final java.lang.String EXTRA_BEGIN_GET_CREDENTIAL_RESPONSE = "android.service.credentials.extra.BEGIN_GET_CREDENTIAL_RESPONSE";
    public static final java.lang.String EXTRA_GET_CREDENTIAL_EXCEPTION = "android.service.credentials.extra.GET_CREDENTIAL_EXCEPTION";
    public static final java.lang.String EXTRA_CREATE_CREDENTIAL_EXCEPTION = "android.service.credentials.extra.CREATE_CREDENTIAL_EXCEPTION";
    public static final java.lang.String EXTRA_BEGIN_GET_CREDENTIAL_REQUEST = "android.service.credentials.extra.BEGIN_GET_CREDENTIAL_REQUEST";
    public static final java.lang.String EXTRA_AUTOFILL_ID = "android.service.credentials.extra.AUTOFILL_ID";
    public static final java.lang.String SERVICE_META_DATA = "android.credentials.provider";
    public static final java.lang.String TEST_SYSTEM_PROVIDER_META_DATA_KEY = "android.credentials.testsystemprovider";
    public static final java.lang.String SERVICE_INTERFACE = "android.service.credentials.CredentialProviderService";
    public static final java.lang.String SYSTEM_SERVICE_INTERFACE = "android.service.credentials.system.CredentialProviderService";
    public CredentialProviderService() { super(); }
    public void onCreate() {}
    @android.annotation.NonNull
    public final android.os.IBinder onBind(android.content.Intent p0) { return null; }
    public abstract void onBeginGetCredential(android.service.credentials.BeginGetCredentialRequest p0, android.os.CancellationSignal p1, android.os.OutcomeReceiver<android.service.credentials.BeginGetCredentialResponse, android.credentials.GetCredentialException> p2);
    public abstract void onBeginCreateCredential(android.service.credentials.BeginCreateCredentialRequest p0, android.os.CancellationSignal p1, android.os.OutcomeReceiver<android.service.credentials.BeginCreateCredentialResponse, android.credentials.CreateCredentialException> p2);
    public abstract void onClearCredentialState(android.service.credentials.ClearCredentialStateRequest p0, android.os.CancellationSignal p1, android.os.OutcomeReceiver<java.lang.Void, android.credentials.ClearCredentialStateException> p2);
}
