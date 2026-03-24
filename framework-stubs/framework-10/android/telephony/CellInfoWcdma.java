package android.telephony;

public final class CellInfoWcdma extends android.telephony.CellInfo implements android.os.Parcelable {
    private static final java.lang.String LOG_TAG = "CellInfoWcdma";
    private static final boolean DBG = false;
    private android.telephony.CellIdentityWcdma mCellIdentityWcdma;
    private android.telephony.CellSignalStrengthWcdma mCellSignalStrengthWcdma;
    public static final android.os.Parcelable.Creator<android.telephony.CellInfoWcdma> CREATOR = null;
    public CellInfoWcdma() { super(); }
    public CellInfoWcdma(android.telephony.CellInfoWcdma p0) { super(); }
    public CellInfoWcdma(android.hardware.radio.V1_0.CellInfo p0) { super(); }
    public CellInfoWcdma(android.hardware.radio.V1_2.CellInfo p0) { super(); }
    public CellInfoWcdma(android.hardware.radio.V1_4.CellInfo p0, long p1) { super(); }
    public android.telephony.CellIdentityWcdma getCellIdentity() { return null; }
    public void setCellIdentity(android.telephony.CellIdentityWcdma p0) {}
    public android.telephony.CellSignalStrengthWcdma getCellSignalStrength() { return null; }
    public android.telephony.CellInfo sanitizeLocationInfo() { return null; }
    public void setCellSignalStrength(android.telephony.CellSignalStrengthWcdma p0) {}
    public int hashCode() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    private CellInfoWcdma(android.os.Parcel p0) { super(); }
    protected static android.telephony.CellInfoWcdma createFromParcelBody(android.os.Parcel p0) { return null; }
    private static void log(java.lang.String p0) {}
}
