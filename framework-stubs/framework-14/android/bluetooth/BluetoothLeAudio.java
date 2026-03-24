package android.bluetooth;

public final class BluetoothLeAudio implements android.bluetooth.BluetoothProfile, java.lang.AutoCloseable {
    public static final java.lang.String ACTION_LE_AUDIO_ACTIVE_DEVICE_CHANGED = "android.bluetooth.action.LE_AUDIO_ACTIVE_DEVICE_CHANGED";
    public static final java.lang.String ACTION_LE_AUDIO_CONNECTION_STATE_CHANGED = "android.bluetooth.action.LE_AUDIO_CONNECTION_STATE_CHANGED";
    public static final int AUDIO_LOCATION_BACK_CENTER = 256;
    public static final int AUDIO_LOCATION_BACK_LEFT = 16;
    public static final int AUDIO_LOCATION_BACK_RIGHT = 32;
    public static final int AUDIO_LOCATION_BOTTOM_FRONT_CENTER = 2097152;
    public static final int AUDIO_LOCATION_BOTTOM_FRONT_LEFT = 4194304;
    public static final int AUDIO_LOCATION_BOTTOM_FRONT_RIGHT = 8388608;
    public static final int AUDIO_LOCATION_FRONT_CENTER = 4;
    public static final int AUDIO_LOCATION_FRONT_LEFT = 1;
    public static final int AUDIO_LOCATION_FRONT_LEFT_OF_CENTER = 64;
    public static final int AUDIO_LOCATION_FRONT_LEFT_WIDE = 16777216;
    public static final int AUDIO_LOCATION_FRONT_RIGHT = 2;
    public static final int AUDIO_LOCATION_FRONT_RIGHT_OF_CENTER = 128;
    public static final int AUDIO_LOCATION_FRONT_RIGHT_WIDE = 33554432;
    public static final int AUDIO_LOCATION_INVALID = 0;
    public static final int AUDIO_LOCATION_LEFT_SURROUND = 67108864;
    public static final int AUDIO_LOCATION_LOW_FREQ_EFFECTS_ONE = 8;
    public static final int AUDIO_LOCATION_LOW_FREQ_EFFECTS_TWO = 512;
    public static final int AUDIO_LOCATION_RIGHT_SURROUND = 134217728;
    public static final int AUDIO_LOCATION_SIDE_LEFT = 1024;
    public static final int AUDIO_LOCATION_SIDE_RIGHT = 2048;
    public static final int AUDIO_LOCATION_TOP_BACK_CENTER = 1048576;
    public static final int AUDIO_LOCATION_TOP_BACK_LEFT = 65536;
    public static final int AUDIO_LOCATION_TOP_BACK_RIGHT = 131072;
    public static final int AUDIO_LOCATION_TOP_CENTER = 32768;
    public static final int AUDIO_LOCATION_TOP_FRONT_CENTER = 16384;
    public static final int AUDIO_LOCATION_TOP_FRONT_LEFT = 4096;
    public static final int AUDIO_LOCATION_TOP_FRONT_RIGHT = 8192;
    public static final int AUDIO_LOCATION_TOP_SIDE_LEFT = 262144;
    public static final int AUDIO_LOCATION_TOP_SIDE_RIGHT = 524288;
    public static final java.lang.String EXTRA_LE_AUDIO_GROUP_ID = "android.bluetooth.extra.LE_AUDIO_GROUP_ID";
    public static final int GROUP_ID_INVALID = -1;
    BluetoothLeAudio() {}
    public void close() {}
    protected void finalize() {}
    @android.annotation.Nullable
    public android.bluetooth.BluetoothDevice getConnectedGroupLeadDevice(int p0) { return null; }
    @android.annotation.NonNull
    public java.util.List<android.bluetooth.BluetoothDevice> getConnectedDevices() { return null; }
    @android.annotation.NonNull
    public java.util.List<android.bluetooth.BluetoothDevice> getDevicesMatchingConnectionStates(int[] p0) { return null; }
    public int getConnectionState(android.bluetooth.BluetoothDevice p0) { return 0; }
    public void registerCallback(java.util.concurrent.Executor p0, android.bluetooth.BluetoothLeAudio.Callback p1) {}
    public void unregisterCallback(android.bluetooth.BluetoothLeAudio.Callback p0) {}
    public int getGroupId(android.bluetooth.BluetoothDevice p0) { return 0; }
    public void setVolume(int p0) {}
    public int getAudioLocation(android.bluetooth.BluetoothDevice p0) { return 0; }
    public boolean isInbandRingtoneEnabled(int p0) { return false; }
    public boolean setConnectionPolicy(android.bluetooth.BluetoothDevice p0, int p1) { return false; }
    public int getConnectionPolicy(android.bluetooth.BluetoothDevice p0) { return 0; }
    @android.annotation.Nullable
    public android.bluetooth.BluetoothLeAudioCodecStatus getCodecStatus(int p0) { return null; }
    public void setCodecConfigPreference(int p0, android.bluetooth.BluetoothLeAudioCodecConfig p1, android.bluetooth.BluetoothLeAudioCodecConfig p2) {}

    public static interface Callback {
        public void onCodecConfigChanged(int p0, android.bluetooth.BluetoothLeAudioCodecStatus p1);
        public void onGroupNodeAdded(android.bluetooth.BluetoothDevice p0, int p1);
        public void onGroupNodeRemoved(android.bluetooth.BluetoothDevice p0, int p1);
        public void onGroupStatusChanged(int p0, int p1);
    }
}
