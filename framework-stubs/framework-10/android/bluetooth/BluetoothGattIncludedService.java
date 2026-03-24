package android.bluetooth;

public class BluetoothGattIncludedService implements android.os.Parcelable {
    protected java.util.UUID mUuid;
    protected int mInstanceId;
    protected int mServiceType;
    public static final android.os.Parcelable.Creator<android.bluetooth.BluetoothGattIncludedService> CREATOR = null;
    public BluetoothGattIncludedService(java.util.UUID p0, int p1, int p2) {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    private BluetoothGattIncludedService(android.os.Parcel p0) {}
    public java.util.UUID getUuid() { return null; }
    public int getInstanceId() { return 0; }
    public int getType() { return 0; }
}
