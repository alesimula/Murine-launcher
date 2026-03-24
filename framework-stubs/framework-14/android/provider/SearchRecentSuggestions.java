package android.provider;

public class SearchRecentSuggestions {
    public static final java.lang.String[] QUERIES_PROJECTION_1LINE = null;
    public static final java.lang.String[] QUERIES_PROJECTION_2LINE = null;
    public static final int QUERIES_PROJECTION_DATE_INDEX = 1;
    public static final int QUERIES_PROJECTION_QUERY_INDEX = 2;
    public static final int QUERIES_PROJECTION_DISPLAY1_INDEX = 3;
    public static final int QUERIES_PROJECTION_DISPLAY2_INDEX = 4;
    public SearchRecentSuggestions(android.content.Context p0, java.lang.String p1, int p2) {}
    public void saveRecentQuery(java.lang.String p0, java.lang.String p1) {}
    void waitForSave() {}
    public void clearHistory() {}
    protected void truncateHistory(android.content.ContentResolver p0, int p1) {}

    private static class SuggestionColumns implements android.provider.BaseColumns {
        public static final java.lang.String DISPLAY1 = "display1";
        public static final java.lang.String DISPLAY2 = "display2";
        public static final java.lang.String QUERY = "query";
        public static final java.lang.String DATE = "date";
    }
}
