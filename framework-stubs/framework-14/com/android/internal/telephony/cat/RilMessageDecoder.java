package com.android.internal.telephony.cat;

public class RilMessageDecoder extends com.android.internal.telephony.StateMachine {
    RilMessageDecoder() { super((java.lang.String)null); }
    public static synchronized com.android.internal.telephony.cat.RilMessageDecoder getInstance(android.os.Handler p0, com.android.internal.telephony.uicc.IccFileHandler p1, android.content.Context p2, int p3) { return null; }
    public void sendStartDecodingMessageParams(com.android.internal.telephony.cat.RilMessage p0) {}
    public void sendMsgParamsDecoded(com.android.internal.telephony.cat.ResultCode p0, com.android.internal.telephony.cat.CommandParams p1) {}
    public void dispose() {}

    private class StateCmdParamsReady extends com.android.internal.telephony.State {
        public boolean processMessage(android.os.Message p0) { return false; }
    }

    private class StateStart extends com.android.internal.telephony.State {
        public boolean processMessage(android.os.Message p0) { return false; }
    }
}
