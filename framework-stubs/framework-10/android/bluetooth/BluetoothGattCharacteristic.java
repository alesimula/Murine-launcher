package android.bluetooth;

public class BluetoothGattCharacteristic implements android.os.Parcelable {
    public static final int PROPERTY_BROADCAST = 1;
    public static final int PROPERTY_READ = 2;
    public static final int PROPERTY_WRITE_NO_RESPONSE = 4;
    public static final int PROPERTY_WRITE = 8;
    public static final int PROPERTY_NOTIFY = 16;
    public static final int PROPERTY_INDICATE = 32;
    public static final int PROPERTY_SIGNED_WRITE = 64;
    public static final int PROPERTY_EXTENDED_PROPS = 128;
    public static final int PERMISSION_READ = 1;
    public static final int PERMISSION_READ_ENCRYPTED = 2;
    public static final int PERMISSION_READ_ENCRYPTED_MITM = 4;
    public static final int PERMISSION_WRITE = 16;
    public static final int PERMISSION_WRITE_ENCRYPTED = 32;
    public static final int PERMISSION_WRITE_ENCRYPTED_MITM = 64;
    public static final int PERMISSION_WRITE_SIGNED = 128;
    public static final int PERMISSION_WRITE_SIGNED_MITM = 256;
    public static final int WRITE_TYPE_DEFAULT = 2;
    public static final int WRITE_TYPE_NO_RESPONSE = 1;
    public static final int WRITE_TYPE_SIGNED = 4;
    public static final int FORMAT_UINT8 = 17;
    public static final int FORMAT_UINT16 = 18;
    public static final int FORMAT_UINT32 = 20;
    public static final int FORMAT_SINT8 = 33;
    public static final int FORMAT_SINT16 = 34;
    public static final int FORMAT_SINT32 = 36;
    public static final int FORMAT_SFLOAT = 50;
    public static final int FORMAT_FLOAT = 52;
    protected java.util.UUID mUuid;
    @android.annotation.UnsupportedAppUsage
    protected int mInstance;
    protected int mProperties;
    protected int mPermissions;
    protected int mKeySize;
    protected int mWriteType;
    @android.annotation.UnsupportedAppUsage
    protected android.bluetooth.BluetoothGattService mService;
    protected byte[] mValue;
    protected java.util.List<android.bluetooth.BluetoothGattDescriptor> mDescriptors;
    public static final android.os.Parcelable.Creator<android.bluetooth.BluetoothGattCharacteristic> CREATOR = null;
    public BluetoothGattCharacteristic(java.util.UUID p0, int p1, int p2) {}
    BluetoothGattCharacteristic(android.bluetooth.BluetoothGattService p0, java.util.UUID p1, int p2, int p3, int p4) {}
    public BluetoothGattCharacteristic(java.util.UUID p0, int p1, int p2, int p3) {}
    private void initCharacteristic(android.bluetooth.BluetoothGattService p0, java.util.UUID p1, int p2, int p3, int p4) {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    private BluetoothGattCharacteristic(android.os.Parcel p0) {}
    public int getKeySize() { return 0; }
    public boolean addDescriptor(android.bluetooth.BluetoothGattDescriptor p0) { return false; }
    android.bluetooth.BluetoothGattDescriptor getDescriptor(java.util.UUID p0, int p1) { return null; }
    public android.bluetooth.BluetoothGattService getService() { return null; }
    @android.annotation.UnsupportedAppUsage
    void setService(android.bluetooth.BluetoothGattService p0) {}
    public java.util.UUID getUuid() { return null; }
    public int getInstanceId() { return 0; }
    public void setInstanceId(int p0) {}
    public int getProperties() { return 0; }
    public int getPermissions() { return 0; }
    public int getWriteType() { return 0; }
    public void setWriteType(int p0) {}
    @android.annotation.UnsupportedAppUsage
    public void setKeySize(int p0) {}
    public java.util.List<android.bluetooth.BluetoothGattDescriptor> getDescriptors() { return null; }
    public android.bluetooth.BluetoothGattDescriptor getDescriptor(java.util.UUID p0) { return null; }
    public byte[] getValue() { return null; }
    public java.lang.Integer getIntValue(int p0, int p1) { return null; }
    public java.lang.Float getFloatValue(int p0, int p1) { return null; }
    public java.lang.String getStringValue(int p0) { return null; }
    public boolean setValue(byte[] p0) { return false; }
    public boolean setValue(int p0, int p1, int p2) { return false; }
    public boolean setValue(int p0, int p1, int p2, int p3) { return false; }
    public boolean setValue(java.lang.String p0) { return false; }
    private int getTypeLen(int p0) { return 0; }
    private int unsignedByteToInt(byte p0) { return 0; }
    private int unsignedBytesToInt(byte p0, byte p1) { return 0; }
    private int unsignedBytesToInt(byte p0, byte p1, byte p2, byte p3) { return 0; }
    private float bytesToFloat(byte p0, byte p1) { return 0.0f; }
    private float bytesToFloat(byte p0, byte p1, byte p2, byte p3) { return 0.0f; }
    private int unsignedToSigned(int p0, int p1) { return 0; }
    private int intToSignedBits(int p0, int p1) { return 0; }
}
