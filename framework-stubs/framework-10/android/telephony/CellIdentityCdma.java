package android.telephony;

public final class CellIdentityCdma extends android.telephony.CellIdentity {
    private static final java.lang.String TAG = null;
    private static final boolean DBG = false;
    private static final int NETWORK_ID_MAX = 65535;
    private static final int SYSTEM_ID_MAX = 32767;
    private static final int BASESTATION_ID_MAX = 65535;
    private static final int LONGITUDE_MIN = -2592000;
    private static final int LONGITUDE_MAX = 2592000;
    private static final int LATITUDE_MIN = -1296000;
    private static final int LATITUDE_MAX = 1296000;
    private final int mNetworkId = 0;
    private final int mSystemId = 0;
    private final int mBasestationId = 0;
    private final int mLongitude = 0;
    private final int mLatitude = 0;
    public static final android.os.Parcelable.Creator<android.telephony.CellIdentityCdma> CREATOR = null;
    public CellIdentityCdma() { super((java.lang.String)null, 0, (android.os.Parcel)null); }
    public CellIdentityCdma(int p0, int p1, int p2, int p3, int p4, java.lang.String p5, java.lang.String p6) { super((java.lang.String)null, 0, (android.os.Parcel)null); }
    public CellIdentityCdma(android.hardware.radio.V1_0.CellIdentityCdma p0) { super((java.lang.String)null, 0, (android.os.Parcel)null); }
    public CellIdentityCdma(android.hardware.radio.V1_2.CellIdentityCdma p0) { super((java.lang.String)null, 0, (android.os.Parcel)null); }
    private CellIdentityCdma(android.telephony.CellIdentityCdma p0) { super((java.lang.String)null, 0, (android.os.Parcel)null); }
    android.telephony.CellIdentityCdma copy() { return null; }
    public android.telephony.CellIdentityCdma sanitizeLocationInfo() { return null; }
    private boolean isNullIsland(int p0, int p1) { return false; }
    public int getNetworkId() { return 0; }
    public int getSystemId() { return 0; }
    public int getBasestationId() { return 0; }
    public int getLongitude() { return 0; }
    public int getLatitude() { return 0; }
    public int hashCode() { return 0; }
    public android.telephony.cdma.CdmaCellLocation asCellLocation() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    private CellIdentityCdma(android.os.Parcel p0) { super((java.lang.String)null, 0, (android.os.Parcel)null); }
    protected static android.telephony.CellIdentityCdma createFromParcelBody(android.os.Parcel p0) { return null; }
}
