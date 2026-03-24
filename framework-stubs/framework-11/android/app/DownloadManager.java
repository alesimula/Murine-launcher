package android.app;

public class DownloadManager {
    public static final java.lang.String COLUMN_ID = "_id";
    public static final java.lang.String COLUMN_TITLE = "title";
    public static final java.lang.String COLUMN_DESCRIPTION = "description";
    public static final java.lang.String COLUMN_URI = "uri";
    public static final java.lang.String COLUMN_MEDIA_TYPE = "media_type";
    public static final java.lang.String COLUMN_TOTAL_SIZE_BYTES = "total_size";
    public static final java.lang.String COLUMN_LOCAL_URI = "local_uri";
    @java.lang.Deprecated
    public static final java.lang.String COLUMN_LOCAL_FILENAME = "local_filename";
    public static final java.lang.String COLUMN_STATUS = "status";
    public static final java.lang.String COLUMN_FILE_NAME_HINT = "hint";
    public static final java.lang.String COLUMN_REASON = "reason";
    public static final java.lang.String COLUMN_BYTES_DOWNLOADED_SO_FAR = "bytes_so_far";
    public static final java.lang.String COLUMN_LAST_MODIFIED_TIMESTAMP = "last_modified_timestamp";
    public static final java.lang.String COLUMN_MEDIAPROVIDER_URI = "mediaprovider_uri";
    public static final java.lang.String COLUMN_DESTINATION = "destination";
    public static final java.lang.String COLUMN_MEDIASTORE_URI = "mediastore_uri";
    public static final java.lang.String COLUMN_ALLOW_WRITE = "allow_write";
    public static final int STATUS_PENDING = 1;
    public static final int STATUS_RUNNING = 2;
    public static final int STATUS_PAUSED = 4;
    public static final int STATUS_SUCCESSFUL = 8;
    public static final int STATUS_FAILED = 16;
    public static final int ERROR_UNKNOWN = 1000;
    public static final int ERROR_FILE_ERROR = 1001;
    public static final int ERROR_UNHANDLED_HTTP_CODE = 1002;
    public static final int ERROR_HTTP_DATA_ERROR = 1004;
    public static final int ERROR_TOO_MANY_REDIRECTS = 1005;
    public static final int ERROR_INSUFFICIENT_SPACE = 1006;
    public static final int ERROR_DEVICE_NOT_FOUND = 1007;
    public static final int ERROR_CANNOT_RESUME = 1008;
    public static final int ERROR_FILE_ALREADY_EXISTS = 1009;
    public static final int ERROR_BLOCKED = 1010;
    public static final int PAUSED_WAITING_TO_RETRY = 1;
    public static final int PAUSED_WAITING_FOR_NETWORK = 2;
    public static final int PAUSED_QUEUED_FOR_WIFI = 3;
    public static final int PAUSED_UNKNOWN = 4;
    public static final java.lang.String ACTION_DOWNLOAD_COMPLETE = "android.intent.action.DOWNLOAD_COMPLETE";
    public static final java.lang.String ACTION_NOTIFICATION_CLICKED = "android.intent.action.DOWNLOAD_NOTIFICATION_CLICKED";
    public static final java.lang.String ACTION_VIEW_DOWNLOADS = "android.intent.action.VIEW_DOWNLOADS";
    public static final java.lang.String INTENT_EXTRAS_SORT_BY_SIZE = "android.app.DownloadManager.extra_sortBySize";
    public static final java.lang.String EXTRA_DOWNLOAD_ID = "extra_download_id";
    public static final java.lang.String EXTRA_NOTIFICATION_CLICK_DOWNLOAD_IDS = "extra_click_download_ids";
    @android.annotation.SystemApi
    public static final java.lang.String ACTION_DOWNLOAD_COMPLETED = "android.intent.action.DOWNLOAD_COMPLETED";
    public static final java.lang.String[] UNDERLYING_COLUMNS = null;
    private final android.content.ContentResolver mResolver = null;
    private final java.lang.String mPackageName = null;
    private android.net.Uri mBaseUri;
    private boolean mAccessFilename;
    private static final java.lang.String NON_DOWNLOADMANAGER_DOWNLOAD = "non-dwnldmngr-download-dont-retry2download";
    public DownloadManager(android.content.Context p0) {}
    public void setAccessAllDownloads(boolean p0) {}
    public void setAccessFilename(boolean p0) {}
    @android.annotation.SystemApi
    public void onMediaStoreDownloadsDeleted(android.util.LongSparseArray<java.lang.String> p0) {}
    public long enqueue(android.app.DownloadManager.Request p0) { return 0L; }
    public int markRowDeleted(long... p0) { return 0; }
    public int remove(long... p0) { return 0; }
    public android.database.Cursor query(android.app.DownloadManager.Query p0) { return null; }
    public android.database.Cursor query(android.app.DownloadManager.Query p0, java.lang.String[] p1) { return null; }
    public android.os.ParcelFileDescriptor openDownloadedFile(long p0) throws java.io.FileNotFoundException { return null; }
    public android.net.Uri getUriForDownloadedFile(long p0) { return null; }
    public java.lang.String getMimeTypeForDownloadedFile(long p0) { return null; }
    public void restartDownload(long... p0) {}
    public void forceDownload(long... p0) {}
    public static java.lang.Long getMaxBytesOverMobile(android.content.Context p0) { return null; }
    public boolean rename(android.content.Context p0, long p1, java.lang.String p2) { return false; }
    public static java.lang.Long getRecommendedMaxBytesOverMobile(android.content.Context p0) { return null; }
    public static boolean isActiveNetworkExpensive(android.content.Context p0) { return false; }
    public static long getActiveNetworkWarningBytes(android.content.Context p0) { return 0L; }
    @java.lang.Deprecated
    public long addCompletedDownload(java.lang.String p0, java.lang.String p1, boolean p2, java.lang.String p3, java.lang.String p4, long p5, boolean p6) { return 0L; }
    @java.lang.Deprecated
    public long addCompletedDownload(java.lang.String p0, java.lang.String p1, boolean p2, java.lang.String p3, java.lang.String p4, long p5, boolean p6, android.net.Uri p7, android.net.Uri p8) { return 0L; }
    @java.lang.Deprecated
    public long addCompletedDownload(java.lang.String p0, java.lang.String p1, boolean p2, java.lang.String p3, java.lang.String p4, long p5, boolean p6, boolean p7) { return 0L; }
    @java.lang.Deprecated
    public long addCompletedDownload(java.lang.String p0, java.lang.String p1, boolean p2, java.lang.String p3, java.lang.String p4, long p5, boolean p6, boolean p7, android.net.Uri p8, android.net.Uri p9) { return 0L; }
    private static java.lang.String resolveMimeType(java.io.File p0) { return null; }
    private static java.lang.String extractDisplayName(java.lang.String p0) { return null; }
    private static java.lang.String extractFileExtension(java.lang.String p0) { return null; }
    private static void validateArgumentIsNonEmpty(java.lang.String p0, java.lang.String p1) {}
    public android.net.Uri getDownloadUri(long p0) { return null; }
    static java.lang.String getWhereClauseForIds(long[] p0) { return null; }
    static java.lang.String[] getWhereArgsForIds(long[] p0) { return null; }
    static java.lang.String[] getWhereArgsForIds(long[] p0, java.lang.String[] p1) { return null; }

    private static class CursorTranslator extends android.database.CursorWrapper {
        private final android.net.Uri mBaseUri = null;
        private final boolean mAccessFilename = false;
        public CursorTranslator(android.database.Cursor p0, android.net.Uri p1, boolean p2) { super(null); }
        public int getInt(int p0) { return 0; }
        public long getLong(int p0) { return 0L; }
        public java.lang.String getString(int p0) { return null; }
        private java.lang.String getLocalUri() { return null; }
        private long getReason(int p0) { return 0L; }
        private long getPausedReason(int p0) { return 0L; }
        private long getErrorCode(int p0) { return 0L; }
        private int translateStatus(int p0) { return 0; }
    }

    public static class Query {
        public static final int ORDER_ASCENDING = 1;
        public static final int ORDER_DESCENDING = 2;
        private long[] mIds;
        private java.lang.Integer mStatusFlags;
        private java.lang.String mFilterString;
        private java.lang.String mOrderByColumn;
        private int mOrderDirection;
        private boolean mOnlyIncludeVisibleInDownloadsUi;
        public Query() {}
        public android.app.DownloadManager.Query setFilterById(long... p0) { return null; }
        public android.app.DownloadManager.Query setFilterByString(java.lang.String p0) { return null; }
        public android.app.DownloadManager.Query setFilterByStatus(int p0) { return null; }
        public android.app.DownloadManager.Query setOnlyIncludeVisibleInDownloadsUi(boolean p0) { return null; }
        public android.app.DownloadManager.Query orderBy(java.lang.String p0, int p1) { return null; }
        android.database.Cursor runQuery(android.content.ContentResolver p0, java.lang.String[] p1, android.net.Uri p2) { return null; }
        private java.lang.String joinStrings(java.lang.String p0, java.lang.Iterable<java.lang.String> p1) { return null; }
        private java.lang.String statusClause(java.lang.String p0, int p1) { return null; }
    }

    public static class Request {
        public static final int NETWORK_MOBILE = 1;
        public static final int NETWORK_WIFI = 2;
        @java.lang.Deprecated
        public static final int NETWORK_BLUETOOTH = 4;
        private android.net.Uri mUri;
        private android.net.Uri mDestinationUri;
        private java.util.List<android.util.Pair<java.lang.String, java.lang.String>> mRequestHeaders;
        private java.lang.CharSequence mTitle;
        private java.lang.CharSequence mDescription;
        private java.lang.String mMimeType;
        private int mAllowedNetworkTypes;
        private boolean mRoamingAllowed;
        private boolean mMeteredAllowed;
        private int mFlags;
        private boolean mIsVisibleInDownloadsUi;
        private boolean mScannable;
        private static final int SCANNABLE_VALUE_YES = 0;
        private static final int SCANNABLE_VALUE_NO = 2;
        public static final int VISIBILITY_VISIBLE = 0;
        public static final int VISIBILITY_VISIBLE_NOTIFY_COMPLETED = 1;
        public static final int VISIBILITY_HIDDEN = 2;
        public static final int VISIBILITY_VISIBLE_NOTIFY_ONLY_COMPLETION = 3;
        private int mNotificationVisibility;
        public Request(android.net.Uri p0) {}
        Request(java.lang.String p0) {}
        public android.app.DownloadManager.Request setDestinationUri(android.net.Uri p0) { return null; }
        public android.app.DownloadManager.Request setDestinationInExternalFilesDir(android.content.Context p0, java.lang.String p1, java.lang.String p2) { return null; }
        public android.app.DownloadManager.Request setDestinationInExternalPublicDir(java.lang.String p0, java.lang.String p1) { return null; }
        private void setDestinationFromBase(java.io.File p0, java.lang.String p1) {}
        @java.lang.Deprecated
        public void allowScanningByMediaScanner() {}
        public android.app.DownloadManager.Request addRequestHeader(java.lang.String p0, java.lang.String p1) { return null; }
        public android.app.DownloadManager.Request setTitle(java.lang.CharSequence p0) { return null; }
        public android.app.DownloadManager.Request setDescription(java.lang.CharSequence p0) { return null; }
        public android.app.DownloadManager.Request setMimeType(java.lang.String p0) { return null; }
        @java.lang.Deprecated
        public android.app.DownloadManager.Request setShowRunningNotification(boolean p0) { return null; }
        public android.app.DownloadManager.Request setNotificationVisibility(int p0) { return null; }
        public android.app.DownloadManager.Request setAllowedNetworkTypes(int p0) { return null; }
        public android.app.DownloadManager.Request setAllowedOverRoaming(boolean p0) { return null; }
        public android.app.DownloadManager.Request setAllowedOverMetered(boolean p0) { return null; }
        public android.app.DownloadManager.Request setRequiresCharging(boolean p0) { return null; }
        public android.app.DownloadManager.Request setRequiresDeviceIdle(boolean p0) { return null; }
        @java.lang.Deprecated
        public android.app.DownloadManager.Request setVisibleInDownloadsUi(boolean p0) { return null; }
        android.content.ContentValues toContentValues(java.lang.String p0) { return null; }
        private void encodeHttpHeaders(android.content.ContentValues p0) {}
        private void putIfNonNull(android.content.ContentValues p0, java.lang.String p1, java.lang.Object p2) {}
    }
}
