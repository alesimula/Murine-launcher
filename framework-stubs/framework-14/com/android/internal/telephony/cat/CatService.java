package com.android.internal.telephony.cat;

public class CatService extends android.os.Handler implements com.android.internal.telephony.cat.AppInterface {
    protected static final int MSG_ID_SESSION_END = 1;
    protected static final int MSG_ID_PROACTIVE_COMMAND = 2;
    protected static final int MSG_ID_EVENT_NOTIFY = 3;
    protected static final int MSG_ID_CALL_SETUP = 4;
    static final int MSG_ID_REFRESH = 5;
    static final int MSG_ID_RESPONSE = 6;
    static final int MSG_ID_SIM_READY = 7;
    protected static final int MSG_ID_ICC_CHANGED = 8;
    protected static final int MSG_ID_ALPHA_NOTIFY = 9;
    static final int MSG_ID_RIL_MSG_DECODED = 10;
    static final java.lang.String STK_DEFAULT = "Default Message";
    public final android.content.BroadcastReceiver mSmsBroadcastReceiver = null;
    public static com.android.internal.telephony.cat.CatService getInstance(com.android.internal.telephony.CommandsInterface p0, android.content.Context p1, com.android.internal.telephony.uicc.UiccProfile p2, int p3) { return null; }
    public void dispose() {}
    protected void finalize() {}
    public void sendStkSms(java.lang.String p0, java.lang.String p1, int p2, com.android.internal.telephony.cat.CommandParams p3, com.android.internal.telephony.ProxyController p4) {}
    public static com.android.internal.telephony.cat.AppInterface getInstance() { return null; }
    public static com.android.internal.telephony.cat.AppInterface getInstance(int p0) { return null; }
    public void handleMessage(android.os.Message p0) {}
    public synchronized void onCmdResponse(com.android.internal.telephony.cat.CatResponseMessage p0) {}
    public void update(com.android.internal.telephony.CommandsInterface p0, android.content.Context p1, com.android.internal.telephony.uicc.UiccProfile p2) {}
    void updateIccAvailability() {}
}
