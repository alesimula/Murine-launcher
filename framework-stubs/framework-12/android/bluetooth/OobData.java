package android.bluetooth;

@android.annotation.SystemApi
public final class OobData implements android.os.Parcelable {
    private static final java.lang.String TAG = "OobData";
    @android.annotation.SystemApi
    public static final int OOB_LENGTH_OCTETS = 2;
    @android.annotation.SystemApi
    public static final int DEVICE_ADDRESS_OCTETS = 7;
    @android.annotation.SystemApi
    public static final int CLASS_OF_DEVICE_OCTETS = 3;
    @android.annotation.SystemApi
    public static final int CONFIRMATION_OCTETS = 16;
    @android.annotation.SystemApi
    public static final int RANDOMIZER_OCTETS = 16;
    @android.annotation.SystemApi
    public static final int LE_DEVICE_ROLE_OCTETS = 1;
    @android.annotation.SystemApi
    public static final int LE_TK_OCTETS = 16;
    @android.annotation.SystemApi
    public static final int LE_APPEARANCE_OCTETS = 2;
    @android.annotation.SystemApi
    public static final int LE_DEVICE_FLAG_OCTETS = 1;
    @android.annotation.SystemApi
    public static final int LE_DEVICE_ROLE_PERIPHERAL_ONLY = 0;
    @android.annotation.SystemApi
    public static final int LE_DEVICE_ROLE_CENTRAL_ONLY = 1;
    @android.annotation.SystemApi
    public static final int LE_DEVICE_ROLE_BOTH_PREFER_PERIPHERAL = 2;
    @android.annotation.SystemApi
    public static final int LE_DEVICE_ROLE_BOTH_PREFER_CENTRAL = 3;
    @android.annotation.SystemApi
    public static final int LE_FLAG_LIMITED_DISCOVERY_MODE = 0;
    @android.annotation.SystemApi
    public static final int LE_FLAG_GENERAL_DISCOVERY_MODE = 1;
    @android.annotation.SystemApi
    public static final int LE_FLAG_BREDR_NOT_SUPPORTED = 2;
    @android.annotation.SystemApi
    public static final int LE_FLAG_SIMULTANEOUS_CONTROLLER = 3;
    @android.annotation.SystemApi
    public static final int LE_FLAG_SIMULTANEOUS_HOST = 4;
    private final byte[] mDeviceAddressWithType = null;
    private final byte[] mConfirmationHash = null;
    private byte[] mRandomizerHash;
    private byte[] mDeviceName;
    private final byte[] mClassicLength = null;
    private byte[] mClassOfDevice;
    private final int mLeDeviceRole = 0;
    private byte[] mLeTemporaryKey;
    private byte[] mLeAppearance;
    private int mLeFlags;
    public static final android.os.Parcelable.Creator<android.bluetooth.OobData> CREATOR = null;
    @android.annotation.SystemApi
    public byte[] getDeviceAddressWithType() { return null; }
    @android.annotation.SystemApi
    public byte[] getConfirmationHash() { return null; }
    @android.annotation.SystemApi
    public byte[] getRandomizerHash() { return null; }
    @android.annotation.SystemApi
    public byte[] getDeviceName() { return null; }
    @android.annotation.SystemApi
    public byte[] getClassicLength() { return null; }
    @android.annotation.SystemApi
    public byte[] getClassOfDevice() { return null; }
    @android.annotation.SystemApi
    public byte[] getLeTemporaryKey() { return null; }
    @android.annotation.SystemApi
    public byte[] getLeAppearance() { return null; }
    @android.annotation.SystemApi
    public int getLeFlags() { return 0; }
    @android.annotation.SystemApi
    public int getLeDeviceRole() { return 0; }
    private OobData(byte[] p0, byte[] p1, byte[] p2) {}
    private OobData(byte[] p0, int p1, byte[] p2) {}
    private OobData(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public java.lang.String toString() { return null; }
    private java.lang.String toHexString(int p0) { return null; }
    private java.lang.String toHexString(byte p0) { return null; }
    private java.lang.String toHexString(byte[] p0) { return null; }

    @android.annotation.SystemApi
    public static final class ClassicBuilder {
        private byte[] mConfirmationHash;
        private byte[] mRandomizerHash;
        private byte[] mDeviceName;
        private final byte[] mClassicLength = null;
        private final byte[] mDeviceAddressWithType = null;
        private byte[] mClassOfDevice;
        @android.annotation.SystemApi
        public ClassicBuilder(byte[] p0, byte[] p1, byte[] p2) {}
        @android.annotation.SystemApi
        public android.bluetooth.OobData.ClassicBuilder setRandomizerHash(byte[] p0) { return null; }
        @android.annotation.SystemApi
        public android.bluetooth.OobData.ClassicBuilder setDeviceName(byte[] p0) { return null; }
        @android.annotation.SystemApi
        public android.bluetooth.OobData.ClassicBuilder setClassOfDevice(byte[] p0) { return null; }
        @android.annotation.SystemApi
        public android.bluetooth.OobData build() { return null; }
    }

    @android.annotation.SystemApi
    public static final class LeBuilder {
        private byte[] mConfirmationHash;
        private byte[] mRandomizerHash;
        private byte[] mDeviceName;
        private final byte[] mDeviceAddressWithType = null;
        private final int mLeDeviceRole = 0;
        private byte[] mLeTemporaryKey;
        private byte[] mLeAppearance;
        private int mLeFlags;
        @android.annotation.SystemApi
        public android.bluetooth.OobData.LeBuilder setDeviceName(byte[] p0) { return null; }
        @android.annotation.SystemApi
        public LeBuilder(byte[] p0, byte[] p1, int p2) {}
        @android.annotation.SystemApi
        public android.bluetooth.OobData.LeBuilder setLeTemporaryKey(byte[] p0) { return null; }
        @android.annotation.SystemApi
        public android.bluetooth.OobData.LeBuilder setRandomizerHash(byte[] p0) { return null; }
        @android.annotation.SystemApi
        public android.bluetooth.OobData.LeBuilder setLeFlags(int p0) { return null; }
        @android.annotation.SystemApi
        public android.bluetooth.OobData build() { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface LeFlag {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface LeRole {
    }
}
