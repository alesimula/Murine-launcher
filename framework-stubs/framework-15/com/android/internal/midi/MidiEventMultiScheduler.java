package com.android.internal.midi;

public class MidiEventMultiScheduler {
    public MidiEventMultiScheduler(int p0) {}
    public boolean waitNextEvent() throws java.lang.InterruptedException { return false; }
    public int getNumEventSchedulers() { return 0; }
    public com.android.internal.midi.MidiEventScheduler getEventScheduler(int p0) { return null; }
    public void close() {}

    private class MultiLockMidiEventScheduler extends com.android.internal.midi.MidiEventScheduler {
        public void close() {}
        protected java.lang.Object getLock() { return null; }
        public boolean isEventBufferEmptyLocked() { return false; }
        public long getLowestTimeLocked() { return 0L; }
    }
}
