package android.app.appsearch;

public final class AppSearchBatchResult<KeyType extends java.lang.Object, ValueType extends java.lang.Object> {
    private final java.util.Map<KeyType, ValueType> mSuccesses = null;
    private final java.util.Map<KeyType, android.app.appsearch.AppSearchResult<ValueType>> mFailures = null;
    private final java.util.Map<KeyType, android.app.appsearch.AppSearchResult<ValueType>> mAll = null;
    AppSearchBatchResult(java.util.Map<KeyType, ValueType> p0, java.util.Map<KeyType, android.app.appsearch.AppSearchResult<ValueType>> p1, java.util.Map<KeyType, android.app.appsearch.AppSearchResult<ValueType>> p2) {}
    public boolean isSuccess() { return false; }
    public java.util.Map<KeyType, ValueType> getSuccesses() { return null; }
    public java.util.Map<KeyType, android.app.appsearch.AppSearchResult<ValueType>> getFailures() { return null; }
    public java.util.Map<KeyType, android.app.appsearch.AppSearchResult<ValueType>> getAll() { return null; }
    public java.lang.String toString() { return null; }

    public static final class Builder<KeyType extends java.lang.Object, ValueType extends java.lang.Object> {
        private android.util.ArrayMap<KeyType, ValueType> mSuccesses;
        private android.util.ArrayMap<KeyType, android.app.appsearch.AppSearchResult<ValueType>> mFailures;
        private android.util.ArrayMap<KeyType, android.app.appsearch.AppSearchResult<ValueType>> mAll;
        private boolean mBuilt;
        public Builder() {}
        public android.app.appsearch.AppSearchBatchResult.Builder<KeyType, ValueType> setSuccess(KeyType p0, ValueType p1) { return null; }
        public android.app.appsearch.AppSearchBatchResult.Builder<KeyType, ValueType> setFailure(KeyType p0, int p1, java.lang.String p2) { return null; }
        public android.app.appsearch.AppSearchBatchResult.Builder<KeyType, ValueType> setResult(KeyType p0, android.app.appsearch.AppSearchResult<ValueType> p1) { return null; }
        public android.app.appsearch.AppSearchBatchResult<KeyType, ValueType> build() { return null; }
        private void resetIfBuilt() {}
    }
}
