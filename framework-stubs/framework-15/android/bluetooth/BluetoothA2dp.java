package android.bluetooth;

public final class BluetoothA2dp implements android.bluetooth.BluetoothProfile {
    public static final java.lang.String ACTION_ACTIVE_DEVICE_CHANGED = "android.bluetooth.a2dp.profile.action.ACTIVE_DEVICE_CHANGED";
    public static final java.lang.String ACTION_CODEC_CONFIG_CHANGED = "android.bluetooth.a2dp.profile.action.CODEC_CONFIG_CHANGED";
    public static final java.lang.String ACTION_CONNECTION_STATE_CHANGED = "android.bluetooth.a2dp.profile.action.CONNECTION_STATE_CHANGED";
    public static final java.lang.String ACTION_PLAYING_STATE_CHANGED = "android.bluetooth.a2dp.profile.action.PLAYING_STATE_CHANGED";
    public static final int DYNAMIC_BUFFER_SUPPORT_A2DP_OFFLOAD = 1;
    public static final int DYNAMIC_BUFFER_SUPPORT_A2DP_SOFTWARE_ENCODING = 2;
    public static final int DYNAMIC_BUFFER_SUPPORT_NONE = 0;
    public static final int OPTIONAL_CODECS_NOT_SUPPORTED = 0;
    public static final int OPTIONAL_CODECS_PREF_DISABLED = 0;
    public static final int OPTIONAL_CODECS_PREF_ENABLED = 1;
    public static final int OPTIONAL_CODECS_PREF_UNKNOWN = -1;
    public static final int OPTIONAL_CODECS_SUPPORTED = 1;
    public static final int OPTIONAL_CODECS_SUPPORT_UNKNOWN = -1;
    public static final int STATE_NOT_PLAYING = 11;
    public static final int STATE_PLAYING = 10;
    BluetoothA2dp() {}
    public void finalize() {}
    public java.util.List<android.bluetooth.BluetoothDevice> getConnectedDevices() { return null; }
    public int getConnectionState(android.bluetooth.BluetoothDevice p0) { return 0; }
    public java.util.List<android.bluetooth.BluetoothDevice> getDevicesMatchingConnectionStates(int[] p0) { return null; }
    @android.annotation.NonNull
    public java.util.Collection<android.bluetooth.BluetoothCodecType> getSupportedCodecTypes() { return null; }
    public boolean isA2dpPlaying(android.bluetooth.BluetoothDevice p0) { return false; }
    public void disableOptionalCodecs(android.bluetooth.BluetoothDevice p0) {}
    public void enableOptionalCodecs(android.bluetooth.BluetoothDevice p0) {}
    @android.annotation.Nullable
    public android.bluetooth.BufferConstraints getBufferConstraints() { return null; }
    @android.annotation.Nullable
    public android.bluetooth.BluetoothCodecStatus getCodecStatus(android.bluetooth.BluetoothDevice p0) { return null; }
    public int getConnectionPolicy(android.bluetooth.BluetoothDevice p0) { return 0; }
    public int getDynamicBufferSupport() { return 0; }
    public int isOptionalCodecsEnabled(android.bluetooth.BluetoothDevice p0) { return 0; }
    public int isOptionalCodecsSupported(android.bluetooth.BluetoothDevice p0) { return 0; }
    public void setAvrcpAbsoluteVolume(int p0) {}
    public boolean setBufferLengthMillis(int p0, int p1) { return false; }
    public void setCodecConfigPreference(android.bluetooth.BluetoothDevice p0, android.bluetooth.BluetoothCodecConfig p1) {}
    public boolean setConnectionPolicy(android.bluetooth.BluetoothDevice p0, int p1) { return false; }
    public void setOptionalCodecsEnabled(android.bluetooth.BluetoothDevice p0, int p1) {}
}
