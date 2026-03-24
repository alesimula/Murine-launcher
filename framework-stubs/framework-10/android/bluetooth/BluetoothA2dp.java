package android.bluetooth;

public final class BluetoothA2dp implements android.bluetooth.BluetoothProfile {
    private static final java.lang.String TAG = "BluetoothA2dp";
    private static final boolean DBG = true;
    private static final boolean VDBG = false;
    public static final java.lang.String ACTION_CONNECTION_STATE_CHANGED = "android.bluetooth.a2dp.profile.action.CONNECTION_STATE_CHANGED";
    public static final java.lang.String ACTION_PLAYING_STATE_CHANGED = "android.bluetooth.a2dp.profile.action.PLAYING_STATE_CHANGED";
    public static final java.lang.String ACTION_AVRCP_CONNECTION_STATE_CHANGED = "android.bluetooth.a2dp.profile.action.AVRCP_CONNECTION_STATE_CHANGED";
    @android.annotation.UnsupportedAppUsage
    public static final java.lang.String ACTION_ACTIVE_DEVICE_CHANGED = "android.bluetooth.a2dp.profile.action.ACTIVE_DEVICE_CHANGED";
    @android.annotation.UnsupportedAppUsage
    public static final java.lang.String ACTION_CODEC_CONFIG_CHANGED = "android.bluetooth.a2dp.profile.action.CODEC_CONFIG_CHANGED";
    public static final int STATE_PLAYING = 10;
    public static final int STATE_NOT_PLAYING = 11;
    @android.annotation.UnsupportedAppUsage
    public static final int OPTIONAL_CODECS_SUPPORT_UNKNOWN = -1;
    @android.annotation.UnsupportedAppUsage
    public static final int OPTIONAL_CODECS_NOT_SUPPORTED = 0;
    @android.annotation.UnsupportedAppUsage
    public static final int OPTIONAL_CODECS_SUPPORTED = 1;
    @android.annotation.UnsupportedAppUsage
    public static final int OPTIONAL_CODECS_PREF_UNKNOWN = -1;
    @android.annotation.UnsupportedAppUsage
    public static final int OPTIONAL_CODECS_PREF_DISABLED = 0;
    @android.annotation.UnsupportedAppUsage
    public static final int OPTIONAL_CODECS_PREF_ENABLED = 1;
    private android.bluetooth.BluetoothAdapter mAdapter;
    private final android.bluetooth.BluetoothProfileConnector<android.bluetooth.IBluetoothA2dp> mProfileConnector = null;
    BluetoothA2dp(android.content.Context p0, android.bluetooth.BluetoothProfile.ServiceListener p1) {}
    @android.annotation.UnsupportedAppUsage
    void close() {}
    private android.bluetooth.IBluetoothA2dp getService() { return null; }
    public void finalize() {}
    @android.annotation.UnsupportedAppUsage
    public boolean connect(android.bluetooth.BluetoothDevice p0) { return false; }
    @android.annotation.UnsupportedAppUsage
    public boolean disconnect(android.bluetooth.BluetoothDevice p0) { return false; }
    public java.util.List<android.bluetooth.BluetoothDevice> getConnectedDevices() { return null; }
    public java.util.List<android.bluetooth.BluetoothDevice> getDevicesMatchingConnectionStates(int[] p0) { return null; }
    public int getConnectionState(android.bluetooth.BluetoothDevice p0) { return 0; }
    @android.annotation.UnsupportedAppUsage
    public boolean setActiveDevice(android.bluetooth.BluetoothDevice p0) { return false; }
    @android.annotation.UnsupportedAppUsage
    public android.bluetooth.BluetoothDevice getActiveDevice() { return null; }
    public boolean setPriority(android.bluetooth.BluetoothDevice p0, int p1) { return false; }
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=115609023L)
    public int getPriority(android.bluetooth.BluetoothDevice p0) { return 0; }
    public boolean isAvrcpAbsoluteVolumeSupported() { return false; }
    public void setAvrcpAbsoluteVolume(int p0) {}
    public boolean isA2dpPlaying(android.bluetooth.BluetoothDevice p0) { return false; }
    public boolean shouldSendVolumeKeys(android.bluetooth.BluetoothDevice p0) { return false; }
    @android.annotation.UnsupportedAppUsage
    public android.bluetooth.BluetoothCodecStatus getCodecStatus(android.bluetooth.BluetoothDevice p0) { return null; }
    @android.annotation.UnsupportedAppUsage
    public void setCodecConfigPreference(android.bluetooth.BluetoothDevice p0, android.bluetooth.BluetoothCodecConfig p1) {}
    @android.annotation.UnsupportedAppUsage
    public void enableOptionalCodecs(android.bluetooth.BluetoothDevice p0) {}
    @android.annotation.UnsupportedAppUsage
    public void disableOptionalCodecs(android.bluetooth.BluetoothDevice p0) {}
    private void enableDisableOptionalCodecs(android.bluetooth.BluetoothDevice p0, boolean p1) {}
    @android.annotation.UnsupportedAppUsage
    public int supportsOptionalCodecs(android.bluetooth.BluetoothDevice p0) { return 0; }
    @android.annotation.UnsupportedAppUsage
    public int getOptionalCodecsEnabled(android.bluetooth.BluetoothDevice p0) { return 0; }
    @android.annotation.UnsupportedAppUsage
    public void setOptionalCodecsEnabled(android.bluetooth.BluetoothDevice p0, int p1) {}
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=115609023L)
    public static java.lang.String stateToString(int p0) { return null; }
    private boolean isEnabled() { return false; }
    private boolean isValidDevice(android.bluetooth.BluetoothDevice p0) { return false; }
    private static void log(java.lang.String p0) {}
}
