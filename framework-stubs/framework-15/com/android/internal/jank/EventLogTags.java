package com.android.internal.jank;

public class EventLogTags {
    public static final int JANK_CUJ_EVENTS_BEGIN_REQUEST = 37001;
    public static final int JANK_CUJ_EVENTS_END_REQUEST = 37002;
    public static final int JANK_CUJ_EVENTS_CANCEL_REQUEST = 37003;
    public static void writeJankCujEventsBeginRequest(int p0, long p1, long p2, long p3, java.lang.String p4) {}
    public static void writeJankCujEventsEndRequest(int p0, long p1, long p2, long p3) {}
    public static void writeJankCujEventsCancelRequest(int p0, long p1, long p2, long p3) {}
}
