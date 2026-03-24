package android.bluetooth.le;

public final class AdvertiseData implements android.os.Parcelable {
    private final java.util.List<android.os.ParcelUuid> mServiceUuids = null;
    private final android.util.SparseArray<byte[]> mManufacturerSpecificData = null;
    private final java.util.Map<android.os.ParcelUuid, byte[]> mServiceData = null;
    private final boolean mIncludeTxPowerLevel = false;
    private final boolean mIncludeDeviceName = false;
    public static final android.os.Parcelable.Creator<android.bluetooth.le.AdvertiseData> CREATOR = null;
    private AdvertiseData(java.util.List<android.os.ParcelUuid> p0, android.util.SparseArray<byte[]> p1, java.util.Map<android.os.ParcelUuid, byte[]> p2, boolean p3, boolean p4) {}
    public java.util.List<android.os.ParcelUuid> getServiceUuids() { return null; }
    public android.util.SparseArray<byte[]> getManufacturerSpecificData() { return null; }
    public java.util.Map<android.os.ParcelUuid, byte[]> getServiceData() { return null; }
    public boolean getIncludeTxPowerLevel() { return false; }
    public boolean getIncludeDeviceName() { return false; }
    public int hashCode() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        private java.util.List<android.os.ParcelUuid> mServiceUuids;
        private android.util.SparseArray<byte[]> mManufacturerSpecificData;
        private java.util.Map<android.os.ParcelUuid, byte[]> mServiceData;
        private boolean mIncludeTxPowerLevel;
        private boolean mIncludeDeviceName;
        public Builder() {}
        public android.bluetooth.le.AdvertiseData.Builder addServiceUuid(android.os.ParcelUuid p0) { return null; }
        public android.bluetooth.le.AdvertiseData.Builder addServiceData(android.os.ParcelUuid p0, byte[] p1) { return null; }
        public android.bluetooth.le.AdvertiseData.Builder addManufacturerData(int p0, byte[] p1) { return null; }
        public android.bluetooth.le.AdvertiseData.Builder setIncludeTxPowerLevel(boolean p0) { return null; }
        public android.bluetooth.le.AdvertiseData.Builder setIncludeDeviceName(boolean p0) { return null; }
        public android.bluetooth.le.AdvertiseData build() { return null; }
    }
}
