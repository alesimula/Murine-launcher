package android.telecom;

public class Log {
    private static final long EXTENDED_LOGGING_DURATION_MILLIS = 1800000L;
    private static final int EVENTS_TO_CACHE = 10;
    private static final int EVENTS_TO_CACHE_DEBUG = 20;
    private static final int NUM_DIALABLE_DIGITS_TO_LOG = Integer.valueOf(0);
    public static java.lang.String TAG;
    public static boolean DEBUG;
    public static boolean INFO;
    public static boolean VERBOSE;
    public static boolean WARN;
    public static boolean ERROR;
    private static final boolean FORCE_LOGGING = false;
    private static final boolean USER_BUILD = Boolean.valueOf(false);
    private static final java.lang.Object sSingletonSync = null;
    private static android.telecom.Logging.EventManager sEventManager;
    private static android.telecom.Logging.SessionManager sSessionManager;
    private static boolean sIsUserExtendedLoggingEnabled;
    private static long sUserExtendedLoggingStopTime;
    private Log() {}
    public static void d(java.lang.String p0, java.lang.String p1, java.lang.Object... p2) {}
    public static void d(java.lang.Object p0, java.lang.String p1, java.lang.Object... p2) {}
    public static void i(java.lang.String p0, java.lang.String p1, java.lang.Object... p2) {}
    public static void i(java.lang.Object p0, java.lang.String p1, java.lang.Object... p2) {}
    public static void v(java.lang.String p0, java.lang.String p1, java.lang.Object... p2) {}
    public static void v(java.lang.Object p0, java.lang.String p1, java.lang.Object... p2) {}
    public static void w(java.lang.String p0, java.lang.String p1, java.lang.Object... p2) {}
    public static void w(java.lang.Object p0, java.lang.String p1, java.lang.Object... p2) {}
    public static void e(java.lang.String p0, java.lang.Throwable p1, java.lang.String p2, java.lang.Object... p3) {}
    public static void e(java.lang.Object p0, java.lang.Throwable p1, java.lang.String p2, java.lang.Object... p3) {}
    public static void wtf(java.lang.String p0, java.lang.Throwable p1, java.lang.String p2, java.lang.Object... p3) {}
    public static void wtf(java.lang.Object p0, java.lang.Throwable p1, java.lang.String p2, java.lang.Object... p3) {}
    public static void wtf(java.lang.String p0, java.lang.String p1, java.lang.Object... p2) {}
    public static void wtf(java.lang.Object p0, java.lang.String p1, java.lang.Object... p2) {}
    public static void setSessionContext(android.content.Context p0) {}
    public static void startSession(java.lang.String p0) {}
    public static void startSession(android.telecom.Logging.Session.Info p0, java.lang.String p1) {}
    public static void startSession(java.lang.String p0, java.lang.String p1) {}
    public static void startSession(android.telecom.Logging.Session.Info p0, java.lang.String p1, java.lang.String p2) {}
    public static android.telecom.Logging.Session createSubsession() { return null; }
    public static android.telecom.Logging.Session.Info getExternalSession() { return null; }
    public static android.telecom.Logging.Session.Info getExternalSession(java.lang.String p0) { return null; }
    public static void cancelSubsession(android.telecom.Logging.Session p0) {}
    public static void continueSession(android.telecom.Logging.Session p0, java.lang.String p1) {}
    public static void endSession() {}
    public static void registerSessionListener(android.telecom.Logging.SessionManager.ISessionListener p0) {}
    public static java.lang.String getSessionId() { return null; }
    public static void addEvent(android.telecom.Logging.EventManager.Loggable p0, java.lang.String p1) {}
    public static void addEvent(android.telecom.Logging.EventManager.Loggable p0, java.lang.String p1, java.lang.Object p2) {}
    public static void addEvent(android.telecom.Logging.EventManager.Loggable p0, java.lang.String p1, java.lang.String p2, java.lang.Object... p3) {}
    public static void registerEventListener(android.telecom.Logging.EventManager.EventListener p0) {}
    public static void addRequestResponsePair(android.telecom.Logging.EventManager.TimedEventPair p0) {}
    public static void dumpEvents(com.android.internal.util.IndentingPrintWriter p0) {}
    public static void dumpEventsTimeline(com.android.internal.util.IndentingPrintWriter p0) {}
    public static void setIsExtendedLoggingEnabled(boolean p0) {}
    private static android.telecom.Logging.EventManager getEventManager() { return null; }
    public static android.telecom.Logging.SessionManager getSessionManager() { return null; }
    public static void setTag(java.lang.String p0) {}
    private static void maybeDisableLogging() {}
    public static boolean isLoggable(int p0) { return false; }
    public static java.lang.String piiHandle(java.lang.Object p0) { return null; }
    private static void obfuscatePhoneNumber(java.lang.StringBuilder p0, java.lang.String p1) {}
    private static int getDialableCount(java.lang.String p0) { return 0; }
    public static java.lang.String pii(java.lang.Object p0) { return null; }
    private static java.lang.String getPrefixFromObject(java.lang.Object p0) { return null; }
    private static java.lang.String buildMessage(java.lang.String p0, java.lang.String p1, java.lang.Object... p2) { return null; }
    public static java.lang.String getPackageAbbreviation(android.content.ComponentName p0) { return null; }
    public static java.lang.String getPackageAbbreviation(java.lang.String p0) { return null; }
}
