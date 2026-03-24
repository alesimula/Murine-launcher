package com.android.internal.telephony.cdma;

public class CdmaInboundSmsHandler extends com.android.internal.telephony.InboundSmsHandler {
    CdmaInboundSmsHandler() { super(null, null, null, null, null); }
    protected void onQuitting() {}
    public static com.android.internal.telephony.cdma.CdmaInboundSmsHandler makeInboundSmsHandler(android.content.Context p0, com.android.internal.telephony.SmsStorageMonitor p1, com.android.internal.telephony.Phone p2, com.android.internal.telephony.cdma.CdmaSMSDispatcher p3, android.os.Looper p4) { return null; }
    protected boolean is3gpp2() { return false; }
    protected int dispatchMessageRadioSpecific(com.android.internal.telephony.SmsMessageBase p0, int p1, int p2) { return 0; }
    protected void acknowledgeLastIncomingSms(boolean p0, int p1, android.os.Message p2) {}

    private class CdmaCbTestBroadcastReceiver extends com.android.internal.telephony.InboundSmsHandler.CbTestBroadcastReceiver {
        CdmaCbTestBroadcastReceiver(com.android.internal.telephony.cdma.CdmaInboundSmsHandler p0) { super(null, null); }
        protected void handleTestAction(android.content.Intent p0) {}
    }

    private class CdmaScpTestBroadcastReceiver extends com.android.internal.telephony.InboundSmsHandler.CbTestBroadcastReceiver {
        CdmaScpTestBroadcastReceiver(com.android.internal.telephony.cdma.CdmaInboundSmsHandler p0) { super(null, null); }
        protected void handleTestAction(android.content.Intent p0) {}
    }
}
