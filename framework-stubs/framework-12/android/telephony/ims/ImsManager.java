package android.telephony.ims;

public class ImsManager {
    @android.annotation.SuppressLint("ActionValue")
    public static final java.lang.String ACTION_FORBIDDEN_NO_SERVICE_AUTHORIZATION = "com.android.internal.intent.action.ACTION_FORBIDDEN_NO_SERVICE_AUTHORIZATION";
    public static final java.lang.String ACTION_WFC_IMS_REGISTRATION_ERROR = "android.telephony.ims.action.WFC_IMS_REGISTRATION_ERROR";
    public static final java.lang.String EXTRA_WFC_REGISTRATION_FAILURE_TITLE = "android.telephony.ims.extra.WFC_REGISTRATION_FAILURE_TITLE";
    public static final java.lang.String EXTRA_WFC_REGISTRATION_FAILURE_MESSAGE = "android.telephony.ims.extra.WFC_REGISTRATION_FAILURE_MESSAGE";
    private static final android.telephony.BinderCacheManager<com.android.internal.telephony.ITelephony> sTelephonyCache = null;
    private static final android.telephony.BinderCacheManager<android.telephony.ims.aidl.IImsRcsController> sRcsCache = null;
    private final android.content.Context mContext = null;
    public ImsManager(android.content.Context p0) {}
    public android.telephony.ims.ImsRcsManager getImsRcsManager(int p0) { return null; }
    public android.telephony.ims.ImsMmTelManager getImsMmTelManager(int p0) { return null; }
    @android.annotation.SystemApi
    public android.telephony.ims.SipDelegateManager getSipDelegateManager(int p0) { return null; }
    private static android.telephony.ims.aidl.IImsRcsController getIImsRcsControllerInterface() { return null; }
    private static com.android.internal.telephony.ITelephony getITelephonyInterface() { return null; }
}
