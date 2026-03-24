package android.service.sms;

@android.annotation.SystemApi
public abstract class FinancialSmsService extends android.app.Service {
    private static final java.lang.String TAG = "FinancialSmsService";
    public static final java.lang.String ACTION_FINANCIAL_SERVICE_INTENT = "android.service.sms.action.FINANCIAL_SERVICE_INTENT";
    public static final java.lang.String EXTRA_SMS_MSGS = "sms_messages";
    private android.service.sms.FinancialSmsService.FinancialSmsServiceWrapper mWrapper;
    private final android.os.Handler mHandler = null;
    private void getSmsMessages(android.os.RemoteCallback p0, android.os.Bundle p1) {}
    public FinancialSmsService() { super(); }
    public void onCreate() {}
    public android.os.IBinder onBind(android.content.Intent p0) { return null; }
    @android.annotation.SystemApi
    public abstract android.database.CursorWindow onGetSmsMessages(android.os.Bundle p0);

    private final class FinancialSmsServiceWrapper extends android.service.sms.IFinancialSmsService.Stub {
        private FinancialSmsServiceWrapper(android.service.sms.FinancialSmsService p0) { super(); }
        public void getSmsMessages(android.os.RemoteCallback p0, android.os.Bundle p1) throws android.os.RemoteException {}
    }
}
