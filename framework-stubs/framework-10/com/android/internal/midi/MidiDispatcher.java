package com.android.internal.midi;

public final class MidiDispatcher extends android.media.midi.MidiReceiver {
    private final com.android.internal.midi.MidiDispatcher.MidiReceiverFailureHandler mFailureHandler = null;
    private final java.util.concurrent.CopyOnWriteArrayList<android.media.midi.MidiReceiver> mReceivers = null;
    private final android.media.midi.MidiSender mSender = null;
    public MidiDispatcher() { super(); }
    public MidiDispatcher(com.android.internal.midi.MidiDispatcher.MidiReceiverFailureHandler p0) { super(); }
    public int getReceiverCount() { return 0; }
    public android.media.midi.MidiSender getSender() { return null; }
    public void onSend(byte[] p0, int p1, int p2, long p3) throws java.io.IOException {}
    public void onFlush() throws java.io.IOException {}

    public static interface MidiReceiverFailureHandler {
        public void onReceiverFailure(android.media.midi.MidiReceiver p0, java.io.IOException p1);
    }
}
