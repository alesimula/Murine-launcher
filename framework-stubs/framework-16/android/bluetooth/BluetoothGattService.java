package android.bluetooth;

public class BluetoothGattService implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.bluetooth.BluetoothGattService> CREATOR = null;
    public static final int SERVICE_TYPE_PRIMARY = 0;
    public static final int SERVICE_TYPE_SECONDARY = 1;
    protected java.util.List<android.bluetooth.BluetoothGattCharacteristic> mCharacteristics;
    protected java.util.List<android.bluetooth.BluetoothGattService> mIncludedServices;
    public BluetoothGattService(java.util.UUID p0, int p1) {}
    public boolean addCharacteristic(android.bluetooth.BluetoothGattCharacteristic p0) { return false; }
    public boolean addService(android.bluetooth.BluetoothGattService p0) { return false; }
    public int describeContents() { return 0; }
    public android.bluetooth.BluetoothGattCharacteristic getCharacteristic(java.util.UUID p0) { return null; }
    public java.util.List<android.bluetooth.BluetoothGattCharacteristic> getCharacteristics() { return null; }
    public java.util.List<android.bluetooth.BluetoothGattService> getIncludedServices() { return null; }
    public int getInstanceId() { return 0; }
    public int getType() { return 0; }
    public java.util.UUID getUuid() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
