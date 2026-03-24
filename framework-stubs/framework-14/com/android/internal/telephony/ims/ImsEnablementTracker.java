package com.android.internal.telephony.ims;

public class ImsEnablementTracker {
    public static final int COMMAND_ENABLE_MSG = 1;
    public static final int COMMAND_DISABLE_MSG = 2;
    public static final int COMMAND_RESETTING_DONE = 6;
    public static final int COMMAND_POST_RESETTING_DONE = 10;
    protected static final int STATE_IMS_DISCONNECTED = 0;
    protected static final int STATE_IMS_DEFAULT = 1;
    protected static final int STATE_IMS_ENABLED = 2;
    protected static final int STATE_IMS_DISABLING = 3;
    protected static final int STATE_IMS_DISABLED = 4;
    protected static final int STATE_IMS_ENABLING = 5;
    protected static final int STATE_IMS_RESETTING = 6;
    protected static final int STATE_IMS_POSTRESETTING = 7;
    protected final java.lang.Object mLock = null;
    public ImsEnablementTracker(android.os.Looper p0, android.content.ComponentName p1) {}
    public ImsEnablementTracker(android.os.Looper p0, android.telephony.ims.aidl.IImsServiceController p1, int p2, int p3) {}
    public void setNumOfSlots(int p0) {}
    public android.os.Handler getHandler(int p0) { return null; }
    public boolean isState(int p0, int p1) { return false; }
    public void subIdChangedToInvalid(int p0) {}
    public void enableIms(int p0, int p1) {}
    public void disableIms(int p0, int p1) {}
    public void resetIms(int p0, int p1) {}
    protected void setServiceController(android.os.IBinder p0) {}
    protected long getLastOperationTimeMillis() { return 0L; }
    public long getRemainThrottleTime() { return 0L; }

    class ImsEnablementTrackerStateMachine extends com.android.internal.telephony.StateMachine {
        public final com.android.internal.telephony.ims.ImsEnablementTracker.ImsEnablementTrackerStateMachine.Default mDefault = null;
        public final com.android.internal.telephony.ims.ImsEnablementTracker.ImsEnablementTrackerStateMachine.Enabled mEnabled = null;
        public final com.android.internal.telephony.ims.ImsEnablementTracker.ImsEnablementTrackerStateMachine.Disabling mDisabling = null;
        public final com.android.internal.telephony.ims.ImsEnablementTracker.ImsEnablementTrackerStateMachine.Disabled mDisabled = null;
        public final com.android.internal.telephony.ims.ImsEnablementTracker.ImsEnablementTrackerStateMachine.Enabling mEnabling = null;
        public final com.android.internal.telephony.ims.ImsEnablementTracker.ImsEnablementTrackerStateMachine.Resetting mResetting = null;
        public final com.android.internal.telephony.ims.ImsEnablementTracker.ImsEnablementTrackerStateMachine.PostResetting mPostResetting = null;
        ImsEnablementTrackerStateMachine(com.android.internal.telephony.ims.ImsEnablementTracker p0, java.lang.String p1, android.os.Looper p2, int p3, int p4) { super((java.lang.String)null); }
        public void clearAllMessage() {}
        public void serviceBinderConnected() {}
        public void serviceBinderDisconnected() {}
        public boolean isState(int p0) { return false; }

        class Default extends com.android.internal.telephony.State {
            Default(com.android.internal.telephony.ims.ImsEnablementTracker.ImsEnablementTrackerStateMachine p0) { super(); }
            public void enter() {}
            public boolean processMessage(android.os.Message p0) { return false; }
        }

        class Disabled extends com.android.internal.telephony.State {
            Disabled(com.android.internal.telephony.ims.ImsEnablementTracker.ImsEnablementTrackerStateMachine p0) { super(); }
            public void enter() {}
            public boolean processMessage(android.os.Message p0) { return false; }
        }

        class Disabling extends com.android.internal.telephony.State {
            Disabling(com.android.internal.telephony.ims.ImsEnablementTracker.ImsEnablementTrackerStateMachine p0) { super(); }
            public void enter() {}
            public boolean processMessage(android.os.Message p0) { return false; }
        }

        class Disconnected extends com.android.internal.telephony.State {
            Disconnected(com.android.internal.telephony.ims.ImsEnablementTracker.ImsEnablementTrackerStateMachine p0) { super(); }
            public void enter() {}
            public boolean processMessage(android.os.Message p0) { return false; }
        }

        class Enabled extends com.android.internal.telephony.State {
            Enabled(com.android.internal.telephony.ims.ImsEnablementTracker.ImsEnablementTrackerStateMachine p0) { super(); }
            public void enter() {}
            public boolean processMessage(android.os.Message p0) { return false; }
        }

        class Enabling extends com.android.internal.telephony.State {
            Enabling(com.android.internal.telephony.ims.ImsEnablementTracker.ImsEnablementTrackerStateMachine p0) { super(); }
            public void enter() {}
            public boolean processMessage(android.os.Message p0) { return false; }
        }

        class PostResetting extends com.android.internal.telephony.State {
            PostResetting(com.android.internal.telephony.ims.ImsEnablementTracker.ImsEnablementTrackerStateMachine p0) { super(); }
            public void enter() {}
            public void exit() {}
            public boolean processMessage(android.os.Message p0) { return false; }
        }

        class Resetting extends com.android.internal.telephony.State {
            Resetting(com.android.internal.telephony.ims.ImsEnablementTracker.ImsEnablementTrackerStateMachine p0) { super(); }
            public void enter() {}
            public boolean processMessage(android.os.Message p0) { return false; }
        }
    }
}
