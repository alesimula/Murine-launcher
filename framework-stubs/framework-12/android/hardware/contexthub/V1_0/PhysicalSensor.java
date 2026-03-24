package android.hardware.contexthub.V1_0;

public final class PhysicalSensor {
    public int sensorType;
    public java.lang.String type;
    public java.lang.String name;
    public java.lang.String vendor;
    public int version;
    public int fifoReservedCount;
    public int fifoMaxCount;
    public long minDelayMs;
    public long maxDelayMs;
    public float peakPowerMw;
    public PhysicalSensor() {}
    public final boolean equals(java.lang.Object p0) { return false; }
    public final int hashCode() { return 0; }
    public final java.lang.String toString() { return null; }
    public final void readFromParcel(android.os.HwParcel p0) {}
    public static final java.util.ArrayList<android.hardware.contexthub.V1_0.PhysicalSensor> readVectorFromParcel(android.os.HwParcel p0) { return null; }
    public final void readEmbeddedFromParcel(android.os.HwParcel p0, android.os.HwBlob p1, long p2) {}
    public final void writeToParcel(android.os.HwParcel p0) {}
    public static final void writeVectorToParcel(android.os.HwParcel p0, java.util.ArrayList<android.hardware.contexthub.V1_0.PhysicalSensor> p1) {}
    public final void writeEmbeddedToBlob(android.os.HwBlob p0, long p1) {}
}
