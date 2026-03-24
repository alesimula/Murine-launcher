package android.content.pm.parsing.result;

public class ParseTypeImpl implements android.content.pm.parsing.result.ParseInput, android.content.pm.parsing.result.ParseResult<java.lang.Object> {
    public static final boolean DEBUG_FILL_STACK_TRACE = false;
    public static final boolean DEBUG_LOG_ON_ERROR = false;
    public static final boolean DEBUG_THROW_ALL_ERRORS = false;
    public static android.content.pm.parsing.result.ParseTypeImpl forParsingWithoutPlatformCompat() { return null; }
    public static android.content.pm.parsing.result.ParseTypeImpl forDefaultParsing() { return null; }
    public ParseTypeImpl(android.content.pm.parsing.result.ParseInput.Callback p0) {}
    public android.content.pm.parsing.result.ParseInput reset() { return null; }
    public <ResultType extends java.lang.Object> android.content.pm.parsing.result.ParseResult<ResultType> success(ResultType p0) { return null; }
    public android.content.pm.parsing.result.ParseResult<?> deferError(java.lang.String p0, long p1) { return null; }
    public android.content.pm.parsing.result.ParseResult<?> enableDeferredError(java.lang.String p0, int p1) { return null; }
    public <ResultType extends java.lang.Object> android.content.pm.parsing.result.ParseResult<ResultType> skip(java.lang.String p0) { return null; }
    public <ResultType extends java.lang.Object> android.content.pm.parsing.result.ParseResult<ResultType> error(int p0) { return null; }
    public <ResultType extends java.lang.Object> android.content.pm.parsing.result.ParseResult<ResultType> error(java.lang.String p0) { return null; }
    public <ResultType extends java.lang.Object> android.content.pm.parsing.result.ParseResult<ResultType> error(int p0, java.lang.String p1) { return null; }
    public <ResultType extends java.lang.Object> android.content.pm.parsing.result.ParseResult<ResultType> error(android.content.pm.parsing.result.ParseResult<?> p0) { return null; }
    public <ResultType extends java.lang.Object> android.content.pm.parsing.result.ParseResult<ResultType> error(int p0, java.lang.String p1, java.lang.Exception p2) { return null; }
    public java.lang.Object getResult() { return null; }
    public boolean isSuccess() { return false; }
    public boolean isError() { return false; }
    public int getErrorCode() { return 0; }
    public java.lang.String getErrorMessage() { return null; }
    public java.lang.Exception getException() { return null; }
}
