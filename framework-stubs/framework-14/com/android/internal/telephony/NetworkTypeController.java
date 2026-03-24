package com.android.internal.telephony;

public class NetworkTypeController extends com.android.internal.telephony.StateMachine {
    public static final int EVENT_UPDATE = 0;
    public NetworkTypeController(com.android.internal.telephony.Phone p0, com.android.internal.telephony.DisplayInfoController p1) { super((java.lang.String)null); }
    public int getOverrideNetworkType() { return 0; }
    public int getDataNetworkType() { return 0; }
    public boolean areAnyTimersActive() { return false; }
    protected void log(java.lang.String p0) {}
    protected void loge(java.lang.String p0) {}
    public java.lang.String toString() { return null; }
    public void dump(java.io.FileDescriptor p0, java.io.PrintWriter p1, java.lang.String[] p2) {}

    private final class DefaultState extends com.android.internal.telephony.State {
        public boolean processMessage(android.os.Message p0) { return false; }
    }

    private final class IdleState extends com.android.internal.telephony.State {
        public void enter() {}
        public boolean processMessage(android.os.Message p0) { return false; }
        public java.lang.String getName() { return null; }
    }

    private final class LegacyState extends com.android.internal.telephony.State {
        public void enter() {}
        public boolean processMessage(android.os.Message p0) { return false; }
        public java.lang.String getName() { return null; }
    }

    private final class LteConnectedState extends com.android.internal.telephony.State {
        public void enter() {}
        public boolean processMessage(android.os.Message p0) { return false; }
        public java.lang.String getName() { return null; }
    }

    private final class NrConnectedAdvancedState extends com.android.internal.telephony.State {
        public void enter() {}
        public boolean processMessage(android.os.Message p0) { return false; }
        public java.lang.String getName() { return null; }
    }

    private final class NrConnectedState extends com.android.internal.telephony.State {
        public void enter() {}
        public boolean processMessage(android.os.Message p0) { return false; }
        public java.lang.String getName() { return null; }
    }

    private static class OverrideTimerRule {
        final java.lang.String mState = null;
        final int mOverrideType = 0;
        final java.util.Map<java.lang.String, java.lang.Integer> mPrimaryTimers = null;
        final java.util.Map<java.lang.String, java.lang.Integer> mSecondaryTimers = null;
        OverrideTimerRule(java.lang.String p0, int p1) {}
        public void addTimer(java.lang.String p0, int p1) {}
        public void addSecondaryTimer(java.lang.String p0, int p1) {}
        public int getTimer(java.lang.String p0) { return 0; }
        public int getSecondaryTimer(java.lang.String p0) { return 0; }
        public java.lang.String toString() { return null; }
    }
}
