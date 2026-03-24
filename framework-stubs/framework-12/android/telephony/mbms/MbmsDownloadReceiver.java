package android.telephony.mbms;

public class MbmsDownloadReceiver extends android.content.BroadcastReceiver {
    public static final java.lang.String DOWNLOAD_TOKEN_SUFFIX = ".download_token";
    public static final java.lang.String MBMS_FILE_PROVIDER_META_DATA_KEY = "mbms-file-provider-authority";
    private static final java.lang.String EMBMS_INTENT_PERMISSION = "android.permission.SEND_EMBMS_INTENTS";
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
    private static final java.lang.String LOG_TAG = "MbmsDownloadReceiver";
    private static final java.lang.String TEMP_FILE_SUFFIX = ".embms.temp";
    private static final java.lang.String TEMP_FILE_STAGING_LOCATION = "staged_completed_files";
    private static final int MAX_TEMP_FILE_RETRIES = 5;
    private java.lang.String mFileProviderAuthorityCache;
    private java.lang.String mMiddlewarePackageNameCache;
    public MbmsDownloadReceiver() { super(); }
    public void onReceive(android.content.Context p0, android.content.Intent p1) {}
    private boolean verifyIntentContents(android.content.Context p0, android.content.Intent p1) { return false; }
    private void moveDownloadedFile(android.content.Context p0, android.content.Intent p1) {}
    private void cleanupPostMove(android.content.Context p0, android.content.Intent p1) {}
    private void generateTempFiles(android.content.Context p0, android.content.Intent p1) {}
    private java.util.ArrayList<android.telephony.mbms.UriPathPair> generateFreshTempFiles(android.content.Context p0, java.lang.String p1, int p2) { return null; }
    private static java.io.File generateSingleTempFile(java.io.File p0) { return null; }
    private java.util.ArrayList<android.telephony.mbms.UriPathPair> generateUrisForPausedFiles(android.content.Context p0, java.lang.String p1, java.util.List<android.net.Uri> p2) { return null; }
    private void cleanupTempFiles(android.content.Context p0, android.content.Intent p1) {}
    private static android.net.Uri moveToFinalLocation(android.net.Uri p0, java.nio.file.Path p1, java.lang.String p2) throws java.io.IOException { return null; }
    public static java.lang.String getFileRelativePath(java.lang.String p0, java.lang.String p1) { return null; }
    private static boolean verifyTempFilePath(android.content.Context p0, java.lang.String p1, android.net.Uri p2) { return false; }
    private java.lang.String getFileProviderAuthorityCached(android.content.Context p0) { return null; }
    private static java.lang.String getFileProviderAuthority(android.content.Context p0) { return null; }
    private java.lang.String getMiddlewarePackageCached(android.content.Context p0) { return null; }
    private void verifyPermissionIntegrity(android.content.Context p0) {}
}
