package android.companion;

public final class BluetoothDeviceFilter implements android.companion.DeviceFilter<android.bluetooth.BluetoothDevice> {
    private final java.util.regex.Pattern mNamePattern = null;
    private final java.lang.String mAddress = null;
    private final java.util.List<android.os.ParcelUuid> mServiceUuids = null;
    private final java.util.List<android.os.ParcelUuid> mServiceUuidMasks = null;
    public static final android.os.Parcelable.Creator<android.companion.BluetoothDeviceFilter> CREATOR = null;
    private BluetoothDeviceFilter(java.util.regex.Pattern p0, java.lang.String p1, java.util.List<android.os.ParcelUuid> p2, java.util.List<android.os.ParcelUuid> p3) {}
    private BluetoothDeviceFilter(android.os.Parcel p0) {}
    private static java.util.List<android.os.ParcelUuid> readUuids(android.os.Parcel p0) { return null; }
    public boolean matches(android.bluetooth.BluetoothDevice p0) { return false; }
    public java.lang.String getDeviceDisplayName(android.bluetooth.BluetoothDevice p0) { return null; }
    public int getMediumType() { return 0; }
    public java.util.regex.Pattern getNamePattern() { return null; }
    public java.lang.String getAddress() { return null; }
    public java.util.List<android.os.ParcelUuid> getServiceUuids() { return null; }
    public java.util.List<android.os.ParcelUuid> getServiceUuidMasks() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }

    public static final class Builder extends android.provider.OneTimeUseBuilder<android.companion.BluetoothDeviceFilter> {
        private java.util.regex.Pattern mNamePattern;
        private java.lang.String mAddress;
        private java.util.ArrayList<android.os.ParcelUuid> mServiceUuid;
        private java.util.ArrayList<android.os.ParcelUuid> mServiceUuidMask;
        public Builder() { super(); }
        public android.companion.BluetoothDeviceFilter.Builder setNamePattern(java.util.regex.Pattern p0) { return null; }
        public android.companion.BluetoothDeviceFilter.Builder setAddress(java.lang.String p0) { return null; }
        public android.companion.BluetoothDeviceFilter.Builder addServiceUuid(android.os.ParcelUuid p0, android.os.ParcelUuid p1) { return null; }
        public android.companion.BluetoothDeviceFilter build() { return null; }
    }
}
