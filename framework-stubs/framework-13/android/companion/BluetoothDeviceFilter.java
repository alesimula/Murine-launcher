package android.companion;

public final class BluetoothDeviceFilter implements android.companion.DeviceFilter<android.bluetooth.BluetoothDevice> {
    public static final android.os.Parcelable.Creator<android.companion.BluetoothDeviceFilter> CREATOR = null;
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
        public Builder() { super(); }
        public android.companion.BluetoothDeviceFilter.Builder setNamePattern(java.util.regex.Pattern p0) { return null; }
        public android.companion.BluetoothDeviceFilter.Builder setAddress(java.lang.String p0) { return null; }
        public android.companion.BluetoothDeviceFilter.Builder addServiceUuid(android.os.ParcelUuid p0, android.os.ParcelUuid p1) { return null; }
        public android.companion.BluetoothDeviceFilter build() { return null; }
    }
}
