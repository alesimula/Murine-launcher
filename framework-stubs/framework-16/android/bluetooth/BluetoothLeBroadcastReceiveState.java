package android.bluetooth;

public final class BluetoothLeBroadcastReceiveState implements android.os.Parcelable {
    public static final int BIG_ENCRYPTION_STATE_BAD_CODE = 3;
    public static final int BIG_ENCRYPTION_STATE_CODE_REQUIRED = 1;
    public static final int BIG_ENCRYPTION_STATE_DECRYPTING = 2;
    public static final int BIG_ENCRYPTION_STATE_NOT_ENCRYPTED = 0;
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.bluetooth.BluetoothLeBroadcastReceiveState> CREATOR = null;
    public static final int PA_SYNC_STATE_FAILED_TO_SYNCHRONIZE = 3;
    public static final int PA_SYNC_STATE_IDLE = 0;
    public static final int PA_SYNC_STATE_NO_PAST = 4;
    public static final int PA_SYNC_STATE_SYNCHRONIZED = 2;
    public static final int PA_SYNC_STATE_SYNCINFO_REQUEST = 1;
    BluetoothLeBroadcastReceiveState() {}
    public int describeContents() { return 0; }
    @android.annotation.Nullable
    public byte[] getBadCode() { return null; }
    public int getBigEncryptionState() { return 0; }
    @android.annotation.NonNull
    public java.util.List<java.lang.Long> getBisSyncState() { return null; }
    public int getBroadcastId() { return 0; }
    public int getNumSubgroups() { return 0; }
    public int getPaSyncState() { return 0; }
    public int getSourceAddressType() { return 0; }
    public int getSourceAdvertisingSid() { return 0; }
    @android.annotation.NonNull
    public android.bluetooth.BluetoothDevice getSourceDevice() { return null; }
    public int getSourceId() { return 0; }
    @android.annotation.NonNull
    public java.util.List<android.bluetooth.BluetoothLeAudioContentMetadata> getSubgroupMetadata() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
