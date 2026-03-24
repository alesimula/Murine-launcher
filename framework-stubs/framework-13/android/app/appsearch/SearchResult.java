package android.app.appsearch;

public final class SearchResult {
    SearchResult() {}
    @android.annotation.NonNull
    public android.app.appsearch.GenericDocument getGenericDocument() { return null; }
    @android.annotation.NonNull
    public java.util.List<android.app.appsearch.SearchResult.MatchInfo> getMatchInfos() { return null; }
    @android.annotation.NonNull
    public java.lang.String getPackageName() { return null; }
    @android.annotation.NonNull
    public java.lang.String getDatabaseName() { return null; }
    public double getRankingSignal() { return 0.0; }

    public static final class Builder {
        public Builder(java.lang.String p0, java.lang.String p1) {}
        @android.annotation.NonNull
        public android.app.appsearch.SearchResult.Builder setGenericDocument(android.app.appsearch.GenericDocument p0) { return null; }
        @android.annotation.NonNull
        public android.app.appsearch.SearchResult.Builder addMatchInfo(android.app.appsearch.SearchResult.MatchInfo p0) { return null; }
        @android.annotation.NonNull
        public android.app.appsearch.SearchResult.Builder setRankingSignal(double p0) { return null; }
        @android.annotation.NonNull
        public android.app.appsearch.SearchResult build() { return null; }
    }

    public static final class MatchInfo {
        MatchInfo() {}
        @android.annotation.NonNull
        public java.lang.String getPropertyPath() { return null; }
        @android.annotation.NonNull
        public java.lang.String getFullText() { return null; }
        @android.annotation.NonNull
        public android.app.appsearch.SearchResult.MatchRange getExactMatchRange() { return null; }
        @android.annotation.NonNull
        public java.lang.CharSequence getExactMatch() { return null; }
        @android.annotation.NonNull
        public android.app.appsearch.SearchResult.MatchRange getSubmatchRange() { return null; }
        @android.annotation.NonNull
        public java.lang.CharSequence getSubmatch() { return null; }
        @android.annotation.NonNull
        public android.app.appsearch.SearchResult.MatchRange getSnippetRange() { return null; }
        @android.annotation.NonNull
        public java.lang.CharSequence getSnippet() { return null; }

        public static final class Builder {
            public Builder(java.lang.String p0) {}
            @android.annotation.NonNull
            public android.app.appsearch.SearchResult.MatchInfo.Builder setExactMatchRange(android.app.appsearch.SearchResult.MatchRange p0) { return null; }
            @android.annotation.NonNull
            public android.app.appsearch.SearchResult.MatchInfo.Builder setSubmatchRange(android.app.appsearch.SearchResult.MatchRange p0) { return null; }
            @android.annotation.NonNull
            public android.app.appsearch.SearchResult.MatchInfo.Builder setSnippetRange(android.app.appsearch.SearchResult.MatchRange p0) { return null; }
            @android.annotation.NonNull
            public android.app.appsearch.SearchResult.MatchInfo build() { return null; }
        }
    }

    public static final class MatchRange {
        public MatchRange(int p0, int p1) {}
        public int getStart() { return 0; }
        public int getEnd() { return 0; }
        public boolean equals(java.lang.Object p0) { return false; }
        @android.annotation.NonNull
        public java.lang.String toString() { return null; }
        public int hashCode() { return 0; }
    }
}
