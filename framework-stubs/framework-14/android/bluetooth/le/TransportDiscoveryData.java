package android.bluetooth.le;

public final class TransportDiscoveryData implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.bluetooth.le.TransportDiscoveryData> CREATOR = null;
    public TransportDiscoveryData(int p0, java.util.List<android.bluetooth.le.TransportBlock> p1) {}
    public TransportDiscoveryData(byte[] p0) {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int getTransportDataType() { return 0; }
    @android.annotation.NonNull
    public java.util.List<android.bluetooth.le.TransportBlock> getTransportBlocks() { return null; }
    @android.annotation.Nullable
    public byte[] toByteArray() { return null; }
    public java.lang.String toString() { return null; }
    public int totalBytes() { return 0; }
}
