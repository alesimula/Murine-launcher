package android.bluetooth.le;

public final class ScanFilter implements android.os.Parcelable {
    private final java.lang.String mDeviceName = null;
    private final java.lang.String mDeviceAddress = null;
    private final int mAddressType = 0;
    private final byte[] mIrk = null;
    private final android.os.ParcelUuid mServiceUuid = null;
    private final android.os.ParcelUuid mServiceUuidMask = null;
    private final android.os.ParcelUuid mServiceSolicitationUuid = null;
    private final android.os.ParcelUuid mServiceSolicitationUuidMask = null;
    private final android.os.ParcelUuid mServiceDataUuid = null;
    private final byte[] mServiceData = null;
    private final byte[] mServiceDataMask = null;
    private final int mManufacturerId = 0;
    private final byte[] mManufacturerData = null;
    private final byte[] mManufacturerDataMask = null;
    public static final android.bluetooth.le.ScanFilter EMPTY = null;
    public static final android.os.Parcelable.Creator<android.bluetooth.le.ScanFilter> CREATOR = null;
    private ScanFilter(java.lang.String p0, java.lang.String p1, android.os.ParcelUuid p2, android.os.ParcelUuid p3, android.os.ParcelUuid p4, android.os.ParcelUuid p5, android.os.ParcelUuid p6, byte[] p7, byte[] p8, int p9, byte[] p10, byte[] p11, int p12, byte[] p13) {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public java.lang.String getDeviceName() { return null; }
    public android.os.ParcelUuid getServiceUuid() { return null; }
    public android.os.ParcelUuid getServiceUuidMask() { return null; }
    public android.os.ParcelUuid getServiceSolicitationUuid() { return null; }
    public android.os.ParcelUuid getServiceSolicitationUuidMask() { return null; }
    public java.lang.String getDeviceAddress() { return null; }
    @android.annotation.SystemApi
    public int getAddressType() { return 0; }
    @android.annotation.SystemApi
    public byte[] getIrk() { return null; }
    public byte[] getServiceData() { return null; }
    public byte[] getServiceDataMask() { return null; }
    public android.os.ParcelUuid getServiceDataUuid() { return null; }
    public int getManufacturerId() { return 0; }
    public byte[] getManufacturerData() { return null; }
    public byte[] getManufacturerDataMask() { return null; }
    public boolean matches(android.bluetooth.le.ScanResult p0) { return false; }
    public static boolean matchesServiceUuids(android.os.ParcelUuid p0, android.os.ParcelUuid p1, java.util.List<android.os.ParcelUuid> p2) { return false; }
    private static boolean matchesServiceUuid(java.util.UUID p0, java.util.UUID p1, java.util.UUID p2) { return false; }
    private static boolean matchesServiceSolicitationUuids(android.os.ParcelUuid p0, android.os.ParcelUuid p1, java.util.List<android.os.ParcelUuid> p2) { return false; }
    private static boolean matchesServiceSolicitationUuid(java.util.UUID p0, java.util.UUID p1, java.util.UUID p2) { return false; }
    private boolean matchesPartialData(byte[] p0, byte[] p1, byte[] p2) { return false; }
    public java.lang.String toString() { return null; }
    public int hashCode() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public boolean isAllFieldsEmpty() { return false; }

    public static final class Builder {
        @android.annotation.SystemApi
        public static final int LEN_IRK_OCTETS = 16;
        private java.lang.String mDeviceName;
        private java.lang.String mDeviceAddress;
        private int mAddressType;
        private byte[] mIrk;
        private android.os.ParcelUuid mServiceUuid;
        private android.os.ParcelUuid mUuidMask;
        private android.os.ParcelUuid mServiceSolicitationUuid;
        private android.os.ParcelUuid mServiceSolicitationUuidMask;
        private android.os.ParcelUuid mServiceDataUuid;
        private byte[] mServiceData;
        private byte[] mServiceDataMask;
        private int mManufacturerId;
        private byte[] mManufacturerData;
        private byte[] mManufacturerDataMask;
        public Builder() {}
        public android.bluetooth.le.ScanFilter.Builder setDeviceName(java.lang.String p0) { return null; }
        public android.bluetooth.le.ScanFilter.Builder setDeviceAddress(java.lang.String p0) { return null; }
        @android.annotation.SystemApi
        public android.bluetooth.le.ScanFilter.Builder setDeviceAddress(java.lang.String p0, int p1) { return null; }
        @android.annotation.SystemApi
        public android.bluetooth.le.ScanFilter.Builder setDeviceAddress(java.lang.String p0, int p1, byte[] p2) { return null; }
        private android.bluetooth.le.ScanFilter.Builder setDeviceAddressInternal(java.lang.String p0, int p1, byte[] p2) { return null; }
        public android.bluetooth.le.ScanFilter.Builder setServiceUuid(android.os.ParcelUuid p0) { return null; }
        public android.bluetooth.le.ScanFilter.Builder setServiceUuid(android.os.ParcelUuid p0, android.os.ParcelUuid p1) { return null; }
        public android.bluetooth.le.ScanFilter.Builder setServiceSolicitationUuid(android.os.ParcelUuid p0) { return null; }
        public android.bluetooth.le.ScanFilter.Builder setServiceSolicitationUuid(android.os.ParcelUuid p0, android.os.ParcelUuid p1) { return null; }
        public android.bluetooth.le.ScanFilter.Builder setServiceData(android.os.ParcelUuid p0, byte[] p1) { return null; }
        public android.bluetooth.le.ScanFilter.Builder setServiceData(android.os.ParcelUuid p0, byte[] p1, byte[] p2) { return null; }
        public android.bluetooth.le.ScanFilter.Builder setManufacturerData(int p0, byte[] p1) { return null; }
        public android.bluetooth.le.ScanFilter.Builder setManufacturerData(int p0, byte[] p1, byte[] p2) { return null; }
        public android.bluetooth.le.ScanFilter build() { return null; }
    }
}
