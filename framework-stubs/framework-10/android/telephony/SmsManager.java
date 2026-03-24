package android.telephony;

public final class SmsManager {
    private static final java.lang.String TAG = "SmsManager";
    private static final android.telephony.SmsManager sInstance = null;
    private static final java.lang.Object sLockObject = null;
    public static final int CELL_BROADCAST_RAN_TYPE_GSM = 0;
    public static final int CELL_BROADCAST_RAN_TYPE_CDMA = 1;
    public static final int SMS_RECORD_LENGTH = 176;
    public static final int CDMA_SMS_RECORD_LENGTH = 255;
    private static final java.util.Map<java.lang.Integer, android.telephony.SmsManager> sSubInstances = null;
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=115609023L)
    private int mSubId;
    public static final java.lang.String MMS_CONFIG_APPEND_TRANSACTION_ID = "enabledTransID";
    public static final java.lang.String MMS_CONFIG_MMS_ENABLED = "enabledMMS";
    public static final java.lang.String MMS_CONFIG_GROUP_MMS_ENABLED = "enableGroupMms";
    public static final java.lang.String MMS_CONFIG_NOTIFY_WAP_MMSC_ENABLED = "enabledNotifyWapMMSC";
    public static final java.lang.String MMS_CONFIG_ALIAS_ENABLED = "aliasEnabled";
    public static final java.lang.String MMS_CONFIG_ALLOW_ATTACH_AUDIO = "allowAttachAudio";
    public static final java.lang.String MMS_CONFIG_MULTIPART_SMS_ENABLED = "enableMultipartSMS";
    public static final java.lang.String MMS_CONFIG_SMS_DELIVERY_REPORT_ENABLED = "enableSMSDeliveryReports";
    public static final java.lang.String MMS_CONFIG_SUPPORT_MMS_CONTENT_DISPOSITION = "supportMmsContentDisposition";
    public static final java.lang.String MMS_CONFIG_SEND_MULTIPART_SMS_AS_SEPARATE_MESSAGES = "sendMultipartSmsAsSeparateMessages";
    public static final java.lang.String MMS_CONFIG_MMS_READ_REPORT_ENABLED = "enableMMSReadReports";
    public static final java.lang.String MMS_CONFIG_MMS_DELIVERY_REPORT_ENABLED = "enableMMSDeliveryReports";
    public static final java.lang.String MMS_CONFIG_MAX_MESSAGE_SIZE = "maxMessageSize";
    public static final java.lang.String MMS_CONFIG_MAX_IMAGE_WIDTH = "maxImageWidth";
    public static final java.lang.String MMS_CONFIG_MAX_IMAGE_HEIGHT = "maxImageHeight";
    public static final java.lang.String MMS_CONFIG_RECIPIENT_LIMIT = "recipientLimit";
    public static final java.lang.String MMS_CONFIG_ALIAS_MIN_CHARS = "aliasMinChars";
    public static final java.lang.String MMS_CONFIG_ALIAS_MAX_CHARS = "aliasMaxChars";
    public static final java.lang.String MMS_CONFIG_SMS_TO_MMS_TEXT_THRESHOLD = "smsToMmsTextThreshold";
    public static final java.lang.String MMS_CONFIG_SMS_TO_MMS_TEXT_LENGTH_THRESHOLD = "smsToMmsTextLengthThreshold";
    public static final java.lang.String MMS_CONFIG_MESSAGE_TEXT_MAX_SIZE = "maxMessageTextSize";
    public static final java.lang.String MMS_CONFIG_SUBJECT_MAX_LENGTH = "maxSubjectLength";
    public static final java.lang.String MMS_CONFIG_HTTP_SOCKET_TIMEOUT = "httpSocketTimeout";
    public static final java.lang.String MMS_CONFIG_UA_PROF_TAG_NAME = "uaProfTagName";
    public static final java.lang.String MMS_CONFIG_USER_AGENT = "userAgent";
    public static final java.lang.String MMS_CONFIG_UA_PROF_URL = "uaProfUrl";
    public static final java.lang.String MMS_CONFIG_HTTP_PARAMS = "httpParams";
    public static final java.lang.String MMS_CONFIG_EMAIL_GATEWAY_NUMBER = "emailGatewayNumber";
    public static final java.lang.String MMS_CONFIG_NAI_SUFFIX = "naiSuffix";
    public static final java.lang.String MMS_CONFIG_SHOW_CELL_BROADCAST_APP_LINKS = "config_cellBroadcastAppLinks";
    public static final java.lang.String MMS_CONFIG_SUPPORT_HTTP_CHARSET_HEADER = "supportHttpCharsetHeader";
    public static final java.lang.String MMS_CONFIG_CLOSE_CONNECTION = "mmsCloseConnection";
    public static final int SMS_MESSAGE_PRIORITY_NOT_SPECIFIED = -1;
    public static final int SMS_MESSAGE_PERIOD_NOT_SPECIFIED = -1;
    private static final java.lang.String NO_DEFAULT_EXTRA = "noDefault";
    public static final int STATUS_ON_ICC_FREE = 0;
    public static final int STATUS_ON_ICC_READ = 1;
    public static final int STATUS_ON_ICC_UNREAD = 3;
    public static final int STATUS_ON_ICC_SENT = 5;
    public static final int STATUS_ON_ICC_UNSENT = 7;
    @android.annotation.SystemApi
    public static final int RESULT_ERROR_NONE = 0;
    public static final int RESULT_ERROR_GENERIC_FAILURE = 1;
    public static final int RESULT_ERROR_RADIO_OFF = 2;
    public static final int RESULT_ERROR_NULL_PDU = 3;
    public static final int RESULT_ERROR_NO_SERVICE = 4;
    public static final int RESULT_ERROR_LIMIT_EXCEEDED = 5;
    @android.annotation.SystemApi
    public static final int RESULT_ERROR_FDN_CHECK_FAILURE = 6;
    public static final int RESULT_ERROR_SHORT_CODE_NOT_ALLOWED = 7;
    public static final int RESULT_ERROR_SHORT_CODE_NEVER_ALLOWED = 8;
    @android.annotation.SystemApi
    public static final int RESULT_RADIO_NOT_AVAILABLE = 9;
    @android.annotation.SystemApi
    public static final int RESULT_NETWORK_REJECT = 10;
    @android.annotation.SystemApi
    public static final int RESULT_INVALID_ARGUMENTS = 11;
    @android.annotation.SystemApi
    public static final int RESULT_INVALID_STATE = 12;
    @android.annotation.SystemApi
    public static final int RESULT_NO_MEMORY = 13;
    @android.annotation.SystemApi
    public static final int RESULT_INVALID_SMS_FORMAT = 14;
    @android.annotation.SystemApi
    public static final int RESULT_SYSTEM_ERROR = 15;
    @android.annotation.SystemApi
    public static final int RESULT_MODEM_ERROR = 16;
    @android.annotation.SystemApi
    public static final int RESULT_NETWORK_ERROR = 17;
    @android.annotation.SystemApi
    public static final int RESULT_ENCODING_ERROR = 18;
    @android.annotation.SystemApi
    public static final int RESULT_INVALID_SMSC_ADDRESS = 19;
    @android.annotation.SystemApi
    public static final int RESULT_OPERATION_NOT_ALLOWED = 20;
    @android.annotation.SystemApi
    public static final int RESULT_INTERNAL_ERROR = 21;
    @android.annotation.SystemApi
    public static final int RESULT_NO_RESOURCES = 22;
    @android.annotation.SystemApi
    public static final int RESULT_CANCELLED = 23;
    @android.annotation.SystemApi
    public static final int RESULT_REQUEST_NOT_SUPPORTED = 24;
    private static final java.lang.String PHONE_PACKAGE_NAME = "com.android.phone";
    public static final int MMS_ERROR_UNSPECIFIED = 1;
    public static final int MMS_ERROR_INVALID_APN = 2;
    public static final int MMS_ERROR_UNABLE_CONNECT_MMS = 3;
    public static final int MMS_ERROR_HTTP_FAILURE = 4;
    public static final int MMS_ERROR_IO_ERROR = 5;
    public static final int MMS_ERROR_RETRY = 6;
    public static final int MMS_ERROR_CONFIGURATION_ERROR = 7;
    public static final int MMS_ERROR_NO_DATA_NETWORK = 8;
    public static final java.lang.String EXTRA_MMS_DATA = "android.telephony.extra.MMS_DATA";
    public static final java.lang.String EXTRA_MMS_HTTP_STATUS = "android.telephony.extra.MMS_HTTP_STATUS";
    public static final int SMS_TYPE_INCOMING = 0;
    public static final int SMS_TYPE_OUTGOING = 1;
    public static final java.lang.String MESSAGE_STATUS_SEEN = "seen";
    public static final java.lang.String MESSAGE_STATUS_READ = "read";
    public static final java.lang.String REGEX_PREFIX_DELIMITER = ",";
    public static final int RESULT_STATUS_SUCCESS = 0;
    public static final int RESULT_STATUS_TIMEOUT = 1;
    public static final java.lang.String EXTRA_SMS_MESSAGE = "android.telephony.extra.SMS_MESSAGE";
    public static final java.lang.String EXTRA_STATUS = "android.telephony.extra.STATUS";
    public static final java.lang.String EXTRA_SIM_SUBSCRIPTION_ID = "android.telephony.extra.SIM_SUBSCRIPTION_ID";
    public static final int SMS_CATEGORY_NOT_SHORT_CODE = 0;
    public static final int SMS_CATEGORY_FREE_SHORT_CODE = 1;
    public static final int SMS_CATEGORY_STANDARD_SHORT_CODE = 2;
    public static final int SMS_CATEGORY_POSSIBLE_PREMIUM_SHORT_CODE = 3;
    public static final int SMS_CATEGORY_PREMIUM_SHORT_CODE = 4;
    public void sendTextMessage(java.lang.String p0, java.lang.String p1, java.lang.String p2, android.app.PendingIntent p3, android.app.PendingIntent p4) {}
    private void sendTextMessageInternal(java.lang.String p0, java.lang.String p1, java.lang.String p2, android.app.PendingIntent p3, android.app.PendingIntent p4, boolean p5, java.lang.String p6) {}
    public void sendTextMessageWithoutPersisting(java.lang.String p0, java.lang.String p1, java.lang.String p2, android.app.PendingIntent p3, android.app.PendingIntent p4) {}
    public void sendTextMessageWithSelfPermissions(java.lang.String p0, java.lang.String p1, java.lang.String p2, android.app.PendingIntent p3, android.app.PendingIntent p4, boolean p5) {}
    @android.annotation.UnsupportedAppUsage
    public void sendTextMessage(java.lang.String p0, java.lang.String p1, java.lang.String p2, android.app.PendingIntent p3, android.app.PendingIntent p4, int p5, boolean p6, int p7) {}
    private void sendTextMessageInternal(java.lang.String p0, java.lang.String p1, java.lang.String p2, android.app.PendingIntent p3, android.app.PendingIntent p4, boolean p5, int p6, boolean p7, int p8) {}
    @android.annotation.UnsupportedAppUsage
    public void sendTextMessageWithoutPersisting(java.lang.String p0, java.lang.String p1, java.lang.String p2, android.app.PendingIntent p3, android.app.PendingIntent p4, int p5, boolean p6, int p7) {}
    public void injectSmsPdu(byte[] p0, java.lang.String p1, android.app.PendingIntent p2) {}
    public java.util.ArrayList<java.lang.String> divideMessage(java.lang.String p0) { return null; }
    public void sendMultipartTextMessage(java.lang.String p0, java.lang.String p1, java.util.ArrayList<java.lang.String> p2, java.util.ArrayList<android.app.PendingIntent> p3, java.util.ArrayList<android.app.PendingIntent> p4) {}
    public void sendMultipartTextMessageExternal(java.lang.String p0, java.lang.String p1, java.util.ArrayList<java.lang.String> p2, java.util.ArrayList<android.app.PendingIntent> p3, java.util.ArrayList<android.app.PendingIntent> p4, java.lang.String p5) {}
    private void sendMultipartTextMessageInternal(java.lang.String p0, java.lang.String p1, java.util.List<java.lang.String> p2, java.util.List<android.app.PendingIntent> p3, java.util.List<android.app.PendingIntent> p4, boolean p5, java.lang.String p6) {}
    @android.annotation.SystemApi
    public void sendMultipartTextMessageWithoutPersisting(java.lang.String p0, java.lang.String p1, java.util.List<java.lang.String> p2, java.util.List<android.app.PendingIntent> p3, java.util.List<android.app.PendingIntent> p4) {}
    @android.annotation.UnsupportedAppUsage
    public void sendMultipartTextMessage(java.lang.String p0, java.lang.String p1, java.util.ArrayList<java.lang.String> p2, java.util.ArrayList<android.app.PendingIntent> p3, java.util.ArrayList<android.app.PendingIntent> p4, int p5, boolean p6, int p7) {}
    private void sendMultipartTextMessageInternal(java.lang.String p0, java.lang.String p1, java.util.List<java.lang.String> p2, java.util.List<android.app.PendingIntent> p3, java.util.List<android.app.PendingIntent> p4, boolean p5, int p6, boolean p7, int p8) {}
    public void sendMultipartTextMessageWithoutPersisting(java.lang.String p0, java.lang.String p1, java.util.List<java.lang.String> p2, java.util.List<android.app.PendingIntent> p3, java.util.List<android.app.PendingIntent> p4, int p5, boolean p6, int p7) {}
    public void sendDataMessage(java.lang.String p0, java.lang.String p1, short p2, byte[] p3, android.app.PendingIntent p4, android.app.PendingIntent p5) {}
    public void sendDataMessageWithSelfPermissions(java.lang.String p0, java.lang.String p1, short p2, byte[] p3, android.app.PendingIntent p4, android.app.PendingIntent p5) {}
    public static android.telephony.SmsManager getDefault() { return null; }
    public static android.telephony.SmsManager getSmsManagerForSubscriptionId(int p0) { return null; }
    private SmsManager(int p0) {}
    public int getSubscriptionId() { return 0; }
    private void resolveSubscriptionForOperation(android.telephony.SmsManager.SubscriptionResolverResult p0) {}
    private void sendResolverResult(android.telephony.SmsManager.SubscriptionResolverResult p0, int p1, boolean p2) {}
    private static int getTargetSdkVersion() { return 0; }
    private static com.android.internal.telephony.ITelephony getITelephony() { return null; }
    private static void notifySmsErrorNoDefaultSet(android.content.Context p0, android.app.PendingIntent p1) {}
    private static void notifySmsErrorNoDefaultSet(android.content.Context p0, java.util.List<android.app.PendingIntent> p1) {}
    private static void notifySmsGenericError(android.app.PendingIntent p0) {}
    private static void notifySmsGenericError(java.util.List<android.app.PendingIntent> p0) {}
    private static com.android.internal.telephony.ISms getISmsServiceOrThrow() { return null; }
    private static com.android.internal.telephony.ISms getISmsService() { return null; }
    @android.annotation.UnsupportedAppUsage
    public boolean copyMessageToIcc(byte[] p0, byte[] p1, int p2) { return false; }
    @android.annotation.UnsupportedAppUsage
    public boolean deleteMessageFromIcc(int p0) { return false; }
    @android.annotation.UnsupportedAppUsage
    public boolean updateMessageOnIcc(int p0, int p1, byte[] p2) { return false; }
    @android.annotation.UnsupportedAppUsage
    public java.util.ArrayList<android.telephony.SmsMessage> getAllMessagesFromIcc() { return null; }
    public boolean enableCellBroadcast(int p0, int p1) { return false; }
    public boolean disableCellBroadcast(int p0, int p1) { return false; }
    @android.annotation.UnsupportedAppUsage
    public boolean enableCellBroadcastRange(int p0, int p1, int p2) { return false; }
    @android.annotation.UnsupportedAppUsage
    public boolean disableCellBroadcastRange(int p0, int p1, int p2) { return false; }
    private java.util.ArrayList<android.telephony.SmsMessage> createMessageListFromRawRecords(java.util.List<com.android.internal.telephony.SmsRawData> p0) { return null; }
    public boolean isImsSmsSupported() { return false; }
    public java.lang.String getImsSmsFormat() { return null; }
    public static int getDefaultSmsSubscriptionId() { return 0; }
    @android.annotation.UnsupportedAppUsage
    public boolean isSMSPromptEnabled() { return false; }
    public void sendMultimediaMessage(android.content.Context p0, android.net.Uri p1, java.lang.String p2, android.os.Bundle p3, android.app.PendingIntent p4) {}
    public void downloadMultimediaMessage(android.content.Context p0, java.lang.String p1, android.net.Uri p2, android.os.Bundle p3, android.app.PendingIntent p4) {}
    public android.net.Uri importTextMessage(java.lang.String p0, int p1, java.lang.String p2, long p3, boolean p4, boolean p5) { return null; }
    public android.net.Uri importMultimediaMessage(android.net.Uri p0, java.lang.String p1, long p2, boolean p3, boolean p4) { return null; }
    public boolean deleteStoredMessage(android.net.Uri p0) { return false; }
    public boolean deleteStoredConversation(long p0) { return false; }
    public boolean updateStoredMessageStatus(android.net.Uri p0, android.content.ContentValues p1) { return false; }
    public boolean archiveStoredConversation(long p0, boolean p1) { return false; }
    public android.net.Uri addTextMessageDraft(java.lang.String p0, java.lang.String p1) { return null; }
    public android.net.Uri addMultimediaMessageDraft(android.net.Uri p0) { return null; }
    public void sendStoredTextMessage(android.net.Uri p0, java.lang.String p1, android.app.PendingIntent p2, android.app.PendingIntent p3) {}
    public void sendStoredMultipartTextMessage(android.net.Uri p0, java.lang.String p1, java.util.ArrayList<android.app.PendingIntent> p2, java.util.ArrayList<android.app.PendingIntent> p3) {}
    public void sendStoredMultimediaMessage(android.net.Uri p0, android.os.Bundle p1, android.app.PendingIntent p2) {}
    public void setAutoPersisting(boolean p0) {}
    public boolean getAutoPersisting() { return false; }
    public android.os.Bundle getCarrierConfigValues() { return null; }
    public java.lang.String createAppSpecificSmsToken(android.app.PendingIntent p0) { return null; }
    public void getSmsMessagesForFinancialApp(android.os.Bundle p0, java.util.concurrent.Executor p1, android.telephony.SmsManager.FinancialSmsCallback p2) {}
    public java.lang.String createAppSpecificSmsTokenWithPackageInfo(java.lang.String p0, android.app.PendingIntent p1) { return null; }
    public static android.os.Bundle getMmsConfig(android.os.BaseBundle p0) { return null; }
    public int checkSmsShortCodeDestination(java.lang.String p0, java.lang.String p1) { return 0; }

    private static interface SubscriptionResolverResult {
        public void onSuccess(int p0);
        public void onFailure();
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface SmsShortCodeCategory {
    }

    public static abstract class FinancialSmsCallback {
        public FinancialSmsCallback() {}
        public abstract void onFinancialSmsMessages(android.database.CursorWindow p0);
    }
}
