package android.telephony;

@java.lang.Deprecated
@android.annotation.FlaggedApi("com.android.internal.telephony.flags.deprecate_cdma")
public final class CellInfoCdma extends android.telephony.CellInfo implements android.os.Parcelable {
    @java.lang.Deprecated
    @android.annotation.FlaggedApi("com.android.internal.telephony.flags.deprecate_cdma")
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.telephony.CellInfoCdma> CREATOR = null;
    public CellInfoCdma() { super(); }
    public CellInfoCdma(android.telephony.CellInfoCdma p0) { super(); }
    public CellInfoCdma(int p0, boolean p1, long p2, android.telephony.CellIdentityCdma p3, android.telephony.CellSignalStrengthCdma p4) { super(); }
    @java.lang.Deprecated
    @android.annotation.FlaggedApi("com.android.internal.telephony.flags.deprecate_cdma")
    @android.annotation.NonNull
    public android.telephony.CellIdentityCdma getCellIdentity() { return null; }
    public void setCellIdentity(android.telephony.CellIdentityCdma p0) {}
    @java.lang.Deprecated
    @android.annotation.FlaggedApi("com.android.internal.telephony.flags.deprecate_cdma")
    @android.annotation.NonNull
    public android.telephony.CellSignalStrengthCdma getCellSignalStrength() { return null; }
    public android.telephony.CellInfo sanitizeLocationInfo() { return null; }
    public void setCellSignalStrength(android.telephony.CellSignalStrengthCdma p0) {}
    public int hashCode() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
    @java.lang.Deprecated
    @android.annotation.FlaggedApi("com.android.internal.telephony.flags.deprecate_cdma")
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    protected static android.telephony.CellInfoCdma createFromParcelBody(android.os.Parcel p0) { return null; }
}
