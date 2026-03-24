package android.bluetooth.le;

public final class AdvertiseData implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.bluetooth.le.AdvertiseData> CREATOR = null;
    AdvertiseData() {}
    public int describeContents() { return 0; }
    public boolean getIncludeDeviceName() { return false; }
    public boolean getIncludeTxPowerLevel() { return false; }
    public android.util.SparseArray<byte[]> getManufacturerSpecificData() { return null; }
    public java.util.Map<android.os.ParcelUuid, byte[]> getServiceData() { return null; }
    @android.annotation.NonNull
    public java.util.List<android.os.ParcelUuid> getServiceSolicitationUuids() { return null; }
    public java.util.List<android.os.ParcelUuid> getServiceUuids() { return null; }
    @android.annotation.NonNull
    public java.util.List<android.bluetooth.le.TransportDiscoveryData> getTransportDiscoveryData() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        public Builder() {}
        public android.bluetooth.le.AdvertiseData.Builder addManufacturerData(int p0, byte[] p1) { return null; }
        public android.bluetooth.le.AdvertiseData.Builder addServiceData(android.os.ParcelUuid p0, byte[] p1) { return null; }
        @android.annotation.NonNull
        public android.bluetooth.le.AdvertiseData.Builder addServiceSolicitationUuid(android.os.ParcelUuid p0) { return null; }
        public android.bluetooth.le.AdvertiseData.Builder addServiceUuid(android.os.ParcelUuid p0) { return null; }
        @android.annotation.NonNull
        public android.bluetooth.le.AdvertiseData.Builder addTransportDiscoveryData(android.bluetooth.le.TransportDiscoveryData p0) { return null; }
        public android.bluetooth.le.AdvertiseData build() { return null; }
        public android.bluetooth.le.AdvertiseData.Builder setIncludeDeviceName(boolean p0) { return null; }
        public android.bluetooth.le.AdvertiseData.Builder setIncludeTxPowerLevel(boolean p0) { return null; }
    }
}
