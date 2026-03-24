package android.bluetooth;

public final class BluetoothA2dp implements android.bluetooth.BluetoothProfile {
    private static final java.lang.String TAG = "BluetoothA2dp";
    private static final boolean DBG = true;
    private static final boolean VDBG = false;
    public static final java.lang.String ACTION_CONNECTION_STATE_CHANGED = "android.bluetooth.a2dp.profile.action.CONNECTION_STATE_CHANGED";
    public static final java.lang.String ACTION_PLAYING_STATE_CHANGED = "android.bluetooth.a2dp.profile.action.PLAYING_STATE_CHANGED";
    public static final java.lang.String ACTION_AVRCP_CONNECTION_STATE_CHANGED = "android.bluetooth.a2dp.profile.action.AVRCP_CONNECTION_STATE_CHANGED";
    public static final java.lang.String ACTION_ACTIVE_DEVICE_CHANGED = "android.bluetooth.a2dp.profile.action.ACTIVE_DEVICE_CHANGED";
    public static final java.lang.String ACTION_CODEC_CONFIG_CHANGED = "android.bluetooth.a2dp.profile.action.CODEC_CONFIG_CHANGED";
    public static final int STATE_PLAYING = 10;
    public static final int STATE_NOT_PLAYING = 11;
    @android.annotation.SystemApi
    public static final int OPTIONAL_CODECS_SUPPORT_UNKNOWN = -1;
    @android.annotation.SystemApi
    public static final int OPTIONAL_CODECS_NOT_SUPPORTED = 0;
    @android.annotation.SystemApi
    public static final int OPTIONAL_CODECS_SUPPORTED = 1;
    @android.annotation.SystemApi
    public static final int OPTIONAL_CODECS_PREF_UNKNOWN = -1;
    @android.annotation.SystemApi
    public static final int OPTIONAL_CODECS_PREF_DISABLED = 0;
    @android.annotation.SystemApi
    public static final int OPTIONAL_CODECS_PREF_ENABLED = 1;
    private android.bluetooth.BluetoothAdapter mAdapter;
    private final android.bluetooth.BluetoothProfileConnector<android.bluetooth.IBluetoothA2dp> mProfileConnector = null;
    BluetoothA2dp(android.content.Context p0, android.bluetooth.BluetoothProfile.ServiceListener p1) {}
    void close() {}
    private android.bluetooth.IBluetoothA2dp getService() { return null; }
    public void finalize() {}
    public boolean connect(android.bluetooth.BluetoothDevice p0) { return false; }
    public boolean disconnect(android.bluetooth.BluetoothDevice p0) { return false; }
    public java.util.List<android.bluetooth.BluetoothDevice> getConnectedDevices() { return null; }
    public java.util.List<android.bluetooth.BluetoothDevice> getDevicesMatchingConnectionStates(int[] p0) { return null; }
    public int getConnectionState(android.bluetooth.BluetoothDevice p0) { return 0; }
    public boolean setActiveDevice(android.bluetooth.BluetoothDevice p0) { return false; }
    public android.bluetooth.BluetoothDevice getActiveDevice() { return null; }
    public boolean setPriority(android.bluetooth.BluetoothDevice p0, int p1) { return false; }
    @android.annotation.SystemApi
    public boolean setConnectionPolicy(android.bluetooth.BluetoothDevice p0, int p1) { return false; }
    public int getPriority(android.bluetooth.BluetoothDevice p0) { return 0; }
    @android.annotation.SystemApi
    public int getConnectionPolicy(android.bluetooth.BluetoothDevice p0) { return 0; }
    public boolean isAvrcpAbsoluteVolumeSupported() { return false; }
    public void setAvrcpAbsoluteVolume(int p0) {}
    public boolean isA2dpPlaying(android.bluetooth.BluetoothDevice p0) { return false; }
    public boolean shouldSendVolumeKeys(android.bluetooth.BluetoothDevice p0) { return false; }
    public android.bluetooth.BluetoothCodecStatus getCodecStatus(android.bluetooth.BluetoothDevice p0) { return null; }
    public void setCodecConfigPreference(android.bluetooth.BluetoothDevice p0, android.bluetooth.BluetoothCodecConfig p1) {}
    public void enableOptionalCodecs(android.bluetooth.BluetoothDevice p0) {}
    public void disableOptionalCodecs(android.bluetooth.BluetoothDevice p0) {}
    private void enableDisableOptionalCodecs(android.bluetooth.BluetoothDevice p0, boolean p1) {}
    public int isOptionalCodecsSupported(android.bluetooth.BluetoothDevice p0) { return 0; }
    public int isOptionalCodecsEnabled(android.bluetooth.BluetoothDevice p0) { return 0; }
    public void setOptionalCodecsEnabled(android.bluetooth.BluetoothDevice p0, int p1) {}
    public static java.lang.String stateToString(int p0) { return null; }
    private boolean isEnabled() { return false; }
    private void verifyDeviceNotNull(android.bluetooth.BluetoothDevice p0, java.lang.String p1) {}
    private boolean isValidDevice(android.bluetooth.BluetoothDevice p0) { return false; }
    private static void log(java.lang.String p0) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface OptionalCodecsPreferenceStatus {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface OptionalCodecsSupportStatus {
    }
}
