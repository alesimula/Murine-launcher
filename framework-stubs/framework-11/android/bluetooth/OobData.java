package android.bluetooth;

public class OobData implements android.os.Parcelable {
    private byte[] mLeBluetoothDeviceAddress;
    private byte[] mSecurityManagerTk;
    private byte[] mLeSecureConnectionsConfirmation;
    private byte[] mLeSecureConnectionsRandom;
    public static final android.os.Parcelable.Creator<android.bluetooth.OobData> CREATOR = null;
    public byte[] getLeBluetoothDeviceAddress() { return null; }
    public void setLeBluetoothDeviceAddress(byte[] p0) {}
    public byte[] getSecurityManagerTk() { return null; }
    public void setSecurityManagerTk(byte[] p0) {}
    public byte[] getLeSecureConnectionsConfirmation() { return null; }
    public void setLeSecureConnectionsConfirmation(byte[] p0) {}
    public byte[] getLeSecureConnectionsRandom() { return null; }
    public void setLeSecureConnectionsRandom(byte[] p0) {}
    public OobData() {}
    private OobData(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
