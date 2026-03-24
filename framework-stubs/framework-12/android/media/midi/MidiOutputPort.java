package android.media.midi;

public final class MidiOutputPort extends android.media.midi.MidiSender implements java.io.Closeable {
    private static final java.lang.String TAG = "MidiOutputPort";
    private android.media.midi.IMidiDeviceServer mDeviceServer;
    private final android.os.IBinder mToken = null;
    private final int mPortNumber = 0;
    private final java.io.FileInputStream mInputStream = null;
    private final com.android.internal.midi.MidiDispatcher mDispatcher = null;
    private boolean mIsClosed;
    private final java.lang.Thread mThread = null;
    MidiOutputPort(android.media.midi.IMidiDeviceServer p0, android.os.IBinder p1, java.io.FileDescriptor p2, int p3) { super(); }
    MidiOutputPort(java.io.FileDescriptor p0, int p1) { super(); }
    public final int getPortNumber() { return 0; }
    public void onConnect(android.media.midi.MidiReceiver p0) {}
    public void onDisconnect(android.media.midi.MidiReceiver p0) {}
    public void close() throws java.io.IOException {}
    protected void finalize() throws java.lang.Throwable {}
}
