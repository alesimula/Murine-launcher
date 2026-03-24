package android.media.midi;

public final class MidiOutputPort extends android.media.midi.MidiSender implements java.io.Closeable {
    MidiOutputPort(android.media.midi.IMidiDeviceServer p0, android.os.IBinder p1, java.io.FileDescriptor p2, int p3) { super(); }
    MidiOutputPort(java.io.FileDescriptor p0, int p1) { super(); }
    public final int getPortNumber() { return 0; }
    public void onConnect(android.media.midi.MidiReceiver p0) {}
    public void onDisconnect(android.media.midi.MidiReceiver p0) {}
    public void close() throws java.io.IOException {}
    protected void finalize() throws java.lang.Throwable {}
    public int pullTotalBytesCount() { return 0; }
}
