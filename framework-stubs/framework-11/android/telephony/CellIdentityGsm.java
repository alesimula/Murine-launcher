package android.telephony;

public final class CellIdentityGsm extends android.telephony.CellIdentity {
    private static final java.lang.String TAG = null;
    private static final boolean DBG = false;
    private static final int MAX_LAC = 65535;
    private static final int MAX_CID = 65535;
    private static final int MAX_ARFCN = 65535;
    private static final int MAX_BSIC = 63;
    private final int mLac = 0;
    private final int mCid = 0;
    private final int mArfcn = 0;
    private final int mBsic = 0;
    private final android.util.ArraySet<java.lang.String> mAdditionalPlmns = null;
    public static final android.os.Parcelable.Creator<android.telephony.CellIdentityGsm> CREATOR = null;
    public CellIdentityGsm() { super((java.lang.String)null, 0, (android.os.Parcel)null); }
    public CellIdentityGsm(int p0, int p1, int p2, int p3, java.lang.String p4, java.lang.String p5, java.lang.String p6, java.lang.String p7, java.util.Collection<java.lang.String> p8) { super((java.lang.String)null, 0, (android.os.Parcel)null); }
    public CellIdentityGsm(android.hardware.radio.V1_0.CellIdentityGsm p0) { super((java.lang.String)null, 0, (android.os.Parcel)null); }
    public CellIdentityGsm(android.hardware.radio.V1_2.CellIdentityGsm p0) { super((java.lang.String)null, 0, (android.os.Parcel)null); }
    public CellIdentityGsm(android.hardware.radio.V1_5.CellIdentityGsm p0) { super((java.lang.String)null, 0, (android.os.Parcel)null); }
    private CellIdentityGsm(android.telephony.CellIdentityGsm p0) { super((java.lang.String)null, 0, (android.os.Parcel)null); }
    android.telephony.CellIdentityGsm copy() { return null; }
    public android.telephony.CellIdentityGsm sanitizeLocationInfo() { return null; }
    protected void updateGlobalCellId() {}
    @java.lang.Deprecated
    public int getMcc() { return 0; }
    @java.lang.Deprecated
    public int getMnc() { return 0; }
    public int getLac() { return 0; }
    public int getCid() { return 0; }
    public int getArfcn() { return 0; }
    public int getBsic() { return 0; }
    public java.lang.String getMobileNetworkOperator() { return null; }
    public java.lang.String getMccString() { return null; }
    public java.lang.String getMncString() { return null; }
    public int getChannelNumber() { return 0; }
    public java.util.Set<java.lang.String> getAdditionalPlmns() { return null; }
    @java.lang.Deprecated
    public int getPsc() { return 0; }
    public android.telephony.gsm.GsmCellLocation asCellLocation() { return null; }
    public int hashCode() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    private CellIdentityGsm(android.os.Parcel p0) { super((java.lang.String)null, 0, (android.os.Parcel)null); }
    protected static android.telephony.CellIdentityGsm createFromParcelBody(android.os.Parcel p0) { return null; }
}
