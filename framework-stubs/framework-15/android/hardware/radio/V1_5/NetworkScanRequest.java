package android.hardware.radio.V1_5;

public final class NetworkScanRequest {
    public int type;
    public int interval;
    public java.util.ArrayList<android.hardware.radio.V1_5.RadioAccessSpecifier> specifiers;
    public int maxSearchTime;
    public boolean incrementalResults;
    public int incrementalResultsPeriodicity;
    public java.util.ArrayList<java.lang.String> mccMncs;
    public NetworkScanRequest() {}
    public final boolean equals(java.lang.Object p0) { return false; }
    public final int hashCode() { return 0; }
    public final java.lang.String toString() { return null; }
    public final void readFromParcel(android.os.HwParcel p0) {}
    public static final java.util.ArrayList<android.hardware.radio.V1_5.NetworkScanRequest> readVectorFromParcel(android.os.HwParcel p0) { return null; }
    public final void readEmbeddedFromParcel(android.os.HwParcel p0, android.os.HwBlob p1, long p2) {}
    public final void writeToParcel(android.os.HwParcel p0) {}
    public static final void writeVectorToParcel(android.os.HwParcel p0, java.util.ArrayList<android.hardware.radio.V1_5.NetworkScanRequest> p1) {}
    public final void writeEmbeddedToBlob(android.os.HwBlob p0, long p1) {}
}
