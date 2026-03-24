package android.app.appsearch;

public final class SearchResult implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.app.appsearch.SearchResult> CREATOR = null;
    SearchResult() {}
    public final int describeContents() { return 0; }
    @android.annotation.NonNull
    public java.lang.String getDatabaseName() { return null; }
    @android.annotation.NonNull
    public android.app.appsearch.GenericDocument getGenericDocument() { return null; }
    @android.annotation.NonNull
    public java.util.List<java.lang.Double> getInformationalRankingSignals() { return null; }
    @android.annotation.NonNull
    public java.util.List<android.app.appsearch.SearchResult> getJoinedResults() { return null; }
    @android.annotation.NonNull
    public java.util.List<android.app.appsearch.SearchResult.MatchInfo> getMatchInfos() { return null; }
    @android.annotation.NonNull
    public java.lang.String getPackageName() { return null; }
    public double getRankingSignal() { return 0.0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        public Builder(java.lang.String p0, java.lang.String p1) {}
        @android.annotation.NonNull
        public android.app.appsearch.SearchResult.Builder addInformationalRankingSignal(double p0) { return null; }
        @android.annotation.NonNull
        public android.app.appsearch.SearchResult.Builder addJoinedResult(android.app.appsearch.SearchResult p0) { return null; }
        @android.annotation.NonNull
        public android.app.appsearch.SearchResult.Builder addMatchInfo(android.app.appsearch.SearchResult.MatchInfo p0) { return null; }
        @android.annotation.NonNull
        public android.app.appsearch.SearchResult build() { return null; }
        @android.annotation.NonNull
        public android.app.appsearch.SearchResult.Builder setGenericDocument(android.app.appsearch.GenericDocument p0) { return null; }
        @android.annotation.NonNull
        public android.app.appsearch.SearchResult.Builder setRankingSignal(double p0) { return null; }
    }

    public static final class MatchInfo implements android.os.Parcelable {
        @android.annotation.NonNull
        public static final android.os.Parcelable.Creator<android.app.appsearch.SearchResult.MatchInfo> CREATOR = null;
        MatchInfo() {}
        public final int describeContents() { return 0; }
        @android.annotation.NonNull
        public java.lang.CharSequence getExactMatch() { return null; }
        @android.annotation.NonNull
        public android.app.appsearch.SearchResult.MatchRange getExactMatchRange() { return null; }
        @android.annotation.NonNull
        public java.lang.String getFullText() { return null; }
        @android.annotation.NonNull
        public java.lang.String getPropertyPath() { return null; }
        @android.annotation.NonNull
        public android.app.appsearch.PropertyPath getPropertyPathObject() { return null; }
        @android.annotation.NonNull
        public java.lang.CharSequence getSnippet() { return null; }
        @android.annotation.NonNull
        public android.app.appsearch.SearchResult.MatchRange getSnippetRange() { return null; }
        @android.annotation.NonNull
        public java.lang.CharSequence getSubmatch() { return null; }
        @android.annotation.NonNull
        public android.app.appsearch.SearchResult.MatchRange getSubmatchRange() { return null; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}

        public static final class Builder {
            public Builder(java.lang.String p0) {}
            @android.annotation.NonNull
            public android.app.appsearch.SearchResult.MatchInfo build() { return null; }
            @android.annotation.NonNull
            public android.app.appsearch.SearchResult.MatchInfo.Builder setExactMatchRange(android.app.appsearch.SearchResult.MatchRange p0) { return null; }
            @android.annotation.NonNull
            public android.app.appsearch.SearchResult.MatchInfo.Builder setSnippetRange(android.app.appsearch.SearchResult.MatchRange p0) { return null; }
            @android.annotation.NonNull
            public android.app.appsearch.SearchResult.MatchInfo.Builder setSubmatchRange(android.app.appsearch.SearchResult.MatchRange p0) { return null; }
        }
    }

    public static final class MatchRange {
        public MatchRange(int p0, int p1) {}
        public int getEnd() { return 0; }
        public int getStart() { return 0; }
    }
}
