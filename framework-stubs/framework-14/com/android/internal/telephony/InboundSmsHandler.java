package com.android.internal.telephony;

public abstract class InboundSmsHandler extends com.android.internal.telephony.StateMachine {
    protected static final boolean DBG = true;
    protected static final boolean VDBG = false;
    public static final int PDU_COLUMN = 0;
    public static final int SEQUENCE_COLUMN = 1;
    public static final int DESTINATION_PORT_COLUMN = 2;
    public static final int DATE_COLUMN = 3;
    public static final int REFERENCE_NUMBER_COLUMN = 4;
    public static final int COUNT_COLUMN = 5;
    public static final int ADDRESS_COLUMN = 6;
    public static final int ID_COLUMN = 7;
    public static final int MESSAGE_BODY_COLUMN = 8;
    public static final int DISPLAY_ADDRESS_COLUMN = 9;
    public static final int DELETED_FLAG_COLUMN = 10;
    public static final int SUBID_COLUMN = 11;
    public static final java.lang.String SELECT_BY_ID = "_id=?";
    public static final int EVENT_NEW_SMS = 1;
    public static final int EVENT_BROADCAST_SMS = 2;
    public static final int EVENT_BROADCAST_COMPLETE = 3;
    public static final int EVENT_START_ACCEPTING_SMS = 6;
    public static final int EVENT_INJECT_SMS = 7;
    public static final int EVENT_UPDATE_TRACKER = 8;
    public static final int EVENT_RECEIVER_TIMEOUT = 9;
    public static final int SOURCE_NOT_INJECTED = 0;
    public static final int SOURCE_INJECTED_FROM_IMS = 1;
    public static final int SOURCE_INJECTED_FROM_UNKNOWN = 2;
    public static final java.lang.String NOTIFICATION_TAG = "InboundSmsHandler";
    public static final int NOTIFICATION_ID_NEW_MESSAGE = 1;
    protected static final android.net.Uri sRawUri = null;
    protected static final android.net.Uri sRawUriPermanentDelete = null;
    protected final android.content.Context mContext = null;
    protected com.android.internal.telephony.SmsStorageMonitor mStorageMonitor;
    protected com.android.internal.telephony.Phone mPhone;
    protected com.android.internal.telephony.metrics.TelephonyMetrics mMetrics;
    android.os.PowerWhitelistManager mPowerWhitelistManager;
    protected com.android.internal.telephony.CellBroadcastServiceManager mCellBroadcastServiceManager;
    public static int sTimeoutDurationMillis;
    protected InboundSmsHandler(java.lang.String p0, android.content.Context p1, com.android.internal.telephony.SmsStorageMonitor p2, com.android.internal.telephony.Phone p3, android.os.Looper p4) { super((java.lang.String)null); }
    public void dispose() {}
    protected void onQuitting() {}
    public com.android.internal.telephony.Phone getPhone() { return null; }
    protected java.lang.String getWhatToString(int p0) { return null; }
    protected abstract int dispatchMessageRadioSpecific(com.android.internal.telephony.SmsMessageBase p0, int p1, int p2);
    protected abstract void acknowledgeLastIncomingSms(boolean p0, int p1, android.os.Message p2);
    protected abstract boolean is3gpp2();
    protected int dispatchNormalMessage(com.android.internal.telephony.SmsMessageBase p0, int p1) { return 0; }
    protected int addTrackerToRawTableAndSendMessage(com.android.internal.telephony.InboundSmsTracker p0, boolean p1) { return 0; }
    static void cancelNewMessageNotification(android.content.Context p0) {}
    public void dispatchIntent(android.content.Intent p0, java.lang.String p1, java.lang.String p2, android.os.Bundle p3, com.android.internal.telephony.InboundSmsHandler.SmsBroadcastReceiver p4, android.os.UserHandle p5, int p6) {}
    static boolean isCurrentFormat3gpp2() { return false; }
    protected void logWithLocalLog(java.lang.String p0) {}
    protected void logWithLocalLog(java.lang.String p0, long p1) {}
    protected void logeWithLocalLog(java.lang.String p0) {}
    protected void logeWithLocalLog(java.lang.String p0, long p1) {}
    protected void log(java.lang.String p0) {}
    protected void log(java.lang.String p0, long p1) {}
    protected void loge(java.lang.String p0) {}
    protected void loge(java.lang.String p0, long p1) {}
    protected void loge(java.lang.String p0, java.lang.Throwable p1) {}
    public void dump(java.io.FileDescriptor p0, java.io.PrintWriter p1, java.lang.String[] p2) {}
    public android.os.PowerManager.WakeLock getWakeLock() { return null; }
    public int getWakeLockTimeout() { return 0; }
    public void setSmsFiltersForTesting(java.util.List<com.android.internal.telephony.InboundSmsHandler.SmsFilter> p0) {}
    protected byte[] decodeHexString(java.lang.String p0) { return null; }
    static void registerNewMessageNotificationActionHandler(android.content.Context p0) {}

    private final class CarrierServicesSmsFilterCallback implements com.android.internal.telephony.CarrierServicesSmsFilter.CarrierServicesSmsFilterCallbackInterface {
        CarrierServicesSmsFilterCallback(byte[][] p0, int p1, com.android.internal.telephony.InboundSmsTracker p2, java.lang.String p3, com.android.internal.telephony.InboundSmsHandler.SmsBroadcastReceiver p4, boolean p5, boolean p6, int p7, long p8, boolean p9, java.util.List<com.android.internal.telephony.InboundSmsHandler.SmsFilter> p10) {}
        public void onFilterComplete(int p0) {}
    }

    protected abstract class CbTestBroadcastReceiver extends android.content.BroadcastReceiver {
        protected final java.lang.String mTestAction = null;
        protected abstract void handleTestAction(android.content.Intent p0);
        public CbTestBroadcastReceiver(com.android.internal.telephony.InboundSmsHandler p0, java.lang.String p1) { super(); }
        public void onReceive(android.content.Context p0, android.content.Intent p1) {}
    }

    private class DefaultState extends com.android.internal.telephony.State {
        public boolean processMessage(android.os.Message p0) { return false; }
    }

    private class DeliveringState extends com.android.internal.telephony.State {
        public void enter() {}
        public void exit() {}
        public boolean processMessage(android.os.Message p0) { return false; }
    }

    private class IdleState extends com.android.internal.telephony.State {
        public void enter() {}
        public void exit() {}
        public boolean processMessage(android.os.Message p0) { return false; }
    }

    private static class NewMessageNotificationActionReceiver extends android.content.BroadcastReceiver {
        public void onReceive(android.content.Context p0, android.content.Intent p1) {}
    }

    public final class SmsBroadcastReceiver extends android.content.BroadcastReceiver {
        public android.content.Intent mWaitingForIntent;
        public synchronized void setWaitingForIntent(android.content.Intent p0) {}
        public SmsBroadcastReceiver(com.android.internal.telephony.InboundSmsHandler p0, com.android.internal.telephony.InboundSmsTracker p1) { super(); }
        public void fakeNextAction() {}
        public void onReceive(android.content.Context p0, android.content.Intent p1) {}
    }

    public static interface SmsFilter {
        public boolean filterSms(byte[][] p0, int p1, com.android.internal.telephony.InboundSmsTracker p2, com.android.internal.telephony.InboundSmsHandler.SmsBroadcastReceiver p3, boolean p4, boolean p5, java.util.List<com.android.internal.telephony.InboundSmsHandler.SmsFilter> p6);
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface SmsSource {
    }

    private class StartupState extends com.android.internal.telephony.State {
        public void enter() {}
        public boolean processMessage(android.os.Message p0) { return false; }
    }

    private class WaitingState extends com.android.internal.telephony.State {
        public void enter() {}
        public void exit() {}
        public boolean processMessage(android.os.Message p0) { return false; }
    }
}
