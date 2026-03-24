package com.android.internal.telephony;

public abstract class SMSDispatcher extends android.os.Handler {
    static final java.lang.String TAG = "SMSDispatcher";
    static final boolean DBG = false;
    protected static final java.lang.String MAP_KEY_PDU = "pdu";
    protected static final java.lang.String MAP_KEY_SMSC = "smsc";
    protected static final java.lang.String MAP_KEY_DEST_ADDR = "destAddr";
    protected static final java.lang.String MAP_KEY_SC_ADDR = "scAddr";
    protected static final java.lang.String MAP_KEY_DEST_PORT = "destPort";
    protected static final java.lang.String MAP_KEY_DATA = "data";
    protected static final java.lang.String MAP_KEY_TEXT = "text";
    protected static final int EVENT_SEND_SMS_COMPLETE = 2;
    protected static final int EVENT_SEND_RETRY = 3;
    static final int EVENT_SEND_CONFIRMED_SMS = 5;
    static final int EVENT_STOP_SENDING = 6;
    static final int EVENT_SENDING_NOT_ALLOWED = 7;
    protected static final int EVENT_NEW_SMS_STATUS_REPORT = 10;
    protected static final int EVENT_RETRY_SMMA = 11;
    protected static final int EVENT_NEW_ICC_SMS = 14;
    protected static final int EVENT_ICC_CHANGED = 15;
    protected static final int EVENT_GET_IMS_SERVICE = 16;
    static final long ADD_MORE_SMS_SENDING_ERROR_CODES = 250017070L;
    protected com.android.internal.telephony.Phone mPhone;
    protected final android.content.Context mContext = null;
    protected final android.content.ContentResolver mResolver = null;
    protected final com.android.internal.telephony.CommandsInterface mCi = null;
    protected final android.telephony.TelephonyManager mTelephonyManager = null;
    protected final com.android.internal.telephony.LocalLog mLocalLog = null;
    protected final com.android.internal.telephony.LocalLog mSmsOutgoingErrorCodes = null;
    protected static final int MAX_SEND_RETRIES = 3;
    protected boolean mRPSmmaRetried;
    public static final int SEND_RETRY_DELAY = 2000;
    protected com.android.internal.telephony.SmsDispatchersController mSmsDispatchersController;
    protected boolean mSmsCapable;
    protected boolean mSmsSendDisabled;
    public int mCarrierMessagingTimeout;
    protected static int getNextConcatenatedRef() { return 0; }
    protected SMSDispatcher(com.android.internal.telephony.Phone p0, com.android.internal.telephony.SmsDispatchersController p1) { super(); }
    public void dispose() {}
    protected abstract java.lang.String getFormat();
    protected int getMaxSmsRetryCount() { return 0; }
    protected int getSmsRetryDelayValue() { return 0; }
    protected void handleStatusReport(java.lang.Object p0) {}
    public void handleMessage(android.os.Message p0) {}
    public int nextMessageRef() { return 0; }
    public boolean isMessageRefIncrementViaTelephony() { return false; }
    protected abstract boolean shouldBlockSmsForEcbm();
    protected void handleSendComplete(android.os.AsyncResult p0) {}
    protected static int getNotInServiceError(int p0) { return 0; }
    protected void sendData(java.lang.String p0, java.lang.String p1, java.lang.String p2, int p3, byte[] p4, android.app.PendingIntent p5, android.app.PendingIntent p6, boolean p7) {}
    public void sendText(java.lang.String p0, java.lang.String p1, java.lang.String p2, android.app.PendingIntent p3, android.app.PendingIntent p4, android.net.Uri p5, java.lang.String p6, boolean p7, int p8, boolean p9, int p10, boolean p11, long p12) {}
    public void sendText(java.lang.String p0, java.lang.String p1, java.lang.String p2, android.app.PendingIntent p3, android.app.PendingIntent p4, android.net.Uri p5, java.lang.String p6, boolean p7, int p8, boolean p9, int p10, boolean p11, long p12, boolean p13) {}
    protected abstract com.android.internal.telephony.SmsMessageBase.SubmitPduBase getSubmitPdu(java.lang.String p0, java.lang.String p1, java.lang.String p2, boolean p3, com.android.internal.telephony.SmsHeader p4, int p5, int p6);
    protected abstract com.android.internal.telephony.SmsMessageBase.SubmitPduBase getSubmitPdu(java.lang.String p0, java.lang.String p1, int p2, byte[] p3, boolean p4);
    protected abstract com.android.internal.telephony.SmsMessageBase.SubmitPduBase getSubmitPdu(java.lang.String p0, java.lang.String p1, java.lang.String p2, boolean p3, com.android.internal.telephony.SmsHeader p4, int p5, int p6, int p7);
    protected abstract com.android.internal.telephony.SmsMessageBase.SubmitPduBase getSubmitPdu(java.lang.String p0, java.lang.String p1, int p2, byte[] p3, boolean p4, int p5);
    protected abstract com.android.internal.telephony.GsmAlphabet.TextEncodingDetails calculateLength(java.lang.CharSequence p0, boolean p1);
    public void sendMultipartText(java.lang.String p0, java.lang.String p1, java.util.ArrayList<java.lang.String> p2, java.util.ArrayList<android.app.PendingIntent> p3, java.util.ArrayList<android.app.PendingIntent> p4, android.net.Uri p5, java.lang.String p6, boolean p7, int p8, boolean p9, int p10, long p11) {}
    public void sendRawPdu(com.android.internal.telephony.SMSDispatcher.SmsTracker[] p0) {}
    boolean checkDestination(com.android.internal.telephony.SMSDispatcher.SmsTracker[] p0) { return false; }
    protected void handleReachSentLimit(com.android.internal.telephony.SMSDispatcher.SmsTracker[] p0) {}
    protected void handleConfirmShortCode(boolean p0, com.android.internal.telephony.SMSDispatcher.SmsTracker[] p1) {}
    protected abstract void sendSms(com.android.internal.telephony.SMSDispatcher.SmsTracker p0);
    public void sendRetrySms(com.android.internal.telephony.SMSDispatcher.SmsTracker p0) {}
    protected com.android.internal.telephony.SMSDispatcher.SmsTracker getSmsTracker(java.lang.String p0, java.util.HashMap<java.lang.String, java.lang.Object> p1, android.app.PendingIntent p2, android.app.PendingIntent p3, java.lang.String p4, java.util.concurrent.atomic.AtomicInteger p5, java.util.concurrent.atomic.AtomicBoolean p6, android.net.Uri p7, com.android.internal.telephony.SmsHeader p8, boolean p9, java.lang.String p10, boolean p11, boolean p12, int p13, int p14, boolean p15, long p16, int p17, boolean p18) { return null; }
    protected com.android.internal.telephony.SMSDispatcher.SmsTracker getSmsTracker(java.lang.String p0, java.util.HashMap<java.lang.String, java.lang.Object> p1, android.app.PendingIntent p2, android.app.PendingIntent p3, java.lang.String p4, android.net.Uri p5, boolean p6, java.lang.String p7, boolean p8, boolean p9, boolean p10, long p11, int p12) { return null; }
    protected com.android.internal.telephony.SMSDispatcher.SmsTracker getSmsTracker(java.lang.String p0, java.util.HashMap<java.lang.String, java.lang.Object> p1, android.app.PendingIntent p2, android.app.PendingIntent p3, java.lang.String p4, android.net.Uri p5, boolean p6, java.lang.String p7, boolean p8, boolean p9, int p10, int p11, boolean p12, long p13, int p14, boolean p15) { return null; }
    protected java.util.HashMap<java.lang.String, java.lang.Object> getSmsTrackerMap(java.lang.String p0, java.lang.String p1, java.lang.String p2, com.android.internal.telephony.SmsMessageBase.SubmitPduBase p3) { return null; }
    protected java.util.HashMap<java.lang.String, java.lang.Object> getSmsTrackerMap(java.lang.String p0, java.lang.String p1, int p2, byte[] p3, com.android.internal.telephony.SmsMessageBase.SubmitPduBase p4) { return null; }
    public boolean isIms() { return false; }
    protected java.lang.String getCarrierAppPackageName() { return null; }
    protected int getSubId() { return 0; }
    protected boolean isCdmaMo() { return false; }
    public void dump(java.io.FileDescriptor p0, java.io.PrintWriter p1, java.lang.String[] p2) {}

    private final class ConfirmDialogListener implements android.content.DialogInterface.OnClickListener, android.content.DialogInterface.OnCancelListener, android.widget.CompoundButton.OnCheckedChangeListener {
        ConfirmDialogListener(com.android.internal.telephony.SMSDispatcher p0, com.android.internal.telephony.SMSDispatcher.SmsTracker[] p1, android.widget.TextView p2, int p3) {}
        void setPositiveButton(android.widget.Button p0) {}
        void setNegativeButton(android.widget.Button p0) {}
        public void onClick(android.content.DialogInterface p0, int p1) {}
        public void onCancel(android.content.DialogInterface p0) {}
        public void onCheckedChanged(android.widget.CompoundButton p0, boolean p1) {}
    }

    protected final class DataSmsSender extends com.android.internal.telephony.SMSDispatcher.SmsSender {
        public DataSmsSender(com.android.internal.telephony.SMSDispatcher p0, com.android.internal.telephony.SMSDispatcher.SmsTracker p1) { super(null); }
        public synchronized void onServiceReady() {}
        public void onSendComplete(int p0) {}
        public com.android.internal.telephony.SMSDispatcher.SmsTracker getSmsTracker() { return null; }
        public com.android.internal.telephony.SMSDispatcher.SmsTracker[] getSmsTrackers() { return null; }
    }

    private final class MultipartSmsSender extends com.android.internal.telephony.SMSDispatcher.SmsSender {
        public final com.android.internal.telephony.SMSDispatcher.SmsTracker[] mTrackers = null;
        MultipartSmsSender(java.util.ArrayList<java.lang.String> p0, com.android.internal.telephony.SMSDispatcher.SmsTracker[] p1) { super(null); }
        void sendSmsByCarrierApp(java.lang.String p0, com.android.internal.telephony.SMSDispatcher.SmsSenderCallback p1) {}
        public synchronized void onServiceReady() {}
        public void onSendComplete(int p0) {}
        public com.android.internal.telephony.SMSDispatcher.SmsTracker getSmsTracker() { return null; }
        public com.android.internal.telephony.SMSDispatcher.SmsTracker[] getSmsTrackers() { return null; }
    }

    private static class SettingsObserver extends android.database.ContentObserver {
        SettingsObserver(android.os.Handler p0, java.util.concurrent.atomic.AtomicInteger p1, android.content.Context p2) { super(null); }
        public void onChange(boolean p0) {}
    }

    protected abstract class SmsSender extends android.os.Handler {
        protected volatile android.service.carrier.CarrierMessagingServiceWrapper.CarrierMessagingCallback mSenderCallback;
        protected final android.service.carrier.CarrierMessagingServiceWrapper mCarrierMessagingServiceWrapper = null;
        protected SmsSender(com.android.internal.telephony.SMSDispatcher p0) { super(); }
        public synchronized void sendSmsByCarrierApp(java.lang.String p0, android.service.carrier.CarrierMessagingServiceWrapper.CarrierMessagingCallback p1) {}
        public abstract void onServiceReady();
        public abstract void onSendComplete(int p0);
        public abstract com.android.internal.telephony.SMSDispatcher.SmsTracker getSmsTracker();
        public abstract com.android.internal.telephony.SMSDispatcher.SmsTracker[] getSmsTrackers();
        public void handleMessage(android.os.Message p0) {}
        public void removeTimeout() {}
    }

    protected final class SmsSenderCallback implements android.service.carrier.CarrierMessagingServiceWrapper.CarrierMessagingCallback {
        public SmsSenderCallback(com.android.internal.telephony.SMSDispatcher p0, com.android.internal.telephony.SMSDispatcher.SmsSender p1) {}
        public void onSendSmsComplete(int p0, int p1) {}
        public void onSendMultipartSmsComplete(int p0, int[] p1) {}
        public void onReceiveSmsComplete(int p0) {}
        public void onSendMmsComplete(int p0, byte[] p1) {}
        public void onDownloadMmsComplete(int p0) {}
    }

    public static class SmsTracker {
        public int mRetryCount;
        public int mImsRetry;
        public boolean mUsesImsServiceForIms;
        public int mMessageRef;
        public boolean mExpectMore;
        public int mValidityPeriod;
        public int mPriority;
        java.lang.String mFormat;
        public final android.app.PendingIntent mSentIntent = null;
        public final android.app.PendingIntent mDeliveryIntent = null;
        public final android.content.pm.PackageInfo mAppInfo = null;
        public final java.lang.String mDestAddress = null;
        public final com.android.internal.telephony.SmsHeader mSmsHeader = null;
        public android.net.Uri mMessageUri;
        public final long mMessageId = 0L;
        public java.util.HashMap<java.lang.String, java.lang.Object> getData() { return null; }
        public java.lang.String getAppPackageName() { return null; }
        public android.content.pm.ApplicationInfo getAppInfo() { return null; }
        public boolean isFromDefaultSmsApplication(android.content.Context p0) { return false; }
        public void updateSentMessageStatus(android.content.Context p0, int p1) {}
        protected long getInterval() { return 0L; }
        public void onFailed(android.content.Context p0, int p1, int p2) {}
        public void onSent(android.content.Context p0) {}
    }

    protected final class TextSmsSender extends com.android.internal.telephony.SMSDispatcher.SmsSender {
        public TextSmsSender(com.android.internal.telephony.SMSDispatcher p0, com.android.internal.telephony.SMSDispatcher.SmsTracker p1) { super(null); }
        public synchronized void onServiceReady() {}
        public void onSendComplete(int p0) {}
        public com.android.internal.telephony.SMSDispatcher.SmsTracker getSmsTracker() { return null; }
        public com.android.internal.telephony.SMSDispatcher.SmsTracker[] getSmsTrackers() { return null; }
    }
}
