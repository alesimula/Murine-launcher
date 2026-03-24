package android.media.midi;

public final class MidiDevice implements java.io.Closeable {
    private static final java.lang.String TAG = "MidiDevice";
    private final android.media.midi.MidiDeviceInfo mDeviceInfo = null;
    private final android.media.midi.IMidiDeviceServer mDeviceServer = null;
    private final android.os.IBinder mDeviceServerBinder = null;
    private final android.media.midi.IMidiManager mMidiManager = null;
    private final android.os.IBinder mClientToken = null;
    private final android.os.IBinder mDeviceToken = null;
    private boolean mIsDeviceClosed;
    private long mNativeHandle;
    MidiDevice(android.media.midi.MidiDeviceInfo p0, android.media.midi.IMidiDeviceServer p1, android.media.midi.IMidiManager p2, android.os.IBinder p3, android.os.IBinder p4) {}
    public android.media.midi.MidiDeviceInfo getInfo() { return null; }
    public android.media.midi.MidiInputPort openInputPort(int p0) { return null; }
    public android.media.midi.MidiOutputPort openOutputPort(int p0) { return null; }
    public android.media.midi.MidiDevice.MidiConnection connectPorts(android.media.midi.MidiInputPort p0, int p1) { return null; }
    public void close() throws java.io.IOException {}
    protected void finalize() throws java.lang.Throwable {}
    public java.lang.String toString() { return null; }

    public class MidiConnection implements java.io.Closeable {
        private final android.media.midi.IMidiDeviceServer mInputPortDeviceServer = null;
        private final android.os.IBinder mInputPortToken = null;
        private final android.os.IBinder mOutputPortToken = null;
        private boolean mIsClosed;
        MidiConnection(android.media.midi.MidiDevice p0, android.os.IBinder p1, android.media.midi.MidiInputPort p2) {}
        public void close() throws java.io.IOException {}
        protected void finalize() throws java.lang.Throwable {}
    }
}
