package android.bluetooth;

public class BluetoothGattService implements android.os.Parcelable {
    public static final int SERVICE_TYPE_PRIMARY = 0;
    public static final int SERVICE_TYPE_SECONDARY = 1;
    protected android.bluetooth.BluetoothDevice mDevice;
    protected java.util.UUID mUuid;
    protected int mInstanceId;
    protected int mHandles;
    protected int mServiceType;
    protected java.util.List<android.bluetooth.BluetoothGattCharacteristic> mCharacteristics;
    protected java.util.List<android.bluetooth.BluetoothGattService> mIncludedServices;
    private boolean mAdvertisePreferred;
    public static final android.os.Parcelable.Creator<android.bluetooth.BluetoothGattService> CREATOR = null;
    public BluetoothGattService(java.util.UUID p0, int p1) {}
    BluetoothGattService(android.bluetooth.BluetoothDevice p0, java.util.UUID p1, int p2, int p3) {}
    public BluetoothGattService(java.util.UUID p0, int p1, int p2) {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    private BluetoothGattService(android.os.Parcel p0) {}
    android.bluetooth.BluetoothDevice getDevice() { return null; }
    void setDevice(android.bluetooth.BluetoothDevice p0) {}
    public boolean addService(android.bluetooth.BluetoothGattService p0) { return false; }
    public boolean addCharacteristic(android.bluetooth.BluetoothGattCharacteristic p0) { return false; }
    android.bluetooth.BluetoothGattCharacteristic getCharacteristic(java.util.UUID p0, int p1) { return null; }
    public void setInstanceId(int p0) {}
    int getHandles() { return 0; }
    public void setHandles(int p0) {}
    public void addIncludedService(android.bluetooth.BluetoothGattService p0) {}
    public java.util.UUID getUuid() { return null; }
    public int getInstanceId() { return 0; }
    public int getType() { return 0; }
    public java.util.List<android.bluetooth.BluetoothGattService> getIncludedServices() { return null; }
    public java.util.List<android.bluetooth.BluetoothGattCharacteristic> getCharacteristics() { return null; }
    public android.bluetooth.BluetoothGattCharacteristic getCharacteristic(java.util.UUID p0) { return null; }
    public boolean isAdvertisePreferred() { return false; }
    public void setAdvertisePreferred(boolean p0) {}
}
