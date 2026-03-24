package com.android.internal.telephony;

public abstract class CallTracker extends android.os.Handler {
    static final int POLL_DELAY_MSEC = 250;
    protected int mPendingOperations;
    protected boolean mNeedsPoll;
    protected android.os.Message mLastRelevantPoll;
    protected java.util.ArrayList<com.android.internal.telephony.Connection> mHandoverConnections;
    public com.android.internal.telephony.CommandsInterface mCi;
    protected boolean mNumberConverted;
    protected static final int EVENT_POLL_CALLS_RESULT = 1;
    protected static final int EVENT_CALL_STATE_CHANGE = 2;
    protected static final int EVENT_REPOLL_AFTER_DELAY = 3;
    protected static final int EVENT_OPERATION_COMPLETE = 4;
    protected static final int EVENT_GET_LAST_CALL_FAIL_CAUSE = 5;
    protected static final int EVENT_SWITCH_RESULT = 8;
    protected static final int EVENT_RADIO_AVAILABLE = 9;
    protected static final int EVENT_RADIO_NOT_AVAILABLE = 10;
    protected static final int EVENT_CONFERENCE_RESULT = 11;
    protected static final int EVENT_SEPARATE_RESULT = 12;
    protected static final int EVENT_ECT_RESULT = 13;
    protected static final int EVENT_EXIT_ECM_RESPONSE_CDMA = 14;
    protected static final int EVENT_CALL_WAITING_INFO_CDMA = 15;
    protected static final int EVENT_THREE_WAY_DIAL_L2_RESULT_CDMA = 16;
    protected static final int EVENT_THREE_WAY_DIAL_BLANK_FLASH = 20;
    public CallTracker() { super(); }
    protected void pollCallsWhenSafe() {}
    protected void pollCallsAfterDelay() {}
    protected boolean isCommandExceptionRadioNotAvailable(java.lang.Throwable p0) { return false; }
    protected abstract void handlePollCalls(android.os.AsyncResult p0);
    protected abstract com.android.internal.telephony.Phone getPhone();
    protected com.android.internal.telephony.Connection getHoConnection(com.android.internal.telephony.DriverCall p0) { return null; }
    protected void notifySrvccState(com.android.internal.telephony.Call.SrvccState p0, java.util.ArrayList<com.android.internal.telephony.Connection> p1) {}
    protected void handleRadioAvailable() {}
    protected android.os.Message obtainNoPollCompleteMessage(int p0) { return null; }
    protected java.lang.String convertNumberIfNecessary(com.android.internal.telephony.Phone p0, java.lang.String p1) { return null; }
    public com.android.internal.telephony.Connection getRingingHandoverConnection() { return null; }
    public abstract void handleMessage(android.os.Message p0);
    public abstract void registerForVoiceCallStarted(android.os.Handler p0, int p1, java.lang.Object p2);
    public abstract void unregisterForVoiceCallStarted(android.os.Handler p0);
    public abstract void registerForVoiceCallEnded(android.os.Handler p0, int p1, java.lang.Object p2);
    public abstract void unregisterForVoiceCallEnded(android.os.Handler p0);
    public abstract com.android.internal.telephony.PhoneConstants.State getState();
    protected abstract void log(java.lang.String p0);
    public void cleanupCalls() {}
    public void dump(java.io.FileDescriptor p0, java.io.PrintWriter p1, java.lang.String[] p2) {}
}
