package android.hardware.contexthub.V1_0;

public final class ContextHub {
    public java.lang.String name;
    public java.lang.String vendor;
    public java.lang.String toolchain;
    public int platformVersion;
    public int toolchainVersion;
    public int hubId;
    public float peakMips;
    public float stoppedPowerDrawMw;
    public float sleepPowerDrawMw;
    public float peakPowerDrawMw;
    public java.util.ArrayList<android.hardware.contexthub.V1_0.PhysicalSensor> connectedSensors;
    public int maxSupportedMsgLen;
    public long chrePlatformId;
    public byte chreApiMajorVersion;
    public byte chreApiMinorVersion;
    public short chrePatchVersion;
    public ContextHub() {}
    public final boolean equals(java.lang.Object p0) { return false; }
    public final int hashCode() { return 0; }
    public final java.lang.String toString() { return null; }
    public final void readFromParcel(android.os.HwParcel p0) {}
    public static final java.util.ArrayList<android.hardware.contexthub.V1_0.ContextHub> readVectorFromParcel(android.os.HwParcel p0) { return null; }
    public final void readEmbeddedFromParcel(android.os.HwParcel p0, android.os.HwBlob p1, long p2) {}
    public final void writeToParcel(android.os.HwParcel p0) {}
    public static final void writeVectorToParcel(android.os.HwParcel p0, java.util.ArrayList<android.hardware.contexthub.V1_0.ContextHub> p1) {}
    public final void writeEmbeddedToBlob(android.os.HwBlob p0, long p1) {}
}
