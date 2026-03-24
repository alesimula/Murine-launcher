package android.media.midi;

public abstract class MidiDeviceService extends android.app.Service {
    public static final java.lang.String SERVICE_INTERFACE = "android.media.midi.MidiDeviceService";
    public MidiDeviceService() { super(); }
    public void onCreate() {}
    public abstract android.media.midi.MidiReceiver[] onGetInputPortReceivers();
    public final android.media.midi.MidiReceiver[] getOutputPortReceivers() { return null; }
    public final android.media.midi.MidiDeviceInfo getDeviceInfo() { return null; }
    public void onDeviceStatusChanged(android.media.midi.MidiDeviceStatus p0) {}
    public void onClose() {}
    public android.os.IBinder onBind(android.content.Intent p0) { return null; }
}
