package android.telecom;

@android.annotation.SystemApi
public class PhoneAccountSuggestionService extends android.app.Service {
    public static final java.lang.String SERVICE_INTERFACE = "android.telecom.PhoneAccountSuggestionService";
    private com.android.internal.telecom.IPhoneAccountSuggestionService mInterface;
    private final java.util.Map<java.lang.String, com.android.internal.telecom.IPhoneAccountSuggestionCallback> mCallbackMap = null;
    public PhoneAccountSuggestionService() { super(); }
    public android.os.IBinder onBind(android.content.Intent p0) { return null; }
    public void onAccountSuggestionRequest(java.lang.String p0) {}
    public final void suggestPhoneAccounts(java.lang.String p0, java.util.List<android.telecom.PhoneAccountSuggestion> p1) {}
}
