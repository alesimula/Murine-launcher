package android.telecom.Logging;

public class SessionManager {
    private static final long SESSION_ID_ROLLOVER_THRESHOLD = 262144L;
    private static final long DEFAULT_SESSION_TIMEOUT_MS = 30000L;
    private static final java.lang.String LOGGING_TAG = "Logging";
    private static final java.lang.String TIMEOUTS_PREFIX = "telecom.";
    private int sCodeEntryCounter;
    private android.content.Context mContext;
    public java.util.concurrent.ConcurrentHashMap<java.lang.Integer, android.telecom.Logging.Session> mSessionMapper;
    public java.lang.Runnable mCleanStaleSessions;
    private android.os.Handler mSessionCleanupHandler;
    public android.telecom.Logging.SessionManager.ICurrentThreadId mCurrentThreadId;
    private android.telecom.Logging.SessionManager.ISessionCleanupTimeoutMs mSessionCleanupTimeoutMs;
    private java.util.List<android.telecom.Logging.SessionManager.ISessionListener> mSessionListeners;
    public void setContext(android.content.Context p0) {}
    public SessionManager() {}
    private long getSessionCleanupTimeoutMs() { return 0L; }
    private synchronized void resetStaleSessionTimer() {}
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
    private void endParentSessions(android.telecom.Logging.Session p0) {}
    private void notifySessionCompleteListeners(java.lang.String p0, long p1) {}
    public java.lang.String getSessionId() { return null; }
    public synchronized void registerSessionListener(android.telecom.Logging.SessionManager.ISessionListener p0) {}
    private synchronized java.lang.String getNextSessionID() { return null; }
    private synchronized void restartSessionCounter() {}
    private java.lang.String getBase64Encoding(int p0) { return null; }
    private int getCallingThreadId() { return 0; }
    public synchronized java.lang.String printActiveSessions() { return null; }
    public synchronized void cleanupStaleSessions(long p0) {}
    private long getCleanupTimeout(android.content.Context p0) { return 0L; }

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
