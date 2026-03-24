package com.android.internal.midi;

public class MidiEventScheduler extends com.android.internal.midi.EventScheduler {
    public MidiEventScheduler() { super(); }
    public com.android.internal.midi.MidiEventScheduler.MidiEvent createScheduledEvent(byte[] p0, int p1, int p2, long p3) { return null; }
    public void addEventToPool(com.android.internal.midi.EventScheduler.SchedulableEvent p0) {}
    public android.media.midi.MidiReceiver getReceiver() { return null; }

    public static class MidiEvent extends com.android.internal.midi.EventScheduler.SchedulableEvent {
        public int count;
        public byte[] data;
        MidiEvent() { super(0L); }
        public java.lang.String toString() { return null; }
    }

    private class SchedulingReceiver extends android.media.midi.MidiReceiver {
        public void onSend(byte[] p0, int p1, int p2, long p3) throws java.io.IOException {}
        public void onFlush() {}
    }
}
