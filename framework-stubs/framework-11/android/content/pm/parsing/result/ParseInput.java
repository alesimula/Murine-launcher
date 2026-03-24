package android.content.pm.parsing.result;

public interface ParseInput {
    public <ResultType extends java.lang.Object> android.content.pm.parsing.result.ParseResult<ResultType> success(ResultType p0);
    public android.content.pm.parsing.result.ParseResult<?> deferError(java.lang.String p0, long p1);
    public android.content.pm.parsing.result.ParseResult<?> enableDeferredError(java.lang.String p0, int p1);
    public <ResultType extends java.lang.Object> android.content.pm.parsing.result.ParseResult<ResultType> skip(java.lang.String p0);
    public <ResultType extends java.lang.Object> android.content.pm.parsing.result.ParseResult<ResultType> error(int p0);
    public <ResultType extends java.lang.Object> android.content.pm.parsing.result.ParseResult<ResultType> error(java.lang.String p0);
    public <ResultType extends java.lang.Object> android.content.pm.parsing.result.ParseResult<ResultType> error(int p0, java.lang.String p1);
    public <ResultType extends java.lang.Object> android.content.pm.parsing.result.ParseResult<ResultType> error(int p0, java.lang.String p1, java.lang.Exception p2);
    public <ResultType extends java.lang.Object> android.content.pm.parsing.result.ParseResult<ResultType> error(android.content.pm.parsing.result.ParseResult<?> p0);

    public static interface Callback {
        public boolean isChangeEnabled(long p0, java.lang.String p1, int p2);
    }

    public static final class DeferredError {
        public static final long MISSING_APP_TAG = 150776642L;
        public static final long EMPTY_INTENT_ACTION_CATEGORY = 151163173L;
        public static final long RESOURCES_ARSC_COMPRESSED = 132742131L;
        public DeferredError() {}
        public static int getTargetSdkForChange(long p0) { return 0; }
    }
}
