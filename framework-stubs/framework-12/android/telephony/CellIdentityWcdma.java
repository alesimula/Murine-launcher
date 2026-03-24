package android.telephony;

public final class CellIdentityWcdma extends android.telephony.CellIdentity {
    private static final java.lang.String TAG = null;
    private static final boolean DBG = false;
    private static final int MAX_LAC = 65535;
    private static final int MAX_CID = 268435455;
    private static final int MAX_PSC = 511;
    private static final int MAX_UARFCN = 16383;
    private final int mLac = 0;
    private final int mCid = 0;
    private final int mPsc = 0;
    private final int mUarfcn = 0;
    private final android.util.ArraySet<java.lang.String> mAdditionalPlmns = null;
    private final android.telephony.ClosedSubscriberGroupInfo mCsgInfo = null;
    public static final android.os.Parcelable.Creator<android.telephony.CellIdentityWcdma> CREATOR = null;
    public CellIdentityWcdma() { super((java.lang.String)null, 0, (android.os.Parcel)null); }
    public CellIdentityWcdma(int p0, int p1, int p2, int p3, java.lang.String p4, java.lang.String p5, java.lang.String p6, java.lang.String p7, java.util.Collection<java.lang.String> p8, android.telephony.ClosedSubscriberGroupInfo p9) { super((java.lang.String)null, 0, (android.os.Parcel)null); }
    public CellIdentityWcdma(android.hardware.radio.V1_0.CellIdentityWcdma p0) { super((java.lang.String)null, 0, (android.os.Parcel)null); }
    public CellIdentityWcdma(android.hardware.radio.V1_2.CellIdentityWcdma p0) { super((java.lang.String)null, 0, (android.os.Parcel)null); }
    public CellIdentityWcdma(android.hardware.radio.V1_5.CellIdentityWcdma p0) { super((java.lang.String)null, 0, (android.os.Parcel)null); }
    private CellIdentityWcdma(android.telephony.CellIdentityWcdma p0) { super((java.lang.String)null, 0, (android.os.Parcel)null); }
    public android.telephony.CellIdentityWcdma sanitizeLocationInfo() { return null; }
    android.telephony.CellIdentityWcdma copy() { return null; }
    protected void updateGlobalCellId() {}
    @java.lang.Deprecated
    public int getMcc() { return 0; }
    @java.lang.Deprecated
    public int getMnc() { return 0; }
    public int getLac() { return 0; }
    public int getCid() { return 0; }
    public int getPsc() { return 0; }
    public java.lang.String getMccString() { return null; }
    public java.lang.String getMncString() { return null; }
    public java.lang.String getMobileNetworkOperator() { return null; }
    public int hashCode() { return 0; }
    public int getUarfcn() { return 0; }
    public int getChannelNumber() { return 0; }
    public java.util.Set<java.lang.String> getAdditionalPlmns() { return null; }
    public android.telephony.ClosedSubscriberGroupInfo getClosedSubscriberGroupInfo() { return null; }
    public android.telephony.gsm.GsmCellLocation asCellLocation() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    private CellIdentityWcdma(android.os.Parcel p0) { super((java.lang.String)null, 0, (android.os.Parcel)null); }
    protected static android.telephony.CellIdentityWcdma createFromParcelBody(android.os.Parcel p0) { return null; }
}
