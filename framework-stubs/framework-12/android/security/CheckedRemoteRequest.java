package android.security;

@java.lang.FunctionalInterface
interface CheckedRemoteRequest<R extends java.lang.Object> {
    public R execute() throws android.os.RemoteException;
}
