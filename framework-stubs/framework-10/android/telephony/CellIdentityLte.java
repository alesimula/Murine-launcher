package android.telephony;

public final class CellIdentityLte extends android.telephony.CellIdentity {
    private static final java.lang.String TAG = null;
    private static final boolean DBG = false;
    private static final int MAX_CI = 268435455;
    private static final int MAX_PCI = 503;
    private static final int MAX_TAC = 65535;
    private static final int MAX_EARFCN = 262143;
    private static final int MAX_BANDWIDTH = 20000;
    private final int mCi = 0;
    private final int mPci = 0;
    private final int mTac = 0;
    private final int mEarfcn = 0;
    private final int mBandwidth = 0;
    public static final android.os.Parcelable.Creator<android.telephony.CellIdentityLte> CREATOR = null;
    @android.annotation.UnsupportedAppUsage
    public CellIdentityLte() { super((java.lang.String)null, 0, (android.os.Parcel)null); }
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=115609023L)
    public CellIdentityLte(int p0, int p1, int p2, int p3, int p4) { super((java.lang.String)null, 0, (android.os.Parcel)null); }
    public CellIdentityLte(int p0, int p1, int p2, int p3, int p4, java.lang.String p5, java.lang.String p6, java.lang.String p7, java.lang.String p8) { super((java.lang.String)null, 0, (android.os.Parcel)null); }
    public CellIdentityLte(android.hardware.radio.V1_0.CellIdentityLte p0) { super((java.lang.String)null, 0, (android.os.Parcel)null); }
    public CellIdentityLte(android.hardware.radio.V1_2.CellIdentityLte p0) { super((java.lang.String)null, 0, (android.os.Parcel)null); }
    private CellIdentityLte(android.telephony.CellIdentityLte p0) { super((java.lang.String)null, 0, (android.os.Parcel)null); }
    public android.telephony.CellIdentityLte sanitizeLocationInfo() { return null; }
    android.telephony.CellIdentityLte copy() { return null; }
    @java.lang.Deprecated
    public int getMcc() { return 0; }
    @java.lang.Deprecated
    public int getMnc() { return 0; }
    public int getCi() { return 0; }
    public int getPci() { return 0; }
    public int getTac() { return 0; }
    public int getEarfcn() { return 0; }
    public int getBandwidth() { return 0; }
    public java.lang.String getMccString() { return null; }
    public java.lang.String getMncString() { return null; }
    public java.lang.String getMobileNetworkOperator() { return null; }
    public int getChannelNumber() { return 0; }
    public android.telephony.gsm.GsmCellLocation asCellLocation() { return null; }
    public int hashCode() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    private CellIdentityLte(android.os.Parcel p0) { super((java.lang.String)null, 0, (android.os.Parcel)null); }
    protected static android.telephony.CellIdentityLte createFromParcelBody(android.os.Parcel p0) { return null; }
}
