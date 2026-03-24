package android.system;

public final class ErrnoException extends java.lang.Exception {
    public final int errno = 0;
    public ErrnoException(java.lang.String p0, int p1) { super(); }
    public ErrnoException(java.lang.String p0, int p1, java.lang.Throwable p2) { super(); }
    public java.lang.String getMessage() { return null; }
    @android.annotation.NonNull
    public java.io.IOException rethrowAsIOException() throws java.io.IOException { return null; }
    @android.annotation.NonNull
    public java.net.SocketException rethrowAsSocketException() throws java.net.SocketException { return null; }
}
