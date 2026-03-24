package android.telephony;

public final class SmsManager {
    private static final java.lang.String TAG = "SmsManager";
    private static final java.lang.Object sLockObject = null;
    private static final java.util.Map<android.util.Pair<android.content.Context, java.lang.Integer>, android.telephony.SmsManager> sSubInstances = null;
    private static final android.telephony.SmsManager DEFAULT_INSTANCE = null;
    public static final int SMS_RECORD_LENGTH = 176;
    public static final int CDMA_SMS_RECORD_LENGTH = 255;
    private int mSubId;
    private final android.content.Context mContext = null;
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
    @android.annotation.SystemApi
    public static final int PREMIUM_SMS_CONSENT_UNKNOWN = 0;
    @android.annotation.SystemApi
    public static final int PREMIUM_SMS_CONSENT_ASK_USER = 1;
    @android.annotation.SystemApi
    public static final int PREMIUM_SMS_CONSENT_NEVER_ALLOW = 2;
    @android.annotation.SystemApi
    public static final int PREMIUM_SMS_CONSENT_ALWAYS_ALLOW = 3;
    private static final long GET_TARGET_SDK_VERSION_CODE_CHANGE = 145147528L;
    public static final int STATUS_ON_ICC_FREE = 0;
    public static final int STATUS_ON_ICC_READ = 1;
    public static final int STATUS_ON_ICC_UNREAD = 3;
    public static final int STATUS_ON_ICC_SENT = 5;
    public static final int STATUS_ON_ICC_UNSENT = 7;
    public static final int RESULT_ERROR_NONE = 0;
    public static final int RESULT_ERROR_GENERIC_FAILURE = 1;
    public static final int RESULT_ERROR_RADIO_OFF = 2;
    public static final int RESULT_ERROR_NULL_PDU = 3;
    public static final int RESULT_ERROR_NO_SERVICE = 4;
    public static final int RESULT_ERROR_LIMIT_EXCEEDED = 5;
    public static final int RESULT_ERROR_FDN_CHECK_FAILURE = 6;
    public static final int RESULT_ERROR_SHORT_CODE_NOT_ALLOWED = 7;
    public static final int RESULT_ERROR_SHORT_CODE_NEVER_ALLOWED = 8;
    public static final int RESULT_RADIO_NOT_AVAILABLE = 9;
    public static final int RESULT_NETWORK_REJECT = 10;
    public static final int RESULT_INVALID_ARGUMENTS = 11;
    public static final int RESULT_INVALID_STATE = 12;
    public static final int RESULT_NO_MEMORY = 13;
    public static final int RESULT_INVALID_SMS_FORMAT = 14;
    public static final int RESULT_SYSTEM_ERROR = 15;
    public static final int RESULT_MODEM_ERROR = 16;
    public static final int RESULT_NETWORK_ERROR = 17;
    public static final int RESULT_ENCODING_ERROR = 18;
    public static final int RESULT_INVALID_SMSC_ADDRESS = 19;
    public static final int RESULT_OPERATION_NOT_ALLOWED = 20;
    public static final int RESULT_INTERNAL_ERROR = 21;
    public static final int RESULT_NO_RESOURCES = 22;
    public static final int RESULT_CANCELLED = 23;
    public static final int RESULT_REQUEST_NOT_SUPPORTED = 24;
    public static final int RESULT_NO_BLUETOOTH_SERVICE = 25;
    public static final int RESULT_INVALID_BLUETOOTH_ADDRESS = 26;
    public static final int RESULT_BLUETOOTH_DISCONNECTED = 27;
    public static final int RESULT_UNEXPECTED_EVENT_STOP_SENDING = 28;
    public static final int RESULT_SMS_BLOCKED_DURING_EMERGENCY = 29;
    public static final int RESULT_SMS_SEND_RETRY_FAILED = 30;
    public static final int RESULT_REMOTE_EXCEPTION = 31;
    public static final int RESULT_NO_DEFAULT_SMS_APP = 32;
    public static final int RESULT_RIL_RADIO_NOT_AVAILABLE = 100;
    public static final int RESULT_RIL_SMS_SEND_FAIL_RETRY = 101;
    public static final int RESULT_RIL_NETWORK_REJECT = 102;
    public static final int RESULT_RIL_INVALID_STATE = 103;
    public static final int RESULT_RIL_INVALID_ARGUMENTS = 104;
    public static final int RESULT_RIL_NO_MEMORY = 105;
    public static final int RESULT_RIL_REQUEST_RATE_LIMITED = 106;
    public static final int RESULT_RIL_INVALID_SMS_FORMAT = 107;
    public static final int RESULT_RIL_SYSTEM_ERR = 108;
    public static final int RESULT_RIL_ENCODING_ERR = 109;
    public static final int RESULT_RIL_INVALID_SMSC_ADDRESS = 110;
    public static final int RESULT_RIL_MODEM_ERR = 111;
    public static final int RESULT_RIL_NETWORK_ERR = 112;
    public static final int RESULT_RIL_INTERNAL_ERR = 113;
    public static final int RESULT_RIL_REQUEST_NOT_SUPPORTED = 114;
    public static final int RESULT_RIL_INVALID_MODEM_STATE = 115;
    public static final int RESULT_RIL_NETWORK_NOT_READY = 116;
    public static final int RESULT_RIL_OPERATION_NOT_ALLOWED = 117;
    public static final int RESULT_RIL_NO_RESOURCES = 118;
    public static final int RESULT_RIL_CANCELLED = 119;
    public static final int RESULT_RIL_SIM_ABSENT = 120;
    public static final int RESULT_RIL_SIMULTANEOUS_SMS_AND_CALL_NOT_ALLOWED = 121;
    public static final int RESULT_RIL_ACCESS_BARRED = 122;
    public static final int RESULT_RIL_BLOCKED_DUE_TO_CALL = 123;
    public static final int RESULT_RECEIVE_DISPATCH_FAILURE = 500;
    public static final int RESULT_RECEIVE_INJECTED_NULL_PDU = 501;
    public static final int RESULT_RECEIVE_RUNTIME_EXCEPTION = 502;
    public static final int RESULT_RECEIVE_NULL_MESSAGE_FROM_RIL = 503;
    public static final int RESULT_RECEIVE_WHILE_ENCRYPTED = 504;
    public static final int RESULT_RECEIVE_SQL_EXCEPTION = 505;
    public static final int RESULT_RECEIVE_URI_EXCEPTION = 506;
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
    private java.lang.String getOpPackageName() { return null; }
    private java.lang.String getAttributionTag() { return null; }
    public void sendTextMessage(java.lang.String p0, java.lang.String p1, java.lang.String p2, android.app.PendingIntent p3, android.app.PendingIntent p4) {}
    public void sendTextMessage(java.lang.String p0, java.lang.String p1, java.lang.String p2, android.app.PendingIntent p3, android.app.PendingIntent p4, long p5) {}
    public void sendTextMessage(java.lang.String p0, java.lang.String p1, java.lang.String p2, android.app.PendingIntent p3, android.app.PendingIntent p4, int p5, boolean p6, int p7) {}
    private void sendTextMessageInternal(java.lang.String p0, java.lang.String p1, java.lang.String p2, android.app.PendingIntent p3, android.app.PendingIntent p4, boolean p5, java.lang.String p6, java.lang.String p7, long p8) {}
    @android.annotation.RequiresPermission(allOf={"android.permission.MODIFY_PHONE_STATE", "android.permission.SEND_SMS"})
    public void sendTextMessageWithoutPersisting(java.lang.String p0, java.lang.String p1, java.lang.String p2, android.app.PendingIntent p3, android.app.PendingIntent p4) {}
    private void sendTextMessageInternal(java.lang.String p0, java.lang.String p1, java.lang.String p2, android.app.PendingIntent p3, android.app.PendingIntent p4, boolean p5, int p6, boolean p7, int p8) {}
    public void sendTextMessageWithoutPersisting(java.lang.String p0, java.lang.String p1, java.lang.String p2, android.app.PendingIntent p3, android.app.PendingIntent p4, int p5, boolean p6, int p7) {}
    public void injectSmsPdu(byte[] p0, java.lang.String p1, android.app.PendingIntent p2) {}
    public java.util.ArrayList<java.lang.String> divideMessage(java.lang.String p0) { return null; }
    public void sendMultipartTextMessage(java.lang.String p0, java.lang.String p1, java.util.ArrayList<java.lang.String> p2, java.util.ArrayList<android.app.PendingIntent> p3, java.util.ArrayList<android.app.PendingIntent> p4) {}
    public void sendMultipartTextMessage(java.lang.String p0, java.lang.String p1, java.util.List<java.lang.String> p2, java.util.List<android.app.PendingIntent> p3, java.util.List<android.app.PendingIntent> p4, long p5) {}
    public void sendMultipartTextMessage(java.lang.String p0, java.lang.String p1, java.util.List<java.lang.String> p2, java.util.List<android.app.PendingIntent> p3, java.util.List<android.app.PendingIntent> p4, java.lang.String p5, java.lang.String p6) {}
    private void sendMultipartTextMessageInternal(java.lang.String p0, java.lang.String p1, java.util.List<java.lang.String> p2, java.util.List<android.app.PendingIntent> p3, java.util.List<android.app.PendingIntent> p4, boolean p5, java.lang.String p6, java.lang.String p7, long p8) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MODIFY_PHONE_STATE")
    public void sendMultipartTextMessageWithoutPersisting(java.lang.String p0, java.lang.String p1, java.util.List<java.lang.String> p2, java.util.List<android.app.PendingIntent> p3, java.util.List<android.app.PendingIntent> p4) {}
    public void sendMultipartTextMessage(java.lang.String p0, java.lang.String p1, java.util.ArrayList<java.lang.String> p2, java.util.ArrayList<android.app.PendingIntent> p3, java.util.ArrayList<android.app.PendingIntent> p4, int p5, boolean p6, int p7) {}
    private void sendMultipartTextMessageInternal(java.lang.String p0, java.lang.String p1, java.util.List<java.lang.String> p2, java.util.List<android.app.PendingIntent> p3, java.util.List<android.app.PendingIntent> p4, boolean p5, int p6, boolean p7, int p8) {}
    public void sendDataMessage(java.lang.String p0, java.lang.String p1, short p2, byte[] p3, android.app.PendingIntent p4, android.app.PendingIntent p5) {}
    @java.lang.Deprecated
    public static android.telephony.SmsManager getDefault() { return null; }
    public static android.telephony.SmsManager getSmsManagerForContextAndSubscriptionId(android.content.Context p0, int p1) { return null; }
    @java.lang.Deprecated
    public static android.telephony.SmsManager getSmsManagerForSubscriptionId(int p0) { return null; }
    public android.telephony.SmsManager createForSubscriptionId(int p0) { return null; }
    private SmsManager(android.content.Context p0, int p1) {}
    public int getSubscriptionId() { return 0; }
    private void resolveSubscriptionForOperation(android.telephony.SmsManager.SubscriptionResolverResult p0) {}
    private void sendResolverResult(android.telephony.SmsManager.SubscriptionResolverResult p0, int p1, boolean p2) {}
    private static com.android.internal.telephony.ITelephony getITelephony() { return null; }
    private static void notifySmsError(android.app.PendingIntent p0, int p1) {}
    private static void notifySmsError(java.util.List<android.app.PendingIntent> p0, int p1) {}
    private static com.android.internal.telephony.ISms getISmsServiceOrThrow() { return null; }
    private static com.android.internal.telephony.ISms getISmsService() { return null; }
    @android.annotation.RequiresPermission("android.permission.ACCESS_MESSAGES_ON_ICC")
    public boolean copyMessageToIcc(byte[] p0, byte[] p1, int p2) { return false; }
    @android.annotation.RequiresPermission("android.permission.ACCESS_MESSAGES_ON_ICC")
    public boolean deleteMessageFromIcc(int p0) { return false; }
    @android.annotation.RequiresPermission("android.permission.ACCESS_MESSAGES_ON_ICC")
    public boolean updateMessageOnIcc(int p0, int p1, byte[] p2) { return false; }
    @android.annotation.RequiresPermission("android.permission.ACCESS_MESSAGES_ON_ICC")
    public java.util.List<android.telephony.SmsMessage> getMessagesFromIcc() { return null; }
    public java.util.ArrayList<android.telephony.SmsMessage> getAllMessagesFromIcc() { return null; }
    @android.annotation.SystemApi
    public boolean enableCellBroadcastRange(int p0, int p1, int p2) { return false; }
    @android.annotation.SystemApi
    public boolean disableCellBroadcastRange(int p0, int p1, int p2) { return false; }
    private java.util.ArrayList<android.telephony.SmsMessage> createMessageListFromRawRecords(java.util.List<com.android.internal.telephony.SmsRawData> p0) { return null; }
    public boolean isImsSmsSupported() { return false; }
    public java.lang.String getImsSmsFormat() { return null; }
    public static int getDefaultSmsSubscriptionId() { return 0; }
    public boolean isSMSPromptEnabled() { return false; }
    @android.annotation.RequiresPermission(anyOf={"android.permission.READ_PHONE_STATE", "android.permission.READ_PRIVILEGED_PHONE_STATE"})
    public int getSmsCapacityOnIcc() { return 0; }
    public void sendMultimediaMessage(android.content.Context p0, android.net.Uri p1, java.lang.String p2, android.os.Bundle p3, android.app.PendingIntent p4) {}
    public void sendMultimediaMessage(android.content.Context p0, android.net.Uri p1, java.lang.String p2, android.os.Bundle p3, android.app.PendingIntent p4, long p5) {}
    public void downloadMultimediaMessage(android.content.Context p0, java.lang.String p1, android.net.Uri p2, android.os.Bundle p3, android.app.PendingIntent p4) {}
    public void downloadMultimediaMessage(android.content.Context p0, java.lang.String p1, android.net.Uri p2, android.os.Bundle p3, android.app.PendingIntent p4, long p5) {}
    public android.os.Bundle getCarrierConfigValues() { return null; }
    public java.lang.String createAppSpecificSmsToken(android.app.PendingIntent p0) { return null; }
    @android.annotation.RequiresPermission("android.permission.SMS_FINANCIAL_TRANSACTIONS")
    public void getSmsMessagesForFinancialApp(android.os.Bundle p0, java.util.concurrent.Executor p1, android.telephony.SmsManager.FinancialSmsCallback p2) {}
    public java.lang.String createAppSpecificSmsTokenWithPackageInfo(java.lang.String p0, android.app.PendingIntent p1) { return null; }
    @android.annotation.RequiresPermission("android.permission.READ_PHONE_STATE")
    public int checkSmsShortCodeDestination(java.lang.String p0, java.lang.String p1) { return 0; }
    @android.annotation.RequiresPermission("android.permission.READ_PRIVILEGED_PHONE_STATE")
    public java.lang.String getSmscAddress() { return null; }
    @android.annotation.RequiresPermission("android.permission.MODIFY_PHONE_STATE")
    public boolean setSmscAddress(java.lang.String p0) { return false; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.READ_PRIVILEGED_PHONE_STATE")
    public int getPremiumSmsConsent(java.lang.String p0) { return 0; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MODIFY_PHONE_STATE")
    public void setPremiumSmsConsent(java.lang.String p0, int p1) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MODIFY_CELL_BROADCASTS")
    public void resetAllCellBroadcastRanges() {}
    private static java.lang.String formatCrossStackMessageId(long p0) { return null; }

    public static abstract class FinancialSmsCallback {
        public FinancialSmsCallback() {}
        public abstract void onFinancialSmsMessages(android.database.CursorWindow p0);
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface PremiumSmsConsent {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Result {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface SmsShortCodeCategory {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface StatusOnIcc {
    }

    private static interface SubscriptionResolverResult {
        public void onSuccess(int p0);
        public void onFailure();
    }
}
