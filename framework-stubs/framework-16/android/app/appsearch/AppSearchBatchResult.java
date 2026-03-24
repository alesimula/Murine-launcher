package android.app.appsearch;

public final class AppSearchBatchResult<KeyType extends java.lang.Object, ValueType extends java.lang.Object> {
    AppSearchBatchResult() {}
    @android.annotation.NonNull
    public java.util.Map<KeyType, android.app.appsearch.AppSearchResult<ValueType>> getAll() { return null; }
    @android.annotation.NonNull
    public java.util.Map<KeyType, android.app.appsearch.AppSearchResult<ValueType>> getFailures() { return null; }
    @android.annotation.NonNull
    public java.util.Map<KeyType, ValueType> getSuccesses() { return null; }
    public boolean isSuccess() { return false; }

    public static final class Builder<KeyType extends java.lang.Object, ValueType extends java.lang.Object> {
        public Builder() {}
        @android.annotation.FlaggedApi("com.android.appsearch.flags.enable_additional_builder_copy_constructors")
        public Builder(android.app.appsearch.AppSearchBatchResult<KeyType, ValueType> p0) {}
        @android.annotation.NonNull
        public android.app.appsearch.AppSearchBatchResult<KeyType, ValueType> build() { return null; }
        @android.annotation.NonNull
        public android.app.appsearch.AppSearchBatchResult.Builder<KeyType, ValueType> setFailure(KeyType p0, int p1, java.lang.String p2) { return null; }
        @android.annotation.NonNull
        public android.app.appsearch.AppSearchBatchResult.Builder<KeyType, ValueType> setResult(KeyType p0, android.app.appsearch.AppSearchResult<ValueType> p1) { return null; }
        @android.annotation.NonNull
        public android.app.appsearch.AppSearchBatchResult.Builder<KeyType, ValueType> setSuccess(KeyType p0, ValueType p1) { return null; }
    }
}
