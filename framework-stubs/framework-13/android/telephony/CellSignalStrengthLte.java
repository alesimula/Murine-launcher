package android.telephony;

public final class CellSignalStrengthLte extends android.telephony.CellSignalStrength implements android.os.Parcelable {
    public static final int USE_RSRP = 1;
    public static final int USE_RSRQ = 2;
    public static final int USE_RSSNR = 4;
    public static final android.os.Parcelable.Creator<android.telephony.CellSignalStrengthLte> CREATOR = null;
    public CellSignalStrengthLte() { super(); }
    public CellSignalStrengthLte(int p0, int p1, int p2, int p3, int p4, int p5, int p6) { super(); }
    public CellSignalStrengthLte(int p0, int p1, int p2, int p3, int p4, int p5) { super(); }
    public CellSignalStrengthLte(android.telephony.CellSignalStrengthLte p0) { super(); }
    protected void copyFrom(android.telephony.CellSignalStrengthLte p0) {}
    public android.telephony.CellSignalStrengthLte copy() { return null; }
    public void setDefaultValues() {}
    public int getLevel() { return 0; }
    public void updateLevel(android.os.PersistableBundle p0, android.telephony.ServiceState p1) {}
    public int getRsrq() { return 0; }
    public int getRssi() { return 0; }
    public int getRssnr() { return 0; }
    public int getRsrp() { return 0; }
    public int getCqiTableIndex() { return 0; }
    public int getCqi() { return 0; }
    public int getDbm() { return 0; }
    public int getAsuLevel() { return 0; }
    public int getTimingAdvance() { return 0; }
    public int hashCode() { return 0; }
    public boolean isValid() { return false; }
    public boolean equals(java.lang.Object p0) { return false; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    public static int convertRssnrUnitFromTenDbToDB(int p0) { return 0; }
    public static int convertRssiAsuToDBm(int p0) { return 0; }
}
