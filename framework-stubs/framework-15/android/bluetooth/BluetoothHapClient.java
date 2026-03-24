package android.bluetooth;

public final class BluetoothHapClient implements java.lang.AutoCloseable, android.bluetooth.BluetoothProfile {
    public static final java.lang.String ACTION_HAP_CONNECTION_STATE_CHANGED = "android.bluetooth.action.HAP_CONNECTION_STATE_CHANGED";
    public static final int PRESET_INDEX_UNAVAILABLE = 0;
    public static final int TYPE_BANDED = 2;
    public static final int TYPE_BINAURAL = 0;
    public static final int TYPE_MONAURAL = 1;
    public static final int TYPE_RFU = 3;
    BluetoothHapClient() {}
    public void close() {}
    protected void finalize() {}
    public int getActivePresetIndex(android.bluetooth.BluetoothDevice p0) { return 0; }
    @android.annotation.Nullable
    public android.bluetooth.BluetoothHapPresetInfo getActivePresetInfo(android.bluetooth.BluetoothDevice p0) { return null; }
    @android.annotation.NonNull
    public java.util.List<android.bluetooth.BluetoothHapPresetInfo> getAllPresetInfo(android.bluetooth.BluetoothDevice p0) { return null; }
    @android.annotation.NonNull
    public java.util.List<android.bluetooth.BluetoothDevice> getConnectedDevices() { return null; }
    public int getConnectionPolicy(android.bluetooth.BluetoothDevice p0) { return 0; }
    public int getConnectionState(android.bluetooth.BluetoothDevice p0) { return 0; }
    @android.annotation.NonNull
    public java.util.List<android.bluetooth.BluetoothDevice> getDevicesMatchingConnectionStates(int[] p0) { return null; }
    public int getHapGroup(android.bluetooth.BluetoothDevice p0) { return 0; }
    public int getHearingAidType(android.bluetooth.BluetoothDevice p0) { return 0; }
    @android.annotation.Nullable
    public android.bluetooth.BluetoothHapPresetInfo getPresetInfo(android.bluetooth.BluetoothDevice p0, int p1) { return null; }
    public void registerCallback(java.util.concurrent.Executor p0, android.bluetooth.BluetoothHapClient.Callback p1) {}
    public void selectPreset(android.bluetooth.BluetoothDevice p0, int p1) {}
    public void selectPresetForGroup(int p0, int p1) {}
    public boolean setConnectionPolicy(android.bluetooth.BluetoothDevice p0, int p1) { return false; }
    public void setPresetName(android.bluetooth.BluetoothDevice p0, int p1, java.lang.String p2) {}
    public void setPresetNameForGroup(int p0, int p1, java.lang.String p2) {}
    public boolean supportsDynamicPresets(android.bluetooth.BluetoothDevice p0) { return false; }
    public boolean supportsIndependentPresets(android.bluetooth.BluetoothDevice p0) { return false; }
    public boolean supportsSynchronizedPresets(android.bluetooth.BluetoothDevice p0) { return false; }
    public boolean supportsWritablePresets(android.bluetooth.BluetoothDevice p0) { return false; }
    public void switchToNextPreset(android.bluetooth.BluetoothDevice p0) {}
    public void switchToNextPresetForGroup(int p0) {}
    public void switchToPreviousPreset(android.bluetooth.BluetoothDevice p0) {}
    public void switchToPreviousPresetForGroup(int p0) {}
    public void unregisterCallback(android.bluetooth.BluetoothHapClient.Callback p0) {}

    public static interface Callback {
        public void onPresetInfoChanged(android.bluetooth.BluetoothDevice p0, java.util.List<android.bluetooth.BluetoothHapPresetInfo> p1, int p2);
        public void onPresetSelected(android.bluetooth.BluetoothDevice p0, int p1, int p2);
        public void onPresetSelectionFailed(android.bluetooth.BluetoothDevice p0, int p1);
        public void onPresetSelectionForGroupFailed(int p0, int p1);
        public void onSetPresetNameFailed(android.bluetooth.BluetoothDevice p0, int p1);
        public void onSetPresetNameForGroupFailed(int p0, int p1);
    }
}
