package android.telephony;

public final class CellSignalStrengthCdma extends android.telephony.CellSignalStrength implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.telephony.CellSignalStrengthCdma> CREATOR = null;
    public CellSignalStrengthCdma() { super(); }
    public CellSignalStrengthCdma(int p0, int p1, int p2, int p3, int p4) { super(); }
    public CellSignalStrengthCdma(android.telephony.CellSignalStrengthCdma p0) { super(); }
    protected void copyFrom(android.telephony.CellSignalStrengthCdma p0) {}
    public android.telephony.CellSignalStrengthCdma copy() { return null; }
    public void setDefaultValues() {}
    public int getLevel() { return 0; }
    public void updateLevel(android.os.PersistableBundle p0, android.telephony.ServiceState p1) {}
    public int getAsuLevel() { return 0; }
    public int getCdmaLevel() { return 0; }
    public int getEvdoLevel() { return 0; }
    public int getEvdoAsuLevel() { return 0; }
    public int getDbm() { return 0; }
    public int getCdmaDbm() { return 0; }
    public void setCdmaDbm(int p0) {}
    public int getCdmaEcio() { return 0; }
    public void setCdmaEcio(int p0) {}
    public int getEvdoDbm() { return 0; }
    public void setEvdoDbm(int p0) {}
    public int getEvdoEcio() { return 0; }
    public void setEvdoEcio(int p0) {}
    public int getEvdoSnr() { return 0; }
    public void setEvdoSnr(int p0) {}
    public int hashCode() { return 0; }
    public boolean isValid() { return false; }
    public boolean equals(java.lang.Object p0) { return false; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
}
