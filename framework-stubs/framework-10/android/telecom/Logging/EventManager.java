package android.telecom.Logging;

public class EventManager {
    public static final java.lang.String TAG = "Logging.Events";
    public static final int DEFAULT_EVENTS_TO_CACHE = 10;
    public static final java.time.format.DateTimeFormatter DATE_TIME_FORMATTER = null;
    private final java.util.Map<android.telecom.Logging.EventManager.Loggable, android.telecom.Logging.EventManager.EventRecord> mCallEventRecordMap = null;
    private java.util.concurrent.LinkedBlockingQueue<android.telecom.Logging.EventManager.EventRecord> mEventRecords;
    private java.util.List<android.telecom.Logging.EventManager.EventListener> mEventListeners;
    private android.telecom.Logging.SessionManager.ISessionIdQueryHandler mSessionIdHandler;
    private final java.util.Map<java.lang.String, java.util.List<android.telecom.Logging.EventManager.TimedEventPair>> requestResponsePairs = null;
    private static final java.lang.Object mSync = null;
    public void addRequestResponsePair(android.telecom.Logging.EventManager.TimedEventPair p0) {}
    public EventManager(android.telecom.Logging.SessionManager.ISessionIdQueryHandler p0) {}
    public void event(android.telecom.Logging.EventManager.Loggable p0, java.lang.String p1, java.lang.Object p2) {}
    public void event(android.telecom.Logging.EventManager.Loggable p0, java.lang.String p1, java.lang.String p2, java.lang.Object... p3) {}
    public void dumpEvents(com.android.internal.util.IndentingPrintWriter p0) {}
    public void dumpEventsTimeline(com.android.internal.util.IndentingPrintWriter p0) {}
    public void changeEventCacheSize(int p0) {}
    public void registerEventListener(android.telecom.Logging.EventManager.EventListener p0) {}
    public java.util.concurrent.LinkedBlockingQueue<android.telecom.Logging.EventManager.EventRecord> getEventRecords() { return null; }
    public java.util.Map<android.telecom.Logging.EventManager.Loggable, android.telecom.Logging.EventManager.EventRecord> getCallEventRecordMap() { return null; }
    private void addEventRecord(android.telecom.Logging.EventManager.EventRecord p0) {}

    public static class TimedEventPair {
        private static final long DEFAULT_TIMEOUT = 3000L;
        java.lang.String mRequest;
        java.lang.String mResponse;
        java.lang.String mName;
        long mTimeoutMillis;
        public TimedEventPair(java.lang.String p0, java.lang.String p1, java.lang.String p2) {}
        public TimedEventPair(java.lang.String p0, java.lang.String p1, java.lang.String p2, long p3) {}
    }

    public static interface Loggable {
        public java.lang.String getId();
        public java.lang.String getDescription();
    }

    public class EventRecord {
        private final java.util.List<android.telecom.Logging.EventManager.Event> mEvents = null;
        private final android.telecom.Logging.EventManager.Loggable mRecordEntry = null;
        public EventRecord(android.telecom.Logging.EventManager p0, android.telecom.Logging.EventManager.Loggable p1) {}
        public android.telecom.Logging.EventManager.Loggable getRecordEntry() { return null; }
        public void addEvent(java.lang.String p0, java.lang.String p1, java.lang.Object p2) {}
        public java.util.List<android.telecom.Logging.EventManager.Event> getEvents() { return null; }
        public java.util.List<android.telecom.Logging.EventManager.EventRecord.EventTiming> extractEventTimings() { return null; }
        public void dump(com.android.internal.util.IndentingPrintWriter p0) {}

        private class PendingResponse {
            java.lang.String requestEventId;
            long requestEventTimeMillis;
            long timeoutMillis;
            java.lang.String name;
            public PendingResponse(android.telecom.Logging.EventManager.EventRecord p0, java.lang.String p1, long p2, long p3, java.lang.String p4) {}
        }

        public class EventTiming extends android.telecom.Logging.TimedEvent<java.lang.String> {
            public java.lang.String name;
            public long time;
            public EventTiming(android.telecom.Logging.EventManager.EventRecord p0, java.lang.String p1, long p2) { super(); }
            public java.lang.String getKey() { return null; }
            public long getTime() { return 0L; }
        }
    }

    public static interface EventListener {
        public void eventRecordAdded(android.telecom.Logging.EventManager.EventRecord p0);
    }

    public static class Event {
        public java.lang.String eventId;
        public java.lang.String sessionId;
        public long time;
        public java.lang.Object data;
        public final java.lang.String timestampString = null;
        public Event(java.lang.String p0, java.lang.String p1, long p2, java.lang.Object p3) {}
    }
}
