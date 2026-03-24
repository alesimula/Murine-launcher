package android.bluetooth;

public final class OobData implements android.os.Parcelable {
    public static final int CLASS_OF_DEVICE_OCTETS = 3;
    public static final int CONFIRMATION_OCTETS = 16;
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.bluetooth.OobData> CREATOR = null;
    public static final int DEVICE_ADDRESS_OCTETS = 7;
    public static final int LE_APPEARANCE_OCTETS = 2;
    public static final int LE_DEVICE_FLAG_OCTETS = 1;
    public static final int LE_DEVICE_ROLE_BOTH_PREFER_CENTRAL = 3;
    public static final int LE_DEVICE_ROLE_BOTH_PREFER_PERIPHERAL = 2;
    public static final int LE_DEVICE_ROLE_CENTRAL_ONLY = 1;
    public static final int LE_DEVICE_ROLE_OCTETS = 1;
    public static final int LE_DEVICE_ROLE_PERIPHERAL_ONLY = 0;
    public static final int LE_FLAG_BREDR_NOT_SUPPORTED = 2;
    public static final int LE_FLAG_GENERAL_DISCOVERY_MODE = 1;
    public static final int LE_FLAG_LIMITED_DISCOVERY_MODE = 0;
    public static final int LE_FLAG_SIMULTANEOUS_CONTROLLER = 3;
    public static final int LE_FLAG_SIMULTANEOUS_HOST = 4;
    public static final int LE_TK_OCTETS = 16;
    public static final int OOB_LENGTH_OCTETS = 2;
    public static final int RANDOMIZER_OCTETS = 16;
    OobData() {}
    public int describeContents() { return 0; }
    @android.annotation.NonNull
    public byte[] getClassOfDevice() { return null; }
    @android.annotation.NonNull
    public byte[] getClassicLength() { return null; }
    @android.annotation.NonNull
    public byte[] getConfirmationHash() { return null; }
    @android.annotation.NonNull
    public byte[] getDeviceAddressWithType() { return null; }
    @android.annotation.Nullable
    public byte[] getDeviceName() { return null; }
    @android.annotation.Nullable
    public byte[] getLeAppearance() { return null; }
    public int getLeDeviceRole() { return 0; }
    public int getLeFlags() { return 0; }
    @android.annotation.Nullable
    public byte[] getLeTemporaryKey() { return null; }
    @android.annotation.NonNull
    public byte[] getRandomizerHash() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class ClassicBuilder {
        public ClassicBuilder(byte[] p0, byte[] p1, byte[] p2) {}
        @android.annotation.NonNull
        public android.bluetooth.OobData build() { return null; }
        @android.annotation.NonNull
        public android.bluetooth.OobData.ClassicBuilder setClassOfDevice(byte[] p0) { return null; }
        @android.annotation.NonNull
        public android.bluetooth.OobData.ClassicBuilder setDeviceName(byte[] p0) { return null; }
        @android.annotation.NonNull
        public android.bluetooth.OobData.ClassicBuilder setRandomizerHash(byte[] p0) { return null; }
    }

    public static final class LeBuilder {
        public LeBuilder(byte[] p0, byte[] p1, int p2) {}
        @android.annotation.NonNull
        public android.bluetooth.OobData build() { return null; }
        @android.annotation.NonNull
        public android.bluetooth.OobData.LeBuilder setDeviceName(byte[] p0) { return null; }
        @android.annotation.NonNull
        public android.bluetooth.OobData.LeBuilder setLeFlags(int p0) { return null; }
        @android.annotation.NonNull
        public android.bluetooth.OobData.LeBuilder setLeTemporaryKey(byte[] p0) { return null; }
        @android.annotation.NonNull
        public android.bluetooth.OobData.LeBuilder setRandomizerHash(byte[] p0) { return null; }
    }
}
