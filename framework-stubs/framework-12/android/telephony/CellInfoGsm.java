package android.telephony;

public final class CellInfoGsm extends android.telephony.CellInfo implements android.os.Parcelable {
    private static final java.lang.String LOG_TAG = "CellInfoGsm";
    private static final boolean DBG = false;
    private android.telephony.CellIdentityGsm mCellIdentityGsm;
    private android.telephony.CellSignalStrengthGsm mCellSignalStrengthGsm;
    public static final android.os.Parcelable.Creator<android.telephony.CellInfoGsm> CREATOR = null;
    public CellInfoGsm() { super(); }
    public CellInfoGsm(android.telephony.CellInfoGsm p0) { super(); }
    public CellInfoGsm(android.hardware.radio.V1_0.CellInfo p0) { super(); }
    public CellInfoGsm(android.hardware.radio.V1_2.CellInfo p0) { super(); }
    public CellInfoGsm(android.hardware.radio.V1_4.CellInfo p0, long p1) { super(); }
    public CellInfoGsm(android.hardware.radio.V1_5.CellInfo p0, long p1) { super(); }
    public CellInfoGsm(android.hardware.radio.V1_6.CellInfo p0, long p1) { super(); }
    public android.telephony.CellIdentityGsm getCellIdentity() { return null; }
    public void setCellIdentity(android.telephony.CellIdentityGsm p0) {}
    public android.telephony.CellSignalStrengthGsm getCellSignalStrength() { return null; }
    public android.telephony.CellInfo sanitizeLocationInfo() { return null; }
    public void setCellSignalStrength(android.telephony.CellSignalStrengthGsm p0) {}
    public int hashCode() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    private CellInfoGsm(android.os.Parcel p0) { super(); }
    protected static android.telephony.CellInfoGsm createFromParcelBody(android.os.Parcel p0) { return null; }
    private static void log(java.lang.String p0) {}
}
