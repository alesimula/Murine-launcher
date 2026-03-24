package android.telephony;

public final class CellIdentityLte extends android.telephony.CellIdentity {
    public static final android.os.Parcelable.Creator<android.telephony.CellIdentityLte> CREATOR = null;
    public CellIdentityLte() { super((java.lang.String)null, 0, (android.os.Parcel)null); }
    public CellIdentityLte(int p0, int p1, int p2, int p3, int p4) { super((java.lang.String)null, 0, (android.os.Parcel)null); }
    public CellIdentityLte(int p0, int p1, int p2, int p3, int[] p4, int p5, java.lang.String p6, java.lang.String p7, java.lang.String p8, java.lang.String p9, java.util.Collection<java.lang.String> p10, android.telephony.ClosedSubscriberGroupInfo p11) { super((java.lang.String)null, 0, (android.os.Parcel)null); }
    public android.telephony.CellIdentityLte sanitizeLocationInfo() { return null; }
    android.telephony.CellIdentityLte copy() { return null; }
    protected void updateGlobalCellId() {}
    @java.lang.Deprecated
    public int getMcc() { return 0; }
    @java.lang.Deprecated
    public int getMnc() { return 0; }
    public int getCi() { return 0; }
    public int getPci() { return 0; }
    public int getTac() { return 0; }
    public int getEarfcn() { return 0; }
    public int[] getBands() { return null; }
    public int getBandwidth() { return 0; }
    public java.lang.String getMccString() { return null; }
    public java.lang.String getMncString() { return null; }
    public java.lang.String getMobileNetworkOperator() { return null; }
    public int getChannelNumber() { return 0; }
    public java.util.Set<java.lang.String> getAdditionalPlmns() { return null; }
    public android.telephony.ClosedSubscriberGroupInfo getClosedSubscriberGroupInfo() { return null; }
    public android.telephony.gsm.GsmCellLocation asCellLocation() { return null; }
    public int hashCode() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    protected static android.telephony.CellIdentityLte createFromParcelBody(android.os.Parcel p0) { return null; }
}
