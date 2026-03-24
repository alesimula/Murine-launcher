package android.app.appsearch;

public final class AppSearchBatchResult<KeyType extends java.lang.Object, ValueType extends java.lang.Object> {
    AppSearchBatchResult() {}
    public boolean isSuccess() { return false; }
    @android.annotation.NonNull
    public java.util.Map<KeyType, ValueType> getSuccesses() { return null; }
    @android.annotation.NonNull
    public java.util.Map<KeyType, android.app.appsearch.AppSearchResult<ValueType>> getFailures() { return null; }
    @android.annotation.NonNull
    public java.util.Map<KeyType, android.app.appsearch.AppSearchResult<ValueType>> getAll() { return null; }
    @android.annotation.NonNull
    public java.lang.String toString() { return null; }

    public static final class Builder<KeyType extends java.lang.Object, ValueType extends java.lang.Object> {
        public Builder() {}
        @android.annotation.NonNull
        public android.app.appsearch.AppSearchBatchResult.Builder<KeyType, ValueType> setSuccess(KeyType p0, ValueType p1) { return null; }
        @android.annotation.NonNull
        public android.app.appsearch.AppSearchBatchResult.Builder<KeyType, ValueType> setFailure(KeyType p0, int p1, java.lang.String p2) { return null; }
        @android.annotation.NonNull
        public android.app.appsearch.AppSearchBatchResult.Builder<KeyType, ValueType> setResult(KeyType p0, android.app.appsearch.AppSearchResult<ValueType> p1) { return null; }
        @android.annotation.NonNull
        public android.app.appsearch.AppSearchBatchResult<KeyType, ValueType> build() { return null; }
    }
}
