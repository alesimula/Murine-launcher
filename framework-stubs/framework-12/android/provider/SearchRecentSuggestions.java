package android.provider;

public class SearchRecentSuggestions {
    private static final java.lang.String LOG_TAG = "SearchSuggestions";
    public static final java.lang.String[] QUERIES_PROJECTION_1LINE = null;
    public static final java.lang.String[] QUERIES_PROJECTION_2LINE = null;
    public static final int QUERIES_PROJECTION_DATE_INDEX = 1;
    public static final int QUERIES_PROJECTION_QUERY_INDEX = 2;
    public static final int QUERIES_PROJECTION_DISPLAY1_INDEX = 3;
    public static final int QUERIES_PROJECTION_DISPLAY2_INDEX = 4;
    private static final int MAX_HISTORY_COUNT = 250;
    private final android.content.Context mContext = null;
    private final java.lang.String mAuthority = null;
    private final boolean mTwoLineDisplay = false;
    private final android.net.Uri mSuggestionsUri = null;
    private static final java.util.concurrent.Semaphore sWritesInProgress = null;
    public SearchRecentSuggestions(android.content.Context p0, java.lang.String p1, int p2) {}
    public void saveRecentQuery(java.lang.String p0, java.lang.String p1) {}
    void waitForSave() {}
    private void saveRecentQueryBlocking(java.lang.String p0, java.lang.String p1) {}
    public void clearHistory() {}
    protected void truncateHistory(android.content.ContentResolver p0, int p1) {}

    private static class SuggestionColumns implements android.provider.BaseColumns {
        public static final java.lang.String DISPLAY1 = "display1";
        public static final java.lang.String DISPLAY2 = "display2";
        public static final java.lang.String QUERY = "query";
        public static final java.lang.String DATE = "date";
        private SuggestionColumns() {}
    }
}
