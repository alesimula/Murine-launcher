package android.telephony;

public final class CellIdentityNr extends android.telephony.CellIdentity {
    private static final java.lang.String TAG = "CellIdentityNr";
    private static final int MAX_PCI = 1007;
    private static final int MAX_TAC = 16777215;
    private static final int MAX_NRARFCN = 3279165;
    private static final long MAX_NCI = 68719476735L;
    private final int mNrArfcn = 0;
    private final int mPci = 0;
    private final int mTac = 0;
    private final long mNci = 0L;
    private final int[] mBands = null;
    private final android.util.ArraySet<java.lang.String> mAdditionalPlmns = null;
    public static final android.os.Parcelable.Creator<android.telephony.CellIdentityNr> CREATOR = null;
    public CellIdentityNr() { super((java.lang.String)null, 0, (android.os.Parcel)null); }
    public CellIdentityNr(int p0, int p1, int p2, int[] p3, java.lang.String p4, java.lang.String p5, long p6, java.lang.String p7, java.lang.String p8, java.util.Collection<java.lang.String> p9) { super((java.lang.String)null, 0, (android.os.Parcel)null); }
    public CellIdentityNr(android.hardware.radio.V1_4.CellIdentityNr p0) { super((java.lang.String)null, 0, (android.os.Parcel)null); }
    public CellIdentityNr(android.hardware.radio.V1_5.CellIdentityNr p0) { super((java.lang.String)null, 0, (android.os.Parcel)null); }
    public android.telephony.CellIdentityNr sanitizeLocationInfo() { return null; }
    protected void updateGlobalCellId() {}
    public android.telephony.CellLocation asCellLocation() { return null; }
    public int hashCode() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public long getNci() { return 0L; }
    public int getNrarfcn() { return 0; }
    public int[] getBands() { return null; }
    public int getPci() { return 0; }
    public int getTac() { return 0; }
    public java.lang.String getMccString() { return null; }
    public java.lang.String getMncString() { return null; }
    public int getChannelNumber() { return 0; }
    public java.util.Set<java.lang.String> getAdditionalPlmns() { return null; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    private CellIdentityNr(android.os.Parcel p0) { super((java.lang.String)null, 0, (android.os.Parcel)null); }
    protected static android.telephony.CellIdentityNr createFromParcelBody(android.os.Parcel p0) { return null; }
}
