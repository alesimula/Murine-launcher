package android.app.appsearch;

public final class SearchSuggestionSpec {
    public static final int SUGGESTION_RANKING_STRATEGY_DOCUMENT_COUNT = 0;
    public static final int SUGGESTION_RANKING_STRATEGY_NONE = 2;
    public static final int SUGGESTION_RANKING_STRATEGY_TERM_FREQUENCY = 1;
    SearchSuggestionSpec() {}
    public int getMaximumResultCount() { return 0; }
    @android.annotation.NonNull
    public java.util.List<java.lang.String> getFilterNamespaces() { return null; }
    public int getRankingStrategy() { return 0; }
    @android.annotation.NonNull
    public java.util.List<java.lang.String> getFilterSchemas() { return null; }
    @android.annotation.NonNull
    public java.util.Map<java.lang.String, java.util.List<java.lang.String>> getFilterDocumentIds() { return null; }

    public static final class Builder {
        public Builder(int p0) {}
        @android.annotation.NonNull
        public android.app.appsearch.SearchSuggestionSpec.Builder addFilterNamespaces(java.lang.String... p0) { return null; }
        @android.annotation.NonNull
        public android.app.appsearch.SearchSuggestionSpec.Builder addFilterNamespaces(java.util.Collection<java.lang.String> p0) { return null; }
        @android.annotation.NonNull
        public android.app.appsearch.SearchSuggestionSpec.Builder setRankingStrategy(int p0) { return null; }
        @android.annotation.NonNull
        public android.app.appsearch.SearchSuggestionSpec.Builder addFilterSchemas(java.lang.String... p0) { return null; }
        @android.annotation.NonNull
        public android.app.appsearch.SearchSuggestionSpec.Builder addFilterSchemas(java.util.Collection<java.lang.String> p0) { return null; }
        @android.annotation.NonNull
        public android.app.appsearch.SearchSuggestionSpec.Builder addFilterDocumentIds(java.lang.String p0, java.lang.String... p1) { return null; }
        @android.annotation.NonNull
        public android.app.appsearch.SearchSuggestionSpec.Builder addFilterDocumentIds(java.lang.String p0, java.util.Collection<java.lang.String> p1) { return null; }
        @android.annotation.NonNull
        public android.app.appsearch.SearchSuggestionSpec build() { return null; }
    }
}
