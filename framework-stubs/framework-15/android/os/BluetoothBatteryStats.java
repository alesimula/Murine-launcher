package android.os;

public class BluetoothBatteryStats implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.os.BluetoothBatteryStats> CREATOR = null;
    public BluetoothBatteryStats(java.util.List<android.os.BluetoothBatteryStats.UidStats> p0) {}
    @android.annotation.NonNull
    public java.util.List<android.os.BluetoothBatteryStats.UidStats> getUidStats() { return null; }
    protected BluetoothBatteryStats(android.os.Parcel p0) {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }

    public static class UidStats {
        public final int uid = 0;
        public final long scanTimeMs = 0L;
        public final long unoptimizedScanTimeMs = 0L;
        public final int scanResultCount = 0;
        public final long rxTimeMs = 0L;
        public final long txTimeMs = 0L;
        public UidStats(int p0, long p1, long p2, int p3, long p4, long p5) {}
        public java.lang.String toString() { return null; }
    }
}
