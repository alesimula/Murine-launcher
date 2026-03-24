package android.hardware.radio.V1_5;

public final class SignalThresholdInfo {
    public int signalMeasurement;
    public int hysteresisMs;
    public int hysteresisDb;
    public java.util.ArrayList<java.lang.Integer> thresholds;
    public boolean isEnabled;
    public SignalThresholdInfo() {}
    public final boolean equals(java.lang.Object p0) { return false; }
    public final int hashCode() { return 0; }
    public final java.lang.String toString() { return null; }
    public final void readFromParcel(android.os.HwParcel p0) {}
    public static final java.util.ArrayList<android.hardware.radio.V1_5.SignalThresholdInfo> readVectorFromParcel(android.os.HwParcel p0) { return null; }
    public final void readEmbeddedFromParcel(android.os.HwParcel p0, android.os.HwBlob p1, long p2) {}
    public final void writeToParcel(android.os.HwParcel p0) {}
    public static final void writeVectorToParcel(android.os.HwParcel p0, java.util.ArrayList<android.hardware.radio.V1_5.SignalThresholdInfo> p1) {}
    public final void writeEmbeddedToBlob(android.os.HwBlob p0, long p1) {}
}
