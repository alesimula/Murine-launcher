package com.android.internal.telephony.gsm;

public class GsmInboundSmsHandler extends com.android.internal.telephony.InboundSmsHandler {
    GsmInboundSmsHandler() { super(null, null, null, null, null); }
    protected void onQuitting() {}
    public static com.android.internal.telephony.gsm.GsmInboundSmsHandler makeInboundSmsHandler(android.content.Context p0, com.android.internal.telephony.SmsStorageMonitor p1, com.android.internal.telephony.Phone p2, android.os.Looper p3) { return null; }
    protected boolean is3gpp2() { return false; }
    protected int dispatchMessageRadioSpecific(com.android.internal.telephony.SmsMessageBase p0, int p1, int p2) { return 0; }
    protected void acknowledgeLastIncomingSms(boolean p0, int p1, android.os.Message p2) {}
    public boolean setImsManager(com.android.ims.ImsManager p0) { return false; }

    private class GsmCbTestBroadcastReceiver extends com.android.internal.telephony.InboundSmsHandler.CbTestBroadcastReceiver {
        GsmCbTestBroadcastReceiver(com.android.internal.telephony.gsm.GsmInboundSmsHandler p0) { super(null, null); }
        protected void handleTestAction(android.content.Intent p0) {}
    }
}
