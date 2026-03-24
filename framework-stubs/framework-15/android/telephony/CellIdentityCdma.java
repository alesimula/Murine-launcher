package android.telephony;

public final class CellIdentityCdma extends android.telephony.CellIdentity {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.telephony.CellIdentityCdma> CREATOR = null;
    public CellIdentityCdma() { super((java.lang.String)null, 0, (android.os.Parcel)null); }
    public CellIdentityCdma(int p0, int p1, int p2, int p3, int p4, java.lang.String p5, java.lang.String p6) { super((java.lang.String)null, 0, (android.os.Parcel)null); }
    @android.annotation.NonNull
    android.telephony.CellIdentityCdma copy() { return null; }
    @android.annotation.NonNull
    public android.telephony.CellIdentityCdma sanitizeLocationInfo() { return null; }
    protected void updateGlobalCellId() {}
    public int getNetworkId() { return 0; }
    public int getSystemId() { return 0; }
    public int getBasestationId() { return 0; }
    public int getLongitude() { return 0; }
    public int getLatitude() { return 0; }
    public int hashCode() { return 0; }
    @android.annotation.NonNull
    public android.telephony.cdma.CdmaCellLocation asCellLocation() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    protected static android.telephony.CellIdentityCdma createFromParcelBody(android.os.Parcel p0) { return null; }
}
