package android.media.midi;

public final class MidiManager {
    private static final java.lang.String TAG = "MidiManager";
    public static final java.lang.String BLUETOOTH_MIDI_SERVICE_INTENT = "android.media.midi.BluetoothMidiService";
    public static final java.lang.String BLUETOOTH_MIDI_SERVICE_PACKAGE = "com.android.bluetoothmidiservice";
    public static final java.lang.String BLUETOOTH_MIDI_SERVICE_CLASS = "com.android.bluetoothmidiservice.BluetoothMidiService";
    private final android.media.midi.IMidiManager mService = null;
    private final android.os.IBinder mToken = null;
    private java.util.concurrent.ConcurrentHashMap<android.media.midi.MidiManager.DeviceCallback, android.media.midi.MidiManager.DeviceListener> mDeviceListeners;
    public MidiManager(android.media.midi.IMidiManager p0) {}
    public void registerDeviceCallback(android.media.midi.MidiManager.DeviceCallback p0, android.os.Handler p1) {}
    public void unregisterDeviceCallback(android.media.midi.MidiManager.DeviceCallback p0) {}
    public android.media.midi.MidiDeviceInfo[] getDevices() { return null; }
    private void sendOpenDeviceResponse(android.media.midi.MidiDevice p0, android.media.midi.MidiManager.OnDeviceOpenedListener p1, android.os.Handler p2) {}
    public void openDevice(android.media.midi.MidiDeviceInfo p0, android.media.midi.MidiManager.OnDeviceOpenedListener p1, android.os.Handler p2) {}
    public void openBluetoothDevice(android.bluetooth.BluetoothDevice p0, android.media.midi.MidiManager.OnDeviceOpenedListener p1, android.os.Handler p2) {}
    public android.media.midi.MidiDeviceServer createDeviceServer(android.media.midi.MidiReceiver[] p0, int p1, java.lang.String[] p2, java.lang.String[] p3, android.os.Bundle p4, int p5, android.media.midi.MidiDeviceServer.Callback p6) { return null; }

    public static interface OnDeviceOpenedListener {
        public void onDeviceOpened(android.media.midi.MidiDevice p0);
    }

    private class DeviceListener extends android.media.midi.IMidiDeviceListener.Stub {
        private final android.media.midi.MidiManager.DeviceCallback mCallback = null;
        private final android.os.Handler mHandler = null;
        public DeviceListener(android.media.midi.MidiManager p0, android.media.midi.MidiManager.DeviceCallback p1, android.os.Handler p2) { super(); }
        public void onDeviceAdded(android.media.midi.MidiDeviceInfo p0) {}
        public void onDeviceRemoved(android.media.midi.MidiDeviceInfo p0) {}
        public void onDeviceStatusChanged(android.media.midi.MidiDeviceStatus p0) {}
    }

    public static class DeviceCallback {
        public DeviceCallback() {}
        public void onDeviceAdded(android.media.midi.MidiDeviceInfo p0) {}
        public void onDeviceRemoved(android.media.midi.MidiDeviceInfo p0) {}
        public void onDeviceStatusChanged(android.media.midi.MidiDeviceStatus p0) {}
    }
}
