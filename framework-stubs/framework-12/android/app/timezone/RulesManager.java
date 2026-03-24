package android.app.timezone;

public final class RulesManager {
    private static final java.lang.String TAG = "timezone.RulesManager";
    private static final boolean DEBUG = false;
    public static final java.lang.String ACTION_RULES_UPDATE_OPERATION = "com.android.intent.action.timezone.RULES_UPDATE_OPERATION";
    public static final java.lang.String EXTRA_OPERATION_STAGED = "staged";
    public static final int SUCCESS = 0;
    public static final int ERROR_OPERATION_IN_PROGRESS = 1;
    public static final int ERROR_UNKNOWN_FAILURE = 2;
    private final android.content.Context mContext = null;
    private final android.app.timezone.IRulesManager mIRulesManager = null;
    public RulesManager(android.content.Context p0) {}
    public android.app.timezone.RulesState getRulesState() { return null; }
    public int requestInstall(android.os.ParcelFileDescriptor p0, byte[] p1, android.app.timezone.Callback p2) throws java.io.IOException { return 0; }
    public int requestUninstall(byte[] p0, android.app.timezone.Callback p1) { return 0; }
    public void requestNothing(byte[] p0, boolean p1) {}
    static void logDebug(java.lang.String p0) {}

    private class CallbackWrapper extends android.app.timezone.ICallback.Stub {
        final android.os.Handler mHandler = null;
        final android.app.timezone.Callback mCallback = null;
        CallbackWrapper(android.app.timezone.RulesManager p0, android.content.Context p1, android.app.timezone.Callback p2) { super(); }
        public void onFinished(int p0) {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ResultCode {
    }
}
