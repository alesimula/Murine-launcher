package android.hardware.radio.config.V1_1;

public final class PhoneCapability {
    public byte maxActiveData;
    public byte maxActiveInternetData;
    public boolean isInternetLingeringSupported;
    public java.util.ArrayList<android.hardware.radio.config.V1_1.ModemInfo> logicalModemList;
    public PhoneCapability() {}
    public final boolean equals(java.lang.Object p0) { return false; }
    public final int hashCode() { return 0; }
    public final java.lang.String toString() { return null; }
    public final void readFromParcel(android.os.HwParcel p0) {}
    public static final java.util.ArrayList<android.hardware.radio.config.V1_1.PhoneCapability> readVectorFromParcel(android.os.HwParcel p0) { return null; }
    public final void readEmbeddedFromParcel(android.os.HwParcel p0, android.os.HwBlob p1, long p2) {}
    public final void writeToParcel(android.os.HwParcel p0) {}
    public static final void writeVectorToParcel(android.os.HwParcel p0, java.util.ArrayList<android.hardware.radio.config.V1_1.PhoneCapability> p1) {}
    public final void writeEmbeddedToBlob(android.os.HwBlob p0, long p1) {}
}
