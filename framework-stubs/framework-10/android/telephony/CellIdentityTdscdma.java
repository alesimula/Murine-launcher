package android.telephony;

public final class CellIdentityTdscdma extends android.telephony.CellIdentity {
    private static final java.lang.String TAG = null;
    private static final boolean DBG = false;
    private static final int MAX_LAC = 65535;
    private static final int MAX_CID = 268435455;
    private static final int MAX_CPID = 127;
    private static final int MAX_UARFCN = 65535;
    private final int mLac = 0;
    private final int mCid = 0;
    private final int mCpid = 0;
    private final int mUarfcn = 0;
    public static final android.os.Parcelable.Creator<android.telephony.CellIdentityTdscdma> CREATOR = null;
    public CellIdentityTdscdma() { super((java.lang.String)null, 0, (android.os.Parcel)null); }
    public CellIdentityTdscdma(java.lang.String p0, java.lang.String p1, int p2, int p3, int p4, int p5, java.lang.String p6, java.lang.String p7) { super((java.lang.String)null, 0, (android.os.Parcel)null); }
    private CellIdentityTdscdma(android.telephony.CellIdentityTdscdma p0) { super((java.lang.String)null, 0, (android.os.Parcel)null); }
    public CellIdentityTdscdma(android.hardware.radio.V1_0.CellIdentityTdscdma p0) { super((java.lang.String)null, 0, (android.os.Parcel)null); }
    public CellIdentityTdscdma(android.hardware.radio.V1_2.CellIdentityTdscdma p0) { super((java.lang.String)null, 0, (android.os.Parcel)null); }
    public android.telephony.CellIdentityTdscdma sanitizeLocationInfo() { return null; }
    android.telephony.CellIdentityTdscdma copy() { return null; }
    public java.lang.String getMccString() { return null; }
    public java.lang.String getMncString() { return null; }
    public java.lang.String getMobileNetworkOperator() { return null; }
    public int getLac() { return 0; }
    public int getCid() { return 0; }
    public int getCpid() { return 0; }
    public int getUarfcn() { return 0; }
    public int getChannelNumber() { return 0; }
    public android.telephony.gsm.GsmCellLocation asCellLocation() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    private CellIdentityTdscdma(android.os.Parcel p0) { super((java.lang.String)null, 0, (android.os.Parcel)null); }
    protected static android.telephony.CellIdentityTdscdma createFromParcelBody(android.os.Parcel p0) { return null; }
}
