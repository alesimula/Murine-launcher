package android.hardware.radio.V1_0;

public final class CellIdentity {
    public int cellInfoType;
    public java.util.ArrayList<android.hardware.radio.V1_0.CellIdentityGsm> cellIdentityGsm;
    public java.util.ArrayList<android.hardware.radio.V1_0.CellIdentityWcdma> cellIdentityWcdma;
    public java.util.ArrayList<android.hardware.radio.V1_0.CellIdentityCdma> cellIdentityCdma;
    public java.util.ArrayList<android.hardware.radio.V1_0.CellIdentityLte> cellIdentityLte;
    public java.util.ArrayList<android.hardware.radio.V1_0.CellIdentityTdscdma> cellIdentityTdscdma;
    public CellIdentity() {}
    public final boolean equals(java.lang.Object p0) { return false; }
    public final int hashCode() { return 0; }
    public final java.lang.String toString() { return null; }
    public final void readFromParcel(android.os.HwParcel p0) {}
    public static final java.util.ArrayList<android.hardware.radio.V1_0.CellIdentity> readVectorFromParcel(android.os.HwParcel p0) { return null; }
    public final void readEmbeddedFromParcel(android.os.HwParcel p0, android.os.HwBlob p1, long p2) {}
    public final void writeToParcel(android.os.HwParcel p0) {}
    public static final void writeVectorToParcel(android.os.HwParcel p0, java.util.ArrayList<android.hardware.radio.V1_0.CellIdentity> p1) {}
    public final void writeEmbeddedToBlob(android.os.HwBlob p0, long p1) {}
}
