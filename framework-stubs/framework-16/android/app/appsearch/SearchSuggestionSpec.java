package android.app.appsearch;

public final class SearchSuggestionSpec implements android.os.Parcelable {
    @android.annotation.FlaggedApi("com.android.appsearch.flags.enable_safe_parcelable_2")
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.app.appsearch.SearchSuggestionSpec> CREATOR = null;
    public static final int SUGGESTION_RANKING_STRATEGY_DOCUMENT_COUNT = 0;
    public static final int SUGGESTION_RANKING_STRATEGY_NONE = 2;
    public static final int SUGGESTION_RANKING_STRATEGY_TERM_FREQUENCY = 1;
    SearchSuggestionSpec() {}
    @android.annotation.FlaggedApi("com.android.appsearch.flags.enable_safe_parcelable_2")
    public final int describeContents() { return 0; }
    @android.annotation.NonNull
    public java.util.Map<java.lang.String, java.util.List<java.lang.String>> getFilterDocumentIds() { return null; }
    @android.annotation.NonNull
    public java.util.List<java.lang.String> getFilterNamespaces() { return null; }
    @android.annotation.FlaggedApi("com.android.appsearch.flags.enable_search_spec_filter_properties")
    @android.annotation.NonNull
    public java.util.Map<java.lang.String, java.util.List<java.lang.String>> getFilterProperties() { return null; }
    @android.annotation.NonNull
    public java.util.List<java.lang.String> getFilterSchemas() { return null; }
    public int getMaximumResultCount() { return 0; }
    public int getRankingStrategy() { return 0; }
    @android.annotation.FlaggedApi("com.android.appsearch.flags.enable_search_spec_search_string_parameters")
    @android.annotation.NonNull
    public java.util.List<java.lang.String> getSearchStringParameters() { return null; }
    @android.annotation.FlaggedApi("com.android.appsearch.flags.enable_safe_parcelable_2")
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        public Builder(int p0) {}
        @android.annotation.NonNull
        public android.app.appsearch.SearchSuggestionSpec.Builder addFilterDocumentIds(java.lang.String p0, java.lang.String... p1) { return null; }
        @android.annotation.NonNull
        public android.app.appsearch.SearchSuggestionSpec.Builder addFilterDocumentIds(java.lang.String p0, java.util.Collection<java.lang.String> p1) { return null; }
        @android.annotation.NonNull
        public android.app.appsearch.SearchSuggestionSpec.Builder addFilterNamespaces(java.lang.String... p0) { return null; }
        @android.annotation.NonNull
        public android.app.appsearch.SearchSuggestionSpec.Builder addFilterNamespaces(java.util.Collection<java.lang.String> p0) { return null; }
        @android.annotation.FlaggedApi("com.android.appsearch.flags.enable_search_spec_filter_properties")
        @android.annotation.NonNull
        public android.app.appsearch.SearchSuggestionSpec.Builder addFilterProperties(java.lang.String p0, java.util.Collection<java.lang.String> p1) { return null; }
        @android.annotation.FlaggedApi("com.android.appsearch.flags.enable_search_spec_filter_properties")
        @android.annotation.NonNull
        public android.app.appsearch.SearchSuggestionSpec.Builder addFilterPropertyPaths(java.lang.String p0, java.util.Collection<android.app.appsearch.PropertyPath> p1) { return null; }
        @android.annotation.NonNull
        public android.app.appsearch.SearchSuggestionSpec.Builder addFilterSchemas(java.lang.String... p0) { return null; }
        @android.annotation.NonNull
        public android.app.appsearch.SearchSuggestionSpec.Builder addFilterSchemas(java.util.Collection<java.lang.String> p0) { return null; }
        @android.annotation.FlaggedApi("com.android.appsearch.flags.enable_search_spec_search_string_parameters")
        @android.annotation.NonNull
        public android.app.appsearch.SearchSuggestionSpec.Builder addSearchStringParameters(java.lang.String... p0) { return null; }
        @android.annotation.FlaggedApi("com.android.appsearch.flags.enable_search_spec_search_string_parameters")
        @android.annotation.NonNull
        public android.app.appsearch.SearchSuggestionSpec.Builder addSearchStringParameters(java.util.List<java.lang.String> p0) { return null; }
        @android.annotation.NonNull
        public android.app.appsearch.SearchSuggestionSpec build() { return null; }
        @android.annotation.NonNull
        public android.app.appsearch.SearchSuggestionSpec.Builder setRankingStrategy(int p0) { return null; }
    }
}
