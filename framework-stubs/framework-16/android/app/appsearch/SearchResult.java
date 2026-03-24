package android.app.appsearch;

public final class SearchResult implements android.os.Parcelable {
    @android.annotation.FlaggedApi("com.android.appsearch.flags.enable_safe_parcelable_2")
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.app.appsearch.SearchResult> CREATOR = null;
    SearchResult() {}
    @android.annotation.FlaggedApi("com.android.appsearch.flags.enable_safe_parcelable_2")
    public final int describeContents() { return 0; }
    @android.annotation.NonNull
    public java.lang.String getDatabaseName() { return null; }
    @android.annotation.NonNull
    public android.app.appsearch.GenericDocument getGenericDocument() { return null; }
    @android.annotation.FlaggedApi("com.android.appsearch.flags.enable_informational_ranking_expressions")
    @android.annotation.NonNull
    public java.util.List<java.lang.Double> getInformationalRankingSignals() { return null; }
    @android.annotation.NonNull
    public java.util.List<android.app.appsearch.SearchResult> getJoinedResults() { return null; }
    @android.annotation.NonNull
    public java.util.List<android.app.appsearch.SearchResult.MatchInfo> getMatchInfos() { return null; }
    @android.annotation.NonNull
    public java.lang.String getPackageName() { return null; }
    @android.annotation.FlaggedApi("com.android.appsearch.flags.enable_search_result_parent_types")
    @android.annotation.NonNull
    public java.util.Map<java.lang.String, java.util.List<java.lang.String>> getParentTypeMap() { return null; }
    public double getRankingSignal() { return 0.0; }
    @android.annotation.FlaggedApi("com.android.appsearch.flags.enable_safe_parcelable_2")
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        public Builder(java.lang.String p0, java.lang.String p1) {}
        @android.annotation.FlaggedApi("com.android.appsearch.flags.enable_informational_ranking_expressions")
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
        @android.annotation.FlaggedApi("com.android.appsearch.flags.enable_search_result_parent_types")
        @android.annotation.NonNull
        public android.app.appsearch.SearchResult.Builder setParentTypeMap(java.util.Map<java.lang.String, java.util.List<java.lang.String>> p0) { return null; }
        @android.annotation.NonNull
        public android.app.appsearch.SearchResult.Builder setRankingSignal(double p0) { return null; }
    }

    @android.annotation.FlaggedApi("com.android.appsearch.flags.enable_embedding_match_info")
    public static final class EmbeddingMatchInfo implements android.os.Parcelable {
        @android.annotation.FlaggedApi("com.android.appsearch.flags.enable_safe_parcelable_2")
        @android.annotation.NonNull
        public static final android.os.Parcelable.Creator<android.app.appsearch.SearchResult.EmbeddingMatchInfo> CREATOR = null;
        public EmbeddingMatchInfo(double p0, int p1, int p2) {}
        @android.annotation.FlaggedApi("com.android.appsearch.flags.enable_safe_parcelable_2")
        public final int describeContents() { return 0; }
        @android.annotation.FlaggedApi("com.android.appsearch.flags.enable_embedding_match_info")
        public int getEmbeddingSearchMetricType() { return 0; }
        @android.annotation.FlaggedApi("com.android.appsearch.flags.enable_embedding_match_info")
        public int getQueryEmbeddingVectorIndex() { return 0; }
        @android.annotation.FlaggedApi("com.android.appsearch.flags.enable_embedding_match_info")
        public double getSemanticScore() { return 0.0; }
        @android.annotation.FlaggedApi("com.android.appsearch.flags.enable_safe_parcelable_2")
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }

    public static final class MatchInfo implements android.os.Parcelable {
        @android.annotation.FlaggedApi("com.android.appsearch.flags.enable_safe_parcelable_2")
        @android.annotation.NonNull
        public static final android.os.Parcelable.Creator<android.app.appsearch.SearchResult.MatchInfo> CREATOR = null;
        MatchInfo() {}
        @android.annotation.FlaggedApi("com.android.appsearch.flags.enable_safe_parcelable_2")
        public final int describeContents() { return 0; }
        @android.annotation.FlaggedApi("com.android.appsearch.flags.enable_embedding_match_info")
        @android.annotation.Nullable
        public android.app.appsearch.SearchResult.EmbeddingMatchInfo getEmbeddingMatch() { return null; }
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
        @android.annotation.FlaggedApi("com.android.appsearch.flags.enable_embedding_match_info")
        @android.annotation.Nullable
        public android.app.appsearch.SearchResult.TextMatchInfo getTextMatch() { return null; }
        @android.annotation.FlaggedApi("com.android.appsearch.flags.enable_safe_parcelable_2")
        public void writeToParcel(android.os.Parcel p0, int p1) {}

        public static final class Builder {
            public Builder(java.lang.String p0) {}
            @android.annotation.NonNull
            public android.app.appsearch.SearchResult.MatchInfo build() { return null; }
            @android.annotation.FlaggedApi("com.android.appsearch.flags.enable_embedding_match_info")
            @android.annotation.NonNull
            public android.app.appsearch.SearchResult.MatchInfo.Builder setEmbeddingMatch(android.app.appsearch.SearchResult.EmbeddingMatchInfo p0) { return null; }
            @android.annotation.NonNull
            public android.app.appsearch.SearchResult.MatchInfo.Builder setExactMatchRange(android.app.appsearch.SearchResult.MatchRange p0) { return null; }
            @android.annotation.NonNull
            public android.app.appsearch.SearchResult.MatchInfo.Builder setSnippetRange(android.app.appsearch.SearchResult.MatchRange p0) { return null; }
            @android.annotation.NonNull
            public android.app.appsearch.SearchResult.MatchInfo.Builder setSubmatchRange(android.app.appsearch.SearchResult.MatchRange p0) { return null; }
        }
    }

    public static final class MatchRange implements android.os.Parcelable {
        @android.annotation.FlaggedApi("com.android.appsearch.flags.enable_safe_parcelable_2")
        @android.annotation.NonNull
        public static final android.os.Parcelable.Creator<android.app.appsearch.SearchResult.MatchRange> CREATOR = null;
        public MatchRange(int p0, int p1) {}
        @android.annotation.FlaggedApi("com.android.appsearch.flags.enable_safe_parcelable_2")
        public final int describeContents() { return 0; }
        public int getEnd() { return 0; }
        public int getStart() { return 0; }
        @android.annotation.FlaggedApi("com.android.appsearch.flags.enable_safe_parcelable_2")
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }

    @android.annotation.FlaggedApi("com.android.appsearch.flags.enable_embedding_match_info")
    public static final class TextMatchInfo implements android.os.Parcelable {
        @android.annotation.FlaggedApi("com.android.appsearch.flags.enable_safe_parcelable_2")
        @android.annotation.NonNull
        public static final android.os.Parcelable.Creator<android.app.appsearch.SearchResult.TextMatchInfo> CREATOR = null;
        public TextMatchInfo(android.app.appsearch.SearchResult.MatchRange p0, android.app.appsearch.SearchResult.MatchRange p1, android.app.appsearch.SearchResult.MatchRange p2) {}
        @android.annotation.FlaggedApi("com.android.appsearch.flags.enable_safe_parcelable_2")
        public final int describeContents() { return 0; }
        @android.annotation.FlaggedApi("com.android.appsearch.flags.enable_embedding_match_info")
        @android.annotation.NonNull
        public java.lang.CharSequence getExactMatch() { return null; }
        @android.annotation.FlaggedApi("com.android.appsearch.flags.enable_embedding_match_info")
        @android.annotation.NonNull
        public android.app.appsearch.SearchResult.MatchRange getExactMatchRange() { return null; }
        @android.annotation.FlaggedApi("com.android.appsearch.flags.enable_embedding_match_info")
        @android.annotation.NonNull
        public java.lang.String getFullText() { return null; }
        @android.annotation.FlaggedApi("com.android.appsearch.flags.enable_embedding_match_info")
        @android.annotation.NonNull
        public java.lang.CharSequence getSnippet() { return null; }
        @android.annotation.FlaggedApi("com.android.appsearch.flags.enable_embedding_match_info")
        @android.annotation.NonNull
        public android.app.appsearch.SearchResult.MatchRange getSnippetRange() { return null; }
        @android.annotation.FlaggedApi("com.android.appsearch.flags.enable_embedding_match_info")
        @android.annotation.NonNull
        public java.lang.CharSequence getSubmatch() { return null; }
        @android.annotation.FlaggedApi("com.android.appsearch.flags.enable_embedding_match_info")
        @android.annotation.NonNull
        public android.app.appsearch.SearchResult.MatchRange getSubmatchRange() { return null; }
        @android.annotation.FlaggedApi("com.android.appsearch.flags.enable_safe_parcelable_2")
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }
}
