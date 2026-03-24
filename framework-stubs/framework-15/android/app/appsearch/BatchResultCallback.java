package android.app.appsearch;

public interface BatchResultCallback<KeyType extends java.lang.Object, ValueType extends java.lang.Object> {
    public void onResult(android.app.appsearch.AppSearchBatchResult<KeyType, ValueType> p0);
    default public void onSystemError(java.lang.Throwable p0) {}
}
