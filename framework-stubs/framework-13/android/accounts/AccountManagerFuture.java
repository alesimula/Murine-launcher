package android.accounts;

public interface AccountManagerFuture<V extends java.lang.Object> {
    public boolean cancel(boolean p0);
    public boolean isCancelled();
    public boolean isDone();
    public V getResult() throws android.accounts.OperationCanceledException, java.io.IOException, android.accounts.AuthenticatorException;
    public V getResult(long p0, java.util.concurrent.TimeUnit p1) throws android.accounts.OperationCanceledException, java.io.IOException, android.accounts.AuthenticatorException;
}
