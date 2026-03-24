package com.android.internal.telephony;

public class CallWaitingController extends android.os.Handler {
    public static final java.lang.String LOG_TAG = "CallWaitingCtrl";
    public static final int TERMINAL_BASED_NOT_SUPPORTED = -1;
    public static final int TERMINAL_BASED_NOT_ACTIVATED = 0;
    public static final int TERMINAL_BASED_ACTIVATED = 1;
    public static final java.lang.String PREFERENCE_TBCW = "terminal_based_call_waiting";
    public static final java.lang.String KEY_SUB_ID = "subId";
    public static final java.lang.String KEY_STATE = "state";
    public static final java.lang.String KEY_CS_SYNC = "cs_sync";
    public CallWaitingController(com.android.internal.telephony.GsmCdmaPhone p0) { super(); }
    public synchronized int getTerminalBasedCallWaitingState(boolean p0) { return 0; }
    public synchronized boolean getCallWaiting(android.os.Message p0) { return false; }
    public synchronized boolean setCallWaiting(boolean p0, int p1, android.os.Message p2) { return false; }
    public void handleMessage(android.os.Message p0) {}
    public boolean updateCarrierConfig(int p0, boolean p1) { return false; }
    public boolean getSyncState() { return false; }
    public synchronized void setImsRegistrationState(boolean p0) {}
    public synchronized void setTerminalBasedCallWaitingSupported(boolean p0) {}
    public void notifyRegisteredToNetwork() {}
    public void dump(java.io.PrintWriter p0) {}

    private static class Cw {
        final boolean mEnable = false;
        final android.os.Message mOnComplete = null;
        final boolean mImsRegistered = false;
        Cw(boolean p0, boolean p1, android.os.Message p2) {}
    }
}
