package android.telecom.Logging;

public class SessionManager {
    public java.util.concurrent.ConcurrentHashMap<java.lang.Integer, android.telecom.Logging.Session> mSessionMapper;
    public java.lang.Runnable mCleanStaleSessions;
    public android.telecom.Logging.SessionManager.ICurrentThreadId mCurrentThreadId;
    public void setContext(android.content.Context p0) {}
    public SessionManager() {}
    public synchronized void startSession(android.telecom.Logging.Session.Info p0, java.lang.String p1, java.lang.String p2) {}
    public synchronized void startSession(java.lang.String p0, java.lang.String p1) {}
    public synchronized void startExternalSession(android.telecom.Logging.Session.Info p0, java.lang.String p1) {}
    public android.telecom.Logging.Session createSubsession() { return null; }
    public synchronized android.telecom.Logging.Session createSubsession(boolean p0) { return null; }
    public synchronized android.telecom.Logging.Session.Info getExternalSession() { return null; }
    public synchronized android.telecom.Logging.Session.Info getExternalSession(java.lang.String p0) { return null; }
    public synchronized void cancelSubsession(android.telecom.Logging.Session p0) {}
    public synchronized void continueSession(android.telecom.Logging.Session p0, java.lang.String p1) {}
    public synchronized void endSession() {}
    public java.lang.String getSessionId() { return null; }
    public synchronized void registerSessionListener(android.telecom.Logging.SessionManager.ISessionListener p0) {}
    public synchronized java.lang.String printActiveSessions() { return null; }
    public synchronized void cleanupStaleSessions(long p0) {}

    public static interface ICurrentThreadId {
        public int get();
    }

    private static interface ISessionCleanupTimeoutMs {
        public long get();
    }

    public static interface ISessionIdQueryHandler {
        public java.lang.String getSessionId();
    }

    public static interface ISessionListener {
        public void sessionComplete(java.lang.String p0, long p1);
    }
}
