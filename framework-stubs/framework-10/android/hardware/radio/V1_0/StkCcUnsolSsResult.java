package android.hardware.radio.V1_0;

public final class StkCcUnsolSsResult {
    public int serviceType;
    public int requestType;
    public int teleserviceType;
    public int serviceClass;
    public int result;
    public java.util.ArrayList<android.hardware.radio.V1_0.SsInfoData> ssInfo;
    public java.util.ArrayList<android.hardware.radio.V1_0.CfData> cfData;
    public StkCcUnsolSsResult() {}
    public final boolean equals(java.lang.Object p0) { return false; }
    public final int hashCode() { return 0; }
    public final java.lang.String toString() { return null; }
    public final void readFromParcel(android.os.HwParcel p0) {}
    public static final java.util.ArrayList<android.hardware.radio.V1_0.StkCcUnsolSsResult> readVectorFromParcel(android.os.HwParcel p0) { return null; }
    public final void readEmbeddedFromParcel(android.os.HwParcel p0, android.os.HwBlob p1, long p2) {}
    public final void writeToParcel(android.os.HwParcel p0) {}
    public static final void writeVectorToParcel(android.os.HwParcel p0, java.util.ArrayList<android.hardware.radio.V1_0.StkCcUnsolSsResult> p1) {}
    public final void writeEmbeddedToBlob(android.os.HwBlob p0, long p1) {}
}
