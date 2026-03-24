package android.media.midi;

public final class MidiDeviceServer implements java.io.Closeable {
    private static final java.lang.String TAG = "MidiDeviceServer";
    private final android.media.midi.IMidiManager mMidiManager = null;
    private android.media.midi.MidiDeviceInfo mDeviceInfo;
    private final int mInputPortCount = 0;
    private final int mOutputPortCount = 0;
    private final android.media.midi.MidiReceiver[] mInputPortReceivers = null;
    private com.android.internal.midi.MidiDispatcher[] mOutputPortDispatchers;
    private final android.media.midi.MidiOutputPort[] mInputPortOutputPorts = null;
    private final java.util.concurrent.CopyOnWriteArrayList<android.media.midi.MidiInputPort> mInputPorts = null;
    private final boolean[] mInputPortOpen = null;
    private final int[] mOutputPortOpenCount = null;
    private boolean mIsClosed;
    private final android.media.midi.MidiDeviceServer.Callback mCallback = null;
    private final java.util.HashMap<android.os.IBinder, android.media.midi.MidiDeviceServer.PortClient> mPortClients = null;
    private final java.util.HashMap<android.media.midi.MidiInputPort, android.media.midi.MidiDeviceServer.PortClient> mInputPortClients = null;
    private final android.media.midi.IMidiDeviceServer mServer = null;
    private final com.android.internal.midi.MidiDispatcher.MidiReceiverFailureHandler mInputPortFailureHandler = null;
    private static java.io.FileDescriptor[] createSeqPacketSocketPair() throws java.io.IOException { return null; }
    MidiDeviceServer(android.media.midi.IMidiManager p0, android.media.midi.MidiReceiver[] p1, int p2, android.media.midi.MidiDeviceServer.Callback p3) {}
    MidiDeviceServer(android.media.midi.IMidiManager p0, android.media.midi.MidiReceiver[] p1, android.media.midi.MidiDeviceInfo p2, android.media.midi.MidiDeviceServer.Callback p3) {}
    android.media.midi.IMidiDeviceServer getBinderInterface() { return null; }
    public android.os.IBinder asBinder() { return null; }
    private void updateDeviceStatus() {}
    public void close() throws java.io.IOException {}
    protected void finalize() throws java.lang.Throwable {}
    public android.media.midi.MidiReceiver[] getOutputPortReceivers() { return null; }

    private abstract class PortClient implements android.os.IBinder.DeathRecipient {
        final android.os.IBinder mToken = null;
        PortClient(android.media.midi.MidiDeviceServer p0, android.os.IBinder p1) {}
        abstract void close();
        android.media.midi.MidiInputPort getInputPort() { return null; }
        public void binderDied() {}
    }

    private class OutputPortClient extends android.media.midi.MidiDeviceServer.PortClient {
        private final android.media.midi.MidiInputPort mInputPort = null;
        OutputPortClient(android.media.midi.MidiDeviceServer p0, android.os.IBinder p1, android.media.midi.MidiInputPort p2) { super(null, null); }
        void close() {}
        android.media.midi.MidiInputPort getInputPort() { return null; }
    }

    private class InputPortClient extends android.media.midi.MidiDeviceServer.PortClient {
        private final android.media.midi.MidiOutputPort mOutputPort = null;
        InputPortClient(android.media.midi.MidiDeviceServer p0, android.os.IBinder p1, android.media.midi.MidiOutputPort p2) { super(null, null); }
        void close() {}
    }

    public static interface Callback {
        public void onDeviceStatusChanged(android.media.midi.MidiDeviceServer p0, android.media.midi.MidiDeviceStatus p1);
        public void onClose();
    }
}
