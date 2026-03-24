package android.media.midi;

public abstract class MidiDeviceService extends android.app.Service {
    private static final java.lang.String TAG = "MidiDeviceService";
    public static final java.lang.String SERVICE_INTERFACE = "android.media.midi.MidiDeviceService";
    private android.media.midi.IMidiManager mMidiManager;
    private android.media.midi.MidiDeviceServer mServer;
    private android.media.midi.MidiDeviceInfo mDeviceInfo;
    private final android.media.midi.MidiDeviceServer.Callback mCallback = null;
    public MidiDeviceService() { super(); }
    public void onCreate() {}
    public abstract android.media.midi.MidiReceiver[] onGetInputPortReceivers();
    public final android.media.midi.MidiReceiver[] getOutputPortReceivers() { return null; }
    public final android.media.midi.MidiDeviceInfo getDeviceInfo() { return null; }
    public void onDeviceStatusChanged(android.media.midi.MidiDeviceStatus p0) {}
    public void onClose() {}
    public android.os.IBinder onBind(android.content.Intent p0) { return null; }
}
