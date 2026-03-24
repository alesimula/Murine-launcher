package android.hardware.tv.tuner;

public final class DemuxIpAddressIpAddress implements android.os.Parcelable {
    public static final int v4 = 0;
    public static final int v6 = 1;
    public static final android.os.Parcelable.Creator<android.hardware.tv.tuner.DemuxIpAddressIpAddress> CREATOR = null;
    public DemuxIpAddressIpAddress() {}
    public int getTag() { return 0; }
    public static android.hardware.tv.tuner.DemuxIpAddressIpAddress v4(byte[] p0) { return null; }
    public byte[] getV4() { return null; }
    public void setV4(byte[] p0) {}
    public static android.hardware.tv.tuner.DemuxIpAddressIpAddress v6(byte[] p0) { return null; }
    public byte[] getV6() { return null; }
    public void setV6(byte[] p0) {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }

    public static @interface Tag {
        public static final int v4 = 0;
        public static final int v6 = 1;
    }
}
