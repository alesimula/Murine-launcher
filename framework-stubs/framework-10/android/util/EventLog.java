package android.util;

public class EventLog {
    private static final java.lang.String TAG = "EventLog";
    private static final java.lang.String TAGS_FILE = "/system/etc/event-log-tags";
    private static final java.lang.String COMMENT_PATTERN = "^\\s*(#.*)?$";
    private static final java.lang.String TAG_PATTERN = "^\\s*(\\d+)\\s+(\\w+)\\s*(\\(.*\\))?\\s*$";
    private static java.util.HashMap<java.lang.String, java.lang.Integer> sTagCodes;
    private static java.util.HashMap<java.lang.Integer, java.lang.String> sTagNames;
    public EventLog() {}
    public static native int writeEvent(int p0, int p1);
    public static native int writeEvent(int p0, long p1);
    public static native int writeEvent(int p0, float p1);
    public static native int writeEvent(int p0, java.lang.String p1);
    public static native int writeEvent(int p0, java.lang.Object... p1);
    public static native void readEvents(int[] p0, java.util.Collection<android.util.EventLog.Event> p1) throws java.io.IOException;
    @android.annotation.SystemApi
    public static native void readEventsOnWrapping(int[] p0, long p1, java.util.Collection<android.util.EventLog.Event> p2) throws java.io.IOException;
    public static java.lang.String getTagName(int p0) { return null; }
    public static int getTagCode(java.lang.String p0) { return 0; }
    private static synchronized void readTagsFile() {}

    public static final class Event {
        private final java.nio.ByteBuffer mBuffer = null;
        private java.lang.Exception mLastWtf;
        private static final int LENGTH_OFFSET = 0;
        private static final int HEADER_SIZE_OFFSET = 2;
        private static final int PROCESS_OFFSET = 4;
        private static final int THREAD_OFFSET = 8;
        private static final int SECONDS_OFFSET = 12;
        private static final int NANOSECONDS_OFFSET = 16;
        private static final int UID_OFFSET = 24;
        private static final int V1_PAYLOAD_START = 20;
        private static final int DATA_OFFSET = 4;
        private static final byte INT_TYPE = 0;
        private static final byte LONG_TYPE = 1;
        private static final byte STRING_TYPE = 2;
        private static final byte LIST_TYPE = 3;
        private static final byte FLOAT_TYPE = 4;
        @android.annotation.UnsupportedAppUsage
        Event(byte[] p0) {}
        public int getProcessId() { return 0; }
        @android.annotation.SystemApi
        public int getUid() { return 0; }
        public int getThreadId() { return 0; }
        public long getTimeNanos() { return 0L; }
        public int getTag() { return 0; }
        public synchronized java.lang.Object getData() { return null; }
        private java.lang.Object decodeObject() { return null; }
        public static android.util.EventLog.Event fromBytes(byte[] p0) { return null; }
        public byte[] getBytes() { return null; }
        public java.lang.Exception getLastError() { return null; }
        public void clearError() {}
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
    }
}
