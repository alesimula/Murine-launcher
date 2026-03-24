package com.android.internal.midi;

public class EventScheduler {
    public static final long NANOS_PER_MILLI = 1000000L;
    protected volatile java.util.SortedMap<java.lang.Long, com.android.internal.midi.EventScheduler.FastEventQueue> mEventBuffer;
    protected com.android.internal.midi.EventScheduler.FastEventQueue mEventPool;
    public EventScheduler() {}
    public com.android.internal.midi.EventScheduler.SchedulableEvent removeEventfromPool() { return null; }
    public void addEventToPool(com.android.internal.midi.EventScheduler.SchedulableEvent p0) {}
    public void add(com.android.internal.midi.EventScheduler.SchedulableEvent p0) {}
    protected com.android.internal.midi.EventScheduler.SchedulableEvent removeNextEventLocked(long p0) { return null; }
    public com.android.internal.midi.EventScheduler.SchedulableEvent getNextEvent(long p0) { return null; }
    public com.android.internal.midi.EventScheduler.SchedulableEvent waitNextEvent() throws java.lang.InterruptedException { return null; }
    protected void flush() {}
    public void close() {}
    protected java.lang.Object getLock() { return null; }

    public static class FastEventQueue {
        volatile com.android.internal.midi.EventScheduler.SchedulableEvent mFirst;
        volatile com.android.internal.midi.EventScheduler.SchedulableEvent mLast;
        volatile long mEventsAdded;
        volatile long mEventsRemoved;
        public FastEventQueue(com.android.internal.midi.EventScheduler.SchedulableEvent p0) {}
        int size() { return 0; }
        public com.android.internal.midi.EventScheduler.SchedulableEvent remove() { return null; }
        public void add(com.android.internal.midi.EventScheduler.SchedulableEvent p0) {}
    }

    public static class SchedulableEvent {
        public SchedulableEvent(long p0) {}
        public long getTimestamp() { return 0L; }
        public void setTimestamp(long p0) {}
    }
}
