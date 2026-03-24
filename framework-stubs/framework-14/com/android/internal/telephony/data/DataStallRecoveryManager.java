package com.android.internal.telephony.data;

public class DataStallRecoveryManager extends android.os.Handler {
    public static final int RECOVERY_ACTION_GET_DATA_CALL_LIST = 0;
    public static final int RECOVERY_ACTION_CLEANUP = 1;
    @java.lang.Deprecated
    public static final int RECOVERY_ACTION_REREGISTER = 2;
    public static final int RECOVERY_ACTION_RADIO_RESTART = 3;
    public static final int RECOVERY_ACTION_RESET_MODEM = 4;
    public long mDataStallStartMs;
    public DataStallRecoveryManager(com.android.internal.telephony.Phone p0, com.android.internal.telephony.data.DataNetworkController p1, com.android.internal.telephony.data.DataServiceManager p2, android.os.Looper p3, com.android.internal.telephony.data.DataStallRecoveryManager.DataStallRecoveryManagerCallback p4) { super(); }
    public void handleMessage(android.os.Message p0) {}
    public int getRecoveryAction() { return 0; }
    public void setRecoveryAction(int p0) {}
    public void dump(java.io.FileDescriptor p0, java.io.PrintWriter p1, java.lang.String[] p2) {}

    public static abstract class DataStallRecoveryManagerCallback extends com.android.internal.telephony.data.DataCallback {
        public DataStallRecoveryManagerCallback(java.util.concurrent.Executor p0) { super(null); }
        public abstract void onDataStallReestablishInternet();
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface RecoveredReason {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface RecoveryAction {
    }
}
