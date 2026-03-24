package android.media.midi;

public final class MidiInputPort extends android.media.midi.MidiReceiver implements java.io.Closeable {
    MidiInputPort(android.media.midi.IMidiDeviceServer p0, android.os.IBinder p1, java.io.FileDescriptor p2, int p3) { super(); }
    MidiInputPort(java.io.FileDescriptor p0, int p1) { super(); }
    public final int getPortNumber() { return 0; }
    public void onSend(byte[] p0, int p1, int p2, long p3) throws java.io.IOException {}
    public void onFlush() throws java.io.IOException {}
    java.io.FileDescriptor claimFileDescriptor() { return null; }
    android.os.IBinder getToken() { return null; }
    android.media.midi.IMidiDeviceServer getDeviceServer() { return null; }
    public void close() throws java.io.IOException {}
    protected void finalize() throws java.lang.Throwable {}
}
