package android.telephony.mbms;

public class MbmsDownloadReceiver extends android.content.BroadcastReceiver {
    public static final java.lang.String DOWNLOAD_TOKEN_SUFFIX = ".download_token";
    public static final java.lang.String MBMS_FILE_PROVIDER_META_DATA_KEY = "mbms-file-provider-authority";
    @android.annotation.SystemApi
    public static final int RESULT_OK = 0;
    @android.annotation.SystemApi
    public static final int RESULT_INVALID_ACTION = 1;
    @android.annotation.SystemApi
    public static final int RESULT_MALFORMED_INTENT = 2;
    @android.annotation.SystemApi
    public static final int RESULT_BAD_TEMP_FILE_ROOT = 3;
    @android.annotation.SystemApi
    public static final int RESULT_DOWNLOAD_FINALIZATION_ERROR = 4;
    @android.annotation.SystemApi
    public static final int RESULT_TEMP_FILE_GENERATION_ERROR = 5;
    @android.annotation.SystemApi
    public static final int RESULT_APP_NOTIFICATION_ERROR = 6;
    public MbmsDownloadReceiver() { super(); }
    public void onReceive(android.content.Context p0, android.content.Intent p1) {}
    public static java.lang.String getFileRelativePath(java.lang.String p0, java.lang.String p1) { return null; }
}
