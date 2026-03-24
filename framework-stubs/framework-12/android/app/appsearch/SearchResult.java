package android.app.appsearch;

public final class SearchResult {
    static final java.lang.String DOCUMENT_FIELD = "document";
    static final java.lang.String MATCH_INFOS_FIELD = "matchInfos";
    static final java.lang.String PACKAGE_NAME_FIELD = "packageName";
    static final java.lang.String DATABASE_NAME_FIELD = "databaseName";
    static final java.lang.String RANKING_SIGNAL_FIELD = "rankingSignal";
    private final android.os.Bundle mBundle = null;
    private android.app.appsearch.GenericDocument mDocument;
    private java.util.List<android.app.appsearch.SearchResult.MatchInfo> mMatchInfos;
    public SearchResult(android.os.Bundle p0) {}
    public android.os.Bundle getBundle() { return null; }
    public android.app.appsearch.GenericDocument getGenericDocument() { return null; }
    public java.util.List<android.app.appsearch.SearchResult.MatchInfo> getMatchInfos() { return null; }
    public java.lang.String getPackageName() { return null; }
    public java.lang.String getDatabaseName() { return null; }
    public double getRankingSignal() { return 0.0; }

    public static final class Builder {
        private final java.lang.String mPackageName = null;
        private final java.lang.String mDatabaseName = null;
        private java.util.ArrayList<android.os.Bundle> mMatchInfoBundles;
        private android.app.appsearch.GenericDocument mGenericDocument;
        private double mRankingSignal;
        private boolean mBuilt;
        public Builder(java.lang.String p0, java.lang.String p1) {}
        public android.app.appsearch.SearchResult.Builder setGenericDocument(android.app.appsearch.GenericDocument p0) { return null; }
        public android.app.appsearch.SearchResult.Builder addMatchInfo(android.app.appsearch.SearchResult.MatchInfo p0) { return null; }
        public android.app.appsearch.SearchResult.Builder setRankingSignal(double p0) { return null; }
        public android.app.appsearch.SearchResult build() { return null; }
        private void resetIfBuilt() {}
    }

    public static final class MatchInfo {
        private static final java.lang.String PROPERTY_PATH_FIELD = "propertyPath";
        private static final java.lang.String EXACT_MATCH_RANGE_LOWER_FIELD = "exactMatchRangeLower";
        private static final java.lang.String EXACT_MATCH_RANGE_UPPER_FIELD = "exactMatchRangeUpper";
        private static final java.lang.String SNIPPET_RANGE_LOWER_FIELD = "snippetRangeLower";
        private static final java.lang.String SNIPPET_RANGE_UPPER_FIELD = "snippetRangeUpper";
        private final java.lang.String mPropertyPath = null;
        final android.os.Bundle mBundle = null;
        final android.app.appsearch.GenericDocument mDocument = null;
        private java.lang.String mFullText;
        private android.app.appsearch.SearchResult.MatchRange mExactMatchRange;
        private android.app.appsearch.SearchResult.MatchRange mWindowRange;
        MatchInfo(android.os.Bundle p0, android.app.appsearch.GenericDocument p1) {}
        public java.lang.String getPropertyPath() { return null; }
        public java.lang.String getFullText() { return null; }
        public android.app.appsearch.SearchResult.MatchRange getExactMatchRange() { return null; }
        public java.lang.CharSequence getExactMatch() { return null; }
        public android.app.appsearch.SearchResult.MatchRange getSnippetRange() { return null; }
        public java.lang.CharSequence getSnippet() { return null; }
        private java.lang.CharSequence getSubstring(android.app.appsearch.SearchResult.MatchRange p0) { return null; }
        private static java.lang.String getPropertyValues(android.app.appsearch.GenericDocument p0, java.lang.String p1) { return null; }

        public static final class Builder {
            private final java.lang.String mPropertyPath = null;
            private android.app.appsearch.SearchResult.MatchRange mExactMatchRange;
            private android.app.appsearch.SearchResult.MatchRange mSnippetRange;
            public Builder(java.lang.String p0) {}
            public android.app.appsearch.SearchResult.MatchInfo.Builder setExactMatchRange(android.app.appsearch.SearchResult.MatchRange p0) { return null; }
            public android.app.appsearch.SearchResult.MatchInfo.Builder setSnippetRange(android.app.appsearch.SearchResult.MatchRange p0) { return null; }
            public android.app.appsearch.SearchResult.MatchInfo build() { return null; }
        }
    }

    public static final class MatchRange {
        private final int mEnd = 0;
        private final int mStart = 0;
        public MatchRange(int p0, int p1) {}
        public int getStart() { return 0; }
        public int getEnd() { return 0; }
        public boolean equals(java.lang.Object p0) { return false; }
        public java.lang.String toString() { return null; }
        public int hashCode() { return 0; }
    }
}
