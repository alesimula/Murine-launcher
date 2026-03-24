package android.companion;

public final class BluetoothLeDeviceFilter implements android.companion.DeviceFilter<android.bluetooth.le.ScanResult> {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.companion.BluetoothLeDeviceFilter> CREATOR = null;
    @android.annotation.Nullable
    public java.util.regex.Pattern getNamePattern() { return null; }
    @android.annotation.NonNull
    public android.bluetooth.le.ScanFilter getScanFilter() { return null; }
    @android.annotation.Nullable
    public byte[] getRawDataFilter() { return null; }
    @android.annotation.Nullable
    public byte[] getRawDataFilterMask() { return null; }
    @android.annotation.Nullable
    public java.lang.String getRenamePrefix() { return null; }
    @android.annotation.Nullable
    public java.lang.String getRenameSuffix() { return null; }
    public int getRenameBytesFrom() { return 0; }
    public int getRenameBytesLength() { return 0; }
    public boolean isRenameBytesReverseOrder() { return false; }
    @android.annotation.Nullable
    public java.lang.String getDeviceDisplayName(android.bluetooth.le.ScanResult p0) { return null; }
    public boolean matches(android.bluetooth.le.ScanResult p0) { return false; }
    public int getMediumType() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    public java.lang.String toString() { return null; }
    public static int getRenamePrefixLengthLimit() { return 0; }

    public static final class Builder extends android.provider.OneTimeUseBuilder<android.companion.BluetoothLeDeviceFilter> {
        public Builder() { super(); }
        public android.companion.BluetoothLeDeviceFilter.Builder setNamePattern(java.util.regex.Pattern p0) { return null; }
        @android.annotation.NonNull
        public android.companion.BluetoothLeDeviceFilter.Builder setScanFilter(android.bluetooth.le.ScanFilter p0) { return null; }
        @android.annotation.NonNull
        public android.companion.BluetoothLeDeviceFilter.Builder setRawDataFilter(byte[] p0, byte[] p1) { return null; }
        @android.annotation.NonNull
        public android.companion.BluetoothLeDeviceFilter.Builder setRenameFromBytes(java.lang.String p0, java.lang.String p1, int p2, int p3, java.nio.ByteOrder p4) { return null; }
        @android.annotation.NonNull
        public android.companion.BluetoothLeDeviceFilter.Builder setRenameFromName(java.lang.String p0, java.lang.String p1, int p2, int p3) { return null; }
        @android.annotation.NonNull
        public android.companion.BluetoothLeDeviceFilter build() { return null; }
    }
}
