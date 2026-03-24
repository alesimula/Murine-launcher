package android.telephony;

public final class CellIdentityWcdma extends android.telephony.CellIdentity {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.telephony.CellIdentityWcdma> CREATOR = null;
    public CellIdentityWcdma() { super((java.lang.String)null, 0, (android.os.Parcel)null); }
    public CellIdentityWcdma(int p0, int p1, int p2, int p3, java.lang.String p4, java.lang.String p5, java.lang.String p6, java.lang.String p7, java.util.Collection<java.lang.String> p8, android.telephony.ClosedSubscriberGroupInfo p9) { super((java.lang.String)null, 0, (android.os.Parcel)null); }
    @android.annotation.NonNull
    public android.telephony.CellIdentityWcdma sanitizeLocationInfo() { return null; }
    @android.annotation.NonNull
    android.telephony.CellIdentityWcdma copy() { return null; }
    protected void updateGlobalCellId() {}
    @java.lang.Deprecated
    public int getMcc() { return 0; }
    @java.lang.Deprecated
    public int getMnc() { return 0; }
    public int getLac() { return 0; }
    public int getCid() { return 0; }
    public int getPsc() { return 0; }
    @android.annotation.Nullable
    public java.lang.String getMccString() { return null; }
    @android.annotation.Nullable
    public java.lang.String getMncString() { return null; }
    @android.annotation.Nullable
    public java.lang.String getMobileNetworkOperator() { return null; }
    public int hashCode() { return 0; }
    public int getUarfcn() { return 0; }
    public int getChannelNumber() { return 0; }
    @android.annotation.NonNull
    public java.util.Set<java.lang.String> getAdditionalPlmns() { return null; }
    @android.annotation.Nullable
    public android.telephony.ClosedSubscriberGroupInfo getClosedSubscriberGroupInfo() { return null; }
    @android.annotation.NonNull
    public android.telephony.gsm.GsmCellLocation asCellLocation() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    protected static android.telephony.CellIdentityWcdma createFromParcelBody(android.os.Parcel p0) { return null; }
}
