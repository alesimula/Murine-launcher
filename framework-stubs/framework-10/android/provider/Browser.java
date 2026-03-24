package android.provider;

public class Browser {
    private static final java.lang.String LOGTAG = "browser";
    public static final android.net.Uri BOOKMARKS_URI = null;
    public static final java.lang.String INITIAL_ZOOM_LEVEL = "browser.initialZoomLevel";
    public static final java.lang.String EXTRA_APPLICATION_ID = "com.android.browser.application_id";
    public static final java.lang.String EXTRA_HEADERS = "com.android.browser.headers";
    public static final java.lang.String[] HISTORY_PROJECTION = null;
    public static final int HISTORY_PROJECTION_ID_INDEX = 0;
    public static final int HISTORY_PROJECTION_URL_INDEX = 1;
    public static final int HISTORY_PROJECTION_VISITS_INDEX = 2;
    public static final int HISTORY_PROJECTION_DATE_INDEX = 3;
    public static final int HISTORY_PROJECTION_BOOKMARK_INDEX = 4;
    public static final int HISTORY_PROJECTION_TITLE_INDEX = 5;
    public static final int HISTORY_PROJECTION_FAVICON_INDEX = 6;
    public static final int HISTORY_PROJECTION_THUMBNAIL_INDEX = 7;
    public static final int HISTORY_PROJECTION_TOUCH_ICON_INDEX = 8;
    public static final java.lang.String[] TRUNCATE_HISTORY_PROJECTION = null;
    public static final int TRUNCATE_HISTORY_PROJECTION_ID_INDEX = 0;
    public static final int TRUNCATE_N_OLDEST = 5;
    public static final android.net.Uri SEARCHES_URI = null;
    public static final java.lang.String[] SEARCHES_PROJECTION = null;
    public static final int SEARCHES_PROJECTION_SEARCH_INDEX = 1;
    public static final int SEARCHES_PROJECTION_DATE_INDEX = 2;
    private static final int MAX_HISTORY_COUNT = 250;
    public static final java.lang.String EXTRA_CREATE_NEW_TAB = "create_new_tab";
    public static final java.lang.String EXTRA_SHARE_SCREENSHOT = "share_screenshot";
    public static final java.lang.String EXTRA_SHARE_FAVICON = "share_favicon";
    public Browser() {}
    public static final void saveBookmark(android.content.Context p0, java.lang.String p1, java.lang.String p2) {}
    public static final void sendString(android.content.Context p0, java.lang.String p1) {}
    @android.annotation.UnsupportedAppUsage
    public static final void sendString(android.content.Context p0, java.lang.String p1, java.lang.String p2) {}
    public static final android.database.Cursor getAllBookmarks(android.content.ContentResolver p0) throws java.lang.IllegalStateException { return null; }
    public static final android.database.Cursor getAllVisitedUrls(android.content.ContentResolver p0) throws java.lang.IllegalStateException { return null; }
    private static final void addOrUrlEquals(java.lang.StringBuilder p0) {}
    private static final android.database.Cursor getVisitedLike(android.content.ContentResolver p0, java.lang.String p1) { return null; }
    public static final void updateVisitedHistory(android.content.ContentResolver p0, java.lang.String p1, boolean p2) {}
    @java.lang.Deprecated
    @android.annotation.UnsupportedAppUsage
    public static final java.lang.String[] getVisitedHistory(android.content.ContentResolver p0) { return null; }
    public static final void truncateHistory(android.content.ContentResolver p0) {}
    public static final boolean canClearHistory(android.content.ContentResolver p0) { return false; }
    public static final void clearHistory(android.content.ContentResolver p0) {}
    public static final void deleteHistoryTimeFrame(android.content.ContentResolver p0, long p1, long p2) {}
    public static final void deleteFromHistory(android.content.ContentResolver p0, java.lang.String p1) {}
    public static final void addSearchUrl(android.content.ContentResolver p0, java.lang.String p1) {}
    public static final void clearSearches(android.content.ContentResolver p0) {}
    public static final void requestAllIcons(android.content.ContentResolver p0, java.lang.String p1, android.webkit.WebIconDatabase.IconListener p2) {}

    public static class SearchColumns implements android.provider.BaseColumns {
        @java.lang.Deprecated
        public static final java.lang.String URL = "url";
        public static final java.lang.String SEARCH = "search";
        public static final java.lang.String DATE = "date";
        public SearchColumns() {}
    }

    public static class BookmarkColumns implements android.provider.BaseColumns {
        public static final java.lang.String URL = "url";
        public static final java.lang.String VISITS = "visits";
        public static final java.lang.String DATE = "date";
        public static final java.lang.String BOOKMARK = "bookmark";
        public static final java.lang.String TITLE = "title";
        public static final java.lang.String CREATED = "created";
        public static final java.lang.String FAVICON = "favicon";
        public static final java.lang.String THUMBNAIL = "thumbnail";
        public static final java.lang.String TOUCH_ICON = "touch_icon";
        public static final java.lang.String USER_ENTERED = "user_entered";
        public BookmarkColumns() {}
    }
}
