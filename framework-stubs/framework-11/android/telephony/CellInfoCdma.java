package android.telephony;

public final class CellInfoCdma extends android.telephony.CellInfo implements android.os.Parcelable {
    private static final java.lang.String LOG_TAG = "CellInfoCdma";
    private static final boolean DBG = false;
    private android.telephony.CellIdentityCdma mCellIdentityCdma;
    private android.telephony.CellSignalStrengthCdma mCellSignalStrengthCdma;
    public static final android.os.Parcelable.Creator<android.telephony.CellInfoCdma> CREATOR = null;
    public CellInfoCdma() { super(); }
    public CellInfoCdma(android.telephony.CellInfoCdma p0) { super(); }
    public CellInfoCdma(android.hardware.radio.V1_0.CellInfo p0) { super(); }
    public CellInfoCdma(android.hardware.radio.V1_2.CellInfo p0) { super(); }
    public CellInfoCdma(android.hardware.radio.V1_4.CellInfo p0, long p1) { super(); }
    public CellInfoCdma(android.hardware.radio.V1_5.CellInfo p0, long p1) { super(); }
    public android.telephony.CellIdentityCdma getCellIdentity() { return null; }
    public void setCellIdentity(android.telephony.CellIdentityCdma p0) {}
    public android.telephony.CellSignalStrengthCdma getCellSignalStrength() { return null; }
    public android.telephony.CellInfo sanitizeLocationInfo() { return null; }
    public void setCellSignalStrength(android.telephony.CellSignalStrengthCdma p0) {}
    public int hashCode() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    private CellInfoCdma(android.os.Parcel p0) { super(); }
    protected static android.telephony.CellInfoCdma createFromParcelBody(android.os.Parcel p0) { return null; }
    private static void log(java.lang.String p0) {}
}
