package android.bluetooth;

public final class BluetoothHearingAid implements android.bluetooth.BluetoothProfile {
    public static final java.lang.String ACTION_ACTIVE_DEVICE_CHANGED = "android.bluetooth.hearingaid.profile.action.ACTIVE_DEVICE_CHANGED";
    public static final java.lang.String ACTION_CONNECTION_STATE_CHANGED = "android.bluetooth.hearingaid.profile.action.CONNECTION_STATE_CHANGED";
    public static final long HI_SYNC_ID_INVALID = 0L;
    public static final int MODE_BINAURAL = 1;
    public static final int MODE_MONAURAL = 0;
    public static final int MODE_UNKNOWN = -1;
    public static final int SIDE_LEFT = 0;
    public static final int SIDE_RIGHT = 1;
    public static final int SIDE_UNKNOWN = -1;
    BluetoothHearingAid() {}
    @android.annotation.NonNull
    public java.util.List<android.bluetooth.BluetoothDevice> getConnectedDevices() { return null; }
    @android.annotation.NonNull
    public java.util.List<android.bluetooth.BluetoothDevice> getDevicesMatchingConnectionStates(int[] p0) { return null; }
    public int getConnectionState(android.bluetooth.BluetoothDevice p0) { return 0; }
    public boolean setConnectionPolicy(android.bluetooth.BluetoothDevice p0, int p1) { return false; }
    public int getConnectionPolicy(android.bluetooth.BluetoothDevice p0) { return 0; }
    public void setVolume(int p0) {}
    public long getHiSyncId(android.bluetooth.BluetoothDevice p0) { return 0L; }
    public int getDeviceSide(android.bluetooth.BluetoothDevice p0) { return 0; }
    public int getDeviceMode(android.bluetooth.BluetoothDevice p0) { return 0; }
    @android.annotation.Nullable
    public android.bluetooth.BluetoothHearingAid.AdvertisementServiceData getAdvertisementServiceData(android.bluetooth.BluetoothDevice p0) { return null; }

    public static final class AdvertisementServiceData implements android.os.Parcelable {
        @android.annotation.NonNull
        public static final android.os.Parcelable.Creator<android.bluetooth.BluetoothHearingAid.AdvertisementServiceData> CREATOR = null;
        AdvertisementServiceData() {}
        public int getDeviceMode() { return 0; }
        public int getDeviceSide() { return 0; }
        public boolean isCsipSupported() { return false; }
        public int getTruncatedHiSyncId() { return 0; }
        public boolean isInPairWith(android.bluetooth.BluetoothHearingAid.AdvertisementServiceData p0) { return false; }
        public int describeContents() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }
}
