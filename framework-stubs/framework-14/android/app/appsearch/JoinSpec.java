package android.app.appsearch;

public final class JoinSpec {
    public static final int AGGREGATION_SCORING_AVG_RANKING_SIGNAL = 3;
    public static final int AGGREGATION_SCORING_MAX_RANKING_SIGNAL = 4;
    public static final int AGGREGATION_SCORING_MIN_RANKING_SIGNAL = 2;
    public static final int AGGREGATION_SCORING_OUTER_RESULT_RANKING_SIGNAL = 0;
    public static final int AGGREGATION_SCORING_RESULT_COUNT = 1;
    public static final int AGGREGATION_SCORING_SUM_RANKING_SIGNAL = 5;
    JoinSpec() {}
    @android.annotation.NonNull
    public java.lang.String getNestedQuery() { return null; }
    @android.annotation.NonNull
    public java.lang.String getChildPropertyExpression() { return null; }
    public int getMaxJoinedResultCount() { return 0; }
    @android.annotation.NonNull
    public android.app.appsearch.SearchSpec getNestedSearchSpec() { return null; }
    public int getAggregationScoringStrategy() { return 0; }

    public static final class Builder {
        public Builder(java.lang.String p0) {}
        @android.annotation.NonNull
        public android.app.appsearch.JoinSpec.Builder setNestedSearch(java.lang.String p0, android.app.appsearch.SearchSpec p1) { return null; }
        @android.annotation.NonNull
        public android.app.appsearch.JoinSpec.Builder setMaxJoinedResultCount(int p0) { return null; }
        @android.annotation.NonNull
        public android.app.appsearch.JoinSpec.Builder setAggregationScoringStrategy(int p0) { return null; }
        @android.annotation.NonNull
        public android.app.appsearch.JoinSpec build() { return null; }
    }
}
