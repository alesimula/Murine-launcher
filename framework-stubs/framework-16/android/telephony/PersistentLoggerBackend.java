package android.telephony;

public interface PersistentLoggerBackend {
    public void debug(java.lang.String p0, java.lang.String p1);
    public void info(java.lang.String p0, java.lang.String p1);
    public void warn(java.lang.String p0, java.lang.String p1);
    public void warn(java.lang.String p0, java.lang.String p1, java.lang.Throwable p2);
    public void error(java.lang.String p0, java.lang.String p1);
    public void error(java.lang.String p0, java.lang.String p1, java.lang.Throwable p2);
}
