package android.app.appsearch;

public final class JoinSpec implements android.os.Parcelable {
    public static final int AGGREGATION_SCORING_AVG_RANKING_SIGNAL = 3;
    public static final int AGGREGATION_SCORING_MAX_RANKING_SIGNAL = 4;
    public static final int AGGREGATION_SCORING_MIN_RANKING_SIGNAL = 2;
    public static final int AGGREGATION_SCORING_OUTER_RESULT_RANKING_SIGNAL = 0;
    public static final int AGGREGATION_SCORING_RESULT_COUNT = 1;
    public static final int AGGREGATION_SCORING_SUM_RANKING_SIGNAL = 5;
    @android.annotation.FlaggedApi("com.android.appsearch.flags.enable_safe_parcelable_2")
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.app.appsearch.JoinSpec> CREATOR = null;
    JoinSpec() {}
    @android.annotation.FlaggedApi("com.android.appsearch.flags.enable_safe_parcelable_2")
    public final int describeContents() { return 0; }
    public int getAggregationScoringStrategy() { return 0; }
    @android.annotation.NonNull
    public java.lang.String getChildPropertyExpression() { return null; }
    public int getMaxJoinedResultCount() { return 0; }
    @android.annotation.NonNull
    public java.lang.String getNestedQuery() { return null; }
    @android.annotation.NonNull
    public android.app.appsearch.SearchSpec getNestedSearchSpec() { return null; }
    @android.annotation.FlaggedApi("com.android.appsearch.flags.enable_safe_parcelable_2")
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        @android.annotation.FlaggedApi("com.android.appsearch.flags.enable_additional_builder_copy_constructors")
        public Builder(android.app.appsearch.JoinSpec p0) {}
        public Builder(java.lang.String p0) {}
        @android.annotation.NonNull
        public android.app.appsearch.JoinSpec build() { return null; }
        @android.annotation.NonNull
        public android.app.appsearch.JoinSpec.Builder setAggregationScoringStrategy(int p0) { return null; }
        @android.annotation.FlaggedApi("com.android.appsearch.flags.enable_additional_builder_copy_constructors")
        @android.annotation.NonNull
        public android.app.appsearch.JoinSpec.Builder setChildPropertyExpression(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        public android.app.appsearch.JoinSpec.Builder setMaxJoinedResultCount(int p0) { return null; }
        @android.annotation.NonNull
        public android.app.appsearch.JoinSpec.Builder setNestedSearch(java.lang.String p0, android.app.appsearch.SearchSpec p1) { return null; }
    }
}
