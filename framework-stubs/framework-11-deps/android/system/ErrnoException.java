package android.system;

public class ErrnoException extends java.lang.Exception {
    public ErrnoException() { super(); }
    public ErrnoException(java.lang.String p0) { super(p0); }
    public ErrnoException(java.lang.String p0, java.lang.Throwable p1) { super(p0, p1); }
    public ErrnoException(java.lang.Throwable p0) { super(p0); }
    public ErrnoException(java.lang.String p0, int p1) { super(); }
    public int errno = 0;
    public java.lang.String getMessage() { return null; }
    public java.io.IOException rethrowAsIOException() { return null; }
    public java.lang.String toString() { return null; }
    public java.net.SocketException rethrowAsSocketException() { return null; }
}
