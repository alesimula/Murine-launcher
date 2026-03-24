package android.os.strictmode;

public abstract class Violation extends java.lang.Throwable {
    Violation(java.lang.String p0) { super(); }
    public int hashCode() { return 0; }
    public synchronized java.lang.Throwable initCause(java.lang.Throwable p0) { return null; }
    public void setStackTrace(java.lang.StackTraceElement[] p0) {}
    public synchronized java.lang.Throwable fillInStackTrace() { return null; }
}
