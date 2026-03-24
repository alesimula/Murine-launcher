package android.telephony;

@android.annotation.SystemApi
public class CellBroadcastIntents {
    private static final java.lang.String LOG_TAG = "CellBroadcastIntents";
    private static final java.lang.String EXTRA_MESSAGE = "message";
    public static final java.lang.String ACTION_AREA_INFO_UPDATED = "android.telephony.action.AREA_INFO_UPDATED";
    private CellBroadcastIntents() {}
    public static void sendSmsCbReceivedBroadcast(android.content.Context p0, android.os.UserHandle p1, android.telephony.SmsCbMessage p2, android.content.BroadcastReceiver p3, android.os.Handler p4, int p5, int p6) {}
    private static void putPhoneIdAndSubIdExtra(android.content.Context p0, android.content.Intent p1, int p2) {}
    private static int getSubIdForPhone(android.content.Context p0, int p1) { return 0; }
}
