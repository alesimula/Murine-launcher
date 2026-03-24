package com.android.internal.midi;

public class MidiEventScheduler extends com.android.internal.midi.EventScheduler {
    private static final java.lang.String TAG = "MidiEventScheduler";
    private static final int POOL_EVENT_SIZE = 16;
    private android.media.midi.MidiReceiver mReceiver;
    public MidiEventScheduler() { super(); }
    private com.android.internal.midi.MidiEventScheduler.MidiEvent createScheduledEvent(byte[] p0, int p1, int p2, long p3) { return null; }
    public void addEventToPool(com.android.internal.midi.EventScheduler.SchedulableEvent p0) {}
    public android.media.midi.MidiReceiver getReceiver() { return null; }

    private class SchedulingReceiver extends android.media.midi.MidiReceiver {
        private SchedulingReceiver(com.android.internal.midi.MidiEventScheduler p0) { super(); }
        public void onSend(byte[] p0, int p1, int p2, long p3) throws java.io.IOException {}
        public void onFlush() {}
    }

    public static class MidiEvent extends com.android.internal.midi.EventScheduler.SchedulableEvent {
        public int count;
        public byte[] data;
        private MidiEvent(int p0) { super(0L); }
        private MidiEvent(byte[] p0, int p1, int p2, long p3) { super(0L); }
        public java.lang.String toString() { return null; }
    }
}
