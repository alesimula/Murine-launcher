package android.provider;

public class BrowserContract {
    public static final java.lang.String AUTHORITY = "com.android.browser";
    public static final android.net.Uri AUTHORITY_URI = null;
    public static final java.lang.String CALLER_IS_SYNCADAPTER = "caller_is_syncadapter";
    public static final java.lang.String PARAM_LIMIT = "limit";
    public BrowserContract() {}

    public static final class Accounts {
        public static final android.net.Uri CONTENT_URI = null;
        public static final java.lang.String ACCOUNT_NAME = "account_name";
        public static final java.lang.String ACCOUNT_TYPE = "account_type";
        public static final java.lang.String ROOT_ID = "root_id";
        public Accounts() {}
    }

    static interface BaseSyncColumns {
        public static final java.lang.String SYNC1 = "sync1";
        public static final java.lang.String SYNC2 = "sync2";
        public static final java.lang.String SYNC3 = "sync3";
        public static final java.lang.String SYNC4 = "sync4";
        public static final java.lang.String SYNC5 = "sync5";
    }

    public static final class Bookmarks implements android.provider.BrowserContract.CommonColumns, android.provider.BrowserContract.ImageColumns, android.provider.BrowserContract.SyncColumns {
        public static final android.net.Uri CONTENT_URI = null;
        public static final int BOOKMARK_TYPE_BOOKMARK = 1;
        public static final int BOOKMARK_TYPE_FOLDER = 2;
        public static final int BOOKMARK_TYPE_BOOKMARK_BAR_FOLDER = 3;
        public static final int BOOKMARK_TYPE_OTHER_FOLDER = 4;
        public static final int BOOKMARK_TYPE_MOBILE_FOLDER = 5;
        public static final java.lang.String TYPE = "type";
        public static final android.net.Uri CONTENT_URI_DEFAULT_FOLDER = null;
        public static final java.lang.String PARAM_ACCOUNT_NAME = "acct_name";
        public static final java.lang.String PARAM_ACCOUNT_TYPE = "acct_type";
        public static final java.lang.String CONTENT_TYPE = "vnd.android.cursor.dir/bookmark";
        public static final java.lang.String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/bookmark";
        public static final java.lang.String QUERY_PARAMETER_SHOW_DELETED = "show_deleted";
        public static final java.lang.String IS_FOLDER = "folder";
        public static final java.lang.String PARENT = "parent";
        public static final java.lang.String PARENT_SOURCE_ID = "parent_source";
        public static final java.lang.String POSITION = "position";
        public static final java.lang.String INSERT_AFTER = "insert_after";
        public static final java.lang.String INSERT_AFTER_SOURCE_ID = "insert_after_source";
        public static final java.lang.String IS_DELETED = "deleted";
        public static final android.net.Uri buildFolderUri(long p0) { return null; }
    }

    public static final class ChromeSyncColumns {
        public static final java.lang.String SERVER_UNIQUE = "sync3";
        public static final java.lang.String FOLDER_NAME_ROOT = "google_chrome";
        public static final java.lang.String FOLDER_NAME_BOOKMARKS = "google_chrome_bookmarks";
        public static final java.lang.String FOLDER_NAME_BOOKMARKS_BAR = "bookmark_bar";
        public static final java.lang.String FOLDER_NAME_OTHER_BOOKMARKS = "other_bookmarks";
        public static final java.lang.String CLIENT_UNIQUE = "sync4";
    }

    public static final class Combined implements android.provider.BrowserContract.CommonColumns, android.provider.BrowserContract.HistoryColumns, android.provider.BrowserContract.ImageColumns {
        public static final android.net.Uri CONTENT_URI = null;
        public static final java.lang.String IS_BOOKMARK = "bookmark";
    }

    static interface CommonColumns {
        public static final java.lang.String _ID = "_id";
        public static final java.lang.String URL = "url";
        public static final java.lang.String TITLE = "title";
        public static final java.lang.String DATE_CREATED = "created";
    }

    public static final class History implements android.provider.BrowserContract.CommonColumns, android.provider.BrowserContract.HistoryColumns, android.provider.BrowserContract.ImageColumns {
        public static final android.net.Uri CONTENT_URI = null;
        public static final java.lang.String CONTENT_TYPE = "vnd.android.cursor.dir/browser-history";
        public static final java.lang.String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/browser-history";
    }

    static interface HistoryColumns {
        public static final java.lang.String DATE_LAST_VISITED = "date";
        public static final java.lang.String VISITS = "visits";
        public static final java.lang.String USER_ENTERED = "user_entered";
    }

    static interface ImageColumns {
        public static final java.lang.String FAVICON = "favicon";
        public static final java.lang.String THUMBNAIL = "thumbnail";
        public static final java.lang.String TOUCH_ICON = "touch_icon";
    }

    static interface ImageMappingColumns {
        public static final java.lang.String IMAGE_ID = "image_id";
        public static final java.lang.String URL = "url";
    }

    public static final class ImageMappings implements android.provider.BrowserContract.ImageMappingColumns {
        public static final android.net.Uri CONTENT_URI = null;
        public static final java.lang.String CONTENT_TYPE = "vnd.android.cursor.dir/image_mappings";
        public static final java.lang.String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/image_mappings";
    }

    public static final class Images implements android.provider.BrowserContract.ImageColumns {
        public static final android.net.Uri CONTENT_URI = null;
        public static final java.lang.String CONTENT_TYPE = "vnd.android.cursor.dir/images";
        public static final java.lang.String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/images";
        public static final int IMAGE_TYPE_FAVICON = 1;
        public static final int IMAGE_TYPE_PRECOMPOSED_TOUCH_ICON = 2;
        public static final int IMAGE_TYPE_TOUCH_ICON = 4;
        public static final java.lang.String TYPE = "type";
        public static final java.lang.String DATA = "data";
        public static final java.lang.String URL = "url_key";
    }

    public static final class Searches {
        public static final android.net.Uri CONTENT_URI = null;
        public static final java.lang.String CONTENT_TYPE = "vnd.android.cursor.dir/searches";
        public static final java.lang.String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/searches";
        public static final java.lang.String _ID = "_id";
        public static final java.lang.String SEARCH = "search";
        public static final java.lang.String DATE = "date";
    }

    public static final class Settings {
        public static final android.net.Uri CONTENT_URI = null;
        public static final java.lang.String KEY = "key";
        public static final java.lang.String VALUE = "value";
        public static final java.lang.String KEY_SYNC_ENABLED = "sync_enabled";
        public static boolean isSyncEnabled(android.content.Context p0) { return false; }
        public static void setSyncEnabled(android.content.Context p0, boolean p1) {}
    }

    static interface SyncColumns extends android.provider.BrowserContract.BaseSyncColumns {
        public static final java.lang.String ACCOUNT_NAME = "account_name";
        public static final java.lang.String ACCOUNT_TYPE = "account_type";
        public static final java.lang.String SOURCE_ID = "sourceid";
        public static final java.lang.String VERSION = "version";
        public static final java.lang.String DIRTY = "dirty";
        public static final java.lang.String DATE_MODIFIED = "modified";
    }

    public static final class SyncState implements android.provider.SyncStateContract.Columns {
        public static final java.lang.String CONTENT_DIRECTORY = "syncstate";
        public static final android.net.Uri CONTENT_URI = null;
        public static byte[] get(android.content.ContentProviderClient p0, android.accounts.Account p1) throws android.os.RemoteException { return null; }
        public static android.util.Pair<android.net.Uri, byte[]> getWithUri(android.content.ContentProviderClient p0, android.accounts.Account p1) throws android.os.RemoteException { return null; }
        public static void set(android.content.ContentProviderClient p0, android.accounts.Account p1, byte[] p2) throws android.os.RemoteException {}
        public static android.content.ContentProviderOperation newSetOperation(android.accounts.Account p0, byte[] p1) { return null; }
    }
}
