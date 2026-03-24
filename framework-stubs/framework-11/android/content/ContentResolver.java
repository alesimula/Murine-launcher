package android.content;

public abstract class ContentResolver implements android.content.ContentInterface {
    public static final boolean DEPRECATE_DATA_COLUMNS = Boolean.valueOf(false);
    public static final java.lang.String DEPRECATE_DATA_PREFIX = "/mnt/content/";
    @java.lang.Deprecated
    public static final java.lang.String SYNC_EXTRAS_ACCOUNT = "account";
    public static final java.lang.String SYNC_EXTRAS_EXPEDITED = "expedited";
    public static final java.lang.String SYNC_EXTRAS_REQUIRE_CHARGING = "require_charging";
    @java.lang.Deprecated
    public static final java.lang.String SYNC_EXTRAS_FORCE = "force";
    public static final java.lang.String SYNC_EXTRAS_IGNORE_SETTINGS = "ignore_settings";
    public static final java.lang.String SYNC_EXTRAS_IGNORE_BACKOFF = "ignore_backoff";
    public static final java.lang.String SYNC_EXTRAS_DO_NOT_RETRY = "do_not_retry";
    public static final java.lang.String SYNC_EXTRAS_MANUAL = "force";
    public static final java.lang.String SYNC_EXTRAS_UPLOAD = "upload";
    public static final java.lang.String SYNC_EXTRAS_OVERRIDE_TOO_MANY_DELETIONS = "deletions_override";
    public static final java.lang.String SYNC_EXTRAS_DISCARD_LOCAL_DELETIONS = "discard_deletions";
    public static final java.lang.String SYNC_EXTRAS_EXPECTED_UPLOAD = "expected_upload";
    public static final java.lang.String SYNC_EXTRAS_EXPECTED_DOWNLOAD = "expected_download";
    public static final java.lang.String SYNC_EXTRAS_PRIORITY = "sync_priority";
    public static final java.lang.String SYNC_EXTRAS_DISALLOW_METERED = "allow_metered";
    public static final java.lang.String SYNC_VIRTUAL_EXTRAS_EXEMPTION_FLAG = "v_exemption";
    public static final java.lang.String SYNC_EXTRAS_INITIALIZE = "initialize";
    public static final android.content.Intent ACTION_SYNC_CONN_STATUS_CHANGED = null;
    public static final java.lang.String SCHEME_CONTENT = "content";
    public static final java.lang.String SCHEME_ANDROID_RESOURCE = "android.resource";
    public static final java.lang.String SCHEME_FILE = "file";
    public static final java.lang.String EXTRA_SIZE = "android.content.extra.SIZE";
    public static final java.lang.String EXTRA_REFRESH_SUPPORTED = "android.content.extra.REFRESH_SUPPORTED";
    public static final java.lang.String QUERY_ARG_SQL_SELECTION = "android:query-arg-sql-selection";
    public static final java.lang.String QUERY_ARG_SQL_SELECTION_ARGS = "android:query-arg-sql-selection-args";
    public static final java.lang.String QUERY_ARG_SQL_SORT_ORDER = "android:query-arg-sql-sort-order";
    public static final java.lang.String QUERY_ARG_SQL_GROUP_BY = "android:query-arg-sql-group-by";
    public static final java.lang.String QUERY_ARG_SQL_HAVING = "android:query-arg-sql-having";
    public static final java.lang.String QUERY_ARG_SQL_LIMIT = "android:query-arg-sql-limit";
    public static final java.lang.String QUERY_ARG_SORT_COLUMNS = "android:query-arg-sort-columns";
    public static final java.lang.String QUERY_ARG_SORT_DIRECTION = "android:query-arg-sort-direction";
    public static final java.lang.String QUERY_ARG_SORT_COLLATION = "android:query-arg-sort-collation";
    public static final java.lang.String QUERY_ARG_SORT_LOCALE = "android:query-arg-sort-locale";
    public static final java.lang.String QUERY_ARG_GROUP_COLUMNS = "android:query-arg-group-columns";
    public static final java.lang.String EXTRA_HONORED_ARGS = "android.content.extra.HONORED_ARGS";
    public static final int QUERY_SORT_DIRECTION_ASCENDING = 0;
    public static final int QUERY_SORT_DIRECTION_DESCENDING = 1;
    public static final java.lang.String QUERY_ARG_OFFSET = "android:query-arg-offset";
    public static final java.lang.String QUERY_ARG_LIMIT = "android:query-arg-limit";
    public static final java.lang.String EXTRA_TOTAL_COUNT = "android.content.extra.TOTAL_COUNT";
    public static final java.lang.String CURSOR_ITEM_BASE_TYPE = "vnd.android.cursor.item";
    public static final java.lang.String CURSOR_DIR_BASE_TYPE = "vnd.android.cursor.dir";
    public static final java.lang.String ANY_CURSOR_ITEM_TYPE = "vnd.android.cursor.item/*";
    @java.lang.Deprecated
    public static final java.lang.String MIME_TYPE_DEFAULT = "application/octet-stream";
    public static final int SYNC_ERROR_SYNC_ALREADY_IN_PROGRESS = 1;
    public static final int SYNC_ERROR_AUTHENTICATION = 2;
    public static final int SYNC_ERROR_IO = 3;
    public static final int SYNC_ERROR_PARSE = 4;
    public static final int SYNC_ERROR_CONFLICT = 5;
    public static final int SYNC_ERROR_TOO_MANY_DELETIONS = 6;
    public static final int SYNC_ERROR_TOO_MANY_RETRIES = 7;
    public static final int SYNC_ERROR_INTERNAL = 8;
    private static final java.lang.String[] SYNC_ERROR_NAMES = null;
    public static final int SYNC_OBSERVER_TYPE_SETTINGS = 1;
    public static final int SYNC_OBSERVER_TYPE_PENDING = 2;
    public static final int SYNC_OBSERVER_TYPE_ACTIVE = 4;
    public static final int SYNC_OBSERVER_TYPE_STATUS = 8;
    public static final int SYNC_OBSERVER_TYPE_ALL = 2147483647;
    public static final int NOTIFY_SYNC_TO_NETWORK = 1;
    public static final int NOTIFY_SKIP_NOTIFY_FOR_DESCENDANTS = 2;
    public static final int NOTIFY_INSERT = 4;
    public static final int NOTIFY_UPDATE = 8;
    public static final int NOTIFY_DELETE = 16;
    public static final int NOTIFY_NO_DELAY = 32768;
    public static final int SYNC_EXEMPTION_NONE = 0;
    public static final int SYNC_EXEMPTION_PROMOTE_BUCKET = 1;
    public static final int SYNC_EXEMPTION_PROMOTE_BUCKET_WITH_TEMP = 2;
    private static final boolean ENABLE_CONTENT_SAMPLE = false;
    private static final int SLOW_THRESHOLD_MILLIS = 500;
    private final java.util.Random mRandom = null;
    public static final java.lang.String REMOTE_CALLBACK_RESULT = "result";
    public static final java.lang.String REMOTE_CALLBACK_ERROR = "error";
    public static final int CONTENT_PROVIDER_PUBLISH_TIMEOUT_MILLIS = 10000;
    public static final int CONTENT_PROVIDER_READY_TIMEOUT_MILLIS = 20000;
    private static final int CONTENT_PROVIDER_TIMEOUT_MILLIS = 3000;
    private static final int REMOTE_CONTENT_PROVIDER_TIMEOUT_MILLIS = 23000;
    public static final java.lang.String CONTENT_SERVICE_NAME = "content";
    private static volatile android.content.IContentService sContentService;
    private final android.content.Context mContext = null;
    final java.lang.String mPackageName = null;
    final java.lang.String mAttributionTag = null;
    final int mTargetSdkVersion = 0;
    final android.content.ContentInterface mWrapped = null;
    private static final java.lang.String TAG = "ContentResolver";
    public static java.lang.String syncErrorToString(int p0) { return null; }
    public static int syncErrorStringToInt(java.lang.String p0) { return 0; }
    public ContentResolver(android.content.Context p0) {}
    public ContentResolver(android.content.Context p0, android.content.ContentInterface p1) {}
    public static android.content.ContentResolver wrap(android.content.ContentInterface p0) { return null; }
    public static android.content.ContentResolver wrap(android.content.ContentProvider p0) { return null; }
    public static android.content.ContentResolver wrap(android.content.ContentProviderClient p0) { return null; }
    protected abstract android.content.IContentProvider acquireProvider(android.content.Context p0, java.lang.String p1);
    protected android.content.IContentProvider acquireExistingProvider(android.content.Context p0, java.lang.String p1) { return null; }
    public abstract boolean releaseProvider(android.content.IContentProvider p0);
    protected abstract android.content.IContentProvider acquireUnstableProvider(android.content.Context p0, java.lang.String p1);
    public abstract boolean releaseUnstableProvider(android.content.IContentProvider p0);
    public abstract void unstableProviderDied(android.content.IContentProvider p0);
    public void appNotRespondingViaProvider(android.content.IContentProvider p0) {}
    public final java.lang.String getType(android.net.Uri p0) { return null; }
    public java.lang.String[] getStreamTypes(android.net.Uri p0, java.lang.String p1) { return null; }
    public final android.database.Cursor query(android.net.Uri p0, java.lang.String[] p1, java.lang.String p2, java.lang.String[] p3, java.lang.String p4) { return null; }
    public final android.database.Cursor query(android.net.Uri p0, java.lang.String[] p1, java.lang.String p2, java.lang.String[] p3, java.lang.String p4, android.os.CancellationSignal p5) { return null; }
    public final android.database.Cursor query(android.net.Uri p0, java.lang.String[] p1, android.os.Bundle p2, android.os.CancellationSignal p3) { return null; }
    public final android.net.Uri canonicalizeOrElse(android.net.Uri p0) { return null; }
    public final android.net.Uri canonicalize(android.net.Uri p0) { return null; }
    public final android.net.Uri uncanonicalize(android.net.Uri p0) { return null; }
    public final boolean refresh(android.net.Uri p0, android.os.Bundle p1, android.os.CancellationSignal p2) { return false; }
    @android.annotation.SystemApi
    public int checkUriPermission(android.net.Uri p0, int p1, int p2) { return 0; }
    public final java.io.InputStream openInputStream(android.net.Uri p0) throws java.io.FileNotFoundException { return null; }
    public final java.io.OutputStream openOutputStream(android.net.Uri p0) throws java.io.FileNotFoundException { return null; }
    public final java.io.OutputStream openOutputStream(android.net.Uri p0, java.lang.String p1) throws java.io.FileNotFoundException { return null; }
    public final android.os.ParcelFileDescriptor openFile(android.net.Uri p0, java.lang.String p1, android.os.CancellationSignal p2) throws java.io.FileNotFoundException { return null; }
    public final android.os.ParcelFileDescriptor openFileDescriptor(android.net.Uri p0, java.lang.String p1) throws java.io.FileNotFoundException { return null; }
    public final android.os.ParcelFileDescriptor openFileDescriptor(android.net.Uri p0, java.lang.String p1, android.os.CancellationSignal p2) throws java.io.FileNotFoundException { return null; }
    public final android.content.res.AssetFileDescriptor openAssetFile(android.net.Uri p0, java.lang.String p1, android.os.CancellationSignal p2) throws java.io.FileNotFoundException { return null; }
    public final android.content.res.AssetFileDescriptor openAssetFileDescriptor(android.net.Uri p0, java.lang.String p1) throws java.io.FileNotFoundException { return null; }
    public final android.content.res.AssetFileDescriptor openAssetFileDescriptor(android.net.Uri p0, java.lang.String p1, android.os.CancellationSignal p2) throws java.io.FileNotFoundException { return null; }
    public final android.content.res.AssetFileDescriptor openTypedAssetFile(android.net.Uri p0, java.lang.String p1, android.os.Bundle p2, android.os.CancellationSignal p3) throws java.io.FileNotFoundException { return null; }
    public final android.content.res.AssetFileDescriptor openTypedAssetFileDescriptor(android.net.Uri p0, java.lang.String p1, android.os.Bundle p2) throws java.io.FileNotFoundException { return null; }
    public final android.content.res.AssetFileDescriptor openTypedAssetFileDescriptor(android.net.Uri p0, java.lang.String p1, android.os.Bundle p2, android.os.CancellationSignal p3) throws java.io.FileNotFoundException { return null; }
    public android.content.ContentResolver.OpenResourceIdResult getResourceId(android.net.Uri p0) throws java.io.FileNotFoundException { return null; }
    public final android.net.Uri insert(android.net.Uri p0, android.content.ContentValues p1) { return null; }
    public final android.net.Uri insert(android.net.Uri p0, android.content.ContentValues p1, android.os.Bundle p2) { return null; }
    public android.content.ContentProviderResult[] applyBatch(java.lang.String p0, java.util.ArrayList<android.content.ContentProviderOperation> p1) throws android.os.RemoteException, android.content.OperationApplicationException { return null; }
    public final int bulkInsert(android.net.Uri p0, android.content.ContentValues[] p1) { return 0; }
    public final int delete(android.net.Uri p0, java.lang.String p1, java.lang.String[] p2) { return 0; }
    public final int delete(android.net.Uri p0, android.os.Bundle p1) { return 0; }
    public final int update(android.net.Uri p0, android.content.ContentValues p1, java.lang.String p2, java.lang.String[] p3) { return 0; }
    public final int update(android.net.Uri p0, android.content.ContentValues p1, android.os.Bundle p2) { return 0; }
    public final android.os.Bundle call(android.net.Uri p0, java.lang.String p1, java.lang.String p2, android.os.Bundle p3) { return null; }
    public final android.os.Bundle call(java.lang.String p0, java.lang.String p1, java.lang.String p2, android.os.Bundle p3) { return null; }
    public final android.content.IContentProvider acquireProvider(android.net.Uri p0) { return null; }
    public final android.content.IContentProvider acquireExistingProvider(android.net.Uri p0) { return null; }
    public final android.content.IContentProvider acquireProvider(java.lang.String p0) { return null; }
    public final android.content.IContentProvider acquireUnstableProvider(android.net.Uri p0) { return null; }
    public final android.content.IContentProvider acquireUnstableProvider(java.lang.String p0) { return null; }
    public final android.content.ContentProviderClient acquireContentProviderClient(android.net.Uri p0) { return null; }
    public final android.content.ContentProviderClient acquireContentProviderClient(java.lang.String p0) { return null; }
    public final android.content.ContentProviderClient acquireUnstableContentProviderClient(android.net.Uri p0) { return null; }
    public final android.content.ContentProviderClient acquireUnstableContentProviderClient(java.lang.String p0) { return null; }
    public final void registerContentObserver(android.net.Uri p0, boolean p1, android.database.ContentObserver p2) {}
    public final void registerContentObserver(android.net.Uri p0, boolean p1, android.database.ContentObserver p2, int p3) {}
    public final void unregisterContentObserver(android.database.ContentObserver p0) {}
    public void notifyChange(android.net.Uri p0, android.database.ContentObserver p1) {}
    @java.lang.Deprecated
    public void notifyChange(android.net.Uri p0, android.database.ContentObserver p1, boolean p2) {}
    public void notifyChange(android.net.Uri p0, android.database.ContentObserver p1, int p2) {}
    @java.lang.Deprecated
    public void notifyChange(java.lang.Iterable<android.net.Uri> p0, android.database.ContentObserver p1, int p2) {}
    public void notifyChange(java.util.Collection<android.net.Uri> p0, android.database.ContentObserver p1, int p2) {}
    @java.lang.Deprecated
    public void notifyChange(android.net.Uri p0, android.database.ContentObserver p1, boolean p2, int p3) {}
    public void notifyChange(android.net.Uri p0, android.database.ContentObserver p1, int p2, int p3) {}
    public void notifyChange(android.net.Uri[] p0, android.database.ContentObserver p1, int p2, int p3) {}
    public void takePersistableUriPermission(android.net.Uri p0, int p1) {}
    public void takePersistableUriPermission(java.lang.String p0, android.net.Uri p1, int p2) {}
    public void releasePersistableUriPermission(android.net.Uri p0, int p1) {}
    public java.util.List<android.content.UriPermission> getPersistedUriPermissions() { return null; }
    public java.util.List<android.content.UriPermission> getOutgoingPersistedUriPermissions() { return null; }
    public java.util.List<android.content.UriPermission> getOutgoingUriPermissions() { return null; }
    @java.lang.Deprecated
    public void startSync(android.net.Uri p0, android.os.Bundle p1) {}
    public static void requestSync(android.accounts.Account p0, java.lang.String p1, android.os.Bundle p2) {}
    public static void requestSyncAsUser(android.accounts.Account p0, java.lang.String p1, int p2, android.os.Bundle p3) {}
    public static void requestSync(android.content.SyncRequest p0) {}
    public static void validateSyncExtrasBundle(android.os.Bundle p0) {}
    @java.lang.Deprecated
    public void cancelSync(android.net.Uri p0) {}
    public static void cancelSync(android.accounts.Account p0, java.lang.String p1) {}
    public static void cancelSyncAsUser(android.accounts.Account p0, java.lang.String p1, int p2) {}
    public static android.content.SyncAdapterType[] getSyncAdapterTypes() { return null; }
    public static android.content.SyncAdapterType[] getSyncAdapterTypesAsUser(int p0) { return null; }
    public static java.lang.String[] getSyncAdapterPackagesForAuthorityAsUser(java.lang.String p0, int p1) { return null; }
    public static boolean getSyncAutomatically(android.accounts.Account p0, java.lang.String p1) { return false; }
    public static boolean getSyncAutomaticallyAsUser(android.accounts.Account p0, java.lang.String p1, int p2) { return false; }
    public static void setSyncAutomatically(android.accounts.Account p0, java.lang.String p1, boolean p2) {}
    public static void setSyncAutomaticallyAsUser(android.accounts.Account p0, java.lang.String p1, boolean p2, int p3) {}
    public static void addPeriodicSync(android.accounts.Account p0, java.lang.String p1, android.os.Bundle p2, long p3) {}
    public static boolean invalidPeriodicExtras(android.os.Bundle p0) { return false; }
    public static void removePeriodicSync(android.accounts.Account p0, java.lang.String p1, android.os.Bundle p2) {}
    public static void cancelSync(android.content.SyncRequest p0) {}
    public static java.util.List<android.content.PeriodicSync> getPeriodicSyncs(android.accounts.Account p0, java.lang.String p1) { return null; }
    public static int getIsSyncable(android.accounts.Account p0, java.lang.String p1) { return 0; }
    public static int getIsSyncableAsUser(android.accounts.Account p0, java.lang.String p1, int p2) { return 0; }
    public static void setIsSyncable(android.accounts.Account p0, java.lang.String p1, int p2) {}
    public static void setIsSyncableAsUser(android.accounts.Account p0, java.lang.String p1, int p2, int p3) {}
    public static boolean getMasterSyncAutomatically() { return false; }
    public static boolean getMasterSyncAutomaticallyAsUser(int p0) { return false; }
    public static void setMasterSyncAutomatically(boolean p0) {}
    public static void setMasterSyncAutomaticallyAsUser(boolean p0, int p1) {}
    public static boolean isSyncActive(android.accounts.Account p0, java.lang.String p1) { return false; }
    @java.lang.Deprecated
    public static android.content.SyncInfo getCurrentSync() { return null; }
    public static java.util.List<android.content.SyncInfo> getCurrentSyncs() { return null; }
    public static java.util.List<android.content.SyncInfo> getCurrentSyncsAsUser(int p0) { return null; }
    public static android.content.SyncStatusInfo getSyncStatus(android.accounts.Account p0, java.lang.String p1) { return null; }
    public static android.content.SyncStatusInfo getSyncStatusAsUser(android.accounts.Account p0, java.lang.String p1, int p2) { return null; }
    public static boolean isSyncPending(android.accounts.Account p0, java.lang.String p1) { return false; }
    public static boolean isSyncPendingAsUser(android.accounts.Account p0, java.lang.String p1, int p2) { return false; }
    public static java.lang.Object addStatusChangeListener(int p0, android.content.SyncStatusObserver p1) { return null; }
    public static void removeStatusChangeListener(java.lang.Object p0) {}
    @android.annotation.SystemApi
    public void putCache(android.net.Uri p0, android.os.Bundle p1) {}
    @android.annotation.SystemApi
    public android.os.Bundle getCache(android.net.Uri p0) { return null; }
    public int getTargetSdkVersion() { return 0; }
    private int samplePercentForDuration(long p0) { return 0; }
    private void maybeLogQueryToEventLog(long p0, android.net.Uri p1, java.lang.String[] p2, android.os.Bundle p3) {}
    private void maybeLogUpdateToEventLog(long p0, android.net.Uri p1, java.lang.String p2, java.lang.String p3) {}
    public static android.content.IContentService getContentService() { return null; }
    public java.lang.String getPackageName() { return null; }
    public java.lang.String getAttributionTag() { return null; }
    public int resolveUserId(android.net.Uri p0) { return 0; }
    public int getUserId() { return 0; }
    @java.lang.Deprecated
    public android.graphics.drawable.Drawable getTypeDrawable(java.lang.String p0) { return null; }
    public final android.content.ContentResolver.MimeTypeInfo getTypeInfo(java.lang.String p0) { return null; }
    public static android.os.Bundle createSqlQueryBundle(java.lang.String p0, java.lang.String[] p1) { return null; }
    public static android.os.Bundle createSqlQueryBundle(java.lang.String p0, java.lang.String[] p1, java.lang.String p2) { return null; }
    public static android.os.Bundle includeSqlSelectionArgs(android.os.Bundle p0, java.lang.String p1, java.lang.String[] p2) { return null; }
    public static java.lang.String createSqlSortClause(android.os.Bundle p0) { return null; }
    public android.graphics.Bitmap loadThumbnail(android.net.Uri p0, android.util.Size p1, android.os.CancellationSignal p2) throws java.io.IOException { return null; }
    public static android.graphics.Bitmap loadThumbnail(android.content.ContentInterface p0, android.net.Uri p1, android.util.Size p2, android.os.CancellationSignal p3, int p4) throws java.io.IOException { return null; }
    public static void onDbCorruption(java.lang.String p0, java.lang.String p1, java.lang.Throwable p2) {}
    @android.annotation.SystemApi
    @android.annotation.SuppressLint("StreamFiles")
    public static android.net.Uri decodeFromFile(java.io.File p0) { return null; }
    @android.annotation.SystemApi
    @android.annotation.SuppressLint("StreamFiles")
    public static java.io.File encodeToFile(android.net.Uri p0) { return null; }
    public static android.net.Uri translateDeprecatedDataPath(java.lang.String p0) { return null; }
    public static java.lang.String translateDeprecatedDataPath(android.net.Uri p0) { return null; }

    private final class CursorWrapperInner extends android.database.CrossProcessCursorWrapper {
        private final android.content.IContentProvider mContentProvider = null;
        private final java.util.concurrent.atomic.AtomicBoolean mProviderReleased = null;
        CursorWrapperInner(android.content.ContentResolver p0, android.database.Cursor p1, android.content.IContentProvider p2) { super(null); }
        public void close() {}
        protected void finalize() throws java.lang.Throwable {}
    }

    public static final class MimeTypeInfo {
        private final android.graphics.drawable.Icon mIcon = null;
        private final java.lang.CharSequence mLabel = null;
        private final java.lang.CharSequence mContentDescription = null;
        public MimeTypeInfo(android.graphics.drawable.Icon p0, java.lang.CharSequence p1, java.lang.CharSequence p2) {}
        public android.graphics.drawable.Icon getIcon() { return null; }
        public java.lang.CharSequence getLabel() { return null; }
        public java.lang.CharSequence getContentDescription() { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface NotifyFlags {
    }

    public class OpenResourceIdResult {
        public android.content.res.Resources r;
        public int id;
        public OpenResourceIdResult(android.content.ContentResolver p0) {}
    }

    private final class ParcelFileDescriptorInner extends android.os.ParcelFileDescriptor {
        private final android.content.IContentProvider mContentProvider = null;
        private final java.util.concurrent.atomic.AtomicBoolean mProviderReleased = null;
        ParcelFileDescriptorInner(android.content.ContentResolver p0, android.os.ParcelFileDescriptor p1, android.content.IContentProvider p2) { super((android.os.ParcelFileDescriptor)null); }
        public void releaseResources() {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface QueryCollator {
    }

    private static abstract class ResultListener<T extends java.lang.Object> implements android.os.RemoteCallback.OnResultListener {
        public boolean done;
        public T result;
        public java.lang.RuntimeException exception;
        private ResultListener() {}
        public void onResult(android.os.Bundle p0) {}
        protected abstract T getResultFromBundle(android.os.Bundle p0);
        public void waitForResult(long p0) {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface SortDirection {
    }

    private static class StringResultListener extends android.content.ContentResolver.ResultListener<java.lang.String> {
        private StringResultListener() { super(); }
        protected java.lang.String getResultFromBundle(android.os.Bundle p0) { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface SyncExemption {
    }

    private static class UriResultListener extends android.content.ContentResolver.ResultListener<android.net.Uri> {
        private UriResultListener() { super(); }
        protected android.net.Uri getResultFromBundle(android.os.Bundle p0) { return null; }
    }
}
