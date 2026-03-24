package com.android.internal.telephony;

public abstract class WakeLockStateMachine extends com.android.internal.telephony.StateMachine {
    protected static final boolean DBG = Boolean.valueOf(false);
    public static final int EVENT_NEW_SMS_MESSAGE = 1;
    protected static final int EVENT_BROADCAST_COMPLETE = 2;
    static final int EVENT_RELEASE_WAKE_LOCK = 3;
    static final int EVENT_BROADCAST_NOT_REQUIRED = 4;
    protected com.android.internal.telephony.Phone mPhone;
    protected android.content.Context mContext;
    protected java.util.concurrent.atomic.AtomicInteger mReceiverCount;
    protected final android.content.BroadcastReceiver mReceiver = null;
    protected WakeLockStateMachine(java.lang.String p0, android.content.Context p1, com.android.internal.telephony.Phone p2) { super((java.lang.String)null); }
    public final void dispose() {}
    protected void onQuitting() {}
    public final void dispatchSmsMessage(java.lang.Object p0) {}
    protected abstract boolean handleSmsMessage(android.os.Message p0);
    protected void log(java.lang.String p0) {}
    protected void loge(java.lang.String p0) {}
    protected void loge(java.lang.String p0, java.lang.Throwable p1) {}

    class DefaultState extends com.android.internal.telephony.State {
        DefaultState(com.android.internal.telephony.WakeLockStateMachine p0) { super(); }
        public boolean processMessage(android.os.Message p0) { return false; }
    }

    class IdleState extends com.android.internal.telephony.State {
        IdleState(com.android.internal.telephony.WakeLockStateMachine p0) { super(); }
        public void enter() {}
        public void exit() {}
        public boolean processMessage(android.os.Message p0) { return false; }
    }

    class WaitingState extends com.android.internal.telephony.State {
        WaitingState(com.android.internal.telephony.WakeLockStateMachine p0) { super(); }
        public boolean processMessage(android.os.Message p0) { return false; }
    }
}
