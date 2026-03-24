package android.telephony;

public final class CellIdentityTdscdma extends android.telephony.CellIdentity {
    public static final android.os.Parcelable.Creator<android.telephony.CellIdentityTdscdma> CREATOR = null;
    public CellIdentityTdscdma() { super((java.lang.String)null, 0, (android.os.Parcel)null); }
    public CellIdentityTdscdma(java.lang.String p0, java.lang.String p1, int p2, int p3, int p4, int p5, java.lang.String p6, java.lang.String p7, java.util.Collection<java.lang.String> p8, android.telephony.ClosedSubscriberGroupInfo p9) { super((java.lang.String)null, 0, (android.os.Parcel)null); }
    public android.telephony.CellIdentityTdscdma sanitizeLocationInfo() { return null; }
    android.telephony.CellIdentityTdscdma copy() { return null; }
    protected void updateGlobalCellId() {}
    public java.lang.String getMccString() { return null; }
    public java.lang.String getMncString() { return null; }
    public java.lang.String getMobileNetworkOperator() { return null; }
    public int getLac() { return 0; }
    public int getCid() { return 0; }
    public int getCpid() { return 0; }
    public int getUarfcn() { return 0; }
    public int getChannelNumber() { return 0; }
    public java.util.Set<java.lang.String> getAdditionalPlmns() { return null; }
    public android.telephony.ClosedSubscriberGroupInfo getClosedSubscriberGroupInfo() { return null; }
    public android.telephony.gsm.GsmCellLocation asCellLocation() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    protected static android.telephony.CellIdentityTdscdma createFromParcelBody(android.os.Parcel p0) { return null; }
}
