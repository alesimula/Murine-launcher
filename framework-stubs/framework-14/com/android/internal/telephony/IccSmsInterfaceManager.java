package com.android.internal.telephony;

public class IccSmsInterfaceManager {
    static final java.lang.String LOG_TAG = "IccSmsInterfaceManager";
    static final boolean DBG = true;
    protected static final int EVENT_SET_BROADCAST_ACTIVATION_DONE = 3;
    protected static final int EVENT_SET_BROADCAST_CONFIG_DONE = 4;
    public static final int SMS_MESSAGE_PRIORITY_NOT_SPECIFIED = -1;
    public static final int SMS_MESSAGE_PERIOD_NOT_SPECIFIED = -1;
    protected com.android.internal.telephony.Phone mPhone;
    protected final android.content.Context mContext = null;
    protected final android.app.AppOpsManager mAppOps = null;
    public com.android.internal.telephony.SmsDispatchersController mDispatchersController;
    protected android.os.Handler mHandler;
    protected IccSmsInterfaceManager(com.android.internal.telephony.Phone p0) {}
    public IccSmsInterfaceManager(com.android.internal.telephony.Phone p0, android.content.Context p1, android.app.AppOpsManager p2, com.android.internal.telephony.SmsDispatchersController p3, com.android.internal.telephony.SmsPermissions p4) {}
    public void setPhoneFactoryProxy(com.android.internal.telephony.IccSmsInterfaceManager.PhoneFactoryProxy p0) {}
    protected void markMessagesAsRead(java.util.ArrayList<byte[]> p0) {}
    protected void enforceReceiveAndSend(java.lang.String p0) {}
    public boolean updateMessageOnIccEf(java.lang.String p0, int p1, int p2, byte[] p3) { return false; }
    public boolean copyMessageToIccEf(java.lang.String p0, int p1, byte[] p2, byte[] p3) { return false; }
    public java.util.List<com.android.internal.telephony.SmsRawData> getAllMessagesFromIccEf(java.lang.String p0) { return null; }
    public void sendDataWithSelfPermissions(java.lang.String p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, int p4, byte[] p5, android.app.PendingIntent p6, android.app.PendingIntent p7, boolean p8) {}
    @java.lang.Deprecated
    public void sendData(java.lang.String p0, java.lang.String p1, java.lang.String p2, int p3, byte[] p4, android.app.PendingIntent p5, android.app.PendingIntent p6) {}
    public void sendData(java.lang.String p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, int p4, byte[] p5, android.app.PendingIntent p6, android.app.PendingIntent p7) {}
    public void sendText(java.lang.String p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, android.app.PendingIntent p4, android.app.PendingIntent p5, boolean p6, long p7, boolean p8) {}
    public void sendTextWithSelfPermissions(java.lang.String p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, java.lang.String p4, android.app.PendingIntent p5, android.app.PendingIntent p6, boolean p7, boolean p8) {}
    public void sendTextWithOptions(java.lang.String p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, java.lang.String p4, android.app.PendingIntent p5, android.app.PendingIntent p6, boolean p7, int p8, boolean p9, int p10) {}
    public void injectSmsPdu(byte[] p0, java.lang.String p1, android.app.PendingIntent p2) {}
    public void sendMultipartText(java.lang.String p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, java.util.List<java.lang.String> p4, java.util.List<android.app.PendingIntent> p5, java.util.List<android.app.PendingIntent> p6, boolean p7, long p8) {}
    public void sendMultipartTextWithOptions(java.lang.String p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, java.util.List<java.lang.String> p4, java.util.List<android.app.PendingIntent> p5, java.util.List<android.app.PendingIntent> p6, boolean p7, int p8, boolean p9, int p10, long p11) {}
    public int getPremiumSmsPermission(java.lang.String p0) { return 0; }
    public void setPremiumSmsPermission(java.lang.String p0, int p1) {}
    protected java.util.ArrayList<com.android.internal.telephony.SmsRawData> buildValidRawData(java.util.ArrayList<byte[]> p0) { return null; }
    protected byte[] makeSmsRecordData(int p0, byte[] p1) { return null; }
    public java.lang.String getSmscAddressFromIccEf(java.lang.String p0) { return null; }
    public boolean setSmscAddressOnIccEf(java.lang.String p0, java.lang.String p1) { return false; }
    public boolean enableCellBroadcast(int p0, int p1) { return false; }
    public boolean disableCellBroadcast(int p0, int p1) { return false; }
    public boolean enableCellBroadcastRange(int p0, int p1, int p2) { return false; }
    public boolean disableCellBroadcastRange(int p0, int p1, int p2) { return false; }
    public synchronized boolean enableGsmBroadcastRange(int p0, int p1) { return false; }
    public synchronized boolean disableGsmBroadcastRange(int p0, int p1) { return false; }
    public synchronized boolean enableCdmaBroadcastRange(int p0, int p1) { return false; }
    public synchronized boolean disableCdmaBroadcastRange(int p0, int p1) { return false; }
    @android.annotation.RequiresPermission("android.permission.MODIFY_CELL_BROADCASTS")
    public void resetAllCellBroadcastRanges() {}
    protected void log(java.lang.String p0) {}
    protected void loge(java.lang.String p0) {}
    protected void loge(java.lang.String p0, java.lang.Throwable p1) {}
    public boolean isImsSmsSupported() { return false; }
    public java.lang.String getImsSmsFormat() { return null; }
    @java.lang.Deprecated
    public void sendStoredText(java.lang.String p0, android.net.Uri p1, java.lang.String p2, android.app.PendingIntent p3, android.app.PendingIntent p4) {}
    public void sendStoredText(java.lang.String p0, java.lang.String p1, android.net.Uri p2, java.lang.String p3, android.app.PendingIntent p4, android.app.PendingIntent p5) {}
    @java.lang.Deprecated
    public void sendStoredMultipartText(java.lang.String p0, android.net.Uri p1, java.lang.String p2, java.util.List<android.app.PendingIntent> p3, java.util.List<android.app.PendingIntent> p4) {}
    public void sendStoredMultipartText(java.lang.String p0, java.lang.String p1, android.net.Uri p2, java.lang.String p3, java.util.List<android.app.PendingIntent> p4, java.util.List<android.app.PendingIntent> p5) {}
    public int getSmsCapacityOnIcc(java.lang.String p0, java.lang.String p1) { return 0; }
    public void notifyIfOutgoingEmergencySms(java.lang.String p0) {}
    public com.android.internal.telephony.InboundSmsHandler getInboundSmsHandler(boolean p0) { return null; }
    public void dump(java.io.FileDescriptor p0, java.io.PrintWriter p1, java.lang.String[] p2) {}

    class CdmaBroadcastRangeManager extends com.android.internal.telephony.IntRangeManager {
        CdmaBroadcastRangeManager(com.android.internal.telephony.IccSmsInterfaceManager p0) { super(); }
        protected void startUpdate() {}
        protected void addRange(int p0, int p1, boolean p2) {}
        protected boolean finishUpdate() { return false; }
    }

    class CellBroadcastRangeManager extends com.android.internal.telephony.IntRangeManager {
        CellBroadcastRangeManager(com.android.internal.telephony.IccSmsInterfaceManager p0) { super(); }
        protected void startUpdate() {}
        protected void addRange(int p0, int p1, boolean p2) {}
        protected boolean finishUpdate() { return false; }
    }

    public static interface PhoneFactoryProxy {
        public com.android.internal.telephony.Phone getPhone(int p0);
        public com.android.internal.telephony.Phone getDefaultPhone();
        public com.android.internal.telephony.Phone[] getPhones();
    }

    private static final class Request {
        java.util.concurrent.atomic.AtomicBoolean mStatus;
        java.lang.Object mResult;
    }
}
