package android.bluetooth;

public final class BluetoothA2dp implements android.bluetooth.BluetoothProfile {
    private static final java.lang.String TAG = "BluetoothA2dp";
    private static final boolean DBG = true;
    private static final boolean VDBG = false;
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public static final java.lang.String ACTION_CONNECTION_STATE_CHANGED = "android.bluetooth.a2dp.profile.action.CONNECTION_STATE_CHANGED";
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public static final java.lang.String ACTION_PLAYING_STATE_CHANGED = "android.bluetooth.a2dp.profile.action.PLAYING_STATE_CHANGED";
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public static final java.lang.String ACTION_AVRCP_CONNECTION_STATE_CHANGED = "android.bluetooth.a2dp.profile.action.AVRCP_CONNECTION_STATE_CHANGED";
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public static final java.lang.String ACTION_ACTIVE_DEVICE_CHANGED = "android.bluetooth.a2dp.profile.action.ACTIVE_DEVICE_CHANGED";
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
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
    @android.annotation.SystemApi
    public static final int DYNAMIC_BUFFER_SUPPORT_NONE = 0;
    @android.annotation.SystemApi
    public static final int DYNAMIC_BUFFER_SUPPORT_A2DP_OFFLOAD = 1;
    @android.annotation.SystemApi
    public static final int DYNAMIC_BUFFER_SUPPORT_A2DP_SOFTWARE_ENCODING = 2;
    private final android.bluetooth.BluetoothAdapter mAdapter = null;
    private final android.content.AttributionSource mAttributionSource = null;
    private final android.bluetooth.BluetoothProfileConnector<android.bluetooth.IBluetoothA2dp> mProfileConnector = null;
    BluetoothA2dp(android.content.Context p0, android.bluetooth.BluetoothProfile.ServiceListener p1, android.bluetooth.BluetoothAdapter p2) {}
    void close() {}
    private android.bluetooth.IBluetoothA2dp getService() { return null; }
    public void finalize() {}
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public boolean connect(android.bluetooth.BluetoothDevice p0) { return false; }
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public boolean disconnect(android.bluetooth.BluetoothDevice p0) { return false; }
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public java.util.List<android.bluetooth.BluetoothDevice> getConnectedDevices() { return null; }
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public java.util.List<android.bluetooth.BluetoothDevice> getDevicesMatchingConnectionStates(int[] p0) { return null; }
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public int getConnectionState(android.bluetooth.BluetoothDevice p0) { return 0; }
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public boolean setActiveDevice(android.bluetooth.BluetoothDevice p0) { return false; }
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public android.bluetooth.BluetoothDevice getActiveDevice() { return null; }
    @android.annotation.RequiresPermission(allOf={"android.permission.BLUETOOTH_CONNECT", "android.permission.BLUETOOTH_PRIVILEGED"})
    public boolean setPriority(android.bluetooth.BluetoothDevice p0, int p1) { return false; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission(allOf={"android.permission.BLUETOOTH_CONNECT", "android.permission.BLUETOOTH_PRIVILEGED"})
    public boolean setConnectionPolicy(android.bluetooth.BluetoothDevice p0, int p1) { return false; }
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public int getPriority(android.bluetooth.BluetoothDevice p0) { return 0; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission(allOf={"android.permission.BLUETOOTH_CONNECT", "android.permission.BLUETOOTH_PRIVILEGED"})
    public int getConnectionPolicy(android.bluetooth.BluetoothDevice p0) { return 0; }
    @android.annotation.RequiresNoPermission
    public boolean isAvrcpAbsoluteVolumeSupported() { return false; }
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public void setAvrcpAbsoluteVolume(int p0) {}
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public boolean isA2dpPlaying(android.bluetooth.BluetoothDevice p0) { return false; }
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public boolean shouldSendVolumeKeys(android.bluetooth.BluetoothDevice p0) { return false; }
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public android.bluetooth.BluetoothCodecStatus getCodecStatus(android.bluetooth.BluetoothDevice p0) { return null; }
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public void setCodecConfigPreference(android.bluetooth.BluetoothDevice p0, android.bluetooth.BluetoothCodecConfig p1) {}
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public void enableOptionalCodecs(android.bluetooth.BluetoothDevice p0) {}
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public void disableOptionalCodecs(android.bluetooth.BluetoothDevice p0) {}
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    private void enableDisableOptionalCodecs(android.bluetooth.BluetoothDevice p0, boolean p1) {}
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public int isOptionalCodecsSupported(android.bluetooth.BluetoothDevice p0) { return 0; }
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public int isOptionalCodecsEnabled(android.bluetooth.BluetoothDevice p0) { return 0; }
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public void setOptionalCodecsEnabled(android.bluetooth.BluetoothDevice p0, int p1) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission(allOf={"android.permission.BLUETOOTH_CONNECT", "android.permission.BLUETOOTH_PRIVILEGED"})
    public int getDynamicBufferSupport() { return 0; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission(allOf={"android.permission.BLUETOOTH_CONNECT", "android.permission.BLUETOOTH_PRIVILEGED"})
    public android.bluetooth.BufferConstraints getBufferConstraints() { return null; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission(allOf={"android.permission.BLUETOOTH_CONNECT", "android.permission.BLUETOOTH_PRIVILEGED"})
    public boolean setBufferLengthMillis(int p0, int p1) { return false; }
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

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Type {
    }
}
