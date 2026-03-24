package android.app.appsearch;

public final class SearchSpec {
    public static final java.lang.String PROJECTION_SCHEMA_TYPE_WILDCARD = "*";
    static final java.lang.String TERM_MATCH_TYPE_FIELD = "termMatchType";
    static final java.lang.String SCHEMA_FIELD = "schema";
    static final java.lang.String NAMESPACE_FIELD = "namespace";
    static final java.lang.String PACKAGE_NAME_FIELD = "packageName";
    static final java.lang.String NUM_PER_PAGE_FIELD = "numPerPage";
    static final java.lang.String RANKING_STRATEGY_FIELD = "rankingStrategy";
    static final java.lang.String ORDER_FIELD = "order";
    static final java.lang.String SNIPPET_COUNT_FIELD = "snippetCount";
    static final java.lang.String SNIPPET_COUNT_PER_PROPERTY_FIELD = "snippetCountPerProperty";
    static final java.lang.String MAX_SNIPPET_FIELD = "maxSnippet";
    static final java.lang.String PROJECTION_TYPE_PROPERTY_PATHS_FIELD = "projectionTypeFieldMasks";
    static final java.lang.String RESULT_GROUPING_TYPE_FLAGS = "resultGroupingTypeFlags";
    static final java.lang.String RESULT_GROUPING_LIMIT = "resultGroupingLimit";
    public static final int DEFAULT_NUM_PER_PAGE = 10;
    private static final int MAX_NUM_PER_PAGE = 10000;
    private static final int MAX_SNIPPET_COUNT = 10000;
    private static final int MAX_SNIPPET_PER_PROPERTY_COUNT = 10000;
    private static final int MAX_SNIPPET_SIZE_LIMIT = 10000;
    public static final int TERM_MATCH_EXACT_ONLY = 1;
    public static final int TERM_MATCH_PREFIX = 2;
    public static final int RANKING_STRATEGY_NONE = 0;
    public static final int RANKING_STRATEGY_DOCUMENT_SCORE = 1;
    public static final int RANKING_STRATEGY_CREATION_TIMESTAMP = 2;
    public static final int RANKING_STRATEGY_RELEVANCE_SCORE = 3;
    public static final int RANKING_STRATEGY_USAGE_COUNT = 4;
    public static final int RANKING_STRATEGY_USAGE_LAST_USED_TIMESTAMP = 5;
    public static final int RANKING_STRATEGY_SYSTEM_USAGE_COUNT = 6;
    public static final int RANKING_STRATEGY_SYSTEM_USAGE_LAST_USED_TIMESTAMP = 7;
    public static final int ORDER_DESCENDING = 0;
    public static final int ORDER_ASCENDING = 1;
    public static final int GROUPING_TYPE_PER_PACKAGE = 1;
    public static final int GROUPING_TYPE_PER_NAMESPACE = 2;
    private final android.os.Bundle mBundle = null;
    public SearchSpec(android.os.Bundle p0) {}
    public android.os.Bundle getBundle() { return null; }
    public int getTermMatch() { return 0; }
    public java.util.List<java.lang.String> getFilterSchemas() { return null; }
    public java.util.List<java.lang.String> getFilterNamespaces() { return null; }
    public java.util.List<java.lang.String> getFilterPackageNames() { return null; }
    public int getResultCountPerPage() { return 0; }
    public int getRankingStrategy() { return 0; }
    public int getOrder() { return 0; }
    public int getSnippetCount() { return 0; }
    public int getSnippetCountPerProperty() { return 0; }
    public int getMaxSnippetSize() { return 0; }
    public java.util.Map<java.lang.String, java.util.List<java.lang.String>> getProjections() { return null; }
    public int getResultGroupingTypeFlags() { return 0; }
    public int getResultGroupingLimit() { return 0; }

    public static final class Builder {
        private java.util.ArrayList<java.lang.String> mSchemas;
        private java.util.ArrayList<java.lang.String> mNamespaces;
        private java.util.ArrayList<java.lang.String> mPackageNames;
        private android.os.Bundle mProjectionTypePropertyMasks;
        private int mResultCountPerPage;
        private int mTermMatchType;
        private int mSnippetCount;
        private int mSnippetCountPerProperty;
        private int mMaxSnippetSize;
        private int mRankingStrategy;
        private int mOrder;
        private int mGroupingTypeFlags;
        private int mGroupingLimit;
        private boolean mBuilt;
        public Builder() {}
        public android.app.appsearch.SearchSpec.Builder setTermMatch(int p0) { return null; }
        public android.app.appsearch.SearchSpec.Builder addFilterSchemas(java.lang.String... p0) { return null; }
        public android.app.appsearch.SearchSpec.Builder addFilterSchemas(java.util.Collection<java.lang.String> p0) { return null; }
        public android.app.appsearch.SearchSpec.Builder addFilterNamespaces(java.lang.String... p0) { return null; }
        public android.app.appsearch.SearchSpec.Builder addFilterNamespaces(java.util.Collection<java.lang.String> p0) { return null; }
        public android.app.appsearch.SearchSpec.Builder addFilterPackageNames(java.lang.String... p0) { return null; }
        public android.app.appsearch.SearchSpec.Builder addFilterPackageNames(java.util.Collection<java.lang.String> p0) { return null; }
        public android.app.appsearch.SearchSpec.Builder setResultCountPerPage(int p0) { return null; }
        public android.app.appsearch.SearchSpec.Builder setRankingStrategy(int p0) { return null; }
        public android.app.appsearch.SearchSpec.Builder setOrder(int p0) { return null; }
        public android.app.appsearch.SearchSpec.Builder setSnippetCount(int p0) { return null; }
        public android.app.appsearch.SearchSpec.Builder setSnippetCountPerProperty(int p0) { return null; }
        public android.app.appsearch.SearchSpec.Builder setMaxSnippetSize(int p0) { return null; }
        public android.app.appsearch.SearchSpec.Builder addProjection(java.lang.String p0, java.util.Collection<java.lang.String> p1) { return null; }
        @android.annotation.SuppressLint("MissingGetterMatchingBuilder")
        public android.app.appsearch.SearchSpec.Builder setResultGrouping(int p0, int p1) { return null; }
        public android.app.appsearch.SearchSpec build() { return null; }
        private void resetIfBuilt() {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface GroupingType {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Order {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface RankingStrategy {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface TermMatch {
    }
}
