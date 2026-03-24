package android.app.appsearch;

public final class SearchSpec implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.app.appsearch.SearchSpec> CREATOR = null;
    public static final int EMBEDDING_SEARCH_METRIC_TYPE_COSINE = 1;
    public static final int EMBEDDING_SEARCH_METRIC_TYPE_DOT_PRODUCT = 2;
    public static final int EMBEDDING_SEARCH_METRIC_TYPE_EUCLIDEAN = 3;
    public static final int GROUPING_TYPE_PER_NAMESPACE = 2;
    public static final int GROUPING_TYPE_PER_PACKAGE = 1;
    public static final int GROUPING_TYPE_PER_SCHEMA = 4;
    public static final int ORDER_ASCENDING = 1;
    public static final int ORDER_DESCENDING = 0;
    @java.lang.Deprecated
    public static final java.lang.String PROJECTION_SCHEMA_TYPE_WILDCARD = "*";
    public static final int RANKING_STRATEGY_ADVANCED_RANKING_EXPRESSION = 9;
    public static final int RANKING_STRATEGY_CREATION_TIMESTAMP = 2;
    public static final int RANKING_STRATEGY_DOCUMENT_SCORE = 1;
    public static final int RANKING_STRATEGY_JOIN_AGGREGATE_SCORE = 8;
    public static final int RANKING_STRATEGY_NONE = 0;
    public static final int RANKING_STRATEGY_RELEVANCE_SCORE = 3;
    public static final int RANKING_STRATEGY_SYSTEM_USAGE_COUNT = 6;
    public static final int RANKING_STRATEGY_SYSTEM_USAGE_LAST_USED_TIMESTAMP = 7;
    public static final int RANKING_STRATEGY_USAGE_COUNT = 4;
    public static final int RANKING_STRATEGY_USAGE_LAST_USED_TIMESTAMP = 5;
    public static final java.lang.String SCHEMA_TYPE_WILDCARD = "*";
    public static final int TERM_MATCH_EXACT_ONLY = 1;
    public static final int TERM_MATCH_PREFIX = 2;
    SearchSpec() {}
    public final int describeContents() { return 0; }
    @android.annotation.NonNull
    public java.lang.String getAdvancedRankingExpression() { return null; }
    public int getDefaultEmbeddingSearchMetricType() { return 0; }
    @android.annotation.NonNull
    public java.util.List<java.lang.String> getFilterNamespaces() { return null; }
    @android.annotation.NonNull
    public java.util.List<java.lang.String> getFilterPackageNames() { return null; }
    @android.annotation.NonNull
    public java.util.Map<java.lang.String, java.util.List<java.lang.String>> getFilterProperties() { return null; }
    @android.annotation.NonNull
    public java.util.List<java.lang.String> getFilterSchemas() { return null; }
    @android.annotation.NonNull
    public java.util.List<java.lang.String> getInformationalRankingExpressions() { return null; }
    @android.annotation.Nullable
    public android.app.appsearch.JoinSpec getJoinSpec() { return null; }
    public int getMaxSnippetSize() { return 0; }
    public int getOrder() { return 0; }
    @android.annotation.NonNull
    public java.util.Map<java.lang.String, java.util.List<android.app.appsearch.PropertyPath>> getProjectionPaths() { return null; }
    @android.annotation.NonNull
    public java.util.Map<java.lang.String, java.util.List<java.lang.String>> getProjections() { return null; }
    @android.annotation.NonNull
    public java.util.Map<java.lang.String, java.util.Map<android.app.appsearch.PropertyPath, java.lang.Double>> getPropertyWeightPaths() { return null; }
    @android.annotation.NonNull
    public java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.Double>> getPropertyWeights() { return null; }
    public int getRankingStrategy() { return 0; }
    public int getResultCountPerPage() { return 0; }
    public int getResultGroupingLimit() { return 0; }
    public int getResultGroupingTypeFlags() { return 0; }
    @android.annotation.NonNull
    public java.util.List<android.app.appsearch.EmbeddingVector> getSearchEmbeddings() { return null; }
    @android.annotation.Nullable
    public java.lang.String getSearchSourceLogTag() { return null; }
    public int getSnippetCount() { return 0; }
    public int getSnippetCountPerProperty() { return 0; }
    public int getTermMatch() { return 0; }
    public boolean isEmbeddingSearchEnabled() { return false; }
    public boolean isListFilterHasPropertyFunctionEnabled() { return false; }
    public boolean isListFilterQueryLanguageEnabled() { return false; }
    public boolean isListFilterTokenizeFunctionEnabled() { return false; }
    public boolean isNumericSearchEnabled() { return false; }
    public boolean isVerbatimSearchEnabled() { return false; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        public Builder() {}
        @android.annotation.NonNull
        public android.app.appsearch.SearchSpec.Builder addFilterNamespaces(java.lang.String... p0) { return null; }
        @android.annotation.NonNull
        public android.app.appsearch.SearchSpec.Builder addFilterNamespaces(java.util.Collection<java.lang.String> p0) { return null; }
        @android.annotation.NonNull
        public android.app.appsearch.SearchSpec.Builder addFilterPackageNames(java.lang.String... p0) { return null; }
        @android.annotation.NonNull
        public android.app.appsearch.SearchSpec.Builder addFilterPackageNames(java.util.Collection<java.lang.String> p0) { return null; }
        @android.annotation.NonNull
        public android.app.appsearch.SearchSpec.Builder addFilterProperties(java.lang.String p0, java.util.Collection<java.lang.String> p1) { return null; }
        @android.annotation.NonNull
        public android.app.appsearch.SearchSpec.Builder addFilterPropertyPaths(java.lang.String p0, java.util.Collection<android.app.appsearch.PropertyPath> p1) { return null; }
        @android.annotation.NonNull
        public android.app.appsearch.SearchSpec.Builder addFilterSchemas(java.lang.String... p0) { return null; }
        @android.annotation.NonNull
        public android.app.appsearch.SearchSpec.Builder addFilterSchemas(java.util.Collection<java.lang.String> p0) { return null; }
        @android.annotation.NonNull
        public android.app.appsearch.SearchSpec.Builder addInformationalRankingExpressions(java.lang.String... p0) { return null; }
        @android.annotation.NonNull
        public android.app.appsearch.SearchSpec.Builder addInformationalRankingExpressions(java.util.Collection<java.lang.String> p0) { return null; }
        @android.annotation.NonNull
        public android.app.appsearch.SearchSpec.Builder addProjection(java.lang.String p0, java.util.Collection<java.lang.String> p1) { return null; }
        @android.annotation.NonNull
        public android.app.appsearch.SearchSpec.Builder addProjectionPaths(java.lang.String p0, java.util.Collection<android.app.appsearch.PropertyPath> p1) { return null; }
        @android.annotation.NonNull
        public android.app.appsearch.SearchSpec.Builder addSearchEmbeddings(android.app.appsearch.EmbeddingVector... p0) { return null; }
        @android.annotation.NonNull
        public android.app.appsearch.SearchSpec.Builder addSearchEmbeddings(java.util.Collection<android.app.appsearch.EmbeddingVector> p0) { return null; }
        @android.annotation.NonNull
        public android.app.appsearch.SearchSpec build() { return null; }
        @android.annotation.NonNull
        public android.app.appsearch.SearchSpec.Builder setDefaultEmbeddingSearchMetricType(int p0) { return null; }
        @android.annotation.NonNull
        public android.app.appsearch.SearchSpec.Builder setEmbeddingSearchEnabled(boolean p0) { return null; }
        @android.annotation.NonNull
        public android.app.appsearch.SearchSpec.Builder setJoinSpec(android.app.appsearch.JoinSpec p0) { return null; }
        @android.annotation.NonNull
        public android.app.appsearch.SearchSpec.Builder setListFilterHasPropertyFunctionEnabled(boolean p0) { return null; }
        @android.annotation.NonNull
        public android.app.appsearch.SearchSpec.Builder setListFilterQueryLanguageEnabled(boolean p0) { return null; }
        @android.annotation.NonNull
        public android.app.appsearch.SearchSpec.Builder setListFilterTokenizeFunctionEnabled(boolean p0) { return null; }
        @android.annotation.NonNull
        public android.app.appsearch.SearchSpec.Builder setMaxSnippetSize(int p0) { return null; }
        @android.annotation.NonNull
        public android.app.appsearch.SearchSpec.Builder setNumericSearchEnabled(boolean p0) { return null; }
        @android.annotation.NonNull
        public android.app.appsearch.SearchSpec.Builder setOrder(int p0) { return null; }
        @android.annotation.NonNull
        public android.app.appsearch.SearchSpec.Builder setPropertyWeightPaths(java.lang.String p0, java.util.Map<android.app.appsearch.PropertyPath, java.lang.Double> p1) { return null; }
        @android.annotation.NonNull
        public android.app.appsearch.SearchSpec.Builder setPropertyWeights(java.lang.String p0, java.util.Map<java.lang.String, java.lang.Double> p1) { return null; }
        @android.annotation.NonNull
        public android.app.appsearch.SearchSpec.Builder setRankingStrategy(int p0) { return null; }
        @android.annotation.NonNull
        public android.app.appsearch.SearchSpec.Builder setRankingStrategy(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        public android.app.appsearch.SearchSpec.Builder setResultCountPerPage(int p0) { return null; }
        @android.annotation.NonNull
        public android.app.appsearch.SearchSpec.Builder setResultGrouping(int p0, int p1) { return null; }
        @android.annotation.NonNull
        public android.app.appsearch.SearchSpec.Builder setSearchSourceLogTag(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        public android.app.appsearch.SearchSpec.Builder setSnippetCount(int p0) { return null; }
        @android.annotation.NonNull
        public android.app.appsearch.SearchSpec.Builder setSnippetCountPerProperty(int p0) { return null; }
        @android.annotation.NonNull
        public android.app.appsearch.SearchSpec.Builder setTermMatch(int p0) { return null; }
        @android.annotation.NonNull
        public android.app.appsearch.SearchSpec.Builder setVerbatimSearchEnabled(boolean p0) { return null; }
    }
}
