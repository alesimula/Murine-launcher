package android.media.midi;

@android.annotation.FlaggedApi("android.media.midi.virtual_ump")
public abstract class MidiUmpDeviceService extends android.app.Service {
    @android.annotation.FlaggedApi("android.media.midi.virtual_ump")
    public static final java.lang.String SERVICE_INTERFACE = "android.media.midi.MidiUmpDeviceService";
    public MidiUmpDeviceService() { super(); }
    @android.annotation.FlaggedApi("android.media.midi.virtual_ump")
    public void onCreate() {}
    @android.annotation.FlaggedApi("android.media.midi.virtual_ump")
    @android.annotation.NonNull
    public abstract java.util.List<android.media.midi.MidiReceiver> onGetInputPortReceivers();
    @android.annotation.FlaggedApi("android.media.midi.virtual_ump")
    @android.annotation.NonNull
    public final java.util.List<android.media.midi.MidiReceiver> getOutputPortReceivers() { return null; }
    @android.annotation.FlaggedApi("android.media.midi.virtual_ump")
    @android.annotation.Nullable
    public final android.media.midi.MidiDeviceInfo getDeviceInfo() { return null; }
    @android.annotation.FlaggedApi("android.media.midi.virtual_ump")
    public void onDeviceStatusChanged(android.media.midi.MidiDeviceStatus p0) {}
    @android.annotation.FlaggedApi("android.media.midi.virtual_ump")
    public void onClose() {}
    @android.annotation.FlaggedApi("android.media.midi.virtual_ump")
    @android.annotation.Nullable
    public android.os.IBinder onBind(android.content.Intent p0) { return null; }
}
