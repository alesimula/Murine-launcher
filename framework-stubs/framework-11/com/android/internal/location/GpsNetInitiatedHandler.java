package com.android.internal.location;

public class GpsNetInitiatedHandler {
    private static final java.lang.String TAG = "GpsNetInitiatedHandler";
    private static final boolean DEBUG = Boolean.valueOf(false);
    public static final java.lang.String ACTION_NI_VERIFY = "android.intent.action.NETWORK_INITIATED_VERIFY";
    public static final java.lang.String NI_INTENT_KEY_NOTIF_ID = "notif_id";
    public static final java.lang.String NI_INTENT_KEY_TITLE = "title";
    public static final java.lang.String NI_INTENT_KEY_MESSAGE = "message";
    public static final java.lang.String NI_INTENT_KEY_TIMEOUT = "timeout";
    public static final java.lang.String NI_INTENT_KEY_DEFAULT_RESPONSE = "default_resp";
    public static final java.lang.String NI_RESPONSE_EXTRA_CMD = "send_ni_response";
    public static final java.lang.String NI_EXTRA_CMD_NOTIF_ID = "notif_id";
    public static final java.lang.String NI_EXTRA_CMD_RESPONSE = "response";
    public static final int GPS_NI_TYPE_VOICE = 1;
    public static final int GPS_NI_TYPE_UMTS_SUPL = 2;
    public static final int GPS_NI_TYPE_UMTS_CTRL_PLANE = 3;
    public static final int GPS_NI_TYPE_EMERGENCY_SUPL = 4;
    public static final int GPS_NI_RESPONSE_ACCEPT = 1;
    public static final int GPS_NI_RESPONSE_DENY = 2;
    public static final int GPS_NI_RESPONSE_NORESP = 3;
    public static final int GPS_NI_RESPONSE_IGNORE = 4;
    public static final int GPS_NI_NEED_NOTIFY = 1;
    public static final int GPS_NI_NEED_VERIFY = 2;
    public static final int GPS_NI_PRIVACY_OVERRIDE = 4;
    public static final int GPS_ENC_NONE = 0;
    public static final int GPS_ENC_SUPL_GSM_DEFAULT = 1;
    public static final int GPS_ENC_SUPL_UTF8 = 2;
    public static final int GPS_ENC_SUPL_UCS2 = 3;
    public static final int GPS_ENC_UNKNOWN = -1;
    private final android.content.Context mContext = null;
    private final android.telephony.TelephonyManager mTelephonyManager = null;
    private final android.telephony.PhoneStateListener mPhoneStateListener = null;
    private final android.location.LocationManager mLocationManager = null;
    private boolean mPlaySounds;
    private boolean mPopupImmediately;
    private volatile boolean mIsSuplEsEnabled;
    private volatile boolean mIsInEmergencyCall;
    private volatile boolean mIsLocationEnabled;
    private final android.location.INetInitiatedListener mNetInitiatedListener = null;
    private static boolean mIsHexInput;
    private volatile long mCallEndElapsedRealtimeMillis;
    private volatile long mEmergencyExtensionMillis;
    private final android.content.BroadcastReceiver mBroadcastReciever = null;
    private android.app.Notification.Builder mNiNotificationBuilder;
    public GpsNetInitiatedHandler(android.content.Context p0, android.location.INetInitiatedListener p1, boolean p2) {}
    public void setSuplEsEnabled(boolean p0) {}
    public boolean getSuplEsEnabled() { return false; }
    public void updateLocationMode() {}
    public boolean getLocationEnabled() { return false; }
    public boolean getInEmergency() { return false; }
    public void setEmergencyExtensionSeconds(int p0) {}
    public void handleNiNotification(com.android.internal.location.GpsNetInitiatedHandler.GpsNiNotification p0) {}
    private void handleNi(com.android.internal.location.GpsNetInitiatedHandler.GpsNiNotification p0) {}
    private void handleNiInEs(com.android.internal.location.GpsNetInitiatedHandler.GpsNiNotification p0) {}
    private synchronized void setNiNotification(com.android.internal.location.GpsNetInitiatedHandler.GpsNiNotification p0) {}
    private void openNiDialog(com.android.internal.location.GpsNetInitiatedHandler.GpsNiNotification p0) {}
    private android.content.Intent getDlgIntent(com.android.internal.location.GpsNetInitiatedHandler.GpsNiNotification p0) { return null; }
    static byte[] stringToByteArray(java.lang.String p0, boolean p1) { return null; }
    static java.lang.String decodeGSMPackedString(byte[] p0) { return null; }
    static java.lang.String decodeUTF8String(byte[] p0) { return null; }
    static java.lang.String decodeUCS2String(byte[] p0) { return null; }
    private static java.lang.String decodeString(java.lang.String p0, boolean p1, int p2) { return null; }
    private static java.lang.String getNotifTicker(com.android.internal.location.GpsNetInitiatedHandler.GpsNiNotification p0, android.content.Context p1) { return null; }
    private static java.lang.String getNotifTitle(com.android.internal.location.GpsNetInitiatedHandler.GpsNiNotification p0, android.content.Context p1) { return null; }
    private static java.lang.String getNotifMessage(com.android.internal.location.GpsNetInitiatedHandler.GpsNiNotification p0, android.content.Context p1) { return null; }
    public static java.lang.String getDialogTitle(com.android.internal.location.GpsNetInitiatedHandler.GpsNiNotification p0, android.content.Context p1) { return null; }
    private static java.lang.String getDialogMessage(com.android.internal.location.GpsNetInitiatedHandler.GpsNiNotification p0, android.content.Context p1) { return null; }

    public static class GpsNiNotification {
        public int notificationId;
        public int niType;
        public boolean needNotify;
        public boolean needVerify;
        public boolean privacyOverride;
        public int timeout;
        public int defaultResponse;
        public java.lang.String requestorId;
        public java.lang.String text;
        public int requestorIdEncoding;
        public int textEncoding;
        public GpsNiNotification() {}
    }

    public static class GpsNiResponse {
        int userResponse;
        public GpsNiResponse() {}
    }
}
