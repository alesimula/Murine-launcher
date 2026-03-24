package android.bluetooth;

public class BluetoothGattDescriptor implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.bluetooth.BluetoothGattDescriptor> CREATOR = null;
    public static final byte[] DISABLE_NOTIFICATION_VALUE = null;
    public static final byte[] ENABLE_INDICATION_VALUE = null;
    public static final byte[] ENABLE_NOTIFICATION_VALUE = null;
    public static final int PERMISSION_READ = 1;
    public static final int PERMISSION_READ_ENCRYPTED = 2;
    public static final int PERMISSION_READ_ENCRYPTED_MITM = 4;
    public static final int PERMISSION_WRITE = 16;
    public static final int PERMISSION_WRITE_ENCRYPTED = 32;
    public static final int PERMISSION_WRITE_ENCRYPTED_MITM = 64;
    public static final int PERMISSION_WRITE_SIGNED = 128;
    public static final int PERMISSION_WRITE_SIGNED_MITM = 256;
    public BluetoothGattDescriptor(java.util.UUID p0, int p1) {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public android.bluetooth.BluetoothGattCharacteristic getCharacteristic() { return null; }
    public java.util.UUID getUuid() { return null; }
    public int getPermissions() { return 0; }
    @java.lang.Deprecated
    public byte[] getValue() { return null; }
    @java.lang.Deprecated
    public boolean setValue(byte[] p0) { return false; }
}
