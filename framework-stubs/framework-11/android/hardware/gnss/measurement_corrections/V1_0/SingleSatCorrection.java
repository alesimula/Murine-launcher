package android.hardware.gnss.measurement_corrections.V1_0;

public final class SingleSatCorrection {
    public short singleSatCorrectionFlags;
    public byte constellation;
    public short svid;
    public float carrierFrequencyHz;
    public float probSatIsLos;
    public float excessPathLengthMeters;
    public float excessPathLengthUncertaintyMeters;
    public android.hardware.gnss.measurement_corrections.V1_0.ReflectingPlane reflectingPlane;
    public SingleSatCorrection() {}
    public final boolean equals(java.lang.Object p0) { return false; }
    public final int hashCode() { return 0; }
    public final java.lang.String toString() { return null; }
    public final void readFromParcel(android.os.HwParcel p0) {}
    public static final java.util.ArrayList<android.hardware.gnss.measurement_corrections.V1_0.SingleSatCorrection> readVectorFromParcel(android.os.HwParcel p0) { return null; }
    public final void readEmbeddedFromParcel(android.os.HwParcel p0, android.os.HwBlob p1, long p2) {}
    public final void writeToParcel(android.os.HwParcel p0) {}
    public static final void writeVectorToParcel(android.os.HwParcel p0, java.util.ArrayList<android.hardware.gnss.measurement_corrections.V1_0.SingleSatCorrection> p1) {}
    public final void writeEmbeddedToBlob(android.os.HwBlob p0, long p1) {}
}
