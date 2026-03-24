package android.telephony.gsm;

@java.lang.Deprecated
public final class SmsManager {
    @java.lang.Deprecated
    public static final int STATUS_ON_SIM_FREE = 0;
    @java.lang.Deprecated
    public static final int STATUS_ON_SIM_READ = 1;
    @java.lang.Deprecated
    public static final int STATUS_ON_SIM_UNREAD = 3;
    @java.lang.Deprecated
    public static final int STATUS_ON_SIM_SENT = 5;
    @java.lang.Deprecated
    public static final int STATUS_ON_SIM_UNSENT = 7;
    @java.lang.Deprecated
    public static final int RESULT_ERROR_GENERIC_FAILURE = 1;
    @java.lang.Deprecated
    public static final int RESULT_ERROR_RADIO_OFF = 2;
    @java.lang.Deprecated
    public static final int RESULT_ERROR_NULL_PDU = 3;
    @java.lang.Deprecated
    public static final int RESULT_ERROR_NO_SERVICE = 4;
    @java.lang.Deprecated
    public static final android.telephony.gsm.SmsManager getDefault() { return null; }
    @java.lang.Deprecated
    public final void sendTextMessage(java.lang.String p0, java.lang.String p1, java.lang.String p2, android.app.PendingIntent p3, android.app.PendingIntent p4) {}
    @java.lang.Deprecated
    public final java.util.ArrayList<java.lang.String> divideMessage(java.lang.String p0) { return null; }
    @java.lang.Deprecated
    public final void sendMultipartTextMessage(java.lang.String p0, java.lang.String p1, java.util.ArrayList<java.lang.String> p2, java.util.ArrayList<android.app.PendingIntent> p3, java.util.ArrayList<android.app.PendingIntent> p4) {}
    @java.lang.Deprecated
    public final void sendDataMessage(java.lang.String p0, java.lang.String p1, short p2, byte[] p3, android.app.PendingIntent p4, android.app.PendingIntent p5) {}
    @java.lang.Deprecated
    public final boolean copyMessageToSim(byte[] p0, byte[] p1, int p2) { return false; }
    @java.lang.Deprecated
    public final boolean deleteMessageFromSim(int p0) { return false; }
    @java.lang.Deprecated
    public final boolean updateMessageOnSim(int p0, int p1, byte[] p2) { return false; }
    @java.lang.Deprecated
    public final java.util.ArrayList<android.telephony.SmsMessage> getAllMessagesFromSim() { return null; }
}
