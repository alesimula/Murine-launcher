package com.android.internal.midi;

public class EventScheduler {
    private static final long NANOS_PER_MILLI = 1000000L;
    private final java.lang.Object mLock = null;
    private volatile java.util.SortedMap<java.lang.Long, com.android.internal.midi.EventScheduler.FastEventQueue> mEventBuffer;
    private com.android.internal.midi.EventScheduler.FastEventQueue mEventPool;
    private int mMaxPoolSize;
    private boolean mClosed;
    public EventScheduler() {}
    public com.android.internal.midi.EventScheduler.SchedulableEvent removeEventfromPool() { return null; }
    public void addEventToPool(com.android.internal.midi.EventScheduler.SchedulableEvent p0) {}
    public void add(com.android.internal.midi.EventScheduler.SchedulableEvent p0) {}
    private com.android.internal.midi.EventScheduler.SchedulableEvent removeNextEventLocked(long p0) { return null; }
    public com.android.internal.midi.EventScheduler.SchedulableEvent getNextEvent(long p0) { return null; }
    public com.android.internal.midi.EventScheduler.SchedulableEvent waitNextEvent() throws java.lang.InterruptedException { return null; }
    protected void flush() {}
    public void close() {}

    private class FastEventQueue {
        volatile com.android.internal.midi.EventScheduler.SchedulableEvent mFirst;
        volatile com.android.internal.midi.EventScheduler.SchedulableEvent mLast;
        volatile long mEventsAdded;
        volatile long mEventsRemoved;
        FastEventQueue(com.android.internal.midi.EventScheduler p0, com.android.internal.midi.EventScheduler.SchedulableEvent p1) {}
        int size() { return 0; }
        public com.android.internal.midi.EventScheduler.SchedulableEvent remove() { return null; }
        public void add(com.android.internal.midi.EventScheduler.SchedulableEvent p0) {}
    }

    public static class SchedulableEvent {
        private long mTimestamp;
        private volatile com.android.internal.midi.EventScheduler.SchedulableEvent mNext;
        public SchedulableEvent(long p0) {}
        public long getTimestamp() { return 0L; }
        public void setTimestamp(long p0) {}
    }
}
