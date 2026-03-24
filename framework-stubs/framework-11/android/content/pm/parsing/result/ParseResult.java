package android.content.pm.parsing.result;

public interface ParseResult<ResultType extends java.lang.Object> {
    public boolean isSuccess();
    public boolean isError();
    public ResultType getResult();
    public int getErrorCode();
    public java.lang.String getErrorMessage();
    public java.lang.Exception getException();
}
