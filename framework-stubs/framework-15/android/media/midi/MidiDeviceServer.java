package android.media.midi;

public final class MidiDeviceServer implements java.io.Closeable {
    MidiDeviceServer(android.media.midi.IMidiManager p0, android.media.midi.MidiReceiver[] p1, int p2, android.media.midi.MidiDeviceServer.Callback p3) {}
    MidiDeviceServer(android.media.midi.IMidiManager p0, android.media.midi.MidiReceiver[] p1, android.media.midi.MidiDeviceInfo p2, android.media.midi.MidiDeviceServer.Callback p3) {}
    android.media.midi.IMidiDeviceServer getBinderInterface() { return null; }
    public android.os.IBinder asBinder() { return null; }
    public void close() throws java.io.IOException {}
    protected void finalize() throws java.lang.Throwable {}
    public android.media.midi.MidiReceiver[] getOutputPortReceivers() { return null; }

    public static interface Callback {
        public void onDeviceStatusChanged(android.media.midi.MidiDeviceServer p0, android.media.midi.MidiDeviceStatus p1);
        public void onClose();
    }

    private class InputPortClient extends android.media.midi.MidiDeviceServer.PortClient {
        InputPortClient(android.media.midi.MidiDeviceServer p0, android.os.IBinder p1, android.media.midi.MidiOutputPort p2) { super(null, null); }
        void close() {}
    }

    private class OutputPortClient extends android.media.midi.MidiDeviceServer.PortClient {
        OutputPortClient(android.media.midi.MidiDeviceServer p0, android.os.IBinder p1, android.media.midi.MidiInputPort p2) { super(null, null); }
        void close() {}
        android.media.midi.MidiInputPort getInputPort() { return null; }
    }

    private abstract class PortClient implements android.os.IBinder.DeathRecipient {
        final android.os.IBinder mToken = null;
        PortClient(android.media.midi.MidiDeviceServer p0, android.os.IBinder p1) {}
        abstract void close();
        android.media.midi.MidiInputPort getInputPort() { return null; }
        public void binderDied() {}
    }
}
