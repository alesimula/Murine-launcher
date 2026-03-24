package android.telephony;

public final class CellInfoGsm extends android.telephony.CellInfo implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.telephony.CellInfoGsm> CREATOR = null;
    public CellInfoGsm() { super(); }
    public CellInfoGsm(android.telephony.CellInfoGsm p0) { super(); }
    public CellInfoGsm(int p0, boolean p1, long p2, android.telephony.CellIdentityGsm p3, android.telephony.CellSignalStrengthGsm p4) { super(); }
    @android.annotation.NonNull
    public android.telephony.CellIdentityGsm getCellIdentity() { return null; }
    public void setCellIdentity(android.telephony.CellIdentityGsm p0) {}
    @android.annotation.NonNull
    public android.telephony.CellSignalStrengthGsm getCellSignalStrength() { return null; }
    public android.telephony.CellInfo sanitizeLocationInfo() { return null; }
    public void setCellSignalStrength(android.telephony.CellSignalStrengthGsm p0) {}
    public int hashCode() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    protected static android.telephony.CellInfoGsm createFromParcelBody(android.os.Parcel p0) { return null; }
}
