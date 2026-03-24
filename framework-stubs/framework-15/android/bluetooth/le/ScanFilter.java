package android.bluetooth.le;

public final class ScanFilter implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.bluetooth.le.ScanFilter> CREATOR = null;
    ScanFilter() {}
    public int describeContents() { return 0; }
    @android.annotation.Nullable
    public byte[] getAdvertisingData() { return null; }
    @android.annotation.Nullable
    public byte[] getAdvertisingDataMask() { return null; }
    public int getAdvertisingDataType() { return 0; }
    @android.annotation.Nullable
    public java.lang.String getDeviceAddress() { return null; }
    @android.annotation.Nullable
    public java.lang.String getDeviceName() { return null; }
    @android.annotation.Nullable
    public byte[] getManufacturerData() { return null; }
    @android.annotation.Nullable
    public byte[] getManufacturerDataMask() { return null; }
    public int getManufacturerId() { return 0; }
    @android.annotation.Nullable
    public byte[] getServiceData() { return null; }
    @android.annotation.Nullable
    public byte[] getServiceDataMask() { return null; }
    @android.annotation.Nullable
    public android.os.ParcelUuid getServiceDataUuid() { return null; }
    @android.annotation.Nullable
    public android.os.ParcelUuid getServiceSolicitationUuid() { return null; }
    @android.annotation.Nullable
    public android.os.ParcelUuid getServiceSolicitationUuidMask() { return null; }
    @android.annotation.Nullable
    public android.os.ParcelUuid getServiceUuid() { return null; }
    @android.annotation.Nullable
    public android.os.ParcelUuid getServiceUuidMask() { return null; }
    public boolean matches(android.bluetooth.le.ScanResult p0) { return false; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int getAddressType() { return 0; }
    @android.annotation.Nullable
    public byte[] getIrk() { return null; }
    @android.annotation.Nullable
    public android.bluetooth.le.TransportBlockFilter getTransportBlockFilter() { return null; }

    public static final class Builder {
        public static final int LEN_IRK_OCTETS = 16;
        public Builder() {}
        public android.bluetooth.le.ScanFilter build() { return null; }
        @android.annotation.NonNull
        public android.bluetooth.le.ScanFilter.Builder setAdvertisingDataType(int p0) { return null; }
        @android.annotation.NonNull
        public android.bluetooth.le.ScanFilter.Builder setAdvertisingDataTypeWithData(int p0, byte[] p1, byte[] p2) { return null; }
        public android.bluetooth.le.ScanFilter.Builder setDeviceAddress(java.lang.String p0) { return null; }
        public android.bluetooth.le.ScanFilter.Builder setDeviceName(java.lang.String p0) { return null; }
        public android.bluetooth.le.ScanFilter.Builder setManufacturerData(int p0, byte[] p1) { return null; }
        public android.bluetooth.le.ScanFilter.Builder setManufacturerData(int p0, byte[] p1, byte[] p2) { return null; }
        public android.bluetooth.le.ScanFilter.Builder setServiceData(android.os.ParcelUuid p0, byte[] p1) { return null; }
        public android.bluetooth.le.ScanFilter.Builder setServiceData(android.os.ParcelUuid p0, byte[] p1, byte[] p2) { return null; }
        @android.annotation.NonNull
        public android.bluetooth.le.ScanFilter.Builder setServiceSolicitationUuid(android.os.ParcelUuid p0) { return null; }
        @android.annotation.NonNull
        public android.bluetooth.le.ScanFilter.Builder setServiceSolicitationUuid(android.os.ParcelUuid p0, android.os.ParcelUuid p1) { return null; }
        public android.bluetooth.le.ScanFilter.Builder setServiceUuid(android.os.ParcelUuid p0) { return null; }
        public android.bluetooth.le.ScanFilter.Builder setServiceUuid(android.os.ParcelUuid p0, android.os.ParcelUuid p1) { return null; }
        @android.annotation.NonNull
        public android.bluetooth.le.ScanFilter.Builder setDeviceAddress(java.lang.String p0, int p1) { return null; }
        @android.annotation.NonNull
        public android.bluetooth.le.ScanFilter.Builder setDeviceAddress(java.lang.String p0, int p1, byte[] p2) { return null; }
        @android.annotation.NonNull
        public android.bluetooth.le.ScanFilter.Builder setTransportBlockFilter(android.bluetooth.le.TransportBlockFilter p0) { return null; }
    }
}
