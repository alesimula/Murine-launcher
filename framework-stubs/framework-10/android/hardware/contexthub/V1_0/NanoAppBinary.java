package android.hardware.contexthub.V1_0;

public final class NanoAppBinary {
    public long appId;
    public int appVersion;
    public int flags;
    public byte targetChreApiMajorVersion;
    public byte targetChreApiMinorVersion;
    public java.util.ArrayList<java.lang.Byte> customBinary;
    public NanoAppBinary() {}
    public final boolean equals(java.lang.Object p0) { return false; }
    public final int hashCode() { return 0; }
    public final java.lang.String toString() { return null; }
    public final void readFromParcel(android.os.HwParcel p0) {}
    public static final java.util.ArrayList<android.hardware.contexthub.V1_0.NanoAppBinary> readVectorFromParcel(android.os.HwParcel p0) { return null; }
    public final void readEmbeddedFromParcel(android.os.HwParcel p0, android.os.HwBlob p1, long p2) {}
    public final void writeToParcel(android.os.HwParcel p0) {}
    public static final void writeVectorToParcel(android.os.HwParcel p0, java.util.ArrayList<android.hardware.contexthub.V1_0.NanoAppBinary> p1) {}
    public final void writeEmbeddedToBlob(android.os.HwBlob p0, long p1) {}
}
