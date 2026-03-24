package com.android.internal.telephony;

public class SmsDispatchersController extends android.os.Handler {
    protected static final int EVENT_SMS_HANDLER_EXITING_WAITING_STATE = 17;
    public void putDeliveryPendingTracker(com.android.internal.telephony.SMSDispatcher.SmsTracker p0) {}
    public SmsDispatchersController(com.android.internal.telephony.Phone p0, com.android.internal.telephony.SmsStorageMonitor p1, com.android.internal.telephony.SmsUsageMonitor p2) { super(); }
    public SmsDispatchersController(com.android.internal.telephony.Phone p0, com.android.internal.telephony.SmsStorageMonitor p1, com.android.internal.telephony.SmsUsageMonitor p2, android.os.Looper p3) { super(); }
    public void dispose() {}
    public void handleMessage(android.os.Message p0) {}
    public void injectSmsPdu(byte[] p0, java.lang.String p1, boolean p2, com.android.internal.telephony.SmsDispatchersController.SmsInjectionCallback p3) {}
    public void setImsSmsDispatcher(com.android.internal.telephony.ImsSmsDispatcher p0) {}
    public void injectSmsPdu(android.telephony.SmsMessage p0, java.lang.String p1, com.android.internal.telephony.SmsDispatchersController.SmsInjectionCallback p2, boolean p3, boolean p4, int p5) {}
    public boolean setImsManager(com.android.ims.ImsManager p0) { return false; }
    public void sendRetrySms(com.android.internal.telephony.SMSDispatcher.SmsTracker p0) {}
    public void sendRetrySms(com.android.internal.telephony.SMSDispatcher.SmsTracker p0, boolean p1) {}
    public void reportSmsMemoryStatus(android.os.Message p0) {}
    public boolean isIms() { return false; }
    public java.lang.String getImsSmsFormat() { return null; }
    protected boolean isCdmaMo() { return false; }
    public boolean isCdmaFormat(java.lang.String p0) { return false; }
    public void setDomainSelectionResolverProxy(com.android.internal.telephony.SmsDispatchersController.DomainSelectionResolverProxy p0) {}
    protected com.android.internal.telephony.SmsDispatchersController.DomainSelectionConnectionHolder getDomainSelectionConnectionHolder(boolean p0) { return null; }
    protected void sendData(java.lang.String p0, java.lang.String p1, java.lang.String p2, int p3, byte[] p4, android.app.PendingIntent p5, android.app.PendingIntent p6, boolean p7) {}
    public void sendText(java.lang.String p0, java.lang.String p1, java.lang.String p2, android.app.PendingIntent p3, android.app.PendingIntent p4, android.net.Uri p5, java.lang.String p6, boolean p7, int p8, boolean p9, int p10, boolean p11, long p12) {}
    public void sendText(java.lang.String p0, java.lang.String p1, java.lang.String p2, android.app.PendingIntent p3, android.app.PendingIntent p4, android.net.Uri p5, java.lang.String p6, boolean p7, int p8, boolean p9, int p10, boolean p11, long p12, boolean p13) {}
    protected void sendMultipartText(java.lang.String p0, java.lang.String p1, java.util.ArrayList<java.lang.String> p2, java.util.ArrayList<android.app.PendingIntent> p3, java.util.ArrayList<android.app.PendingIntent> p4, android.net.Uri p5, java.lang.String p6, boolean p7, int p8, boolean p9, int p10, long p11) {}
    public int getPremiumSmsPermission(java.lang.String p0) { return 0; }
    public void setPremiumSmsPermission(java.lang.String p0, int p1) {}
    public com.android.internal.telephony.SmsUsageMonitor getUsageMonitor() { return null; }
    public void handleSmsStatusReport(java.lang.String p0, byte[] p1) {}
    public com.android.internal.telephony.InboundSmsHandler getInboundSmsHandler(boolean p0) { return null; }
    public void dump(java.io.FileDescriptor p0, java.io.PrintWriter p1, java.lang.String[] p2) {}

    protected class DomainSelectionConnectionHolder implements com.android.internal.telephony.domainselection.DomainSelectionConnection.DomainSelectionConnectionCallback {
        DomainSelectionConnectionHolder(com.android.internal.telephony.SmsDispatchersController p0, boolean p1) {}
        public com.android.internal.telephony.domainselection.DomainSelectionConnection getConnection() { return null; }
        public java.util.List<com.android.internal.telephony.SmsDispatchersController.PendingRequest> getPendingRequests() { return null; }
        public boolean isDomainSelectionRequested() { return false; }
        public boolean isEmergency() { return false; }
        public void clearAllRequests() {}
        public void addRequest(com.android.internal.telephony.SmsDispatchersController.PendingRequest p0) {}
        public void setConnection(com.android.internal.telephony.domainselection.DomainSelectionConnection p0) {}
        public void onSelectionTerminated(int p0) {}
    }

    public static interface DomainSelectionResolverProxy {
        public com.android.internal.telephony.domainselection.DomainSelectionConnection getDomainSelectionConnection(com.android.internal.telephony.Phone p0, int p1, boolean p2);
        public boolean isDomainSelectionSupported();
    }

    private class PendingRequest {
        public static final int TYPE_DATA = 1;
        public static final int TYPE_TEXT = 2;
        public static final int TYPE_MULTIPART_TEXT = 3;
        public static final int TYPE_RETRY_SMS = 4;
        public final int type = 0;
        public final com.android.internal.telephony.SMSDispatcher.SmsTracker tracker = null;
        public final java.lang.String callingPackage = null;
        public final java.lang.String destAddr = null;
        public final java.lang.String scAddr = null;
        public final java.util.ArrayList<android.app.PendingIntent> sentIntents = null;
        public final java.util.ArrayList<android.app.PendingIntent> deliveryIntents = null;
        public final boolean isForVvm = false;
        public final byte[] data = null;
        public final int destPort = 0;
        public final java.util.ArrayList<java.lang.String> texts = null;
        public final android.net.Uri messageUri = null;
        public final boolean persistMessage = false;
        public final int priority = 0;
        public final boolean expectMore = false;
        public final int validityPeriod = 0;
        public final long messageId = 0L;
        public final boolean skipShortCodeCheck = false;
        PendingRequest(int p0, com.android.internal.telephony.SMSDispatcher.SmsTracker p1, java.lang.String p2, java.lang.String p3, java.lang.String p4, java.util.ArrayList<android.app.PendingIntent> p5, java.util.ArrayList<android.app.PendingIntent> p6, boolean p7, byte[] p8, int p9, java.util.ArrayList<java.lang.String> p10, android.net.Uri p11, boolean p12, int p13, boolean p14, int p15, long p16, boolean p17) {}
    }

    public static interface SmsInjectionCallback {
        public void onSmsInjectedResult(int p0);
    }
}
