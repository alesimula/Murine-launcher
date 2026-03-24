package android.bluetooth;

public class BluetoothGattDescriptor implements android.os.Parcelable {
    public static final byte[] ENABLE_NOTIFICATION_VALUE = null;
    public static final byte[] ENABLE_INDICATION_VALUE = null;
    public static final byte[] DISABLE_NOTIFICATION_VALUE = null;
    public static final int PERMISSION_READ = 1;
    public static final int PERMISSION_READ_ENCRYPTED = 2;
    public static final int PERMISSION_READ_ENCRYPTED_MITM = 4;
    public static final int PERMISSION_WRITE = 16;
    public static final int PERMISSION_WRITE_ENCRYPTED = 32;
    public static final int PERMISSION_WRITE_ENCRYPTED_MITM = 64;
    public static final int PERMISSION_WRITE_SIGNED = 128;
    public static final int PERMISSION_WRITE_SIGNED_MITM = 256;
    protected java.util.UUID mUuid;
    @android.annotation.UnsupportedAppUsage
    protected int mInstance;
    protected int mPermissions;
    @android.annotation.UnsupportedAppUsage
    protected android.bluetooth.BluetoothGattCharacteristic mCharacteristic;
    protected byte[] mValue;
    public static final android.os.Parcelable.Creator<android.bluetooth.BluetoothGattDescriptor> CREATOR = null;
    public BluetoothGattDescriptor(java.util.UUID p0, int p1) {}
    BluetoothGattDescriptor(android.bluetooth.BluetoothGattCharacteristic p0, java.util.UUID p1, int p2, int p3) {}
    public BluetoothGattDescriptor(java.util.UUID p0, int p1, int p2) {}
    private void initDescriptor(android.bluetooth.BluetoothGattCharacteristic p0, java.util.UUID p1, int p2, int p3) {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    private BluetoothGattDescriptor(android.os.Parcel p0) {}
    public android.bluetooth.BluetoothGattCharacteristic getCharacteristic() { return null; }
    @android.annotation.UnsupportedAppUsage
    void setCharacteristic(android.bluetooth.BluetoothGattCharacteristic p0) {}
    public java.util.UUID getUuid() { return null; }
    public int getInstanceId() { return 0; }
    public void setInstanceId(int p0) {}
    public int getPermissions() { return 0; }
    public byte[] getValue() { return null; }
    public boolean setValue(byte[] p0) { return false; }
}
