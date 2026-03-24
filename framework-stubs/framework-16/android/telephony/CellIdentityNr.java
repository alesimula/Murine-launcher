package android.telephony;

public final class CellIdentityNr extends android.telephony.CellIdentity {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.telephony.CellIdentityNr> CREATOR = null;
    public CellIdentityNr() { super((java.lang.String)null, 0, (android.os.Parcel)null); }
    public CellIdentityNr(int p0, int p1, int p2, int[] p3, java.lang.String p4, java.lang.String p5, long p6, java.lang.String p7, java.lang.String p8, java.util.Collection<java.lang.String> p9) { super((java.lang.String)null, 0, (android.os.Parcel)null); }
    @android.annotation.NonNull
    public android.telephony.CellIdentityNr sanitizeLocationInfo() { return null; }
    protected void updateGlobalCellId() {}
    @android.annotation.NonNull
    public android.telephony.CellLocation asCellLocation() { return null; }
    public int hashCode() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public long getNci() { return 0L; }
    public int getNrarfcn() { return 0; }
    @android.annotation.NonNull
    public int[] getBands() { return null; }
    public int getPci() { return 0; }
    public int getTac() { return 0; }
    @android.annotation.Nullable
    public java.lang.String getMccString() { return null; }
    @android.annotation.Nullable
    public java.lang.String getMncString() { return null; }
    public int getChannelNumber() { return 0; }
    @android.annotation.NonNull
    public java.util.Set<java.lang.String> getAdditionalPlmns() { return null; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    protected static android.telephony.CellIdentityNr createFromParcelBody(android.os.Parcel p0) { return null; }
}
