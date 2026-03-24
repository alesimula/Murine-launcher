package android.telephony;

public class DropBoxManagerLoggerBackend implements android.telephony.PersistentLoggerBackend {
    @android.annotation.Nullable
    public static synchronized android.telephony.DropBoxManagerLoggerBackend getInstance(android.content.Context p0) { return null; }
    public void setLoggingEnabled(boolean p0) {}
    public void debug(java.lang.String p0, java.lang.String p1) {}
    public void info(java.lang.String p0, java.lang.String p1) {}
    public void warn(java.lang.String p0, java.lang.String p1) {}
    public void warn(java.lang.String p0, java.lang.String p1, java.lang.Throwable p2) {}
    public void error(java.lang.String p0, java.lang.String p1) {}
    public void error(java.lang.String p0, java.lang.String p1, java.lang.Throwable p2) {}
    public void flushAsync() {}
    public void flush() {}
}
