package android.media.midi;

public final class MidiDevice implements java.io.Closeable {
    MidiDevice(android.media.midi.MidiDeviceInfo p0, android.media.midi.IMidiDeviceServer p1, android.media.midi.IMidiManager p2, android.os.IBinder p3, android.os.IBinder p4) {}
    public android.media.midi.MidiDeviceInfo getInfo() { return null; }
    public android.media.midi.MidiInputPort openInputPort(int p0) { return null; }
    public android.media.midi.MidiOutputPort openOutputPort(int p0) { return null; }
    public android.media.midi.MidiDevice.MidiConnection connectPorts(android.media.midi.MidiInputPort p0, int p1) { return null; }
    public void close() throws java.io.IOException {}
    protected void finalize() throws java.lang.Throwable {}
    public java.lang.String toString() { return null; }

    public class MidiConnection implements java.io.Closeable {
        MidiConnection(android.media.midi.MidiDevice p0, android.os.IBinder p1, android.media.midi.MidiInputPort p2) {}
        public void close() throws java.io.IOException {}
        protected void finalize() throws java.lang.Throwable {}
    }
}
