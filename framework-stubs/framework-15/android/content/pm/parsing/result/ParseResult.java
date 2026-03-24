package android.content.pm.parsing.result;

public interface ParseResult<ResultType extends java.lang.Object> {
    public boolean isSuccess();
    public boolean isError();
    public ResultType getResult();
    public int getErrorCode();
    @android.annotation.Nullable
    public java.lang.String getErrorMessage();
    @android.annotation.Nullable
    public java.lang.Exception getException();
}
