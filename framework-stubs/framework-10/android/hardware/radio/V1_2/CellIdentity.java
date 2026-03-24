package android.hardware.radio.V1_2;

public final class CellIdentity {
    public int cellInfoType;
    public java.util.ArrayList<android.hardware.radio.V1_2.CellIdentityGsm> cellIdentityGsm;
    public java.util.ArrayList<android.hardware.radio.V1_2.CellIdentityWcdma> cellIdentityWcdma;
    public java.util.ArrayList<android.hardware.radio.V1_2.CellIdentityCdma> cellIdentityCdma;
    public java.util.ArrayList<android.hardware.radio.V1_2.CellIdentityLte> cellIdentityLte;
    public java.util.ArrayList<android.hardware.radio.V1_2.CellIdentityTdscdma> cellIdentityTdscdma;
    public CellIdentity() {}
    public final boolean equals(java.lang.Object p0) { return false; }
    public final int hashCode() { return 0; }
    public final java.lang.String toString() { return null; }
    public final void readFromParcel(android.os.HwParcel p0) {}
    public static final java.util.ArrayList<android.hardware.radio.V1_2.CellIdentity> readVectorFromParcel(android.os.HwParcel p0) { return null; }
    public final void readEmbeddedFromParcel(android.os.HwParcel p0, android.os.HwBlob p1, long p2) {}
    public final void writeToParcel(android.os.HwParcel p0) {}
    public static final void writeVectorToParcel(android.os.HwParcel p0, java.util.ArrayList<android.hardware.radio.V1_2.CellIdentity> p1) {}
    public final void writeEmbeddedToBlob(android.os.HwBlob p0, long p1) {}
}
