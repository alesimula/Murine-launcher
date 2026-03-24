package android.media.midi;

public final class MidiManager {
    public static final int TRANSPORT_MIDI_BYTE_STREAM = 1;
    public static final int TRANSPORT_UNIVERSAL_MIDI_PACKETS = 2;
    public static final java.lang.String BLUETOOTH_MIDI_SERVICE_INTENT = "android.media.midi.BluetoothMidiService";
    public static final java.lang.String BLUETOOTH_MIDI_SERVICE_PACKAGE = "com.android.bluetoothmidiservice";
    public static final java.lang.String BLUETOOTH_MIDI_SERVICE_CLASS = "com.android.bluetoothmidiservice.BluetoothMidiService";
    public MidiManager(android.media.midi.IMidiManager p0) {}
    @java.lang.Deprecated
    public void registerDeviceCallback(android.media.midi.MidiManager.DeviceCallback p0, android.os.Handler p1) {}
    public void registerDeviceCallback(int p0, java.util.concurrent.Executor p1, android.media.midi.MidiManager.DeviceCallback p2) {}
    public void unregisterDeviceCallback(android.media.midi.MidiManager.DeviceCallback p0) {}
    @java.lang.Deprecated
    public android.media.midi.MidiDeviceInfo[] getDevices() { return null; }
    @android.annotation.NonNull
    public java.util.Set<android.media.midi.MidiDeviceInfo> getDevicesForTransport(int p0) { return null; }
    public void openDevice(android.media.midi.MidiDeviceInfo p0, android.media.midi.MidiManager.OnDeviceOpenedListener p1, android.os.Handler p2) {}
    public void openBluetoothDevice(android.bluetooth.BluetoothDevice p0, android.media.midi.MidiManager.OnDeviceOpenedListener p1, android.os.Handler p2) {}
    public void closeBluetoothDevice(android.media.midi.MidiDevice p0) {}
    public android.media.midi.MidiDeviceServer createDeviceServer(android.media.midi.MidiReceiver[] p0, int p1, java.lang.String[] p2, java.lang.String[] p3, android.os.Bundle p4, int p5, int p6, android.media.midi.MidiDeviceServer.Callback p7) { return null; }

    public static class DeviceCallback {
        public DeviceCallback() {}
        public void onDeviceAdded(android.media.midi.MidiDeviceInfo p0) {}
        public void onDeviceRemoved(android.media.midi.MidiDeviceInfo p0) {}
        public void onDeviceStatusChanged(android.media.midi.MidiDeviceStatus p0) {}
    }

    private class DeviceListener extends android.media.midi.IMidiDeviceListener.Stub {
        DeviceListener(android.media.midi.MidiManager p0, android.media.midi.MidiManager.DeviceCallback p1, java.util.concurrent.Executor p2, int p3) { super(); }
        public void onDeviceAdded(android.media.midi.MidiDeviceInfo p0) {}
        public void onDeviceRemoved(android.media.midi.MidiDeviceInfo p0) {}
        public void onDeviceStatusChanged(android.media.midi.MidiDeviceStatus p0) {}
    }

    public static interface OnDeviceOpenedListener {
        public void onDeviceOpened(android.media.midi.MidiDevice p0);
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Transport {
    }
}
