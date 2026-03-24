package android.util;

public class EventLog {
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

    public static final class Event {
        Event(byte[] p0) {}
        public int getProcessId() { return 0; }
        @android.annotation.SystemApi
        public int getUid() { return 0; }
        public int getThreadId() { return 0; }
        public long getTimeNanos() { return 0L; }
        public int getTag() { return 0; }
        public synchronized java.lang.Object getData() { return null; }
        public android.util.EventLog.Event withNewData(java.lang.Object p0) { return null; }
        public static android.util.EventLog.Event fromBytes(byte[] p0) { return null; }
        public byte[] getBytes() { return null; }
        public java.lang.Exception getLastError() { return null; }
        public void clearError() {}
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
    }
}
