package android.telephony.ims.stub;

@android.annotation.SystemApi
public class ImsSmsImplBase {
    private static final java.lang.String LOG_TAG = "SmsImplBase";
    public static final int SEND_STATUS_OK = 1;
    public static final int SEND_STATUS_ERROR = 2;
    public static final int SEND_STATUS_ERROR_RETRY = 3;
    public static final int SEND_STATUS_ERROR_FALLBACK = 4;
    public static final int DELIVER_STATUS_OK = 1;
    public static final int DELIVER_STATUS_ERROR_GENERIC = 2;
    public static final int DELIVER_STATUS_ERROR_NO_MEMORY = 3;
    public static final int DELIVER_STATUS_ERROR_REQUEST_NOT_SUPPORTED = 4;
    public static final int STATUS_REPORT_STATUS_OK = 1;
    public static final int STATUS_REPORT_STATUS_ERROR = 2;
    private final java.lang.Object mLock = null;
    private android.telephony.ims.aidl.IImsSmsListener mListener;
    public ImsSmsImplBase() {}
    public final void registerSmsListener(android.telephony.ims.aidl.IImsSmsListener p0) {}
    public void sendSms(int p0, int p1, java.lang.String p2, java.lang.String p3, boolean p4, byte[] p5) {}
    public void acknowledgeSms(int p0, int p1, int p2) {}
    public void acknowledgeSmsReport(int p0, int p1, int p2) {}
    public final void onSmsReceived(int p0, java.lang.String p1, byte[] p2) throws java.lang.RuntimeException {}
    public final void onSendSmsResult(int p0, int p1, int p2, int p3) throws java.lang.RuntimeException {}
    public final void onSmsStatusReportReceived(int p0, int p1, java.lang.String p2, byte[] p3) throws java.lang.RuntimeException {}
    public java.lang.String getSmsFormat() { return null; }
    public void onReady() {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface StatusReportResult {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface SendStatusResult {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface DeliverStatusResult {
    }
}
