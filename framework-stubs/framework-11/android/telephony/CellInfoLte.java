package android.telephony;

public final class CellInfoLte extends android.telephony.CellInfo implements android.os.Parcelable {
    private static final java.lang.String LOG_TAG = "CellInfoLte";
    private static final boolean DBG = false;
    private android.telephony.CellIdentityLte mCellIdentityLte;
    private android.telephony.CellSignalStrengthLte mCellSignalStrengthLte;
    private android.telephony.CellConfigLte mCellConfig;
    public static final android.os.Parcelable.Creator<android.telephony.CellInfoLte> CREATOR = null;
    public CellInfoLte() { super(); }
    public CellInfoLte(android.telephony.CellInfoLte p0) { super(); }
    public CellInfoLte(android.hardware.radio.V1_0.CellInfo p0) { super(); }
    public CellInfoLte(android.hardware.radio.V1_2.CellInfo p0) { super(); }
    public CellInfoLte(android.hardware.radio.V1_4.CellInfo p0, long p1) { super(); }
    public CellInfoLte(android.hardware.radio.V1_5.CellInfo p0, long p1) { super(); }
    public android.telephony.CellIdentityLte getCellIdentity() { return null; }
    public void setCellIdentity(android.telephony.CellIdentityLte p0) {}
    public android.telephony.CellSignalStrengthLte getCellSignalStrength() { return null; }
    public android.telephony.CellInfo sanitizeLocationInfo() { return null; }
    public void setCellSignalStrength(android.telephony.CellSignalStrengthLte p0) {}
    public void setCellConfig(android.telephony.CellConfigLte p0) {}
    public android.telephony.CellConfigLte getCellConfig() { return null; }
    public int hashCode() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    private CellInfoLte(android.os.Parcel p0) { super(); }
    protected static android.telephony.CellInfoLte createFromParcelBody(android.os.Parcel p0) { return null; }
    private static void log(java.lang.String p0) {}
}
