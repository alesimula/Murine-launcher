package android.telephony;

public abstract class VisualVoicemailService extends android.app.Service {
    public static final java.lang.String SERVICE_INTERFACE = "android.telephony.VisualVoicemailService";
    public static final int MSG_ON_CELL_SERVICE_CONNECTED = 1;
    public static final int MSG_ON_SMS_RECEIVED = 2;
    public static final int MSG_ON_SIM_REMOVED = 3;
    public static final int MSG_TASK_ENDED = 4;
    public static final int MSG_TASK_STOPPED = 5;
    public static final java.lang.String DATA_PHONE_ACCOUNT_HANDLE = "data_phone_account_handle";
    public static final java.lang.String DATA_SMS = "data_sms";
    public VisualVoicemailService() { super(); }
    public android.os.IBinder onBind(android.content.Intent p0) { return null; }
    public abstract void onCellServiceConnected(android.telephony.VisualVoicemailService.VisualVoicemailTask p0, android.telecom.PhoneAccountHandle p1);
    public abstract void onSmsReceived(android.telephony.VisualVoicemailService.VisualVoicemailTask p0, android.telephony.VisualVoicemailSms p1);
    public abstract void onSimRemoved(android.telephony.VisualVoicemailService.VisualVoicemailTask p0, android.telecom.PhoneAccountHandle p1);
    public abstract void onStopped(android.telephony.VisualVoicemailService.VisualVoicemailTask p0);
    @android.annotation.SystemApi
    public static final void setSmsFilterSettings(android.content.Context p0, android.telecom.PhoneAccountHandle p1, android.telephony.VisualVoicemailSmsFilterSettings p2) {}
    @android.annotation.SystemApi
    public static final void sendVisualVoicemailSms(android.content.Context p0, android.telecom.PhoneAccountHandle p1, java.lang.String p2, short p3, java.lang.String p4, android.app.PendingIntent p5) {}

    public static class VisualVoicemailTask {
        public final void finish() {}
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
    }
}
